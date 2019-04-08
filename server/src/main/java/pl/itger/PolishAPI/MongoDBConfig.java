/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI;

import io.swagger.model.HoldInfo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.github.javafaker.Faker;
import io.swagger.model.Address;
import io.swagger.model.Bank;
import io.swagger.model.NameAddress;
import io.swagger.model.SenderRecipient;
import java.time.OffsetDateTime;
import java.util.concurrent.TimeUnit;
import pl.itger.PolishAPI.repository.HoldInfoRepository;

@EnableMongoRepositories(basePackageClasses = HoldInfo.class)
@Configuration
public class MongoDBConfig {

@Bean
CommandLineRunner commandLineRunner(HoldInfoRepository holdInfoRepository) {
    return strings -> {
        Faker faker = new Faker();
        for (int i = 0; i < 50; i++) {
            HoldInfo hI = new HoldInfo();
            hI.setAmount(Double.toString(faker.number().
                    randomDouble(2,
                                 1,
                                 1000000)));
            hI.setCurrency(faker.currency().code());
            hI.setDescription(faker.chuckNorris().fact());
            hI.setHoldExpirationDate(faker.date().future(90,
                                                         TimeUnit.DAYS).
                    toInstant().atOffset(OffsetDateTime.now().getOffset()));
            hI.setInitiator(fakeNameaddress(faker));
            hI.setItemId(faker.idNumber().ssnValid());
            hI.setMcc(String.valueOf(faker.number().numberBetween(1000,
                                                                  6000)));
            hI.setRecipient(fakeSenderRecipient(faker));
            hI.setSender(fakeSenderRecipient(faker));
            hI.setTradeDate(faker.date().past(90,
                                              TimeUnit.DAYS).toInstant().
                    atOffset(OffsetDateTime.now().getOffset()));
            hI.setTransactionType(faker.commerce().productName());
            holdInfoRepository.save(hI);
        }
    };
}

private NameAddress fakeNameaddress(Faker faker) {
    NameAddress initiator = new NameAddress();
    initiator.addValueItem(faker.address().fullAddress());
    initiator.addValueItem(faker.address().fullAddress());
    return initiator;
}

private SenderRecipient fakeSenderRecipient(Faker faker) {
    SenderRecipient recipient = new SenderRecipient();
    recipient.setAccountMassPayment(faker.finance().creditCard());
    recipient.setAccountNumber(faker.finance().creditCard());
    recipient.setBank(fakeBank(faker));
    return recipient;
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
}
