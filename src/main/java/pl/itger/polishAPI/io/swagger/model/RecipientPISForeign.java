package pl.itger.polishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.polishAPI.io.swagger.model.NameAddress;
import pl.itger.polishAPI.io.swagger.model.RecipientPIS;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zawierająca dane odbiorcy używana w żądaniach PIS dla operacji zagranicznych / PIS foreign Recipient Data Class
 */
@ApiModel(description = "Klasa zawierająca dane odbiorcy używana w żądaniach PIS dla operacji zagranicznych / PIS foreign Recipient Data Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-12-26T17:08:40.154+01:00")

public class RecipientPISForeign  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("nameAddress")
  private NameAddress nameAddress = null;

  @JsonProperty("countryCode")
  private String countryCode = null;

  public RecipientPISForeign accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=34) 
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public RecipientPISForeign nameAddress(NameAddress nameAddress) {
    this.nameAddress = nameAddress;
    return this;
  }

  /**
   * Get nameAddress
   * @return nameAddress
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NameAddress getNameAddress() {
    return nameAddress;
  }

  public void setNameAddress(NameAddress nameAddress) {
    this.nameAddress = nameAddress;
  }

  public RecipientPISForeign countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Kod kraju odbiorcy przelewu, wg normy ISO 3166-1 alfa-3 / Country code of payment recipient, ISO 3166-1 alfa-3 compliant
   * @return countryCode
  **/
  @ApiModelProperty(required = true, value = "Kod kraju odbiorcy przelewu, wg normy ISO 3166-1 alfa-3 / Country code of payment recipient, ISO 3166-1 alfa-3 compliant")
  @NotNull

@Size(max=3) 
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecipientPISForeign recipientPISForeign = (RecipientPISForeign) o;
    return Objects.equals(this.accountNumber, recipientPISForeign.accountNumber) &&
        Objects.equals(this.nameAddress, recipientPISForeign.nameAddress) &&
        Objects.equals(this.countryCode, recipientPISForeign.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, nameAddress, countryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecipientPISForeign {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    nameAddress: ").append(toIndentedString(nameAddress)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

