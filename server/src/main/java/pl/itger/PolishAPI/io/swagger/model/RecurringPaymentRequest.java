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
import pl.itger.PolishAPI.io.swagger.model.RequestHeaderCallback;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zlecenia zdefiniowania nowej płatności cyklicznej / Recurring payment definition Request Class
 */
@ApiModel(description = "Klasa zlecenia zdefiniowania nowej płatności cyklicznej / Recurring payment definition Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class RecurringPaymentRequest   {
  @JsonProperty("requestHeader")
  private RequestHeaderCallback requestHeader = null;

  @JsonProperty("tppRecurringPaymentId")
  private String tppRecurringPaymentId = null;

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

  public RecurringPaymentRequest requestHeader(RequestHeaderCallback requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeaderCallback getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderCallback requestHeader) {
    this.requestHeader = requestHeader;
  }

  public RecurringPaymentRequest tppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
    return this;
  }

  /**
   * Identyfikator płatności cyklicznej nadany przez TPP / Recurring payment identifier set by TPP
   * @return tppRecurringPaymentId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez TPP / Recurring payment identifier set by TPP")
  @NotNull

@Size(max=64) 
  public String getTppRecurringPaymentId() {
    return tppRecurringPaymentId;
  }

  public void setTppRecurringPaymentId(String tppRecurringPaymentId) {
    this.tppRecurringPaymentId = tppRecurringPaymentId;
  }

  public RecurringPaymentRequest recurrence(RecurringTransferParameters recurrence) {
    this.recurrence = recurrence;
    return this;
  }

  /**
   * Get recurrence
   * @return recurrence
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RecurringTransferParameters getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(RecurringTransferParameters recurrence) {
    this.recurrence = recurrence;
  }

  public RecurringPaymentRequest typeOfPayment(TypeOfPaymentEnum typeOfPayment) {
    this.typeOfPayment = typeOfPayment;
    return this;
  }

  /**
   * Typ przelewu, który zostanie wykorzystany do zdefiniowania nowej płatności cyklicznej  / The type of payment that is to be used to define new recurring payment
   * @return typeOfPayment
  **/
  @ApiModelProperty(required = true, value = "Typ przelewu, który zostanie wykorzystany do zdefiniowania nowej płatności cyklicznej  / The type of payment that is to be used to define new recurring payment")
  @NotNull


  public TypeOfPaymentEnum getTypeOfPayment() {
    return typeOfPayment;
  }

  public void setTypeOfPayment(TypeOfPaymentEnum typeOfPayment) {
    this.typeOfPayment = typeOfPayment;
  }

  public RecurringPaymentRequest domesticPayment(RecurringDomesticPayment domesticPayment) {
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

  public RecurringPaymentRequest eeAPayment(RecurringEEAPayment eeAPayment) {
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

  public RecurringPaymentRequest nonEEAPayment(RecurringNonEEAPayment nonEEAPayment) {
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

  public RecurringPaymentRequest taxPayment(RecurringTaxPayment taxPayment) {
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
    RecurringPaymentRequest recurringPaymentRequest = (RecurringPaymentRequest) o;
    return Objects.equals(this.requestHeader, recurringPaymentRequest.requestHeader) &&
        Objects.equals(this.tppRecurringPaymentId, recurringPaymentRequest.tppRecurringPaymentId) &&
        Objects.equals(this.recurrence, recurringPaymentRequest.recurrence) &&
        Objects.equals(this.typeOfPayment, recurringPaymentRequest.typeOfPayment) &&
        Objects.equals(this.domesticPayment, recurringPaymentRequest.domesticPayment) &&
        Objects.equals(this.eeAPayment, recurringPaymentRequest.eeAPayment) &&
        Objects.equals(this.nonEEAPayment, recurringPaymentRequest.nonEEAPayment) &&
        Objects.equals(this.taxPayment, recurringPaymentRequest.taxPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, tppRecurringPaymentId, recurrence, typeOfPayment, domesticPayment, eeAPayment, nonEEAPayment, taxPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringPaymentRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    tppRecurringPaymentId: ").append(toIndentedString(tppRecurringPaymentId)).append("\n");
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

