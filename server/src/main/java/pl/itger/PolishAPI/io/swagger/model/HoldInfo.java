package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Klasa opisująca blokadę na rachunku / Hold info class
 */
@ApiModel(description = "Klasa opisująca blokadę na rachunku / Hold info class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
                            date = "2019-03-14T19:37:54.479+01:00")
@Document
public class HoldInfo
        implements Serializable {

private static final long serialVersionUID = 1L;

@Id
@JsonProperty("itemId")
private String itemId = null;

@JsonProperty("amount")
private String amount = null;

@JsonProperty("currency")
private String currency = null;

@JsonProperty("description")
private String description = null;

@JsonProperty("transactionType")
private String transactionType = null;

@JsonProperty("tradeDate")
private OffsetDateTime tradeDate = null;

@JsonProperty("mcc")
private String mcc = null;

@JsonProperty("auxData")
private java.util.Map auxData = null;

@JsonProperty("holdExpirationDate")
private OffsetDateTime holdExpirationDate = null;

@JsonProperty("initiator")
private NameAddress initiator = null;

@JsonProperty("sender")
private SenderRecipient sender = null;

@JsonProperty("recipient")
private SenderRecipient recipient = null;

public HoldInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
}

/**
 * ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element
 * (transaction or hold) ID (ASPSP)
 *
 * @return itemId
  *
 */
@ApiModelProperty(required = true,
                  value = "ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element (transaction or hold) ID (ASPSP)")
@NotNull

@Size(max = 64)
public String getItemId() {
    return itemId;
}

public void setItemId(String itemId) {
    this.itemId = itemId;
}

public HoldInfo amount(String amount) {
    this.amount = amount;
    return this;
}

/**
 * Kwota transakcji / Amount of the transaction
 *
 * @return amount
  *
 */
@ApiModelProperty(required = true,
                  value = "Kwota transakcji / Amount of the transaction")
@NotNull

@Pattern(regexp = "^(0|([1-9][0-9]{0,}))\\.\\d{2}$")
public String getAmount() {
    return amount;
}

public void setAmount(String amount) {
    this.amount = amount;
}

public HoldInfo currency(String currency) {
    this.currency = currency;
    return this;
}

/**
 * Kod ISO waluty transakcji / Currency (ISO)
 *
 * @return currency
  *
 */
@ApiModelProperty(value = "Kod ISO waluty transakcji / Currency (ISO)")

@Size(max = 3)
public String getCurrency() {
    return currency;
}

public void setCurrency(String currency) {
    this.currency = currency;
}

public HoldInfo description(String description) {
    this.description = description;
    return this;
}

/**
 * Tytuł transakcji / Description of the transaction
 *
 * @return description
  *
 */
@ApiModelProperty(value = "Tytuł transakcji / Description of the transaction")

@Size(max = 140)
public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public HoldInfo transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
}

/**
 * Typ transakcji / Transaction type
 *
 * @return transactionType
  *
 */
@ApiModelProperty(value = "Typ transakcji / Transaction type")

@Size(max = 100)
public String getTransactionType() {
    return transactionType;
}

public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
}

public HoldInfo tradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
    return this;
}

/**
 * Data operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the operation
 *
 * @return tradeDate
  *
 */
@ApiModelProperty(
        value = "Data operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the operation")

@Valid

public OffsetDateTime getTradeDate() {
    return tradeDate;
}

public void setTradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
}

public HoldInfo mcc(String mcc) {
    this.mcc = mcc;
    return this;
}

/**
 * Kod dla każdej transakcji/operacji wykonanej przy użyciu karty / A code of
 * each transaction performed by card
 *
 * @return mcc
  *
 */
@ApiModelProperty(
        value = "Kod dla każdej transakcji/operacji wykonanej przy użyciu karty / A code of each transaction performed by card")

public String getMcc() {
    return mcc;
}

public void setMcc(String mcc) {
    this.mcc = mcc;
}

public HoldInfo auxData(java.util.Map auxData) {
    this.auxData = auxData;
    return this;
}

/**
 * Get auxData
 *
 * @return auxData
  *
 */
@ApiModelProperty(value = "")

@Valid

public java.util.Map getAuxData() {
    return auxData;
}

public void setAuxData(java.util.Map auxData) {
    this.auxData = auxData;
}

public HoldInfo holdExpirationDate(OffsetDateTime holdExpirationDate) {
    this.holdExpirationDate = holdExpirationDate;
    return this;
}

/**
 * Data ważności blokady, YYYY-MM-DDThh:mm:ss[.mmm]
 *
 * @return holdExpirationDate
  *
 */
@ApiModelProperty(value = "Data ważności blokady, YYYY-MM-DDThh:mm:ss[.mmm]")

@Valid

public OffsetDateTime getHoldExpirationDate() {
    return holdExpirationDate;
}

public void setHoldExpirationDate(OffsetDateTime holdExpirationDate) {
    this.holdExpirationDate = holdExpirationDate;
}

public HoldInfo initiator(NameAddress initiator) {
    this.initiator = initiator;
    return this;
}

/**
 * Get initiator
 *
 * @return initiator
  *
 */
@ApiModelProperty(value = "")

@Valid

public NameAddress getInitiator() {
    return initiator;
}

public void setInitiator(NameAddress initiator) {
    this.initiator = initiator;
}

public HoldInfo sender(SenderRecipient sender) {
    this.sender = sender;
    return this;
}

/**
 * Get sender
 *
 * @return sender
  *
 */
@ApiModelProperty(value = "")

@Valid

public SenderRecipient getSender() {
    return sender;
}

public void setSender(SenderRecipient sender) {
    this.sender = sender;
}

public HoldInfo recipient(SenderRecipient recipient) {
    this.recipient = recipient;
    return this;
}

/**
 * Get recipient
 *
 * @return recipient
  *
 */
@ApiModelProperty(value = "")

@Valid

public SenderRecipient getRecipient() {
    return recipient;
}

public void setRecipient(SenderRecipient recipient) {
    this.recipient = recipient;
}

@Override
public boolean equals(java.lang.Object o) {
    if (this == o) {
        return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    HoldInfo holdInfo = (HoldInfo) o;
    return Objects.equals(this.itemId,
                          holdInfo.itemId)
            && Objects.equals(this.amount,
                              holdInfo.amount)
            && Objects.equals(this.currency,
                              holdInfo.currency)
            && Objects.equals(this.description,
                              holdInfo.description)
            && Objects.equals(this.transactionType,
                              holdInfo.transactionType)
            && Objects.equals(this.tradeDate,
                              holdInfo.tradeDate)
            && Objects.equals(this.mcc,
                              holdInfo.mcc)
            && Objects.equals(this.auxData,
                              holdInfo.auxData)
            && Objects.equals(this.holdExpirationDate,
                              holdInfo.holdExpirationDate)
            && Objects.equals(this.initiator,
                              holdInfo.initiator)
            && Objects.equals(this.sender,
                              holdInfo.sender)
            && Objects.equals(this.recipient,
                              holdInfo.recipient);
}

@Override
public int hashCode() {
    return Objects.hash(itemId,
                        amount,
                        currency,
                        description,
                        transactionType,
                        tradeDate,
                        mcc,
                        auxData,
                        holdExpirationDate,
                        initiator,
                        sender,
                        recipient);
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldInfo {\n");

    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append(
            "\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).
            append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).
            append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    auxData: ").append(toIndentedString(auxData)).append("\n");
    sb.append("    holdExpirationDate: ").append(toIndentedString(
            holdExpirationDate)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).
            append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).
            append("\n");
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
