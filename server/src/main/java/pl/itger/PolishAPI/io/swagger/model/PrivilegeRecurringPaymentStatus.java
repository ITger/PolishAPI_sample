package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia do żądania statusu płatności cyklicznej / The list of attributes of recurring payment status request privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do żądania statusu płatności cyklicznej / The list of attributes of recurring payment status request privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class PrivilegeRecurringPaymentStatus   {
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

  @JsonProperty("recurringPaymentId")
  private String recurringPaymentId = null;

  @JsonProperty("tppRecurringPaymentId")
  private String tppRecurringPaymentId = null;

  public PrivilegeRecurringPaymentStatus scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

  public PrivilegeRecurringPaymentStatus recurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP
   * @return recurringPaymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP")


  public String getRecurringPaymentId() {
    return recurringPaymentId;
  }

  public void setRecurringPaymentId(String recurringPaymentId) {
    this.recurringPaymentId = recurringPaymentId;
  }

  public PrivilegeRecurringPaymentStatus tppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez TPP / Recurring payment identifier set by TPP
   * @return tppRecurringPaymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności cyklicznej nadany przez TPP / Recurring payment identifier set by TPP")


  public String getTppRecurringPaymentId() {
    return tppRecurringPaymentId;
  }

  public void setTppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegeRecurringPaymentStatus privilegeRecurringPaymentStatus = (PrivilegeRecurringPaymentStatus) o;
    return Objects.equals(this.scopeUsageLimit, privilegeRecurringPaymentStatus.scopeUsageLimit) &&
        Objects.equals(this.recurringPaymentId, privilegeRecurringPaymentStatus.recurringPaymentId) &&
        Objects.equals(this.tppRecurringPaymentId, privilegeRecurringPaymentStatus.tppRecurringPaymentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, recurringPaymentId, tppRecurringPaymentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeRecurringPaymentStatus {\n");
    
    sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
    sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
    sb.append("    tppRecurringPaymentId: ").append(toIndentedString(tppRecurringPaymentId)).append("\n");
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

