package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceHour   {
  
  private String type = null;
  private OffsetDateTime validFrom = null;
  private OffsetDateTime validTo = null;
  private String opens = null;
  private String closes = null;
  private List<Integer> days = new ArrayList<Integer>();
  private String status = null;
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();

  /**
   **/
  public ServiceHour type(String type) {
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
  public ServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }
  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  /**
   **/
  public ServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }
  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  /**
   **/
  public ServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOpens() {
    return opens;
  }
  public void setOpens(String opens) {
    this.opens = opens;
  }

  /**
   **/
  public ServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCloses() {
    return closes;
  }
  public void setCloses(String closes) {
    this.closes = closes;
  }

  /**
   **/
  public ServiceHour days(List<Integer> days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Integer> getDays() {
    return days;
  }
  public void setDays(List<Integer> days) {
    this.days = days;
  }

  /**
   **/
  public ServiceHour status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public ServiceHour additionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHour serviceHour = (ServiceHour) o;
    return Objects.equals(type, serviceHour.type) &&
        Objects.equals(validFrom, serviceHour.validFrom) &&
        Objects.equals(validTo, serviceHour.validTo) &&
        Objects.equals(opens, serviceHour.opens) &&
        Objects.equals(closes, serviceHour.closes) &&
        Objects.equals(days, serviceHour.days) &&
        Objects.equals(status, serviceHour.status) &&
        Objects.equals(additionalInformation, serviceHour.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, validFrom, validTo, opens, closes, days, status, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHour {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
