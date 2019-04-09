package io.swagger.model;

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
 * Klasa informacji o płatniku do ZUS / Polish Social Security Institution (ZUS) Payor Information Class
 */
@ApiModel(description = "Klasa informacji o płatniku do ZUS / Polish Social Security Institution (ZUS) Payor Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class SocialSecurityPayor  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("nip")
  private String nip = null;

  @JsonProperty("additionalPayorId")
  private String additionalPayorId = null;

  /**
   * Typ dodatkowego identyfikatora płatnika / Payor's additional identifier type
   */
  public enum AdditionalPayorIdTypeEnum {
    P("P"),
    
    R("R"),
    
    _1("1"),
    
    _2("2");

    private String value;

    AdditionalPayorIdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AdditionalPayorIdTypeEnum fromValue(String text) {
      for (AdditionalPayorIdTypeEnum b : AdditionalPayorIdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("additionalPayorIdType")
  private AdditionalPayorIdTypeEnum additionalPayorIdType = null;

  public SocialSecurityPayor nip(String nip) {
    this.nip = nip;
    return this;
  }

  /**
   * Numer Identyfikacji Podatkowej / Payor's Tax Identification Number
   * @return nip
  **/
  @ApiModelProperty(value = "Numer Identyfikacji Podatkowej / Payor's Tax Identification Number")

@Size(max=10) 
  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public SocialSecurityPayor additionalPayorId(String additionalPayorId) {
    this.additionalPayorId = additionalPayorId;
    return this;
  }

  /**
   * Dodatkowy numer identyfikacyjny płatnika / Payor's additional identification number
   * @return additionalPayorId
  **/
  @ApiModelProperty(value = "Dodatkowy numer identyfikacyjny płatnika / Payor's additional identification number")

@Size(max=20) 
  public String getAdditionalPayorId() {
    return additionalPayorId;
  }

  public void setAdditionalPayorId(String additionalPayorId) {
    this.additionalPayorId = additionalPayorId;
  }

  public SocialSecurityPayor additionalPayorIdType(AdditionalPayorIdTypeEnum additionalPayorIdType) {
    this.additionalPayorIdType = additionalPayorIdType;
    return this;
  }

  /**
   * Typ dodatkowego identyfikatora płatnika / Payor's additional identifier type
   * @return additionalPayorIdType
  **/
  @ApiModelProperty(value = "Typ dodatkowego identyfikatora płatnika / Payor's additional identifier type")


  public AdditionalPayorIdTypeEnum getAdditionalPayorIdType() {
    return additionalPayorIdType;
  }

  public void setAdditionalPayorIdType(AdditionalPayorIdTypeEnum additionalPayorIdType) {
    this.additionalPayorIdType = additionalPayorIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialSecurityPayor socialSecurityPayor = (SocialSecurityPayor) o;
    return Objects.equals(this.nip, socialSecurityPayor.nip) &&
        Objects.equals(this.additionalPayorId, socialSecurityPayor.additionalPayorId) &&
        Objects.equals(this.additionalPayorIdType, socialSecurityPayor.additionalPayorIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nip, additionalPayorId, additionalPayorIdType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialSecurityPayor {\n");
    
    sb.append("    nip: ").append(toIndentedString(nip)).append("\n");
    sb.append("    additionalPayorId: ").append(toIndentedString(additionalPayorId)).append("\n");
    sb.append("    additionalPayorIdType: ").append(toIndentedString(additionalPayorIdType)).append("\n");
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

