package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RequestHeaderWithoutTokenAS;
import pl.itger.PolishAPI.io.swagger.model.ScopeDetailsInput;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o uzyskanie kodu autoryzacyjnego zgodnego z OAuth2
 */
@ApiModel(description = "Klasa zapytania o uzyskanie kodu autoryzacyjnego zgodnego z OAuth2")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class AuthorizeRequest   {
  @JsonProperty("requestHeader")
  private RequestHeaderWithoutTokenAS requestHeader = null;

  @JsonProperty("response_type")
  private String responseType = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("redirect_uri")
  private String redirectUri = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("scope_details")
  private ScopeDetailsInput scopeDetails = null;

  @JsonProperty("state")
  private String state = null;

  public AuthorizeRequest requestHeader(RequestHeaderWithoutTokenAS requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeaderWithoutTokenAS getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderWithoutTokenAS requestHeader) {
    this.requestHeader = requestHeader;
  }

  public AuthorizeRequest responseType(String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Typ odpowiedzi. Wartość stała: code
   * @return responseType
  **/
  @ApiModelProperty(required = true, value = "Typ odpowiedzi. Wartość stała: code")
  @NotNull


  public String getResponseType() {
    return responseType;
  }

  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }

  public AuthorizeRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Identyfikator TPP
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator TPP")
  @NotNull


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public AuthorizeRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Adres usługi TPP, na które zostanie wykonane przekierowanie po uwierzytelnieniu klienta ASPSP
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "Adres usługi TPP, na które zostanie wykonane przekierowanie po uwierzytelnieniu klienta ASPSP")
  @NotNull


  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public AuthorizeRequest scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Typ zgody, o którą prosi TPP. Wybrana wartość z listy dostępnych identyfikatorów zgód, opisanych w specyfikacji standardu Polish API.
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Typ zgody, o którą prosi TPP. Wybrana wartość z listy dostępnych identyfikatorów zgód, opisanych w specyfikacji standardu Polish API.")
  @NotNull


  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public AuthorizeRequest scopeDetails(ScopeDetailsInput scopeDetails) {
    this.scopeDetails = scopeDetails;
    return this;
  }

  /**
   * Get scopeDetails
   * @return scopeDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ScopeDetailsInput getScopeDetails() {
    return scopeDetails;
  }

  public void setScopeDetails(ScopeDetailsInput scopeDetails) {
    this.scopeDetails = scopeDetails;
  }

  public AuthorizeRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Losowa, unikalna w ramach TPP wartość – zabezpieczenie przed atakiem Cross-Site Request Forgery
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Losowa, unikalna w ramach TPP wartość – zabezpieczenie przed atakiem Cross-Site Request Forgery")
  @NotNull


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizeRequest authorizeRequest = (AuthorizeRequest) o;
    return Objects.equals(this.requestHeader, authorizeRequest.requestHeader) &&
        Objects.equals(this.responseType, authorizeRequest.responseType) &&
        Objects.equals(this.clientId, authorizeRequest.clientId) &&
        Objects.equals(this.redirectUri, authorizeRequest.redirectUri) &&
        Objects.equals(this.scope, authorizeRequest.scope) &&
        Objects.equals(this.scopeDetails, authorizeRequest.scopeDetails) &&
        Objects.equals(this.state, authorizeRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, responseType, clientId, redirectUri, scope, scopeDetails, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizeRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeDetails: ").append(toIndentedString(scopeDetails)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

