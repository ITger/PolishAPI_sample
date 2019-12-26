package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import pl.itger.polishAPI.io.swagger.model.DictionaryItem;
import pl.itger.polishAPI.io.swagger.model.ItemInfoBase;
import pl.itger.polishAPI.io.swagger.model.NameAddress;
import pl.itger.polishAPI.io.swagger.model.SenderRecipient;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa opisująca zaplanowaną transakcję płatniczą / Class describing scheduled payment transaction
 */
@ApiModel(description = "Klasa opisująca zaplanowaną transakcję płatniczą / Class describing scheduled payment transaction")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class TransactionScheduledInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

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

  /**
   * Kategoria transakcji uznanie/obciążenie / Transaction category (credit/debit)
   */
  public enum TransactionCategoryEnum {
    CREDIT("CREDIT"),
    
    DEBIT("DEBIT");

    private String value;

    TransactionCategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionCategoryEnum fromValue(String text) {
      for (TransactionCategoryEnum b : TransactionCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("transactionCategory")
  private TransactionCategoryEnum transactionCategory = null;

  @JsonProperty("transactionStatus")
  private DictionaryItem transactionStatus = null;

  @JsonProperty("initiator")
  private NameAddress initiator = null;

  @JsonProperty("sender")
  private SenderRecipient sender = null;

  @JsonProperty("recipient")
  private SenderRecipient recipient = null;

  public TransactionScheduledInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element (transaction or hold) ID (ASPSP)
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "ID elementu (transakcji lub blokadzie) nadany przez ASPSP / Element (transaction or hold) ID (ASPSP)")
  @NotNull

@Size(max=128) 
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public TransactionScheduledInfo amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Kwota transakcji / Amount of the transaction
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Kwota transakcji / Amount of the transaction")
  @NotNull

@Pattern(regexp="^(0|([1-9][0-9]{0,}))\\.\\d{2}$") 
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public TransactionScheduledInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Kod ISO waluty transakcji / Currency (ISO)
   * @return currency
  **/
  @ApiModelProperty(value = "Kod ISO waluty transakcji / Currency (ISO)")

@Size(max=3) 
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public TransactionScheduledInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Tytuł transakcji / Description of the transaction
   * @return description
  **/
  @ApiModelProperty(value = "Tytuł transakcji / Description of the transaction")

@Size(max=140) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TransactionScheduledInfo transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Typ transakcji / Transaction type
   * @return transactionType
  **/
  @ApiModelProperty(value = "Typ transakcji / Transaction type")

@Size(max=100) 
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionScheduledInfo tradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
    return this;
  }

  /**
   * Data operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the operation
   * @return tradeDate
  **/
  @ApiModelProperty(value = "Data operacji, YYYY-MM-DDThh:mm:ss[.mmm] / Date of the operation")

  @Valid

  public OffsetDateTime getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(OffsetDateTime tradeDate) {
    this.tradeDate = tradeDate;
  }

  public TransactionScheduledInfo mcc(String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * Kod dla każdej transakcji/operacji wykonanej przy użyciu karty / A code of each transaction performed by card
   * @return mcc
  **/
  @ApiModelProperty(value = "Kod dla każdej transakcji/operacji wykonanej przy użyciu karty / A code of each transaction performed by card")


  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public TransactionScheduledInfo auxData(java.util.Map auxData) {
    this.auxData = auxData;
    return this;
  }

  /**
   * Get auxData
   * @return auxData
  **/
  @ApiModelProperty(value = "")

  @Valid

  public java.util.Map getAuxData() {
    return auxData;
  }

  public void setAuxData(java.util.Map auxData) {
    this.auxData = auxData;
  }

  public TransactionScheduledInfo transactionCategory(TransactionCategoryEnum transactionCategory) {
    this.transactionCategory = transactionCategory;
    return this;
  }

  /**
   * Kategoria transakcji uznanie/obciążenie / Transaction category (credit/debit)
   * @return transactionCategory
  **/
  @ApiModelProperty(required = true, value = "Kategoria transakcji uznanie/obciążenie / Transaction category (credit/debit)")
  @NotNull


  public TransactionCategoryEnum getTransactionCategory() {
    return transactionCategory;
  }

  public void setTransactionCategory(TransactionCategoryEnum transactionCategory) {
    this.transactionCategory = transactionCategory;
  }

  public TransactionScheduledInfo transactionStatus(DictionaryItem transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Get transactionStatus
   * @return transactionStatus
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DictionaryItem getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(DictionaryItem transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public TransactionScheduledInfo initiator(NameAddress initiator) {
    this.initiator = initiator;
    return this;
  }

  /**
   * Get initiator
   * @return initiator
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getInitiator() {
    return initiator;
  }

  public void setInitiator(NameAddress initiator) {
    this.initiator = initiator;
  }

  public TransactionScheduledInfo sender(SenderRecipient sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SenderRecipient getSender() {
    return sender;
  }

  public void setSender(SenderRecipient sender) {
    this.sender = sender;
  }

  public TransactionScheduledInfo recipient(SenderRecipient recipient) {
    this.recipient = recipient;
    return this;
  }

  /**
   * Get recipient
   * @return recipient
  **/
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
    TransactionScheduledInfo transactionScheduledInfo = (TransactionScheduledInfo) o;
    return Objects.equals(this.itemId, transactionScheduledInfo.itemId) &&
        Objects.equals(this.amount, transactionScheduledInfo.amount) &&
        Objects.equals(this.currency, transactionScheduledInfo.currency) &&
        Objects.equals(this.description, transactionScheduledInfo.description) &&
        Objects.equals(this.transactionType, transactionScheduledInfo.transactionType) &&
        Objects.equals(this.tradeDate, transactionScheduledInfo.tradeDate) &&
        Objects.equals(this.mcc, transactionScheduledInfo.mcc) &&
        Objects.equals(this.auxData, transactionScheduledInfo.auxData) &&
        Objects.equals(this.transactionCategory, transactionScheduledInfo.transactionCategory) &&
        Objects.equals(this.transactionStatus, transactionScheduledInfo.transactionStatus) &&
        Objects.equals(this.initiator, transactionScheduledInfo.initiator) &&
        Objects.equals(this.sender, transactionScheduledInfo.sender) &&
        Objects.equals(this.recipient, transactionScheduledInfo.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, amount, currency, description, transactionType, tradeDate, mcc, auxData, transactionCategory, transactionStatus, initiator, sender, recipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionScheduledInfo {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    tradeDate: ").append(toIndentedString(tradeDate)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    auxData: ").append(toIndentedString(auxData)).append("\n");
    sb.append("    transactionCategory: ").append(toIndentedString(transactionCategory)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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

