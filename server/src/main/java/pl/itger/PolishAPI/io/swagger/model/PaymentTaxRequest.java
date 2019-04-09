package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecipientPISTax;
import io.swagger.model.RequestHeaderCallback;
import io.swagger.model.SenderPISDomestic;
import io.swagger.model.TransactionInfoTax;
import io.swagger.model.TransferDataCurrencyRequiredTax;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zlecenia przelewu podatkowego / Tax Transfer Request Class
 */
@ApiModel(description = "Klasa zlecenia przelewu podatkowego / Tax Transfer Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentTaxRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderCallback requestHeader = null;

  @JsonProperty("recipient")
  private RecipientPISTax recipient = null;

  @JsonProperty("sender")
  private SenderPISDomestic sender = null;

  @JsonProperty("transferData")
  private TransferDataCurrencyRequiredTax transferData = null;

  @JsonProperty("usInfo")
  private TransactionInfoTax usInfo = null;

  @JsonProperty("tppTransactionId")
  private String tppTransactionId = null;

  /**
   * Tryb pilności / Urgency mode
   */
  public enum DeliveryModeEnum {
    EXPRESSD0("ExpressD0"),
    
    STANDARDD1("StandardD1");

    private String value;

    DeliveryModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeliveryModeEnum fromValue(String text) {
      for (DeliveryModeEnum b : DeliveryModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deliveryMode")
  private DeliveryModeEnum deliveryMode = null;

  /**
   * Droga jaką przelew ma być rozliczony / The way the transfer should be settled
   */
  public enum SystemEnum {
    ELIXIR("Elixir"),
    
    EXPRESSELIXIR("ExpressElixir");

    private String value;

    SystemEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SystemEnum fromValue(String text) {
      for (SystemEnum b : SystemEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("system")
  private SystemEnum system = null;

  @JsonProperty("hold")
  private Boolean hold = null;

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

  public PaymentTaxRequest requestHeader(RequestHeaderCallback requestHeader) {
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

  public RequestHeaderCallback getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderCallback requestHeader) {
    this.requestHeader = requestHeader;
  }

  public PaymentTaxRequest recipient(RecipientPISTax recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RecipientPISTax getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPISTax recipient) {
    this.recipient = recipient;
  }

  public PaymentTaxRequest sender(SenderPISDomestic sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public SenderPISDomestic getSender() {
    return sender;
  }

  public void setSender(SenderPISDomestic sender) {
    this.sender = sender;
  }

  public PaymentTaxRequest transferData(TransferDataCurrencyRequiredTax transferData) {
    this.transferData = transferData;
    return this;
  }

  /**
   * Get transferData
   * @return transferData
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public TransferDataCurrencyRequiredTax getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferDataCurrencyRequiredTax transferData) {
    this.transferData = transferData;
  }

  public PaymentTaxRequest usInfo(TransactionInfoTax usInfo) {
    this.usInfo = usInfo;
    return this;
  }

  /**
   * Get usInfo
   * @return usInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionInfoTax getUsInfo() {
    return usInfo;
  }

  public void setUsInfo(TransactionInfoTax usInfo) {
    this.usInfo = usInfo;
  }

  public PaymentTaxRequest tppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
    return this;
  }

  /**
   * ID transakcji nadany przez TPP / Transaction ID (TPP)
   * @return tppTransactionId
  **/
  @ApiModelProperty(required = true, value = "ID transakcji nadany przez TPP / Transaction ID (TPP)")
  @NotNull

@Size(max=64) 
  public String getTppTransactionId() {
    return tppTransactionId;
  }

  public void setTppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
  }

  public PaymentTaxRequest deliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Tryb pilności / Urgency mode
   * @return deliveryMode
  **/
  @ApiModelProperty(required = true, value = "Tryb pilności / Urgency mode")
  @NotNull


  public DeliveryModeEnum getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public PaymentTaxRequest system(SystemEnum system) {
    this.system = system;
    return this;
  }

  /**
   * Droga jaką przelew ma być rozliczony / The way the transfer should be settled
   * @return system
  **/
  @ApiModelProperty(required = true, value = "Droga jaką przelew ma być rozliczony / The way the transfer should be settled")
  @NotNull


  public SystemEnum getSystem() {
    return system;
  }

  public void setSystem(SystemEnum system) {
    this.system = system;
  }

  public PaymentTaxRequest hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

  /**
   * Czy założyć blokadę (w przypadku np. zlecenia przelewu w dniu wolnym) / Indicates if payment should be holded
   * @return hold
  **/
  @ApiModelProperty(value = "Czy założyć blokadę (w przypadku np. zlecenia przelewu w dniu wolnym) / Indicates if payment should be holded")


  public Boolean isHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public PaymentTaxRequest executionMode(ExecutionModeEnum executionMode) {
    this.executionMode = executionMode;
    return this;
  }

  /**
   * Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.
   * @return executionMode
  **/
  @ApiModelProperty(value = "Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.")


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
    PaymentTaxRequest paymentTaxRequest = (PaymentTaxRequest) o;
    return Objects.equals(this.requestHeader, paymentTaxRequest.requestHeader) &&
        Objects.equals(this.recipient, paymentTaxRequest.recipient) &&
        Objects.equals(this.sender, paymentTaxRequest.sender) &&
        Objects.equals(this.transferData, paymentTaxRequest.transferData) &&
        Objects.equals(this.usInfo, paymentTaxRequest.usInfo) &&
        Objects.equals(this.tppTransactionId, paymentTaxRequest.tppTransactionId) &&
        Objects.equals(this.deliveryMode, paymentTaxRequest.deliveryMode) &&
        Objects.equals(this.system, paymentTaxRequest.system) &&
        Objects.equals(this.hold, paymentTaxRequest.hold) &&
        Objects.equals(this.executionMode, paymentTaxRequest.executionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, recipient, sender, transferData, usInfo, tppTransactionId, deliveryMode, system, hold, executionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTaxRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    usInfo: ").append(toIndentedString(usInfo)).append("\n");
    sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
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

