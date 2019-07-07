package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa odpowiedzi zlecenia płatności / Payment Add Response Class
 */
@ApiModel(description = "Klasa odpowiedzi zlecenia płatności / Payment Add Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class AddPaymentResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("paymentId")
    private String paymentId = null;

    @JsonProperty("generalStatus")
    private PaymentStatus generalStatus = null;

    @JsonProperty("detailedStatus")
    private String detailedStatus = null;

    public AddPaymentResponse responseHeader(ResponseHeader responseHeader) {
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

    public AddPaymentResponse paymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }

    /**
     * Identyfiaktor płatności / Payment ID
     *
     * @return paymentId
     **/
    @ApiModelProperty(required = true, value = "Identyfiaktor płatności / Payment ID")
    @NotNull


    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public AddPaymentResponse generalStatus(PaymentStatus generalStatus) {
        this.generalStatus = generalStatus;
        return this;
    }

    /**
     * Get generalStatus
     *
     * @return generalStatus
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public PaymentStatus getGeneralStatus() {
        return generalStatus;
    }

    public void setGeneralStatus(PaymentStatus generalStatus) {
        this.generalStatus = generalStatus;
    }

    public AddPaymentResponse detailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
        return this;
    }

    /**
     * Status płatności / Detailed payment status
     *
     * @return detailedStatus
     **/
    @ApiModelProperty(required = true, value = "Status płatności / Detailed payment status")
    @NotNull


    public String getDetailedStatus() {
        return detailedStatus;
    }

    public void setDetailedStatus(String detailedStatus) {
        this.detailedStatus = detailedStatus;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddPaymentResponse addPaymentResponse = (AddPaymentResponse) o;
        return Objects.equals(this.responseHeader, addPaymentResponse.responseHeader) &&
                Objects.equals(this.paymentId, addPaymentResponse.paymentId) &&
                Objects.equals(this.generalStatus, addPaymentResponse.generalStatus) &&
                Objects.equals(this.detailedStatus, addPaymentResponse.detailedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, paymentId, generalStatus, detailedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddPaymentResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
        sb.append("    generalStatus: ").append(toIndentedString(generalStatus)).append("\n");
        sb.append("    detailedStatus: ").append(toIndentedString(detailedStatus)).append("\n");
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

