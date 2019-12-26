package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o rejestrację aplikacji klienckiej / Request class for the client application registration
 */
@ApiModel(description = "Klasa zapytania o rejestrację aplikacji klienckiej / Request class for the client application registration")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RegisterRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("software_statement")
  private String softwareStatement = null;

  public RegisterRequest softwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
    return this;
  }

  /**
   * Get softwareStatement
   * @return softwareStatement
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getSoftwareStatement() {
    return softwareStatement;
  }

  public void setSoftwareStatement(String softwareStatement) {
    this.softwareStatement = softwareStatement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.softwareStatement, registerRequest.softwareStatement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(softwareStatement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    
    sb.append("    softwareStatement: ").append(toIndentedString(softwareStatement)).append("\n");
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

