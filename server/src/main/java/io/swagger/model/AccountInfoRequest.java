package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RequestHeaderAIS;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa zapytania o pojedynczy rachunek / Account Information Request Class
 */
@ApiModel(description = "Klasa zapytania o pojedynczy rachunek / Account Information Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class AccountInfoRequest  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("requestHeader")
  private RequestHeaderAIS requestHeader = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  public AccountInfoRequest requestHeader(RequestHeaderAIS requestHeader) {
    this.requestHeader = requestHeader;
    return this;
  }

  /**
   * Get requestHeader
   * @return requestHeader
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RequestHeaderAIS getRequestHeader() {
    return requestHeader;
  }

  public void setRequestHeader(RequestHeaderAIS requestHeader) {
    this.requestHeader = requestHeader;
  }

  public AccountInfoRequest accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Numer rachunku / Account number
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Numer rachunku / Account number")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountInfoRequest accountInfoRequest = (AccountInfoRequest) o;
    return Objects.equals(this.requestHeader, accountInfoRequest.requestHeader) &&
        Objects.equals(this.accountNumber, accountInfoRequest.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestHeader, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountInfoRequest {\n");
    
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

