package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa odpowiedzi zawierająca listę transakcji rejected / Rejected Transaction Information Response Class
 */
@ApiModel(description = "Klasa odpowiedzi zawierająca listę transakcji rejected / Rejected Transaction Information Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionRejectedInfoResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("transactions")
    @Valid
    private List<TransactionRejectedInfo> transactions = null;

    @JsonProperty("pageInfo")
    private PageInfo pageInfo = null;

    public TransactionRejectedInfoResponse responseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
        return this;
    }

    /**
     * Get responseHeader
     *
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

    public TransactionRejectedInfoResponse transactions(List<TransactionRejectedInfo> transactions) {
        this.transactions = transactions;
        return this;
    }

    public TransactionRejectedInfoResponse addTransactionsItem(TransactionRejectedInfo transactionsItem) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(transactionsItem);
        return this;
    }

    /**
     * Get transactions
     *
     * @return transactions
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<TransactionRejectedInfo> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionRejectedInfo> transactions) {
        this.transactions = transactions;
    }

    public TransactionRejectedInfoResponse pageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    /**
     * Get pageInfo
     *
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
        TransactionRejectedInfoResponse transactionRejectedInfoResponse = (TransactionRejectedInfoResponse) o;
        return Objects.equals(this.responseHeader, transactionRejectedInfoResponse.responseHeader) &&
                Objects.equals(this.transactions, transactionRejectedInfoResponse.transactions) &&
                Objects.equals(this.pageInfo, transactionRejectedInfoResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, transactions, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionRejectedInfoResponse {\n");

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

