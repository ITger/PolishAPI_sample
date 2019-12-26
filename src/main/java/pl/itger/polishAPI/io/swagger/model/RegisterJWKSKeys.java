package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Zestaw kluczy JWK (JSON Web Key). Zgodnie z RFC 7591 i RFC 7517. / A key set of JWK (JSON Web Key). RFC 7591 and RFC 7517 compliant.
 */
@ApiModel(description = "Zestaw kluczy JWK (JSON Web Key). Zgodnie z RFC 7591 i RFC 7517. / A key set of JWK (JSON Web Key). RFC 7591 and RFC 7517 compliant.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RegisterJWKSKeys  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("x5c")
  @Valid
  private List<String> x5c = new ArrayList<>();

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("kid")
  private String kid = null;

  public RegisterJWKSKeys kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * Get kty
   * @return kty
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public RegisterJWKSKeys x5c(List<String> x5c) {
    this.x5c = x5c;
    return this;
  }

  public RegisterJWKSKeys addX5cItem(String x5cItem) {
    this.x5c.add(x5cItem);
    return this;
  }

  /**
   * Get x5c
   * @return x5c
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getX5c() {
    return x5c;
  }

  public void setX5c(List<String> x5c) {
    this.x5c = x5c;
  }

  public RegisterJWKSKeys use(String use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public RegisterJWKSKeys kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterJWKSKeys registerJWKSKeys = (RegisterJWKSKeys) o;
    return Objects.equals(this.kty, registerJWKSKeys.kty) &&
        Objects.equals(this.x5c, registerJWKSKeys.x5c) &&
        Objects.equals(this.use, registerJWKSKeys.use) &&
        Objects.equals(this.kid, registerJWKSKeys.kid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kty, x5c, use, kid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterJWKSKeys {\n");
    
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    x5c: ").append(toIndentedString(x5c)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
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

