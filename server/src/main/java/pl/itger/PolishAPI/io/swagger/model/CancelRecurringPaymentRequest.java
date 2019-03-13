package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RequestHeader;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o anulowanie płatności cyklicznej. / Recurring payment cancelation request class.
 */
@ApiModel(description = "Klasa zapytania o anulowanie płatności cyklicznej. / Recurring payment cancelation request class.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class CancelRecurringPaymentRequest   {
  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId = null;

  public CancelRecurringPaymentRequest requestHeader(RequestHeader requestHeader) {
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

  public RequestHeader getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeader requestHeader) {
    this.requestHeader = requestHeader;
  }

  public CancelRecurringPaymentRequest recurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez ASPSP / Recurring payment identifier set by ASPSP
   * @return recurringPaymentId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez ASPSP / Recurring payment identifier set by ASPSP")
  @NotNull

@Size(max=64) 
  public String getRecurringPaymentId() {
    return recurringPaymentId;
  }

  public void setRecurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelRecurringPaymentRequest cancelRecurringPaymentRequest = (CancelRecurringPaymentRequest) o;
    return Objects.equals(this.requestHeader, cancelRecurringPaymentRequest.requestHeader) &&
        Objects.equals(this.recurringPaymentId, cancelRecurringPaymentRequest.recurringPaymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, recurringPaymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelRecurringPaymentRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
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

