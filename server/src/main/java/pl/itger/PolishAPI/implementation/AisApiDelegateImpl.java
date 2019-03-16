/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.query.EntryObject;
import com.hazelcast.query.Predicate;
import com.hazelcast.query.PredicateBuilder;
import io.swagger.api.AisApiDelegate;
import static io.swagger.api.AisApiDelegate.log;
import io.swagger.model.AccountInfo;
import io.swagger.model.AccountInfoRequest;
import io.swagger.model.AccountResponse;
import io.swagger.model.AccountsRequest;
import io.swagger.model.AccountsResponse;
import io.swagger.model.DeleteConsentRequest;
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
import java.util.Collection;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@org.springframework.stereotype.Service
public class AisApiDelegateImpl
        implements AisApiDelegate {

@Autowired
 private HazelcastInstance hazelcast_Instance;

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
            try {
                final String accountNumber = getAccountRequest.
                        getAccountNumber().
                        trim();
                //System.out.println("accountNumber: " + accountNumber);
                //HazelcastInstance client = HazelCastFactory.getInstance();
                HazelcastInstance client = hazelcast_Instance;
                IMap<Long, AccountInfo> accountInfo_map = client.
                        getMap("AccountInfo_map");
                System.out.println("accountInfo_map: " + accountInfo_map.size());
                EntryObject e = new PredicateBuilder().getEntryObject();
                Predicate predicate = e.get("accountNumber").
                        equal(accountNumber);
                Collection<AccountInfo> result = accountInfo_map.
                        values(predicate);
                //System.out.println("result.size: " + result.size());
                AccountResponse ar = new AccountResponse();
                ResponseHeader rH = new ResponseHeader();
                rH.setIsCallback(Boolean.FALSE);
                rH.setRequestId(getAccountRequest.getRequestHeader().
                        getRequestId());
                rH.setSendDate(OffsetDateTime.now());
                ar.setResponseHeader(rH);
                if (result.size() < 1) {
                    return new ResponseEntity<>(ar,
                                                HttpStatus.NOT_FOUND);
                } else if (result.size() > 1) {
                    return new ResponseEntity<>(ar,
                                                HttpStatus.CONFLICT);
                }
                AccountInfo ai = (AccountInfo) result.toArray()[0];
                ar.setAccount(ai);
                //HazelCastFactory.shutDown();
                return new ResponseEntity<>(ar, HttpStatus.OK);
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
public ResponseEntity<AccountsResponse> getAccounts(String authorization,
        String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        AccountsRequest getAccountsRequest) {
    return AisApiDelegate.super.getAccounts(authorization,
                                            acceptEncoding,
                                            acceptLanguage,
                                            acceptCharset,
                                            X_JWS_SIGNATURE,
                                            X_REQUEST_ID,
                                            getAccountsRequest); //To change body of generated methods, choose Tools | Templates.
}

@Override
public ResponseEntity<HoldInfoResponse> getHolds(String authorization,
        String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        HoldRequest getHoldsRequest) {
    return AisApiDelegate.super.getHolds(authorization,
                                         acceptEncoding,
                                         acceptLanguage,
                                         acceptCharset,
                                         X_JWS_SIGNATURE,
                                         X_REQUEST_ID,
                                         getHoldsRequest); //To change body of generated methods, choose Tools | Templates.
}

@Override
public ResponseEntity<TransactionDetailResponse> getTransactionDetail(
        String authorization,
        String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        TransactionDetailRequest getTransationDetailRequest) {
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
        TransactionInfoRequest getTransactionsCancelledRequest) {
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
        TransactionInfoRequest getTransactionsDoneRequest) {
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
        TransactionInfoRequest getTransactionsPendingRequest) {
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
        TransactionInfoRequest getTransactionsRejectedRequest) {
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
        TransactionInfoRequest getTransactionsScheduledRequest) {
    return AisApiDelegate.super.getTransactionsScheduled(authorization,
                                                         acceptEncoding,
                                                         acceptLanguage,
                                                         acceptCharset,
                                                         X_JWS_SIGNATURE,
                                                         X_REQUEST_ID,
                                                         getTransactionsScheduledRequest); //To change body of generated methods, choose Tools | Templates.
}

}
