package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.DailyOpeningTime;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceHour  implements java.io.Serializable {
  
  private String serviceHourType = null;
  private OffsetDateTime validFrom = null;
  private OffsetDateTime validTo = null;
  private Boolean isClosed = null;
  private Boolean validForNow = null;
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();
  private List<DailyOpeningTime> openingHour = new ArrayList<DailyOpeningTime>();

  /**
   **/
  public ServiceHour serviceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceHourType() {
    return serviceHourType;
  }
  public void setServiceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
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
   * Set to true to present a time between the valid from and to times as closed.
   **/
  public ServiceHour isClosed(Boolean isClosed) {
    this.isClosed = isClosed;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Set to true to present a time between the valid from and to times as closed.")
  public Boolean getIsClosed() {
    return isClosed;
  }
  public void setIsClosed(Boolean isClosed) {
    this.isClosed = isClosed;
  }

  /**
   * Set to true to present that this entry is valid for now.
   **/
  public ServiceHour validForNow(Boolean validForNow) {
    this.validForNow = validForNow;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Set to true to present that this entry is valid for now.")
  public Boolean getValidForNow() {
    return validForNow;
  }
  public void setValidForNow(Boolean validForNow) {
    this.validForNow = validForNow;
  }

  /**
   * Localized list of additional information.
   **/
  public ServiceHour additionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of additional information.")
  public List<LocalizedValue> getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   * List of servicing hours (open and closes times).
   **/
  public ServiceHour openingHour(List<DailyOpeningTime> openingHour) {
    this.openingHour = openingHour;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of servicing hours (open and closes times).")
  public List<DailyOpeningTime> getOpeningHour() {
    return openingHour;
  }
  public void setOpeningHour(List<DailyOpeningTime> openingHour) {
    this.openingHour = openingHour;
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
    return Objects.equals(serviceHourType, serviceHour.serviceHourType) &&
        Objects.equals(validFrom, serviceHour.validFrom) &&
        Objects.equals(validTo, serviceHour.validTo) &&
        Objects.equals(isClosed, serviceHour.isClosed) &&
        Objects.equals(validForNow, serviceHour.validForNow) &&
        Objects.equals(additionalInformation, serviceHour.additionalInformation) &&
        Objects.equals(openingHour, serviceHour.openingHour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceHourType, validFrom, validTo, isClosed, validForNow, additionalInformation, openingHour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHour {\n");
    
    sb.append("    serviceHourType: ").append(toIndentedString(serviceHourType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
    sb.append("    validForNow: ").append(toIndentedString(validForNow)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    openingHour: ").append(toIndentedString(openingHour)).append("\n");
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
