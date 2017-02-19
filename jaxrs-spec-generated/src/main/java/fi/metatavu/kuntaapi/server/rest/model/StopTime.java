package fi.metatavu.kuntaapi.server.rest.model;

import java.math.BigDecimal;



import io.swagger.annotations.*;
import java.util.Objects;


public class StopTime   {
  
  private String id = null;
  private String tripId = null;
  private String stopId = null;
  private String arrivalTime = null;
  private String departureTime = null;
  private BigDecimal sequency = null;
  private Float distanceTraveled = null;

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
  public StopTime arrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getArrivalTime() {
    return arrivalTime;
  }
  public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
  }

  /**
   **/
  public StopTime departureTime(String departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDepartureTime() {
    return departureTime;
  }
  public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
  }

  /**
   **/
  public StopTime sequency(BigDecimal sequency) {
    this.sequency = sequency;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSequency() {
    return sequency;
  }
  public void setSequency(BigDecimal sequency) {
    this.sequency = sequency;
  }

  /**
   **/
  public StopTime distanceTraveled(Float distanceTraveled) {
    this.distanceTraveled = distanceTraveled;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Float getDistanceTraveled() {
    return distanceTraveled;
  }
  public void setDistanceTraveled(Float distanceTraveled) {
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
