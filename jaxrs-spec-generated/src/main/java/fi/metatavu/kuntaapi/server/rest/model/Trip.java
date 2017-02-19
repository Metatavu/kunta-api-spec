package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Trip   {
  
  private String id = null;
  private String routeId = null;
  private String scheduleId = null;
  private String headsign = null;

  /**
   **/
  public Trip id(String id) {
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
  public Trip routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getRouteId() {
    return routeId;
  }
  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  /**
   **/
  public Trip scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  /**
   **/
  public Trip headsign(String headsign) {
    this.headsign = headsign;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getHeadsign() {
    return headsign;
  }
  public void setHeadsign(String headsign) {
    this.headsign = headsign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trip trip = (Trip) o;
    return Objects.equals(id, trip.id) &&
        Objects.equals(routeId, trip.routeId) &&
        Objects.equals(scheduleId, trip.scheduleId) &&
        Objects.equals(headsign, trip.headsign);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
