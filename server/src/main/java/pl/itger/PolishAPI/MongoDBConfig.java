package pl.itger.PolishAPI;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pl.itger.PolishAPI.converters.OffsetDateTimeReadConverter;
import pl.itger.PolishAPI.converters.OffsetDateTimeWriteConverter;
import pl.itger.PolishAPI.repository.AccountInfoRepository;
import pl.itger.PolishAPI.repository.HoldInfoRepository;
import pl.itger.PolishAPI.repository.TransactionInfoRepository;

import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(
        basePackageClasses = {AccountInfoRepository.class, HoldInfoRepository.class, TransactionInfoRepository.class})

@Configuration
public class MongoDBConfig
        extends AbstractMongoConfiguration {

    public @Bean
    MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "PolishAPI");
    }

    @Override
    protected String getDatabaseName() {
        return "PolishAPI";
    }

    @Override
    @Bean
    public MongoClient mongoClient() {
        System.out.println("MongoClient");
        return new MongoClient("127.0.0.1",
                27017);
    }


    @Override
    public MongoCustomConversions customConversions() {
        System.out.println("MongoCustomConversions");
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(new OffsetDateTimeReadConverter());
        converters.add(new OffsetDateTimeWriteConverter());
        return new MongoCustomConversions(converters);
    }

}
