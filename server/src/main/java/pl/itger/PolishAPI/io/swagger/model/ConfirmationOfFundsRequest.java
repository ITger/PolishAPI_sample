package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RequestHeaderWithoutToken;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o dostępne środki płatnicze na rachunku / Confirmation of Funds Request Class
 */
@ApiModel(description = "Klasa zapytania o dostępne środki płatnicze na rachunku / Confirmation of Funds Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class ConfirmationOfFundsRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderWithoutToken requestHeader = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public ConfirmationOfFundsRequest requestHeader(RequestHeaderWithoutToken requestHeader) {
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

  public RequestHeaderWithoutToken getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderWithoutToken requestHeader) {
    this.requestHeader = requestHeader;
  }

  public ConfirmationOfFundsRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Numer konta / Account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Numer konta / Account number")
  @NotNull

@Size(max=34) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ConfirmationOfFundsRequest amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Wielkość środków której dotyczy zaptanie / Amount of the transaction
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Wielkość środków której dotyczy zaptanie / Amount of the transaction")
  @NotNull

@Pattern(regexp="^(0|([1-9][0-9]{0,}))\\.\\d{2}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public ConfirmationOfFundsRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Kod ISO Waluty (waluta transakcji) / Currency of transaction (ISO)
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Kod ISO Waluty (waluta transakcji) / Currency of transaction (ISO)")
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
    ConfirmationOfFundsRequest confirmationOfFundsRequest = (ConfirmationOfFundsRequest) o;
    return Objects.equals(this.requestHeader, confirmationOfFundsRequest.requestHeader) &&
        Objects.equals(this.accountNumber, confirmationOfFundsRequest.accountNumber) &&
        Objects.equals(this.amount, confirmationOfFundsRequest.amount) &&
        Objects.equals(this.currency, confirmationOfFundsRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, accountNumber, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmationOfFundsRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

