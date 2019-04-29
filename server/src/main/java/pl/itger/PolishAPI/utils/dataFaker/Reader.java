/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.utils.dataFaker;

//import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.core.IMap;
//import com.hazelcast.query.EntryObject;
//import com.hazelcast.query.Predicate;
//import com.hazelcast.query.PredicateBuilder;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;
import java.util.Collection;

/**
 *
 * @author new
 */
public class Reader {

public static void main(String[] args) throws Exception {
    new Reader().read();
}

public void read() {
//    HazelcastInstance client = HazelCastFactory.getInstance();
//    IMap<Long, io.swagger.model.AccountBaseInfo> accountBaseInfo_map = client.
//            getMap(
//                    "AccountBaseInfo_map");
//    System.out.
//            println("AccountBaseInfo_map.size: " + accountBaseInfo_map.size());
//
//    EntryObject e = new PredicateBuilder().getEntryObject();
//    Predicate predicate = e.get("accountNumber").
//            equal("6767-2827-4794-3486-48");
//
//    Collection<io.swagger.model.AccountBaseInfo> result = accountBaseInfo_map.
//            values(predicate);
//    System.out.println("result.size: " + result.size());
//    for (io.swagger.model.AccountBaseInfo accountBaseInfo : result) {
//        System.out.println(accountBaseInfo.toString());
//    }
//
//    IMap<Long, io.swagger.model.AccountInfo> accountInfo_map = client.
//            getMap(
//                    "AccountInfo_map");
//    System.out.
//            println("accountInfo_map.size: " + accountInfo_map.
//                    size());
//
//    e = new PredicateBuilder().getEntryObject();
//    predicate = e.get("accountNumber").
//            equal("4232-6150-4228-7919");
//
//    Collection<io.swagger.model.AccountInfo> result2 = accountInfo_map.
//            values(predicate);
//    System.out.println("result.size: " + result2.size());
//    AccountInfo ai = null;
//    for (io.swagger.model.AccountInfo accountInfo : result2) {
//        System.out.println(accountInfo.toString());
//        ai = accountInfo;
//    }
//    HazelCastFactory.shutDown();
}
}
