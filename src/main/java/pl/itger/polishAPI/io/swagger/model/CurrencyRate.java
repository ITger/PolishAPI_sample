package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca kursy przewalutowań / Currency rate
 */
@ApiModel(description = "Klasa zawierająca kursy przewalutowań / Currency rate")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class CurrencyRate  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("rate")
  private Double rate = null;

  @JsonProperty("fromCurrency")
  private String fromCurrency = null;

  @JsonProperty("toCurrency")
  private String toCurrency = null;

  public CurrencyRate rate(Double rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Kursy przewalutowania / Currency exchange rate
   * @return rate
  **/
  @ApiModelProperty(value = "Kursy przewalutowania / Currency exchange rate")


  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public CurrencyRate fromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
    return this;
  }

  /**
   * Waluta rachunku, kod ISO / from Currency, ISO code
   * @return fromCurrency
  **/
  @ApiModelProperty(value = "Waluta rachunku, kod ISO / from Currency, ISO code")

@Size(max=3) 
  public String getFromCurrency() {
    return fromCurrency;
  }

  public void setFromCurrency(String fromCurrency) {
    this.fromCurrency = fromCurrency;
  }

  public CurrencyRate toCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
    return this;
  }

  /**
   * Waluta rachunku, kod ISO / to Currency, ISO code
   * @return toCurrency
  **/
  @ApiModelProperty(value = "Waluta rachunku, kod ISO / to Currency, ISO code")

@Size(max=3) 
  public String getToCurrency() {
    return toCurrency;
  }

  public void setToCurrency(String toCurrency) {
    this.toCurrency = toCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrencyRate currencyRate = (CurrencyRate) o;
    return Objects.equals(this.rate, currencyRate.rate) &&
        Objects.equals(this.fromCurrency, currencyRate.fromCurrency) &&
        Objects.equals(this.toCurrency, currencyRate.toCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, fromCurrency, toCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyRate {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    fromCurrency: ").append(toIndentedString(fromCurrency)).append("\n");
    sb.append("    toCurrency: ").append(toIndentedString(toCurrency)).append("\n");
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

