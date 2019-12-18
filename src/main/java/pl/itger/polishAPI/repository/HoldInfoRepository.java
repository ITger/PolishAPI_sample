package pl.itger.polishAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pl.itger.polishAPI.io.swagger.model.HoldInfo;

/**
 * @author new
 */
public interface HoldInfoRepository
        extends MongoRepository<HoldInfo, String> {

//List<HoldInfo> findByAmount(String amount);
//
//Page<HoldInfo> findByAmount(String amount,
//        Pageable pageable);
//
//Page<HoldInfo> listAll(Pageable pageable);

}
