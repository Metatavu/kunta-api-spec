package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Address;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.ServiceChannelAttachment;
import fi.metatavu.kuntaapi.server.rest.model.ServiceHour;
import fi.metatavu.kuntaapi.server.rest.model.SupportContact;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class PrintableFormServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private String formIdentifier = null;
  private String formReceiver = null;
  private List<SupportContact> supportContacts = new ArrayList<SupportContact>();
  private Address deliveryAddress = null;
  private List<LocalizedValue> channelUrls = new ArrayList<LocalizedValue>();
  private List<String> languages = new ArrayList<String>();
  private List<LocalizedValue> deliveryAddressDescriptions = new ArrayList<LocalizedValue>();
  private List<ServiceChannelAttachment> attachments = new ArrayList<ServiceChannelAttachment>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public PrintableFormServiceChannel id(String id) {
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
  public PrintableFormServiceChannel type(String type) {
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
  public PrintableFormServiceChannel organizationId(String organizationId) {
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
  public PrintableFormServiceChannel names(List<LocalizedValue> names) {
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
  public PrintableFormServiceChannel descriptions(List<LocalizedValue> descriptions) {
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
  public PrintableFormServiceChannel formIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFormIdentifier() {
    return formIdentifier;
  }
  public void setFormIdentifier(String formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  /**
   **/
  public PrintableFormServiceChannel formReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFormReceiver() {
    return formReceiver;
  }
  public void setFormReceiver(String formReceiver) {
    this.formReceiver = formReceiver;
  }

  /**
   **/
  public PrintableFormServiceChannel supportContacts(List<SupportContact> supportContacts) {
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
  public PrintableFormServiceChannel deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   **/
  public PrintableFormServiceChannel channelUrls(List<LocalizedValue> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getChannelUrls() {
    return channelUrls;
  }
  public void setChannelUrls(List<LocalizedValue> channelUrls) {
    this.channelUrls = channelUrls;
  }

  /**
   **/
  public PrintableFormServiceChannel languages(List<String> languages) {
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
  public PrintableFormServiceChannel deliveryAddressDescriptions(List<LocalizedValue> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getDeliveryAddressDescriptions() {
    return deliveryAddressDescriptions;
  }
  public void setDeliveryAddressDescriptions(List<LocalizedValue> deliveryAddressDescriptions) {
    this.deliveryAddressDescriptions = deliveryAddressDescriptions;
  }

  /**
   **/
  public PrintableFormServiceChannel attachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceChannelAttachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
  }

  /**
   **/
  public PrintableFormServiceChannel webPages(List<WebPage> webPages) {
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
  public PrintableFormServiceChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public PrintableFormServiceChannel publishingStatus(String publishingStatus) {
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
    PrintableFormServiceChannel printableFormServiceChannel = (PrintableFormServiceChannel) o;
    return Objects.equals(id, printableFormServiceChannel.id) &&
        Objects.equals(type, printableFormServiceChannel.type) &&
        Objects.equals(organizationId, printableFormServiceChannel.organizationId) &&
        Objects.equals(names, printableFormServiceChannel.names) &&
        Objects.equals(descriptions, printableFormServiceChannel.descriptions) &&
        Objects.equals(formIdentifier, printableFormServiceChannel.formIdentifier) &&
        Objects.equals(formReceiver, printableFormServiceChannel.formReceiver) &&
        Objects.equals(supportContacts, printableFormServiceChannel.supportContacts) &&
        Objects.equals(deliveryAddress, printableFormServiceChannel.deliveryAddress) &&
        Objects.equals(channelUrls, printableFormServiceChannel.channelUrls) &&
        Objects.equals(languages, printableFormServiceChannel.languages) &&
        Objects.equals(deliveryAddressDescriptions, printableFormServiceChannel.deliveryAddressDescriptions) &&
        Objects.equals(attachments, printableFormServiceChannel.attachments) &&
        Objects.equals(webPages, printableFormServiceChannel.webPages) &&
        Objects.equals(serviceHours, printableFormServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, printableFormServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, formIdentifier, formReceiver, supportContacts, deliveryAddress, channelUrls, languages, deliveryAddressDescriptions, attachments, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintableFormServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    deliveryAddressDescriptions: ").append(toIndentedString(deliveryAddressDescriptions)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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
