package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Klasa zapytania o elementy (transakcje lub blokady) / Element (transaction or hold) Information Request Class
 */
@ApiModel(description = "Klasa zapytania o elementy (transakcje lub blokady) / Element (transaction or hold) Information Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class HoldRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderAISCallback requestHeader = null;

    @JsonProperty("accountNumber")
    private String accountNumber = null;

    @JsonProperty("itemIdFrom")
    private String itemIdFrom = null;

    @JsonProperty("transactionDateFrom")
    private LocalDate transactionDateFrom = null;

    @JsonProperty("transactionDateTo")
    private LocalDate transactionDateTo = null;

    @JsonProperty("bookingDateFrom")
    private LocalDate bookingDateFrom = null;

    @JsonProperty("bookingDateTo")
    private LocalDate bookingDateTo = null;

    @JsonProperty("minAmount")
    private String minAmount = null;

    @JsonProperty("maxAmount")
    private String maxAmount = null;

    @JsonProperty("pageId")
    private String pageId = null;

    @JsonProperty("perPage")
    private Integer perPage = null;
    @JsonProperty("type")
    private TypeEnum type = null;

    public HoldRequest requestHeader(RequestHeaderAISCallback requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * Get requestHeader
     *
     * @return requestHeader
     **/
    @ApiModelProperty(value = "")

    @Valid

    public RequestHeaderAISCallback getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeaderAISCallback requestHeader) {
        this.requestHeader = requestHeader;
    }

    public HoldRequest accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Numer rachunku / Account number
     *
     * @return accountNumber
     **/
    @ApiModelProperty(value = "Numer rachunku / Account number")


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public HoldRequest itemIdFrom(String itemIdFrom) {
        this.itemIdFrom = itemIdFrom;
        return this;
    }

    /**
     * Element filtru: elementy od podanego identyfikatora (transakcji lub blokady) / Filter element - id of transaction or hold to start from
     *
     * @return itemIdFrom
     **/
    @ApiModelProperty(value = "Element filtru: elementy od podanego identyfikatora (transakcji lub blokady) / Filter element - id of transaction or hold to start from")

    @Size(max = 64)
    public String getItemIdFrom() {
        return itemIdFrom;
    }

    public void setItemIdFrom(String itemIdFrom) {
        this.itemIdFrom = itemIdFrom;
    }

    public HoldRequest transactionDateFrom(LocalDate transactionDateFrom) {
        this.transactionDateFrom = transactionDateFrom;
        return this;
    }

    /**
     * Element filtru: data transakcji od, YYYY-MM-DD / Filter element
     *
     * @return transactionDateFrom
     **/
    @ApiModelProperty(value = "Element filtru: data transakcji od, YYYY-MM-DD / Filter element")

    @Valid

    public LocalDate getTransactionDateFrom() {
        return transactionDateFrom;
    }

    public void setTransactionDateFrom(LocalDate transactionDateFrom) {
        this.transactionDateFrom = transactionDateFrom;
    }

    public HoldRequest transactionDateTo(LocalDate transactionDateTo) {
        this.transactionDateTo = transactionDateTo;
        return this;
    }

    /**
     * Element filtru: data transakcji do, YYYY-MM-DD / Filter element
     *
     * @return transactionDateTo
     **/
    @ApiModelProperty(value = "Element filtru: data transakcji do, YYYY-MM-DD / Filter element")

    @Valid

    public LocalDate getTransactionDateTo() {
        return transactionDateTo;
    }

    public void setTransactionDateTo(LocalDate transactionDateTo) {
        this.transactionDateTo = transactionDateTo;
    }

    public HoldRequest bookingDateFrom(LocalDate bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
        return this;
    }

    /**
     * Element filtru: data księgowania od, YYYY-MM-DD. Ignorowane w przypadku pobierania listy blokad. / Filter element. Ignored during list of holds retrieval.
     *
     * @return bookingDateFrom
     **/
    @ApiModelProperty(value = "Element filtru: data księgowania od, YYYY-MM-DD. Ignorowane w przypadku pobierania listy blokad. / Filter element. Ignored during list of holds retrieval.")

    @Valid

    public LocalDate getBookingDateFrom() {
        return bookingDateFrom;
    }

    public void setBookingDateFrom(LocalDate bookingDateFrom) {
        this.bookingDateFrom = bookingDateFrom;
    }

    public HoldRequest bookingDateTo(LocalDate bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
        return this;
    }

    /**
     * Element filtru: data księgowania do, YYYY-MM-DD. Ignorowane w przypadku pobierania listy blokad. / Filter element. Ignored during list of holds retrieval.
     *
     * @return bookingDateTo
     **/
    @ApiModelProperty(value = "Element filtru: data księgowania do, YYYY-MM-DD. Ignorowane w przypadku pobierania listy blokad. / Filter element. Ignored during list of holds retrieval.")

    @Valid

    public LocalDate getBookingDateTo() {
        return bookingDateTo;
    }

    public void setBookingDateTo(LocalDate bookingDateTo) {
        this.bookingDateTo = bookingDateTo;
    }

    public HoldRequest minAmount(String minAmount) {
        this.minAmount = minAmount;
        return this;
    }

    /**
     * Element filtru: kwota od / Filter element
     *
     * @return minAmount
     **/
    @ApiModelProperty(value = "Element filtru: kwota od / Filter element")

    @Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(String minAmount) {
        this.minAmount = minAmount;
    }

    public HoldRequest maxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
        return this;
    }

    /**
     * Element filtru: kwota do / Filter element
     *
     * @return maxAmount
     **/
    @ApiModelProperty(value = "Element filtru: kwota do / Filter element")

    @Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(String maxAmount) {
        this.maxAmount = maxAmount;
    }

    public HoldRequest pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    /**
     * Używane w celu stronicowania danych: identyfikator strony, która ma zostać zwrócona w odpowiedzi / Used for paging the results. Identifier of the page to be returned in the response.
     *
     * @return pageId
     **/
    @ApiModelProperty(value = "Używane w celu stronicowania danych: identyfikator strony, która ma zostać zwrócona w odpowiedzi / Used for paging the results. Identifier of the page to be returned in the response.")


    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public HoldRequest perPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * Używane w celu stronicowania danych: wielkość strony danych / Page size (paging info)
     * minimum: 1
     *
     * @return perPage
     **/
    @ApiModelProperty(value = "Używane w celu stronicowania danych: wielkość strony danych / Page size (paging info)")

    @Min(1)
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public HoldRequest type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Element filtru: transakcji / Filter element
     *
     * @return type
     **/
    @ApiModelProperty(value = "Element filtru: transakcji / Filter element")


    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HoldRequest holdRequest = (HoldRequest) o;
        return Objects.equals(this.requestHeader, holdRequest.requestHeader) &&
                Objects.equals(this.accountNumber, holdRequest.accountNumber) &&
                Objects.equals(this.itemIdFrom, holdRequest.itemIdFrom) &&
                Objects.equals(this.transactionDateFrom, holdRequest.transactionDateFrom) &&
                Objects.equals(this.transactionDateTo, holdRequest.transactionDateTo) &&
                Objects.equals(this.bookingDateFrom, holdRequest.bookingDateFrom) &&
                Objects.equals(this.bookingDateTo, holdRequest.bookingDateTo) &&
                Objects.equals(this.minAmount, holdRequest.minAmount) &&
                Objects.equals(this.maxAmount, holdRequest.maxAmount) &&
                Objects.equals(this.pageId, holdRequest.pageId) &&
                Objects.equals(this.perPage, holdRequest.perPage) &&
                Objects.equals(this.type, holdRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, accountNumber, itemIdFrom, transactionDateFrom, transactionDateTo, bookingDateFrom, bookingDateTo, minAmount, maxAmount, pageId, perPage, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HoldRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    itemIdFrom: ").append(toIndentedString(itemIdFrom)).append("\n");
        sb.append("    transactionDateFrom: ").append(toIndentedString(transactionDateFrom)).append("\n");
        sb.append("    transactionDateTo: ").append(toIndentedString(transactionDateTo)).append("\n");
        sb.append("    bookingDateFrom: ").append(toIndentedString(bookingDateFrom)).append("\n");
        sb.append("    bookingDateTo: ").append(toIndentedString(bookingDateTo)).append("\n");
        sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
        sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
        sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    /**
     * Element filtru: transakcji / Filter element
     */
    public enum TypeEnum {
        DEBIT("DEBIT");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

