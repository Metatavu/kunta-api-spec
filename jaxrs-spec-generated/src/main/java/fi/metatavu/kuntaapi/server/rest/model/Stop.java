package fi.metatavu.kuntaapi.server.rest.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import java.util.Objects;


public class Stop   {
  
  private String id = null;
  private String name = null;
  private BigDecimal lat = null;
  private BigDecimal lng = null;

  /**
   **/
  public Stop id(String id) {
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
  public Stop name(String name) {
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
  public Stop lat(BigDecimal lat) {
    this.lat = lat;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getLat() {
    return lat;
  }
  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  /**
   **/
  public Stop lng(BigDecimal lng) {
    this.lng = lng;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getLng() {
    return lng;
  }
  public void setLng(BigDecimal lng) {
    this.lng = lng;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stop stop = (Stop) o;
    return Objects.equals(id, stop.id) &&
        Objects.equals(name, stop.name) &&
        Objects.equals(lat, stop.lat) &&
        Objects.equals(lng, stop.lng);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lat, lng);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stop {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
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
