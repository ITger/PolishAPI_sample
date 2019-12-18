package pl.itger.dataFaker;

import com.github.javafaker.Faker;
import pl.itger.polishAPI.io.swagger.model.*;

//import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.core.IMap;
//import com.hazelcast.core.IdGenerator;

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
//    HazelcastInstance hz = HazelCastFactory.getInstance();
//    System.out.println("Hazelcast Member instance is running!");
//    Faker faker = new Faker();
//    makeAccountInfo_data(hz,
//                         faker);
//    makeAccountBaseInfo_data(hz,
//                             faker);
//    makeHoldInfo_data(hz,
//                      faker);
//    HazelCastFactory.shutDown();
    }

    //private static void makeHoldInfo_data(HazelcastInstance hz,
//        Faker faker) {
//    IdGenerator idGen = hz.getIdGenerator("newId");
//    IMap<Long, HoldInfo> HoldInfo_map = hz.getMap("HoldInfo_map");
//    for (int i = 0; i < 50; i++) {
//        HoldInfo hI = new HoldInfo();
//        hI.setAmount(Double.toString(faker.number().
//                randomDouble(2,
//                             1,
//                             1000000)));
//        hI.setCurrency(faker.currency().code());
//        hI.setDescription(faker.chuckNorris().fact());
//        hI.setHoldExpirationDate(faker.date().future(90,
//                                                     TimeUnit.DAYS).
//                toInstant().atOffset(OffsetDateTime.now().getOffset()));
//        hI.setInitiator(fakeNameaddress(faker));
//        hI.setItemId(faker.idNumber().ssnValid());
//        hI.setMcc(String.valueOf(faker.number().numberBetween(1000,
//                                                              6000)));
//        hI.setRecipient(fakeSenderRecipient(faker));
//        hI.setSender(fakeSenderRecipient(faker));
//        hI.setTradeDate(faker.date().past(90,
//                                          TimeUnit.DAYS).toInstant().
//                atOffset(OffsetDateTime.now().getOffset()));
//        hI.setTransactionType(faker.commerce().productName());
//        HoldInfo_map.putIfAbsent(idGen.newId(),
//                                 hI);
//        System.out.println(hI);
//    }
//    System.out.
//            println("HoldInfo_map.size: " + HoldInfo_map.size());
//    System.out.println("Adding HoldInfo_map finished!");
//}
//
//private static NameAddress fakeNameaddress(Faker faker) {
//    NameAddress initiator = new NameAddress();
//    initiator.addValueItem(faker.address().fullAddress());
//    initiator.addValueItem(faker.address().fullAddress());
//    return initiator;
//}
//
//private static SenderRecipient fakeSenderRecipient(Faker faker) {
//    SenderRecipient recipient = new SenderRecipient();
//    recipient.setAccountMassPayment(faker.finance().creditCard());
//    recipient.setAccountNumber(faker.finance().creditCard());
//    recipient.setBank(fakeBank(faker));
//    return recipient;
//}
//
//private static Bank fakeBank(Faker faker) {
//    Bank bank = new Bank();
//    bank.setAddress(fakeAddress(faker));
//    bank.setBicOrSwift(faker.finance().bic());
//    bank.setCode(faker.finance().iban());
//    bank.setCountryCode(faker.address().countryCode());
//    bank.setName(faker.company().name());
//    return bank;
//}
//
//private static void makeAccountBaseInfo_data(HazelcastInstance hz,
//        Faker faker) {
//    IdGenerator idGen = hz.getIdGenerator("newId");
//    IMap<Long, AccountBaseInfo> AccountBaseInfo_map = hz.getMap(
//            "AccountBaseInfo_map");
//    IMap<Long, DictionaryItem> dictionaryItem_map = hz.getMap(
//            "DictionaryItem_AccountBaseInfo");
//    for (int i = 0; i < 50; i++) {
//        AccountBaseInfo aBI = new AccountBaseInfo();
//        aBI.setAccountNumber(faker.finance().creditCard());
//        DictionaryItem di = new DictionaryItem();
//        di.setCode(faker.commerce().productName());
//        di.setDescription(faker.chuckNorris().fact());
//        dictionaryItem_map.put(idGen.newId(),
//                               di);
//        aBI.setAccountType(di);
//        aBI.setAccountTypeName(faker.company().buzzword());
//        aBI.addPsuRelationsItem(fakeAccountPsuRelation(faker));
//        System.out.println(aBI);
//        AccountBaseInfo_map.putIfAbsent(idGen.newId(),
//                                        aBI);
//    }
//    System.out.
//            println("AccountBaseInfo_map.size: " + AccountBaseInfo_map.size());
//    AccountBaseInfo_map.flush();
//    System.out.println("Adding AccountBaseInfo_map finished!");
//}
//
//private static AccountPsuRelation fakeAccountPsuRelation(Faker faker) {
//    AccountPsuRelation acountPsuRelation = new AccountPsuRelation();
//    acountPsuRelation.setTypeOfRelation(
//            AccountPsuRelation.TypeOfRelationEnum.values()[faker.number().
//            numberBetween(0,
//                          5)]);
//    acountPsuRelation.setTypeOfProxy(
//            AccountPsuRelation.TypeOfProxyEnum.values()[faker.number().
//            numberBetween(0,
//                          3)]);
//    acountPsuRelation.setStake(faker.number().randomDigit());
//    return acountPsuRelation;
//}
//
//private static void makeAccountInfo_data(HazelcastInstance hz,
//        Faker faker) {
//    IdGenerator idGen = hz.getIdGenerator("newId");
//    IMap<Long, AccountInfo> accountInfo_map = hz.getMap("AccountInfo_map");
//    IMap<Long, DictionaryItem> dictionaryItem_map = hz.getMap(
//            "DictionaryItem_accountInfo");
//    for (int i = 0; i < 50; i++) {
//        AccountInfo accI = new AccountInfo();
//        accI.setAccountHolderType(
//                AccountInfo.AccountHolderTypeEnum.
//                        values()[faker.number().numberBetween(0,
//                                                              1)]);
//        accI.setAccountNameClient(faker.name().nameWithMiddle());
//        accI.setAccountNumber(faker.finance().creditCard());
//        DictionaryItem di = new DictionaryItem();
//        di.setCode(faker.commerce().productName());
//        di.setDescription(faker.chuckNorris().fact());
//        dictionaryItem_map.put(idGen.newId(),
//                               di);
//        accI.setAccountType(di);
//        accI.setAccountTypeName(faker.company().buzzword());
//        accI.setAvailableBalance(Double.toString(faker.number().
//                randomDouble(2,
//                             1,
//                             1000000)));
//        accI.setBank(fakeBankAccountInfo(faker));
//        accI.setBookingBalance(Double.toString(faker.number().
//                randomDouble(2,
//                             1,
//                             1000000)));
//        accI.setCurrency(faker.currency().code());
//        accI.setNameAddress(fakeNameaddress(faker));
//        accI.addPsuRelationsItem(fakeAccountPsuRelation(faker));
//        DictionaryItem dii = new DictionaryItem();
//        dii.code(faker.hipster().word());
//        dii.description(faker.hipster().word());
//        dictionaryItem_map.put(idGen.newId(),
//                               dii);
//        accI.setAccountType(dii);
//        //
//        System.out.println(accI);
//        accountInfo_map.put(idGen.newId(),
//                            accI);
//    }
//    System.out.println("accountInfo_map.size: " + accountInfo_map.size());
//    System.out.println("Adding AccountInfo_map finished!");
//    accountInfo_map.flush();
//}
//
//private static BankAccountInfo fakeBankAccountInfo(Faker faker) {
//    BankAccountInfo bai = new BankAccountInfo();
//    bai.setAddress(fakeAddress(faker));
//    bai.setBicOrSwift(faker.finance().bic());
//    bai.setName(faker.company().name());
//    return bai;
//}
//
//private static Address fakeAddress(Faker faker) {
//    Address addr = new Address();
//    addr.add(faker.address().streetName());
//    addr.add(faker.address().streetAddressNumber());
//    addr.add(faker.address().zipCode());
//    addr.add(faker.address().cityName());
//    addr.add(faker.address().country());
//    return addr;
//}
    static public NameAddress fakeNameaddress(Faker faker) {
        NameAddress initiator = new NameAddress();
        initiator.addValueItem(faker.address().fullAddress());
        initiator.addValueItem(faker.address().fullAddress());
        return initiator;
    }

    static public AccountPsuRelation fakeAccountPsuRelation(Faker faker) {
        AccountPsuRelation accountPsuRelation = new AccountPsuRelation();

        AccountPsuRelation.TypeOfRelationEnum tor = AccountPsuRelation.TypeOfRelationEnum.values()[faker.number().numberBetween(0, 5)];
        accountPsuRelation.setTypeOfRelation(tor);

        AccountPsuRelation.TypeOfProxyEnum top = AccountPsuRelation.TypeOfProxyEnum.values()[faker.number().numberBetween(0, 3)];
        accountPsuRelation.setTypeOfProxy(top);

        accountPsuRelation.setStake(faker.number().randomDigit());
        return accountPsuRelation;
    }

    static public SenderRecipient fakeSenderRecipient(Faker faker) {
        SenderRecipient recipient = new SenderRecipient();
        recipient.setAccountMassPayment(faker.finance().creditCard());
        recipient.setAccountNumber(faker.finance().creditCard());
        recipient.setBank(fakeBank(faker));
        return recipient;
    }

    static public DictionaryItem fakeDictionaryItem(Faker faker) {
        DictionaryItem diccItem = new DictionaryItem();
        diccItem.setCode(faker.idNumber().valid());
        diccItem.setDescription(faker.beer().name());
        return diccItem;
    }

    static public Address fakeAddress(Faker faker) {
        Address addr = new Address();
        addr.add(faker.address().streetName());
        addr.add(faker.address().streetAddressNumber());
        addr.add(faker.address().zipCode());
        addr.add(faker.address().cityName());
        addr.add(faker.address().country());
        return addr;
    }

    static public BankAccountInfo fakeBankAccountInfo(Faker faker) {
        BankAccountInfo bai = new BankAccountInfo();
        bai.setAddress(fakeAddress(faker));
        bai.setBicOrSwift(faker.finance().bic());
        bai.setName(faker.company().name());
        return bai;
    }

    static public Bank fakeBank(Faker faker) {
        Bank bank = new Bank();
        bank.setAddress(fakeAddress(faker));
        bank.setBicOrSwift(faker.finance().bic());
        bank.setCode(faker.finance().iban());
        bank.setCountryCode(faker.address().countryCode());
        bank.setName(faker.company().name());
        return bank;
    }
}
