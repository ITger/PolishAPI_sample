package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zawierająca dane odbiorcy używana w żądaniach PIS / PIS Recipient Data Class
 */
@ApiModel(description = "Klasa zawierająca dane odbiorcy używana w żądaniach PIS / PIS Recipient Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecipientPIS implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("accountNumber")
    private String accountNumber = null;

    @JsonProperty("nameAddress")
    private NameAddress nameAddress = null;

    public RecipientPIS accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Get accountNumber
     *
     * @return accountNumber
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Size(max = 34)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public RecipientPIS nameAddress(NameAddress nameAddress) {
        this.nameAddress = nameAddress;
        return this;
    }

    /**
     * Get nameAddress
     *
     * @return nameAddress
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public NameAddress getNameAddress() {
        return nameAddress;
    }

    public void setNameAddress(NameAddress nameAddress) {
        this.nameAddress = nameAddress;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecipientPIS recipientPIS = (RecipientPIS) o;
        return Objects.equals(this.accountNumber, recipientPIS.accountNumber) &&
                Objects.equals(this.nameAddress, recipientPIS.nameAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, nameAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecipientPIS {\n");

        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
        sb.append("    nameAddress: ").append(toIndentedString(nameAddress)).append("\n");
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

