package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Lista atrybutów uprawnienia usługi AIS dla których została wyrażona zgoda przez PSU / The list of attributes of the privilege of the AIS service that the PSU&#39;s consent has been confirmed
 */
@ApiModel(description = "Lista atrybutów uprawnienia usługi AIS dla których została wyrażona zgoda przez PSU / The list of attributes of the privilege of the AIS service that the PSU's consent has been confirmed")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeAisAspspOut implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("scopeUsageLimit")
    private ScopeUsageLimitEnum scopeUsageLimit = null;
    @JsonProperty("maxAllowedHistoryLong")
    private Integer maxAllowedHistoryLong = null;

    public PrivilegeAisAspspOut scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

    public PrivilegeAisAspspOut maxAllowedHistoryLong(Integer maxAllowedHistoryLong) {
        this.maxAllowedHistoryLong = maxAllowedHistoryLong;
        return this;
    }

    /**
     * Ilość dni wstecz, liczona od momentu wysłania przez TPP żądania o pobranie historii transakcji rachunku płatnicznego, jaką może obejmować odpowiedź na to żądanie / How much account's transaction history is allowed to retrieve in days. This value should be used for calculation based on date of sending the request.
     * minimum: 1
     * maximum: 1460
     *
     * @return maxAllowedHistoryLong
     **/
    @ApiModelProperty(required = true, value = "Ilość dni wstecz, liczona od momentu wysłania przez TPP żądania o pobranie historii transakcji rachunku płatnicznego, jaką może obejmować odpowiedź na to żądanie / How much account's transaction history is allowed to retrieve in days. This value should be used for calculation based on date of sending the request.")
    @NotNull

    @Min(1)
    @Max(1460)
    public Integer getMaxAllowedHistoryLong() {
        return maxAllowedHistoryLong;
    }

    public void setMaxAllowedHistoryLong(Integer maxAllowedHistoryLong) {
        this.maxAllowedHistoryLong = maxAllowedHistoryLong;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegeAisAspspOut privilegeAisAspspOut = (PrivilegeAisAspspOut) o;
        return Objects.equals(this.scopeUsageLimit, privilegeAisAspspOut.scopeUsageLimit) &&
                Objects.equals(this.maxAllowedHistoryLong, privilegeAisAspspOut.maxAllowedHistoryLong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeUsageLimit, maxAllowedHistoryLong);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeAisAspspOut {\n");

        sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
        sb.append("    maxAllowedHistoryLong: ").append(toIndentedString(maxAllowedHistoryLong)).append("\n");
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

