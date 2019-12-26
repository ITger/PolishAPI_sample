package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.RequestHeaderToken;
import pl.itger.polishAPI.io.swagger.model.ScopeDetailsInput;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o uzyskanie tokena dostępowego zgodnego z OAuth2 / Request class for an access token compatible with OAuth2
 */
@ApiModel(description = "Klasa zapytania o uzyskanie tokena dostępowego zgodnego z OAuth2 / Request class for an access token compatible with OAuth2")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class TokenRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderToken requestHeader = null;

  @JsonProperty("grant_type")
  private String grantType = null;

  @JsonProperty("Code")
  private String code = null;

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  @JsonProperty("exchange_token")
  private String exchangeToken = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("scope_details")
  private ScopeDetailsInput scopeDetails = null;

  @JsonProperty("is_user_session")
  private Boolean isUserSession = null;

  @JsonProperty("user_ip")
  private String userIp = null;

  @JsonProperty("user_agent")
  private String userAgent = null;

  public TokenRequest requestHeader(RequestHeaderToken requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RequestHeaderToken getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderToken requestHeader) {
    this.requestHeader = requestHeader;
  }

  public TokenRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Typ zastosowanej autoryzacji. Jedna z wartości: authorization_code, refresh_token, exchange_token (rozszerzenie standardu OAuth2) / Type of authorization used. One of the following values: authorization_code, refresh_token, exchange_token (extension of OAuth2 standard)
   * @return grantType
  **/
  @ApiModelProperty(required = true, value = "Typ zastosowanej autoryzacji. Jedna z wartości: authorization_code, refresh_token, exchange_token (rozszerzenie standardu OAuth2) / Type of authorization used. One of the following values: authorization_code, refresh_token, exchange_token (extension of OAuth2 standard)")
  @NotNull


  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public TokenRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Kod autoryzacji uzyskany podczas żądania do usługi /authorize OAuth2. Wymagany dla grant_type=authorization_code. / An authorization code obtained when requesting the /authorize OAuth2 service. Required for grant_type=authorization_code.
   * @return code
  **/
  @ApiModelProperty(value = "Kod autoryzacji uzyskany podczas żądania do usługi /authorize OAuth2. Wymagany dla grant_type=authorization_code. / An authorization code obtained when requesting the /authorize OAuth2 service. Required for grant_type=authorization_code.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TokenRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Adres usługi TPP, na które zostanie wykonane przekierowanie po wygenerowaniu tokena dostępowego przez ASPSP. Wymagany dla grant_type=authorization_code. / The address of the TPP service to which the redirection will be performed after the ASPSP generates the access token. Required for grant_type=authorization_code.
   * @return redirectUri
  **/
  @ApiModelProperty(value = "Adres usługi TPP, na które zostanie wykonane przekierowanie po wygenerowaniu tokena dostępowego przez ASPSP. Wymagany dla grant_type=authorization_code. / The address of the TPP service to which the redirection will be performed after the ASPSP generates the access token. Required for grant_type=authorization_code.")


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public TokenRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Identyfikator TPP. Wymagany dla grant_type=authorization_code. / TPP ID. Required for grant_type=authorization_code.
   * @return clientId
  **/
  @ApiModelProperty(value = "Identyfikator TPP. Wymagany dla grant_type=authorization_code. / TPP ID. Required for grant_type=authorization_code.")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public TokenRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Wartość tokena, który służy do uzyskania nowego tokena dostępowego dla tego samego zakresu zgód (scope, scope_details) - w przypadku gdy pierwotny token utraci swoją ważność, lub dla zawężonego zakresu zgód. Wymagany dla grant_type=refresh_token. / Value of the token used to obtain a new access token for the same scope of consents (scope, scope_details) - in case the original token expires or for a narrower scope of consents. Required for grant_type=refresh_token.
   * @return refreshToken
  **/
  @ApiModelProperty(value = "Wartość tokena, który służy do uzyskania nowego tokena dostępowego dla tego samego zakresu zgód (scope, scope_details) - w przypadku gdy pierwotny token utraci swoją ważność, lub dla zawężonego zakresu zgód. Wymagany dla grant_type=refresh_token. / Value of the token used to obtain a new access token for the same scope of consents (scope, scope_details) - in case the original token expires or for a narrower scope of consents. Required for grant_type=refresh_token.")


  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public TokenRequest exchangeToken(String exchangeToken) {
    this.exchangeToken = exchangeToken;
    return this;
  }

  /**
   * Wartość tokena, który służy do uzyskania nowego tokena dostępowego dla innego zakresu zgód (scope, scope_details). Wartością tego parametru powinien być token dostępowy ważnej sesji komuikacyjnej z interfejsem XS2A. Wymagany dla grant_type=exchange_token. / Value of the token, which is used to obtain a new access token for a different scope of consents (scope, scope_details). The value of this parameter should be the access token of a valid communication session with the XS2A interface. Required for grant_type=exchange_token.
   * @return exchangeToken
  **/
  @ApiModelProperty(value = "Wartość tokena, który służy do uzyskania nowego tokena dostępowego dla innego zakresu zgód (scope, scope_details). Wartością tego parametru powinien być token dostępowy ważnej sesji komuikacyjnej z interfejsem XS2A. Wymagany dla grant_type=exchange_token. / Value of the token, which is used to obtain a new access token for a different scope of consents (scope, scope_details). The value of this parameter should be the access token of a valid communication session with the XS2A interface. Required for grant_type=exchange_token.")


  public String getExchangeToken() {
    return exchangeToken;
  }

  public void setExchangeToken(String exchangeToken) {
    this.exchangeToken = exchangeToken;
  }

  public TokenRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Typ zgody, o którą prosi TPP. Wybrana wartość z listy dostępnych identyfikatorów zgód, opisanych w specyfikacji standardu Polish API. Wymagany dla grant_type=exchange_token. / Type of consent requested by the TPP. The value selected from the list of available consent identifiers, described in the Polish API specification. Required for grant_type=exchange_token.
   * @return scope
  **/
  @ApiModelProperty(value = "Typ zgody, o którą prosi TPP. Wybrana wartość z listy dostępnych identyfikatorów zgód, opisanych w specyfikacji standardu Polish API. Wymagany dla grant_type=exchange_token. / Type of consent requested by the TPP. The value selected from the list of available consent identifiers, described in the Polish API specification. Required for grant_type=exchange_token.")


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public TokenRequest scopeDetails(ScopeDetailsInput scopeDetails) {
    this.scopeDetails = scopeDetails;
    return this;
  }

  /**
   * Get scopeDetails
   * @return scopeDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ScopeDetailsInput getScopeDetails() {
    return scopeDetails;
  }

  public void setScopeDetails(ScopeDetailsInput scopeDetails) {
    this.scopeDetails = scopeDetails;
  }

  public TokenRequest isUserSession(Boolean isUserSession) {
    this.isUserSession = isUserSession;
    return this;
  }

  /**
   * Określa czy dana sesja jest związana z interakcją z PSU – wartości true/false. Rozszerzenie standardu OAuth2. / Defines whether the session is related to the PSU interaction - true/false values. Extension of the OAuth2 standard.
   * @return isUserSession
  **/
  @ApiModelProperty(value = "Określa czy dana sesja jest związana z interakcją z PSU – wartości true/false. Rozszerzenie standardu OAuth2. / Defines whether the session is related to the PSU interaction - true/false values. Extension of the OAuth2 standard.")


  public Boolean isIsUserSession() {
    return isUserSession;
  }

  public void setIsUserSession(Boolean isUserSession) {
    this.isUserSession = isUserSession;
  }

  public TokenRequest userIp(String userIp) {
    this.userIp = userIp;
    return this;
  }

  /**
   * IP przeglądarki użytkownika (informacja na potrzeby fraud detection). Rozszerzenie standardu OAuth2. Wymagany dla is_user_session = true. / User's browser IP (information for fraud detection). Extension of the OAuth2 standard. Required for is_user_session = true.
   * @return userIp
  **/
  @ApiModelProperty(value = "IP przeglądarki użytkownika (informacja na potrzeby fraud detection). Rozszerzenie standardu OAuth2. Wymagany dla is_user_session = true. / User's browser IP (information for fraud detection). Extension of the OAuth2 standard. Required for is_user_session = true.")


  public String getUserIp() {
    return userIp;
  }

  public void setUserIp(String userIp) {
    this.userIp = userIp;
  }

  public TokenRequest userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Informacja dotycząca wersji przeglądarki użytkownika (informacja na potrzeby fraud detection). Rozszerzenie standardu OAuth2. Wymagany dla is_user_session = true. / Information about the version of the user's browser (information for fraud detection). Extension of the OAuth2 standard. Required for is_user_session = true.
   * @return userAgent
  **/
  @ApiModelProperty(value = "Informacja dotycząca wersji przeglądarki użytkownika (informacja na potrzeby fraud detection). Rozszerzenie standardu OAuth2. Wymagany dla is_user_session = true. / Information about the version of the user's browser (information for fraud detection). Extension of the OAuth2 standard. Required for is_user_session = true.")


  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenRequest tokenRequest = (TokenRequest) o;
    return Objects.equals(this.requestHeader, tokenRequest.requestHeader) &&
        Objects.equals(this.grantType, tokenRequest.grantType) &&
        Objects.equals(this.code, tokenRequest.code) &&
        Objects.equals(this.redirectUri, tokenRequest.redirectUri) &&
        Objects.equals(this.clientId, tokenRequest.clientId) &&
        Objects.equals(this.refreshToken, tokenRequest.refreshToken) &&
        Objects.equals(this.exchangeToken, tokenRequest.exchangeToken) &&
        Objects.equals(this.scope, tokenRequest.scope) &&
        Objects.equals(this.scopeDetails, tokenRequest.scopeDetails) &&
        Objects.equals(this.isUserSession, tokenRequest.isUserSession) &&
        Objects.equals(this.userIp, tokenRequest.userIp) &&
        Objects.equals(this.userAgent, tokenRequest.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, grantType, code, redirectUri, clientId, refreshToken, exchangeToken, scope, scopeDetails, isUserSession, userIp, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    exchangeToken: ").append(toIndentedString(exchangeToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeDetails: ").append(toIndentedString(scopeDetails)).append("\n");
    sb.append("    isUserSession: ").append(toIndentedString(isUserSession)).append("\n");
    sb.append("    userIp: ").append(toIndentedString(userIp)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

