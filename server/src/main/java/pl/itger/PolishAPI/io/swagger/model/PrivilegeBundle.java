package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * Lista atrybutów uprawnienia do żądania statusu paczki płatności / The list of attributes of the bundle of payments status request privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do żądania statusu paczki płatności / The list of attributes of the bundle of payments status request privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeBundle implements Serializable {
    private static final long serialVersionUID = 1L;
    @JsonProperty("scopeUsageLimit")
    private ScopeUsageLimitEnum scopeUsageLimit = null;
    @JsonProperty("bundleId")
    private String bundleId = null;
    @JsonProperty("tppBundleId")
    private String tppBundleId = null;

    public PrivilegeBundle scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

    public PrivilegeBundle bundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Identyfikator paczki płatności / Bundle of payments ID
     *
     * @return bundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki płatności / Bundle of payments ID")


    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public PrivilegeBundle tppBundleId(String tppBundleId) {
        this.tppBundleId = tppBundleId;
        return this;
    }

    /**
     * Identyfikator paczki przelewów nadany przez TPP. / Bundle of payments identifier set by TPP.
     *
     * @return tppBundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki przelewów nadany przez TPP. / Bundle of payments identifier set by TPP.")


    public String getTppBundleId() {
        return tppBundleId;
    }

    public void setTppBundleId(String tppBundleId) {
        this.tppBundleId = tppBundleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivilegeBundle privilegeBundle = (PrivilegeBundle) o;
        return Objects.equals(this.scopeUsageLimit, privilegeBundle.scopeUsageLimit) &&
                Objects.equals(this.bundleId, privilegeBundle.bundleId) &&
                Objects.equals(this.tppBundleId, privilegeBundle.tppBundleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeUsageLimit, bundleId, tppBundleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivilegeBundle {\n");

        sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    tppBundleId: ").append(toIndentedString(tppBundleId)).append("\n");
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

