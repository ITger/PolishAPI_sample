/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.google.common.base.Predicate;
//import com.google.common.base.Predicates;
//import com.hazelcast.core.HazelcastInstance;
//import com.hazelcast.core.IMap;
//import com.hazelcast.query.EntryObject;
//import com.hazelcast.query.Predicate;
//import com.hazelcast.query.PredicateBuilder;
//import com.hazelcast.query.Predicates;
import io.swagger.api.AisApiDelegate;
import static io.swagger.api.AisApiDelegate.log;
import io.swagger.model.AccountInfo;
import io.swagger.model.AccountInfoRequest;
import io.swagger.model.AccountResponse;
import io.swagger.model.AccountsRequest;
import io.swagger.model.AccountsResponse;
import io.swagger.model.DeleteConsentRequest;
import io.swagger.model.HoldInfo;
import io.swagger.model.HoldInfoResponse;
import io.swagger.model.HoldRequest;
import io.swagger.model.ResponseHeader;
import io.swagger.model.TransactionDetailRequest;
import io.swagger.model.TransactionDetailResponse;
import io.swagger.model.TransactionInfoRequest;
import io.swagger.model.TransactionPendingInfoResponse;
import io.swagger.model.TransactionRejectedInfoResponse;
import io.swagger.model.TransactionsCancelledInfoResponse;
import io.swagger.model.TransactionsDoneInfoResponse;
import io.swagger.model.TransactionsScheduledInfoResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class AisApiDelegateImpl
        implements AisApiDelegate {

//@Autowired
//private HazelcastInstance hazelcast_Instance;

//@Autowired
//    private HoldInfoRepository holdInfoRepository;

@Autowired
private TokenUtils tokenUtils;

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
    HttpServletRequest req = servlReqAttr.getRequest();
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

@Override
public ResponseEntity<AccountResponse> getAccount(String authorization,
        String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        AccountInfoRequest getAccountRequest) {
    if (getObjectMapper().
            isPresent() && getAcceptHeader().
                    isPresent()) {
        if (getAcceptHeader().
                get().
                contains("application/json")) {
//            try {
//                final String accountNumber = getAccountRequest.
//                        getAccountNumber().
//                        trim();
                //System.out.println("accountNumber: " + accountNumber);
//                IMap<Long, AccountInfo> _map = hazelcast_Instance.
//                        getMap("AccountInfo_map");
//                System.out.println("accountInfo_map: " + _map.size());
//                EntryObject e = new PredicateBuilder().getEntryObject();
//                Predicate predicate = e.get("accountNumber").
//                        equal(accountNumber);
//                Collection<AccountInfo> result = _map.
//                        values(predicate);
//                //System.out.println("result.size: " + result.size());
//                AccountResponse response = new AccountResponse();
//                ResponseHeader responseHeader = new ResponseHeader();
//                responseHeader.setIsCallback(Boolean.FALSE);
//                responseHeader.setRequestId(
//                        getAccountRequest.getRequestHeader().
//                                getRequestId());
//                responseHeader.setSendDate(OffsetDateTime.now());
//                response.setResponseHeader(responseHeader);
//                if (result.size() < 1) {
//                    return new ResponseEntity<>(response,
//                                                HttpStatus.NOT_FOUND);
//                } else if (result.size() > 1) {
//                    return new ResponseEntity<>(response,
//                                                HttpStatus.BAD_REQUEST);
//                }
//                AccountInfo ai = (AccountInfo) result.toArray()[0];
//                response.setAccount(ai);
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
