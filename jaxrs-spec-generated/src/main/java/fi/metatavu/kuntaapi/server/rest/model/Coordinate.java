package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Coordinate   {
  
  private Double latitude = null;
  private Double longitude = null;

  /**
   * latitude coordinate.
   **/
  public Coordinate latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "latitude coordinate.")
  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  /**
   * longitude coordinate.
   **/
  public Coordinate longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "longitude coordinate.")
  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Coordinate coordinate = (Coordinate) o;
    return Objects.equals(latitude, coordinate.latitude) &&
        Objects.equals(longitude, coordinate.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinate {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
