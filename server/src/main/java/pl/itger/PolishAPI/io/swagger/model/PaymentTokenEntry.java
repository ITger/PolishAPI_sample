package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa opisująca informacje wymagane do pobrania informacji o statusie zainicjowanej płatności w ramach zapytania zbiorczego / Class defining a pair of information required to retreive the status of initiated payment
 */
@ApiModel(description = "Klasa opisująca informacje wymagane do pobrania informacji o statusie zainicjowanej płatności w ramach zapytania zbiorczego / Class defining a pair of information required to retreive the status of initiated payment")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class PaymentTokenEntry   {
  @JsonProperty("paymentId")
  private String paymentId = null;

  @JsonProperty("tppTransactionId")
  private String tppTransactionId = null;

  @JsonProperty("accessToken")
  private String accessToken = null;

  public PaymentTokenEntry paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.
   * @return paymentId
  **/
  @ApiModelProperty(value = "Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.")

@Size(max=64) 
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentTokenEntry tppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
    return this;
  }

  /**
   * Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.
   * @return tppTransactionId
  **/
  @ApiModelProperty(value = "Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.")

@Size(max=64) 
  public String getTppTransactionId() {
    return tppTransactionId;
  }

  public void setTppTransactionId(String tppTransactionId) {
    this.tppTransactionId = tppTransactionId;
  }

  public PaymentTokenEntry accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access token użyty do zainicjowania płatności / Access token used to initiate payment
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "Access token użyty do zainicjowania płatności / Access token used to initiate payment")
  @NotNull


  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTokenEntry paymentTokenEntry = (PaymentTokenEntry) o;
    return Objects.equals(this.paymentId, paymentTokenEntry.paymentId) &&
        Objects.equals(this.tppTransactionId, paymentTokenEntry.tppTransactionId) &&
        Objects.equals(this.accessToken, paymentTokenEntry.accessToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, tppTransactionId, accessToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenEntry {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

