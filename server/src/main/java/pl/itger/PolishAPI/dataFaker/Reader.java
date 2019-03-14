/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.dataFaker;

import com.hazelcast.config.Config;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.nio.serialization.Data;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;
import io.swagger.model.AccountBaseInfo;
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
//    ClassLoader ccl = Thread.currentThread().
//            getContextClassLoader();
//// Get the classloader of a class from inside the bundle
//    ClassLoader classLoader = this.getClass().
//            getClassLoader();
//// Set it as context class loader
//    Thread.currentThread().
//            setContextClassLoader(classLoader);
//    Config config = new Config();
//config.setClassLoader(getBundleClassLoader());
    //HazelcastInstance client = Hazelcast.newHazelcastInstance(config);
    //HazelcastInstance client = HazelCastFactory.getInstance();

    HazelcastInstance client = HazelCastFactory.getInstance();

    EntryObject e = new PredicateBuilder().getEntryObject();
    Predicate predicate = e.get("accountNumber").
            equal("6767-2827-4794-3486-48");
    IMap<Long, io.swagger.model.AccountBaseInfo> accountBaseInfo_map = client.getMap(
            "AccountBaseInfo_map");

    System.out.
            println("AccountBaseInfo_map.size: " + accountBaseInfo_map.size());
    //
    //  accountNumber: 6771-8925-0596-9323

    Collection<io.swagger.model.AccountBaseInfo> result = accountBaseInfo_map.values(predicate);
    System.out.println("result.size: " + result.size());
    for (io.swagger.model.AccountBaseInfo accountBaseInfo : result) {
        System.out.println(accountBaseInfo.toString());
    }
//    Thread.currentThread().
//            setContextClassLoader(ccl);
    
    HazelCastFactory.shutDown();
}
}
