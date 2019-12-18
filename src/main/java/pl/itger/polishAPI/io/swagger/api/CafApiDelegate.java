package pl.itger.polishAPI.io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pl.itger.polishAPI.io.swagger.model.ConfirmationOfFundsRequest;
import pl.itger.polishAPI.io.swagger.model.ConfirmationOfFundsResponse;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CafApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public interface CafApiDelegate {

    Logger log = LoggerFactory.getLogger(CafApi.class);

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
     * @see CafApi#getConfirmationOfFunds
     */
    default ResponseEntity<ConfirmationOfFundsResponse> getConfirmationOfFunds(String acceptEncoding,
                                                                               String acceptLanguage,
                                                                               String acceptCharset,
                                                                               String X_JWS_SIGNATURE,
                                                                               String X_REQUEST_ID,
                                                                               ConfirmationOfFundsRequest confirmationOfFundsRequest) {
        if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"fundsAvailable\" : true,  \"responseHeader\" : {    \"sendDate\" : \"2000-01-23T04:56:07.000+00:00\",    \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",    \"isCallback\" : true  }}", ConfirmationOfFundsResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default CafApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
