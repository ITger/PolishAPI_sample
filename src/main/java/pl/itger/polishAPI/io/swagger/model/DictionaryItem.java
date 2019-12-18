package pl.itger.polishAPI.io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Objects;

/**
 * Klasa zawierająca dane elementu/pozycji słownika / Dictionary Item Class
 */
@ApiModel(
        description = "Klasa zawierająca dane elementu/pozycji słownika / Dictionary Item Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen",
        date = "2019-03-14T19:37:54.479+01:00")
@Document
public class DictionaryItem
        implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @JsonProperty("code")
    private String code = null;

    @JsonProperty("description")
    private String description = null;

    public DictionaryItem code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Kod pozycji słownika / Code
     *
     * @return code
     */
    @ApiModelProperty(value = "Kod pozycji słownika / Code")

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DictionaryItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Opis pozycji słownika / Description
     *
     * @return description
     */
    @ApiModelProperty(value = "Opis pozycji słownika / Description")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DictionaryItem dictionaryItem = (DictionaryItem) o;
        return Objects.equals(this.code,
                dictionaryItem.code)
                && Objects.equals(this.description,
                dictionaryItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
                description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DictionaryItem {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append(
                "\n");
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
