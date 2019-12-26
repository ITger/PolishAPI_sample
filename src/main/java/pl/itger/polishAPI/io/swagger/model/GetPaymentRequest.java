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
 * Klasa zapytania o status płatności / Payment Request Class
 */
@ApiModel(description = "Klasa zapytania o status płatności / Payment Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class GetPaymentRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeader requestHeader = null;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("tppTransactionId")
  private String tppTransactionId = null;

  public GetPaymentRequest requestHeader(RequestHeader requestHeader) {
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

  public GetPaymentRequest paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.
   * @return paymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.")

@Size(max=128) 
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public GetPaymentRequest tppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
    return this;
  }

  /**
   * Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.
   * @return tppTransactionId
  **/
  @ApiModelProperty(value = "Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.")

@Size(max=128) 
  public String getTppTransactionId() {
    return tppTransactionId;
  }

  public void setTppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPaymentRequest getPaymentRequest = (GetPaymentRequest) o;
    return Objects.equals(this.requestHeader, getPaymentRequest.requestHeader) &&
        Objects.equals(this.paymentId, getPaymentRequest.paymentId) &&
        Objects.equals(this.tppTransactionId, getPaymentRequest.tppTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, paymentId, tppTransactionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPaymentRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
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

