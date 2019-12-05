package pl.itger.PolishAPI.repository;

import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.TransactionOptions;
import com.mongodb.WriteConcern;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.itger.PolishAPI.io.swagger.model.AccountBaseInfo;

@Repository
public class AccountBaseInfoRepoImpl {//implements  AccountInfoRepository {
    private static final TransactionOptions txnOptions = TransactionOptions.builder()
            .readPreference(ReadPreference.primary())
            .readConcern(ReadConcern.MAJORITY)
            .writeConcern(WriteConcern.MAJORITY)
            .build();

    @Autowired
    private MongoClient client;

    private MongoCollection<AccountBaseInfo> personCollection;
    /*@Override
    public <S extends AccountInfo> S save(S s) {
        return null;
    }

    @Override
    public <S extends AccountInfo> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<AccountInfo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<AccountInfo> findAll() {
        return null;
    }

    @Override
    public Iterable<AccountInfo> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(AccountInfo accountInfo) {

    }

    @Override
    public void deleteAll(Iterable<? extends AccountInfo> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<AccountInfo> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AccountInfo> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AccountInfo> S insert(S s) {
        return null;
    }

    @Override
    public <S extends AccountInfo> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends AccountInfo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AccountInfo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AccountInfo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AccountInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AccountInfo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AccountInfo> boolean exists(Example<S> example) {
        return false;
    }*/
}
