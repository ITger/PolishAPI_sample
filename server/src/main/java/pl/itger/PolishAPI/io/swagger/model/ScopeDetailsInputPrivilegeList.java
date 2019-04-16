package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeAisAspspIn;
import pl.itger.PolishAPI.io.swagger.model.PrivilegeAisAspspInSimple;
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
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Pełna lista uprawnień będących przedmiotem zapytania o zgodę PSU / The list of all privileges that are the subject of the request for PSU&#39;s consent
 */
@ApiModel(description = "Pełna lista uprawnień będących przedmiotem zapytania o zgodę PSU / The list of all privileges that are the subject of the request for PSU's consent")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class ScopeDetailsInputPrivilegeList  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("ais-accounts:getAccounts")
  private PrivilegeAisAspspInSimple aisAccountsgetAccounts = null;

  @JsonProperty("ais:getAccount")
  private PrivilegeAisAspspInSimple aisgetAccount = null;

  @JsonProperty("ais:getHolds")
  private PrivilegeAisAspspIn aisgetHolds = null;

  @JsonProperty("ais:getTransactionsDone")
  private PrivilegeAisAspspIn aisgetTransactionsDone = null;

  @JsonProperty("ais:getTransactionsPending")
  private PrivilegeAisAspspIn aisgetTransactionsPending = null;

  @JsonProperty("ais:getTransactionsRejected")
  private PrivilegeAisAspspIn aisgetTransactionsRejected = null;

  @JsonProperty("ais:getTransactionsCancelled")
  private PrivilegeAisAspspIn aisgetTransactionsCancelled = null;

  @JsonProperty("ais:getTransactionsScheduled")
  private PrivilegeAisAspspIn aisgetTransactionsScheduled = null;

  @JsonProperty("ais:getTransactionDetail")
  private PrivilegeAisAspspInSimple aisgetTransactionDetail = null;

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

  public ScopeDetailsInputPrivilegeList accountNumber(String accountNumber) {
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

  public ScopeDetailsInputPrivilegeList aisAccountsgetAccounts(PrivilegeAisAspspInSimple aisAccountsgetAccounts) {
    this.aisAccountsgetAccounts = aisAccountsgetAccounts;
    return this;
  }

  /**
   * Get aisAccountsgetAccounts
   * @return aisAccountsgetAccounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspInSimple getAisAccountsgetAccounts() {
    return aisAccountsgetAccounts;
  }

  public void setAisAccountsgetAccounts(PrivilegeAisAspspInSimple aisAccountsgetAccounts) {
    this.aisAccountsgetAccounts = aisAccountsgetAccounts;
  }

  public ScopeDetailsInputPrivilegeList aisgetAccount(PrivilegeAisAspspInSimple aisgetAccount) {
    this.aisgetAccount = aisgetAccount;
    return this;
  }

  /**
   * Get aisgetAccount
   * @return aisgetAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspInSimple getAisgetAccount() {
    return aisgetAccount;
  }

  public void setAisgetAccount(PrivilegeAisAspspInSimple aisgetAccount) {
    this.aisgetAccount = aisgetAccount;
  }

  public ScopeDetailsInputPrivilegeList aisgetHolds(PrivilegeAisAspspIn aisgetHolds) {
    this.aisgetHolds = aisgetHolds;
    return this;
  }

  /**
   * Get aisgetHolds
   * @return aisgetHolds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetHolds() {
    return aisgetHolds;
  }

  public void setAisgetHolds(PrivilegeAisAspspIn aisgetHolds) {
    this.aisgetHolds = aisgetHolds;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionsDone(PrivilegeAisAspspIn aisgetTransactionsDone) {
    this.aisgetTransactionsDone = aisgetTransactionsDone;
    return this;
  }

  /**
   * Get aisgetTransactionsDone
   * @return aisgetTransactionsDone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetTransactionsDone() {
    return aisgetTransactionsDone;
  }

  public void setAisgetTransactionsDone(PrivilegeAisAspspIn aisgetTransactionsDone) {
    this.aisgetTransactionsDone = aisgetTransactionsDone;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionsPending(PrivilegeAisAspspIn aisgetTransactionsPending) {
    this.aisgetTransactionsPending = aisgetTransactionsPending;
    return this;
  }

  /**
   * Get aisgetTransactionsPending
   * @return aisgetTransactionsPending
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetTransactionsPending() {
    return aisgetTransactionsPending;
  }

  public void setAisgetTransactionsPending(PrivilegeAisAspspIn aisgetTransactionsPending) {
    this.aisgetTransactionsPending = aisgetTransactionsPending;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionsRejected(PrivilegeAisAspspIn aisgetTransactionsRejected) {
    this.aisgetTransactionsRejected = aisgetTransactionsRejected;
    return this;
  }

  /**
   * Get aisgetTransactionsRejected
   * @return aisgetTransactionsRejected
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetTransactionsRejected() {
    return aisgetTransactionsRejected;
  }

  public void setAisgetTransactionsRejected(PrivilegeAisAspspIn aisgetTransactionsRejected) {
    this.aisgetTransactionsRejected = aisgetTransactionsRejected;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionsCancelled(PrivilegeAisAspspIn aisgetTransactionsCancelled) {
    this.aisgetTransactionsCancelled = aisgetTransactionsCancelled;
    return this;
  }

  /**
   * Get aisgetTransactionsCancelled
   * @return aisgetTransactionsCancelled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetTransactionsCancelled() {
    return aisgetTransactionsCancelled;
  }

  public void setAisgetTransactionsCancelled(PrivilegeAisAspspIn aisgetTransactionsCancelled) {
    this.aisgetTransactionsCancelled = aisgetTransactionsCancelled;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionsScheduled(PrivilegeAisAspspIn aisgetTransactionsScheduled) {
    this.aisgetTransactionsScheduled = aisgetTransactionsScheduled;
    return this;
  }

  /**
   * Get aisgetTransactionsScheduled
   * @return aisgetTransactionsScheduled
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspIn getAisgetTransactionsScheduled() {
    return aisgetTransactionsScheduled;
  }

  public void setAisgetTransactionsScheduled(PrivilegeAisAspspIn aisgetTransactionsScheduled) {
    this.aisgetTransactionsScheduled = aisgetTransactionsScheduled;
  }

  public ScopeDetailsInputPrivilegeList aisgetTransactionDetail(PrivilegeAisAspspInSimple aisgetTransactionDetail) {
    this.aisgetTransactionDetail = aisgetTransactionDetail;
    return this;
  }

  /**
   * Get aisgetTransactionDetail
   * @return aisgetTransactionDetail
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PrivilegeAisAspspInSimple getAisgetTransactionDetail() {
    return aisgetTransactionDetail;
  }

  public void setAisgetTransactionDetail(PrivilegeAisAspspInSimple aisgetTransactionDetail) {
    this.aisgetTransactionDetail = aisgetTransactionDetail;
  }

  public ScopeDetailsInputPrivilegeList pisgetPayment(PrivilegePayment pisgetPayment) {
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

  public ScopeDetailsInputPrivilegeList pisgetBundle(PrivilegeBundle pisgetBundle) {
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

  public ScopeDetailsInputPrivilegeList pisdomestic(PrivilegeDomesticTransfer pisdomestic) {
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

  public ScopeDetailsInputPrivilegeList pisEEA(PrivilegeForeignTransferEEA pisEEA) {
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

  public ScopeDetailsInputPrivilegeList pisnonEEA(PrivilegeForeignTransferNonEEA pisnonEEA) {
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

  public ScopeDetailsInputPrivilegeList pistax(PrivilegeTaxTransfer pistax) {
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

  public ScopeDetailsInputPrivilegeList piscancelPayment(PrivilegeCancelPayment piscancelPayment) {
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

  public ScopeDetailsInputPrivilegeList pisbundle(PrivilegeBundleTransfers pisbundle) {
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

  public ScopeDetailsInputPrivilegeList pisrecurring(PrivilegeRecurringPayment pisrecurring) {
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

  public ScopeDetailsInputPrivilegeList pisgetRecurringPayment(PrivilegeRecurringPaymentStatus pisgetRecurringPayment) {
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

  public ScopeDetailsInputPrivilegeList piscancelRecurringPayment(PrivilegeCancelRecurringPayment piscancelRecurringPayment) {
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
    ScopeDetailsInputPrivilegeList scopeDetailsInputPrivilegeList = (ScopeDetailsInputPrivilegeList) o;
    return Objects.equals(this.accountNumber, scopeDetailsInputPrivilegeList.accountNumber) &&
        Objects.equals(this.aisAccountsgetAccounts, scopeDetailsInputPrivilegeList.aisAccountsgetAccounts) &&
        Objects.equals(this.aisgetAccount, scopeDetailsInputPrivilegeList.aisgetAccount) &&
        Objects.equals(this.aisgetHolds, scopeDetailsInputPrivilegeList.aisgetHolds) &&
        Objects.equals(this.aisgetTransactionsDone, scopeDetailsInputPrivilegeList.aisgetTransactionsDone) &&
        Objects.equals(this.aisgetTransactionsPending, scopeDetailsInputPrivilegeList.aisgetTransactionsPending) &&
        Objects.equals(this.aisgetTransactionsRejected, scopeDetailsInputPrivilegeList.aisgetTransactionsRejected) &&
        Objects.equals(this.aisgetTransactionsCancelled, scopeDetailsInputPrivilegeList.aisgetTransactionsCancelled) &&
        Objects.equals(this.aisgetTransactionsScheduled, scopeDetailsInputPrivilegeList.aisgetTransactionsScheduled) &&
        Objects.equals(this.aisgetTransactionDetail, scopeDetailsInputPrivilegeList.aisgetTransactionDetail) &&
        Objects.equals(this.pisgetPayment, scopeDetailsInputPrivilegeList.pisgetPayment) &&
        Objects.equals(this.pisgetBundle, scopeDetailsInputPrivilegeList.pisgetBundle) &&
        Objects.equals(this.pisdomestic, scopeDetailsInputPrivilegeList.pisdomestic) &&
        Objects.equals(this.pisEEA, scopeDetailsInputPrivilegeList.pisEEA) &&
        Objects.equals(this.pisnonEEA, scopeDetailsInputPrivilegeList.pisnonEEA) &&
        Objects.equals(this.pistax, scopeDetailsInputPrivilegeList.pistax) &&
        Objects.equals(this.piscancelPayment, scopeDetailsInputPrivilegeList.piscancelPayment) &&
        Objects.equals(this.pisbundle, scopeDetailsInputPrivilegeList.pisbundle) &&
        Objects.equals(this.pisrecurring, scopeDetailsInputPrivilegeList.pisrecurring) &&
        Objects.equals(this.pisgetRecurringPayment, scopeDetailsInputPrivilegeList.pisgetRecurringPayment) &&
        Objects.equals(this.piscancelRecurringPayment, scopeDetailsInputPrivilegeList.piscancelRecurringPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, aisAccountsgetAccounts, aisgetAccount, aisgetHolds, aisgetTransactionsDone, aisgetTransactionsPending, aisgetTransactionsRejected, aisgetTransactionsCancelled, aisgetTransactionsScheduled, aisgetTransactionDetail, pisgetPayment, pisgetBundle, pisdomestic, pisEEA, pisnonEEA, pistax, piscancelPayment, pisbundle, pisrecurring, pisgetRecurringPayment, piscancelRecurringPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeDetailsInputPrivilegeList {\n");
    
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

