package pl.itger.PolishAPI.io.swagger.api;

import pl.itger.PolishAPI.io.swagger.model.AddPaymentResponse;
import pl.itger.PolishAPI.io.swagger.model.BundleRequest;
import pl.itger.PolishAPI.io.swagger.model.BundleResponse;
import pl.itger.PolishAPI.io.swagger.model.CancelPaymentsRequest;
import pl.itger.PolishAPI.io.swagger.model.CancelPaymentsResponse;
import pl.itger.PolishAPI.io.swagger.model.CancelRecurringPaymentRequest;
import pl.itger.PolishAPI.io.swagger.model.CancelRecurringPaymentResponse;
import pl.itger.PolishAPI.io.swagger.model.Error;
import pl.itger.PolishAPI.io.swagger.model.GetPaymentResponse;
import pl.itger.PolishAPI.io.swagger.model.PaymentDomesticRequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentEEARequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentNonEEARequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentRequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentTaxRequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentsBundleRequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentsBundleResponse;
import pl.itger.PolishAPI.io.swagger.model.PaymentsRequest;
import pl.itger.PolishAPI.io.swagger.model.PaymentsResponse;
import pl.itger.PolishAPI.io.swagger.model.RecurringPaymentRequest;
import pl.itger.PolishAPI.io.swagger.model.RecurringPaymentResponse;
import pl.itger.PolishAPI.io.swagger.model.RecurringPaymentStatusRequest;
import pl.itger.PolishAPI.io.swagger.model.RecurringPaymentStatusResponse;
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
 * A delegate to be called by the {@link PisApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public interface PisApiDelegate {

    Logger log = LoggerFactory.getLogger(PisApi.class);

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
     * @see PisApi#bundle
     */
    default ResponseEntity<PaymentsBundleResponse> bundle( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentsBundleRequest  bundleRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"payments\" : [ {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  }, {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  } ],  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"bundleId\" : \"bundleId\",  \"bundleDetailedStatus\" : \"bundleDetailedStatus\",  \"bundleStatus\" : \"inProgress\"}", PaymentsBundleResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#cancelPayments
     */
    default ResponseEntity<CancelPaymentsResponse> cancelPayments( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         CancelPaymentsRequest  paymentData) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"payments\" : [ {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  }, {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  } ],  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", CancelPaymentsResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#cancelRecurringPayment
     */
    default ResponseEntity<CancelRecurringPaymentResponse> cancelRecurringPayment( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         CancelRecurringPaymentRequest  recurringPaymentData) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"tppRecurringPaymentId\" : \"tppRecurringPaymentId\",  \"recurringPaymentId\" : \"recurringPaymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"recurringPaymentStatus\" : \"submitted\",  \"recurringPaymentDetailedStatus\" : \"recurringPaymentDetailedStatus\"}", CancelRecurringPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#domestic
     */
    default ResponseEntity<AddPaymentResponse> domestic( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentDomesticRequest  domesticRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"generalStatus\" : { },  \"detailedStatus\" : \"detailedStatus\",  \"paymentId\" : \"paymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", AddPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#eEA
     */
    default ResponseEntity<AddPaymentResponse> eEA( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentEEARequest  eeARequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"generalStatus\" : { },  \"detailedStatus\" : \"detailedStatus\",  \"paymentId\" : \"paymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", AddPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#getBundle
     */
    default ResponseEntity<BundleResponse> getBundle( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         BundleRequest  bundle) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"tppBundleId\" : \"tppBundleId\",  \"payments\" : [ {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  }, {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  } ],  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"bundleId\" : \"bundleId\",  \"bundleDetailedStatus\" : \"bundleDetailedStatus\",  \"bundleStatus\" : \"inProgress\"}", BundleResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#getMultiplePayments
     */
    default ResponseEntity<PaymentsResponse> getMultiplePayments( String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentsRequest  payments) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"payments\" : [ {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  }, {    \"generalStatus\" : { },    \"tppTransactionId\" : \"tppTransactionId\",    \"detailedStatus\" : \"detailedStatus\",    \"paymentId\" : \"paymentId\",    \"executionMode\" : \"Immediate\"  } ],  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", PaymentsResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#getPayment
     */
    default ResponseEntity<GetPaymentResponse> getPayment( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentRequest  payment) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", GetPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#getRecurringPayment
     */
    default ResponseEntity<RecurringPaymentStatusResponse> getRecurringPayment( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         RecurringPaymentStatusRequest  recurringPayment) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"tppRecurringPaymentId\" : \"tppRecurringPaymentId\",  \"recurringPaymentId\" : \"recurringPaymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"recurringPaymentStatus\" : \"submitted\",  \"recurringPaymentDetailedStatus\" : \"recurringPaymentDetailedStatus\"}", RecurringPaymentStatusResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#nonEEA
     */
    default ResponseEntity<AddPaymentResponse> nonEEA( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentNonEEARequest  nonEEARequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"generalStatus\" : { },  \"detailedStatus\" : \"detailedStatus\",  \"paymentId\" : \"paymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", AddPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#recurring
     */
    default ResponseEntity<RecurringPaymentResponse> recurring( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         RecurringPaymentRequest  recurringRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"recurrence\" : {    \"endDate\" : \"2000-01-23\",    \"startDate\" : \"2000-01-23\",    \"frequency\" : {      \"periodType\" : \"day\",      \"periodValue\" : 1    },    \"dayOffOffsetType\" : \"before\"  },  \"recurringPaymentId\" : \"recurringPaymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"recurringPaymentStatus\" : \"submitted\",  \"recurringPaymentDetailedStatus\" : \"recurringPaymentDetailedStatus\"}", RecurringPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see PisApi#tax
     */
    default ResponseEntity<AddPaymentResponse> tax( String  authorization,
         String  acceptEncoding,
         String  acceptLanguage,
         String  acceptCharset,
         String  X_JWS_SIGNATURE,
         String  X_REQUEST_ID,
         PaymentTaxRequest  taxRequest) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"generalStatus\" : { },  \"detailedStatus\" : \"detailedStatus\",  \"paymentId\" : \"paymentId\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", AddPaymentResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default PisApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
