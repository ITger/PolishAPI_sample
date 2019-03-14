package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PaymentDomesticRequestBundled;
import io.swagger.model.PaymentEEARequestBundled;
import io.swagger.model.PaymentNonEEARequestBundled;
import io.swagger.model.PaymentTaxRequestBundled;
import io.swagger.model.RequestHeaderCallback;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zlecenia paczki przelewów / Bundle of payments Request Class
 */
@ApiModel(description = "Klasa zlecenia paczki przelewów / Bundle of payments Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentsBundleRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderCallback requestHeader = null;

  @JsonProperty("tppBundleId")
  private String tppBundleId = null;

  @JsonProperty("transfersTotalAmount")
  private String transfersTotalAmount = null;

  /**
   * Typ przelewów, które zostaną zlecone w ramach paczki / The type of transfers that will be initiated through the bundle
   */
  public enum TypeOfTransfersEnum {
    DOMESTIC("domestic"),
    
    EEA("EEA"),
    
    NONEEA("nonEEA"),
    
    TAX("tax");

    private String value;

    TypeOfTransfersEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOfTransfersEnum fromValue(String text) {
      for (TypeOfTransfersEnum b : TypeOfTransfersEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOfTransfers")
  private TypeOfTransfersEnum typeOfTransfers = null;

  @JsonProperty("domesticTransfers")
  @Valid
  private List<PaymentDomesticRequestBundled> domesticTransfers = null;

  @JsonProperty("EEATransfers")
  @Valid
  private List<PaymentEEARequestBundled> eeATransfers = null;

  @JsonProperty("nonEEATransfers")
  @Valid
  private List<PaymentNonEEARequestBundled> nonEEATransfers = null;

  @JsonProperty("taxTransfers")
  @Valid
  private List<PaymentTaxRequestBundled> taxTransfers = null;

  public PaymentsBundleRequest requestHeader(RequestHeaderCallback requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeaderCallback getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderCallback requestHeader) {
    this.requestHeader = requestHeader;
  }

  public PaymentsBundleRequest tppBundleId(String tppBundleId) {
    this.tppBundleId = tppBundleId;
    return this;
  }

  /**
   * Identyfikator paczki przelewów nadany przez TPP / Bundle of payments identifier set by TPP
   * @return tppBundleId
  **/
  @ApiModelProperty(required = true, value = "Identyfikator paczki przelewów nadany przez TPP / Bundle of payments identifier set by TPP")
  @NotNull

@Size(max=64) 
  public String getTppBundleId() {
    return tppBundleId;
  }

  public void setTppBundleId(String tppBundleId) {
    this.tppBundleId = tppBundleId;
  }

  public PaymentsBundleRequest transfersTotalAmount(String transfersTotalAmount) {
    this.transfersTotalAmount = transfersTotalAmount;
    return this;
  }

  /**
   * Łączna kwota wszystkich przelewów z paczki / The total amount of all transfers from bundle
   * @return transfersTotalAmount
  **/
  @ApiModelProperty(required = true, value = "Łączna kwota wszystkich przelewów z paczki / The total amount of all transfers from bundle")
  @NotNull

@Pattern(regexp="^(0|([1-9][0-9]{0,}))\\.\\d{2}$") 
  public String getTransfersTotalAmount() {
    return transfersTotalAmount;
  }

  public void setTransfersTotalAmount(String transfersTotalAmount) {
    this.transfersTotalAmount = transfersTotalAmount;
  }

  public PaymentsBundleRequest typeOfTransfers(TypeOfTransfersEnum typeOfTransfers) {
    this.typeOfTransfers = typeOfTransfers;
    return this;
  }

  /**
   * Typ przelewów, które zostaną zlecone w ramach paczki / The type of transfers that will be initiated through the bundle
   * @return typeOfTransfers
  **/
  @ApiModelProperty(required = true, value = "Typ przelewów, które zostaną zlecone w ramach paczki / The type of transfers that will be initiated through the bundle")
  @NotNull


  public TypeOfTransfersEnum getTypeOfTransfers() {
    return typeOfTransfers;
  }

  public void setTypeOfTransfers(TypeOfTransfersEnum typeOfTransfers) {
    this.typeOfTransfers = typeOfTransfers;
  }

  public PaymentsBundleRequest domesticTransfers(List<PaymentDomesticRequestBundled> domesticTransfers) {
    this.domesticTransfers = domesticTransfers;
    return this;
  }

  public PaymentsBundleRequest addDomesticTransfersItem(PaymentDomesticRequestBundled domesticTransfersItem) {
    if (this.domesticTransfers == null) {
      this.domesticTransfers = new ArrayList<>();
    }
    this.domesticTransfers.add(domesticTransfersItem);
    return this;
  }

  /**
   * Lista struktur danych przelewów zwykłych, które zostaną zlecone. Wymagane gdy typeOfTransfers = domestic. / The list of data structures of domestic transfers to be initiated. Required when typeOfTransfers = domestic.
   * @return domesticTransfers
  **/
  @ApiModelProperty(value = "Lista struktur danych przelewów zwykłych, które zostaną zlecone. Wymagane gdy typeOfTransfers = domestic. / The list of data structures of domestic transfers to be initiated. Required when typeOfTransfers = domestic.")

  @Valid

  public List<PaymentDomesticRequestBundled> getDomesticTransfers() {
    return domesticTransfers;
  }

  public void setDomesticTransfers(List<PaymentDomesticRequestBundled> domesticTransfers) {
    this.domesticTransfers = domesticTransfers;
  }

  public PaymentsBundleRequest eeATransfers(List<PaymentEEARequestBundled> eeATransfers) {
    this.eeATransfers = eeATransfers;
    return this;
  }

  public PaymentsBundleRequest addEeATransfersItem(PaymentEEARequestBundled eeATransfersItem) {
    if (this.eeATransfers == null) {
      this.eeATransfers = new ArrayList<>();
    }
    this.eeATransfers.add(eeATransfersItem);
    return this;
  }

  /**
   * Lista struktur danych przelewów zagranicznych SEPA, które zostaną zlecone. Wymagane gdy typeOfTransfers = EEA. / The list of data structures of SEPA foreign transfers to be initiated. Required when typeOfTransfers = EEA.
   * @return eeATransfers
  **/
  @ApiModelProperty(value = "Lista struktur danych przelewów zagranicznych SEPA, które zostaną zlecone. Wymagane gdy typeOfTransfers = EEA. / The list of data structures of SEPA foreign transfers to be initiated. Required when typeOfTransfers = EEA.")

  @Valid

  public List<PaymentEEARequestBundled> getEeATransfers() {
    return eeATransfers;
  }

  public void setEeATransfers(List<PaymentEEARequestBundled> eeATransfers) {
    this.eeATransfers = eeATransfers;
  }

  public PaymentsBundleRequest nonEEATransfers(List<PaymentNonEEARequestBundled> nonEEATransfers) {
    this.nonEEATransfers = nonEEATransfers;
    return this;
  }

  public PaymentsBundleRequest addNonEEATransfersItem(PaymentNonEEARequestBundled nonEEATransfersItem) {
    if (this.nonEEATransfers == null) {
      this.nonEEATransfers = new ArrayList<>();
    }
    this.nonEEATransfers.add(nonEEATransfersItem);
    return this;
  }

  /**
   * Lista struktur danych przelewów zagranicznych innych niż SEPA, które zostaną zlecone. Wymagane gdy typeOfTransfers = nonEEA. / The list of data structures of non SEPA foreign transfers to be initiated. Required when typeOfTransfers = nonEEA.
   * @return nonEEATransfers
  **/
  @ApiModelProperty(value = "Lista struktur danych przelewów zagranicznych innych niż SEPA, które zostaną zlecone. Wymagane gdy typeOfTransfers = nonEEA. / The list of data structures of non SEPA foreign transfers to be initiated. Required when typeOfTransfers = nonEEA.")

  @Valid

  public List<PaymentNonEEARequestBundled> getNonEEATransfers() {
    return nonEEATransfers;
  }

  public void setNonEEATransfers(List<PaymentNonEEARequestBundled> nonEEATransfers) {
    this.nonEEATransfers = nonEEATransfers;
  }

  public PaymentsBundleRequest taxTransfers(List<PaymentTaxRequestBundled> taxTransfers) {
    this.taxTransfers = taxTransfers;
    return this;
  }

  public PaymentsBundleRequest addTaxTransfersItem(PaymentTaxRequestBundled taxTransfersItem) {
    if (this.taxTransfers == null) {
      this.taxTransfers = new ArrayList<>();
    }
    this.taxTransfers.add(taxTransfersItem);
    return this;
  }

  /**
   * Lista struktur danych przelewów do urzędu podatkowego, które zostaną zlecone. Wymagane gdy typeOfTransfers = tax. / The list of data structures of tax transfers to be initiated. Required when typeOfTransfers = tax.
   * @return taxTransfers
  **/
  @ApiModelProperty(value = "Lista struktur danych przelewów do urzędu podatkowego, które zostaną zlecone. Wymagane gdy typeOfTransfers = tax. / The list of data structures of tax transfers to be initiated. Required when typeOfTransfers = tax.")

  @Valid

  public List<PaymentTaxRequestBundled> getTaxTransfers() {
    return taxTransfers;
  }

  public void setTaxTransfers(List<PaymentTaxRequestBundled> taxTransfers) {
    this.taxTransfers = taxTransfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsBundleRequest paymentsBundleRequest = (PaymentsBundleRequest) o;
    return Objects.equals(this.requestHeader, paymentsBundleRequest.requestHeader) &&
        Objects.equals(this.tppBundleId, paymentsBundleRequest.tppBundleId) &&
        Objects.equals(this.transfersTotalAmount, paymentsBundleRequest.transfersTotalAmount) &&
        Objects.equals(this.typeOfTransfers, paymentsBundleRequest.typeOfTransfers) &&
        Objects.equals(this.domesticTransfers, paymentsBundleRequest.domesticTransfers) &&
        Objects.equals(this.eeATransfers, paymentsBundleRequest.eeATransfers) &&
        Objects.equals(this.nonEEATransfers, paymentsBundleRequest.nonEEATransfers) &&
        Objects.equals(this.taxTransfers, paymentsBundleRequest.taxTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, tppBundleId, transfersTotalAmount, typeOfTransfers, domesticTransfers, eeATransfers, nonEEATransfers, taxTransfers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsBundleRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    tppBundleId: ").append(toIndentedString(tppBundleId)).append("\n");
    sb.append("    transfersTotalAmount: ").append(toIndentedString(transfersTotalAmount)).append("\n");
    sb.append("    typeOfTransfers: ").append(toIndentedString(typeOfTransfers)).append("\n");
    sb.append("    domesticTransfers: ").append(toIndentedString(domesticTransfers)).append("\n");
    sb.append("    eeATransfers: ").append(toIndentedString(eeATransfers)).append("\n");
    sb.append("    nonEEATransfers: ").append(toIndentedString(nonEEATransfers)).append("\n");
    sb.append("    taxTransfers: ").append(toIndentedString(taxTransfers)).append("\n");
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

