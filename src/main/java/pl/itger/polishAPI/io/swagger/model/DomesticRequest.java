package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.RecipientPIS;
import pl.itger.polishAPI.io.swagger.model.RequestHeaderCallback;
import pl.itger.polishAPI.io.swagger.model.SenderPIS;
import pl.itger.polishAPI.io.swagger.model.TransactionInfoSp;
import pl.itger.polishAPI.io.swagger.model.TransferData;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zlecenia przelewu krajowego / Domestic Transfer Request Class
 */
@ApiModel(description = "Klasa zlecenia przelewu krajowego / Domestic Transfer Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class DomesticRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderCallback requestHeader = null;

  @JsonProperty("recipient")
  private RecipientPIS recipient = null;

  @JsonProperty("sender")
  private SenderPIS sender = null;

  @JsonProperty("transferData")
  private TransferData transferData = null;

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
    
    EXPRESSELIXIR("ExpressElixir"),
    
    SORBNET("Sorbnet"),
    
    BLUECASH("BlueCash"),
    
    INTERNAL("Internal");

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

  @JsonProperty("splitPayment")
  private Boolean splitPayment = false;

  @JsonProperty("transactionInfoSp")
  private TransactionInfoSp transactionInfoSp = null;

  public DomesticRequest requestHeader(RequestHeaderCallback requestHeader) {
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

  public DomesticRequest recipient(RecipientPIS recipient) {
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

  public RecipientPIS getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPIS recipient) {
    this.recipient = recipient;
  }

  public DomesticRequest sender(SenderPIS sender) {
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

  public SenderPIS getSender() {
    return sender;
  }

  public void setSender(SenderPIS sender) {
    this.sender = sender;
  }

  public DomesticRequest transferData(TransferData transferData) {
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

  public TransferData getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferData transferData) {
    this.transferData = transferData;
  }

  public DomesticRequest tppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
    return this;
  }

  /**
   * ID transakcji nadany przez TPP / Transaction ID (TPP)
   * @return tppTransactionId
  **/
  @ApiModelProperty(required = true, value = "ID transakcji nadany przez TPP / Transaction ID (TPP)")
  @NotNull

@Size(max=128) 
  public String getTppTransactionId() {
    return tppTransactionId;
  }

  public void setTppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
  }

  public DomesticRequest deliveryMode(DeliveryModeEnum deliveryMode) {
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

  public DomesticRequest system(SystemEnum system) {
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

  public DomesticRequest hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

  /**
   * Czy założyć blokadę (w przypadku np. zlecenia przelewu w dniu wolnym) / Indicates if payment should be held
   * @return hold
  **/
  @ApiModelProperty(value = "Czy założyć blokadę (w przypadku np. zlecenia przelewu w dniu wolnym) / Indicates if payment should be held")


  public Boolean isHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public DomesticRequest executionMode(ExecutionModeEnum executionMode) {
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

  public DomesticRequest splitPayment(Boolean splitPayment) {
    this.splitPayment = splitPayment;
    return this;
  }

  /**
   * Czy płatność jest podzielona (true / false) / Indicates if payment is split (true / false)
   * @return splitPayment
  **/
  @ApiModelProperty(value = "Czy płatność jest podzielona (true / false) / Indicates if payment is split (true / false)")


  public Boolean isSplitPayment() {
    return splitPayment;
  }

  public void setSplitPayment(Boolean splitPayment) {
    this.splitPayment = splitPayment;
  }

  public DomesticRequest transactionInfoSp(TransactionInfoSp transactionInfoSp) {
    this.transactionInfoSp = transactionInfoSp;
    return this;
  }

  /**
   * Get transactionInfoSp
   * @return transactionInfoSp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransactionInfoSp getTransactionInfoSp() {
    return transactionInfoSp;
  }

  public void setTransactionInfoSp(TransactionInfoSp transactionInfoSp) {
    this.transactionInfoSp = transactionInfoSp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomesticRequest domesticRequest = (DomesticRequest) o;
    return Objects.equals(this.requestHeader, domesticRequest.requestHeader) &&
        Objects.equals(this.recipient, domesticRequest.recipient) &&
        Objects.equals(this.sender, domesticRequest.sender) &&
        Objects.equals(this.transferData, domesticRequest.transferData) &&
        Objects.equals(this.tppTransactionId, domesticRequest.tppTransactionId) &&
        Objects.equals(this.deliveryMode, domesticRequest.deliveryMode) &&
        Objects.equals(this.system, domesticRequest.system) &&
        Objects.equals(this.hold, domesticRequest.hold) &&
        Objects.equals(this.executionMode, domesticRequest.executionMode) &&
        Objects.equals(this.splitPayment, domesticRequest.splitPayment) &&
        Objects.equals(this.transactionInfoSp, domesticRequest.transactionInfoSp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, recipient, sender, transferData, tppTransactionId, deliveryMode, system, hold, executionMode, splitPayment, transactionInfoSp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomesticRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
    sb.append("    splitPayment: ").append(toIndentedString(splitPayment)).append("\n");
    sb.append("    transactionInfoSp: ").append(toIndentedString(transactionInfoSp)).append("\n");
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

