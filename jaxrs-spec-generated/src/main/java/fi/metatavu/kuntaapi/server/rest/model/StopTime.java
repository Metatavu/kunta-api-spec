package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class StopTime  implements java.io.Serializable {
  
  private String id = null;
  private String tripId = null;
  private String stopId = null;
  private Integer arrivalTime = null;
  private Integer departureTime = null;
  private Integer sequency = null;
  private Double distanceTraveled = null;

  /**
   **/
  public StopTime id(String id) {
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
  public StopTime tripId(String tripId) {
    this.tripId = tripId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTripId() {
    return tripId;
  }
  public void setTripId(String tripId) {
    this.tripId = tripId;
  }

  /**
   **/
  public StopTime stopId(String stopId) {
    this.stopId = stopId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getStopId() {
    return stopId;
  }
  public void setStopId(String stopId) {
    this.stopId = stopId;
  }

  /**
   **/
  public StopTime arrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getArrivalTime() {
    return arrivalTime;
  }
  public void setArrivalTime(Integer arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  /**
   **/
  public StopTime departureTime(Integer departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getDepartureTime() {
    return departureTime;
  }
  public void setDepartureTime(Integer departureTime) {
    this.departureTime = departureTime;
  }

  /**
   **/
  public StopTime sequency(Integer sequency) {
    this.sequency = sequency;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getSequency() {
    return sequency;
  }
  public void setSequency(Integer sequency) {
    this.sequency = sequency;
  }

  /**
   **/
  public StopTime distanceTraveled(Double distanceTraveled) {
    this.distanceTraveled = distanceTraveled;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Double getDistanceTraveled() {
    return distanceTraveled;
  }
  public void setDistanceTraveled(Double distanceTraveled) {
    this.distanceTraveled = distanceTraveled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopTime stopTime = (StopTime) o;
    return Objects.equals(id, stopTime.id) &&
        Objects.equals(tripId, stopTime.tripId) &&
        Objects.equals(stopId, stopTime.stopId) &&
        Objects.equals(arrivalTime, stopTime.arrivalTime) &&
        Objects.equals(departureTime, stopTime.departureTime) &&
        Objects.equals(sequency, stopTime.sequency) &&
        Objects.equals(distanceTraveled, stopTime.distanceTraveled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tripId, stopId, arrivalTime, departureTime, sequency, distanceTraveled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tripId: ").append(toIndentedString(tripId)).append("\n");
    sb.append("    stopId: ").append(toIndentedString(stopId)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    departureTime: ").append(toIndentedString(departureTime)).append("\n");
    sb.append("    sequency: ").append(toIndentedString(sequency)).append("\n");
    sb.append("    distanceTraveled: ").append(toIndentedString(distanceTraveled)).append("\n");
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
