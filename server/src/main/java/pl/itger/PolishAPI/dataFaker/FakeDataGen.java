package pl.itger.PolishAPI.dataFaker;

import com.github.javafaker.Faker;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.ISet;
import com.hazelcast.core.IdGenerator;
import io.swagger.model.AccountBaseInfo;
import io.swagger.model.AccountInfo;
import io.swagger.model.AccountPsuRelation;
import io.swagger.model.Address;
import io.swagger.model.BankAccountInfo;
import io.swagger.model.DictionaryItem;
import io.swagger.model.NameAddress;

public class FakeDataGen {

public static void main(String[] args) throws Exception {
    makeData();
//    HazelcastInstance hz = HazelCastFactory.getInstance();
//    System.out.println("Hazelcast Member instance is running!");
//    //HazelcastInstance hz = Hazelcast.newHazelcastInstance();
//    Faker faker = new Faker();
//    makeAccountInfo_data(hz,
//                         faker);
//    makeAccountBaseInfo_data(hz,
//                             faker);
//    HazelCastFactory.shutDown();
}

public static void makeData() {
    HazelcastInstance hz = HazelCastFactory.getInstance();
    System.out.println("Hazelcast Member instance is running!");
    Faker faker = new Faker();
    makeAccountInfo_data(hz,
                         faker);
    makeAccountBaseInfo_data(hz,
                             faker);
    HazelCastFactory.shutDown();
}

private static void makeAccountBaseInfo_data(HazelcastInstance hz,
        Faker faker) {
    IdGenerator idGen = hz.getIdGenerator("newId");
    IMap<Long, AccountBaseInfo> AccountBaseInfo_map = hz.getMap(
            "AccountBaseInfo_map");
    IMap<Long, DictionaryItem> dictionaryItem_map = hz.getMap(
            "DictionaryItem_AccountBaseInfo");
    for (int i = 0; i < 50; i++) {
        AccountBaseInfo aBI = new AccountBaseInfo();

        aBI.setAccountNumber(faker.finance().
                creditCard());
        DictionaryItem di = new DictionaryItem();
        di.setCode(faker.commerce().
                productName());
        di.setDescription(faker.chuckNorris().
                fact());
        dictionaryItem_map.put(idGen.newId(),
                               di);
        aBI.setAccountType(di);
        //
        aBI.setAccountTypeName(faker.company().
                buzzword());
        //
        AccountPsuRelation acountPsuRelation = new AccountPsuRelation();
        acountPsuRelation.setTypeOfRelation(
                AccountPsuRelation.TypeOfRelationEnum.
                        values()[faker.number().
                        numberBetween(0,
                                      5)]);
        acountPsuRelation.setTypeOfProxy(
                AccountPsuRelation.TypeOfProxyEnum.
                        values()[faker.number().
                        numberBetween(0,
                                      3)]);
        acountPsuRelation.setStake(faker.number().
                randomDigit());
        aBI.addPsuRelationsItem(acountPsuRelation);
        //
        System.out.println(aBI);
        AccountBaseInfo_map.putIfAbsent(idGen.newId(),
                                        aBI);
    }
    System.out.
            println("AccountBaseInfo_map.size: " + AccountBaseInfo_map.size());
    AccountBaseInfo_map.flush();
    System.out.println("Adding AccountBaseInfo_map finished!");
}

private static void makeAccountInfo_data(HazelcastInstance hz,
        Faker faker) {
    IdGenerator idGen = hz.getIdGenerator("newId");
    IMap<Long, AccountInfo> accountInfo_map = hz.getMap("AccountInfo_map");
    IMap<Long, DictionaryItem> dictionaryItem_map = hz.getMap(
            "DictionaryItem_accountInfo");
    for (int i = 0; i < 50; i++) {
        AccountInfo accI = new AccountInfo();
        accI.setAccountHolderType(
                AccountInfo.AccountHolderTypeEnum.
                        values()[faker.number().
                        numberBetween(0,
                                      1)]);
        accI.setAccountNameClient(faker.name().
                nameWithMiddle());
        accI.setAccountNumber(faker.finance().
                creditCard());
        DictionaryItem di = new DictionaryItem();
        di.setCode(faker.commerce().
                productName());
        di.setDescription(faker.chuckNorris().
                fact());
        dictionaryItem_map.put(idGen.newId(),
                               di);
        accI.setAccountType(di);
        //
        accI.setAccountTypeName(faker.company().
                buzzword());
        accI.setAvailableBalance(Double.toString(faker.number().
                randomDouble(2,
                             1,
                             1000000)));
        BankAccountInfo bai = new BankAccountInfo();
        Address addr = new Address();
        addr.add(faker.address().
                streetName());
        addr.add(faker.address().
                streetAddressNumber());
        addr.add(faker.address().
                zipCode());
        addr.add(faker.address().
                cityName());
        addr.add(faker.address().
                country());
        bai.setAddress(addr);
        bai.setBicOrSwift(faker.finance().
                bic());
        bai.setName(faker.company().
                name());
        accI.setBank(bai);
        //
        accI.setBookingBalance(Double.toString(faker.number().
                randomDouble(2,
                             1,
                             1000000)));
        accI.setCurrency(faker.currency().
                code());
        NameAddress nameAddress = new NameAddress();
        nameAddress.addValueItem(faker.address().
                fullAddress());
        accI.setNameAddress(nameAddress);
        //
        AccountPsuRelation acountPsuRelation = new AccountPsuRelation();
        acountPsuRelation.setTypeOfRelation(
                AccountPsuRelation.TypeOfRelationEnum.
                        values()[faker.number().
                        numberBetween(0,
                                      5)]);
        acountPsuRelation.setTypeOfProxy(
                AccountPsuRelation.TypeOfProxyEnum.
                        values()[faker.number().
                        numberBetween(0,
                                      3)]);
        acountPsuRelation.setStake(faker.number().
                randomDigit());
        accI.addPsuRelationsItem(acountPsuRelation);
        //
        DictionaryItem dii = new DictionaryItem();
        dii.code(faker.hipster().
                word());
        dii.description(faker.hipster().
                word());
        dictionaryItem_map.put(idGen.newId(),
                               dii);
        accI.setAccountType(dii);
        //
        System.out.println(accI);
        accountInfo_map.put(idGen.newId(),
                            accI);
    }
    System.out.
            println("accountInfo_map.size: " + accountInfo_map.size());
    System.out.println("Adding AccountInfo_map finished!");
    accountInfo_map.flush();
}
}
