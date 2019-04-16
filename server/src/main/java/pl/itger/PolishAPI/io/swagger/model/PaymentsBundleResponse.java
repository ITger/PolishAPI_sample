package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.PaymentInfo;
import pl.itger.PolishAPI.io.swagger.model.ResponseHeader;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi na żądanie inicjacji paczki przelewów. Zawiera dane o statusach poszczególnych przelewów oraz status paczki. / Class describing statuses of each payment inside the bundle and the bundle itself.
 */
@ApiModel(description = "Klasa odpowiedzi na żądanie inicjacji paczki przelewów. Zawiera dane o statusach poszczególnych przelewów oraz status paczki. / Class describing statuses of each payment inside the bundle and the bundle itself.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentsBundleResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("bundleId")
  private String bundleId = null;

  /**
   * Status paczki przelewów / Bundle of payments status
   */
  public enum BundleStatusEnum {
    INPROGRESS("inProgress"),
    
    CANCELLED("cancelled"),
    
    DONE("done"),
    
    PARTIALLYDONE("partiallyDone");

    private String value;

    BundleStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BundleStatusEnum fromValue(String text) {
      for (BundleStatusEnum b : BundleStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("bundleStatus")
  private BundleStatusEnum bundleStatus = null;

  @JsonProperty("bundleDetailedStatus")
  private String bundleDetailedStatus = null;

  @JsonProperty("payments")
  @Valid
  private List<PaymentInfo> payments = null;

  public PaymentsBundleResponse responseHeader(ResponseHeader responseHeader) {
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

  public PaymentsBundleResponse bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Identyfikator paczki przelewów / Bundle of payments identifier
   * @return bundleId
  **/
  @ApiModelProperty(value = "Identyfikator paczki przelewów / Bundle of payments identifier")

@Size(max=64) 
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public PaymentsBundleResponse bundleStatus(BundleStatusEnum bundleStatus) {
    this.bundleStatus = bundleStatus;
    return this;
  }

  /**
   * Status paczki przelewów / Bundle of payments status
   * @return bundleStatus
  **/
  @ApiModelProperty(value = "Status paczki przelewów / Bundle of payments status")


  public BundleStatusEnum getBundleStatus() {
    return bundleStatus;
  }

  public void setBundleStatus(BundleStatusEnum bundleStatus) {
    this.bundleStatus = bundleStatus;
  }

  public PaymentsBundleResponse bundleDetailedStatus(String bundleDetailedStatus) {
    this.bundleDetailedStatus = bundleDetailedStatus;
    return this;
  }

  /**
   * Szczegółowy status paczki przelewów / Bundle of payments detailed status
   * @return bundleDetailedStatus
  **/
  @ApiModelProperty(value = "Szczegółowy status paczki przelewów / Bundle of payments detailed status")


  public String getBundleDetailedStatus() {
    return bundleDetailedStatus;
  }

  public void setBundleDetailedStatus(String bundleDetailedStatus) {
    this.bundleDetailedStatus = bundleDetailedStatus;
  }

  public PaymentsBundleResponse payments(List<PaymentInfo> payments) {
    this.payments = payments;
    return this;
  }

  public PaymentsBundleResponse addPaymentsItem(PaymentInfo paymentsItem) {
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
    PaymentsBundleResponse paymentsBundleResponse = (PaymentsBundleResponse) o;
    return Objects.equals(this.responseHeader, paymentsBundleResponse.responseHeader) &&
        Objects.equals(this.bundleId, paymentsBundleResponse.bundleId) &&
        Objects.equals(this.bundleStatus, paymentsBundleResponse.bundleStatus) &&
        Objects.equals(this.bundleDetailedStatus, paymentsBundleResponse.bundleDetailedStatus) &&
        Objects.equals(this.payments, paymentsBundleResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, bundleId, bundleStatus, bundleDetailedStatus, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsBundleResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    bundleStatus: ").append(toIndentedString(bundleStatus)).append("\n");
    sb.append("    bundleDetailedStatus: ").append(toIndentedString(bundleDetailedStatus)).append("\n");
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

