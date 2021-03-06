package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.ResponseHeader;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi na zapytanie TPP o autoryzację PSU do wykonania usługi interfejsu XS2A / Class of response for TPP request for PSU authorization of executing XS2A interface
 */
@ApiModel(description = "Klasa odpowiedzi na zapytanie TPP o autoryzację PSU do wykonania usługi interfejsu XS2A / Class of response for TPP request for PSU authorization of executing XS2A interface")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class AuthorizeResponse  implements Serializable {
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
   * Adres po stronie ASPSP, na który TPP powinien dokonać przekierowania przeglądarki PSU w celu jego uwierzytelnienia / The address on the ASPSP side to which the TPP should redirect the PSU browser in order to authenticate PSU
   * @return aspspRedirectUri
  **/
  @ApiModelProperty(required = true, value = "Adres po stronie ASPSP, na który TPP powinien dokonać przekierowania przeglądarki PSU w celu jego uwierzytelnienia / The address on the ASPSP side to which the TPP should redirect the PSU browser in order to authenticate PSU")
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

