package pl.itger.polishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.itger.polishAPI.io.swagger.model.AccountBaseInfo;


@Repository
public interface AccountBaseInfoRepository extends MongoRepository<AccountBaseInfo, String> {
   /* @Query("{ 'firstname' : ?0 }")
    List<AccountBaseInfo> findByFName(String firstname);


    @Query(value = "{ 'firstname' : ?0 }", fields = "{ 'firstname' : 1, 'lastname' : 1}")
    List<AccountBaseInfo> findByFName_FN_LN(String firstname);

    @Query(value = "{ '_id' : ?0 }")
    List<AccountBaseInfo> findByID(String _id);*/

    //Page<AccountBaseInfo> findByFirstname(String firstname, Pageable pageable);
}
