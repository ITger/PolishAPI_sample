package pl.itger.PolishAPI;

import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lombok.var;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.bson.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.itger.PolishAPI.converters.OffsetDateTimeReadConverter;
import pl.itger.PolishAPI.converters.OffsetDateTimeWriteConverter;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;
import pl.itger.PolishAPI.io.swagger.model.DictionaryItem;
import pl.itger.PolishAPI.io.swagger.model.HoldInfo;
import pl.itger.PolishAPI.repository.AccountInfoRepository;
import pl.itger.PolishAPI.repository.HoldInfoRepository;
import pl.itger.PolishAPI.repository.TransactionInfoRepository;
import pl.itger.PolishAPI.utils.dataFaker.FakeDataGen;

@EnableMongoRepositories(
        basePackageClasses = {AccountInfoRepository.class, HoldInfoRepository.class, TransactionInfoRepository.class})

@Configuration
public class MongoDBConfig
        extends AbstractMongoConfiguration {

@Override
protected String getDatabaseName() {
    return "PolishAPI";
}

@Override
public MongoClient mongoClient() {
    return new MongoClient("127.0.0.1",
                           27017);
}

@Override
public MongoCustomConversions customConversions() {
    List<Converter<?, ?>> converters = new ArrayList<>();
    converters.add(new OffsetDateTimeReadConverter());
    converters.add(new OffsetDateTimeWriteConverter());
    return new MongoCustomConversions(converters);
}

//private final List<Converter<?, ?>> converters = new ArrayList<>();

@Bean
CommandLineRunner commandLineRunner(AccountInfoRepository accountInfoRepository,
        HoldInfoRepository holdInfoRepository) {
    Iterable<AccountInfo> accI_iter = accountInfoRepository.findAll();
    //Iterable<Document> holdI_iter = holdInfoRepository.findAll();

    int size = 0;
    if (accI_iter instanceof Collection) {
        size = ((Collection<AccountInfo>) accI_iter).size();
    }
    if (size > 0) {
        //return null;
    }
    Faker faker = new Faker();
    return strings -> {
        createAccounts(
                accountInfoRepository,
                faker);
        MongoDatabase mdb = this.mongoClient().getDatabase("PolishAPI");
        MongoCollection<Document> accInfo_coll = mdb.getCollection(
                "accountInfo");
        MongoCollection<Document> holdInfo_coll = mdb.getCollection(
                "holdInfo");
//        try (ClientSession clientSession = this.mongoClient().startSession()) {
//            clientSession.startTransaction();
//            collection.insertOne(clientSession,
//                                 docOne);
//            collection.insertOne(clientSession,
//                                 docTwo);
//            clientSession.commitTransaction();
//       }
        for (Document doc : accInfo_coll.find()) {
            var accountInfo_id = doc.get("_id");
            for (int ii = 0; ii < 2; ii++) {
                HoldInfo holdInfo = new HoldInfo();
                createHold(holdInfo,
                           faker);
                Gson gson = new Gson();
                Document holdInfo_document = Document.parse(gson.
                        toJson(holdInfo));
                holdInfo_document.append("accountInfo_id",
                                         doc.get("_id"));
                holdInfo_coll.insertOne(holdInfo_document);
            }
        }
    };
}

private void createHold(HoldInfo holdInfo,
        Faker faker) {
    holdInfo.setAmount(Double.toString(faker.number().
            randomDouble(2,
                         1,
                         1000000)));
    holdInfo.setCurrency(faker.currency().code());
    holdInfo.setDescription(faker.chuckNorris().fact());
    holdInfo.setHoldExpirationDate(faker.date().future(90,
                                                       TimeUnit.DAYS).
            toInstant().atOffset(OffsetDateTime.now().getOffset()));
    holdInfo.setInitiator(FakeDataGen.fakeNameaddress(faker));
    holdInfo.setItemId(faker.idNumber().ssnValid());
    holdInfo.setMcc(String.valueOf(faker.number().
            numberBetween(1000,
                          6000)));
    holdInfo.setRecipient(FakeDataGen.fakeSenderRecipient(faker));
    holdInfo.setSender(FakeDataGen.fakeSenderRecipient(faker));
    holdInfo.setTradeDate(faker.date().past(90,
                                            TimeUnit.DAYS).
            toInstant().
            atOffset(OffsetDateTime.now().getOffset()));
    holdInfo.setTransactionType(faker.commerce().productName());
}

private void createAccounts(AccountInfoRepository accountInfoRepository,
        Faker faker) {
    List<AccountInfo> accIL = new ArrayList();
    for (int i = 0; i < 50; i++) {
        AccountInfo accI = new AccountInfo();
        accI.setAccountHolderType(
                AccountInfo.AccountHolderTypeEnum.
                        values()[faker.number().numberBetween(0,
                                                              1)]);
        accI.setAccountNameClient(faker.name().nameWithMiddle());
        accI.setAccountNumber(faker.finance().creditCard());
        DictionaryItem di = new DictionaryItem();
        di.setCode(faker.commerce().productName());
        di.setDescription(faker.chuckNorris().fact());
        accI.setAccountType(di);
        accI.setAccountTypeName(faker.company().buzzword());
        accI.setAvailableBalance(Double.toString(faker.number().
                randomDouble(2,
                             1,
                             1000000)));
        accI.setBank(FakeDataGen.fakeBankAccountInfo(faker));
        accI.setBookingBalance(Double.toString(faker.number().
                randomDouble(2,
                             1,
                             1000000)));
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
