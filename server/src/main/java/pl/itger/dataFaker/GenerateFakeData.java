package pl.itger.dataFaker;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Indexes;
import org.bson.Document;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.itger.PolishAPI.io.swagger.model.*;
import pl.itger.PolishAPI.repository.AccountInfoRepository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static com.mongodb.client.model.Projections.*;

/**
 * @author Piotr Zerynger
 * <p>
 * curl  -k -v -X GET  https://localhost:8443/generateFakeData
 */
@RestController
@RequestMapping("/")
public class GenerateFakeData {

    private final Faker faker = new Faker();
    private final MongoDbFactory mongoDbFactory;
    @Autowired
    protected AccountInfoRepository accountInfoRepository;
    @Value("${spring.data.mongodb.database}")
    String dbName;
    Logger logger = LoggerFactory.getLogger(GenerateFakeData.class);
    @Autowired
    private MongoClient mongoClient;
    private MongoDatabase database;

    private static final TransactionOptions txnOptions = TransactionOptions.builder()
            .readPreference(ReadPreference.primary())
            .readConcern(ReadConcern.MAJORITY)
            .writeConcern(WriteConcern.MAJORITY)
            .build();

    /**
     * @param dbFactory
     */
    @Autowired
    public GenerateFakeData(MongoDbFactory dbFactory) {
        this.mongoDbFactory = dbFactory;
    }

    public Optional<ObjectMapper> getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION,
                true);
        return Optional.of(mapper);
    }

    /**
     * @return
     */
    @RequestMapping(value = "generateFakeData", method = RequestMethod.GET)
    public ResponseEntity generateFakeData() {
        logger.info("generateFakeData START");
        MongoDatabase mdb = mongoDbFactory.getDb();
        database = mongoClient.getDatabase(dbName);
        MongoCollection<AccountInfo> aiCollection = database.getCollection("accountInfo", AccountInfo.class);
        MongoCollection<AccountBaseInfo> abiCollection = database.getCollection("accountBaseInfo", AccountBaseInfo.class);
        abiCollection.drop();
        aiCollection.drop();
        MongoCollection<Document> holdInfo_coll = mdb.getCollection("holdInfo");
        MongoCollection<Document> transactionInfo_coll = mdb.getCollection("transactionInfo");
        holdInfo_coll.drop();
        transactionInfo_coll.drop();
        logger.info("accountInfo, accountBaseInfo, holdInfo, transactionInfo DROPPED");
        accountInfoRepository.deleteAll();
        createAccounts(aiCollection, abiCollection, holdInfo_coll, transactionInfo_coll);//accountInfoRepository);
        FindIterable<AccountInfo> accI_iter = aiCollection.find().projection(fields(include("accountNumber"), excludeId()));
        List<String> accountNumberList = new ArrayList<>();
        for (AccountInfo cnsmr : accI_iter) {
            accountNumberList.add(cnsmr.getAccountNumber());
        }
        logger.info(accountNumberList.size() + " accounts created END");
        return new ResponseEntity(accountNumberList, HttpStatus.OK);
    }

    private void createAccounts(MongoCollection<AccountInfo> collection, MongoCollection<AccountBaseInfo> abiCollection, MongoCollection<Document> holdInfo_coll, MongoCollection<Document> transactionInfo_coll) {
        logger.info("Creating accounts");
        List<AccountInfo> accIL = new ArrayList();
        List<AccountBaseInfo> accBIL = new ArrayList<>();
        List<Document> holdInfoList = new ArrayList<>();
        List<Document> transactionInfoList = new ArrayList<>();
        int i = faker.number().numberBetween(40, 60);
        for (int ii = 0; ii <= i; ii++) {
            AccountInfo accI = new AccountInfo();
            accI.setAccountHolderType(AccountInfo.AccountHolderTypeEnum.values()[faker.number().numberBetween(0, 1)]);
            accI.setAccountNameClient(faker.name().nameWithMiddle());
            accI.setAccountNumber(faker.finance().creditCard());
            DictionaryItem di = new DictionaryItem();
            di.setCode(faker.commerce().productName());
            di.setDescription(faker.chuckNorris().fact());
            accI.setAccountType(di);
            accI.setAccountTypeName(faker.company().buzzword());
            accI.setAvailableBalance(Double.toString(faker.number().randomDouble(2, 1, 1000000)));
            accI.setBank(FakeDataGen.fakeBankAccountInfo(faker));
            accI.setBookingBalance(Double.toString(faker.number().randomDouble(2, 1, 1000000)));
            accI.setCurrency(faker.currency().code());
            accI.setNameAddress(FakeDataGen.fakeNameaddress(faker));
            accI.addPsuRelationsItem(FakeDataGen.fakeAccountPsuRelation(faker)).addPsuRelationsItem(FakeDataGen.fakeAccountPsuRelation(faker));
            DictionaryItem dii = new DictionaryItem();
            dii.code(faker.hipster().word());
            dii.description(faker.hipster().word());
            accI.setAccountType(dii);
            accIL.add(accI);
            //
            createAccountBaseInfo(accBIL, accI);
            createHolds(holdInfoList, accI);
            createTransactions(transactionInfoList, accI);
        }
        collection.insertMany(accIL);
        collection.createIndex(Indexes.ascending("accountNumber"));
        abiCollection.insertMany(accBIL);
        abiCollection.createIndex(Indexes.ascending("accountNumber"));
        holdInfo_coll.insertMany(holdInfoList);
        holdInfo_coll.createIndex(Indexes.ascending("accountNumber"));
        transactionInfo_coll.insertMany(transactionInfoList);
        transactionInfo_coll.createIndex(Indexes.ascending("accountNumber"));

        /*try (ClientSession clientSession = client.startSession()) {
            return clientSession.withTransaction(() -> {
                persons.forEach(p -> p.setId(new ObjectId()));
                personCollection.insertMany(clientSession, persons);
                return persons;
            }, txnOptions);
        }*/
    }

    private void createAccountBaseInfo(@NotNull List<AccountBaseInfo> accBIL, @NotNull AccountInfo accI) {
        AccountBaseInfo accBI = new AccountBaseInfo();
        accBI.setAccountNumber(accI.getAccountNumber());
        accBI.setAccountType(accI.getAccountType());
        accBI.setAccountTypeName(accI.getAccountTypeName());
        accBI.setPsuRelations(accI.getPsuRelations());
        accBIL.add(accBI);
    }


    /**
     * @param holdInfoList
     * @param accI
     */
    private void createHolds(@NotNull List<Document> holdInfoList, @NotNull AccountInfo accI) {
        logger.info("Creating Holds");
        Gson gson = new Gson();
        int i = faker.number().numberBetween(0, 4);
        for (int ii = 0; ii <= i; ii++) {
            HoldInfo holdInfo = new HoldInfo();
            createHold(holdInfo);
            Document gDoc = Document.parse(gson.toJson(holdInfo));
            gDoc.append("accountNumber", accI.getAccountNumber());
            holdInfoList.add(gDoc);
        }
    }

    /**
     * @param transactionInfoList
     * @param accI
     */
    private void createTransactions(@NotNull List<Document> transactionInfoList, @NotNull AccountInfo accI) {
        logger.info("Creating Transactions");
        Gson gson = new Gson();
        int i = faker.number().numberBetween(0, 10);
        for (int ii = 0; ii <= i; ii++) {
            TransactionInfo ti = new TransactionInfo();
            createTransactionInfo(ti);
            Document gDoc = Document.parse(gson.toJson(ti));
            gDoc.append("accountNumber", accI.getAccountNumber());
            transactionInfoList.add(gDoc);
        }
    }

    /**
     * @param ti
     */
    private void createTransactionInfo(@NotNull TransactionInfo ti) {
        ti.setAmount(Double.toString(faker.number().randomDouble(2, 1, 1000000)));
        ti.setBookingDate(faker.date().past(1000, TimeUnit.DAYS).toInstant().atOffset(OffsetDateTime.now().getOffset()));
        ti.setCurrency(faker.currency().code());
        ti.setDescription(faker.chuckNorris().fact());
        ti.setInitiator(FakeDataGen.fakeNameaddress(faker));
        ti.setItemId(faker.idNumber().ssnValid());
        ti.setMcc(String.valueOf(faker.number().numberBetween(1000, 6000)));
        ti.setPostTransactionBalance(Double.toString(faker.number().randomDouble(2, 1, 1000000)));
        ti.setRecipient(FakeDataGen.fakeSenderRecipient(faker));
        ti.setSender(FakeDataGen.fakeSenderRecipient(faker));
        ti.setTradeDate(ti.getBookingDate().minusMinutes(5L));
        ti.setTransactionType(faker.commerce().productName());
        DictionaryItem di = new DictionaryItem();
        di.setCode(faker.commerce().productName());
        di.setDescription(faker.hipster().word());
        ti.setTransactionStatus(di);
        int i = faker.number().numberBetween(0, 1);
        ti.setTransactionCategory(i == 0 ? TransactionInfo.TransactionCategoryEnum.CREDIT : TransactionInfo.TransactionCategoryEnum.DEBIT);
    }


 /*   @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
        logger.error("BLAD");
    }*/

    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException e) {
        logger.error("Internal server error.", e);
        return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * @param holdInfo
     */
    private void createHold(@NotNull HoldInfo holdInfo) {
        holdInfo.setAmount(Double.toString(faker.number().randomDouble(2, 1, 1000000)));
        holdInfo.setCurrency(faker.currency().code());
        holdInfo.setDescription(faker.chuckNorris().fact());
        holdInfo.setHoldExpirationDate(faker.date().future(90, TimeUnit.DAYS).toInstant().atOffset(OffsetDateTime.now().getOffset()));
        holdInfo.setInitiator(FakeDataGen.fakeNameaddress(faker));
        holdInfo.setItemId(faker.idNumber().ssnValid());
        holdInfo.setMcc(String.valueOf(faker.number().numberBetween(1000, 6000)));
        holdInfo.setRecipient(FakeDataGen.fakeSenderRecipient(faker));
        holdInfo.setSender(FakeDataGen.fakeSenderRecipient(faker));
        holdInfo.setTradeDate(faker.date().past(90, TimeUnit.DAYS).toInstant().atOffset(OffsetDateTime.now().getOffset()));
        holdInfo.setTransactionType(faker.commerce().productName());
    }

}
