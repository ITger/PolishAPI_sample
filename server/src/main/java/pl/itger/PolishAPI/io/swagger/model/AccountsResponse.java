package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import pl.itger.PolishAPI.io.swagger.model.AccountBaseInfo;
import pl.itger.PolishAPI.io.swagger.model.PageInfo;
import pl.itger.PolishAPI.io.swagger.model.ResponseHeader;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi na zapytania o wiele kont PSU / PSU&#39;s Multiple Accounts Response Class
 */
@ApiModel(description = "Klasa odpowiedzi na zapytania o wiele kont PSU / PSU's Multiple Accounts Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-13T14:12:57.306+01:00")

public class AccountsResponse   {
  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("accounts")
  @Valid
  private List<AccountBaseInfo> accounts = null;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo = null;

  public AccountsResponse responseHeader(ResponseHeader responseHeader) {
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

  public AccountsResponse accounts(List<AccountBaseInfo> accounts) {
    this.accounts = accounts;
    return this;
  }

  public AccountsResponse addAccountsItem(AccountBaseInfo accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Get accounts
   * @return accounts
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountBaseInfo> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<AccountBaseInfo> accounts) {
    this.accounts = accounts;
  }

  public AccountsResponse pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   * @return pageInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsResponse accountsResponse = (AccountsResponse) o;
    return Objects.equals(this.responseHeader, accountsResponse.responseHeader) &&
        Objects.equals(this.accounts, accountsResponse.accounts) &&
        Objects.equals(this.pageInfo, accountsResponse.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, accounts, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

