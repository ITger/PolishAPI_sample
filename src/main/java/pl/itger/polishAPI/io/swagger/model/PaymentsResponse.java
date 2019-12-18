package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Klasa odpowiedzi na pytanie o wiele płatności
 */
@ApiModel(description = "Klasa odpowiedzi na pytanie o wiele płatności")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("payments")
    @Valid
    private List<PaymentInfo> payments = null;

    public PaymentsResponse responseHeader(ResponseHeader responseHeader) {
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

    public PaymentsResponse payments(List<PaymentInfo> payments) {
        this.payments = payments;
        return this;
    }

    public PaymentsResponse addPaymentsItem(PaymentInfo paymentsItem) {
        if (this.payments == null) {
            this.payments = new ArrayList<>();
        }
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * Get payments
     *
     * @return payments
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<PaymentInfo> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentInfo> payments) {
        this.payments = payments;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentsResponse paymentsResponse = (PaymentsResponse) o;
        return Objects.equals(this.responseHeader, paymentsResponse.responseHeader) &&
                Objects.equals(this.payments, paymentsResponse.payments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, payments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentsResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

