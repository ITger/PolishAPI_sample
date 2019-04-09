package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HoldInfo;
import io.swagger.model.PageInfo;
import io.swagger.model.ResponseHeader;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa odpowiedzi zawierająca listę blokad na rachunku / Hold Information Response Class
 */
@ApiModel(description = "Klasa odpowiedzi zawierająca listę blokad na rachunku / Hold Information Response Class")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class HoldInfoResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("responseHeader")
  private ResponseHeader responseHeader = null;

  @JsonProperty("holds")
  @Valid
  private List<HoldInfo> holds = null;

  @JsonProperty("pageInfo")
  private PageInfo pageInfo = null;

  public HoldInfoResponse responseHeader(ResponseHeader responseHeader) {
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

  public HoldInfoResponse holds(List<HoldInfo> holds) {
    this.holds = holds;
    return this;
  }

  public HoldInfoResponse addHoldsItem(HoldInfo holdsItem) {
    if (this.holds == null) {
      this.holds = new ArrayList<>();
    }
    this.holds.add(holdsItem);
    return this;
  }

  /**
   * Get holds
   * @return holds
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<HoldInfo> getHolds() {
    return holds;
  }

  public void setHolds(List<HoldInfo> holds) {
    this.holds = holds;
  }

  public HoldInfoResponse pageInfo(PageInfo pageInfo) {
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
    HoldInfoResponse holdInfoResponse = (HoldInfoResponse) o;
    return Objects.equals(this.responseHeader, holdInfoResponse.responseHeader) &&
        Objects.equals(this.holds, holdInfoResponse.holds) &&
        Objects.equals(this.pageInfo, holdInfoResponse.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHeader, holds, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldInfoResponse {\n");
    
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    holds: ").append(toIndentedString(holds)).append("\n");
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

