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
 * Klasa zawierająca informacje o PSU / PSU Information Class
 */
@ApiModel(description = "Klasa zawierająca informacje o PSU / PSU Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RequestHeader implements Serializable {
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

    public RequestHeader requestId(UUID requestId) {
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

    public RequestHeader userAgent(String userAgent) {
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

    public RequestHeader ipAddress(String ipAddress) {
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

    public RequestHeader sendDate(OffsetDateTime sendDate) {
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

    public RequestHeader tppId(String tppId) {
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

    public RequestHeader token(String token) {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestHeader requestHeader = (RequestHeader) o;
        return Objects.equals(this.requestId, requestHeader.requestId) &&
                Objects.equals(this.userAgent, requestHeader.userAgent) &&
                Objects.equals(this.ipAddress, requestHeader.ipAddress) &&
                Objects.equals(this.sendDate, requestHeader.sendDate) &&
                Objects.equals(this.tppId, requestHeader.tppId) &&
                Objects.equals(this.token, requestHeader.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, userAgent, ipAddress, sendDate, tppId, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestHeader {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
        sb.append("    tppId: ").append(toIndentedString(tppId)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

