package pl.itger.PolishAPI.io.swagger.model;

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
 * Klasa zawierająca zwrotne metadane / Metadata Class
 */
@ApiModel(description = "Klasa zawierająca zwrotne metadane / Metadata Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class ResponseHeader  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestId")
  private UUID requestId = null;

  @JsonProperty("sendDate")
  private OffsetDateTime sendDate = null;

  @JsonProperty("isCallback")
  private Boolean isCallback = null;

  public ResponseHeader requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Identyfikator żądania otrzymanego od TPP / Identifier of request received from TPP
   * @return requestId
  **/
  @ApiModelProperty(value = "Identyfikator żądania otrzymanego od TPP / Identifier of request received from TPP")

  @Valid

  public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public ResponseHeader sendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
    return this;
  }

  /**
   * Data odpowiedzi, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date
   * @return sendDate
  **/
  @ApiModelProperty(value = "Data odpowiedzi, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date")

  @Valid

  public OffsetDateTime getSendDate() {
    return sendDate;
  }

  public void setSendDate(OffsetDateTime sendDate) {
    this.sendDate = sendDate;
  }

  public ResponseHeader isCallback(Boolean isCallback) {
    this.isCallback = isCallback;
    return this;
  }

  /**
   * Znacznik określający czy odpowiedz zostanie przekazana w formie wywołania zwrotnego. true - gdy odpowiedz w formie wywołania zwrotnego. Inna dopuszczalna wartość to false.
   * @return isCallback
  **/
  @ApiModelProperty(value = "Znacznik określający czy odpowiedz zostanie przekazana w formie wywołania zwrotnego. true - gdy odpowiedz w formie wywołania zwrotnego. Inna dopuszczalna wartość to false.")


  public Boolean isIsCallback() {
    return isCallback;
  }

  public void setIsCallback(Boolean isCallback) {
    this.isCallback = isCallback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseHeader responseHeader = (ResponseHeader) o;
    return Objects.equals(this.requestId, responseHeader.requestId) &&
        Objects.equals(this.sendDate, responseHeader.sendDate) &&
        Objects.equals(this.isCallback, responseHeader.isCallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, sendDate, isCallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseHeader {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    isCallback: ").append(toIndentedString(isCallback)).append("\n");
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

