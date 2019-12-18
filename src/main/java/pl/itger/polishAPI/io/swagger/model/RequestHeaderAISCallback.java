package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Klasa zawierająca informacje o PSU and callback URL / PSU and callback URL Information Class
 */
@ApiModel(description = "Klasa zawierająca informacje o PSU and callback URL / PSU and callback URL Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RequestHeaderAISCallback implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestId")
    private UUID requestId = null;

    @JsonProperty("userAgent")
    private String userAgent = null;

    @JsonProperty("ipAddress")
    private String ipAddress = null;

    @JsonProperty("sendDate")
    private OffsetDateTime sendDate = null;

    @JsonProperty("tppId")
    private String tppId = null;

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("isDirectPsu")
    private Boolean isDirectPsu = null;

    @JsonProperty("callbackURL")
    private String callbackURL = null;

    @JsonProperty("apiKey")
    private String apiKey = null;

    public RequestHeaderAISCallback requestId(UUID requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1) zgodnym ze standardem RFC 4122 / Request ID using UUID format (Variant 1, Version 1) described in RFC 4122 standard
     *
     * @return requestId
     **/
    @ApiModelProperty(required = true, value = "Identyfikator żądania w formacie UUID (Wariant 1, Wersja 1) zgodnym ze standardem RFC 4122 / Request ID using UUID format (Variant 1, Version 1) described in RFC 4122 standard")
    @NotNull

    @Valid

    public UUID getRequestId() {
        return requestId;
    }

    public void setRequestId(UUID requestId) {
        this.requestId = requestId;
    }

    public RequestHeaderAISCallback userAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * Browser agent dla PSU / PSU browser agent
     *
     * @return userAgent
     **/
    @ApiModelProperty(value = "Browser agent dla PSU / PSU browser agent")


    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public RequestHeaderAISCallback ipAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Adres IP końcowego urządzenia PSU. Wymagany dla isDirectPsu=true. / IP address of PSU's terminal device. Required when isDirectPsu=true.
     *
     * @return ipAddress
     **/
    @ApiModelProperty(value = "Adres IP końcowego urządzenia PSU. Wymagany dla isDirectPsu=true. / IP address of PSU's terminal device. Required when isDirectPsu=true.")


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public RequestHeaderAISCallback sendDate(OffsetDateTime sendDate) {
        this.sendDate = sendDate;
        return this;
    }

    /**
     * Oryginalna data wysłania, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date
     *
     * @return sendDate
     **/
    @ApiModelProperty(value = "Oryginalna data wysłania, format: YYYY-MM-DDThh:mm:ss[.mmm] / Send date")

    @Valid

    public OffsetDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(OffsetDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public RequestHeaderAISCallback tppId(String tppId) {
        this.tppId = tppId;
        return this;
    }

    /**
     * Identyfikator TPP / TPP ID
     *
     * @return tppId
     **/
    @ApiModelProperty(value = "Identyfikator TPP / TPP ID")


    public String getTppId() {
        return tppId;
    }

    public void setTppId(String tppId) {
        this.tppId = tppId;
    }

    public RequestHeaderAISCallback token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Token autoryzacyjny / Authorization token
     *
     * @return token
     **/
    @ApiModelProperty(required = true, value = "Token autoryzacyjny / Authorization token")
    @NotNull


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RequestHeaderAISCallback isDirectPsu(Boolean isDirectPsu) {
        this.isDirectPsu = isDirectPsu;
        return this;
    }

    /**
     * (true/false) Znacznik informujący czy request jest przesłany bezpośrednio przez PSU. Domyślna wartość to false. / Is request sent by PSU directly. false is default value.
     *
     * @return isDirectPsu
     **/
    @ApiModelProperty(value = "(true/false) Znacznik informujący czy request jest przesłany bezpośrednio przez PSU. Domyślna wartość to false. / Is request sent by PSU directly. false is default value.")


    public Boolean isIsDirectPsu() {
        return isDirectPsu;
    }

    public void setIsDirectPsu(Boolean isDirectPsu) {
        this.isDirectPsu = isDirectPsu;
    }

    public RequestHeaderAISCallback callbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }

    /**
     * adres funkcji zwrotnej / callback URL
     *
     * @return callbackURL
     **/
    @ApiModelProperty(value = "adres funkcji zwrotnej / callback URL")


    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public RequestHeaderAISCallback apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * API key dla wywołania funkcji zwrotnej / callback API key
     *
     * @return apiKey
     **/
    @ApiModelProperty(value = "API key dla wywołania funkcji zwrotnej / callback API key")


    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestHeaderAISCallback requestHeaderAISCallback = (RequestHeaderAISCallback) o;
        return Objects.equals(this.requestId, requestHeaderAISCallback.requestId) &&
                Objects.equals(this.userAgent, requestHeaderAISCallback.userAgent) &&
                Objects.equals(this.ipAddress, requestHeaderAISCallback.ipAddress) &&
                Objects.equals(this.sendDate, requestHeaderAISCallback.sendDate) &&
                Objects.equals(this.tppId, requestHeaderAISCallback.tppId) &&
                Objects.equals(this.token, requestHeaderAISCallback.token) &&
                Objects.equals(this.isDirectPsu, requestHeaderAISCallback.isDirectPsu) &&
                Objects.equals(this.callbackURL, requestHeaderAISCallback.callbackURL) &&
                Objects.equals(this.apiKey, requestHeaderAISCallback.apiKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, userAgent, ipAddress, sendDate, tppId, token, isDirectPsu, callbackURL, apiKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestHeaderAISCallback {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
        sb.append("    tppId: ").append(toIndentedString(tppId)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    isDirectPsu: ").append(toIndentedString(isDirectPsu)).append("\n");
        sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

