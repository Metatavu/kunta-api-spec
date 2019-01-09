package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Coordinate;



import io.swagger.annotations.*;
import java.util.Objects;


public class Coordinates  implements java.io.Serializable {
  
  private Coordinate epsg3067 = null;
  private Coordinate epsg4326 = null;

  /**
   **/
  public Coordinates epsg3067(Coordinate epsg3067) {
    this.epsg3067 = epsg3067;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEpsg3067() {
    return epsg3067;
  }
  public void setEpsg3067(Coordinate epsg3067) {
    this.epsg3067 = epsg3067;
  }

  /**
   **/
  public Coordinates epsg4326(Coordinate epsg4326) {
    this.epsg4326 = epsg4326;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEpsg4326() {
    return epsg4326;
  }
  public void setEpsg4326(Coordinate epsg4326) {
    this.epsg4326 = epsg4326;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinates coordinates = (Coordinates) o;
    return Objects.equals(epsg3067, coordinates.epsg3067) &&
        Objects.equals(epsg4326, coordinates.epsg4326);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
