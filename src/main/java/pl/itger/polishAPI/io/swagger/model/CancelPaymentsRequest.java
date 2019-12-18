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
 * Klasa zapytania o odwołanie przelewu lub paczki przelewów.  Wymagany warunkowo jeden z atrybutów - transactionId lub bundleId / Payment or bundle of payments cancelation request class. One of the following attributes is required: transactionId or bundleId
 */
@ApiModel(description = "Klasa zapytania o odwołanie przelewu lub paczki przelewów.  Wymagany warunkowo jeden z atrybutów - transactionId lub bundleId / Payment or bundle of payments cancelation request class. One of the following attributes is required: transactionId or bundleId")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class CancelPaymentsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeader requestHeader = null;

    @JsonProperty("paymentId")
    private String paymentId = null;

    @JsonProperty("bundleId")
    private String bundleId = null;

    public CancelPaymentsRequest requestHeader(RequestHeader requestHeader) {
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

    public CancelPaymentsRequest paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Identyfikator płatności / Payment ID
     *
     * @return paymentId
     **/
    @ApiModelProperty(value = "Identyfikator płatności / Payment ID")

    @Size(max = 64)
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public CancelPaymentsRequest bundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Identyfikator paczki przelewów / Bundle of payments ID
     *
     * @return bundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki przelewów / Bundle of payments ID")


    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelPaymentsRequest cancelPaymentsRequest = (CancelPaymentsRequest) o;
        return Objects.equals(this.requestHeader, cancelPaymentsRequest.requestHeader) &&
                Objects.equals(this.paymentId, cancelPaymentsRequest.paymentId) &&
                Objects.equals(this.bundleId, cancelPaymentsRequest.bundleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, paymentId, bundleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelPaymentsRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

