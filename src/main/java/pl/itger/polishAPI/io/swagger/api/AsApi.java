/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.3-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package pl.itger.polishAPI.io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.itger.polishAPI.io.swagger.model.Error;
import pl.itger.polishAPI.io.swagger.model.*;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

@Api(value = "As", description = "the As API")
public interface AsApi {

    AsApiDelegate getDelegate();

    @ApiOperation(value = "Requests OAuth2 authorization code", nickname = "authorize", notes = "Requests OAuth2 authorization code", response = AuthorizeResponse.class, tags = {"AS",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = AuthorizeResponse.class),
            @ApiResponse(code = 400, message = "Bad request", response = Error.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = Error.class),
            @ApiResponse(code = 406, message = "Not Acceptable", response = Error.class),
            @ApiResponse(code = 415, message = "Unsupported Media Type", response = Error.class),
            @ApiResponse(code = 422, message = "Unprocessable entity", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class),
            @ApiResponse(code = 501, message = "Not Implemented", response = Error.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = Error.class)})
    @RequestMapping(value = "/v2_1_2.1/auth/v2_1_2.1/authorize",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<AuthorizeResponse> authorize(@ApiParam(value = "Gzip, deflate", required = true, allowableValues = "gzip, deflate") @RequestHeader(value = "Accept-Encoding", required = true) String acceptEncoding, @ApiParam(value = "Prefered language of response", required = true) @RequestHeader(value = "Accept-Language", required = true) String acceptLanguage, @ApiParam(value = "UTF-8", required = true, allowableValues = "utf-8") @RequestHeader(value = "Accept-Charset", required = true) String acceptCharset, @ApiParam(value = "Detached JWS signature of the body of the payload", required = true) @RequestHeader(value = "X-JWS-SIGNATURE", required = true) String X_JWS_SIGNATURE, @ApiParam(value = "Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1), zgodnym ze standardem RFC 4122, nadawany przez TPP. Wartość musi być zgodna z parametrem requestId przekazywanym w ciele każdego żądania. / Request identifier using UUID format (Variant 1, Version 1), described in RFC 4122 standard, set by TPP. Value of this header must be the same as for the requestId param passed inside request payload.", required = true) @RequestHeader(value = "X-REQUEST-ID", required = true) String X_REQUEST_ID, @ApiParam(value = "Data for OAuth2 Authorization Code Request", required = true) @Valid @RequestBody AuthorizeRequest authorizeRequest) {
        return getDelegate().authorize(acceptEncoding, acceptLanguage, acceptCharset, X_JWS_SIGNATURE, X_REQUEST_ID, authorizeRequest);
    }


    @ApiOperation(value = "Requests OAuth2 authorization code based on One-time authorization code issued by External Authorization Tool", nickname = "authorizeExt", notes = "Requests OAuth2 authorization code based One-time authorization code issued by External Authorization Tool. Authorization code will be delivered to TPP as callback request from ASPSP if PSU authentication is confirmed by EAT. Callback function must provide similar notification also in case of unsuccessful authentication or its abandonment.", tags = {"AS",})
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successful TPP and EAT Code verification"),
            @ApiResponse(code = 400, message = "Bad request", response = Error.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = Error.class),
            @ApiResponse(code = 406, message = "Not Acceptable", response = Error.class),
            @ApiResponse(code = 415, message = "Unsupported Media Type", response = Error.class),
            @ApiResponse(code = 422, message = "Unprocessable entity", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class),
            @ApiResponse(code = 501, message = "Not Implemented", response = Error.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = Error.class)})
    @RequestMapping(value = "/v2_1_2.1/auth/v2_1_2.1/authorizeExt",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<Void> authorizeExt(@ApiParam(value = "Gzip, deflate", required = true, allowableValues = "gzip, deflate") @RequestHeader(value = "Accept-Encoding", required = true) String acceptEncoding, @ApiParam(value = "Prefered language of response", required = true) @RequestHeader(value = "Accept-Language", required = true) String acceptLanguage, @ApiParam(value = "UTF-8", required = true, allowableValues = "utf-8") @RequestHeader(value = "Accept-Charset", required = true) String acceptCharset, @ApiParam(value = "Detached JWS signature of the body of the payload", required = true) @RequestHeader(value = "X-JWS-SIGNATURE", required = true) String X_JWS_SIGNATURE, @ApiParam(value = "Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1), zgodnym ze standardem RFC 4122, nadawany przez TPP. Wartość musi być zgodna z parametrem requestId przekazywanym w ciele każdego żądania. / Request identifier using UUID format (Variant 1, Version 1), described in RFC 4122 standard, set by TPP. Value of this header must be the same as for the requestId param passed inside request payload.", required = true) @RequestHeader(value = "X-REQUEST-ID", required = true) String X_REQUEST_ID, @ApiParam(value = "Data for OAuth2 Authorization Code Request extended for EAT based authentication and callback response", required = true) @Valid @RequestBody EatCodeRequest eatCodeRequest) {
        return getDelegate().authorizeExt(acceptEncoding, acceptLanguage, acceptCharset, X_JWS_SIGNATURE, X_REQUEST_ID, eatCodeRequest);
    }


    @ApiOperation(value = "Requests OAuth2 access token value", nickname = "token", notes = "Requests OAuth2 access token value", response = TokenResponse.class, tags = {"AS",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TokenResponse.class),
            @ApiResponse(code = 400, message = "Bad request", response = Error.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
            @ApiResponse(code = 405, message = "Method Not Allowed", response = Error.class),
            @ApiResponse(code = 406, message = "Not Acceptable", response = Error.class),
            @ApiResponse(code = 415, message = "Unsupported Media Type", response = Error.class),
            @ApiResponse(code = 422, message = "Unprocessable entity", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class),
            @ApiResponse(code = 501, message = "Not Implemented", response = Error.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = Error.class)})
    @RequestMapping(value = "/v2_1_2.1/auth/v2_1_2.1/token",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    default ResponseEntity<TokenResponse> token(@ApiParam(value = "Gzip, deflate", required = true, allowableValues = "gzip, deflate") @RequestHeader(value = "Accept-Encoding", required = true) String acceptEncoding, @ApiParam(value = "Prefered language of response", required = true) @RequestHeader(value = "Accept-Language", required = true) String acceptLanguage, @ApiParam(value = "UTF-8", required = true, allowableValues = "utf-8") @RequestHeader(value = "Accept-Charset", required = true) String acceptCharset, @ApiParam(value = "Detached JWS signature of the body of the payload", required = true) @RequestHeader(value = "X-JWS-SIGNATURE", required = true) String X_JWS_SIGNATURE, @ApiParam(value = "Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1), zgodnym ze standardem RFC 4122, nadawany przez TPP. Wartość musi być zgodna z parametrem requestId przekazywanym w ciele każdego żądania. / Request identifier using UUID format (Variant 1, Version 1), described in RFC 4122 standard, set by TPP. Value of this header must be the same as for the requestId param passed inside request payload.", required = true) @RequestHeader(value = "X-REQUEST-ID", required = true) String X_REQUEST_ID, @ApiParam(value = "Data for OAuth2 Access Token Request", required = true) @Valid @RequestBody TokenRequest tokenRequest) {
        return getDelegate().token(acceptEncoding, acceptLanguage, acceptCharset, X_JWS_SIGNATURE, X_REQUEST_ID, tokenRequest);
    }

}