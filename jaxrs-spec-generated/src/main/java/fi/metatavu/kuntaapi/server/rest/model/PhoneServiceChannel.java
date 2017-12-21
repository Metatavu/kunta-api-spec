package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Area;
import fi.metatavu.kuntaapi.server.rest.model.Email;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Phone;
import fi.metatavu.kuntaapi.server.rest.model.ServiceHour;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class PhoneServiceChannel   {
  
  private String id = null;
  private String organizationId = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private List<Phone> phoneNumbers = new ArrayList<Phone>();
  private List<Email> supportEmails = new ArrayList<Email>();
  private List<String> languages = new ArrayList<String>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;
  private String areaType = null;
  private List<Area> areas = new ArrayList<Area>();

  /**
   * Identifier for the service channel.
   **/
  public PhoneServiceChannel id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Identifier for the service channel.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Organization identifier responsible for the channel.
   **/
  public PhoneServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization identifier responsible for the channel.")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Localized list of service channel names.
   **/
  public PhoneServiceChannel names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of service channel names.")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  /**
   * List of localized service channel descriptions.
   **/
  public PhoneServiceChannel descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service channel descriptions.")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * List of phone numbers for the service channel.
   **/
  public PhoneServiceChannel phoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of phone numbers for the service channel.")
  public List<Phone> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * List of support email addresses for the service channel.
   **/
  public PhoneServiceChannel supportEmails(List<Email> supportEmails) {
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
   * List of languages the service channel is available in (two letter language code).
   **/
  public PhoneServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   * List of service channel web pages.
   **/
  public PhoneServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service channel web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  /**
   * List of service channel service hours.
   **/
  public PhoneServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service channel service hours.")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }
  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   **/
  public PhoneServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   **/
  public PhoneServiceChannel areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).")
  public String getAreaType() {
    return areaType;
  }
  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  /**
   * List of organization areas.
   **/
  public PhoneServiceChannel areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organization areas.")
  public List<Area> getAreas() {
    return areas;
  }
  public void setAreas(List<Area> areas) {
    this.areas = areas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneServiceChannel phoneServiceChannel = (PhoneServiceChannel) o;
    return Objects.equals(id, phoneServiceChannel.id) &&
        Objects.equals(organizationId, phoneServiceChannel.organizationId) &&
        Objects.equals(names, phoneServiceChannel.names) &&
        Objects.equals(descriptions, phoneServiceChannel.descriptions) &&
        Objects.equals(phoneNumbers, phoneServiceChannel.phoneNumbers) &&
        Objects.equals(supportEmails, phoneServiceChannel.supportEmails) &&
        Objects.equals(languages, phoneServiceChannel.languages) &&
        Objects.equals(webPages, phoneServiceChannel.webPages) &&
        Objects.equals(serviceHours, phoneServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, phoneServiceChannel.publishingStatus) &&
        Objects.equals(areaType, phoneServiceChannel.areaType) &&
        Objects.equals(areas, phoneServiceChannel.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, names, descriptions, phoneNumbers, supportEmails, languages, webPages, serviceHours, publishingStatus, areaType, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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
