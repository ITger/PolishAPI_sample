package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.ResponseHeader;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi na żądanie anulowania płatności cyklicznej / Cancel recurring payment response class
 */
@ApiModel(description = "Klasa odpowiedzi na żądanie anulowania płatności cyklicznej / Cancel recurring payment response class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class CancelRecurringPaymentResponse   {
  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId = null;

  @JsonProperty("tppRecurringPaymentId")
  private String tppRecurringPaymentId = null;

  /**
   * Status płatności cyklicznej / Recurring payment status
   */
  public enum RecurringPaymentStatusEnum {
    SUBMITTED("submitted"),
    
    INPROGRESS("inProgress"),
    
    CANCELLED("cancelled"),
    
    CLOSE("close");

    private String value;

    RecurringPaymentStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RecurringPaymentStatusEnum fromValue(String text) {
      for (RecurringPaymentStatusEnum b : RecurringPaymentStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("recurringPaymentStatus")
  private RecurringPaymentStatusEnum recurringPaymentStatus = null;

  @JsonProperty("recurringPaymentDetailedStatus")
  private String recurringPaymentDetailedStatus = null;

  public CancelRecurringPaymentResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public CancelRecurringPaymentResponse recurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP
   * @return recurringPaymentId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP")
  @NotNull

@Size(max=64) 
  public String getRecurringPaymentId() {
    return recurringPaymentId;
  }

  public void setRecurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }

  public CancelRecurringPaymentResponse tppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez TPP. / Recurring payment identifier set by TPP.
   * @return tppRecurringPaymentId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez TPP. / Recurring payment identifier set by TPP.")
  @NotNull

@Size(max=64) 
  public String getTppRecurringPaymentId() {
    return tppRecurringPaymentId;
  }

  public void setTppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
  }

  public CancelRecurringPaymentResponse recurringPaymentStatus(RecurringPaymentStatusEnum recurringPaymentStatus) {
    this.recurringPaymentStatus = recurringPaymentStatus;
    return this;
  }

  /**
   * Status płatności cyklicznej / Recurring payment status
   * @return recurringPaymentStatus
  **/
  @ApiModelProperty(value = "Status płatności cyklicznej / Recurring payment status")


  public RecurringPaymentStatusEnum getRecurringPaymentStatus() {
    return recurringPaymentStatus;
  }

  public void setRecurringPaymentStatus(RecurringPaymentStatusEnum recurringPaymentStatus) {
    this.recurringPaymentStatus = recurringPaymentStatus;
  }

  public CancelRecurringPaymentResponse recurringPaymentDetailedStatus(String recurringPaymentDetailedStatus) {
    this.recurringPaymentDetailedStatus = recurringPaymentDetailedStatus;
    return this;
  }

  /**
   * Szczegółowy status płatności cyklicznej / Recurring payment detailed status
   * @return recurringPaymentDetailedStatus
  **/
  @ApiModelProperty(value = "Szczegółowy status płatności cyklicznej / Recurring payment detailed status")


  public String getRecurringPaymentDetailedStatus() {
    return recurringPaymentDetailedStatus;
  }

  public void setRecurringPaymentDetailedStatus(String recurringPaymentDetailedStatus) {
    this.recurringPaymentDetailedStatus = recurringPaymentDetailedStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRecurringPaymentResponse cancelRecurringPaymentResponse = (CancelRecurringPaymentResponse) o;
    return Objects.equals(this.responseHeader, cancelRecurringPaymentResponse.responseHeader) &&
        Objects.equals(this.recurringPaymentId, cancelRecurringPaymentResponse.recurringPaymentId) &&
        Objects.equals(this.tppRecurringPaymentId, cancelRecurringPaymentResponse.tppRecurringPaymentId) &&
        Objects.equals(this.recurringPaymentStatus, cancelRecurringPaymentResponse.recurringPaymentStatus) &&
        Objects.equals(this.recurringPaymentDetailedStatus, cancelRecurringPaymentResponse.recurringPaymentDetailedStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, recurringPaymentId, tppRecurringPaymentId, recurringPaymentStatus, recurringPaymentDetailedStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRecurringPaymentResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    tppRecurringPaymentId: ").append(toIndentedString(tppRecurringPaymentId)).append("\n");
    sb.append("    recurringPaymentStatus: ").append(toIndentedString(recurringPaymentStatus)).append("\n");
    sb.append("    recurringPaymentDetailedStatus: ").append(toIndentedString(recurringPaymentDetailedStatus)).append("\n");
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

