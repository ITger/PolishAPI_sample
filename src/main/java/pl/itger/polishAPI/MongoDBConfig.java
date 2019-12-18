package pl.itger.polishAPI;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.connection.SslSettings;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import pl.itger.polishAPI.codecs.TypeOfProxyEnumCodec;
import pl.itger.polishAPI.codecs.TypeOfRelationEnumCodec;

import static org.bson.codecs.configuration.CodecRegistries.*;

/*@EnableMongoRepositories(
        basePackageClasses = {
                AccountInfoRepository.class,
                AccountBaseInfoRepository.class,
                HoldInfoRepository.class,
                TransactionInfoRepository.class
        })*/

@EnableMongoRepositories(basePackages = {"pl.itger.polishAPI.repository"})

@Configuration
@Service
public class MongoDBConfig {

    @Value("${spring.data.mongodb.database}")
    String dbName;

    @Value("@{spring.application.name}")
    String appName;

    @Value("${spring.data.mongodb.uri}")
    private String connectionString;

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public MongoClient mongoClient(@Value("${spring.data.mongodb.uri}") String connectionString) {
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry typeOfRelationEnumCodec = fromCodecs(new TypeOfRelationEnumCodec());
        CodecRegistry typeOfProxyEnumCodec = fromCodecs(new TypeOfProxyEnumCodec());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), typeOfRelationEnumCodec, typeOfProxyEnumCodec, pojoCodecRegistry);
        //CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), typeOfRelationEnumCodec, typeOfProxyEnumCodec);
        MongoClientSettings settings = MongoClientSettings.builder()
                .readPreference(ReadPreference.primary())
                .readConcern(ReadConcern.MAJORITY)
                .writeConcern(WriteConcern.MAJORITY)
                .applyConnectionString(new ConnectionString(connectionString))
                .codecRegistry(codecRegistry)
                .applicationName(appName)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);

        SslSettings sslSettings = settings.getSslSettings();
        ReadPreference readPreference = settings.getReadPreference();
        ReadConcern readConcern = settings.getReadConcern();
        WriteConcern writeConcern = settings.getWriteConcern();
        CodecRegistry codecRegistry1 = settings.getCodecRegistry();

        System.out.println("readConcern.asDocument().toString():    " + readConcern.asDocument().toString());
        System.out.println("readPreference.toString():              " + readPreference.toString());
        System.out.println("sslSettings.isInvalidHostNameAllowed(): " + sslSettings.isInvalidHostNameAllowed());
        System.out.println("writeConcern.asDocument().toString():   " + writeConcern.asDocument().toString());
        System.out.println("sslSettings.isEnabled():                " + sslSettings.isEnabled());
        System.out.println("codecRegistry1.toString():              " + codecRegistry1.toString());
        return mongoClient;
    }

    public String getDatabaseName() {
        return dbName;
    }

   /* @Override
    public MongoCustomConversions customConversions() {
        System.out.println("MongoCustomConversions");
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(new OffsetDateTimeReadConverter());
        converters.add(new OffsetDateTimeWriteConverter());
        return new MongoCustomConversions(converters);
    }*/

}
