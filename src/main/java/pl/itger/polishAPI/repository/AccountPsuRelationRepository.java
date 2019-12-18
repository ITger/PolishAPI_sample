package pl.itger.polishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.itger.polishAPI.io.swagger.model.AccountPsuRelation;

@Repository
public interface AccountPsuRelationRepository extends MongoRepository<AccountPsuRelation, String> {
}
