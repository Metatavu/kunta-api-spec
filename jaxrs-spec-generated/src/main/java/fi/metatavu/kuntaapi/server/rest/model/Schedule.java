package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.ScheduleException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Schedule  implements java.io.Serializable {
  
  private String id = null;
  private String name = null;
  private List<Integer> days = new ArrayList<Integer>();
  private List<ScheduleException> exceptions = new ArrayList<ScheduleException>();
  private OffsetDateTime startDate = null;
  private OffsetDateTime endDate = null;

  /**
   **/
  public Schedule id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Schedule name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Schedule days(List<Integer> days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getDays() {
    return days;
  }
  public void setDays(List<Integer> days) {
    this.days = days;
  }

  /**
   **/
  public Schedule exceptions(List<ScheduleException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ScheduleException> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<ScheduleException> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   **/
  public Schedule startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   **/
  public Schedule endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(id, schedule.id) &&
        Objects.equals(name, schedule.name) &&
        Objects.equals(days, schedule.days) &&
        Objects.equals(exceptions, schedule.exceptions) &&
        Objects.equals(startDate, schedule.startDate) &&
        Objects.equals(endDate, schedule.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, days, exceptions, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
