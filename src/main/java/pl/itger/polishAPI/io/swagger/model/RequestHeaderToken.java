package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca informacje o PSU na potrzeby uzyskania tokena dostępowego / PSU Information Class dedicated for an access token
 */
@ApiModel(description = "Klasa zawierająca informacje o PSU na potrzeby uzyskania tokena dostępowego / PSU Information Class dedicated for an access token")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RequestHeaderToken  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestId")
  private UUID requestId = null;

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

  public RequestHeaderToken requestId(UUID requestId) {
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

  public RequestHeaderToken sendDate(OffsetDateTime sendDate) {
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

  public RequestHeaderToken tppId(String tppId) {
    this.tppId = tppId;
    return this;
  }

  /**
   * Identyfikator TPP / TPP ID
   * @return tppId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator TPP / TPP ID")
  @NotNull


  public String getTppId() {
    return tppId;
  }

  public void setTppId(String tppId) {
    this.tppId = tppId;
  }

  public RequestHeaderToken isCompanyContext(Boolean isCompanyContext) {
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

  public RequestHeaderToken psuIdentifierType(String psuIdentifierType) {
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

  public RequestHeaderToken psuIdentifierValue(String psuIdentifierValue) {
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

  public RequestHeaderToken psuContextIdentifierType(String psuContextIdentifierType) {
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

  public RequestHeaderToken psuContextIdentifierValue(String psuContextIdentifierValue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestHeaderToken requestHeaderToken = (RequestHeaderToken) o;
    return Objects.equals(this.requestId, requestHeaderToken.requestId) &&
        Objects.equals(this.sendDate, requestHeaderToken.sendDate) &&
        Objects.equals(this.tppId, requestHeaderToken.tppId) &&
        Objects.equals(this.isCompanyContext, requestHeaderToken.isCompanyContext) &&
        Objects.equals(this.psuIdentifierType, requestHeaderToken.psuIdentifierType) &&
        Objects.equals(this.psuIdentifierValue, requestHeaderToken.psuIdentifierValue) &&
        Objects.equals(this.psuContextIdentifierType, requestHeaderToken.psuContextIdentifierType) &&
        Objects.equals(this.psuContextIdentifierValue, requestHeaderToken.psuContextIdentifierValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, sendDate, tppId, isCompanyContext, psuIdentifierType, psuIdentifierValue, psuContextIdentifierType, psuContextIdentifierValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestHeaderToken {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    tppId: ").append(toIndentedString(tppId)).append("\n");
    sb.append("    isCompanyContext: ").append(toIndentedString(isCompanyContext)).append("\n");
    sb.append("    psuIdentifierType: ").append(toIndentedString(psuIdentifierType)).append("\n");
    sb.append("    psuIdentifierValue: ").append(toIndentedString(psuIdentifierValue)).append("\n");
    sb.append("    psuContextIdentifierType: ").append(toIndentedString(psuContextIdentifierType)).append("\n");
    sb.append("    psuContextIdentifierValue: ").append(toIndentedString(psuContextIdentifierValue)).append("\n");
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

