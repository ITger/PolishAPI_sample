package pl.itger.PolishAPI;

import com.github.javafaker.Faker;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.ClientSession;
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
import pl.itger.PolishAPI.io.swagger.model.AccountPsuRelation;
import pl.itger.PolishAPI.io.swagger.model.Address;
import pl.itger.PolishAPI.io.swagger.model.Bank;
import pl.itger.PolishAPI.io.swagger.model.BankAccountInfo;
import pl.itger.PolishAPI.io.swagger.model.DictionaryItem;
import pl.itger.PolishAPI.io.swagger.model.HoldInfo;
import pl.itger.PolishAPI.io.swagger.model.NameAddress;
import pl.itger.PolishAPI.io.swagger.model.SenderRecipient;
import pl.itger.PolishAPI.repository.AccountInfoRepository;
import pl.itger.PolishAPI.repository.HoldInfoRepository;
import pl.itger.PolishAPI.repository.TransactionInfoRepository;

@EnableMongoRepositories(
        basePackageClasses = {AccountInfoRepository.class, HoldInfoRepository.class, TransactionInfoRepository.class})
@Configuration
public class MongoDBConfig
        extends AbstractMongoConfiguration {

private final List<Converter<?, ?>> converters = new ArrayList<>();

@Bean
CommandLineRunner commandLineRunner(AccountInfoRepository accountInfoRepository,
        HoldInfoRepository holdInfoRepository) {
    Iterable<AccountInfo> ACCI_iter = accountInfoRepository.findAll();
    Iterable<HoldInfo> HoldI_iter = holdInfoRepository.findAll();

    //accountInfoRepository.
    int size = 0;
    if (ACCI_iter instanceof Collection) {
        size = ((Collection<AccountInfo>) ACCI_iter).size();
    }
    if (size > 0) {
        //return null;
    }
    Faker faker = new Faker();
    return strings -> {
        createAccounts(accountInfoRepository,
                       faker);
        MongoDatabase mdb = this.mongoClient().getDatabase("PolishAPI");
        MongoCollection<Document> accI_d = mdb.getCollection("accountInfo");
        try (ClientSession clientSession = this.mongoClient().startSession()) {
//            clientSession.startTransaction();
//            collection.insertOne(clientSession,
//                                 docOne);
//            collection.insertOne(clientSession,
//                                 docTwo);
//            clientSession.commitTransaction();
        }

        for (Document doc : accI_d.find()) {
            System.out.println(doc);
            //doc.
            for (int ii = 0; ii < 5; ii++) {
                HoldInfo holdInfo = new HoldInfo();
                createHold(holdInfo,
                           faker);
                //((DBObject) accI).
                //accountInfoRepository.save(accI);
                try (ClientSession clientSession = this.mongoClient().
                        startSession()) {
                    var hi = holdInfoRepository.insert(holdInfo);
                    System.out.println(hi);
                    // hi._id.toString();
                    // DBObject query = new BasicDBObject(hi.getInteger("_id"), "Zen");
                    //holdInfoRepository.findOne(exmpl);
                }
                //Document bo = (Document) accI;
                //BasicDBObjectBuilder b = new BasicDBObjectBuilder();
                //System.out.println("Document: " + bo.toString());

                //holdI_doc;
                //((BSONObject) accI).putAll((BSONObject) holdI_doc);//get("_id");
                //Document bo = (Document) accI;
                //BasicDBObjectBuilder b = new BasicDBObjectBuilder();
                //System.out.println("Document: " + bo.toString());
                //holdI_doc;
                //((BSONObject) accI).putAll((BSONObject) holdInfo);//get("_id");
            }
        }
        //});
    };
}

private void createHold(HoldInfo holdI_doc,
        Faker faker) {
    holdI_doc.setAmount(Double.toString(faker.number().
            randomDouble(2,
                         1,
                         1000000)));
    holdI_doc.setCurrency(faker.currency().code());
    holdI_doc.setDescription(faker.chuckNorris().fact());
    holdI_doc.setHoldExpirationDate(faker.date().future(90,
                                                        TimeUnit.DAYS).
            toInstant().atOffset(OffsetDateTime.now().getOffset()));
    holdI_doc.setInitiator(fakeNameaddress(faker));
    holdI_doc.setItemId(faker.idNumber().ssnValid());
    holdI_doc.setMcc(String.valueOf(faker.number().
            numberBetween(1000,
                          6000)));
    holdI_doc.setRecipient(fakeSenderRecipient(faker));
    holdI_doc.setSender(fakeSenderRecipient(faker));
    holdI_doc.setTradeDate(faker.date().past(90,
                                             TimeUnit.DAYS).
            toInstant().
            atOffset(OffsetDateTime.now().getOffset()));
    holdI_doc.setTransactionType(faker.commerce().productName());
}

private void createAccounts(AccountInfoRepository accountInfoRepository,
        Faker faker) {
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
        accI.setBank(fakeBankAccountInfo(faker));
        accI.setBookingBalance(Double.toString(faker.number().
                randomDouble(2,
                             1,
                             1000000)));
        accI.setCurrency(faker.currency().code());
        accI.setNameAddress(fakeNameaddress(faker));
        accI.addPsuRelationsItem(fakeAccountPsuRelation(faker));
        DictionaryItem dii = new DictionaryItem();
        dii.code(faker.hipster().word());
        dii.description(faker.hipster().word());
        accI.setAccountType(dii);
        //System.out.println(accI);
        accountInfoRepository.save(accI);
    }
}

private NameAddress fakeNameaddress(Faker faker) {
    NameAddress initiator = new NameAddress();
    initiator.addValueItem(faker.address().fullAddress());
    initiator.addValueItem(faker.address().fullAddress());
    return initiator;
}

private BankAccountInfo fakeBankAccountInfo(Faker faker) {
    BankAccountInfo bai = new BankAccountInfo();
    bai.setAddress(fakeAddress(faker));
    bai.setBicOrSwift(faker.finance().bic());
    bai.setName(faker.company().name());
    return bai;
}

private SenderRecipient fakeSenderRecipient(Faker faker) {
    SenderRecipient recipient = new SenderRecipient();
    recipient.setAccountMassPayment(faker.finance().creditCard());
    recipient.setAccountNumber(faker.finance().creditCard());
    recipient.setBank(fakeBank(faker));
    return recipient;
}

private AccountPsuRelation fakeAccountPsuRelation(Faker faker) {
    AccountPsuRelation acountPsuRelation = new AccountPsuRelation();
    acountPsuRelation.setTypeOfRelation(
            AccountPsuRelation.TypeOfRelationEnum.values()[faker.number().
            numberBetween(0,
                          5)]);
    acountPsuRelation.setTypeOfProxy(
            AccountPsuRelation.TypeOfProxyEnum.values()[faker.number().
            numberBetween(0,
                          3)]);
    acountPsuRelation.setStake(faker.number().randomDigit());
    return acountPsuRelation;
}

private Bank fakeBank(Faker faker) {
    Bank bank = new Bank();
    bank.setAddress(fakeAddress(faker));
    bank.setBicOrSwift(faker.finance().bic());
    bank.setCode(faker.finance().iban());
    bank.setCountryCode(faker.address().countryCode());
    bank.setName(faker.company().name());
    return bank;
}

private Address fakeAddress(Faker faker) {
    Address addr = new Address();
    addr.add(faker.address().streetName());
    addr.add(faker.address().streetAddressNumber());
    addr.add(faker.address().zipCode());
    addr.add(faker.address().cityName());
    addr.add(faker.address().country());
    return addr;
}

private DictionaryItem fakeDictionaryItem(Faker faker) {
    DictionaryItem diccItem = new DictionaryItem();
    diccItem.setCode(faker.idNumber().valid());
    diccItem.setDescription(faker.beer().name());
    return diccItem;
}

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
    converters.add(new OffsetDateTimeReadConverter());
    converters.add(new OffsetDateTimeWriteConverter());
    return new MongoCustomConversions(converters);
}
}
