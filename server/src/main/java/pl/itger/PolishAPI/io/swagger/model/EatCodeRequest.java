package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DictionaryItem;
import io.swagger.model.RequestHeaderWithoutTokenCallbackAS;
import io.swagger.model.ScopeDetailsInput;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o uzyskanie kodu autoryzacyjnego zgodnego z OAuth2 na podstawie przekazanego kodu jednorazowego, wygenerowanego w EAT
 */
@ApiModel(description = "Klasa zapytania o uzyskanie kodu autoryzacyjnego zgodnego z OAuth2 na podstawie przekazanego kodu jednorazowego, wygenerowanego w EAT")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class EatCodeRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderWithoutTokenCallbackAS requestHeader = null;

  @JsonProperty("response_type")
  private String responseType = null;

  @JsonProperty("eatCode")
  private String eatCode = null;

  @JsonProperty("eatType")
  private DictionaryItem eatType = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("scope_details")
  private ScopeDetailsInput scopeDetails = null;

  @JsonProperty("state")
  private String state = null;

  public EatCodeRequest requestHeader(RequestHeaderWithoutTokenCallbackAS requestHeader) {
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

  public RequestHeaderWithoutTokenCallbackAS getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderWithoutTokenCallbackAS requestHeader) {
    this.requestHeader = requestHeader;
  }

  public EatCodeRequest responseType(String responseType) {
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

  public EatCodeRequest eatCode(String eatCode) {
    this.eatCode = eatCode;
    return this;
  }

  /**
   * Jednorazowy kod autoryzacyjny wygenerowany przez EAT
   * @return eatCode
  **/
  @ApiModelProperty(required = true, value = "Jednorazowy kod autoryzacyjny wygenerowany przez EAT")
  @NotNull


  public String getEatCode() {
    return eatCode;
  }

  public void setEatCode(String eatCode) {
    this.eatCode = eatCode;
  }

  public EatCodeRequest eatType(DictionaryItem eatType) {
    this.eatType = eatType;
    return this;
  }

  /**
   * Get eatType
   * @return eatType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryItem getEatType() {
    return eatType;
  }

  public void setEatType(DictionaryItem eatType) {
    this.eatType = eatType;
  }

  public EatCodeRequest clientId(String clientId) {
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

  public EatCodeRequest scope(String scope) {
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

  public EatCodeRequest scopeDetails(ScopeDetailsInput scopeDetails) {
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

  public EatCodeRequest state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Losowa, unikalna w ramach TPP wartość – zabezpieczenie przed atakiem Cross-Site Request Forgery
   * @return state
  **/
  @ApiModelProperty(value = "Losowa, unikalna w ramach TPP wartość – zabezpieczenie przed atakiem Cross-Site Request Forgery")


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
    EatCodeRequest eatCodeRequest = (EatCodeRequest) o;
    return Objects.equals(this.requestHeader, eatCodeRequest.requestHeader) &&
        Objects.equals(this.responseType, eatCodeRequest.responseType) &&
        Objects.equals(this.eatCode, eatCodeRequest.eatCode) &&
        Objects.equals(this.eatType, eatCodeRequest.eatType) &&
        Objects.equals(this.clientId, eatCodeRequest.clientId) &&
        Objects.equals(this.scope, eatCodeRequest.scope) &&
        Objects.equals(this.scopeDetails, eatCodeRequest.scopeDetails) &&
        Objects.equals(this.state, eatCodeRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, responseType, eatCode, eatType, clientId, scope, scopeDetails, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EatCodeRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    eatCode: ").append(toIndentedString(eatCode)).append("\n");
    sb.append("    eatType: ").append(toIndentedString(eatType)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

