package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa informacji o płatniku do US / Tax Payor Information Class
 */
@ApiModel(description = "Klasa informacji o płatniku do US / Tax Payor Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class Payor implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("payorId")
    private String payorId = null;
    @JsonProperty("payorIdType")
    private PayorIdTypeEnum payorIdType = null;

    public Payor payorId(String payorId) {
        this.payorId = payorId;
        return this;
    }

    /**
     * Identyfikator płatnika / Payor ID
     *
     * @return payorId
     **/
    @ApiModelProperty(required = true, value = "Identyfikator płatnika / Payor ID")
    @NotNull

    @Size(max = 20)
    public String getPayorId() {
        return payorId;
    }

    public void setPayorId(String payorId) {
        this.payorId = payorId;
    }

    public Payor payorIdType(PayorIdTypeEnum payorIdType) {
        this.payorIdType = payorIdType;
        return this;
    }

    /**
     * Typ identyfikatora płatnika / Payor ID type
     *
     * @return payorIdType
     **/
    @ApiModelProperty(required = true, value = "Typ identyfikatora płatnika / Payor ID type")
    @NotNull


    public PayorIdTypeEnum getPayorIdType() {
        return payorIdType;
    }

    public void setPayorIdType(PayorIdTypeEnum payorIdType) {
        this.payorIdType = payorIdType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Payor payor = (Payor) o;
        return Objects.equals(this.payorId, payor.payorId) &&
                Objects.equals(this.payorIdType, payor.payorIdType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payorId, payorIdType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Payor {\n");

        sb.append("    payorId: ").append(toIndentedString(payorId)).append("\n");
        sb.append("    payorIdType: ").append(toIndentedString(payorIdType)).append("\n");
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
     * Typ identyfikatora płatnika / Payor ID type
     */
    public enum PayorIdTypeEnum {
        N("N"),

        P("P"),

        R("R"),

        _1("1"),

        _2("2"),

        _3("3");

        private String value;

        PayorIdTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static PayorIdTypeEnum fromValue(String text) {
            for (PayorIdTypeEnum b : PayorIdTypeEnum.values()) {
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

