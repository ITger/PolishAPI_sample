package pl.itger.PolishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.itger.PolishAPI.io.swagger.model.TransactionInfo;

public interface TransactionInfoRepository
        extends MongoRepository<TransactionInfo, String> {

}
