package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zlecenia przelewu zagranicznego innego niż SEPA / NonEEA Transfer Request Class
 */
@ApiModel(description = "Klasa zlecenia przelewu zagranicznego innego niż SEPA / NonEEA Transfer Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentNonEEARequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderCallback requestHeader = null;

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

    @JsonProperty("tppTransactionId")
    private String tppTransactionId = null;
    @JsonProperty("deliveryMode")
    private DeliveryModeEnum deliveryMode = null;
    @JsonProperty("system")
    private SystemEnum system = null;
    @JsonProperty("hold")
    private Boolean hold = null;
    @JsonProperty("executionMode")
    private ExecutionModeEnum executionMode = null;

    public PaymentNonEEARequest requestHeader(RequestHeaderCallback requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * Get requestHeader
     *
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

    public PaymentNonEEARequest recipient(RecipientPISForeign recipient) {
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

    public RecipientPISForeign getRecipient() {
        return recipient;
    }

    public void setRecipient(RecipientPISForeign recipient) {
        this.recipient = recipient;
    }

    public PaymentNonEEARequest recipientBank(Bank recipientBank) {
        this.recipientBank = recipientBank;
        return this;
    }

    /**
     * Get recipientBank
     *
     * @return recipientBank
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Bank getRecipientBank() {
        return recipientBank;
    }

    public void setRecipientBank(Bank recipientBank) {
        this.recipientBank = recipientBank;
    }

    public PaymentNonEEARequest sender(SenderPISForeign sender) {
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

    public SenderPISForeign getSender() {
        return sender;
    }

    public void setSender(SenderPISForeign sender) {
        this.sender = sender;
    }

    public PaymentNonEEARequest transferData(TransferDataCurrencyRequired transferData) {
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

    public TransferDataCurrencyRequired getTransferData() {
        return transferData;
    }

    public void setTransferData(TransferDataCurrencyRequired transferData) {
        this.transferData = transferData;
    }

    public PaymentNonEEARequest transferCharges(String transferCharges) {
        this.transferCharges = transferCharges;
        return this;
    }

    /**
     * Klauzula kosztowa / The cost clause
     *
     * @return transferCharges
     **/
    @ApiModelProperty(value = "Klauzula kosztowa / The cost clause")

    @Size(max = 3)
    public String getTransferCharges() {
        return transferCharges;
    }

    public void setTransferCharges(String transferCharges) {
        this.transferCharges = transferCharges;
    }

    public PaymentNonEEARequest tppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
        return this;
    }

    /**
     * ID transakcji nadany przez TPP / Transaction ID (TPP)
     *
     * @return tppTransactionId
     **/
    @ApiModelProperty(required = true, value = "ID transakcji nadany przez TPP / Transaction ID (TPP)")
    @NotNull

    @Size(max = 64)
    public String getTppTransactionId() {
        return tppTransactionId;
    }

    public void setTppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
    }

    public PaymentNonEEARequest deliveryMode(DeliveryModeEnum deliveryMode) {
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

    public PaymentNonEEARequest system(SystemEnum system) {
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

    public PaymentNonEEARequest hold(Boolean hold) {
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

    public PaymentNonEEARequest executionMode(ExecutionModeEnum executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * Tryb realizacji płatności. Nadrzędna informacja decydująca o tym w jakim trybie zostanie zrealizowana płatność. / Payment execution mode. The superior information deciding which mode is to be used to execute payment.
     *
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
        PaymentNonEEARequest paymentNonEEARequest = (PaymentNonEEARequest) o;
        return Objects.equals(this.requestHeader, paymentNonEEARequest.requestHeader) &&
                Objects.equals(this.recipient, paymentNonEEARequest.recipient) &&
                Objects.equals(this.recipientBank, paymentNonEEARequest.recipientBank) &&
                Objects.equals(this.sender, paymentNonEEARequest.sender) &&
                Objects.equals(this.transferData, paymentNonEEARequest.transferData) &&
                Objects.equals(this.transferCharges, paymentNonEEARequest.transferCharges) &&
                Objects.equals(this.tppTransactionId, paymentNonEEARequest.tppTransactionId) &&
                Objects.equals(this.deliveryMode, paymentNonEEARequest.deliveryMode) &&
                Objects.equals(this.system, paymentNonEEARequest.system) &&
                Objects.equals(this.hold, paymentNonEEARequest.hold) &&
                Objects.equals(this.executionMode, paymentNonEEARequest.executionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, recipient, recipientBank, sender, transferData, transferCharges, tppTransactionId, deliveryMode, system, hold, executionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentNonEEARequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    recipientBank: ").append(toIndentedString(recipientBank)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
        sb.append("    transferCharges: ").append(toIndentedString(transferCharges)).append("\n");
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
        SWIFT("Swift");

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

        @JsonCreator
        public static ExecutionModeEnum fromValue(String text) {
            for (ExecutionModeEnum b : ExecutionModeEnum.values()) {
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

