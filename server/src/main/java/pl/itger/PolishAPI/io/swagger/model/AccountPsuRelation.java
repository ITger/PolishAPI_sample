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
 * Klasa opisująca relację PSU do rachunku płatniczego / Class describing relation between PSU and an Account
 */
@ApiModel(description = "Klasa opisująca relację PSU do rachunku płatniczego / Class describing relation between PSU and an Account")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class AccountPsuRelation   {
  /**
   * Typ relacji PSU do rachunku / Type of relation between PSU and an Account
   */
  public enum TypeOfRelationEnum {
    OWNER("Owner"),
    
    BORROWER("Borrower"),
    
    GUARANTOR("Guarantor"),
    
    PROXYOWNER("ProxyOwner"),
    
    BENEFICIARY("Beneficiary"),
    
    TRUSTEE("Trustee");

    private String value;

    TypeOfRelationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfRelationEnum fromValue(String text) {
      for (TypeOfRelationEnum b : TypeOfRelationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOfRelation")
  private TypeOfRelationEnum typeOfRelation = null;

  /**
   * Typ pełnomocnictwa PSU do rachunku płatniczego. Wymagane gdy typ relacji to Pełnomocnik na rachunku. / Type of proxy. Required for ProxyOwner being a type of PSU relation.
   */
  public enum TypeOfProxyEnum {
    GENERAL("General"),
    
    SPECIAL("Special"),
    
    ADMINISTRATOR("Administrator"),
    
    USER("User");

    private String value;

    TypeOfProxyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfProxyEnum fromValue(String text) {
      for (TypeOfProxyEnum b : TypeOfProxyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOfProxy")
  private TypeOfProxyEnum typeOfProxy = null;

  @JsonProperty("stake")
  private Integer stake = null;

  public AccountPsuRelation typeOfRelation(TypeOfRelationEnum typeOfRelation) {
    this.typeOfRelation = typeOfRelation;
    return this;
  }

  /**
   * Typ relacji PSU do rachunku / Type of relation between PSU and an Account
   * @return typeOfRelation
  **/
  @ApiModelProperty(required = true, value = "Typ relacji PSU do rachunku / Type of relation between PSU and an Account")
  @NotNull


  public TypeOfRelationEnum getTypeOfRelation() {
    return typeOfRelation;
  }

  public void setTypeOfRelation(TypeOfRelationEnum typeOfRelation) {
    this.typeOfRelation = typeOfRelation;
  }

  public AccountPsuRelation typeOfProxy(TypeOfProxyEnum typeOfProxy) {
    this.typeOfProxy = typeOfProxy;
    return this;
  }

  /**
   * Typ pełnomocnictwa PSU do rachunku płatniczego. Wymagane gdy typ relacji to Pełnomocnik na rachunku. / Type of proxy. Required for ProxyOwner being a type of PSU relation.
   * @return typeOfProxy
  **/
  @ApiModelProperty(value = "Typ pełnomocnictwa PSU do rachunku płatniczego. Wymagane gdy typ relacji to Pełnomocnik na rachunku. / Type of proxy. Required for ProxyOwner being a type of PSU relation.")


  public TypeOfProxyEnum getTypeOfProxy() {
    return typeOfProxy;
  }

  public void setTypeOfProxy(TypeOfProxyEnum typeOfProxy) {
    this.typeOfProxy = typeOfProxy;
  }

  public AccountPsuRelation stake(Integer stake) {
    this.stake = stake;
    return this;
  }

  /**
   * Wartość całkowita, wyrażona w procentach, określająca udział PSU w środkach na rachunku lub jego odpowiedzialności w przypadku produktów kredytowych. Dotyczy relacji Owner, Borrower, Guarantor. Opcjonalne. / Integer percentage value defining a participation of PSU in liabilities (in case of credit products) or in ownership of funds on the account. Applicable for the following types of PSU relations: Owner, Borrower, Guarantor. Optional.
   * minimum: 0
   * maximum: 100
   * @return stake
  **/
  @ApiModelProperty(value = "Wartość całkowita, wyrażona w procentach, określająca udział PSU w środkach na rachunku lub jego odpowiedzialności w przypadku produktów kredytowych. Dotyczy relacji Owner, Borrower, Guarantor. Opcjonalne. / Integer percentage value defining a participation of PSU in liabilities (in case of credit products) or in ownership of funds on the account. Applicable for the following types of PSU relations: Owner, Borrower, Guarantor. Optional.")

@Min(0) @Max(100) 
  public Integer getStake() {
    return stake;
  }

  public void setStake(Integer stake) {
    this.stake = stake;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPsuRelation accountPsuRelation = (AccountPsuRelation) o;
    return Objects.equals(this.typeOfRelation, accountPsuRelation.typeOfRelation) &&
        Objects.equals(this.typeOfProxy, accountPsuRelation.typeOfProxy) &&
        Objects.equals(this.stake, accountPsuRelation.stake);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeOfRelation, typeOfProxy, stake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPsuRelation {\n");
    
    sb.append("    typeOfRelation: ").append(toIndentedString(typeOfRelation)).append("\n");
    sb.append("    typeOfProxy: ").append(toIndentedString(typeOfProxy)).append("\n");
    sb.append("    stake: ").append(toIndentedString(stake)).append("\n");
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

