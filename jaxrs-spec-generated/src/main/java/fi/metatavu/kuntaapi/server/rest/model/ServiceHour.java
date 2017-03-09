package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceHour   {
  
  private String type = null;
  private String exceptionHourType = null;
  private OffsetDateTime validFrom = null;
  private OffsetDateTime validTo = null;
  private List<Integer> days = new ArrayList<Integer>();
  private String opens = null;
  private String closes = null;
  private String timezone = null;
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();

  /**
   * Type of service hour (Standard, Exception or Special).
   **/
  public ServiceHour type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of service hour (Standard, Exception or Special).")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Type of service hour exception type. Valid values are: Open or Closed.
   **/
  public ServiceHour exceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of service hour exception type. Valid values are: Open or Closed.")
  public String getExceptionHourType() {
    return exceptionHourType;
  }
  public void setExceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
  }

  /**
   * Date time where from this entry is valid.
   **/
  public ServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date time where from this entry is valid.")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }
  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  /**
   * Date time to this entry is valid.
   **/
  public ServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date time to this entry is valid.")
  public OffsetDateTime getValidTo() {
    return validTo;
  }
  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  /**
   * Array of week numbers indices where serice hour is active (0 == sunday)
   **/
  public ServiceHour days(List<Integer> days) {
    this.days = days;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Array of week numbers indices where serice hour is active (0 == sunday)")
  public List<Integer> getDays() {
    return days;
  }
  public void setDays(List<Integer> days) {
    this.days = days;
  }

  /**
   * Opening time in format HH:mm for example 08:00.
   **/
  public ServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Opening time in format HH:mm for example 08:00.")
  public String getOpens() {
    return opens;
  }
  public void setOpens(String opens) {
    this.opens = opens;
  }

  /**
   * Closing time in format HH:mm for example 19:00
   **/
  public ServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Closing time in format HH:mm for example 19:00")
  public String getCloses() {
    return closes;
  }
  public void setCloses(String closes) {
    this.closes = closes;
  }

  /**
   **/
  public ServiceHour timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTimezone() {
    return timezone;
  }
  public void setTimezone(String timezone) {
    this.timezone = timezone;
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
        Objects.equals(exceptionHourType, serviceHour.exceptionHourType) &&
        Objects.equals(validFrom, serviceHour.validFrom) &&
        Objects.equals(validTo, serviceHour.validTo) &&
        Objects.equals(days, serviceHour.days) &&
        Objects.equals(opens, serviceHour.opens) &&
        Objects.equals(closes, serviceHour.closes) &&
        Objects.equals(timezone, serviceHour.timezone) &&
        Objects.equals(additionalInformation, serviceHour.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, exceptionHourType, validFrom, validTo, days, opens, closes, timezone, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHour {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exceptionHourType: ").append(toIndentedString(exceptionHourType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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
