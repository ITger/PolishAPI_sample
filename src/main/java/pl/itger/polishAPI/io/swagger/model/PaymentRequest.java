package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zapytania o status płatności / Payment Request Class
 */
@ApiModel(description = "Klasa zapytania o status płatności / Payment Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeader requestHeader = null;

    @JsonProperty("paymentId")
    private String paymentId = null;

    @JsonProperty("tppTransactionId")
    private String tppTransactionId = null;

    public PaymentRequest requestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * Get requestHeader
     *
     * @return requestHeader
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeader requestHeader) {
        this.requestHeader = requestHeader;
    }

    public PaymentRequest paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.
     *
     * @return paymentId
     **/
    @ApiModelProperty(value = "Identyfikator płatności. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Identifier of the payment. Conditionally required - in case TPP has received this identifier from ASPSP.")

    @Size(max = 64)
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentRequest tppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
        return this;
    }

    /**
     * Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.
     *
     * @return tppTransactionId
     **/
    @ApiModelProperty(value = "Identyfikator transakcji nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora paymentId od ASPSP. / Identifier of transaction established by TPP. Conditionally required - in case TPP has not received paymentId from ASPSP.")

    @Size(max = 64)
    public String getTppTransactionId() {
        return tppTransactionId;
    }

    public void setTppTransactionId(String tppTransactionId) {
        this.tppTransactionId = tppTransactionId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentRequest paymentRequest = (PaymentRequest) o;
        return Objects.equals(this.requestHeader, paymentRequest.requestHeader) &&
                Objects.equals(this.paymentId, paymentRequest.paymentId) &&
                Objects.equals(this.tppTransactionId, paymentRequest.tppTransactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, paymentId, tppTransactionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    tppTransactionId: ").append(toIndentedString(tppTransactionId)).append("\n");
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

