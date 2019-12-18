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
 * Klasa zapytania o status paczki płatności / Bundle Request Class
 */
@ApiModel(description = "Klasa zapytania o status paczki płatności / Bundle Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class BundleRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeader requestHeader = null;

    @JsonProperty("bundleId")
    private String bundleId = null;

    @JsonProperty("tppBundleId")
    private String tppBundleId = null;

    @JsonProperty("transactionsIncluded")
    private Boolean transactionsIncluded = null;

    public BundleRequest requestHeader(RequestHeader requestHeader) {
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

    public BundleRequest bundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Identyfikator paczki przelewów. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Bundle of payments identifier.Conditionally required - in case TPP has received this identifier from ASPSP.
     *
     * @return bundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki przelewów. Wymagany warunkowo - jeśli TPP otrzymał ten identyfikator od ASPSP. / Bundle of payments identifier.Conditionally required - in case TPP has received this identifier from ASPSP.")

    @Size(max = 64)
    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public BundleRequest tppBundleId(String tppBundleId) {
        this.tppBundleId = tppBundleId;
        return this;
    }

    /**
     * Identyfikator paczki przelewów nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora bundleId od ASPSP. / Bundle of payments identifier set by TPP. Conditionally required - in case TPP has not received bundleId from ASPSP.
     *
     * @return tppBundleId
     **/
    @ApiModelProperty(value = "Identyfikator paczki przelewów nadany przez TPP. Wymagany warunkowo - jeśli TPP nie otrzymał identyfikatora bundleId od ASPSP. / Bundle of payments identifier set by TPP. Conditionally required - in case TPP has not received bundleId from ASPSP.")

    @Size(max = 64)
    public String getTppBundleId() {
        return tppBundleId;
    }

    public void setTppBundleId(String tppBundleId) {
        this.tppBundleId = tppBundleId;
    }

    public BundleRequest transactionsIncluded(Boolean transactionsIncluded) {
        this.transactionsIncluded = transactionsIncluded;
        return this;
    }

    /**
     * (true / false) Znacznik oznaczający czy w odpowiedzi mają być uwzględnione statusy transakcji wchodzące w skład paczki / Indicates if statuses of payments from the bundle should be included
     *
     * @return transactionsIncluded
     **/
    @ApiModelProperty(required = true, value = "(true / false) Znacznik oznaczający czy w odpowiedzi mają być uwzględnione statusy transakcji wchodzące w skład paczki / Indicates if statuses of payments from the bundle should be included")
    @NotNull


    public Boolean isTransactionsIncluded() {
        return transactionsIncluded;
    }

    public void setTransactionsIncluded(Boolean transactionsIncluded) {
        this.transactionsIncluded = transactionsIncluded;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BundleRequest bundleRequest = (BundleRequest) o;
        return Objects.equals(this.requestHeader, bundleRequest.requestHeader) &&
                Objects.equals(this.bundleId, bundleRequest.bundleId) &&
                Objects.equals(this.tppBundleId, bundleRequest.tppBundleId) &&
                Objects.equals(this.transactionsIncluded, bundleRequest.transactionsIncluded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, bundleId, tppBundleId, transactionsIncluded);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    tppBundleId: ").append(toIndentedString(tppBundleId)).append("\n");
        sb.append("    transactionsIncluded: ").append(toIndentedString(transactionsIncluded)).append("\n");
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

