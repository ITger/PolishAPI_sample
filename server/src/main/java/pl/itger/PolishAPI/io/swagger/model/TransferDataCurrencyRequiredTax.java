package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.TransferDataBaseTax;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca dane przelewu / Transfer Data Class
 */
@ApiModel(description = "Klasa zawierająca dane przelewu / Transfer Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransferDataCurrencyRequiredTax  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("executionDate")
  private LocalDate executionDate = null;

  @JsonProperty("currency")
  private String currency = null;

  public TransferDataCurrencyRequiredTax amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Kwota przelewu / Amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Kwota przelewu / Amount")
  @NotNull

@Pattern(regexp="^(0|([1-9][0-9]{0,}))\\.\\d{2}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public TransferDataCurrencyRequiredTax executionDate(LocalDate executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Data wykonania przelewu. Wymagany pod warunkiem przekazania wartości FutureDated w atrybucie executionMode. Format: YYYY-MM-DD / Date when the transfer is to be executed (YYYY-MM-DD). Required conditionally if executionMode attribute has value FutureDated.
   * @return executionDate
  **/
  @ApiModelProperty(value = "Data wykonania przelewu. Wymagany pod warunkiem przekazania wartości FutureDated w atrybucie executionMode. Format: YYYY-MM-DD / Date when the transfer is to be executed (YYYY-MM-DD). Required conditionally if executionMode attribute has value FutureDated.")

  @Valid

  public LocalDate getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(LocalDate executionDate) {
    this.executionDate = executionDate;
  }

  public TransferDataCurrencyRequiredTax currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Waluta, wymagana wartość PLN / Currency - PLN value required
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Waluta, wymagana wartość PLN / Currency - PLN value required")
  @NotNull

@Size(max=3) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDataCurrencyRequiredTax transferDataCurrencyRequiredTax = (TransferDataCurrencyRequiredTax) o;
    return Objects.equals(this.amount, transferDataCurrencyRequiredTax.amount) &&
        Objects.equals(this.executionDate, transferDataCurrencyRequiredTax.executionDate) &&
        Objects.equals(this.currency, transferDataCurrencyRequiredTax.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, executionDate, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDataCurrencyRequiredTax {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

