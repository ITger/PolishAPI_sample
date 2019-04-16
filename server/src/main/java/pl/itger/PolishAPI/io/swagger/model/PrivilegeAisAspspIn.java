package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia usługi AIS będących przedmiotem zapytania o zgodę PSU / The list of attributes of the privilege of the AIS service that are the subject of the request for PSU&#39;s consent
 */
@ApiModel(description = "Lista atrybutów uprawnienia usługi AIS będących przedmiotem zapytania o zgodę PSU / The list of attributes of the privilege of the AIS service that are the subject of the request for PSU's consent")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PrivilegeAisAspspIn  implements Serializable {
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

  @JsonProperty("maxAllowedHistoryLong")
  private Integer maxAllowedHistoryLong = null;

  public PrivilegeAisAspspIn scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

  public PrivilegeAisAspspIn maxAllowedHistoryLong(Integer maxAllowedHistoryLong) {
    this.maxAllowedHistoryLong = maxAllowedHistoryLong;
    return this;
  }

  /**
   * Ilość dni wstecz, liczona od momentu wysłania przez TPP żądania o pobranie historii transakcji rachunku płatnicznego, jaką może obejmować odpowiedź na to żądanie / How much account's transaction history is allowed to retrieve in days. This value should be used for calculation based on date of sending the request.
   * minimum: 1
   * maximum: 1460
   * @return maxAllowedHistoryLong
  **/
  @ApiModelProperty(required = true, value = "Ilość dni wstecz, liczona od momentu wysłania przez TPP żądania o pobranie historii transakcji rachunku płatnicznego, jaką może obejmować odpowiedź na to żądanie / How much account's transaction history is allowed to retrieve in days. This value should be used for calculation based on date of sending the request.")
  @NotNull

@Min(1) @Max(1460) 
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
    PrivilegeAisAspspIn privilegeAisAspspIn = (PrivilegeAisAspspIn) o;
    return Objects.equals(this.scopeUsageLimit, privilegeAisAspspIn.scopeUsageLimit) &&
        Objects.equals(this.maxAllowedHistoryLong, privilegeAisAspspIn.maxAllowedHistoryLong);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, maxAllowedHistoryLong);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeAisAspspIn {\n");
    
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
}

