package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Bazowa klasa dla TransferData / TransferData Base Class
 */
@ApiModel(description = "Bazowa klasa dla TransferData / TransferData Base Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransferDataBaseTax implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("amount")
    private String amount = null;

    @JsonProperty("executionDate")
    private LocalDate executionDate = null;

    public TransferDataBaseTax amount(String amount) {
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

    public TransferDataBaseTax executionDate(LocalDate executionDate) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransferDataBaseTax transferDataBaseTax = (TransferDataBaseTax) o;
        return Objects.equals(this.amount, transferDataBaseTax.amount) &&
                Objects.equals(this.executionDate, transferDataBaseTax.executionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, executionDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferDataBaseTax {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

