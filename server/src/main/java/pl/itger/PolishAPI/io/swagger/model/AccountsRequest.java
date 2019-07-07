package pl.itger.PolishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zapytania o rachunki / Accounts Request Class
 */
@ApiModel(description = "Klasa zapytania o rachunki / Accounts Request Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class AccountsRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("requestHeader")
    private RequestHeaderAISCallback requestHeader = null;
    @JsonProperty("typeOfPsuRelation")
    private TypeOfPsuRelationEnum typeOfPsuRelation = null;
    @JsonProperty("pageId")
    private String pageId = null;
    @JsonProperty("perPage")
    private Integer perPage = null;

    public AccountsRequest requestHeader(RequestHeaderAISCallback requestHeader) {
        this.requestHeader = requestHeader;
        return this;
    }

    /**
     * Get requestHeader
     *
     * @return requestHeader
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public RequestHeaderAISCallback getRequestHeader() {
        return requestHeader;
    }

    public void setRequestHeader(RequestHeaderAISCallback requestHeader) {
        this.requestHeader = requestHeader;
    }

    public AccountsRequest typeOfPsuRelation(TypeOfPsuRelationEnum typeOfPsuRelation) {
        this.typeOfPsuRelation = typeOfPsuRelation;
        return this;
    }

    /**
     * Użuwane w celu filtrowania - typ relacji PSU do rachunku / Used for filtering the results - type of relation between PSU and an Account
     *
     * @return typeOfPsuRelation
     **/
    @ApiModelProperty(value = "Użuwane w celu filtrowania - typ relacji PSU do rachunku / Used for filtering the results - type of relation between PSU and an Account")


    public TypeOfPsuRelationEnum getTypeOfPsuRelation() {
        return typeOfPsuRelation;
    }

    public void setTypeOfPsuRelation(TypeOfPsuRelationEnum typeOfPsuRelation) {
        this.typeOfPsuRelation = typeOfPsuRelation;
    }

    public AccountsRequest pageId(String pageId) {
        this.pageId = pageId;
        return this;
    }

    /**
     * Używane w celu stronicowania danych: identyfikator strony, która ma zostać zwrócona w odpowiedzi / Used for paging the results. Identifier of the page to be returned in the response.
     *
     * @return pageId
     **/
    @ApiModelProperty(value = "Używane w celu stronicowania danych: identyfikator strony, która ma zostać zwrócona w odpowiedzi / Used for paging the results. Identifier of the page to be returned in the response.")


    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public AccountsRequest perPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * Używane w celu stronicowania danych: wielkość strony danych / Page size (paging info)
     * minimum: 1
     *
     * @return perPage
     **/
    @ApiModelProperty(value = "Używane w celu stronicowania danych: wielkość strony danych / Page size (paging info)")

    @Min(1)
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountsRequest accountsRequest = (AccountsRequest) o;
        return Objects.equals(this.requestHeader, accountsRequest.requestHeader) &&
                Objects.equals(this.typeOfPsuRelation, accountsRequest.typeOfPsuRelation) &&
                Objects.equals(this.pageId, accountsRequest.pageId) &&
                Objects.equals(this.perPage, accountsRequest.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestHeader, typeOfPsuRelation, pageId, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountsRequest {\n");

        sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
        sb.append("    typeOfPsuRelation: ").append(toIndentedString(typeOfPsuRelation)).append("\n");
        sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

    /**
     * Użuwane w celu filtrowania - typ relacji PSU do rachunku / Used for filtering the results - type of relation between PSU and an Account
     */
    public enum TypeOfPsuRelationEnum {
        OWNER("Owner"),

        BORROWER("Borrower"),

        GUARANTOR("Guarantor"),

        PROXYOWNER("ProxyOwner"),

        BENEFICIARY("Beneficiary"),

        TRUSTEE("Trustee");

        private String value;

        TypeOfPsuRelationEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeOfPsuRelationEnum fromValue(String text) {
            for (TypeOfPsuRelationEnum b : TypeOfPsuRelationEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

