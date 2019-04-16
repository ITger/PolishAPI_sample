package pl.itger.PolishAPI;

import com.github.javafaker.Faker;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bson.BSONObject;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
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
import pl.itger.PolishAPI.io.swagger.model.TransactionInfo;
import pl.itger.PolishAPI.repository.AccountInfoRepository;
import pl.itger.PolishAPI.repository.HoldInfoRepository;
import pl.itger.PolishAPI.repository.TransactionInfoRepository;

@EnableMongoRepositories(basePackageClasses = HoldInfo.class)
@Configuration
public class MongoDBConfig
        extends AbstractMongoConfiguration {

private final List<Converter<?, ?>> converters = new ArrayList<>();

@Bean
CommandLineRunner commandLineRunner(
        AccountInfoRepository accountInfoRepository) {
    Iterable<AccountInfo> iter = accountInfoRepository.findAll();
    //accountInfoRepository.
    int size = 0;
    if (iter instanceof Collection) {
        size = ((Collection<AccountInfo>) iter).size();
    }
    if (size > 0) {
        //return null;
    }
    return strings -> {
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            AccountInfo document = new AccountInfo();
            document.setAccountHolderType(
                    AccountInfo.AccountHolderTypeEnum.
                            values()[faker.number().numberBetween(0,
                                                                  1)]);
            document.setAccountNameClient(faker.name().nameWithMiddle());
            document.setAccountNumber(faker.finance().creditCard());
            DictionaryItem di = new DictionaryItem();
            di.setCode(faker.commerce().productName());
            di.setDescription(faker.chuckNorris().fact());
            document.setAccountType(di);
            document.setAccountTypeName(faker.company().buzzword());
            document.setAvailableBalance(Double.toString(faker.number().
                    randomDouble(2,
                                 1,
                                 1000000)));
            document.setBank(fakeBankAccountInfo(faker));
            document.setBookingBalance(Double.toString(faker.number().
                    randomDouble(2,
                                 1,
                                 1000000)));
            document.setCurrency(faker.currency().code());
            document.setNameAddress(fakeNameaddress(faker));
            document.addPsuRelationsItem(fakeAccountPsuRelation(faker));
            DictionaryItem dii = new DictionaryItem();
            dii.code(faker.hipster().word());
            dii.description(faker.hipster().word());
            document.setAccountType(dii);
System.out.println(document);
            accountInfoRepository.save(document);
        }
    };
}

@Bean
CommandLineRunner commandLineRunner(AccountInfoRepository accountInfoRepository,
        HoldInfoRepository holdInfoRepository) {
    Iterable<HoldInfo> iter = holdInfoRepository.findAll();
    int size = 0;
    if (iter instanceof Collection) {
        size = ((Collection<HoldInfo>) iter).size();
    }
    if (size > 0) {
        //return null;
    }
    return strings -> {
        Faker faker = new Faker();
        Iterable<AccountInfo> iterAccountInfo = accountInfoRepository.findAll();
        iterAccountInfo.forEach(cnsmr -> {
            for (int i = 0; i < 5; i++) {
                HoldInfo document = new HoldInfo();
                document.setAmount(Double.toString(faker.number().
                        randomDouble(2,
                                     1,
                                     1000000)));
                document.setCurrency(faker.currency().code());
                document.setDescription(faker.chuckNorris().fact());
                document.setHoldExpirationDate(faker.date().future(90,
                                                                   TimeUnit.DAYS).
                        toInstant().atOffset(OffsetDateTime.now().getOffset()));
                document.setInitiator(fakeNameaddress(faker));
                document.setItemId(faker.idNumber().ssnValid());
                document.setMcc(String.valueOf(faker.number().
                        numberBetween(1000,
                                      6000)));
                document.setRecipient(fakeSenderRecipient(faker));
                document.setSender(fakeSenderRecipient(faker));
                document.setTradeDate(faker.date().past(90,
                                                        TimeUnit.DAYS).
                        toInstant().
                        atOffset(OffsetDateTime.now().getOffset()));
                document.setTransactionType(faker.commerce().productName());
                //((DBObject) document).
                //accountInfoRepository.save(document);
                //holdInfoRepository.save(document);
                ((DBObject) cnsmr).putAll((DBObject) document);//get("_id");
            }
        });
    };
}

@Bean
CommandLineRunner commandLineRunner(
        TransactionInfoRepository transactionInfoRepository) {
    Iterable<TransactionInfo> iter = transactionInfoRepository.findAll();
    int size = 0;
    if (iter instanceof Collection) {
        size = ((Collection<TransactionInfo>) iter).size();
    }
    if (size > 0) {
        return null;
    }
    return strings -> {
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            TransactionInfo document = new TransactionInfo();
            document.setAmount(Double.toString(faker.number().
                    randomDouble(2,
                                 1,
                                 1000000)));
            //document.setAuxData(auxData);
            document.setBookingDate(faker.date().past(90,
                                                      TimeUnit.DAYS).toInstant().
                    atOffset(OffsetDateTime.now().getOffset()));
            document.setCurrency(faker.currency().code());
            document.setDescription(faker.chuckNorris().fact());
            document.setInitiator(fakeNameaddress(faker));
            document.setItemId(faker.idNumber().ssnValid());
            document.setMcc(String.valueOf(faker.number().numberBetween(1000,
                                                                        6000)));
            document.setPostTransactionBalance(Double.toString(faker.number().
                    randomDouble(2,
                                 1,
                                 1000000)));
            document.setRecipient(fakeSenderRecipient(faker));
            document.setSender(fakeSenderRecipient(faker));
            document.setTradeDate(faker.date().past(90,
                                                    TimeUnit.DAYS).toInstant().
                    atOffset(OffsetDateTime.now().getOffset()));
            document.setTransactionCategory(
                    TransactionInfo.TransactionCategoryEnum.CREDIT);
            document.setTransactionStatus(fakeDictionaryItem(faker));
            document.setTransactionType(faker.commerce().productName());
            transactionInfoRepository.save(document);
        }
    };
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
    return "mongo";
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
