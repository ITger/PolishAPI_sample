package pl.itger.PolishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;

@Repository
public interface AccountInfoRepository
        extends MongoRepository<AccountInfo, String> {

}
