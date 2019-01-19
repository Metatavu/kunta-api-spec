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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Trip
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-19T09:20:34.808+02:00")
public class Trip   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("routeId")
  private String routeId = null;

  @SerializedName("scheduleId")
  private String scheduleId = null;

  @SerializedName("headsign")
  private String headsign = null;

  public Trip id(String id) {
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

  public Trip routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Get routeId
   * @return routeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public Trip scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

   /**
   * Get scheduleId
   * @return scheduleId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getScheduleId() {
    return scheduleId;
  }

  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  public Trip headsign(String headsign) {
    this.headsign = headsign;
    return this;
  }

   /**
   * Get headsign
   * @return headsign
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHeadsign() {
    return headsign;
  }

  public void setHeadsign(String headsign) {
    this.headsign = headsign;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(this.id, trip.id) &&
        Objects.equals(this.routeId, trip.routeId) &&
        Objects.equals(this.scheduleId, trip.scheduleId) &&
        Objects.equals(this.headsign, trip.headsign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, routeId, scheduleId, headsign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    headsign: ").append(toIndentedString(headsign)).append("\n");
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

