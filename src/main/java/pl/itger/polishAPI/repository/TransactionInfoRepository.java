package pl.itger.polishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.itger.polishAPI.io.swagger.model.TransactionInfo;

public interface TransactionInfoRepository
        extends MongoRepository<TransactionInfo, String> {

}
