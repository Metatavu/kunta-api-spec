/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.kuntaapi.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import fi.metatavu.kuntaapi.client.model.ScheduleException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * Schedule
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T06:52:51.644+02:00")
public class Schedule   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("days")
  private List<Integer> days = new ArrayList<Integer>();

  @SerializedName("exceptions")
  private List<ScheduleException> exceptions = new ArrayList<ScheduleException>();

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  public Schedule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Schedule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Schedule days(List<Integer> days) {
    this.days = days;
    return this;
  }

  public Schedule addDaysItem(Integer daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getDays() {
    return days;
  }

  public void setDays(List<Integer> days) {
    this.days = days;
  }

  public Schedule exceptions(List<ScheduleException> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public Schedule addExceptionsItem(ScheduleException exceptionsItem) {
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ScheduleException> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<ScheduleException> exceptions) {
    this.exceptions = exceptions;
  }

  public Schedule startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Schedule endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.id, schedule.id) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.days, schedule.days) &&
        Objects.equals(this.exceptions, schedule.exceptions) &&
        Objects.equals(this.startDate, schedule.startDate) &&
        Objects.equals(this.endDate, schedule.endDate);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

