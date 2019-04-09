package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentInfo;
import io.swagger.model.ResponseHeader;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi na żądanie odwołania przelewów. Zawiera dane przelewów, które nie mogły być odwołane. / Class describing payments that could not have been cancelled.
 */
@ApiModel(description = "Klasa odpowiedzi na żądanie odwołania przelewów. Zawiera dane przelewów, które nie mogły być odwołane. / Class describing payments that could not have been cancelled.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class CancelPaymentsResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("payments")
  @Valid
  private List<PaymentInfo> payments = null;

  public CancelPaymentsResponse responseHeader(ResponseHeader responseHeader) {
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

  public CancelPaymentsResponse payments(List<PaymentInfo> payments) {
    this.payments = payments;
    return this;
  }

  public CancelPaymentsResponse addPaymentsItem(PaymentInfo paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PaymentInfo> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentInfo> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelPaymentsResponse cancelPaymentsResponse = (CancelPaymentsResponse) o;
    return Objects.equals(this.responseHeader, cancelPaymentsResponse.responseHeader) &&
        Objects.equals(this.payments, cancelPaymentsResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelPaymentsResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

