package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa reprezentująca informacje o karcie w ramach transakcji / Transaction Card Information Class
 */
@ApiModel(description = "Klasa reprezentująca informacje o karcie w ramach transakcji / Transaction Card Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class TransactionInfoCard   {
  @JsonProperty("cardHolder")
  private String cardHolder = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  public TransactionInfoCard cardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

  /**
   * Właściciel karty / Card holder
   * @return cardHolder
  **/
  @ApiModelProperty(value = "Właściciel karty / Card holder")


  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(String cardHolder) {
    this.cardHolder = cardHolder;
  }

  public TransactionInfoCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Numer karty / Card number
   * @return cardNumber
  **/
  @ApiModelProperty(value = "Numer karty / Card number")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfoCard transactionInfoCard = (TransactionInfoCard) o;
    return Objects.equals(this.cardHolder, transactionInfoCard.cardHolder) &&
        Objects.equals(this.cardNumber, transactionInfoCard.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardHolder, cardNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfoCard {\n");
    
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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

