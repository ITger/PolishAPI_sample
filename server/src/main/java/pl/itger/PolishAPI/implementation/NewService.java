package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.itger.PolishAPI.io.swagger.api.AisApiDelegate;
import pl.itger.PolishAPI.io.swagger.api.AsApiDelegate;
import pl.itger.PolishAPI.io.swagger.api.CafApiDelegate;
import pl.itger.PolishAPI.io.swagger.api.PisApiDelegate;
import pl.itger.PolishAPI.io.swagger.model.AccountInfoRequest;
import pl.itger.PolishAPI.io.swagger.model.AccountResponse;
import pl.itger.PolishAPI.io.swagger.model.AccountsRequest;
import pl.itger.PolishAPI.io.swagger.model.AccountsResponse;
import pl.itger.PolishAPI.io.swagger.model.DeleteConsentRequest;
import pl.itger.PolishAPI.io.swagger.model.HoldInfoResponse;
import pl.itger.PolishAPI.io.swagger.model.HoldRequest;
import pl.itger.PolishAPI.io.swagger.model.TransactionDetailRequest;
import pl.itger.PolishAPI.io.swagger.model.TransactionDetailResponse;
import pl.itger.PolishAPI.io.swagger.model.TransactionInfoRequest;
import pl.itger.PolishAPI.io.swagger.model.TransactionPendingInfoResponse;
import pl.itger.PolishAPI.io.swagger.model.TransactionRejectedInfoResponse;
import pl.itger.PolishAPI.io.swagger.model.TransactionsCancelledInfoResponse;
import pl.itger.PolishAPI.io.swagger.model.TransactionsDoneInfoResponse;
import pl.itger.PolishAPI.io.swagger.model.TransactionsScheduledInfoResponse;

/**
 *
 * @author Piotr Zerynger
 */
@Service
public class NewService implements AisApiDelegate, AsApiDelegate,CafApiDelegate,PisApiDelegate{
Logger log = LoggerFactory.getLogger(NewService.class);
    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return AisApiDelegate.super.getObjectMapper(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return AisApiDelegate.super.getRequest(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Optional<String> getAcceptHeader() {
        return AisApiDelegate.super.getAcceptHeader(); //To change body of generated methods, choose Tools | Templates.
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
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        return AisApiDelegate.super.getAccount(authorization,
                                               acceptEncoding,
                                               acceptLanguage,
                                               acceptCharset,
                                               X_JWS_SIGNATURE,
                                               X_REQUEST_ID,
                                               getAccountRequest); //To change body of generated methods, choose Tools | Templates.
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
