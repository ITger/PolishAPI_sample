package pl.itger.dataFaker;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;
import pl.itger.PolishAPI.io.swagger.model.DictionaryItem;
import pl.itger.PolishAPI.io.swagger.model.HoldInfo;
import pl.itger.PolishAPI.io.swagger.model.TransactionInfo;
import pl.itger.PolishAPI.repository.AccountInfoRepository;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Piotr Zerynger
 * <p>
 * curl  -X GET  http://localhost:8080/generateFakeData
 */
@RestController
@RequestMapping("/")
public class GenerateFakeData {

    private final Faker faker = new Faker();

    @Autowired
    protected AccountInfoRepository accountInfoRepository;

    Logger logger = LoggerFactory.getLogger(GenerateFakeData.class);

    private final MongoDbFactory mongoDbFactory;

    /**
     * @param dbFactory
     */
    @Autowired
    public GenerateFakeData(MongoDbFactory dbFactory) {
        this.mongoDbFactory = dbFactory;
    }

    /**
     * @return
     */
    @RequestMapping(value = "generateFakeData", method = RequestMethod.GET)
    public ResponseEntity generateFakeData() {
        logger.info("generateFakeData START");
        Iterable<AccountInfo> accI_iter;
        MongoDatabase mdb = mongoDbFactory.getDb();
        MongoCollection<Document> accInfo_coll = mdb.getCollection("accountInfo");
        MongoCollection<Document> holdInfo_coll = mdb.getCollection("holdInfo");
        MongoCollection<Document> transactionInfo_coll = mdb.getCollection("transactionInfo");
        holdInfo_coll.drop();
        accInfo_coll.drop();
        transactionInfo_coll.drop();
        logger.info("accountInfo, holdInfo  DROPPED");
        createAccounts(accountInfoRepository);
        createHolds(accInfo_coll, holdInfo_coll);
        createTransactions(accInfo_coll, transactionInfo_coll);
        accI_iter = accountInfoRepository.findAll();
        List<String> accountNumberList = new ArrayList<>();
        transactionInfo_coll.createIndex(new Document("accountInfo_id", 1));
        holdInfo_coll.createIndex(new Document("accountInfo_id", 1));
        for (AccountInfo cnsmr : accI_iter) {
            accountNumberList.add(cnsmr.getAccountNumber());
        }
        logger.info(accountNumberList.size() + " accounts created END");
        return new ResponseEntity(accountNumberList, HttpStatus.OK);
    }

    /**
     * @param accInfo_coll
     * @param holdInfo_coll
     */
    private void createHolds(@NotNull MongoCollection<Document> accInfo_coll, MongoCollection<Document> holdInfo_coll) {
        logger.info("Creating Holds");
        for (Document doc : accInfo_coll.find()) {
            int i = faker.number().numberBetween(0, 4);
            for (int ii = 0; ii <= i; ii++) {
                HoldInfo holdInfo = new HoldInfo();
                createHold(holdInfo);
                Gson gson = new Gson();
                Document holdInfo_document = Document.parse(gson.
                        toJson(holdInfo));
                holdInfo_document.append("accountInfo_id", doc.get("_id"));
                holdInfo_coll.insertOne(holdInfo_document);
            }
        }
    }

    /**
     * @param accInfo_coll
     * @param transactionInfo_coll
     */
    private void createTransactions(@NotNull MongoCollection<Document> accInfo_coll, MongoCollection<Document> transactionInfo_coll) {
        logger.info("Creating Transactions");
        for (Document doc : accInfo_coll.find()) {
            int i = faker.number().numberBetween(0, 10);
            for (int ii = 0; ii <= i; ii++) {
                TransactionInfo ti = new TransactionInfo();
                createTransactionInfo(ti);
                Gson gson = new Gson();
                Document transactionInfo_doc = Document.parse(gson.toJson(ti));
                transactionInfo_doc.append("accountInfo_id", doc.get("_id"));
                transactionInfo_coll.insertOne(transactionInfo_doc);
            }
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
        ti.setTransactionCategory(TransactionInfo.TransactionCategoryEnum.CREDIT);
    }

    /**
     *
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
        logger.error("BLAD");
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

    /**
     * @param accountInfoRepository
     */
    private void createAccounts(@NotNull AccountInfoRepository accountInfoRepository) {
        logger.info("Creating accounts");
        List<AccountInfo> accIL = new ArrayList();
        int i = faker.number().numberBetween(40, 60);
        for (int ii = 0; ii <= i; ii++) {
            AccountInfo accI = new AccountInfo();
            accI.setAccountHolderType(
                    AccountInfo.AccountHolderTypeEnum.
                            values()[faker.number().numberBetween(0, 1)]);
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
            accI.addPsuRelationsItem(FakeDataGen.fakeAccountPsuRelation(faker));
            DictionaryItem dii = new DictionaryItem();
            dii.code(faker.hipster().word());
            dii.description(faker.hipster().word());
            accI.setAccountType(dii);
            accIL.add(accI);
        }
        accountInfoRepository.insert(accIL);
    }

}
