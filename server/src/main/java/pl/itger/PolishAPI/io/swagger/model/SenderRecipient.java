package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zawierająca dane nadawcy/odbiorcy używana w żądaniach AIS / AIS Sender
 * Recipient Data Class
 */
@ApiModel(
        description = "Klasa zawierająca dane nadawcy/odbiorcy używana w żądaniach AIS / AIS Sender Recipient Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
        date = "2019-03-14T19:37:54.479+01:00")
@Document
public class SenderRecipient
        implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    @JsonProperty("accountNumber")
    private String accountNumber = null;

    @JsonProperty("accountMassPayment")
    private String accountMassPayment = null;

    @JsonProperty("bank")
    private Bank bank = null;

    @JsonProperty("nameAddress")
    private NameAddress nameAddress = null;

    public SenderRecipient accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Numer konta nadawcy/odbiorcy / Account number
     *
     * @return accountNumber
     */
    @ApiModelProperty(value = "Numer konta nadawcy/odbiorcy / Account number")

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SenderRecipient accountMassPayment(String accountMassPayment) {
        this.accountMassPayment = accountMassPayment;
        return this;
    }

    /**
     * Numer wirtualny rachunku odbiorcy w formacie / Virtual account name
     *
     * @return accountMassPayment
     */
    @ApiModelProperty(
            value = "Numer wirtualny rachunku odbiorcy w formacie / Virtual account name")

    public String getAccountMassPayment() {
        return accountMassPayment;
    }

    public void setAccountMassPayment(String accountMassPayment) {
        this.accountMassPayment = accountMassPayment;
    }

    public SenderRecipient bank(Bank bank) {
        this.bank = bank;
        return this;
    }

    /**
     * Get bank
     *
     * @return bank
     */
    @ApiModelProperty(value = "")

    @Valid

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public SenderRecipient nameAddress(NameAddress nameAddress) {
        this.nameAddress = nameAddress;
        return this;
    }

    /**
     * Get nameAddress
     *
     * @return nameAddress
     */
    @ApiModelProperty(value = "")

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
        SenderRecipient senderRecipient = (SenderRecipient) o;
        return Objects.equals(this.accountNumber,
                senderRecipient.accountNumber)
                && Objects.equals(this.accountMassPayment,
                senderRecipient.accountMassPayment)
                && Objects.equals(this.bank,
                senderRecipient.bank)
                && Objects.equals(this.nameAddress,
                senderRecipient.nameAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber,
                accountMassPayment,
                bank,
                nameAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SenderRecipient {\n");

        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).
                append("\n");
        sb.append("    accountMassPayment: ").append(toIndentedString(
                accountMassPayment)).append("\n");
        sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
        sb.append("    nameAddress: ").append(toIndentedString(nameAddress)).append(
                "\n");
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
        return o.toString().replace("\n",
                "\n    ");
    }
}
