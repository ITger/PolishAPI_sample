package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.ScopeDetailsOutputPrivilegeList;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Zakres, limity, parametry i czas ważności zgód, które potwierdza ASPSP / Scope, limits, parameters and expiration time of consents that are confimed by ASPSP
 */
@ApiModel(description = "Zakres, limity, parametry i czas ważności zgód, które potwierdza ASPSP / Scope, limits, parameters and expiration time of consents that are confimed by ASPSP")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class ScopeDetailsOutput  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("privilegeList")
  @Valid
  private List<ScopeDetailsOutputPrivilegeList> privilegeList = null;

  @JsonProperty("consentId")
  private String consentId = null;

  @JsonProperty("scopeTimeLimit")
  private OffsetDateTime scopeTimeLimit = null;

  /**
   * Throttling policy
   */
  public enum ThrottlingPolicyEnum {
    PSD2REGULATORY("psd2Regulatory");

    private String value;

    ThrottlingPolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ThrottlingPolicyEnum fromValue(String text) {
      for (ThrottlingPolicyEnum b : ThrottlingPolicyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("throttlingPolicy")
  private ThrottlingPolicyEnum throttlingPolicy = null;

  public ScopeDetailsOutput privilegeList(List<ScopeDetailsOutputPrivilegeList> privilegeList) {
    this.privilegeList = privilegeList;
    return this;
  }

  public ScopeDetailsOutput addPrivilegeListItem(ScopeDetailsOutputPrivilegeList privilegeListItem) {
    if (this.privilegeList == null) {
      this.privilegeList = new ArrayList<>();
    }
    this.privilegeList.add(privilegeListItem);
    return this;
  }

  /**
   * The list of structures describing details of consent obtained by TPP.
   * @return privilegeList
  **/
  @ApiModelProperty(value = "The list of structures describing details of consent obtained by TPP.")

  @Valid

  public List<ScopeDetailsOutputPrivilegeList> getPrivilegeList() {
    return privilegeList;
  }

  public void setPrivilegeList(List<ScopeDetailsOutputPrivilegeList> privilegeList) {
    this.privilegeList = privilegeList;
  }

  public ScopeDetailsOutput consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Id of consent
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "Id of consent")
  @NotNull


  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public ScopeDetailsOutput scopeTimeLimit(OffsetDateTime scopeTimeLimit) {
    this.scopeTimeLimit = scopeTimeLimit;
    return this;
  }

  /**
   * Data ważności zgody / consent valid until, YYYY-MM-DDThh:mm:ss[.mmm]
   * @return scopeTimeLimit
  **/
  @ApiModelProperty(required = true, value = "Data ważności zgody / consent valid until, YYYY-MM-DDThh:mm:ss[.mmm]")
  @NotNull

  @Valid

  public OffsetDateTime getScopeTimeLimit() {
    return scopeTimeLimit;
  }

  public void setScopeTimeLimit(OffsetDateTime scopeTimeLimit) {
    this.scopeTimeLimit = scopeTimeLimit;
  }

  public ScopeDetailsOutput throttlingPolicy(ThrottlingPolicyEnum throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
    return this;
  }

  /**
   * Throttling policy
   * @return throttlingPolicy
  **/
  @ApiModelProperty(required = true, value = "Throttling policy")
  @NotNull


  public ThrottlingPolicyEnum getThrottlingPolicy() {
    return throttlingPolicy;
  }

  public void setThrottlingPolicy(ThrottlingPolicyEnum throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeDetailsOutput scopeDetailsOutput = (ScopeDetailsOutput) o;
    return Objects.equals(this.privilegeList, scopeDetailsOutput.privilegeList) &&
        Objects.equals(this.consentId, scopeDetailsOutput.consentId) &&
        Objects.equals(this.scopeTimeLimit, scopeDetailsOutput.scopeTimeLimit) &&
        Objects.equals(this.throttlingPolicy, scopeDetailsOutput.throttlingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeList, consentId, scopeTimeLimit, throttlingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeDetailsOutput {\n");
    
    sb.append("    privilegeList: ").append(toIndentedString(privilegeList)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    scopeTimeLimit: ").append(toIndentedString(scopeTimeLimit)).append("\n");
    sb.append("    throttlingPolicy: ").append(toIndentedString(throttlingPolicy)).append("\n");
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

