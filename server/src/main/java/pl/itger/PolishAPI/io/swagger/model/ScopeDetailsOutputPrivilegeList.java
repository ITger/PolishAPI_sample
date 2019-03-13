package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeAisAspspOut;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeAisAspspOutSimple;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeBundle;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeBundleTransfers;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeCancelPayment;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeCancelRecurringPayment;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeDomesticTransfer;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeForeignTransferEEA;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeForeignTransferNonEEA;
import pl.itger.PolishAPI.io.swagger.model.PrivilegePayment;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeRecurringPayment;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeRecurringPaymentStatus;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeTaxTransfer;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pełna lista uprawnień, dla których została wyrażona zgoda przez PSU / The list of all privileges that the PSU&#39;s consent has been confirmed
 */
@ApiModel(description = "Pełna lista uprawnień, dla których została wyrażona zgoda przez PSU / The list of all privileges that the PSU's consent has been confirmed")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class ScopeDetailsOutputPrivilegeList   {
  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("ais-accounts:getAccounts")
  private PrivilegeAisAspspOutSimple aisAccountsgetAccounts = null;

  @JsonProperty("ais:getAccount")
  private PrivilegeAisAspspOutSimple aisgetAccount = null;

  @JsonProperty("ais:getHolds")
  private PrivilegeAisAspspOut aisgetHolds = null;

  @JsonProperty("ais:getTransactionsDone")
  private PrivilegeAisAspspOut aisgetTransactionsDone = null;

  @JsonProperty("ais:getTransactionsPending")
  private PrivilegeAisAspspOut aisgetTransactionsPending = null;

  @JsonProperty("ais:getTransactionsRejected")
  private PrivilegeAisAspspOut aisgetTransactionsRejected = null;

  @JsonProperty("ais:getTransactionsCancelled")
  private PrivilegeAisAspspOut aisgetTransactionsCancelled = null;

  @JsonProperty("ais:getTransactionsScheduled")
  private PrivilegeAisAspspOut aisgetTransactionsScheduled = null;

  @JsonProperty("ais:getTransactionDetail")
  private PrivilegeAisAspspOutSimple aisgetTransactionDetail = null;

  @JsonProperty("pis:getPayment")
  private PrivilegePayment pisgetPayment = null;

  @JsonProperty("pis:getBundle")
  private PrivilegeBundle pisgetBundle = null;

  @JsonProperty("pis:domestic")
  private PrivilegeDomesticTransfer pisdomestic = null;

  @JsonProperty("pis:EEA")
  private PrivilegeForeignTransferEEA pisEEA = null;

  @JsonProperty("pis:nonEEA")
  private PrivilegeForeignTransferNonEEA pisnonEEA = null;

  @JsonProperty("pis:tax")
  private PrivilegeTaxTransfer pistax = null;

  @JsonProperty("pis:cancelPayment")
  private PrivilegeCancelPayment piscancelPayment = null;

  @JsonProperty("pis:bundle")
  private PrivilegeBundleTransfers pisbundle = null;

  @JsonProperty("pis:recurring")
  private PrivilegeRecurringPayment pisrecurring = null;

  @JsonProperty("pis:getRecurringPayment")
  private PrivilegeRecurringPaymentStatus pisgetRecurringPayment = null;

  @JsonProperty("pis:cancelRecurringPayment")
  private PrivilegeCancelRecurringPayment piscancelRecurringPayment = null;

  public ScopeDetailsOutputPrivilegeList accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=34) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public ScopeDetailsOutputPrivilegeList aisAccountsgetAccounts(PrivilegeAisAspspOutSimple aisAccountsgetAccounts) {
    this.aisAccountsgetAccounts = aisAccountsgetAccounts;
    return this;
  }

  /**
   * Get aisAccountsgetAccounts
   * @return aisAccountsgetAccounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOutSimple getAisAccountsgetAccounts() {
    return aisAccountsgetAccounts;
  }

  public void setAisAccountsgetAccounts(PrivilegeAisAspspOutSimple aisAccountsgetAccounts) {
    this.aisAccountsgetAccounts = aisAccountsgetAccounts;
  }

  public ScopeDetailsOutputPrivilegeList aisgetAccount(PrivilegeAisAspspOutSimple aisgetAccount) {
    this.aisgetAccount = aisgetAccount;
    return this;
  }

  /**
   * Get aisgetAccount
   * @return aisgetAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOutSimple getAisgetAccount() {
    return aisgetAccount;
  }

  public void setAisgetAccount(PrivilegeAisAspspOutSimple aisgetAccount) {
    this.aisgetAccount = aisgetAccount;
  }

  public ScopeDetailsOutputPrivilegeList aisgetHolds(PrivilegeAisAspspOut aisgetHolds) {
    this.aisgetHolds = aisgetHolds;
    return this;
  }

  /**
   * Get aisgetHolds
   * @return aisgetHolds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetHolds() {
    return aisgetHolds;
  }

  public void setAisgetHolds(PrivilegeAisAspspOut aisgetHolds) {
    this.aisgetHolds = aisgetHolds;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionsDone(PrivilegeAisAspspOut aisgetTransactionsDone) {
    this.aisgetTransactionsDone = aisgetTransactionsDone;
    return this;
  }

  /**
   * Get aisgetTransactionsDone
   * @return aisgetTransactionsDone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetTransactionsDone() {
    return aisgetTransactionsDone;
  }

  public void setAisgetTransactionsDone(PrivilegeAisAspspOut aisgetTransactionsDone) {
    this.aisgetTransactionsDone = aisgetTransactionsDone;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionsPending(PrivilegeAisAspspOut aisgetTransactionsPending) {
    this.aisgetTransactionsPending = aisgetTransactionsPending;
    return this;
  }

  /**
   * Get aisgetTransactionsPending
   * @return aisgetTransactionsPending
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetTransactionsPending() {
    return aisgetTransactionsPending;
  }

  public void setAisgetTransactionsPending(PrivilegeAisAspspOut aisgetTransactionsPending) {
    this.aisgetTransactionsPending = aisgetTransactionsPending;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionsRejected(PrivilegeAisAspspOut aisgetTransactionsRejected) {
    this.aisgetTransactionsRejected = aisgetTransactionsRejected;
    return this;
  }

  /**
   * Get aisgetTransactionsRejected
   * @return aisgetTransactionsRejected
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetTransactionsRejected() {
    return aisgetTransactionsRejected;
  }

  public void setAisgetTransactionsRejected(PrivilegeAisAspspOut aisgetTransactionsRejected) {
    this.aisgetTransactionsRejected = aisgetTransactionsRejected;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionsCancelled(PrivilegeAisAspspOut aisgetTransactionsCancelled) {
    this.aisgetTransactionsCancelled = aisgetTransactionsCancelled;
    return this;
  }

  /**
   * Get aisgetTransactionsCancelled
   * @return aisgetTransactionsCancelled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetTransactionsCancelled() {
    return aisgetTransactionsCancelled;
  }

  public void setAisgetTransactionsCancelled(PrivilegeAisAspspOut aisgetTransactionsCancelled) {
    this.aisgetTransactionsCancelled = aisgetTransactionsCancelled;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionsScheduled(PrivilegeAisAspspOut aisgetTransactionsScheduled) {
    this.aisgetTransactionsScheduled = aisgetTransactionsScheduled;
    return this;
  }

  /**
   * Get aisgetTransactionsScheduled
   * @return aisgetTransactionsScheduled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOut getAisgetTransactionsScheduled() {
    return aisgetTransactionsScheduled;
  }

  public void setAisgetTransactionsScheduled(PrivilegeAisAspspOut aisgetTransactionsScheduled) {
    this.aisgetTransactionsScheduled = aisgetTransactionsScheduled;
  }

  public ScopeDetailsOutputPrivilegeList aisgetTransactionDetail(PrivilegeAisAspspOutSimple aisgetTransactionDetail) {
    this.aisgetTransactionDetail = aisgetTransactionDetail;
    return this;
  }

  /**
   * Get aisgetTransactionDetail
   * @return aisgetTransactionDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspOutSimple getAisgetTransactionDetail() {
    return aisgetTransactionDetail;
  }

  public void setAisgetTransactionDetail(PrivilegeAisAspspOutSimple aisgetTransactionDetail) {
    this.aisgetTransactionDetail = aisgetTransactionDetail;
  }

  public ScopeDetailsOutputPrivilegeList pisgetPayment(PrivilegePayment pisgetPayment) {
    this.pisgetPayment = pisgetPayment;
    return this;
  }

  /**
   * Get pisgetPayment
   * @return pisgetPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegePayment getPisgetPayment() {
    return pisgetPayment;
  }

  public void setPisgetPayment(PrivilegePayment pisgetPayment) {
    this.pisgetPayment = pisgetPayment;
  }

  public ScopeDetailsOutputPrivilegeList pisgetBundle(PrivilegeBundle pisgetBundle) {
    this.pisgetBundle = pisgetBundle;
    return this;
  }

  /**
   * Get pisgetBundle
   * @return pisgetBundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeBundle getPisgetBundle() {
    return pisgetBundle;
  }

  public void setPisgetBundle(PrivilegeBundle pisgetBundle) {
    this.pisgetBundle = pisgetBundle;
  }

  public ScopeDetailsOutputPrivilegeList pisdomestic(PrivilegeDomesticTransfer pisdomestic) {
    this.pisdomestic = pisdomestic;
    return this;
  }

  /**
   * Get pisdomestic
   * @return pisdomestic
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeDomesticTransfer getPisdomestic() {
    return pisdomestic;
  }

  public void setPisdomestic(PrivilegeDomesticTransfer pisdomestic) {
    this.pisdomestic = pisdomestic;
  }

  public ScopeDetailsOutputPrivilegeList pisEEA(PrivilegeForeignTransferEEA pisEEA) {
    this.pisEEA = pisEEA;
    return this;
  }

  /**
   * Get pisEEA
   * @return pisEEA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeForeignTransferEEA getPisEEA() {
    return pisEEA;
  }

  public void setPisEEA(PrivilegeForeignTransferEEA pisEEA) {
    this.pisEEA = pisEEA;
  }

  public ScopeDetailsOutputPrivilegeList pisnonEEA(PrivilegeForeignTransferNonEEA pisnonEEA) {
    this.pisnonEEA = pisnonEEA;
    return this;
  }

  /**
   * Get pisnonEEA
   * @return pisnonEEA
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeForeignTransferNonEEA getPisnonEEA() {
    return pisnonEEA;
  }

  public void setPisnonEEA(PrivilegeForeignTransferNonEEA pisnonEEA) {
    this.pisnonEEA = pisnonEEA;
  }

  public ScopeDetailsOutputPrivilegeList pistax(PrivilegeTaxTransfer pistax) {
    this.pistax = pistax;
    return this;
  }

  /**
   * Get pistax
   * @return pistax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeTaxTransfer getPistax() {
    return pistax;
  }

  public void setPistax(PrivilegeTaxTransfer pistax) {
    this.pistax = pistax;
  }

  public ScopeDetailsOutputPrivilegeList piscancelPayment(PrivilegeCancelPayment piscancelPayment) {
    this.piscancelPayment = piscancelPayment;
    return this;
  }

  /**
   * Get piscancelPayment
   * @return piscancelPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeCancelPayment getPiscancelPayment() {
    return piscancelPayment;
  }

  public void setPiscancelPayment(PrivilegeCancelPayment piscancelPayment) {
    this.piscancelPayment = piscancelPayment;
  }

  public ScopeDetailsOutputPrivilegeList pisbundle(PrivilegeBundleTransfers pisbundle) {
    this.pisbundle = pisbundle;
    return this;
  }

  /**
   * Get pisbundle
   * @return pisbundle
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeBundleTransfers getPisbundle() {
    return pisbundle;
  }

  public void setPisbundle(PrivilegeBundleTransfers pisbundle) {
    this.pisbundle = pisbundle;
  }

  public ScopeDetailsOutputPrivilegeList pisrecurring(PrivilegeRecurringPayment pisrecurring) {
    this.pisrecurring = pisrecurring;
    return this;
  }

  /**
   * Get pisrecurring
   * @return pisrecurring
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeRecurringPayment getPisrecurring() {
    return pisrecurring;
  }

  public void setPisrecurring(PrivilegeRecurringPayment pisrecurring) {
    this.pisrecurring = pisrecurring;
  }

  public ScopeDetailsOutputPrivilegeList pisgetRecurringPayment(PrivilegeRecurringPaymentStatus pisgetRecurringPayment) {
    this.pisgetRecurringPayment = pisgetRecurringPayment;
    return this;
  }

  /**
   * Get pisgetRecurringPayment
   * @return pisgetRecurringPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeRecurringPaymentStatus getPisgetRecurringPayment() {
    return pisgetRecurringPayment;
  }

  public void setPisgetRecurringPayment(PrivilegeRecurringPaymentStatus pisgetRecurringPayment) {
    this.pisgetRecurringPayment = pisgetRecurringPayment;
  }

  public ScopeDetailsOutputPrivilegeList piscancelRecurringPayment(PrivilegeCancelRecurringPayment piscancelRecurringPayment) {
    this.piscancelRecurringPayment = piscancelRecurringPayment;
    return this;
  }

  /**
   * Get piscancelRecurringPayment
   * @return piscancelRecurringPayment
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeCancelRecurringPayment getPiscancelRecurringPayment() {
    return piscancelRecurringPayment;
  }

  public void setPiscancelRecurringPayment(PrivilegeCancelRecurringPayment piscancelRecurringPayment) {
    this.piscancelRecurringPayment = piscancelRecurringPayment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeDetailsOutputPrivilegeList scopeDetailsOutputPrivilegeList = (ScopeDetailsOutputPrivilegeList) o;
    return Objects.equals(this.accountNumber, scopeDetailsOutputPrivilegeList.accountNumber) &&
        Objects.equals(this.aisAccountsgetAccounts, scopeDetailsOutputPrivilegeList.aisAccountsgetAccounts) &&
        Objects.equals(this.aisgetAccount, scopeDetailsOutputPrivilegeList.aisgetAccount) &&
        Objects.equals(this.aisgetHolds, scopeDetailsOutputPrivilegeList.aisgetHolds) &&
        Objects.equals(this.aisgetTransactionsDone, scopeDetailsOutputPrivilegeList.aisgetTransactionsDone) &&
        Objects.equals(this.aisgetTransactionsPending, scopeDetailsOutputPrivilegeList.aisgetTransactionsPending) &&
        Objects.equals(this.aisgetTransactionsRejected, scopeDetailsOutputPrivilegeList.aisgetTransactionsRejected) &&
        Objects.equals(this.aisgetTransactionsCancelled, scopeDetailsOutputPrivilegeList.aisgetTransactionsCancelled) &&
        Objects.equals(this.aisgetTransactionsScheduled, scopeDetailsOutputPrivilegeList.aisgetTransactionsScheduled) &&
        Objects.equals(this.aisgetTransactionDetail, scopeDetailsOutputPrivilegeList.aisgetTransactionDetail) &&
        Objects.equals(this.pisgetPayment, scopeDetailsOutputPrivilegeList.pisgetPayment) &&
        Objects.equals(this.pisgetBundle, scopeDetailsOutputPrivilegeList.pisgetBundle) &&
        Objects.equals(this.pisdomestic, scopeDetailsOutputPrivilegeList.pisdomestic) &&
        Objects.equals(this.pisEEA, scopeDetailsOutputPrivilegeList.pisEEA) &&
        Objects.equals(this.pisnonEEA, scopeDetailsOutputPrivilegeList.pisnonEEA) &&
        Objects.equals(this.pistax, scopeDetailsOutputPrivilegeList.pistax) &&
        Objects.equals(this.piscancelPayment, scopeDetailsOutputPrivilegeList.piscancelPayment) &&
        Objects.equals(this.pisbundle, scopeDetailsOutputPrivilegeList.pisbundle) &&
        Objects.equals(this.pisrecurring, scopeDetailsOutputPrivilegeList.pisrecurring) &&
        Objects.equals(this.pisgetRecurringPayment, scopeDetailsOutputPrivilegeList.pisgetRecurringPayment) &&
        Objects.equals(this.piscancelRecurringPayment, scopeDetailsOutputPrivilegeList.piscancelRecurringPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, aisAccountsgetAccounts, aisgetAccount, aisgetHolds, aisgetTransactionsDone, aisgetTransactionsPending, aisgetTransactionsRejected, aisgetTransactionsCancelled, aisgetTransactionsScheduled, aisgetTransactionDetail, pisgetPayment, pisgetBundle, pisdomestic, pisEEA, pisnonEEA, pistax, piscancelPayment, pisbundle, pisrecurring, pisgetRecurringPayment, piscancelRecurringPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeDetailsOutputPrivilegeList {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    aisAccountsgetAccounts: ").append(toIndentedString(aisAccountsgetAccounts)).append("\n");
    sb.append("    aisgetAccount: ").append(toIndentedString(aisgetAccount)).append("\n");
    sb.append("    aisgetHolds: ").append(toIndentedString(aisgetHolds)).append("\n");
    sb.append("    aisgetTransactionsDone: ").append(toIndentedString(aisgetTransactionsDone)).append("\n");
    sb.append("    aisgetTransactionsPending: ").append(toIndentedString(aisgetTransactionsPending)).append("\n");
    sb.append("    aisgetTransactionsRejected: ").append(toIndentedString(aisgetTransactionsRejected)).append("\n");
    sb.append("    aisgetTransactionsCancelled: ").append(toIndentedString(aisgetTransactionsCancelled)).append("\n");
    sb.append("    aisgetTransactionsScheduled: ").append(toIndentedString(aisgetTransactionsScheduled)).append("\n");
    sb.append("    aisgetTransactionDetail: ").append(toIndentedString(aisgetTransactionDetail)).append("\n");
    sb.append("    pisgetPayment: ").append(toIndentedString(pisgetPayment)).append("\n");
    sb.append("    pisgetBundle: ").append(toIndentedString(pisgetBundle)).append("\n");
    sb.append("    pisdomestic: ").append(toIndentedString(pisdomestic)).append("\n");
    sb.append("    pisEEA: ").append(toIndentedString(pisEEA)).append("\n");
    sb.append("    pisnonEEA: ").append(toIndentedString(pisnonEEA)).append("\n");
    sb.append("    pistax: ").append(toIndentedString(pistax)).append("\n");
    sb.append("    piscancelPayment: ").append(toIndentedString(piscancelPayment)).append("\n");
    sb.append("    pisbundle: ").append(toIndentedString(pisbundle)).append("\n");
    sb.append("    pisrecurring: ").append(toIndentedString(pisrecurring)).append("\n");
    sb.append("    pisgetRecurringPayment: ").append(toIndentedString(pisgetRecurringPayment)).append("\n");
    sb.append("    piscancelRecurringPayment: ").append(toIndentedString(piscancelRecurringPayment)).append("\n");
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

