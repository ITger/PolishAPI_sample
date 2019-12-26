package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.NameAddress;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca dane nadawcy przelewu krajowego i zagranicznego używana w żądaniach PIS / Domestic and Foreign PIS services Sender Data Class
 */
@ApiModel(description = "Klasa zawierająca dane nadawcy przelewu krajowego i zagranicznego używana w żądaniach PIS / Domestic and Foreign PIS services Sender Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class SenderPIS  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("nameAddress")
  private NameAddress nameAddress = null;

  public SenderPIS accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")

@Size(max=34) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public SenderPIS nameAddress(NameAddress nameAddress) {
    this.nameAddress = nameAddress;
    return this;
  }

  /**
   * Get nameAddress
   * @return nameAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public NameAddress getNameAddress() {
    return nameAddress;
  }

  public void setNameAddress(NameAddress nameAddress) {
    this.nameAddress = nameAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderPIS senderPIS = (SenderPIS) o;
    return Objects.equals(this.accountNumber, senderPIS.accountNumber) &&
        Objects.equals(this.nameAddress, senderPIS.nameAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, nameAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderPIS {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    nameAddress: ").append(toIndentedString(nameAddress)).append("\n");
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

