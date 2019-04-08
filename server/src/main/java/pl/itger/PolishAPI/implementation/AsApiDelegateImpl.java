/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.PolishAPI.implementation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.api.AsApiDelegate;
import static io.swagger.api.AsApiDelegate.log;
import io.swagger.model.AuthorizeRequest;
import io.swagger.model.AuthorizeResponse;
import io.swagger.model.EatCodeRequest;
import io.swagger.model.TokenRequest;
import io.swagger.model.TokenResponse;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class AsApiDelegateImpl
        implements AsApiDelegate {

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
public ResponseEntity<AuthorizeResponse> authorize(String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        AuthorizeRequest authorizeRequest) {
    return AsApiDelegate.super.authorize(acceptEncoding,
                                         acceptLanguage,
                                         acceptCharset,
                                         X_JWS_SIGNATURE,
                                         X_REQUEST_ID,
                                         authorizeRequest); //To change body of generated methods, choose Tools | Templates.
}

@Override
public ResponseEntity<Void> authorizeExt(String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        EatCodeRequest eatCodeRequest) {
    return AsApiDelegate.super.authorizeExt(acceptEncoding,
                                            acceptLanguage,
                                            acceptCharset,
                                            X_JWS_SIGNATURE,
                                            X_REQUEST_ID,
                                            eatCodeRequest); //To change body of generated methods, choose Tools | Templates.
}

@Override
public ResponseEntity<TokenResponse> token(String acceptEncoding,
        String acceptLanguage,
        String acceptCharset,
        String X_JWS_SIGNATURE,
        String X_REQUEST_ID,
        TokenRequest tokenRequest) {
    System.out.println(getObjectMapper().isPresent());
    System.out.println(getAcceptHeader().isPresent());
    if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        if (getAcceptHeader().get().contains("application/json")) {
            try {
                LocalDate now = LocalDate.now();
                Date expirationDate = DateUtils.addDays(new Date(),
                                                        10);
                long diff = java.time.temporal.ChronoUnit.MILLIS.between(now,
                                                                         (Temporal) expirationDate);
                String jwt = "Jwts.builder FAILED";
                jwt = Jwts.builder()
                        .setIssuer("http://itger.pl/")
                        .setSubject("users/Janusz i Grażyna")
                        .setAudience("something")
                        .setExpiration(expirationDate)
                        .claim("name",
                               "Janusz i Grażyna Nosacz")
                        .claim("scope",
                               "self groups/admins")
                        .signWith(
                                SignatureAlgorithm.HS256,
                                "secretPassword".getBytes("UTF-8")
                        )
                        .compact();
                TokenResponse tr = new TokenResponse();
                tr.setAccessToken(jwt);
                tr.setExpiresIn(Long.toString(diff));
                tr.setTokenType("Bearer");
                return new ResponseEntity<TokenResponse>(tr,
                                                         HttpStatus.OK);
            } catch (UnsupportedEncodingException ex) {
                log.error(
                        "Couldn't serialize response for content type application/json",
                        ex);
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    } else {
        log.warn(
                "ObjectMapper or HttpServletRequest not configured in default AsApi interface so no example is generated");
    }
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

}

}
