package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RecipientPISTax;
import pl.itger.PolishAPI.io.swagger.model.SenderPISDomestic;
import pl.itger.PolishAPI.io.swagger.model.TransactionInfoTax;
import pl.itger.PolishAPI.io.swagger.model.TransferDataCurrencyRequiredTax;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia do inicjacji przelewu urzędu podatkowego / The list of attributes of the tax transfer request initiation privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do inicjacji przelewu urzędu podatkowego / The list of attributes of the tax transfer request initiation privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeTaxTransfer  implements Serializable {
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
  private RecipientPISTax recipient = null;

  @JsonProperty("sender")
  private SenderPISDomestic sender = null;

  @JsonProperty("transferData")
  private TransferDataCurrencyRequiredTax transferData = null;

  @JsonProperty("usInfo")
  private TransactionInfoTax usInfo = null;

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

  public PrivilegeTaxTransfer scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

  public PrivilegeTaxTransfer recipient(RecipientPISTax recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecipientPISTax getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPISTax recipient) {
    this.recipient = recipient;
  }

  public PrivilegeTaxTransfer sender(SenderPISDomestic sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SenderPISDomestic getSender() {
    return sender;
  }

  public void setSender(SenderPISDomestic sender) {
    this.sender = sender;
  }

  public PrivilegeTaxTransfer transferData(TransferDataCurrencyRequiredTax transferData) {
    this.transferData = transferData;
    return this;
  }

  /**
   * Get transferData
   * @return transferData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransferDataCurrencyRequiredTax getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferDataCurrencyRequiredTax transferData) {
    this.transferData = transferData;
  }

  public PrivilegeTaxTransfer usInfo(TransactionInfoTax usInfo) {
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

  public PrivilegeTaxTransfer deliveryMode(DeliveryModeEnum deliveryMode) {
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

  public PrivilegeTaxTransfer system(SystemEnum system) {
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

  public PrivilegeTaxTransfer executionMode(ExecutionModeEnum executionMode) {
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
    PrivilegeTaxTransfer privilegeTaxTransfer = (PrivilegeTaxTransfer) o;
    return Objects.equals(this.scopeUsageLimit, privilegeTaxTransfer.scopeUsageLimit) &&
        Objects.equals(this.recipient, privilegeTaxTransfer.recipient) &&
        Objects.equals(this.sender, privilegeTaxTransfer.sender) &&
        Objects.equals(this.transferData, privilegeTaxTransfer.transferData) &&
        Objects.equals(this.usInfo, privilegeTaxTransfer.usInfo) &&
        Objects.equals(this.deliveryMode, privilegeTaxTransfer.deliveryMode) &&
        Objects.equals(this.system, privilegeTaxTransfer.system) &&
        Objects.equals(this.executionMode, privilegeTaxTransfer.executionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, recipient, sender, transferData, usInfo, deliveryMode, system, executionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeTaxTransfer {\n");
    
    sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    usInfo: ").append(toIndentedString(usInfo)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

