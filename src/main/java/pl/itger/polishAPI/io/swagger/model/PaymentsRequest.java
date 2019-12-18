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
 * Klasa zapytania o statusy wielu płatności / Payments Request Class
 */
@ApiModel(description = "Klasa zapytania o statusy wielu płatności / Payments Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PaymentsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderWithoutToken requestHeader = null;

    @JsonProperty("payments")
    @Valid
    private List<PaymentTokenEntry> payments = new ArrayList<>();

    public PaymentsRequest requestHeader(RequestHeaderWithoutToken requestHeader) {
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

    public RequestHeaderWithoutToken getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeaderWithoutToken requestHeader) {
        this.requestHeader = requestHeader;
    }

    public PaymentsRequest payments(List<PaymentTokenEntry> payments) {
        this.payments = payments;
        return this;
    }

    public PaymentsRequest addPaymentsItem(PaymentTokenEntry paymentsItem) {
        this.payments.add(paymentsItem);
        return this;
    }

    /**
     * Get payments
     *
     * @return payments
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public List<PaymentTokenEntry> getPayments() {
        return payments;
    }

    public void setPayments(List<PaymentTokenEntry> payments) {
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
        PaymentsRequest paymentsRequest = (PaymentsRequest) o;
        return Objects.equals(this.requestHeader, paymentsRequest.requestHeader) &&
                Objects.equals(this.payments, paymentsRequest.payments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, payments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentsRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
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

