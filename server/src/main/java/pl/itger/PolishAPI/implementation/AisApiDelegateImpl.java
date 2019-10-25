package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import pl.itger.JWTokens.JWT_verify;
import pl.itger.PolishAPI.io.swagger.api.AisApiDelegate;
import pl.itger.PolishAPI.io.swagger.model.*;
import javax.servlet.http.HttpServletRequest;
import java.time.OffsetDateTime;
import java.util.Optional;

@Service
public class AisApiDelegateImpl implements AisApiDelegate {

    private final MongoDbFactory mongoDbFactory;

    @Autowired
    private TokenUtils tokenUtils;

    @Autowired
    private JWT_verify jwt_verify;

    @Autowired
    private MongoClient mongoClient;

    @Autowired
    public AisApiDelegateImpl(MongoDbFactory dbFactory) {
        this.mongoDbFactory = dbFactory;
    }

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
                false);
        mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION,
                true);
        return Optional.of(mapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        RequestAttributes reqAttr = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servlReqAttr = (ServletRequestAttributes) reqAttr;
        HttpServletRequest req = null;
        if (servlReqAttr != null) {
            req = servlReqAttr.getRequest();
        }
        return Optional.of(req);
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return getRequest().
                map(r -> r.getHeader("Accept"));
    }

    @Override
    public ResponseEntity<Void> deleteConsent(String acceptEncoding,
                                              String acceptLanguage,
                                              String acceptCharset,
                                              String X_JWS_SIGNATURE,
                                              String X_REQUEST_ID,
                                              DeleteConsentRequest deleteConsentRequest) {
        return AisApiDelegate.super.deleteConsent(acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                deleteConsentRequest); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * curl -k -v -X POST "https://localhost:8443/v2_1_2.1/accounts/v2_1_2.1/getAccount" -H  "accept: application/json" -H  "Accept-Charset: utf-8" -H  "Accept-Encoding: gzip" -H  "Accept-Language: PL-pl" -H  "Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*" -H  "X-JWS-SIGNATURE: wefewfef" -H  "X-REQUEST-ID: 95215B80-A744-11E9-B4AB-D922C8858915" -H  "Content-Type: application/json" -d "{  \"accountNumber\": \"3528-3503-4301-0498\",  \"requestHeader\": {    \"ipAddress\": \"string\",    \"isDirectPsu\": true,    \"requestId\": \"95215B80-A744-11E9-B4AB-D922C8858915\",    \"sendDate\": \"2019-10-15T20:59:12.601Z\", \"tppId\": \"string\",    \"userAgent\": \"string\", \"token\": \"eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vaXRnZXIucGwvIiwic3ViIjoic3ViamVjdCIsImF1ZCI6ImF1ZGllbmNlIiwiZXhwIjoxNTcyODE4NzgxLCJyb2wiOlsiSGVsbG8iLCJXb3JsZCJdLCJuYW1lIjoiY2xpZW50X2lkIiwic2NvcGUiOiJpdGdlcl9wb2xpc2hBUElfMl8xXzIifQ.ZLJBKnRrQxecJrRXLJ-etZq4g52-bxgB-JFVVPo8YwA*\"  }}"
     */
    @Override
    public ResponseEntity<AccountResponse> getAccount(String authorization,
                                                      String acceptEncoding,
                                                      String acceptLanguage,
                                                      String acceptCharset,
                                                      String X_JWS_SIGNATURE,
                                                      String X_REQUEST_ID,
                                                      AccountInfoRequest getAccountRequest) {
        AccountResponse response = new AccountResponse();
        ResponseHeader responseHeader = new ResponseHeader();
        ResponseEntity<AccountResponse> responseEntity;
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                Query query = new Query();
                query.addCriteria(Criteria.where("accountNumber").is(getAccountRequest.getAccountNumber()));
                MongoOperations mongoOps = new MongoTemplate(mongoDbFactory);
                AccountInfo accountInfo = mongoOps.findOne(query, AccountInfo.class);
                try {
                    responseHeader.setIsCallback(Boolean.FALSE);
                    responseHeader.setRequestId(getAccountRequest.getRequestHeader().getRequestId());
                    responseHeader.setSendDate(OffsetDateTime.now());
                    response.setResponseHeader(responseHeader);
                    response.setAccount(accountInfo);
                    responseEntity = new ResponseEntity<AccountResponse>(response, HttpStatus.OK);
                } catch (Exception e) {
                    log.error(e.getLocalizedMessage(), e);
                    responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            } else {
                responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
            }
        } else {
            log.warn("AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
            responseEntity = new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        }
        return responseEntity;
    }

    @Override
    public ResponseEntity<AccountsResponse> getAccounts(String authorization,
                                                        String acceptEncoding,
                                                        String acceptLanguage,
                                                        String acceptCharset,
                                                        String X_JWS_SIGNATURE,
                                                        String X_REQUEST_ID,
                                                        AccountsRequest getAccountsRequest) {
        if (getObjectMapper().
                isPresent() && getAcceptHeader().
                isPresent()) {
            if (getAcceptHeader().
                    get().
                    contains("application/json")) {
                try {

                    //final List<Predicate<?, ?>> predicates = new LinkedList<>();
                    // Message ID
//    if (messageId != null)
//    {
//        predicates.add(Predicates.greaterEqual("id", messageId));
//    }
                    // Topic
//    if (topic != null)
//    {
//        predicates.add(Predicates.equal("topic", topic));
//    }
//    if (! propertyMatch.isEmpty())
//    {
//        for (Entry<String, Comparable> e : propertyMatch.entrySet())
//        {
//            predicates.add(Predicates.equal(e.getKey(), e.getValue()));
//        }
//    }
                    //return Predicates.and(predicates.toArray(new Predicate[predicates.size()]));
//                final String accountNumber = getAccountsRequest.
//                        getAccountNumber().
//                        trim();
                    //System.out.println("accountNumber: " + accountNumber);
//                getAccountsRequest.getPageId();
//                if (getAccountsRequest.getPageId() != null) {
//                    predicates.add(Predicates.greaterEqual("id",
//                                                           getAccountsRequest.getPageId()));
//                }
//                getAccountsRequest.getPerPage();
//                getAccountsRequest.getTypeOfPsuRelation().
//                        name();
//                //Predicate<String, LogBean> tmp = Predicates.equal(field, value);
//                PredicateBuilder predicateBuilder = new PredicateBuilder();
//                EntryObject e = new PredicateBuilder().getEntryObject();
//                Predicate<String, String> predicate
//                        = e.get("isbn").
//                                equal(getAccountsRequest.getPageId()).
//                                and(e.get("price").
//                                        greaterEqual(3000));
//
//                KeyValueQuery<Predicate<String, Book>> query = new KeyValueQuery<>(
//                        predicate);
//
//                Iterable<Book> books = keyValueOperations.find(query,
//                                                               Book.class);
//
//                predicateBuilder.and(predicateBuilder)
//                        = new PredicateBuilder().getEntryObject();
//                //PredicateBuilder.a Predicate predicate = e.get("accountNumber").equal("6767-2827-4794-3486-48");
//                if (predicate == null) {
//                    predicate = tmp;
//                } else {
//                    predicate = Predicates.and(predicate,
//                                               tmp);
//
//                    PagingPredicate pagingPredicate = new PagingPredicate(
//                            predicate,
//                            salaryComparator,
//                            pageSize);
//
//                    IMap<Long, AccountInfo> accountInfo_map = hazelcast_Instance.
//                            getMap("AccountInfo_map");
//                    System.out.println("accountInfo_map: " + accountInfo_map.
//                            size());
//                    EntryObject e = new PredicateBuilder().getEntryObject();
//                    Predicate predicate = e.get("accountNumber").
//                            equal("1");
//                    Collection<AccountInfo> result = accountInfo_map.
//                            values(predicate);
//                    //System.out.println("result.size: " + result.size());
//                    AccountsResponse response = new AccountsResponse();
//                    ResponseHeader responseHeader = new ResponseHeader();
//                    responseHeader.setIsCallback(Boolean.FALSE);
//                    responseHeader.setRequestId(getAccountsRequest.
//                            getRequestHeader().
//                            getRequestId());
//                    responseHeader.setSendDate(OffsetDateTime.now());
//                    response.setResponseHeader(responseHeader);
//                    if (result.size() < 1) {
//                        return new ResponseEntity<>(response,
//                                                    HttpStatus.NOT_FOUND);
//                    }
////                else if (result.size() > 1) {
////                    return new ResponseEntity<>(response,
////                                                HttpStatus.BAD_REQUEST);
////                }
//                    AccountInfo ai = (AccountInfo) result.toArray()[0];
//                    //response.setAccounts(accounts);
//                    return new ResponseEntity<>(response,
//                                                HttpStatus.OK);
//                }
                } catch (Exception e) {
                    log.error(e.getLocalizedMessage(),
                            e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

                }
            }
        } else {
            log.warn(
                    "AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<HoldInfoResponse> getHolds(String authorization,
                                                     String acceptEncoding,
                                                     String acceptLanguage,
                                                     String acceptCharset,
                                                     String X_JWS_SIGNATURE,
                                                     String X_REQUEST_ID,
                                                     HoldRequest getHoldsRequest) {
        if (getObjectMapper().
                isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                if (!tokenUtils.verify(authorization,
                        getHoldsRequest.getRequestHeader().getToken())) {
                    return new ResponseEntity<>(HttpStatus.FORBIDDEN);
                }
//            try {
//                final List<Predicate<String, String>> predicates = new LinkedList<>();
//
//                Optional.ofNullable(
//                        getHoldsRequest.getAccountNumber()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("accountNumber",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getBookingDateFrom()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("bookingDateFrom",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getBookingDateTo()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("bookingDateTo",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getItemIdFrom()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("itemIdFrom",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getMaxAmount()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("maxAmount",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getMinAmount()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("minAmount",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getPageId()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("pageId",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getPerPage()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        equal("perPage",
//                              value)));
//                Optional.ofNullable(
//                        getHoldsRequest.getTransactionDateFrom()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        greaterEqual("tradeDate",
//                                     OffsetDateTime.of(value.atStartOfDay(),
//                                                       OffsetDateTime.now().
//                                                               getOffset()
//                                     )
//                        )));
//                Optional.ofNullable(
//                        getHoldsRequest.getTransactionDateTo()).
//                        ifPresent(value -> predicates.add(Predicates.
//                        lessEqual("tradeDate",
//                                  OffsetDateTime.of(value.atStartOfDay(),
//                                                    OffsetDateTime.now().
//                                                            getOffset()
//                                  )
//                        )));
//                System.out.println("predicates: " + predicates.size() + " " + predicates.toString());
//                //GenericEntity foundEntity = genericEntityRepository.findOne(genericEntity.getId());
//                IMap<Long, HoldInfo> _map = hazelcast_Instance.
//                        getMap("HoldInfo_map");
//                System.out.println("_map: " + _map.size());
//
//                Collection<HoldInfo> result = _map.
//                        values(Predicates.and(predicates.toArray(
//                                new Predicate[predicates.size()])));
//                ResponseHeader responseHeader = new ResponseHeader();
//                //TODO sprawdzic pole X_REQUEST_ID
//                responseHeader.setRequestId(UUID.fromString(X_REQUEST_ID));
//                responseHeader.setIsCallback(Boolean.FALSE);
//                responseHeader.setSendDate(OffsetDateTime.now());
//                //
//                HoldInfoResponse response = new HoldInfoResponse();
//                response.setResponseHeader(responseHeader);
//                if (result.size() < 1) {
//                    return new ResponseEntity<>(response,
//                                                HttpStatus.NOT_FOUND);
//                }
//                response.setHolds(new ArrayList<>(result));
//                return new ResponseEntity<>(response,
//                                            HttpStatus.OK);
//            } catch (Exception e) {
//                log.error(e.getLocalizedMessage(),
//                          e);
//                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
            }
        } else {
            log.warn(
                    "AisApiDelegateImpl : ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<TransactionDetailResponse> getTransactionDetail(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionDetailRequest getTransationDetailRequest
    ) {
        return AisApiDelegate.super.getTransactionDetail(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransationDetailRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<TransactionsCancelledInfoResponse> getTransactionsCancelled(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsCancelledRequest
    ) {
        return AisApiDelegate.super.getTransactionsCancelled(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsCancelledRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<TransactionsDoneInfoResponse> getTransactionsDone(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsDoneRequest
    ) {
        if (getObjectMapper().
                isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                if (!tokenUtils.verify(authorization,
                        getTransactionsDoneRequest.getRequestHeader().
                                getToken())) {
                    return new ResponseEntity<>(HttpStatus.FORBIDDEN);
                }
                getTransactionsDoneRequest.getAccountNumber();
                getTransactionsDoneRequest.getBookingDateFrom();
                getTransactionsDoneRequest.getBookingDateTo();
                getTransactionsDoneRequest.getItemIdFrom();
                getTransactionsDoneRequest.getMaxAmount();
                getTransactionsDoneRequest.getMinAmount();
                getTransactionsDoneRequest.getPageId();
                getTransactionsDoneRequest.getPerPage();
                getTransactionsDoneRequest.getTransactionDateFrom();
                getTransactionsDoneRequest.getTransactionDateTo();
                getTransactionsDoneRequest.getType();
            }
        }
        return AisApiDelegate.super.getTransactionsDone(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsDoneRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<TransactionPendingInfoResponse> getTransactionsPending(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsPendingRequest
    ) {
        return AisApiDelegate.super.getTransactionsPending(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsPendingRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<TransactionRejectedInfoResponse> getTransactionsRejected(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsRejectedRequest
    ) {
        return AisApiDelegate.super.getTransactionsRejected(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsRejectedRequest); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<TransactionsScheduledInfoResponse> getTransactionsScheduled(
            String authorization,
            String acceptEncoding,
            String acceptLanguage,
            String acceptCharset,
            String X_JWS_SIGNATURE,
            String X_REQUEST_ID,
            TransactionInfoRequest getTransactionsScheduledRequest
    ) {
        return AisApiDelegate.super.getTransactionsScheduled(authorization,
                acceptEncoding,
                acceptLanguage,
                acceptCharset,
                X_JWS_SIGNATURE,
                X_REQUEST_ID,
                getTransactionsScheduledRequest); //To change body of generated methods, choose Tools | Templates.
    }

}
