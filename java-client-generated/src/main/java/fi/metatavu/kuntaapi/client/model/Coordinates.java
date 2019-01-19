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
import fi.metatavu.kuntaapi.client.model.Coordinate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Coordinates
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-19T09:20:34.808+02:00")
public class Coordinates   {
  @SerializedName("epsg3067")
  private Coordinate epsg3067 = null;

  @SerializedName("epsg4326")
  private Coordinate epsg4326 = null;

  public Coordinates epsg3067(Coordinate epsg3067) {
    this.epsg3067 = epsg3067;
    return this;
  }

   /**
   * Get epsg3067
   * @return epsg3067
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEpsg3067() {
    return epsg3067;
  }

  public void setEpsg3067(Coordinate epsg3067) {
    this.epsg3067 = epsg3067;
  }

  public Coordinates epsg4326(Coordinate epsg4326) {
    this.epsg4326 = epsg4326;
    return this;
  }

   /**
   * Get epsg4326
   * @return epsg4326
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEpsg4326() {
    return epsg4326;
  }

  public void setEpsg4326(Coordinate epsg4326) {
    this.epsg4326 = epsg4326;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(this.epsg3067, coordinates.epsg3067) &&
        Objects.equals(this.epsg4326, coordinates.epsg4326);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epsg3067, epsg4326);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    
    sb.append("    epsg3067: ").append(toIndentedString(epsg3067)).append("\n");
    sb.append("    epsg4326: ").append(toIndentedString(epsg4326)).append("\n");
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

