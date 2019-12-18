package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Lista atrybutów uprawnienia do odwołania zainicjowanego przelewu / The list of attributes of the cancel initiated payment request privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do odwołania zainicjowanego przelewu / The list of attributes of the cancel initiated payment request privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeCancelPayment implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("scopeUsageLimit")
    private ScopeUsageLimitEnum scopeUsageLimit = null;
    @JsonProperty("paymentId")
    private String paymentId = null;
    @JsonProperty("bundleId")
    private String bundleId = null;

    public PrivilegeCancelPayment scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

    public PrivilegeCancelPayment paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Identyfikator płatności / Payment ID
     *
     * @return paymentId
     **/
    @ApiModelProperty(value = "Identyfikator płatności / Payment ID")

    @Size(max = 64)
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PrivilegeCancelPayment bundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Identyfikator paczki przelewów / Bundle of payments ID
     *
     * @return bundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki przelewów / Bundle of payments ID")


    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegeCancelPayment privilegeCancelPayment = (PrivilegeCancelPayment) o;
        return Objects.equals(this.scopeUsageLimit, privilegeCancelPayment.scopeUsageLimit) &&
                Objects.equals(this.paymentId, privilegeCancelPayment.paymentId) &&
                Objects.equals(this.bundleId, privilegeCancelPayment.bundleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeUsageLimit, paymentId, bundleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeCancelPayment {\n");

        sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

