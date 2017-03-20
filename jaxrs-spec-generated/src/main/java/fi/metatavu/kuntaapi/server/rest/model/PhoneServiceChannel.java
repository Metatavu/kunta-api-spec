package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.ServiceHour;
import fi.metatavu.kuntaapi.server.rest.model.SupportContact;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class PhoneServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private String phoneType = null;
  private List<String> chargeTypes = new ArrayList<String>();
  private List<SupportContact> supportContacts = new ArrayList<SupportContact>();
  private List<LocalizedValue> phoneNumbers = new ArrayList<LocalizedValue>();
  private List<String> languages = new ArrayList<String>();
  private List<LocalizedValue> phoneChargeDescriptions = new ArrayList<LocalizedValue>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public PhoneServiceChannel id(String id) {
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
  public PhoneServiceChannel type(String type) {
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
  public PhoneServiceChannel organizationId(String organizationId) {
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
  public PhoneServiceChannel names(List<LocalizedValue> names) {
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
  public PhoneServiceChannel descriptions(List<LocalizedValue> descriptions) {
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
  public PhoneServiceChannel phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneType() {
    return phoneType;
  }
  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  /**
   **/
  public PhoneServiceChannel chargeTypes(List<String> chargeTypes) {
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
  public PhoneServiceChannel supportContacts(List<SupportContact> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<SupportContact> getSupportContacts() {
    return supportContacts;
  }
  public void setSupportContacts(List<SupportContact> supportContacts) {
    this.supportContacts = supportContacts;
  }

  /**
   **/
  public PhoneServiceChannel phoneNumbers(List<LocalizedValue> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<LocalizedValue> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   **/
  public PhoneServiceChannel languages(List<String> languages) {
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
  public PhoneServiceChannel phoneChargeDescriptions(List<LocalizedValue> phoneChargeDescriptions) {
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
  public PhoneServiceChannel webPages(List<WebPage> webPages) {
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
  public PhoneServiceChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public PhoneServiceChannel publishingStatus(String publishingStatus) {
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
    PhoneServiceChannel phoneServiceChannel = (PhoneServiceChannel) o;
    return Objects.equals(id, phoneServiceChannel.id) &&
        Objects.equals(type, phoneServiceChannel.type) &&
        Objects.equals(organizationId, phoneServiceChannel.organizationId) &&
        Objects.equals(names, phoneServiceChannel.names) &&
        Objects.equals(descriptions, phoneServiceChannel.descriptions) &&
        Objects.equals(phoneType, phoneServiceChannel.phoneType) &&
        Objects.equals(chargeTypes, phoneServiceChannel.chargeTypes) &&
        Objects.equals(supportContacts, phoneServiceChannel.supportContacts) &&
        Objects.equals(phoneNumbers, phoneServiceChannel.phoneNumbers) &&
        Objects.equals(languages, phoneServiceChannel.languages) &&
        Objects.equals(phoneChargeDescriptions, phoneServiceChannel.phoneChargeDescriptions) &&
        Objects.equals(webPages, phoneServiceChannel.webPages) &&
        Objects.equals(serviceHours, phoneServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, phoneServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, phoneType, chargeTypes, supportContacts, phoneNumbers, languages, phoneChargeDescriptions, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    chargeTypes: ").append(toIndentedString(chargeTypes)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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
