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
 * Klasa zapytania o usunięcie zgody na dostęp do AIS
 */
@ApiModel(description = "Klasa zapytania o usunięcie zgody na dostęp do AIS")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class DeleteConsentRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderWithoutToken requestHeader = null;

    @JsonProperty("consentId")
    private String consentId = null;

    public DeleteConsentRequest requestHeader(RequestHeaderWithoutToken requestHeader) {
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

    public DeleteConsentRequest consentId(String consentId) {
        this.consentId = consentId;
        return this;
    }

    /**
     * Identyfikator zgody / Consent ID
     *
     * @return consentId
     **/
    @ApiModelProperty(required = true, value = "Identyfikator zgody / Consent ID")
    @NotNull


    public String getConsentId() {
        return consentId;
    }

    public void setConsentId(String consentId) {
        this.consentId = consentId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteConsentRequest deleteConsentRequest = (DeleteConsentRequest) o;
        return Objects.equals(this.requestHeader, deleteConsentRequest.requestHeader) &&
                Objects.equals(this.consentId, deleteConsentRequest.consentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, consentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteConsentRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

