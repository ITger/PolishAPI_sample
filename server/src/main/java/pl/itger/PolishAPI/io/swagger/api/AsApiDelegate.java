package pl.itger.PolishAPI.io.swagger.api;

import pl.itger.PolishAPI.io.swagger.model.AuthorizeRequest;
import pl.itger.PolishAPI.io.swagger.model.AuthorizeResponse;
import pl.itger.PolishAPI.io.swagger.model.EatCodeRequest;
import pl.itger.PolishAPI.io.swagger.model.Error;
import pl.itger.PolishAPI.io.swagger.model.TokenRequest;
import pl.itger.PolishAPI.io.swagger.model.TokenResponse;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

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
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"access_token\" : \"access_token\",  \"refresh_token\" : \"refresh_token\",  \"scope_details\" : {    \"consentId\" : \"consentId\",    \"resource\" : {      \"accounts\" : [ \"accounts\", \"accounts\" ]    },    \"scopeTimeLimit\" : \"scopeTimeLimit\",    \"throttlingPolicy\" : \"psd2Regulatory\",    \"privilegeList\" : {      \"ais:getTransactionsDone\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais:getHolds\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais:getTransactionsRejected\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais:getTransactionsCancelled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais:getTransactionsScheduled\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais-accounts:getAccounts\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"pis:tax\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:getPayment\" : {        \"scopeUsageLimit\" : \"single\"      },      \"pis:domestic\" : {        \"scopeUsageLimit\" : \"single\"      },      \"ais:getTransactionDetail\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"ais:getTransactionsPending\" : {        \"scopeUsageLimit\" : \"single\",        \"maxAllowedHistoryLong\" : 880      },      \"pis:bundle\" : {        \"scopeUsageLimit\" : \"single\"      }    }  },  \"scope\" : \"scope\",  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  },  \"token_type\" : \"token_type\",  \"expires_in\" : \"expires_in\"}", TokenResponse.class), HttpStatus.NOT_IMPLEMENTED);
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
