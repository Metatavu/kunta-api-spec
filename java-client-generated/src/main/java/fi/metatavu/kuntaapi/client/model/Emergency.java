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
import fi.metatavu.kuntaapi.client.model.EmergencySource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * Emergency
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T18:08:24.691+03:00")
public class Emergency   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("time")
  private OffsetDateTime time = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("extent")
  private String extent = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("latitude")
  private String latitude = null;

  @SerializedName("longitude")
  private String longitude = null;

  @SerializedName("sources")
  private List<EmergencySource> sources = new ArrayList<EmergencySource>();

  public Emergency id(String id) {
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

  public Emergency location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Emergency time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Emergency description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Emergency extent(String extent) {
    this.extent = extent;
    return this;
  }

   /**
   * Get extent
   * @return extent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExtent() {
    return extent;
  }

  public void setExtent(String extent) {
    this.extent = extent;
  }

  public Emergency type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Emergency url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Emergency latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Emergency latitude coordinate.
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "Emergency latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public Emergency longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Emergency longitude coordinate.
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "Emergency longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  public Emergency sources(List<EmergencySource> sources) {
    this.sources = sources;
    return this;
  }

  public Emergency addSourcesItem(EmergencySource sourcesItem) {
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * List of emergency source
   * @return sources
  **/
  @ApiModelProperty(example = "null", value = "List of emergency source")
  public List<EmergencySource> getSources() {
    return sources;
  }

  public void setSources(List<EmergencySource> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emergency emergency = (Emergency) o;
    return Objects.equals(this.id, emergency.id) &&
        Objects.equals(this.location, emergency.location) &&
        Objects.equals(this.time, emergency.time) &&
        Objects.equals(this.description, emergency.description) &&
        Objects.equals(this.extent, emergency.extent) &&
        Objects.equals(this.type, emergency.type) &&
        Objects.equals(this.url, emergency.url) &&
        Objects.equals(this.latitude, emergency.latitude) &&
        Objects.equals(this.longitude, emergency.longitude) &&
        Objects.equals(this.sources, emergency.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, location, time, description, extent, type, url, latitude, longitude, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Emergency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extent: ").append(toIndentedString(extent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

