package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa odpowiedzi na pytanie o status płatności cyklicznej / Response data with status of recurring payment
 */
@ApiModel(description = "Klasa odpowiedzi na pytanie o status płatności cyklicznej / Response data with status of recurring payment")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecurringPaymentStatusResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("recurringPaymentId")
    private String recurringPaymentId = null;

    @JsonProperty("tppRecurringPaymentId")
    private String tppRecurringPaymentId = null;
    @JsonProperty("recurringPaymentStatus")
    private RecurringPaymentStatusEnum recurringPaymentStatus = null;
    @JsonProperty("recurringPaymentDetailedStatus")
    private String recurringPaymentDetailedStatus = null;

    public RecurringPaymentStatusResponse responseHeader(ResponseHeader responseHeader) {
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

    public RecurringPaymentStatusResponse recurringPaymentId(String recurringPaymentId) {
        this.recurringPaymentId = recurringPaymentId;
        return this;
    }

    /**
     * Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP
     *
     * @return recurringPaymentId
     **/
    @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez APSP / Recurring payment identifier set by ASPSP")
    @NotNull

    @Size(max = 64)
    public String getRecurringPaymentId() {
        return recurringPaymentId;
    }

    public void setRecurringPaymentId(String recurringPaymentId) {
        this.recurringPaymentId = recurringPaymentId;
    }

    public RecurringPaymentStatusResponse tppRecurringPaymentId(String tppRecurringPaymentId) {
        this.tppRecurringPaymentId = tppRecurringPaymentId;
        return this;
    }

    /**
     * Identyfikator płatności cyklicznej nadany przez TPP. / Recurring payment identifier set by TPP.
     *
     * @return tppRecurringPaymentId
     **/
    @ApiModelProperty(required = true, value = "Identyfikator płatności cyklicznej nadany przez TPP. / Recurring payment identifier set by TPP.")
    @NotNull

    @Size(max = 64)
    public String getTppRecurringPaymentId() {
        return tppRecurringPaymentId;
    }

    public void setTppRecurringPaymentId(String tppRecurringPaymentId) {
        this.tppRecurringPaymentId = tppRecurringPaymentId;
    }

    public RecurringPaymentStatusResponse recurringPaymentStatus(RecurringPaymentStatusEnum recurringPaymentStatus) {
        this.recurringPaymentStatus = recurringPaymentStatus;
        return this;
    }

    /**
     * Status płatności cyklicznej / Recurring payment status
     *
     * @return recurringPaymentStatus
     **/
    @ApiModelProperty(value = "Status płatności cyklicznej / Recurring payment status")


    public RecurringPaymentStatusEnum getRecurringPaymentStatus() {
        return recurringPaymentStatus;
    }

    public void setRecurringPaymentStatus(RecurringPaymentStatusEnum recurringPaymentStatus) {
        this.recurringPaymentStatus = recurringPaymentStatus;
    }

    public RecurringPaymentStatusResponse recurringPaymentDetailedStatus(String recurringPaymentDetailedStatus) {
        this.recurringPaymentDetailedStatus = recurringPaymentDetailedStatus;
        return this;
    }

    /**
     * Szczegółowy status płatności cyklicznej / Recurring payment detailed status
     *
     * @return recurringPaymentDetailedStatus
     **/
    @ApiModelProperty(value = "Szczegółowy status płatności cyklicznej / Recurring payment detailed status")


    public String getRecurringPaymentDetailedStatus() {
        return recurringPaymentDetailedStatus;
    }

    public void setRecurringPaymentDetailedStatus(String recurringPaymentDetailedStatus) {
        this.recurringPaymentDetailedStatus = recurringPaymentDetailedStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecurringPaymentStatusResponse recurringPaymentStatusResponse = (RecurringPaymentStatusResponse) o;
        return Objects.equals(this.responseHeader, recurringPaymentStatusResponse.responseHeader) &&
                Objects.equals(this.recurringPaymentId, recurringPaymentStatusResponse.recurringPaymentId) &&
                Objects.equals(this.tppRecurringPaymentId, recurringPaymentStatusResponse.tppRecurringPaymentId) &&
                Objects.equals(this.recurringPaymentStatus, recurringPaymentStatusResponse.recurringPaymentStatus) &&
                Objects.equals(this.recurringPaymentDetailedStatus, recurringPaymentStatusResponse.recurringPaymentDetailedStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, recurringPaymentId, tppRecurringPaymentId, recurringPaymentStatus, recurringPaymentDetailedStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecurringPaymentStatusResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    recurringPaymentId: ").append(toIndentedString(recurringPaymentId)).append("\n");
        sb.append("    tppRecurringPaymentId: ").append(toIndentedString(tppRecurringPaymentId)).append("\n");
        sb.append("    recurringPaymentStatus: ").append(toIndentedString(recurringPaymentStatus)).append("\n");
        sb.append("    recurringPaymentDetailedStatus: ").append(toIndentedString(recurringPaymentDetailedStatus)).append("\n");
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

    /**
     * Status płatności cyklicznej / Recurring payment status
     */
    public enum RecurringPaymentStatusEnum {
        SUBMITTED("submitted"),

        INPROGRESS("inProgress"),

        CANCELLED("cancelled"),

        CLOSE("close");

        private String value;

        RecurringPaymentStatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static RecurringPaymentStatusEnum fromValue(String text) {
            for (RecurringPaymentStatusEnum b : RecurringPaymentStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

