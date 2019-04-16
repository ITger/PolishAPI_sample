package pl.itger.PolishAPI.repository;

import pl.itger.PolishAPI.io.swagger.model.HoldInfo;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author new
 */
public interface HoldInfoRepository
        extends PagingAndSortingRepository<HoldInfo, String>,
                CrudRepository<HoldInfo, String>{

//List<HoldInfo> findByAmount(String amount);
//
//Page<HoldInfo> findByAmount(String amount,
//        Pageable pageable);
//
//Page<HoldInfo> listAll(Pageable pageable);

}
