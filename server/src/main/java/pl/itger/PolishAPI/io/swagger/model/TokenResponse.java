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
 * Klasa odpowiedzi na zapytanie TPP o wygenerowanie tokena dostępowego
 */
@ApiModel(description = "Klasa odpowiedzi na zapytanie TPP o wygenerowanie tokena dostępowego")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class TokenResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("responseHeader")
    private ResponseHeader responseHeader = null;

    @JsonProperty("access_token")
    private String accessToken = null;

    @JsonProperty("token_type")
    private String tokenType = null;

    @JsonProperty("expires_in")
    private String expiresIn = null;

    @JsonProperty("refresh_token")
    private String refreshToken = null;

    @JsonProperty("scope")
    private String scope = null;

    @JsonProperty("scope_details")
    private ScopeDetailsOutput scopeDetails = null;

    public TokenResponse responseHeader(ResponseHeader responseHeader) {
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

    public TokenResponse accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Wartość wygenerowanego tokena dostępowego
     *
     * @return accessToken
     **/
    @ApiModelProperty(required = true, value = "Wartość wygenerowanego tokena dostępowego")
    @NotNull


    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public TokenResponse tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Typ tokena dostępowego. Dozwolona wartość to Bearer.
     *
     * @return tokenType
     **/
    @ApiModelProperty(required = true, value = "Typ tokena dostępowego. Dozwolona wartość to Bearer.")
    @NotNull


    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public TokenResponse expiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Czas ważności tokena dostępowego, po którym zostanie on unieważniony. Wartość wyrażona w sekundach, od momentu wygenerowania odpowiedzi.
     *
     * @return expiresIn
     **/
    @ApiModelProperty(required = true, value = "Czas ważności tokena dostępowego, po którym zostanie on unieważniony. Wartość wyrażona w sekundach, od momentu wygenerowania odpowiedzi.")
    @NotNull


    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public TokenResponse refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Wartość wygenerowanego tokena służącego do uzyskania nowego tokena dostępowego bez konieczności ponownej autoryzacji
     *
     * @return refreshToken
     **/
    @ApiModelProperty(value = "Wartość wygenerowanego tokena służącego do uzyskania nowego tokena dostępowego bez konieczności ponownej autoryzacji")


    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public TokenResponse scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Typy zgód które uzyskał TPP. Lista identyfikatorów zgodna ze specyfikacją standardu Polish API.
     *
     * @return scope
     **/
    @ApiModelProperty(value = "Typy zgód które uzyskał TPP. Lista identyfikatorów zgodna ze specyfikacją standardu Polish API.")


    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public TokenResponse scopeDetails(ScopeDetailsOutput scopeDetails) {
        this.scopeDetails = scopeDetails;
        return this;
    }

    /**
     * Get scopeDetails
     *
     * @return scopeDetails
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public ScopeDetailsOutput getScopeDetails() {
        return scopeDetails;
    }

    public void setScopeDetails(ScopeDetailsOutput scopeDetails) {
        this.scopeDetails = scopeDetails;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) o;
        return Objects.equals(this.responseHeader, tokenResponse.responseHeader) &&
                Objects.equals(this.accessToken, tokenResponse.accessToken) &&
                Objects.equals(this.tokenType, tokenResponse.tokenType) &&
                Objects.equals(this.expiresIn, tokenResponse.expiresIn) &&
                Objects.equals(this.refreshToken, tokenResponse.refreshToken) &&
                Objects.equals(this.scope, tokenResponse.scope) &&
                Objects.equals(this.scopeDetails, tokenResponse.scopeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(responseHeader, accessToken, tokenType, expiresIn, refreshToken, scope, scopeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TokenResponse {\n");

        sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
        sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    scopeDetails: ").append(toIndentedString(scopeDetails)).append("\n");
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

