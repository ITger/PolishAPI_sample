package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RequestHeaderAIS;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o pojedynczą transakcję / Transaction Detail Request Class
 */
@ApiModel(description = "Klasa zapytania o pojedynczą transakcję / Transaction Detail Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionDetailRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderAIS requestHeader = null;

  @JsonProperty("itemId")
  private String itemId = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("bookingDate")
  private OffsetDateTime bookingDate = null;

  public TransactionDetailRequest requestHeader(RequestHeaderAIS requestHeader) {
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

  public RequestHeaderAIS getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderAIS requestHeader) {
    this.requestHeader = requestHeader;
  }

  public TransactionDetailRequest itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element (transaction or hold) ID (ASPSP)
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element (transaction or hold) ID (ASPSP)")
  @NotNull

@Size(max=64) 
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public TransactionDetailRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Numer konta nadawcy / Sender account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Numer konta nadawcy / Sender account number")
  @NotNull

@Size(max=34) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public TransactionDetailRequest bookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Data zaksięgowania operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Transaction booking date
   * @return bookingDate
  **/
  @ApiModelProperty(value = "Data zaksięgowania operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Transaction booking date")

  @Valid

  public OffsetDateTime getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(OffsetDateTime bookingDate) {
    this.bookingDate = bookingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionDetailRequest transactionDetailRequest = (TransactionDetailRequest) o;
    return Objects.equals(this.requestHeader, transactionDetailRequest.requestHeader) &&
        Objects.equals(this.itemId, transactionDetailRequest.itemId) &&
        Objects.equals(this.accountNumber, transactionDetailRequest.accountNumber) &&
        Objects.equals(this.bookingDate, transactionDetailRequest.bookingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, itemId, accountNumber, bookingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionDetailRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
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

