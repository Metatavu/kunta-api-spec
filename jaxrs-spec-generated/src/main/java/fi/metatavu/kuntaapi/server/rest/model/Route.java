package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Route   {
  
  private String id = null;
  private String agencyId = null;
  private String shortName = null;
  private String longName = null;

  /**
   **/
  public Route id(String id) {
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
  public Route agencyId(String agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAgencyId() {
    return agencyId;
  }
  public void setAgencyId(String agencyId) {
    this.agencyId = agencyId;
  }

  /**
   **/
  public Route shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  /**
   **/
  public Route longName(String longName) {
    this.longName = longName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLongName() {
    return longName;
  }
  public void setLongName(String longName) {
    this.longName = longName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Route route = (Route) o;
    return Objects.equals(id, route.id) &&
        Objects.equals(agencyId, route.agencyId) &&
        Objects.equals(shortName, route.shortName) &&
        Objects.equals(longName, route.longName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, agencyId, shortName, longName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Route {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
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
