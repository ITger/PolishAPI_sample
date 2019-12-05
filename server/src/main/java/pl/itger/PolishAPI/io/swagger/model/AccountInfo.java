package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa informacji o koncie / Account Information Class
 */
@ApiModel(description = "Klasa informacji o koncie / Account Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
        date = "2019-03-14T19:37:54.479+01:00")
@Document
public class AccountInfo
        implements Serializable {

    @JsonProperty("accountNumber")
    private String accountNumber = null;

    @JsonProperty("nameAddress")
    private NameAddress nameAddress = null;

    @JsonProperty("accountType")
    private DictionaryItem accountType = null;

    @JsonProperty("accountTypeName")
    private String accountTypeName = null;
    @JsonProperty("accountHolderType")
    private AccountHolderTypeEnum accountHolderType = null;
    @JsonProperty("accountNameClient")
    private String accountNameClient = null;
    @JsonProperty("currency")
    private String currency = null;
    @JsonProperty("availableBalance")
    private String availableBalance = null;
    @JsonProperty("bookingBalance")
    private String bookingBalance = null;
    @JsonProperty("bank")
    private BankAccountInfo bank = null;
    @JsonProperty("psuRelations")

    private List<AccountPsuRelation> psuRelations = new ArrayList<>();
    @JsonProperty("auxData")
    private java.util.Map<?, ?> auxData = null;

    public AccountInfo accountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * Numer rachunku / Account number
     *
     * @return accountNumber
     */
    @ApiModelProperty(required = true,
            value = "Numer rachunku / Account number")
    @NotNull

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountInfo nameAddress(NameAddress nameAddress) {
        this.nameAddress = nameAddress;
        return this;
    }

    /**
     * Get nameAddress
     *
     * @return nameAddress
     */
    @ApiModelProperty(required = true,
            value = "")
    @NotNull

    @Valid

    public NameAddress getNameAddress() {
        return nameAddress;
    }

    public void setNameAddress(NameAddress nameAddress) {
        this.nameAddress = nameAddress;
    }

    public AccountInfo accountType(DictionaryItem accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     *
     * @return accountType
     */
    @ApiModelProperty(required = true,
            value = "")
    @NotNull

    @Valid

    public DictionaryItem getAccountType() {
        return accountType;
    }

    public void setAccountType(DictionaryItem accountType) {
        this.accountType = accountType;
    }

    public AccountInfo accountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
        return this;
    }

    /**
     * Nazwa typu rachunku (definiowana przez ASPSP) / Account's type name (defined
     * by ASPSP)
     *
     * @return accountTypeName
     */
    @ApiModelProperty(
            value = "Nazwa typu rachunku (definiowana przez ASPSP) / Account's type name (defined by ASPSP)")

    @Size(max = 32)
    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public AccountInfo accountHolderType(AccountHolderTypeEnum accountHolderType) {
        this.accountHolderType = accountHolderType;
        return this;
    }

    /**
     * Rodzaj posiadacza rachunku: osoba fizyczna lub osoba prawna / Account holder
     * type: individual person or corporation
     *
     * @return accountHolderType
     */
    @ApiModelProperty(required = true,
            value = "Rodzaj posiadacza rachunku: osoba fizyczna lub osoba prawna / Account holder type: individual person or corporation")
    @NotNull

    public AccountHolderTypeEnum getAccountHolderType() {
        return accountHolderType;
    }

    public void setAccountHolderType(AccountHolderTypeEnum accountHolderType) {
        this.accountHolderType = accountHolderType;
    }

    public AccountInfo accountNameClient(String accountNameClient) {
        this.accountNameClient = accountNameClient;
        return this;
    }

    /**
     * Nazwa konta ustawiona przez klienta / Account name set by the client
     *
     * @return accountNameClient
     */
    @ApiModelProperty(
            value = "Nazwa konta ustawiona przez klienta / Account name set by the client")

    @Size(max = 32)
    public String getAccountNameClient() {
        return accountNameClient;
    }

    public void setAccountNameClient(String accountNameClient) {
        this.accountNameClient = accountNameClient;
    }

    public AccountInfo currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Waluta rachunku / Currency
     *
     * @return currency
     */
    @ApiModelProperty(required = true,
            value = "Waluta rachunku / Currency")
    @NotNull

    @Size(max = 3)
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountInfo availableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }

    /**
     * Dostępne środki - po wykonaniu transakcji / Available funds
     *
     * @return availableBalance
     */
    @ApiModelProperty(required = true,
            value = "Dostępne środki - po wykonaniu transakcji / Available funds")
    @NotNull

    @Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
    }

    public AccountInfo bookingBalance(String bookingBalance) {
        this.bookingBalance = bookingBalance;
        return this;
    }

    /**
     * Saldo księgowe rachunku - po wykonaniu transakcji / Book balance of the
     * account
     *
     * @return bookingBalance
     */
    @ApiModelProperty(required = true,
            value = "Saldo księgowe rachunku - po wykonaniu transakcji / Book balance of the account")
    @NotNull

    @Pattern(regexp = "^-?(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getBookingBalance() {
        return bookingBalance;
    }

    public void setBookingBalance(String bookingBalance) {
        this.bookingBalance = bookingBalance;
    }

    public AccountInfo bank(BankAccountInfo bank) {
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

    public BankAccountInfo getBank() {
        return bank;
    }

    public void setBank(BankAccountInfo bank) {
        this.bank = bank;
    }

    public AccountInfo psuRelations(List<AccountPsuRelation> psuRelations) {
        this.psuRelations = psuRelations;
        return this;
    }

    public AccountInfo addPsuRelationsItem(AccountPsuRelation psuRelationsItem) {
        this.psuRelations.add(psuRelationsItem);
        return this;
    }

    /**
     * Informacje na temat relacji PSU do rachunku / Description of relations
     * between PSU and an Account
     *
     * @return psuRelations
     */
    @ApiModelProperty(required = true,
            value = "Informacje na temat relacji PSU do rachunku / Description of relations between PSU and an Account")
    @NotNull

    @Valid
    @Size(min = 1)
    public List<AccountPsuRelation> getPsuRelations() {
        return psuRelations;
    }

    public void setPsuRelations(List<AccountPsuRelation> psuRelations) {
        this.psuRelations = psuRelations;
    }

    public AccountInfo auxData(java.util.Map auxData) {
        this.auxData = auxData;
        return this;
    }

    /**
     * Get auxData
     *
     * @return auxData
     */
    @ApiModelProperty(value = "")

    @Valid

    public java.util.Map getAuxData() {
        return auxData;
    }

    public void setAuxData(java.util.Map auxData) {
        this.auxData = auxData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) o;
        return Objects.equals(this.accountNumber,
                accountInfo.accountNumber)
                && Objects.equals(this.nameAddress,
                accountInfo.nameAddress)
                && Objects.equals(this.accountType,
                accountInfo.accountType)
                && Objects.equals(this.accountTypeName,
                accountInfo.accountTypeName)
                && Objects.equals(this.accountHolderType,
                accountInfo.accountHolderType)
                && Objects.equals(this.accountNameClient,
                accountInfo.accountNameClient)
                && Objects.equals(this.currency,
                accountInfo.currency)
                && Objects.equals(this.availableBalance,
                accountInfo.availableBalance)
                && Objects.equals(this.bookingBalance,
                accountInfo.bookingBalance)
                && Objects.equals(this.bank,
                accountInfo.bank)
                && Objects.equals(this.psuRelations,
                accountInfo.psuRelations)
                && Objects.equals(this.auxData,
                accountInfo.auxData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber,
                nameAddress,
                accountType,
                accountTypeName,
                accountHolderType,
                accountNameClient,
                currency,
                availableBalance,
                bookingBalance,
                bank,
                psuRelations,
                auxData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInfo {\n");

        sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).
                append("\n");
        sb.append("    nameAddress: ").append(toIndentedString(nameAddress)).append(
                "\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append(
                "\n");
        sb.append("    accountTypeName: ").append(toIndentedString(accountTypeName)).
                append("\n");
        sb.append("    accountHolderType: ").append(toIndentedString(
                accountHolderType)).append("\n");
        sb.append("    accountNameClient: ").append(toIndentedString(
                accountNameClient)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    availableBalance: ").append(
                toIndentedString(availableBalance)).append("\n");
        sb.append("    bookingBalance: ").append(toIndentedString(bookingBalance)).
                append("\n");
        sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
        sb.append("    psuRelations: ").append(toIndentedString(psuRelations)).
                append("\n");
        sb.append("    auxData: ").append(toIndentedString(auxData)).append("\n");
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

    /**
     * Rodzaj posiadacza rachunku: osoba fizyczna lub osoba prawna / Account holder
     * type: individual person or corporation
     */
    @JsonFormat(shape = JsonFormat.Shape.OBJECT)
    public enum AccountHolderTypeEnum {
        INDIVIDUAL("individual"),

        CORPORATION("corporation");

        private String value;

        AccountHolderTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static AccountHolderTypeEnum fromValue(String text) {
            for (AccountHolderTypeEnum b : AccountHolderTypeEnum.values()) {
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
