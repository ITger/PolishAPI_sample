package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa odpowiedzi na zapytanie o transakcję /  Transaction Detail Response Class
 */
@ApiModel(description = "Klasa odpowiedzi na zapytanie o transakcję /  Transaction Detail Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionDetailResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("baseInfo")
    private TransactionInfo baseInfo = null;

    @JsonProperty("zusInfo")
    private TransactionInfoZUS zusInfo = null;

    @JsonProperty("usInfo")
    private TransactionInfoTax usInfo = null;

    @JsonProperty("cardInfo")
    private TransactionInfoCard cardInfo = null;

    @JsonProperty("currencyDate")
    private OffsetDateTime currencyDate = null;

    @JsonProperty("transactionRate")
    @Valid
    private List<CurrencyRate> transactionRate = null;

    @JsonProperty("baseCurrency")
    private String baseCurrency = null;

    @JsonProperty("amountBaseCurrency")
    private String amountBaseCurrency = null;

    @JsonProperty("usedPaymentInstrumentId")
    private String usedPaymentInstrumentId = null;

    @JsonProperty("tppTransactionId")
    private String tppTransactionId = null;

    @JsonProperty("tppName")
    private String tppName = null;

    @JsonProperty("rejectionReason")
    private String rejectionReason = null;

    @JsonProperty("holdExpirationDate")
    private OffsetDateTime holdExpirationDate = null;

    public TransactionDetailResponse responseHeader(ResponseHeader responseHeader) {
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

    public TransactionDetailResponse baseInfo(TransactionInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    /**
     * Get baseInfo
     *
     * @return baseInfo
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public TransactionInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(TransactionInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public TransactionDetailResponse zusInfo(TransactionInfoZUS zusInfo) {
        this.zusInfo = zusInfo;
        return this;
    }

    /**
     * Get zusInfo
     *
     * @return zusInfo
     **/
    @ApiModelProperty(value = "")

    @Valid

    public TransactionInfoZUS getZusInfo() {
        return zusInfo;
    }

    public void setZusInfo(TransactionInfoZUS zusInfo) {
        this.zusInfo = zusInfo;
    }

    public TransactionDetailResponse usInfo(TransactionInfoTax usInfo) {
        this.usInfo = usInfo;
        return this;
    }

    /**
     * Get usInfo
     *
     * @return usInfo
     **/
    @ApiModelProperty(value = "")

    @Valid

    public TransactionInfoTax getUsInfo() {
        return usInfo;
    }

    public void setUsInfo(TransactionInfoTax usInfo) {
        this.usInfo = usInfo;
    }

    public TransactionDetailResponse cardInfo(TransactionInfoCard cardInfo) {
        this.cardInfo = cardInfo;
        return this;
    }

    /**
     * Get cardInfo
     *
     * @return cardInfo
     **/
    @ApiModelProperty(value = "")

    @Valid

    public TransactionInfoCard getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(TransactionInfoCard cardInfo) {
        this.cardInfo = cardInfo;
    }

    public TransactionDetailResponse currencyDate(OffsetDateTime currencyDate) {
        this.currencyDate = currencyDate;
        return this;
    }

    /**
     * Data kursu waluty, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the currency exchange rate
     *
     * @return currencyDate
     **/
    @ApiModelProperty(value = "Data kursu waluty, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the currency exchange rate")

    @Valid

    public OffsetDateTime getCurrencyDate() {
        return currencyDate;
    }

    public void setCurrencyDate(OffsetDateTime currencyDate) {
        this.currencyDate = currencyDate;
    }

    public TransactionDetailResponse transactionRate(List<CurrencyRate> transactionRate) {
        this.transactionRate = transactionRate;
        return this;
    }

    public TransactionDetailResponse addTransactionRateItem(CurrencyRate transactionRateItem) {
        if (this.transactionRate == null) {
            this.transactionRate = new ArrayList<>();
        }
        this.transactionRate.add(transactionRateItem);
        return this;
    }

    /**
     * Get transactionRate
     *
     * @return transactionRate
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<CurrencyRate> getTransactionRate() {
        return transactionRate;
    }

    public void setTransactionRate(List<CurrencyRate> transactionRate) {
        this.transactionRate = transactionRate;
    }

    public TransactionDetailResponse baseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    /**
     * Waluta oryginalna transakcji, kod ISO / Currency of the transaction, ISO code
     *
     * @return baseCurrency
     **/
    @ApiModelProperty(value = "Waluta oryginalna transakcji, kod ISO / Currency of the transaction, ISO code")

    @Size(max = 3)
    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public TransactionDetailResponse amountBaseCurrency(String amountBaseCurrency) {
        this.amountBaseCurrency = amountBaseCurrency;
        return this;
    }

    /**
     * Kwota w oryginalnej walucie / Amount of the transaction
     *
     * @return amountBaseCurrency
     **/
    @ApiModelProperty(value = "Kwota w oryginalnej walucie / Amount of the transaction")

    @Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
    public String getAmountBaseCurrency() {
        return amountBaseCurrency;
    }

    public void setAmountBaseCurrency(String amountBaseCurrency) {
        this.amountBaseCurrency = amountBaseCurrency;
    }

    public TransactionDetailResponse usedPaymentInstrumentId(String usedPaymentInstrumentId) {
        this.usedPaymentInstrumentId = usedPaymentInstrumentId;
        return this;
    }

    /**
     * Unikalny identyfikator instrumentu płatniczego, za którego pomocą wykonano transakcję / Payment Instrument ID
     *
     * @return usedPaymentInstrumentId
     **/
    @ApiModelProperty(value = "Unikalny identyfikator instrumentu płatniczego, za którego pomocą wykonano transakcję / Payment Instrument ID")

    @Size(max = 32)
    public String getUsedPaymentInstrumentId() {
        return usedPaymentInstrumentId;
    }

    public void setUsedPaymentInstrumentId(String usedPaymentInstrumentId) {
        this.usedPaymentInstrumentId = usedPaymentInstrumentId;
    }

    public TransactionDetailResponse tppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
        return this;
    }

    /**
     * Unikalny identyfikator transakcji po stronie TPP / Transaction ID (TPP)
     *
     * @return tppTransactionId
     **/
    @ApiModelProperty(value = "Unikalny identyfikator transakcji po stronie TPP / Transaction ID (TPP)")

    @Size(max = 64)
    public String getTppTransactionId() {
        return tppTransactionId;
    }

    public void setTppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
    }

    public TransactionDetailResponse tppName(String tppName) {
        this.tppName = tppName;
        return this;
    }

    /**
     * Nazwa TPP / TPP name
     *
     * @return tppName
     **/
    @ApiModelProperty(value = "Nazwa TPP / TPP name")

    @Size(max = 32)
    public String getTppName() {
        return tppName;
    }

    public void setTppName(String tppName) {
        this.tppName = tppName;
    }

    public TransactionDetailResponse rejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }

    /**
     * Przyczyna odrzucenia / Reason for rejection
     *
     * @return rejectionReason
     **/
    @ApiModelProperty(value = "Przyczyna odrzucenia / Reason for rejection")

    @Size(max = 140)
    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public TransactionDetailResponse holdExpirationDate(OffsetDateTime holdExpirationDate) {
        this.holdExpirationDate = holdExpirationDate;
        return this;
    }

    /**
     * Data ważności blokady, YYYY-MM-DDThh:mm:ss[.mmm] / Hold expiration date
     *
     * @return holdExpirationDate
     **/
    @ApiModelProperty(value = "Data ważności blokady, YYYY-MM-DDThh:mm:ss[.mmm] / Hold expiration date")

    @Valid

    public OffsetDateTime getHoldExpirationDate() {
        return holdExpirationDate;
    }

    public void setHoldExpirationDate(OffsetDateTime holdExpirationDate) {
        this.holdExpirationDate = holdExpirationDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionDetailResponse transactionDetailResponse = (TransactionDetailResponse) o;
        return Objects.equals(this.responseHeader, transactionDetailResponse.responseHeader) &&
                Objects.equals(this.baseInfo, transactionDetailResponse.baseInfo) &&
                Objects.equals(this.zusInfo, transactionDetailResponse.zusInfo) &&
                Objects.equals(this.usInfo, transactionDetailResponse.usInfo) &&
                Objects.equals(this.cardInfo, transactionDetailResponse.cardInfo) &&
                Objects.equals(this.currencyDate, transactionDetailResponse.currencyDate) &&
                Objects.equals(this.transactionRate, transactionDetailResponse.transactionRate) &&
                Objects.equals(this.baseCurrency, transactionDetailResponse.baseCurrency) &&
                Objects.equals(this.amountBaseCurrency, transactionDetailResponse.amountBaseCurrency) &&
                Objects.equals(this.usedPaymentInstrumentId, transactionDetailResponse.usedPaymentInstrumentId) &&
                Objects.equals(this.tppTransactionId, transactionDetailResponse.tppTransactionId) &&
                Objects.equals(this.tppName, transactionDetailResponse.tppName) &&
                Objects.equals(this.rejectionReason, transactionDetailResponse.rejectionReason) &&
                Objects.equals(this.holdExpirationDate, transactionDetailResponse.holdExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, baseInfo, zusInfo, usInfo, cardInfo, currencyDate, transactionRate, baseCurrency, amountBaseCurrency, usedPaymentInstrumentId, tppTransactionId, tppName, rejectionReason, holdExpirationDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionDetailResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    zusInfo: ").append(toIndentedString(zusInfo)).append("\n");
        sb.append("    usInfo: ").append(toIndentedString(usInfo)).append("\n");
        sb.append("    cardInfo: ").append(toIndentedString(cardInfo)).append("\n");
        sb.append("    currencyDate: ").append(toIndentedString(currencyDate)).append("\n");
        sb.append("    transactionRate: ").append(toIndentedString(transactionRate)).append("\n");
        sb.append("    baseCurrency: ").append(toIndentedString(baseCurrency)).append("\n");
        sb.append("    amountBaseCurrency: ").append(toIndentedString(amountBaseCurrency)).append("\n");
        sb.append("    usedPaymentInstrumentId: ").append(toIndentedString(usedPaymentInstrumentId)).append("\n");
        sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
        sb.append("    tppName: ").append(toIndentedString(tppName)).append("\n");
        sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
        sb.append("    holdExpirationDate: ").append(toIndentedString(holdExpirationDate)).append("\n");
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

