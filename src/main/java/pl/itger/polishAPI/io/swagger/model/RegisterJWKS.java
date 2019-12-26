package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pl.itger.polishAPI.io.swagger.model.RegisterJWKSKeys;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Kolekcja kluczy (certyfikatów - dla kryptografii asymetrycznej), które mogą zostać użyte przez ASPSP dla podpisu odpowiedzi API. Zgodnie RFC 7591 i RFC 7517. Wymagane warunkowo o ile nie podano jwks_uri. / A collection of keys (certificates - for asymmetric cryptography) that can be used by ASPSP for API response signature. RFC 7591 and RFC 7517 compliant. Required conditionally unless jwks_uri is specified.
 */
@ApiModel(description = "Kolekcja kluczy (certyfikatów - dla kryptografii asymetrycznej), które mogą zostać użyte przez ASPSP dla podpisu odpowiedzi API. Zgodnie RFC 7591 i RFC 7517. Wymagane warunkowo o ile nie podano jwks_uri. / A collection of keys (certificates - for asymmetric cryptography) that can be used by ASPSP for API response signature. RFC 7591 and RFC 7517 compliant. Required conditionally unless jwks_uri is specified.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RegisterJWKS  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("keys")
  @Valid
  private List<RegisterJWKSKeys> keys = new ArrayList<>();

  public RegisterJWKS keys(List<RegisterJWKSKeys> keys) {
    this.keys = keys;
    return this;
  }

  public RegisterJWKS addKeysItem(RegisterJWKSKeys keysItem) {
    this.keys.add(keysItem);
    return this;
  }

  /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RegisterJWKSKeys> getKeys() {
    return keys;
  }

  public void setKeys(List<RegisterJWKSKeys> keys) {
    this.keys = keys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterJWKS registerJWKS = (RegisterJWKS) o;
    return Objects.equals(this.keys, registerJWKS.keys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterJWKS {\n");
    
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
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

