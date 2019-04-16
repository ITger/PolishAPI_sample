package pl.itger.PolishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.itger.PolishAPI.io.swagger.model.AccountInfo;

/**
 *
 * @author new
 */
public interface AccountInfoRepository
        extends MongoRepository<AccountInfo, String>
                {

//List<HoldInfo> findByAmount(String amount);
//
//Page<HoldInfo> findByAmount(String amount,
//        Pageable pageable);
//
//Page<HoldInfo> listAll(Pageable pageable);
}
