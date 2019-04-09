package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ScopeDetailsInputPrivilegeList;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Zakres, limity, parametry i czas ważności zgód, o które prosi TPP. / Scope, limits, parameters and expiration time of consents requested by TPP
 */
@ApiModel(description = "Zakres, limity, parametry i czas ważności zgód, o które prosi TPP. / Scope, limits, parameters and expiration time of consents requested by TPP")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class ScopeDetailsInput  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("privilegeList")
  @Valid
  private List<ScopeDetailsInputPrivilegeList> privilegeList = null;

  /**
   * Type of consent
   */
  public enum ScopeGroupTypeEnum {
    AIS_ACCOUNTS("ais-accounts"),
    
    AIS("ais"),
    
    PIS("pis");

    private String value;

    ScopeGroupTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeGroupTypeEnum fromValue(String text) {
      for (ScopeGroupTypeEnum b : ScopeGroupTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("scopeGroupType")
  private ScopeGroupTypeEnum scopeGroupType = null;

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

  public ScopeDetailsInput privilegeList(List<ScopeDetailsInputPrivilegeList> privilegeList) {
    this.privilegeList = privilegeList;
    return this;
  }

  public ScopeDetailsInput addPrivilegeListItem(ScopeDetailsInputPrivilegeList privilegeListItem) {
    if (this.privilegeList == null) {
      this.privilegeList = new ArrayList<>();
    }
    this.privilegeList.add(privilegeListItem);
    return this;
  }

  /**
   * The list of structures describing details of consent. Conditionally required - in case of process of obtaining new consent.
   * @return privilegeList
  **/
  @ApiModelProperty(value = "The list of structures describing details of consent. Conditionally required - in case of process of obtaining new consent.")

  @Valid

  public List<ScopeDetailsInputPrivilegeList> getPrivilegeList() {
    return privilegeList;
  }

  public void setPrivilegeList(List<ScopeDetailsInputPrivilegeList> privilegeList) {
    this.privilegeList = privilegeList;
  }

  public ScopeDetailsInput scopeGroupType(ScopeGroupTypeEnum scopeGroupType) {
    this.scopeGroupType = scopeGroupType;
    return this;
  }

  /**
   * Type of consent
   * @return scopeGroupType
  **/
  @ApiModelProperty(required = true, value = "Type of consent")
  @NotNull


  public ScopeGroupTypeEnum getScopeGroupType() {
    return scopeGroupType;
  }

  public void setScopeGroupType(ScopeGroupTypeEnum scopeGroupType) {
    this.scopeGroupType = scopeGroupType;
  }

  public ScopeDetailsInput consentId(String consentId) {
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

  public ScopeDetailsInput scopeTimeLimit(OffsetDateTime scopeTimeLimit) {
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

  public ScopeDetailsInput throttlingPolicy(ThrottlingPolicyEnum throttlingPolicy) {
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
    ScopeDetailsInput scopeDetailsInput = (ScopeDetailsInput) o;
    return Objects.equals(this.privilegeList, scopeDetailsInput.privilegeList) &&
        Objects.equals(this.scopeGroupType, scopeDetailsInput.scopeGroupType) &&
        Objects.equals(this.consentId, scopeDetailsInput.consentId) &&
        Objects.equals(this.scopeTimeLimit, scopeDetailsInput.scopeTimeLimit) &&
        Objects.equals(this.throttlingPolicy, scopeDetailsInput.throttlingPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privilegeList, scopeGroupType, consentId, scopeTimeLimit, throttlingPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeDetailsInput {\n");
    
    sb.append("    privilegeList: ").append(toIndentedString(privilegeList)).append("\n");
    sb.append("    scopeGroupType: ").append(toIndentedString(scopeGroupType)).append("\n");
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

