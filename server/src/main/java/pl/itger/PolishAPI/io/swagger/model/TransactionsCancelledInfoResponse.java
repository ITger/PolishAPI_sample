package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.PageInfo;
import pl.itger.PolishAPI.io.swagger.model.ResponseHeader;
import pl.itger.PolishAPI.io.swagger.model.TransactionCancelledInfo;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi zawierająca listę transakcji cancelled / Cancelled Transaction Information Response Class
 */
@ApiModel(description = "Klasa odpowiedzi zawierająca listę transakcji cancelled / Cancelled Transaction Information Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionsCancelledInfoResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("transactions")
  @Valid
  private List<TransactionCancelledInfo> transactions = null;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo = null;

  public TransactionsCancelledInfoResponse responseHeader(ResponseHeader responseHeader) {
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

  public TransactionsCancelledInfoResponse transactions(List<TransactionCancelledInfo> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionsCancelledInfoResponse addTransactionsItem(TransactionCancelledInfo transactionsItem) {
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

  public List<TransactionCancelledInfo> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<TransactionCancelledInfo> transactions) {
    this.transactions = transactions;
  }

  public TransactionsCancelledInfoResponse pageInfo(PageInfo pageInfo) {
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
    TransactionsCancelledInfoResponse transactionsCancelledInfoResponse = (TransactionsCancelledInfoResponse) o;
    return Objects.equals(this.responseHeader, transactionsCancelledInfoResponse.responseHeader) &&
        Objects.equals(this.transactions, transactionsCancelledInfoResponse.transactions) &&
        Objects.equals(this.pageInfo, transactionsCancelledInfoResponse.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, transactions, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsCancelledInfoResponse {\n");
    
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

