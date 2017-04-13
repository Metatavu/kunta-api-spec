package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Address;
import fi.metatavu.kuntaapi.server.rest.model.Email;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Phone;
import fi.metatavu.kuntaapi.server.rest.model.ServiceHour;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceLocationServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private Boolean serviceAreaRestricted = null;
  private List<Phone> supportPhones = new ArrayList<Phone>();
  private List<Email> supportEmails = new ArrayList<Email>();
  private String email = null;
  private String phone = null;
  private List<String> languages = new ArrayList<String>();
  private String fax = null;
  private String latitude = null;
  private String longitude = null;
  private String coordinateSystem = null;
  private Boolean coordinatesSetManually = null;
  private Boolean phoneServiceCharge = null;
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<String> serviceAreas = new ArrayList<String>();
  private List<LocalizedValue> phoneChargeDescriptions = new ArrayList<LocalizedValue>();
  private List<Address> addresses = new ArrayList<Address>();
  private List<String> chargeTypes = new ArrayList<String>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public ServiceLocationServiceChannel id(String id) {
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
  public ServiceLocationServiceChannel type(String type) {
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
  public ServiceLocationServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public ServiceLocationServiceChannel names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  /**
   **/
  public ServiceLocationServiceChannel descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   **/
  public ServiceLocationServiceChannel serviceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getServiceAreaRestricted() {
    return serviceAreaRestricted;
  }
  public void setServiceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
  }

  /**
   * List of support phone numbers for the service channel.
   **/
  public ServiceLocationServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of support phone numbers for the service channel.")
  public List<Phone> getSupportPhones() {
    return supportPhones;
  }
  public void setSupportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  /**
   * List of support email addresses for the service channel.
   **/
  public ServiceLocationServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of support email addresses for the service channel.")
  public List<Email> getSupportEmails() {
    return supportEmails;
  }
  public void setSupportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
  }

  /**
   **/
  public ServiceLocationServiceChannel email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public ServiceLocationServiceChannel phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  public ServiceLocationServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   **/
  public ServiceLocationServiceChannel fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public ServiceLocationServiceChannel latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  public ServiceLocationServiceChannel longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  public ServiceLocationServiceChannel coordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCoordinateSystem() {
    return coordinateSystem;
  }
  public void setCoordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }

  /**
   **/
  public ServiceLocationServiceChannel coordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCoordinatesSetManually() {
    return coordinatesSetManually;
  }
  public void setCoordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
  }

  /**
   **/
  public ServiceLocationServiceChannel phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }
  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  /**
   **/
  public ServiceLocationServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  /**
   **/
  public ServiceLocationServiceChannel serviceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceAreas() {
    return serviceAreas;
  }
  public void setServiceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  /**
   **/
  public ServiceLocationServiceChannel phoneChargeDescriptions(List<LocalizedValue> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }
  public void setPhoneChargeDescriptions(List<LocalizedValue> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  /**
   **/
  public ServiceLocationServiceChannel addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  public ServiceLocationServiceChannel chargeTypes(List<String> chargeTypes) {
    this.chargeTypes = chargeTypes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getChargeTypes() {
    return chargeTypes;
  }
  public void setChargeTypes(List<String> chargeTypes) {
    this.chargeTypes = chargeTypes;
  }

  /**
   **/
  public ServiceLocationServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }
  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  /**
   **/
  public ServiceLocationServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLocationServiceChannel serviceLocationServiceChannel = (ServiceLocationServiceChannel) o;
    return Objects.equals(id, serviceLocationServiceChannel.id) &&
        Objects.equals(type, serviceLocationServiceChannel.type) &&
        Objects.equals(organizationId, serviceLocationServiceChannel.organizationId) &&
        Objects.equals(names, serviceLocationServiceChannel.names) &&
        Objects.equals(descriptions, serviceLocationServiceChannel.descriptions) &&
        Objects.equals(serviceAreaRestricted, serviceLocationServiceChannel.serviceAreaRestricted) &&
        Objects.equals(supportPhones, serviceLocationServiceChannel.supportPhones) &&
        Objects.equals(supportEmails, serviceLocationServiceChannel.supportEmails) &&
        Objects.equals(email, serviceLocationServiceChannel.email) &&
        Objects.equals(phone, serviceLocationServiceChannel.phone) &&
        Objects.equals(languages, serviceLocationServiceChannel.languages) &&
        Objects.equals(fax, serviceLocationServiceChannel.fax) &&
        Objects.equals(latitude, serviceLocationServiceChannel.latitude) &&
        Objects.equals(longitude, serviceLocationServiceChannel.longitude) &&
        Objects.equals(coordinateSystem, serviceLocationServiceChannel.coordinateSystem) &&
        Objects.equals(coordinatesSetManually, serviceLocationServiceChannel.coordinatesSetManually) &&
        Objects.equals(phoneServiceCharge, serviceLocationServiceChannel.phoneServiceCharge) &&
        Objects.equals(webPages, serviceLocationServiceChannel.webPages) &&
        Objects.equals(serviceAreas, serviceLocationServiceChannel.serviceAreas) &&
        Objects.equals(phoneChargeDescriptions, serviceLocationServiceChannel.phoneChargeDescriptions) &&
        Objects.equals(addresses, serviceLocationServiceChannel.addresses) &&
        Objects.equals(chargeTypes, serviceLocationServiceChannel.chargeTypes) &&
        Objects.equals(serviceHours, serviceLocationServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, serviceLocationServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, serviceAreaRestricted, supportPhones, supportEmails, email, phone, languages, fax, latitude, longitude, coordinateSystem, coordinatesSetManually, phoneServiceCharge, webPages, serviceAreas, phoneChargeDescriptions, addresses, chargeTypes, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLocationServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    serviceAreaRestricted: ").append(toIndentedString(serviceAreaRestricted)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateSystem: ").append(toIndentedString(coordinateSystem)).append("\n");
    sb.append("    coordinatesSetManually: ").append(toIndentedString(coordinatesSetManually)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    chargeTypes: ").append(toIndentedString(chargeTypes)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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
