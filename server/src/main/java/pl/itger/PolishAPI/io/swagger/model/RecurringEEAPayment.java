package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RecipientPISForeign;
import io.swagger.model.SenderPISForeign;
import io.swagger.model.TransferDataCurrencyRequired;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Struktura danych przelewu zagranicznego SEPA, użyta do zdefinowania nowej płatności cyklicznej. / Data structure of EEA payment that is to be used to define new recurring payment.
 */
@ApiModel(description = "Struktura danych przelewu zagranicznego SEPA, użyta do zdefinowania nowej płatności cyklicznej. / Data structure of EEA payment that is to be used to define new recurring payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecurringEEAPayment  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("recipient")
  private RecipientPISForeign recipient = null;

  @JsonProperty("sender")
  private SenderPISForeign sender = null;

  @JsonProperty("transferData")
  private TransferDataCurrencyRequired transferData = null;

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
    SEPA("SEPA"),
    
    INSTANTSEPA("InstantSEPA"),
    
    TARGET("Target");

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

  public RecurringEEAPayment recipient(RecipientPISForeign recipient) {
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

  public RecipientPISForeign getRecipient() {
    return recipient;
  }

  public void setRecipient(RecipientPISForeign recipient) {
    this.recipient = recipient;
  }

  public RecurringEEAPayment sender(SenderPISForeign sender) {
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

  public SenderPISForeign getSender() {
    return sender;
  }

  public void setSender(SenderPISForeign sender) {
    this.sender = sender;
  }

  public RecurringEEAPayment transferData(TransferDataCurrencyRequired transferData) {
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

  public TransferDataCurrencyRequired getTransferData() {
    return transferData;
  }

  public void setTransferData(TransferDataCurrencyRequired transferData) {
    this.transferData = transferData;
  }

  public RecurringEEAPayment deliveryMode(DeliveryModeEnum deliveryMode) {
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

  public RecurringEEAPayment system(SystemEnum system) {
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

  public RecurringEEAPayment hold(Boolean hold) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringEEAPayment recurringEEAPayment = (RecurringEEAPayment) o;
    return Objects.equals(this.recipient, recurringEEAPayment.recipient) &&
        Objects.equals(this.sender, recurringEEAPayment.sender) &&
        Objects.equals(this.transferData, recurringEEAPayment.transferData) &&
        Objects.equals(this.deliveryMode, recurringEEAPayment.deliveryMode) &&
        Objects.equals(this.system, recurringEEAPayment.system) &&
        Objects.equals(this.hold, recurringEEAPayment.hold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, sender, transferData, deliveryMode, system, hold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringEEAPayment {\n");
    
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
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

