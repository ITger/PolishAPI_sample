package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pl.itger.polishAPI.io.swagger.model.PageInfo;
import pl.itger.polishAPI.io.swagger.model.ResponseHeader;
import pl.itger.polishAPI.io.swagger.model.TransactionPendingInfo;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi zawierająca listę oczekujących transakcji / Class of response with the list of pending transactions
 */
@ApiModel(description = "Klasa odpowiedzi zawierająca listę oczekujących transakcji / Class of response with the list of pending transactions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class TransactionPendingInfoResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("transactions")
  @Valid
  private List<TransactionPendingInfo> transactions = null;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo = null;

  public TransactionPendingInfoResponse responseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
    return this;
  }

  /**
   * Get responseHeader
   * @return responseHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseHeader getResponseHeader() {
    return responseHeader;
  }

  public void setResponseHeader(ResponseHeader responseHeader) {
    this.responseHeader = responseHeader;
  }

  public TransactionPendingInfoResponse transactions(List<TransactionPendingInfo> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionPendingInfoResponse addTransactionsItem(TransactionPendingInfo transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

  /**
   * Get transactions
   * @return transactions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TransactionPendingInfo> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionPendingInfo> transactions) {
    this.transactions = transactions;
  }

  public TransactionPendingInfoResponse pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   * @return pageInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionPendingInfoResponse transactionPendingInfoResponse = (TransactionPendingInfoResponse) o;
    return Objects.equals(this.responseHeader, transactionPendingInfoResponse.responseHeader) &&
        Objects.equals(this.transactions, transactionPendingInfoResponse.transactions) &&
        Objects.equals(this.pageInfo, transactionPendingInfoResponse.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, transactions, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionPendingInfoResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

