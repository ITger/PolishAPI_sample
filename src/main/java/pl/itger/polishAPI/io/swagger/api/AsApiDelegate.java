package pl.itger.polishAPI.io.swagger.api;

import pl.itger.polishAPI.io.swagger.model.AuthorizeRequest;
import pl.itger.polishAPI.io.swagger.model.AuthorizeResponse;
import pl.itger.polishAPI.io.swagger.model.EatCodeRequest;
import pl.itger.polishAPI.io.swagger.model.Error;
import pl.itger.polishAPI.io.swagger.model.RegisterRequest;
import pl.itger.polishAPI.io.swagger.model.RegisterResponse;
import pl.itger.polishAPI.io.swagger.model.TokenRequest;
import pl.itger.polishAPI.io.swagger.model.TokenResponse;
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
 * A delegate to be called by the {@link AsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public interface AsApiDelegate {

    Logger log = LoggerFactory.getLogger(AsApi.class);

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
     * @see AsApi#authorize
     */
    default ResponseEntity<AuthorizeResponse> authorize( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         AuthorizeRequest  authorizeRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"aspspRedirectUri\" : \"aspspRedirectUri\"}", AuthorizeResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AsApi#authorizeExt
     */
    default ResponseEntity<Void> authorizeExt( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         EatCodeRequest  eatCodeRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AsApi#register
     */
    default ResponseEntity<RegisterResponse> register( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_REQUEST_ID,
         RegisterRequest  registerRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"jwks\" : {    \"keys\" : [ {      \"kty\" : \"kty\",      \"use\" : \"use\",      \"x5c\" : [ \"x5c\", \"x5c\" ],      \"kid\" : \"kid\"    }, {      \"kty\" : \"kty\",      \"use\" : \"use\",      \"x5c\" : [ \"x5c\", \"x5c\" ],      \"kid\" : \"kid\"    } ]  },  \"api_key\" : \"api_key\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"jwks_uri\" : \"jwks_uri\",  \"client_secret\" : \"client_secret\",  \"client_id\" : \"client_id\"}", RegisterResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see AsApi#token
     */
    default ResponseEntity<TokenResponse> token( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         TokenRequest  tokenRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"access_token\" : \"access_token\",  \"refresh_token\" : \"refresh_token\",  \"scope_details\" : {    \"consentId\" : \"consentId\",    \"scopeTimeLimit\" : \"2000-01-23T04:56:07.000+00:00\",    \"throttlingPolicy\" : \"psd2Regulatory\",    \"privilegeList\" : [ {      \"pis:bundle\" : {        \"typeOfTransfers\" : \"domestic\",        \"scopeUsageLimit\" : \"single\",        \"taxTransfers\" : [ {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"hold\" : true        }, {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"hold\" : true        } ],        \"domesticTransfers\" : [ {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        }, {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        } ],        \"EEATransfers\" : [ {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"hold\" : true        }, {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"hold\" : true        } ],        \"transfersTotalAmount\" : \"transfersTotalAmount\",        \"nonEEATransfers\" : [ {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        }, {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        } ]      },      \"ais:getAccount\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:cancelPayment\" : {        \"paymentId\" : \"paymentId\",        \"scopeUsageLimit\" : \"single\",        \"bundleId\" : \"bundleId\"      },      \"ais:getTransactionsPending\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"pis:getRecurringPayment\" : {        \"tppRecurringPaymentId\" : \"tppRecurringPaymentId\",        \"recurringPaymentId\" : \"recurringPaymentId\",        \"scopeUsageLimit\" : \"single\"      },      \"ais:getTransactionsDone\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais:getTransactionDetail\" : {        \"scopeUsageLimit\" : \"single\"      },      \"ais:getHolds\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais:getTransactionsCancelled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"accountNumber\" : { },      \"pis:domestic\" : {        \"transferData\" : \"\",        \"system\" : \"Elixir\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"executionMode\" : \"Immediate\",        \"splitPayment\" : false,        \"transactionInfoSp\" : {          \"spTaxAmount\" : \"spTaxAmount\",          \"spDescription\" : \"spDescription\",          \"spInvoiceNumber\" : \"spInvoiceNumber\",          \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"        },        \"hold\" : true      },      \"ais:getTransactionsScheduled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"pis:nonEEA\" : {        \"transferData\" : \"\",        \"transferCharges\" : \"transferCharges\",        \"system\" : \"Swift\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : \"\",        \"executionMode\" : \"Immediate\",        \"recipientBank\" : {          \"code\" : \"code\",          \"address\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          },          \"bicOrSwift\" : \"bicOrSwift\",          \"countryCode\" : \"countryCode\",          \"name\" : \"name\"        },        \"hold\" : true      },      \"pis:recurring\" : {        \"recurrence\" : {          \"endDate\" : \"2000-01-23\",          \"startDate\" : \"2000-01-23\",          \"frequency\" : {            \"periodType\" : \"day\",            \"periodValue\" : 1          },          \"dayOffOffsetType\" : \"before\"        },        \"nonEEAPayment\" : {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        },        \"domesticPayment\" : {          \"transferData\" : \"\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        },        \"scopeUsageLimit\" : \"single\",        \"EEAPayment\" : {          \"transferData\" : \"\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"hold\" : true        },        \"taxPayment\" : {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"hold\" : true        },        \"typeOfPayment\" : \"domestic\"      },      \"pis:EEA\" : {        \"transferData\" : \"\",        \"system\" : \"SEPA\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : \"\",        \"executionMode\" : \"Immediate\",        \"hold\" : true      },      \"ais:getTransactionsRejected\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais-accounts:getAccounts\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:tax\" : {        \"transferData\" : \"\",        \"usInfo\" : {          \"periodId\" : \"periodId\",          \"periodType\" : \"periodType\",          \"payerInfo\" : {            \"payorId\" : \"payorId\",            \"payorIdType\" : \"N\"          },          \"formCode\" : \"formCode\",          \"year\" : 6026,          \"obligationId\" : \"obligationId\"        },        \"system\" : \"Elixir\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"executionMode\" : \"Immediate\",        \"hold\" : true      },      \"pis:getPayment\" : {        \"tppTransactionId\" : \"tppTransactionId\",        \"paymentId\" : \"paymentId\",        \"scopeUsageLimit\" : \"single\"      },      \"pis:getBundle\" : {        \"tppBundleId\" : \"tppBundleId\",        \"scopeUsageLimit\" : \"single\",        \"bundleId\" : \"bundleId\"      },      \"pis:cancelRecurringPayment\" : {        \"recurringPaymentId\" : \"recurringPaymentId\",        \"scopeUsageLimit\" : \"single\"      }    }, {      \"pis:bundle\" : {        \"typeOfTransfers\" : \"domestic\",        \"scopeUsageLimit\" : \"single\",        \"taxTransfers\" : [ {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"hold\" : true        }, {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"hold\" : true        } ],        \"domesticTransfers\" : [ {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        }, {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"executionMode\" : \"Immediate\",          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        } ],        \"EEATransfers\" : [ {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"hold\" : true        }, {          \"transferData\" : \"\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"hold\" : true        } ],        \"transfersTotalAmount\" : \"transfersTotalAmount\",        \"nonEEATransfers\" : [ {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        }, {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"tppTransactionId\" : \"tppTransactionId\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"executionMode\" : \"Immediate\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        } ]      },      \"ais:getAccount\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:cancelPayment\" : {        \"paymentId\" : \"paymentId\",        \"scopeUsageLimit\" : \"single\",        \"bundleId\" : \"bundleId\"      },      \"ais:getTransactionsPending\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"pis:getRecurringPayment\" : {        \"tppRecurringPaymentId\" : \"tppRecurringPaymentId\",        \"recurringPaymentId\" : \"recurringPaymentId\",        \"scopeUsageLimit\" : \"single\"      },      \"ais:getTransactionsDone\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais:getTransactionDetail\" : {        \"scopeUsageLimit\" : \"single\"      },      \"ais:getHolds\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais:getTransactionsCancelled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"accountNumber\" : { },      \"pis:domestic\" : {        \"transferData\" : \"\",        \"system\" : \"Elixir\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"executionMode\" : \"Immediate\",        \"splitPayment\" : false,        \"transactionInfoSp\" : {          \"spTaxAmount\" : \"spTaxAmount\",          \"spDescription\" : \"spDescription\",          \"spInvoiceNumber\" : \"spInvoiceNumber\",          \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"        },        \"hold\" : true      },      \"ais:getTransactionsScheduled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"pis:nonEEA\" : {        \"transferData\" : \"\",        \"transferCharges\" : \"transferCharges\",        \"system\" : \"Swift\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : \"\",        \"executionMode\" : \"Immediate\",        \"recipientBank\" : {          \"code\" : \"code\",          \"address\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          },          \"bicOrSwift\" : \"bicOrSwift\",          \"countryCode\" : \"countryCode\",          \"name\" : \"name\"        },        \"hold\" : true      },      \"pis:recurring\" : {        \"recurrence\" : {          \"endDate\" : \"2000-01-23\",          \"startDate\" : \"2000-01-23\",          \"frequency\" : {            \"periodType\" : \"day\",            \"periodValue\" : 1          },          \"dayOffOffsetType\" : \"before\"        },        \"nonEEAPayment\" : {          \"transferData\" : \"\",          \"transferCharges\" : \"transferCharges\",          \"system\" : \"Swift\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"recipientBank\" : {            \"code\" : \"code\",            \"address\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            },            \"bicOrSwift\" : \"bicOrSwift\",            \"countryCode\" : \"countryCode\",            \"name\" : \"name\"          },          \"hold\" : true        },        \"domesticPayment\" : {          \"transferData\" : \"\",          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"splitPayment\" : false,          \"transactionInfoSp\" : {            \"spTaxAmount\" : \"spTaxAmount\",            \"spDescription\" : \"spDescription\",            \"spInvoiceNumber\" : \"spInvoiceNumber\",            \"spTaxIdentificationNumber\" : \"spTaxIdentificationNumber\"          },          \"hold\" : true        },        \"scopeUsageLimit\" : \"single\",        \"EEAPayment\" : {          \"transferData\" : \"\",          \"system\" : \"SEPA\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : \"\",          \"hold\" : true        },        \"taxPayment\" : {          \"transferData\" : \"\",          \"usInfo\" : {            \"periodId\" : \"periodId\",            \"periodType\" : \"periodType\",            \"payerInfo\" : {              \"payorId\" : \"payorId\",              \"payorIdType\" : \"N\"            },            \"formCode\" : \"formCode\",            \"year\" : 6026,            \"obligationId\" : \"obligationId\"          },          \"system\" : \"Elixir\",          \"sender\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"deliveryMode\" : \"ExpressD0\",          \"recipient\" : {            \"nameAddress\" : {              \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]            }          },          \"hold\" : true        },        \"typeOfPayment\" : \"domestic\"      },      \"pis:EEA\" : {        \"transferData\" : \"\",        \"system\" : \"SEPA\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : \"\",        \"executionMode\" : \"Immediate\",        \"hold\" : true      },      \"ais:getTransactionsRejected\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 117      },      \"ais-accounts:getAccounts\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:tax\" : {        \"transferData\" : \"\",        \"usInfo\" : {          \"periodId\" : \"periodId\",          \"periodType\" : \"periodType\",          \"payerInfo\" : {            \"payorId\" : \"payorId\",            \"payorIdType\" : \"N\"          },          \"formCode\" : \"formCode\",          \"year\" : 6026,          \"obligationId\" : \"obligationId\"        },        \"system\" : \"Elixir\",        \"sender\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"deliveryMode\" : \"ExpressD0\",        \"scopeUsageLimit\" : \"single\",        \"recipient\" : {          \"nameAddress\" : {            \"value\" : [ \"value\", \"value\", \"value\", \"value\" ]          }        },        \"executionMode\" : \"Immediate\",        \"hold\" : true      },      \"pis:getPayment\" : {        \"tppTransactionId\" : \"tppTransactionId\",        \"paymentId\" : \"paymentId\",        \"scopeUsageLimit\" : \"single\"      },      \"pis:getBundle\" : {        \"tppBundleId\" : \"tppBundleId\",        \"scopeUsageLimit\" : \"single\",        \"bundleId\" : \"bundleId\"      },      \"pis:cancelRecurringPayment\" : {        \"recurringPaymentId\" : \"recurringPaymentId\",        \"scopeUsageLimit\" : \"single\"      }    } ]  },  \"scope\" : \"scope\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"token_type\" : \"token_type\",  \"expires_in\" : \"expires_in\"}", TokenResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
