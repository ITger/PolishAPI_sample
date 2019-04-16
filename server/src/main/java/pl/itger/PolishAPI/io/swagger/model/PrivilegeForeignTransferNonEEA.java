package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.Bank;
import pl.itger.PolishAPI.io.swagger.model.RecipientPISForeign;
import pl.itger.PolishAPI.io.swagger.model.SenderPISForeign;
import pl.itger.PolishAPI.io.swagger.model.TransferDataCurrencyRequired;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia do inicjacji przelewu zagranicznego bez EEA / The list of attributes of the non-EEA foreign transfer request initiation privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do inicjacji przelewu zagranicznego bez EEA / The list of attributes of the non-EEA foreign transfer request initiation privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeForeignTransferNonEEA  implements Serializable {
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
  private RecipientPISForeign recipient = null;

  @JsonProperty("recipientBank")
  private Bank recipientBank = null;

  @JsonProperty("sender")
  private SenderPISForeign sender = null;

  @JsonProperty("transferData")
  private TransferDataCurrencyRequired transferData = null;

  @JsonProperty("transferCharges")
  private String transferCharges = null;

  /**
   * Tryb pilności / Urgency mode
   */
  public enum DeliveryModeEnum {
    EXPRESSD0("ExpressD0"),
    
    URGENTD1("UrgentD1"),
    
    STANDARDD2("StandardD2");

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
    SWIFT("Swift");

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

  public PrivilegeForeignTransferNonEEA scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

  public PrivilegeForeignTransferNonEEA recipient(RecipientPISForeign recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecipientPISForeign getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPISForeign recipient) {
    this.recipient = recipient;
  }

  public PrivilegeForeignTransferNonEEA recipientBank(Bank recipientBank) {
    this.recipientBank = recipientBank;
    return this;
  }

  /**
   * Get recipientBank
   * @return recipientBank
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Bank getRecipientBank() {
    return recipientBank;
  }

  public void setRecipientBank(Bank recipientBank) {
    this.recipientBank = recipientBank;
  }

  public PrivilegeForeignTransferNonEEA sender(SenderPISForeign sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SenderPISForeign getSender() {
    return sender;
  }

  public void setSender(SenderPISForeign sender) {
    this.sender = sender;
  }

  public PrivilegeForeignTransferNonEEA transferData(TransferDataCurrencyRequired transferData) {
    this.transferData = transferData;
    return this;
  }

  /**
   * Get transferData
   * @return transferData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public TransferDataCurrencyRequired getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferDataCurrencyRequired transferData) {
    this.transferData = transferData;
  }

  public PrivilegeForeignTransferNonEEA transferCharges(String transferCharges) {
    this.transferCharges = transferCharges;
    return this;
  }

  /**
   * Klauzula kosztowa / The cost clause
   * @return transferCharges
  **/
  @ApiModelProperty(value = "Klauzula kosztowa / The cost clause")

@Size(max=3) 
  public String getTransferCharges() {
    return transferCharges;
  }

  public void setTransferCharges(String transferCharges) {
    this.transferCharges = transferCharges;
  }

  public PrivilegeForeignTransferNonEEA deliveryMode(DeliveryModeEnum deliveryMode) {
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

  public PrivilegeForeignTransferNonEEA system(SystemEnum system) {
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

  public PrivilegeForeignTransferNonEEA executionMode(ExecutionModeEnum executionMode) {
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
    PrivilegeForeignTransferNonEEA privilegeForeignTransferNonEEA = (PrivilegeForeignTransferNonEEA) o;
    return Objects.equals(this.scopeUsageLimit, privilegeForeignTransferNonEEA.scopeUsageLimit) &&
        Objects.equals(this.recipient, privilegeForeignTransferNonEEA.recipient) &&
        Objects.equals(this.recipientBank, privilegeForeignTransferNonEEA.recipientBank) &&
        Objects.equals(this.sender, privilegeForeignTransferNonEEA.sender) &&
        Objects.equals(this.transferData, privilegeForeignTransferNonEEA.transferData) &&
        Objects.equals(this.transferCharges, privilegeForeignTransferNonEEA.transferCharges) &&
        Objects.equals(this.deliveryMode, privilegeForeignTransferNonEEA.deliveryMode) &&
        Objects.equals(this.system, privilegeForeignTransferNonEEA.system) &&
        Objects.equals(this.executionMode, privilegeForeignTransferNonEEA.executionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, recipient, recipientBank, sender, transferData, transferCharges, deliveryMode, system, executionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeForeignTransferNonEEA {\n");
    
    sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    recipientBank: ").append(toIndentedString(recipientBank)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    transferCharges: ").append(toIndentedString(transferCharges)).append("\n");
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

