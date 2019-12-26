package pl.itger.polishAPI.io.swagger.api;

import pl.itger.polishAPI.io.swagger.model.AccountInfoRequest;
import pl.itger.polishAPI.io.swagger.model.AccountResponse;
import pl.itger.polishAPI.io.swagger.model.AccountsRequest;
import pl.itger.polishAPI.io.swagger.model.AccountsResponse;
import pl.itger.polishAPI.io.swagger.model.DeleteConsentRequest;
import pl.itger.polishAPI.io.swagger.model.Error;
import pl.itger.polishAPI.io.swagger.model.HoldInfoResponse;
import pl.itger.polishAPI.io.swagger.model.HoldRequest;
import pl.itger.polishAPI.io.swagger.model.TransactionDetailRequest;
import pl.itger.polishAPI.io.swagger.model.TransactionDetailResponse;
import pl.itger.polishAPI.io.swagger.model.TransactionInfoRequest;
import pl.itger.polishAPI.io.swagger.model.TransactionPendingInfoResponse;
import pl.itger.polishAPI.io.swagger.model.TransactionRejectedInfoResponse;
import pl.itger.polishAPI.io.swagger.model.TransactionsCancelledInfoResponse;
import pl.itger.polishAPI.io.swagger.model.TransactionsDoneInfoResponse;
import pl.itger.polishAPI.io.swagger.model.TransactionsScheduledInfoResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AisApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public interface AisApiDelegate {

    Logger log = LoggerFactory.getLogger(AisApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    /**
     * @see AisApi#deleteConsent
     */
    default ResponseEntity<Void> deleteConsent( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         DeleteConsentRequest  deleteConsentRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getAccount
     */
    default ResponseEntity<AccountResponse> getAccount( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         AccountInfoRequest  getAccountRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"account\" : {    \"linkedAccountNumber\" : [ \"linkedAccountNumber\", \"linkedAccountNumber\" ],    \"accountType\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"psuRelations\" : [ {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    }, {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    } ],    \"accountTypeName\" : \"accountTypeName\",    \"nameAddress\" : {      \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]    },    \"accountNumber\" : \"accountNumber\",    \"availableBalance\" : \"availableBalance\",    \"auxData\" : { },    \"bank\" : {      \"address\" : {        \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]      },      \"bicOrSwift\" : \"bicOrSwift\",      \"name\" : \"name\"    },    \"bookingBalance\" : \"bookingBalance\",    \"currency\" : \"currency\",    \"accountNameClient\" : \"accountNameClient\",    \"accountHolderType\" : \"individual\",    \"vatAccountNrb\" : \"vatAccountNrb\"  }}", AccountResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getAccounts
     */
    default ResponseEntity<AccountsResponse> getAccounts( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         AccountsRequest  getAccountsRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"accounts\" : [ {    \"accountType\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"psuRelations\" : [ {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    }, {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    } ],    \"accountTypeName\" : \"accountTypeName\",    \"accountNumber\" : \"accountNumber\"  }, {    \"accountType\" : {      \"code\" : \"code\",      \"description\" : \"description\"    },    \"psuRelations\" : [ {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    }, {      \"stake\" : 8,      \"typeOfRelation\" : \"Owner\",      \"typeOfProxy\" : \"General\"    } ],    \"accountTypeName\" : \"accountTypeName\",    \"accountNumber\" : \"accountNumber\"  } ]}", AccountsResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getHolds
     */
    default ResponseEntity<HoldInfoResponse> getHolds( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         HoldRequest  getHoldsRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"holds\" : [ \"\", \"\" ]}", HoldInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionDetail
     */
    default ResponseEntity<TransactionDetailResponse> getTransactionDetail( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionDetailRequest  getTransationDetailRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"baseInfo\" : \"\",  \"cardInfo\" : {    \"cardHolder\" : \"cardHolder\",    \"cardNumber\" : \"cardNumber\"  },  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"splitPayment\" : false,  \"baseCurrency\" : \"baseCurrency\",  \"usedPaymentInstrumentId\" : \"usedPaymentInstrumentId\",  \"holdExpirationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"zusInfo\" : {    \"contributionType\" : \"contributionType\",    \"contributionId\" : \"contributionId\",    \"paymentTypeId\" : \"paymentTypeId\",    \"payerInfo\" : {      \"nip\" : \"nip\",      \"additionalPayorId\" : \"additionalPayorId\",      \"additionalPayorIdType\" : \"P\"    },    \"contributionPeriod\" : \"contributionPeriod\",    \"obligationId\" : \"obligationId\"  },  \"usInfo\" : {    \"periodId\" : \"periodId\",    \"periodType\" : \"periodType\",    \"payerInfo\" : {      \"payorId\" : \"payorId\",      \"payorIdType\" : \"N\"    },    \"formCode\" : \"formCode\",    \"year\" : 6026,    \"obligationId\" : \"obligationId\"  },  \"tppTransactionId\" : \"tppTransactionId\",  \"transactionRate\" : [ {    \"rate\" : 0.8008281904610115,    \"toCurrency\" : \"toCurrency\",    \"fromCurrency\" : \"fromCurrency\"  }, {    \"rate\" : 0.8008281904610115,    \"toCurrency\" : \"toCurrency\",    \"fromCurrency\" : \"fromCurrency\"  } ],  \"transactionInfoSp\" : {    \"spTaxAmount\" : \"spTaxAmount\",    \"spDescription\" : \"spDescription\",    \"spInvoiceNumber\" : \"spInvoiceNumber\",    \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"  },  \"currencyDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"rejectionReason\" : \"rejectionReason\",  \"amountBaseCurrency\" : \"amountBaseCurrency\",  \"tppName\" : \"tppName\"}", TransactionDetailResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionsCancelled
     */
    default ResponseEntity<TransactionsCancelledInfoResponse> getTransactionsCancelled( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionInfoRequest  getTransactionsCancelledRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"transactions\" : [ \"\", \"\" ]}", TransactionsCancelledInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionsDone
     */
    default ResponseEntity<TransactionsDoneInfoResponse> getTransactionsDone( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionInfoRequest  getTransactionsDoneRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"transactions\" : [ \"\", \"\" ]}", TransactionsDoneInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionsPending
     */
    default ResponseEntity<TransactionPendingInfoResponse> getTransactionsPending( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionInfoRequest  getTransactionsPendingRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"transactions\" : [ \"\", \"\" ]}", TransactionPendingInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionsRejected
     */
    default ResponseEntity<TransactionRejectedInfoResponse> getTransactionsRejected( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionInfoRequest  getTransactionsRejectedRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"transactions\" : [ \"\", \"\" ]}", TransactionRejectedInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AisApi#getTransactionsScheduled
     */
    default ResponseEntity<TransactionsScheduledInfoResponse> getTransactionsScheduled( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TransactionInfoRequest  getTransactionsScheduledRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"pageInfo\" : {    \"previousPage\" : \"previousPage\",    \"nextPage\" : \"nextPage\"  },  \"transactions\" : [ \"\", \"\" ]}", TransactionsScheduledInfoResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
