package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa opisująca parametry częśtotliwości wykonywania płatności cyklicznej / A class defining parameters of the frequency of recurring paymenets
 */
@ApiModel(description = "Klasa opisująca parametry częśtotliwości wykonywania płatności cyklicznej / A class defining parameters of the frequency of recurring paymenets")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecurringTransferFrequency  implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Typ jednostki okresu czasu / The type of unit of time period
   */
  public enum PeriodTypeEnum {
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodTypeEnum fromValue(String text) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("periodType")
  private PeriodTypeEnum periodType = null;

  @JsonProperty("periodValue")
  private Integer periodValue = null;

  public RecurringTransferFrequency periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
    return this;
  }

  /**
   * Typ jednostki okresu czasu / The type of unit of time period
   * @return periodType
  **/
  @ApiModelProperty(required = true, value = "Typ jednostki okresu czasu / The type of unit of time period")
  @NotNull


  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }

  public RecurringTransferFrequency periodValue(Integer periodValue) {
    this.periodValue = periodValue;
    return this;
  }

  /**
   * Wartość jednostki okresu czasu / The value of unit of time period
   * minimum: 1
   * @return periodValue
  **/
  @ApiModelProperty(required = true, value = "Wartość jednostki okresu czasu / The value of unit of time period")
  @NotNull

@Min(1)
  public Integer getPeriodValue() {
    return periodValue;
  }

  public void setPeriodValue(Integer periodValue) {
    this.periodValue = periodValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransferFrequency recurringTransferFrequency = (RecurringTransferFrequency) o;
    return Objects.equals(this.periodType, recurringTransferFrequency.periodType) &&
        Objects.equals(this.periodValue, recurringTransferFrequency.periodValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodType, periodValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransferFrequency {\n");
    
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    periodValue: ").append(toIndentedString(periodValue)).append("\n");
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

