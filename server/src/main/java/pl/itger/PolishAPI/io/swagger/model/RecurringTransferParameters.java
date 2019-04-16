package pl.itger.PolishAPI.io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import pl.itger.PolishAPI.io.swagger.model.RecurringTransferFrequency;
import java.time.LocalDate;
import java.io.Serializable;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Klasa definiująca parametry płatności cyklicznej / A class defining recurring payment parameters
 */
@ApiModel(description = "Klasa definiująca parametry płatności cyklicznej / A class defining recurring payment parameters")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-14T19:37:54.479+01:00")

public class RecurringTransferParameters  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("startDate")
  private LocalDate startDate = null;

  @JsonProperty("frequency")
  private RecurringTransferFrequency frequency = null;

  @JsonProperty("endDate")
  private LocalDate endDate = null;

  /**
   * Rodzaj przesunięcia, który należy zastosować do wykonania przelewu w przypadku, gdy dzień wolny jest planowaną datą przelewu / Type of offset that should be used for transfer execution in case of day off being the planned date of transfer
   */
  public enum DayOffOffsetTypeEnum {
    BEFORE("before"),
    
    AFTER("after");

    private String value;

    DayOffOffsetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DayOffOffsetTypeEnum fromValue(String text) {
      for (DayOffOffsetTypeEnum b : DayOffOffsetTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dayOffOffsetType")
  private DayOffOffsetTypeEnum dayOffOffsetType = null;

  public RecurringTransferParameters startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Data wykonania pierwszej płatności w definiowanym cyklu. Format: YYYY-MM-DD / First payment execution date (of the defined cycle).
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Data wykonania pierwszej płatności w definiowanym cyklu. Format: YYYY-MM-DD / First payment execution date (of the defined cycle).")
  @NotNull

  @Valid

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public RecurringTransferParameters frequency(RecurringTransferFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Get frequency
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public RecurringTransferFrequency getFrequency() {
    return frequency;
  }

  public void setFrequency(RecurringTransferFrequency frequency) {
    this.frequency = frequency;
  }

  public RecurringTransferParameters endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Ostatnia możliwa data wykonania płatności w definiowanym cyklu. Format: YYYY-MM-DD / The last possible payment execution date (of the defined cycle).
   * @return endDate
  **/
  @ApiModelProperty(value = "Ostatnia możliwa data wykonania płatności w definiowanym cyklu. Format: YYYY-MM-DD / The last possible payment execution date (of the defined cycle).")

  @Valid

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public RecurringTransferParameters dayOffOffsetType(DayOffOffsetTypeEnum dayOffOffsetType) {
    this.dayOffOffsetType = dayOffOffsetType;
    return this;
  }

  /**
   * Rodzaj przesunięcia, który należy zastosować do wykonania przelewu w przypadku, gdy dzień wolny jest planowaną datą przelewu / Type of offset that should be used for transfer execution in case of day off being the planned date of transfer
   * @return dayOffOffsetType
  **/
  @ApiModelProperty(required = true, value = "Rodzaj przesunięcia, który należy zastosować do wykonania przelewu w przypadku, gdy dzień wolny jest planowaną datą przelewu / Type of offset that should be used for transfer execution in case of day off being the planned date of transfer")
  @NotNull


  public DayOffOffsetTypeEnum getDayOffOffsetType() {
    return dayOffOffsetType;
  }

  public void setDayOffOffsetType(DayOffOffsetTypeEnum dayOffOffsetType) {
    this.dayOffOffsetType = dayOffOffsetType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransferParameters recurringTransferParameters = (RecurringTransferParameters) o;
    return Objects.equals(this.startDate, recurringTransferParameters.startDate) &&
        Objects.equals(this.frequency, recurringTransferParameters.frequency) &&
        Objects.equals(this.endDate, recurringTransferParameters.endDate) &&
        Objects.equals(this.dayOffOffsetType, recurringTransferParameters.dayOffOffsetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, frequency, endDate, dayOffOffsetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransferParameters {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    dayOffOffsetType: ").append(toIndentedString(dayOffOffsetType)).append("\n");
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

