package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.RecipientPIS;
import pl.itger.polishAPI.io.swagger.model.SenderPIS;
import pl.itger.polishAPI.io.swagger.model.TransactionInfoSp;
import pl.itger.polishAPI.io.swagger.model.TransferData;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia do inicjacji przelewu zwykłego / The list of attributes of the domestic transfer request initiation privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do inicjacji przelewu zwykłego / The list of attributes of the domestic transfer request initiation privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class PrivilegeDomesticTransfer  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Rodzaj limitu zgody / Type of limit of usages
   */
  public enum ScopeUsageLimitEnum {
    SINGLE("single"),
    
    MULTIPLE("multiple");

    private String value;

    ScopeUsageLimitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeUsageLimitEnum fromValue(String text) {
      for (ScopeUsageLimitEnum b : ScopeUsageLimitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("scopeUsageLimit")
  private ScopeUsageLimitEnum scopeUsageLimit = null;

  @JsonProperty("recipient")
  private RecipientPIS recipient = null;

  @JsonProperty("sender")
  private SenderPIS sender = null;

  @JsonProperty("transferData")
  private TransferData transferData = null;

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

  public PrivilegeDomesticTransfer scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
    this.scopeUsageLimit = scopeUsageLimit;
    return this;
  }

  /**
   * Rodzaj limitu zgody / Type of limit of usages
   * @return scopeUsageLimit
  **/
  @ApiModelProperty(value = "Rodzaj limitu zgody / Type of limit of usages")


  public ScopeUsageLimitEnum getScopeUsageLimit() {
    return scopeUsageLimit;
  }

  public void setScopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
    this.scopeUsageLimit = scopeUsageLimit;
  }

  public PrivilegeDomesticTransfer recipient(RecipientPIS recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecipientPIS getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPIS recipient) {
    this.recipient = recipient;
  }

  public PrivilegeDomesticTransfer sender(SenderPIS sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SenderPIS getSender() {
    return sender;
  }

  public void setSender(SenderPIS sender) {
    this.sender = sender;
  }

  public PrivilegeDomesticTransfer transferData(TransferData transferData) {
    this.transferData = transferData;
    return this;
  }

  /**
   * Get transferData
   * @return transferData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransferData getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferData transferData) {
    this.transferData = transferData;
  }

  public PrivilegeDomesticTransfer deliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
    return this;
  }

  /**
   * Tryb pilności / Urgency mode
   * @return deliveryMode
  **/
  @ApiModelProperty(value = "Tryb pilności / Urgency mode")


  public DeliveryModeEnum getDeliveryMode() {
    return deliveryMode;
  }

  public void setDeliveryMode(DeliveryModeEnum deliveryMode) {
    this.deliveryMode = deliveryMode;
  }

  public PrivilegeDomesticTransfer system(SystemEnum system) {
    this.system = system;
    return this;
  }

  /**
   * Droga jaką przelew ma być rozliczony / The way the transfer should be settled
   * @return system
  **/
  @ApiModelProperty(value = "Droga jaką przelew ma być rozliczony / The way the transfer should be settled")


  public SystemEnum getSystem() {
    return system;
  }

  public void setSystem(SystemEnum system) {
    this.system = system;
  }

  public PrivilegeDomesticTransfer hold(Boolean hold) {
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

  public PrivilegeDomesticTransfer executionMode(ExecutionModeEnum executionMode) {
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

  public PrivilegeDomesticTransfer splitPayment(Boolean splitPayment) {
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

  public PrivilegeDomesticTransfer transactionInfoSp(TransactionInfoSp transactionInfoSp) {
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
    PrivilegeDomesticTransfer privilegeDomesticTransfer = (PrivilegeDomesticTransfer) o;
    return Objects.equals(this.scopeUsageLimit, privilegeDomesticTransfer.scopeUsageLimit) &&
        Objects.equals(this.recipient, privilegeDomesticTransfer.recipient) &&
        Objects.equals(this.sender, privilegeDomesticTransfer.sender) &&
        Objects.equals(this.transferData, privilegeDomesticTransfer.transferData) &&
        Objects.equals(this.deliveryMode, privilegeDomesticTransfer.deliveryMode) &&
        Objects.equals(this.system, privilegeDomesticTransfer.system) &&
        Objects.equals(this.hold, privilegeDomesticTransfer.hold) &&
        Objects.equals(this.executionMode, privilegeDomesticTransfer.executionMode) &&
        Objects.equals(this.splitPayment, privilegeDomesticTransfer.splitPayment) &&
        Objects.equals(this.transactionInfoSp, privilegeDomesticTransfer.transactionInfoSp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, recipient, sender, transferData, deliveryMode, system, hold, executionMode, splitPayment, transactionInfoSp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeDomesticTransfer {\n");
    
    sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
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

