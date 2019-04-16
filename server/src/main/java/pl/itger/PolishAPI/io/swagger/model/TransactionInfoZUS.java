package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.SocialSecurityPayor;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa informacji danych dla przelewu do ZUS / ZUS Transfer Information Class
 */
@ApiModel(description = "Klasa informacji danych dla przelewu do ZUS / ZUS Transfer Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionInfoZUS  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("payerInfo")
  private SocialSecurityPayor payerInfo = null;

  @JsonProperty("contributionType")
  private String contributionType = null;

  @JsonProperty("contributionId")
  private String contributionId = null;

  @JsonProperty("contributionPeriod")
  private String contributionPeriod = null;

  @JsonProperty("paymentTypeId")
  private String paymentTypeId = null;

  @JsonProperty("obligationId")
  private String obligationId = null;

  public TransactionInfoZUS payerInfo(SocialSecurityPayor payerInfo) {
    this.payerInfo = payerInfo;
    return this;
  }

  /**
   * Get payerInfo
   * @return payerInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public SocialSecurityPayor getPayerInfo() {
    return payerInfo;
  }

  public void setPayerInfo(SocialSecurityPayor payerInfo) {
    this.payerInfo = payerInfo;
  }

  public TransactionInfoZUS contributionType(String contributionType) {
    this.contributionType = contributionType;
    return this;
  }

  /**
   * Typ wpłaty / Contribution type
   * @return contributionType
  **/
  @ApiModelProperty(value = "Typ wpłaty / Contribution type")

@Size(max=1) 
  public String getContributionType() {
    return contributionType;
  }

  public void setContributionType(String contributionType) {
    this.contributionType = contributionType;
  }

  public TransactionInfoZUS contributionId(String contributionId) {
    this.contributionId = contributionId;
    return this;
  }

  /**
   * Numer deklaracji / Contribution identifier
   * @return contributionId
  **/
  @ApiModelProperty(value = "Numer deklaracji / Contribution identifier")

@Size(max=2) 
  public String getContributionId() {
    return contributionId;
  }

  public void setContributionId(String contributionId) {
    this.contributionId = contributionId;
  }

  public TransactionInfoZUS contributionPeriod(String contributionPeriod) {
    this.contributionPeriod = contributionPeriod;
    return this;
  }

  /**
   * Okres deklaracji / Contribution period, Format: MMYYYY
   * @return contributionPeriod
  **/
  @ApiModelProperty(value = "Okres deklaracji / Contribution period, Format: MMYYYY")

@Size(max=6) 
  public String getContributionPeriod() {
    return contributionPeriod;
  }

  public void setContributionPeriod(String contributionPeriod) {
    this.contributionPeriod = contributionPeriod;
  }

  public TransactionInfoZUS paymentTypeId(String paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
    return this;
  }

  /**
   * Identyfikator typu płatności / Payment type ID
   * @return paymentTypeId
  **/
  @ApiModelProperty(value = "Identyfikator typu płatności / Payment type ID")

@Size(max=1) 
  public String getPaymentTypeId() {
    return paymentTypeId;
  }

  public void setPaymentTypeId(String paymentTypeId) {
    this.paymentTypeId = paymentTypeId;
  }

  public TransactionInfoZUS obligationId(String obligationId) {
    this.obligationId = obligationId;
    return this;
  }

  /**
   * Numer tytułu wykonawczego / Obligation identifier or number
   * @return obligationId
  **/
  @ApiModelProperty(value = "Numer tytułu wykonawczego / Obligation identifier or number")

@Size(max=40) 
  public String getObligationId() {
    return obligationId;
  }

  public void setObligationId(String obligationId) {
    this.obligationId = obligationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionInfoZUS transactionInfoZUS = (TransactionInfoZUS) o;
    return Objects.equals(this.payerInfo, transactionInfoZUS.payerInfo) &&
        Objects.equals(this.contributionType, transactionInfoZUS.contributionType) &&
        Objects.equals(this.contributionId, transactionInfoZUS.contributionId) &&
        Objects.equals(this.contributionPeriod, transactionInfoZUS.contributionPeriod) &&
        Objects.equals(this.paymentTypeId, transactionInfoZUS.paymentTypeId) &&
        Objects.equals(this.obligationId, transactionInfoZUS.obligationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payerInfo, contributionType, contributionId, contributionPeriod, paymentTypeId, obligationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionInfoZUS {\n");
    
    sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    contributionId: ").append(toIndentedString(contributionId)).append("\n");
    sb.append("    contributionPeriod: ").append(toIndentedString(contributionPeriod)).append("\n");
    sb.append("    paymentTypeId: ").append(toIndentedString(paymentTypeId)).append("\n");
    sb.append("    obligationId: ").append(toIndentedString(obligationId)).append("\n");
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

