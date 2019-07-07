package pl.itger.PolishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;

public interface AccountInfoRepository
        extends MongoRepository<AccountInfo, String> {

}
