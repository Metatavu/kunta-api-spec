package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Coordinate;



import io.swagger.annotations.*;
import java.util.Objects;


public class Coordinates   {
  
  private Coordinate ePSG3067 = null;
  private Coordinate ePSG4326 = null;

  /**
   **/
  public Coordinates ePSG3067(Coordinate ePSG3067) {
    this.ePSG3067 = ePSG3067;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEPSG3067() {
    return ePSG3067;
  }
  public void setEPSG3067(Coordinate ePSG3067) {
    this.ePSG3067 = ePSG3067;
  }

  /**
   **/
  public Coordinates ePSG4326(Coordinate ePSG4326) {
    this.ePSG4326 = ePSG4326;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Coordinate getEPSG4326() {
    return ePSG4326;
  }
  public void setEPSG4326(Coordinate ePSG4326) {
    this.ePSG4326 = ePSG4326;
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
    return Objects.equals(ePSG3067, coordinates.ePSG3067) &&
        Objects.equals(ePSG4326, coordinates.ePSG4326);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ePSG3067, ePSG4326);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Coordinates {\n");
    
    sb.append("    ePSG3067: ").append(toIndentedString(ePSG3067)).append("\n");
    sb.append("    ePSG4326: ").append(toIndentedString(ePSG4326)).append("\n");
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
