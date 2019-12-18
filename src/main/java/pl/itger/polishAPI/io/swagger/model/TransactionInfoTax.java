package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa informacji danych dla przelewu podatkowego do Urzędu Skarbowego lub Izby Celnej / Tax Transfer
 */
@ApiModel(description = "Klasa informacji danych dla przelewu podatkowego do Urzędu Skarbowego lub Izby Celnej / Tax Transfer")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TransactionInfoTax implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("payerInfo")
    private Payor payerInfo = null;

    @JsonProperty("formCode")
    private String formCode = null;

    @JsonProperty("periodId")
    private String periodId = null;

    @JsonProperty("periodType")
    private String periodType = null;

    @JsonProperty("year")
    private Integer year = null;

    @JsonProperty("obligationId")
    private String obligationId = null;

    public TransactionInfoTax payerInfo(Payor payerInfo) {
        this.payerInfo = payerInfo;
        return this;
    }

    /**
     * Get payerInfo
     *
     * @return payerInfo
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Payor getPayerInfo() {
        return payerInfo;
    }

    public void setPayerInfo(Payor payerInfo) {
        this.payerInfo = payerInfo;
    }

    public TransactionInfoTax formCode(String formCode) {
        this.formCode = formCode;
        return this;
    }

    /**
     * Symbol formularza Urzędu Skarbowego lub Izby Celnej / Tax authority form symbol
     *
     * @return formCode
     **/
    @ApiModelProperty(required = true, value = "Symbol formularza Urzędu Skarbowego lub Izby Celnej / Tax authority form symbol")
    @NotNull

    @Size(max = 7)
    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public TransactionInfoTax periodId(String periodId) {
        this.periodId = periodId;
        return this;
    }

    /**
     * Numer okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period number. Required conditionally - depending on formCode parameter value.
     *
     * @return periodId
     **/
    @ApiModelProperty(value = "Numer okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period number. Required conditionally - depending on formCode parameter value.")

    @Size(max = 7)
    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public TransactionInfoTax periodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * Typ okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period type. Required conditionally - depending on formCode parameter value.
     *
     * @return periodType
     **/
    @ApiModelProperty(value = "Typ okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period type. Required conditionally - depending on formCode parameter value.")

    @Size(max = 7)
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public TransactionInfoTax year(Integer year) {
        this.year = year;
        return this;
    }

    /**
     * Rok okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period year. Required conditionally - depending on formCode parameter value.
     * maximum: 9999
     *
     * @return year
     **/
    @ApiModelProperty(value = "Rok okresu. Wymagany warunkowo - w zależności od wartości parametru formCode. / Period year. Required conditionally - depending on formCode parameter value.")

    @Max(9999)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public TransactionInfoTax obligationId(String obligationId) {
        this.obligationId = obligationId;
        return this;
    }

    /**
     * Identyfikator zobowiązania, z którego wynika należność podatku np. decyzja, tytuł wykonawczy, postanowienie / Obligation ID
     *
     * @return obligationId
     **/
    @ApiModelProperty(value = "Identyfikator zobowiązania, z którego wynika należność podatku np. decyzja, tytuł wykonawczy, postanowienie / Obligation ID")

    @Size(max = 40)
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
        TransactionInfoTax transactionInfoTax = (TransactionInfoTax) o;
        return Objects.equals(this.payerInfo, transactionInfoTax.payerInfo) &&
                Objects.equals(this.formCode, transactionInfoTax.formCode) &&
                Objects.equals(this.periodId, transactionInfoTax.periodId) &&
                Objects.equals(this.periodType, transactionInfoTax.periodType) &&
                Objects.equals(this.year, transactionInfoTax.year) &&
                Objects.equals(this.obligationId, transactionInfoTax.obligationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payerInfo, formCode, periodId, periodType, year, obligationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionInfoTax {\n");

        sb.append("    payerInfo: ").append(toIndentedString(payerInfo)).append("\n");
        sb.append("    formCode: ").append(toIndentedString(formCode)).append("\n");
        sb.append("    periodId: ").append(toIndentedString(periodId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

