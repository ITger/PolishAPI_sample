package pl.itger.PolishAPI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author new
 */
//@Configuration
//@EntityScan(basePackages = {"io.swagger.model"})
public class DataSourceConfig {

//@Bean
//public DataSource getDataSource() {
//    System.out.println("dataSourceBuilder");
//    DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//    dataSourceBuilder.driverClassName("org.hsqldb.jdbcDriver");
//    dataSourceBuilder.url("jdbc:hsqldb:hsql://localhost:9001");
//    dataSourceBuilder.username("SA");
//    dataSourceBuilder.password("");
//    DataSource ds = dataSourceBuilder.build();
//    try {
//        System.out.println("Schema: " + ds.getConnection().getSchema());
//    } catch (SQLException ex) {
//        Logger.getLogger(DataSourceConfig.class.getName()).
//                log(Level.SEVERE,
//                    null,
//                    ex);
//    }
//    return ds;
//
//}
}
