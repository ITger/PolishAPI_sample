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
 * Klasa opisująca szczegóły transakcji dla płatności podzielonej / Split Payment transaction info class
 */
@ApiModel(description = "Klasa opisująca szczegóły transakcji dla płatności podzielonej / Split Payment transaction info class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class TransactionInfoSp  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("spInvoiceNumber")
  private String spInvoiceNumber = null;

  @JsonProperty("spTaxIdentificationNumber")
  private String spTaxIdentificationNumber = null;

  @JsonProperty("spTaxAmount")
  private String spTaxAmount = null;

  @JsonProperty("spDescription")
  private String spDescription = null;

  public TransactionInfoSp spInvoiceNumber(String spInvoiceNumber) {
    this.spInvoiceNumber = spInvoiceNumber;
    return this;
  }

  /**
   * Numer faktury / Invoice number
   * @return spInvoiceNumber
  **/
  @ApiModelProperty(required = true, value = "Numer faktury / Invoice number")
  @NotNull


  public String getSpInvoiceNumber() {
    return spInvoiceNumber;
  }

  public void setSpInvoiceNumber(String spInvoiceNumber) {
    this.spInvoiceNumber = spInvoiceNumber;
  }

  public TransactionInfoSp spTaxIdentificationNumber(String spTaxIdentificationNumber) {
    this.spTaxIdentificationNumber = spTaxIdentificationNumber;
    return this;
  }

  /**
   * Identyfikator odbiorcy, np. numer NIP / Payment recipient identifier i.e. Tax Identification Number
   * @return spTaxIdentificationNumber
  **/
  @ApiModelProperty(required = true, value = "Identyfikator odbiorcy, np. numer NIP / Payment recipient identifier i.e. Tax Identification Number")
  @NotNull


  public String getSpTaxIdentificationNumber() {
    return spTaxIdentificationNumber;
  }

  public void setSpTaxIdentificationNumber(String spTaxIdentificationNumber) {
    this.spTaxIdentificationNumber = spTaxIdentificationNumber;
  }

  public TransactionInfoSp spTaxAmount(String spTaxAmount) {
    this.spTaxAmount = spTaxAmount;
    return this;
  }

  /**
   * Kwota podatku VAT / Amount of VAT
   * @return spTaxAmount
  **/
  @ApiModelProperty(required = true, value = "Kwota podatku VAT / Amount of VAT")
  @NotNull


  public String getSpTaxAmount() {
    return spTaxAmount;
  }

  public void setSpTaxAmount(String spTaxAmount) {
    this.spTaxAmount = spTaxAmount;
  }

  public TransactionInfoSp spDescription(String spDescription) {
    this.spDescription = spDescription;
    return this;
  }

  /**
   * Opis dodatkowy / Additional description
   * @return spDescription
  **/
  @ApiModelProperty(value = "Opis dodatkowy / Additional description")


  public String getSpDescription() {
    return spDescription;
  }

  public void setSpDescription(String spDescription) {
    this.spDescription = spDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfoSp transactionInfoSp = (TransactionInfoSp) o;
    return Objects.equals(this.spInvoiceNumber, transactionInfoSp.spInvoiceNumber) &&
        Objects.equals(this.spTaxIdentificationNumber, transactionInfoSp.spTaxIdentificationNumber) &&
        Objects.equals(this.spTaxAmount, transactionInfoSp.spTaxAmount) &&
        Objects.equals(this.spDescription, transactionInfoSp.spDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spInvoiceNumber, spTaxIdentificationNumber, spTaxAmount, spDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfoSp {\n");
    
    sb.append("    spInvoiceNumber: ").append(toIndentedString(spInvoiceNumber)).append("\n");
    sb.append("    spTaxIdentificationNumber: ").append(toIndentedString(spTaxIdentificationNumber)).append("\n");
    sb.append("    spTaxAmount: ").append(toIndentedString(spTaxAmount)).append("\n");
    sb.append("    spDescription: ").append(toIndentedString(spDescription)).append("\n");
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

