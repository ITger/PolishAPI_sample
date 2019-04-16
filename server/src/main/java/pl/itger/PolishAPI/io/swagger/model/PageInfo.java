package pl.itger.PolishAPI.io.swagger.model;

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
 * Klasa zawierająca dane pozwalajace na korzystanie z mechanizmu stronicowania / Paging Information Class
 */
@ApiModel(description = "Klasa zawierająca dane pozwalajace na korzystanie z mechanizmu stronicowania / Paging Information Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class PageInfo  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("previousPage")
  private String previousPage = null;

  @JsonProperty("nextPage")
  private String nextPage = null;

  public PageInfo previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

  /**
   * Użyte w celu stronicowania danych: Identyfikator poprzedniej strony rezultatów / Used for paging the results. Identifier of the previous page.
   * @return previousPage
  **/
  @ApiModelProperty(value = "Użyte w celu stronicowania danych: Identyfikator poprzedniej strony rezultatów / Used for paging the results. Identifier of the previous page.")


  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  public PageInfo nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * Użyte w celu stronicowania danych:  Identyfikator następnej strony rezultatów / Used for paging the results. Identifier of the next page.
   * @return nextPage
  **/
  @ApiModelProperty(value = "Użyte w celu stronicowania danych:  Identyfikator następnej strony rezultatów / Used for paging the results. Identifier of the next page.")


  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageInfo pageInfo = (PageInfo) o;
    return Objects.equals(this.previousPage, pageInfo.previousPage) &&
        Objects.equals(this.nextPage, pageInfo.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousPage, nextPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageInfo {\n");
    
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

