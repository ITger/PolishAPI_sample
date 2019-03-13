package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RecurringDomesticPayment;
import pl.itger.PolishAPI.io.swagger.model.RecurringEEAPayment;
import pl.itger.PolishAPI.io.swagger.model.RecurringNonEEAPayment;
import pl.itger.PolishAPI.io.swagger.model.RecurringTaxPayment;
import pl.itger.PolishAPI.io.swagger.model.RecurringTransferParameters;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista atrybutów uprawnienia do zdefiniowania nowej płatności cyklicznej / The list of attributes of definition of new recurring payment request privilege
 */
@ApiModel(description = "Lista atrybutów uprawnienia do zdefiniowania nowej płatności cyklicznej / The list of attributes of definition of new recurring payment request privilege")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class PrivilegeRecurringPayment   {
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

  @JsonProperty("recurrence")
  private RecurringTransferParameters recurrence = null;

  /**
   * Typ przelewu, który zostanie wykorzystany do zdefiniowania nowej płatności cyklicznej  / The type of payment that is to be used to define new recurring payment
   */
  public enum TypeOfPaymentEnum {
    DOMESTIC("domestic"),
    
    EEA("EEA"),
    
    NONEEA("nonEEA"),
    
    TAX("tax");

    private String value;

    TypeOfPaymentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfPaymentEnum fromValue(String text) {
      for (TypeOfPaymentEnum b : TypeOfPaymentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOfPayment")
  private TypeOfPaymentEnum typeOfPayment = null;

  @JsonProperty("domesticPayment")
  private RecurringDomesticPayment domesticPayment = null;

  @JsonProperty("EEAPayment")
  private RecurringEEAPayment eeAPayment = null;

  @JsonProperty("nonEEAPayment")
  private RecurringNonEEAPayment nonEEAPayment = null;

  @JsonProperty("taxPayment")
  private RecurringTaxPayment taxPayment = null;

  public PrivilegeRecurringPayment scopeUsageLimit(ScopeUsageLimitEnum scopeUsageLimit) {
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

  public PrivilegeRecurringPayment recurrence(RecurringTransferParameters recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecurringTransferParameters getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(RecurringTransferParameters recurrence) {
    this.recurrence = recurrence;
  }

  public PrivilegeRecurringPayment typeOfPayment(TypeOfPaymentEnum typeOfPayment) {
    this.typeOfPayment = typeOfPayment;
    return this;
  }

  /**
   * Typ przelewu, który zostanie wykorzystany do zdefiniowania nowej płatności cyklicznej  / The type of payment that is to be used to define new recurring payment
   * @return typeOfPayment
  **/
  @ApiModelProperty(value = "Typ przelewu, który zostanie wykorzystany do zdefiniowania nowej płatności cyklicznej  / The type of payment that is to be used to define new recurring payment")


  public TypeOfPaymentEnum getTypeOfPayment() {
    return typeOfPayment;
  }

  public void setTypeOfPayment(TypeOfPaymentEnum typeOfPayment) {
    this.typeOfPayment = typeOfPayment;
  }

  public PrivilegeRecurringPayment domesticPayment(RecurringDomesticPayment domesticPayment) {
    this.domesticPayment = domesticPayment;
    return this;
  }

  /**
   * Get domesticPayment
   * @return domesticPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecurringDomesticPayment getDomesticPayment() {
    return domesticPayment;
  }

  public void setDomesticPayment(RecurringDomesticPayment domesticPayment) {
    this.domesticPayment = domesticPayment;
  }

  public PrivilegeRecurringPayment eeAPayment(RecurringEEAPayment eeAPayment) {
    this.eeAPayment = eeAPayment;
    return this;
  }

  /**
   * Get eeAPayment
   * @return eeAPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecurringEEAPayment getEeAPayment() {
    return eeAPayment;
  }

  public void setEeAPayment(RecurringEEAPayment eeAPayment) {
    this.eeAPayment = eeAPayment;
  }

  public PrivilegeRecurringPayment nonEEAPayment(RecurringNonEEAPayment nonEEAPayment) {
    this.nonEEAPayment = nonEEAPayment;
    return this;
  }

  /**
   * Get nonEEAPayment
   * @return nonEEAPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecurringNonEEAPayment getNonEEAPayment() {
    return nonEEAPayment;
  }

  public void setNonEEAPayment(RecurringNonEEAPayment nonEEAPayment) {
    this.nonEEAPayment = nonEEAPayment;
  }

  public PrivilegeRecurringPayment taxPayment(RecurringTaxPayment taxPayment) {
    this.taxPayment = taxPayment;
    return this;
  }

  /**
   * Get taxPayment
   * @return taxPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RecurringTaxPayment getTaxPayment() {
    return taxPayment;
  }

  public void setTaxPayment(RecurringTaxPayment taxPayment) {
    this.taxPayment = taxPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivilegeRecurringPayment privilegeRecurringPayment = (PrivilegeRecurringPayment) o;
    return Objects.equals(this.scopeUsageLimit, privilegeRecurringPayment.scopeUsageLimit) &&
        Objects.equals(this.recurrence, privilegeRecurringPayment.recurrence) &&
        Objects.equals(this.typeOfPayment, privilegeRecurringPayment.typeOfPayment) &&
        Objects.equals(this.domesticPayment, privilegeRecurringPayment.domesticPayment) &&
        Objects.equals(this.eeAPayment, privilegeRecurringPayment.eeAPayment) &&
        Objects.equals(this.nonEEAPayment, privilegeRecurringPayment.nonEEAPayment) &&
        Objects.equals(this.taxPayment, privilegeRecurringPayment.taxPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeUsageLimit, recurrence, typeOfPayment, domesticPayment, eeAPayment, nonEEAPayment, taxPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivilegeRecurringPayment {\n");
    
    sb.append("    scopeUsageLimit: ").append(toIndentedString(scopeUsageLimit)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    typeOfPayment: ").append(toIndentedString(typeOfPayment)).append("\n");
    sb.append("    domesticPayment: ").append(toIndentedString(domesticPayment)).append("\n");
    sb.append("    eeAPayment: ").append(toIndentedString(eeAPayment)).append("\n");
    sb.append("    nonEEAPayment: ").append(toIndentedString(nonEEAPayment)).append("\n");
    sb.append("    taxPayment: ").append(toIndentedString(taxPayment)).append("\n");
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

