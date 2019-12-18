package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Struktura danych przelewu do urzędu podatkowego, użyta do zdefinowania nowej płatności cyklicznej. / Data structure of tax payment that is to be used to define new recurring payment.
 */
@ApiModel(description = "Struktura danych przelewu do urzędu podatkowego, użyta do zdefinowania nowej płatności cyklicznej. / Data structure of tax payment that is to be used to define new recurring payment.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecurringTaxPayment implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("recipient")
    private RecipientPISTax recipient = null;

    @JsonProperty("sender")
    private SenderPISDomestic sender = null;

    @JsonProperty("transferData")
    private TransferDataCurrencyRequiredTax transferData = null;

    @JsonProperty("usInfo")
    private TransactionInfoTax usInfo = null;
    @JsonProperty("deliveryMode")
    private DeliveryModeEnum deliveryMode = null;
    @JsonProperty("system")
    private SystemEnum system = null;
    @JsonProperty("hold")
    private Boolean hold = null;

    public RecurringTaxPayment recipient(RecipientPISTax recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Get recipient
     *
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

    public RecurringTaxPayment sender(SenderPISDomestic sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     *
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

    public RecurringTaxPayment transferData(TransferDataCurrencyRequiredTax transferData) {
        this.transferData = transferData;
        return this;
    }

    /**
     * Get transferData
     *
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

    public RecurringTaxPayment usInfo(TransactionInfoTax usInfo) {
        this.usInfo = usInfo;
        return this;
    }

    /**
     * Get usInfo
     *
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

    public RecurringTaxPayment deliveryMode(DeliveryModeEnum deliveryMode) {
        this.deliveryMode = deliveryMode;
        return this;
    }

    /**
     * Tryb pilności / Urgency mode
     *
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

    public RecurringTaxPayment system(SystemEnum system) {
        this.system = system;
        return this;
    }

    /**
     * Droga jaką przelew ma być rozliczony / The way the transfer should be settled
     *
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

    public RecurringTaxPayment hold(Boolean hold) {
        this.hold = hold;
        return this;
    }

    /**
     * Czy założyć blokadę (w przypadku np. zlecenia przelewu w dniu wolnym) / Indicates if payment should be holded
     *
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
        RecurringTaxPayment recurringTaxPayment = (RecurringTaxPayment) o;
        return Objects.equals(this.recipient, recurringTaxPayment.recipient) &&
                Objects.equals(this.sender, recurringTaxPayment.sender) &&
                Objects.equals(this.transferData, recurringTaxPayment.transferData) &&
                Objects.equals(this.usInfo, recurringTaxPayment.usInfo) &&
                Objects.equals(this.deliveryMode, recurringTaxPayment.deliveryMode) &&
                Objects.equals(this.system, recurringTaxPayment.system) &&
                Objects.equals(this.hold, recurringTaxPayment.hold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipient, sender, transferData, usInfo, deliveryMode, system, hold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecurringTaxPayment {\n");

        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
        sb.append("    usInfo: ").append(toIndentedString(usInfo)).append("\n");
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

        @JsonCreator
        public static DeliveryModeEnum fromValue(String text) {
            for (DeliveryModeEnum b : DeliveryModeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }

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

        @JsonCreator
        public static SystemEnum fromValue(String text) {
            for (SystemEnum b : SystemEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}
