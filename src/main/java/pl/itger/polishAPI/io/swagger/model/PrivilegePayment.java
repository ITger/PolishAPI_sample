package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * Lista atrybutów uprawnienia do żądania statusu płatności / The list of attributes of the payment status request privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do żądania statusu płatności / The list of attributes of the payment status request privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegePayment implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("scopeUsageLimit")
    private ScopeUsageLimitEnum scopeUsageLimit = null;
    @JsonProperty("paymentId")
    private String paymentId = null;
    @JsonProperty("tppTransactionId")
    private String tppTransactionId = null;

    public PrivilegePayment scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
        this.scopeUsageLimit = scopeUsageLimit;
        return this;
    }

    /**
     * Rodzaj limitu zgody / Type of limit of usages
     *
     * @return scopeUsageLimit
     **/
    @ApiModelProperty(value = "Rodzaj limitu zgody / Type of limit of usages")


    public ScopeUsageLimitEnum getScopeUsageLimit() {
        return scopeUsageLimit;
    }

    public void setScopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
        this.scopeUsageLimit = scopeUsageLimit;
    }

    public PrivilegePayment paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Identyfikator płatności / Payment ID
     *
     * @return paymentId
     **/
    @ApiModelProperty(value = "Identyfikator płatności / Payment ID")


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PrivilegePayment tppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
        return this;
    }

    /**
     * Identyfikator transakcji nadany przez TPP. / Identifier of transaction established by TPP.
     *
     * @return tppTransactionId
     **/
    @ApiModelProperty(value = "Identyfikator transakcji nadany przez TPP. / Identifier of transaction established by TPP.")


    public String getTppTransactionId() {
        return tppTransactionId;
    }

    public void setTppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegePayment privilegePayment = (PrivilegePayment) o;
        return Objects.equals(this.scopeUsageLimit, privilegePayment.scopeUsageLimit) &&
                Objects.equals(this.paymentId, privilegePayment.paymentId) &&
                Objects.equals(this.tppTransactionId, privilegePayment.tppTransactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeUsageLimit, paymentId, tppTransactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegePayment {\n");

        sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
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
     * Rodzaj limitu zgody / Type of limit of usages
     */
    public enum ScopeUsageLimitEnum {
        SINGLE("single"),

        MULTIPLE("multiple");

        private String value;

        ScopeUsageLimitEnum(String value) {
            this.value = value;
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

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

