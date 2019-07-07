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
 * Klasa zlecenia przelewu zagranicznego SEPA / EEA Transfer Request Class
 */
@ApiModel(description = "Klasa zlecenia przelewu zagranicznego SEPA / EEA Transfer Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentEEARequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderCallback requestHeader = null;

    @JsonProperty("recipient")
    private RecipientPISForeign recipient = null;

    @JsonProperty("sender")
    private SenderPISForeign sender = null;

    @JsonProperty("transferData")
    private TransferDataCurrencyRequired transferData = null;

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

    public PaymentEEARequest requestHeader(RequestHeaderCallback requestHeader) {
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

    public PaymentEEARequest recipient(RecipientPISForeign recipient) {
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

    public PaymentEEARequest sender(SenderPISForeign sender) {
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

    public PaymentEEARequest transferData(TransferDataCurrencyRequired transferData) {
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

    public PaymentEEARequest tppTransactionId(String tppTransactionId) {
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

    public PaymentEEARequest deliveryMode(DeliveryModeEnum deliveryMode) {
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

    public PaymentEEARequest system(SystemEnum system) {
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

    public PaymentEEARequest hold(Boolean hold) {
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

    public PaymentEEARequest executionMode(ExecutionModeEnum executionMode) {
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
        PaymentEEARequest paymentEEARequest = (PaymentEEARequest) o;
        return Objects.equals(this.requestHeader, paymentEEARequest.requestHeader) &&
                Objects.equals(this.recipient, paymentEEARequest.recipient) &&
                Objects.equals(this.sender, paymentEEARequest.sender) &&
                Objects.equals(this.transferData, paymentEEARequest.transferData) &&
                Objects.equals(this.tppTransactionId, paymentEEARequest.tppTransactionId) &&
                Objects.equals(this.deliveryMode, paymentEEARequest.deliveryMode) &&
                Objects.equals(this.system, paymentEEARequest.system) &&
                Objects.equals(this.hold, paymentEEARequest.hold) &&
                Objects.equals(this.executionMode, paymentEEARequest.executionMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, recipient, sender, transferData, tppTransactionId, deliveryMode, system, hold, executionMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentEEARequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    transferData: ").append(toIndentedString(transferData)).append("\n");
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
        SEPA("SEPA"),

        INSTANTSEPA("InstantSEPA"),

        TARGET("Target");

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

