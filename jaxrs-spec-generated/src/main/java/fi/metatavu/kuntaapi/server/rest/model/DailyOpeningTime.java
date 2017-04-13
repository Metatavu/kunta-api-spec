package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class DailyOpeningTime   {
  
  private Integer dayFrom = null;
  private Integer dayTo = null;
  private String from = null;
  private String to = null;
  private Boolean isExtra = null;

  /**
   * Day index (0 == Sunday)
   **/
  public DailyOpeningTime dayFrom(Integer dayFrom) {
    this.dayFrom = dayFrom;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Day index (0 == Sunday)")
  public Integer getDayFrom() {
    return dayFrom;
  }
  public void setDayFrom(Integer dayFrom) {
    this.dayFrom = dayFrom;
  }

  /**
   * Day index (0 == Sunday)
   **/
  public DailyOpeningTime dayTo(Integer dayTo) {
    this.dayTo = dayTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Day index (0 == Sunday)")
  public Integer getDayTo() {
    return dayTo;
  }
  public void setDayTo(Integer dayTo) {
    this.dayTo = dayTo;
  }

  /**
   * Start time for example 10:00:00
   **/
  public DailyOpeningTime from(String from) {
    this.from = from;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Start time for example 10:00:00")
  public String getFrom() {
    return from;
  }
  public void setFrom(String from) {
    this.from = from;
  }

  /**
   * End time for example 20:00:00
   **/
  public DailyOpeningTime to(String to) {
    this.to = to;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "End time for example 20:00:00")
  public String getTo() {
    return to;
  }
  public void setTo(String to) {
    this.to = to;
  }

  /**
   * Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.
   **/
  public DailyOpeningTime isExtra(Boolean isExtra) {
    this.isExtra = isExtra;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.")
  public Boolean getIsExtra() {
    return isExtra;
  }
  public void setIsExtra(Boolean isExtra) {
    this.isExtra = isExtra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyOpeningTime dailyOpeningTime = (DailyOpeningTime) o;
    return Objects.equals(dayFrom, dailyOpeningTime.dayFrom) &&
        Objects.equals(dayTo, dailyOpeningTime.dayTo) &&
        Objects.equals(from, dailyOpeningTime.from) &&
        Objects.equals(to, dailyOpeningTime.to) &&
        Objects.equals(isExtra, dailyOpeningTime.isExtra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayFrom, dayTo, from, to, isExtra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyOpeningTime {\n");
    
    sb.append("    dayFrom: ").append(toIndentedString(dayFrom)).append("\n");
    sb.append("    dayTo: ").append(toIndentedString(dayTo)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    isExtra: ").append(toIndentedString(isExtra)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
