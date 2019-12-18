package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Klasa zawierająca dane przelewu / Transfer Data Class
 */
@ApiModel(description = "Klasa zawierająca dane przelewu / Transfer Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransferDataCurrencyRequired implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("amount")
    private String amount = null;

    @JsonProperty("executionDate")
    private LocalDate executionDate = null;

    @JsonProperty("currency")
    private String currency = null;

    public TransferDataCurrencyRequired description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Pole opisujące przelew / Description
     *
     * @return description
     **/
    @ApiModelProperty(required = true, value = "Pole opisujące przelew / Description")
    @NotNull

    @Size(max = 140)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransferDataCurrencyRequired amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Kwota przelewu / Amount
     *
     * @return amount
     **/
    @ApiModelProperty(required = true, value = "Kwota przelewu / Amount")
    @NotNull

    @Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TransferDataCurrencyRequired executionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
        return this;
    }

    /**
     * Data wykonania przelewu. Wymagany pod warunkiem przekazania wartości FutureDated w atrybucie executionMode. Format: YYYY-MM-DD / Date when the transfer is to be executed (YYYY-MM-DD). Required conditionally if executionMode attribute has value FutureDated.
     *
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

    public TransferDataCurrencyRequired currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Waluta, domyślnie EUR przelewów zagranicznych / Currency
     *
     * @return currency
     **/
    @ApiModelProperty(required = true, value = "Waluta, domyślnie EUR przelewów zagranicznych / Currency")
    @NotNull

    @Size(max = 3)
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
        TransferDataCurrencyRequired transferDataCurrencyRequired = (TransferDataCurrencyRequired) o;
        return Objects.equals(this.description, transferDataCurrencyRequired.description) &&
                Objects.equals(this.amount, transferDataCurrencyRequired.amount) &&
                Objects.equals(this.executionDate, transferDataCurrencyRequired.executionDate) &&
                Objects.equals(this.currency, transferDataCurrencyRequired.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, amount, executionDate, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferDataCurrencyRequired {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

