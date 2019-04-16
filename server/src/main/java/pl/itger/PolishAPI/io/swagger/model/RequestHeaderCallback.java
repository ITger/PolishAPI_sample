package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RequestHeaderWithoutToken;
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

public class RequestHeaderCallback  implements Serializable {
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

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("callbackURL")
  private String callbackURL = null;

  @JsonProperty("apiKey")
  private String apiKey = null;

  public RequestHeaderCallback requestId(UUID requestId) {
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

  public RequestHeaderCallback userAgent(String userAgent) {
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

  public RequestHeaderCallback ipAddress(String ipAddress) {
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

  public RequestHeaderCallback sendDate(OffsetDateTime sendDate) {
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

  public RequestHeaderCallback tppId(String tppId) {
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

  public RequestHeaderCallback token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Token autoryzacyjny / Authorization token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "Token autoryzacyjny / Authorization token")
  @NotNull


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public RequestHeaderCallback callbackURL(String callbackURL) {
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

  public RequestHeaderCallback apiKey(String apiKey) {
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
    RequestHeaderCallback requestHeaderCallback = (RequestHeaderCallback) o;
    return Objects.equals(this.requestId, requestHeaderCallback.requestId) &&
        Objects.equals(this.userAgent, requestHeaderCallback.userAgent) &&
        Objects.equals(this.ipAddress, requestHeaderCallback.ipAddress) &&
        Objects.equals(this.sendDate, requestHeaderCallback.sendDate) &&
        Objects.equals(this.tppId, requestHeaderCallback.tppId) &&
        Objects.equals(this.token, requestHeaderCallback.token) &&
        Objects.equals(this.callbackURL, requestHeaderCallback.callbackURL) &&
        Objects.equals(this.apiKey, requestHeaderCallback.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, userAgent, ipAddress, sendDate, tppId, token, callbackURL, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderCallback {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    tppId: ").append(toIndentedString(tppId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

