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
 * Klasa odpowiedzi na pytanie o status paczki płatności / Response data with status of bundle of payments
 */
@ApiModel(description = "Klasa odpowiedzi na pytanie o status paczki płatności / Response data with status of bundle of payments")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class BundleResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("bundleId")
  private String bundleId = null;

  @JsonProperty("tppBundleId")
  private String tppBundleId = null;

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

  public BundleResponse responseHeader(ResponseHeader responseHeader) {
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

  public BundleResponse bundleId(String bundleId) {
    this.bundleId = bundleId;
    return this;
  }

  /**
   * Identyfikator paczki przelewów / Bundle of payments identifier
   * @return bundleId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator paczki przelewów / Bundle of payments identifier")
  @NotNull

@Size(max=64) 
  public String getBundleId() {
    return bundleId;
  }

  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }

  public BundleResponse tppBundleId(String tppBundleId) {
    this.tppBundleId = tppBundleId;
    return this;
  }

  /**
   * Identyfikator paczki przelewów nadany przez TPP. / Bundle of payments identifier set by TPP.
   * @return tppBundleId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator paczki przelewów nadany przez TPP. / Bundle of payments identifier set by TPP.")
  @NotNull

@Size(max=64) 
  public String getTppBundleId() {
    return tppBundleId;
  }

  public void setTppBundleId(String tppBundleId) {
    this.tppBundleId = tppBundleId;
  }

  public BundleResponse bundleStatus(BundleStatusEnum bundleStatus) {
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

  public BundleResponse bundleDetailedStatus(String bundleDetailedStatus) {
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

  public BundleResponse payments(List<PaymentInfo> payments) {
    this.payments = payments;
    return this;
  }

  public BundleResponse addPaymentsItem(PaymentInfo paymentsItem) {
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
    BundleResponse bundleResponse = (BundleResponse) o;
    return Objects.equals(this.responseHeader, bundleResponse.responseHeader) &&
        Objects.equals(this.bundleId, bundleResponse.bundleId) &&
        Objects.equals(this.tppBundleId, bundleResponse.tppBundleId) &&
        Objects.equals(this.bundleStatus, bundleResponse.bundleStatus) &&
        Objects.equals(this.bundleDetailedStatus, bundleResponse.bundleDetailedStatus) &&
        Objects.equals(this.payments, bundleResponse.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, bundleId, tppBundleId, bundleStatus, bundleDetailedStatus, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    tppBundleId: ").append(toIndentedString(tppBundleId)).append("\n");
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

