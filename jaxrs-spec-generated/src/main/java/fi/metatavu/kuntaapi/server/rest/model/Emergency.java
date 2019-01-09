package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.EmergencySource;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Emergency  implements java.io.Serializable {
  
  private String id = null;
  private String location = null;
  private OffsetDateTime time = null;
  private String description = null;
  private String extent = null;
  private String type = null;
  private String url = null;
  private String latitude = null;
  private String longitude = null;
  private List<EmergencySource> sources = new ArrayList<EmergencySource>();

  /**
   **/
  public Emergency id(String id) {
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
  public Emergency location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public Emergency time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getTime() {
    return time;
  }
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  /**
   **/
  public Emergency description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public Emergency extent(String extent) {
    this.extent = extent;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getExtent() {
    return extent;
  }
  public void setExtent(String extent) {
    this.extent = extent;
  }

  /**
   **/
  public Emergency type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Emergency url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Emergency latitude coordinate.
   **/
  public Emergency latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Emergency latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   * Emergency longitude coordinate.
   **/
  public Emergency longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Emergency longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  /**
   * List of emergency source
   **/
  public Emergency sources(List<EmergencySource> sources) {
    this.sources = sources;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of emergency source")
  public List<EmergencySource> getSources() {
    return sources;
  }
  public void setSources(List<EmergencySource> sources) {
    this.sources = sources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Emergency emergency = (Emergency) o;
    return Objects.equals(id, emergency.id) &&
        Objects.equals(location, emergency.location) &&
        Objects.equals(time, emergency.time) &&
        Objects.equals(description, emergency.description) &&
        Objects.equals(extent, emergency.extent) &&
        Objects.equals(type, emergency.type) &&
        Objects.equals(url, emergency.url) &&
        Objects.equals(latitude, emergency.latitude) &&
        Objects.equals(longitude, emergency.longitude) &&
        Objects.equals(sources, emergency.sources);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
