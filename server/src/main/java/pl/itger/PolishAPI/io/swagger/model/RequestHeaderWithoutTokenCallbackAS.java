package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RequestHeaderWithoutTokenAS;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca informacje o PSU and callback URL / PSU and callback URL Information Class
 */
@ApiModel(description = "Klasa zawierająca informacje o PSU and callback URL / PSU and callback URL Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RequestHeaderWithoutTokenCallbackAS  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestId")
  private UUID requestId = null;

  @JsonProperty("userAgent")
  private String userAgent = null;

  @JsonProperty("ipAddress")
  private String ipAddress = null;

  @JsonProperty("sendDate")
  private OffsetDateTime sendDate = null;

  @JsonProperty("tppId")
  private String tppId = null;

  @JsonProperty("isCompanyContext")
  private Boolean isCompanyContext = null;

  @JsonProperty("psuIdentifierType")
  private String psuIdentifierType = null;

  @JsonProperty("psuIdentifierValue")
  private String psuIdentifierValue = null;

  @JsonProperty("psuContextIdentifierType")
  private String psuContextIdentifierType = null;

  @JsonProperty("psuContextIdentifierValue")
  private String psuContextIdentifierValue = null;

  @JsonProperty("callbackURL")
  private String callbackURL = null;

  @JsonProperty("apiKey")
  private String apiKey = null;

  public RequestHeaderWithoutTokenCallbackAS requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1) zgodnym ze standardem RFC 4122 / Request ID using UUID format (Variant 1, Version 1) described in RFC 4122 standard
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1) zgodnym ze standardem RFC 4122 / Request ID using UUID format (Variant 1, Version 1) described in RFC 4122 standard")
  @NotNull

  @Valid

  public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public RequestHeaderWithoutTokenCallbackAS userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * Browser agent dla PSU / PSU browser agent
   * @return userAgent
  **/
  @ApiModelProperty(value = "Browser agent dla PSU / PSU browser agent")


  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public RequestHeaderWithoutTokenCallbackAS ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * Adres IP końcowego urządzenia PSU. Wymagany dla isDirectPsu=true. / IP address of PSU's terminal device. Required when isDirectPsu=true.
   * @return ipAddress
  **/
  @ApiModelProperty(value = "Adres IP końcowego urządzenia PSU. Wymagany dla isDirectPsu=true. / IP address of PSU's terminal device. Required when isDirectPsu=true.")


  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public RequestHeaderWithoutTokenCallbackAS sendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
    return this;
  }

  /**
   * Oryginalna data wysłania, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date
   * @return sendDate
  **/
  @ApiModelProperty(value = "Oryginalna data wysłania, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date")

  @Valid

  public OffsetDateTime getSendDate() {
    return sendDate;
  }

  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }

  public RequestHeaderWithoutTokenCallbackAS tppId(String tppId) {
    this.tppId = tppId;
    return this;
  }

  /**
   * Identyfikator TPP / TPP ID
   * @return tppId
  **/
  @ApiModelProperty(value = "Identyfikator TPP / TPP ID")


  public String getTppId() {
    return tppId;
  }

  public void setTppId(String tppId) {
    this.tppId = tppId;
  }

  public RequestHeaderWithoutTokenCallbackAS isCompanyContext(Boolean isCompanyContext) {
    this.isCompanyContext = isCompanyContext;
    return this;
  }

  /**
   * (true / false) Znacznik oznaczający czy żądanie jest wysyłane w kontekście PSU korporacyjnego
   * @return isCompanyContext
  **/
  @ApiModelProperty(value = "(true / false) Znacznik oznaczający czy żądanie jest wysyłane w kontekście PSU korporacyjnego")


  public Boolean isIsCompanyContext() {
    return isCompanyContext;
  }

  public void setIsCompanyContext(Boolean isCompanyContext) {
    this.isCompanyContext = isCompanyContext;
  }

  public RequestHeaderWithoutTokenCallbackAS psuIdentifierType(String psuIdentifierType) {
    this.psuIdentifierType = psuIdentifierType;
    return this;
  }

  /**
   * Typ identyfikatora PSU, służy do wskazania przez TPP na podstawie jakiej informacji zostanie zidentyfikowany PSU, który będzie podlegał uwierzytelnieniu. Wartość słownikowa. / PSU identifier type, used by TPP to indicate type of information based on which the PSU is to be authenticated. Dictionary value.
   * @return psuIdentifierType
  **/
  @ApiModelProperty(value = "Typ identyfikatora PSU, służy do wskazania przez TPP na podstawie jakiej informacji zostanie zidentyfikowany PSU, który będzie podlegał uwierzytelnieniu. Wartość słownikowa. / PSU identifier type, used by TPP to indicate type of information based on which the PSU is to be authenticated. Dictionary value.")


  public String getPsuIdentifierType() {
    return psuIdentifierType;
  }

  public void setPsuIdentifierType(String psuIdentifierType) {
    this.psuIdentifierType = psuIdentifierType;
  }

  public RequestHeaderWithoutTokenCallbackAS psuIdentifierValue(String psuIdentifierValue) {
    this.psuIdentifierValue = psuIdentifierValue;
    return this;
  }

  /**
   * Wartość identyfikatora PSU. Wymagany warunkowo - w przypadku gdy została przekazana niepusta wartość typu identyfikatora PSU. / The value of the PSU's identifier. Required conditionally - in case non empty value of PSU identifier type was passed.
   * @return psuIdentifierValue
  **/
  @ApiModelProperty(value = "Wartość identyfikatora PSU. Wymagany warunkowo - w przypadku gdy została przekazana niepusta wartość typu identyfikatora PSU. / The value of the PSU's identifier. Required conditionally - in case non empty value of PSU identifier type was passed.")


  public String getPsuIdentifierValue() {
    return psuIdentifierValue;
  }

  public void setPsuIdentifierValue(String psuIdentifierValue) {
    this.psuIdentifierValue = psuIdentifierValue;
  }

  public RequestHeaderWithoutTokenCallbackAS psuContextIdentifierType(String psuContextIdentifierType) {
    this.psuContextIdentifierType = psuContextIdentifierType;
    return this;
  }

  /**
   * Typ identyfikatora kontekstu w jakim występuje PSU. Wartość słownikowa. Wymagany warunkowo - w przypadku wysyłania żądania dla takiego PSU, który może występować w więcej niż jednym kontekście w wybranym ASPSP. / Identifier of context that is used by PSU. Dictionary value. Required conditionally - in case context of the request is used and PSU may use more then one context for the ASPSP.
   * @return psuContextIdentifierType
  **/
  @ApiModelProperty(value = "Typ identyfikatora kontekstu w jakim występuje PSU. Wartość słownikowa. Wymagany warunkowo - w przypadku wysyłania żądania dla takiego PSU, który może występować w więcej niż jednym kontekście w wybranym ASPSP. / Identifier of context that is used by PSU. Dictionary value. Required conditionally - in case context of the request is used and PSU may use more then one context for the ASPSP.")


  public String getPsuContextIdentifierType() {
    return psuContextIdentifierType;
  }

  public void setPsuContextIdentifierType(String psuContextIdentifierType) {
    this.psuContextIdentifierType = psuContextIdentifierType;
  }

  public RequestHeaderWithoutTokenCallbackAS psuContextIdentifierValue(String psuContextIdentifierValue) {
    this.psuContextIdentifierValue = psuContextIdentifierValue;
    return this;
  }

  /**
   * Wartość identyfikatora kontekstu w jakim występuje PSU. Wymagany warunkowo - w przypadku wysyłania żądania dla takiego PSU, który może występować w więcej niż jednym kontekście w wybranym ASPSP. / The value of context that is used by PSU. Required conditionally - in case context of the request is used and PSU may use more then one context for the ASPSP.
   * @return psuContextIdentifierValue
  **/
  @ApiModelProperty(value = "Wartość identyfikatora kontekstu w jakim występuje PSU. Wymagany warunkowo - w przypadku wysyłania żądania dla takiego PSU, który może występować w więcej niż jednym kontekście w wybranym ASPSP. / The value of context that is used by PSU. Required conditionally - in case context of the request is used and PSU may use more then one context for the ASPSP.")


  public String getPsuContextIdentifierValue() {
    return psuContextIdentifierValue;
  }

  public void setPsuContextIdentifierValue(String psuContextIdentifierValue) {
    this.psuContextIdentifierValue = psuContextIdentifierValue;
  }

  public RequestHeaderWithoutTokenCallbackAS callbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
    return this;
  }

  /**
   * adres funkcji zwrotnej / callback URL
   * @return callbackURL
  **/
  @ApiModelProperty(value = "adres funkcji zwrotnej / callback URL")


  public String getCallbackURL() {
    return callbackURL;
  }

  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  public RequestHeaderWithoutTokenCallbackAS apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * API key dla wywołania funkcji zwrotnej / callback API key
   * @return apiKey
  **/
  @ApiModelProperty(value = "API key dla wywołania funkcji zwrotnej / callback API key")


  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeaderWithoutTokenCallbackAS requestHeaderWithoutTokenCallbackAS = (RequestHeaderWithoutTokenCallbackAS) o;
    return Objects.equals(this.requestId, requestHeaderWithoutTokenCallbackAS.requestId) &&
        Objects.equals(this.userAgent, requestHeaderWithoutTokenCallbackAS.userAgent) &&
        Objects.equals(this.ipAddress, requestHeaderWithoutTokenCallbackAS.ipAddress) &&
        Objects.equals(this.sendDate, requestHeaderWithoutTokenCallbackAS.sendDate) &&
        Objects.equals(this.tppId, requestHeaderWithoutTokenCallbackAS.tppId) &&
        Objects.equals(this.isCompanyContext, requestHeaderWithoutTokenCallbackAS.isCompanyContext) &&
        Objects.equals(this.psuIdentifierType, requestHeaderWithoutTokenCallbackAS.psuIdentifierType) &&
        Objects.equals(this.psuIdentifierValue, requestHeaderWithoutTokenCallbackAS.psuIdentifierValue) &&
        Objects.equals(this.psuContextIdentifierType, requestHeaderWithoutTokenCallbackAS.psuContextIdentifierType) &&
        Objects.equals(this.psuContextIdentifierValue, requestHeaderWithoutTokenCallbackAS.psuContextIdentifierValue) &&
        Objects.equals(this.callbackURL, requestHeaderWithoutTokenCallbackAS.callbackURL) &&
        Objects.equals(this.apiKey, requestHeaderWithoutTokenCallbackAS.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, userAgent, ipAddress, sendDate, tppId, isCompanyContext, psuIdentifierType, psuIdentifierValue, psuContextIdentifierType, psuContextIdentifierValue, callbackURL, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderWithoutTokenCallbackAS {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    tppId: ").append(toIndentedString(tppId)).append("\n");
    sb.append("    isCompanyContext: ").append(toIndentedString(isCompanyContext)).append("\n");
    sb.append("    psuIdentifierType: ").append(toIndentedString(psuIdentifierType)).append("\n");
    sb.append("    psuIdentifierValue: ").append(toIndentedString(psuIdentifierValue)).append("\n");
    sb.append("    psuContextIdentifierType: ").append(toIndentedString(psuContextIdentifierType)).append("\n");
    sb.append("    psuContextIdentifierValue: ").append(toIndentedString(psuContextIdentifierValue)).append("\n");
    sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

