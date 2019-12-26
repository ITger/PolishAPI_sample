package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.RequestHeader;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o status płatności cyklicznej / Recurring payment status Request Class
 */
@ApiModel(description = "Klasa zapytania o status płatności cyklicznej / Recurring payment status Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class GetRecurringPaymentRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId = null;

  @JsonProperty("tppRecurringPaymentId")
  private String tppRecurringPaymentId = null;

  public GetRecurringPaymentRequest requestHeader(RequestHeader requestHeader) {
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

  public GetRecurringPaymentRequest recurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez ASPSP. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Recurring payment identifier set by ASPSP. Conditionally required - in case TPP has received this identifier from ASPSP.
   * @return recurringPaymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności cyklicznej nadany przez ASPSP. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Recurring payment identifier set by ASPSP. Conditionally required - in case TPP has received this identifier from ASPSP.")

@Size(max=128) 
  public String getRecurringPaymentId() {
    return recurringPaymentId;
  }

  public void setRecurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }

  public GetRecurringPaymentRequest tppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora recurringPaymentId od ASPSP. / Recurring payment identifier set by TPP. Conditionally required - in case TPP has not received recurringPaymentId from ASPSP.
   * @return tppRecurringPaymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności cyklicznej nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora recurringPaymentId od ASPSP. / Recurring payment identifier set by TPP. Conditionally required - in case TPP has not received recurringPaymentId from ASPSP.")

@Size(max=128) 
  public String getTppRecurringPaymentId() {
    return tppRecurringPaymentId;
  }

  public void setTppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringPaymentRequest getRecurringPaymentRequest = (GetRecurringPaymentRequest) o;
    return Objects.equals(this.requestHeader, getRecurringPaymentRequest.requestHeader) &&
        Objects.equals(this.recurringPaymentId, getRecurringPaymentRequest.recurringPaymentId) &&
        Objects.equals(this.tppRecurringPaymentId, getRecurringPaymentRequest.tppRecurringPaymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, recurringPaymentId, tppRecurringPaymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringPaymentRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    tppRecurringPaymentId: ").append(toIndentedString(tppRecurringPaymentId)).append("\n");
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

