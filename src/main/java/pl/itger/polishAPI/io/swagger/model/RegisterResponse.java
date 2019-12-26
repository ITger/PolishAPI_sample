package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.RegisterJWKS;
import pl.itger.polishAPI.io.swagger.model.ResponseHeader;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Odpowiedź dotycząca poprawnej rejestracji aplikacji klienckiej / The response of the correct registration of the client application
 */
@ApiModel(description = "Odpowiedź dotycząca poprawnej rejestracji aplikacji klienckiej / The response of the correct registration of the client application")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RegisterResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("client_id")
  private String clientId = null;

  @JsonProperty("client_secret")
  private String clientSecret = null;

  @JsonProperty("api_key")
  private String apiKey = null;

  @JsonProperty("jwks")
  private RegisterJWKS jwks = null;

  @JsonProperty("jwks_uri")
  private String jwksUri = null;

  public RegisterResponse responseHeader(ResponseHeader responseHeader) {
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

  public RegisterResponse clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Unikalny identyfikator aplikacji TPP / The unique identifier of the TTP application
   * @return clientId
  **/
  @ApiModelProperty(value = "Unikalny identyfikator aplikacji TPP / The unique identifier of the TTP application")


  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public RegisterResponse clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Wartość tajna służąca uwierzytelnieniu aplikacji klienckiej względem serwera autoryzacji / A secret value used to authenticate the client application to the authorization server
   * @return clientSecret
  **/
  @ApiModelProperty(value = "Wartość tajna służąca uwierzytelnieniu aplikacji klienckiej względem serwera autoryzacji / A secret value used to authenticate the client application to the authorization server")


  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public RegisterResponse apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Wartość tajna służąca identyfikacji aplikacji klienckiej względem API / A secret value to identify the client application relative to the API
   * @return apiKey
  **/
  @ApiModelProperty(value = "Wartość tajna służąca identyfikacji aplikacji klienckiej względem API / A secret value to identify the client application relative to the API")


  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public RegisterResponse jwks(RegisterJWKS jwks) {
    this.jwks = jwks;
    return this;
  }

  /**
   * Get jwks
   * @return jwks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public RegisterJWKS getJwks() {
    return jwks;
  }

  public void setJwks(RegisterJWKS jwks) {
    this.jwks = jwks;
  }

  public RegisterResponse jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
  }

  /**
   * Kolekcja kluczy zawarta w URI (certyfikatów - dla kryptografii asymetrycznej), które mogą zostać użyte przez ASPSP dla podpisu odpowiedzi API. Zgodnie RFC 7591 i RFC 7517. Wymagane warunkowo o ile nie podano jwks. / A collection of keys contained in the URI (certificates - for asymmetric cryptography) that can be used by ASPSP for the signature of the API response. According to RFC 7591 and RFC 7517. Condition required unless jwks are given.
   * @return jwksUri
  **/
  @ApiModelProperty(value = "Kolekcja kluczy zawarta w URI (certyfikatów - dla kryptografii asymetrycznej), które mogą zostać użyte przez ASPSP dla podpisu odpowiedzi API. Zgodnie RFC 7591 i RFC 7517. Wymagane warunkowo o ile nie podano jwks. / A collection of keys contained in the URI (certificates - for asymmetric cryptography) that can be used by ASPSP for the signature of the API response. According to RFC 7591 and RFC 7517. Condition required unless jwks are given.")


  public String getJwksUri() {
    return jwksUri;
  }

  public void setJwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterResponse registerResponse = (RegisterResponse) o;
    return Objects.equals(this.responseHeader, registerResponse.responseHeader) &&
        Objects.equals(this.clientId, registerResponse.clientId) &&
        Objects.equals(this.clientSecret, registerResponse.clientSecret) &&
        Objects.equals(this.apiKey, registerResponse.apiKey) &&
        Objects.equals(this.jwks, registerResponse.jwks) &&
        Objects.equals(this.jwksUri, registerResponse.jwksUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, clientId, clientSecret, apiKey, jwks, jwksUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    jwks: ").append(toIndentedString(jwks)).append("\n");
    sb.append("    jwksUri: ").append(toIndentedString(jwksUri)).append("\n");
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

