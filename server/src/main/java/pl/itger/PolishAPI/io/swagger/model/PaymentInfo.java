package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.PaymentStatus;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa informacji o płatności / Payment Information Class
 */
@ApiModel(description = "Klasa informacji o płatności / Payment Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("tppTransactionId")
  private String tppTransactionId = null;

  @JsonProperty("generalStatus")
  private PaymentStatus generalStatus = null;

  @JsonProperty("detailedStatus")
  private String detailedStatus = null;

  /**
   * Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.
   */
  public enum ExecutionModeEnum {
    IMMEDIATE("Immediate"),
    
    FUTUREDATED("FutureDated");

    private String value;

    ExecutionModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExecutionModeEnum fromValue(String text) {
      for (ExecutionModeEnum b : ExecutionModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("executionMode")
  private ExecutionModeEnum executionMode = null;

  public PaymentInfo paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Identyfiaktor płatności / Payment ID
   * @return paymentId
  **/
  @ApiModelProperty(required = true, value = "Identyfiaktor płatności / Payment ID")
  @NotNull


  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentInfo tppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
    return this;
  }

  /**
   * ID transakcji nadany przez TPP / Transaction ID (TPP)
   * @return tppTransactionId
  **/
  @ApiModelProperty(required = true, value = "ID transakcji nadany przez TPP / Transaction ID (TPP)")
  @NotNull


  public String getTppTransactionId() {
    return tppTransactionId;
  }

  public void setTppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
  }

  public PaymentInfo generalStatus(PaymentStatus generalStatus) {
    this.generalStatus = generalStatus;
    return this;
  }

  /**
   * Get generalStatus
   * @return generalStatus
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PaymentStatus getGeneralStatus() {
    return generalStatus;
  }

  public void setGeneralStatus(PaymentStatus generalStatus) {
    this.generalStatus = generalStatus;
  }

  public PaymentInfo detailedStatus(String detailedStatus) {
    this.detailedStatus = detailedStatus;
    return this;
  }

  /**
   * Szczegółowy status płatności / Detailed payment status
   * @return detailedStatus
  **/
  @ApiModelProperty(required = true, value = "Szczegółowy status płatności / Detailed payment status")
  @NotNull


  public String getDetailedStatus() {
    return detailedStatus;
  }

  public void setDetailedStatus(String detailedStatus) {
    this.detailedStatus = detailedStatus;
  }

  public PaymentInfo executionMode(ExecutionModeEnum executionMode) {
    this.executionMode = executionMode;
    return this;
  }

  /**
   * Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.
   * @return executionMode
  **/
  @ApiModelProperty(required = true, value = "Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.")
  @NotNull


  public ExecutionModeEnum getExecutionMode() {
    return executionMode;
  }

  public void setExecutionMode(ExecutionModeEnum executionMode) {
    this.executionMode = executionMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInfo paymentInfo = (PaymentInfo) o;
    return Objects.equals(this.paymentId, paymentInfo.paymentId) &&
        Objects.equals(this.tppTransactionId, paymentInfo.tppTransactionId) &&
        Objects.equals(this.generalStatus, paymentInfo.generalStatus) &&
        Objects.equals(this.detailedStatus, paymentInfo.detailedStatus) &&
        Objects.equals(this.executionMode, paymentInfo.executionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, tppTransactionId, generalStatus, detailedStatus, executionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInfo {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
    sb.append("    generalStatus: ").append(toIndentedString(generalStatus)).append("\n");
    sb.append("    detailedStatus: ").append(toIndentedString(detailedStatus)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
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

