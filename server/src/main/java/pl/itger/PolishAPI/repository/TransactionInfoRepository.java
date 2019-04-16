package pl.itger.PolishAPI.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import pl.itger.PolishAPI.io.swagger.model.TransactionInfo;

public interface TransactionInfoRepository
        extends PagingAndSortingRepository<TransactionInfo, String> {

}
