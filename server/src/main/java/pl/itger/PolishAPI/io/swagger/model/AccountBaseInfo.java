package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.springframework.validation.annotation.Validated;

/**
 * Klasa informacji o koncie / Account Information Class
 */
@ApiModel(description = "Klasa informacji o koncie / Account Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
                            date = "2019-03-14T19:37:54.479+01:00")

public class AccountBaseInfo
        implements Serializable {

private static final long serialVersionUID = 1L;

@JsonProperty("accountNumber")
private String accountNumber = null;

@JsonProperty("accountTypeName")
private String accountTypeName = null;

@JsonProperty("accountType")
private DictionaryItem accountType = null;

@JsonProperty("psuRelations")
@Valid
private List<AccountPsuRelation> psuRelations = new ArrayList<>();

public AccountBaseInfo accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
}

/**
 * Numer rachunku (częściowo zamaskowany) / Account number (partly masked)
 *
 * @return accountNumber
  *
 */
@ApiModelProperty(required = true,
                  value = "Numer rachunku (częściowo zamaskowany) / Account number (partly masked)")
@NotNull
public String getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public AccountBaseInfo accountTypeName(String accountTypeName) {
    this.accountTypeName = accountTypeName;
    return this;
}

/**
 * Nazwa typu rachunku (definiowana przez ASPSP) / Account's type name (defined
 * by ASPSP)
 *
 * @return accountTypeName
  *
 */
@ApiModelProperty(required = true,
                  value = "Nazwa typu rachunku (definiowana przez ASPSP) / Account's type name (defined by ASPSP)")
@NotNull
@Size(max = 32)
public String getAccountTypeName() {
    return accountTypeName;
}

public void setAccountTypeName(String accountTypeName) {
    this.accountTypeName = accountTypeName;
}

public AccountBaseInfo accountType(DictionaryItem accountType) {
    this.accountType = accountType;
    return this;
}

/**
 * Get accountType
 *
 * @return accountType
  *
 */
@ApiModelProperty(required = true,
                  value = "")
@NotNull

@Valid

public DictionaryItem getAccountType() {
    return accountType;
}

public void setAccountType(DictionaryItem accountType) {
    this.accountType = accountType;
}

public AccountBaseInfo psuRelations(List<AccountPsuRelation> psuRelations) {
    this.psuRelations = psuRelations;
    return this;
}

public AccountBaseInfo addPsuRelationsItem(AccountPsuRelation psuRelationsItem) {
    this.psuRelations.add(psuRelationsItem);
    return this;
}

/**
 * Informacje na temat relacji PSU do rachunku / Description of relations
 * between PSU and an Account
 *
 * @return psuRelations
  *
 */
@ApiModelProperty(required = true,
                  value = "Informacje na temat relacji PSU do rachunku / Description of relations between PSU and an Account")
@NotNull

@Valid
@Size(min = 1)
public List<AccountPsuRelation> getPsuRelations() {
    return psuRelations;
}

public void setPsuRelations(List<AccountPsuRelation> psuRelations) {
    this.psuRelations = psuRelations;
}

@Override
public boolean equals(java.lang.Object o) {
    if (this == o) {
        return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    AccountBaseInfo accountBaseInfo = (AccountBaseInfo) o;
    return Objects.equals(this.accountNumber,
                          accountBaseInfo.accountNumber)
            && Objects.equals(this.accountTypeName,
                              accountBaseInfo.accountTypeName)
            && Objects.equals(this.accountType,
                              accountBaseInfo.accountType)
            && Objects.equals(this.psuRelations,
                              accountBaseInfo.psuRelations);
}

@Override
public int hashCode() {
    return Objects.hash(accountNumber,
                        accountTypeName,
                        accountType,
                        psuRelations);
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBaseInfo {\n");

    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).
            append("\n");
    sb.append("    accountTypeName: ").append(toIndentedString(accountTypeName)).
            append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append(
            "\n");
    sb.append("    psuRelations: ").append(toIndentedString(psuRelations)).
            append("\n");
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
    return o.toString().replace("\n",
                                "\n    ");
}
}
