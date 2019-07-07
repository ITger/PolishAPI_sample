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
 * Klasa odpowiedzi na zapytanie TPP o autoryzację PSU do wykonania usługi interfejsu XS2A
 */
@ApiModel(description = "Klasa odpowiedzi na zapytanie TPP o autoryzację PSU do wykonania usługi interfejsu XS2A")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class AuthorizeResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("aspspRedirectUri")
    private String aspspRedirectUri = null;

    public AuthorizeResponse responseHeader(ResponseHeader responseHeader) {
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

    public AuthorizeResponse aspspRedirectUri(String aspspRedirectUri) {
        this.aspspRedirectUri = aspspRedirectUri;
        return this;
    }

    /**
     * Adres po stronie ASPSP, na który TPP powinien dokonać przekierowania przeglądarki PSU w celu jego uwierzytelnienia
     *
     * @return aspspRedirectUri
     **/
    @ApiModelProperty(required = true, value = "Adres po stronie ASPSP, na który TPP powinien dokonać przekierowania przeglądarki PSU w celu jego uwierzytelnienia")
    @NotNull


    public String getAspspRedirectUri() {
        return aspspRedirectUri;
    }

    public void setAspspRedirectUri(String aspspRedirectUri) {
        this.aspspRedirectUri = aspspRedirectUri;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizeResponse authorizeResponse = (AuthorizeResponse) o;
        return Objects.equals(this.responseHeader, authorizeResponse.responseHeader) &&
                Objects.equals(this.aspspRedirectUri, authorizeResponse.aspspRedirectUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, aspspRedirectUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    aspspRedirectUri: ").append(toIndentedString(aspspRedirectUri)).append("\n");
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

