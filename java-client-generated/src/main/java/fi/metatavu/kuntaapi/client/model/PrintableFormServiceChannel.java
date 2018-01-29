/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.kuntaapi.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import fi.metatavu.kuntaapi.client.model.Address;
import fi.metatavu.kuntaapi.client.model.Area;
import fi.metatavu.kuntaapi.client.model.Email;
import fi.metatavu.kuntaapi.client.model.LocalizedValue;
import fi.metatavu.kuntaapi.client.model.Phone;
import fi.metatavu.kuntaapi.client.model.ServiceChannelAttachment;
import fi.metatavu.kuntaapi.client.model.ServiceHour;
import fi.metatavu.kuntaapi.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * PrintableFormServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:29:05.481+02:00")
public class PrintableFormServiceChannel   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  @SerializedName("descriptions")
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();

  @SerializedName("formIdentifier")
  private List<LocalizedValue> formIdentifier = new ArrayList<LocalizedValue>();

  @SerializedName("formReceiver")
  private List<LocalizedValue> formReceiver = new ArrayList<LocalizedValue>();

  @SerializedName("deliveryAddress")
  private Address deliveryAddress = null;

  @SerializedName("channelUrls")
  private List<LocalizedValue> channelUrls = new ArrayList<LocalizedValue>();

  @SerializedName("attachments")
  private List<ServiceChannelAttachment> attachments = new ArrayList<ServiceChannelAttachment>();

  @SerializedName("supportPhones")
  private List<Phone> supportPhones = new ArrayList<Phone>();

  @SerializedName("supportEmails")
  private List<Email> supportEmails = new ArrayList<Email>();

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @SerializedName("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @SerializedName("publishingStatus")
  private String publishingStatus = null;

  @SerializedName("areaType")
  private String areaType = null;

  @SerializedName("areas")
  private List<Area> areas = new ArrayList<Area>();

  public PrintableFormServiceChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier for the service channel.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Identifier for the service channel.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PrintableFormServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization identifier responsible for the channel.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "Organization identifier responsible for the channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public PrintableFormServiceChannel names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public PrintableFormServiceChannel addNamesItem(LocalizedValue namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Localized list of service channel names.
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "Localized list of service channel names.")
  public List<LocalizedValue> getNames() {
    return names;
  }

  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  public PrintableFormServiceChannel descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PrintableFormServiceChannel addDescriptionsItem(LocalizedValue descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions.
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized service channel descriptions.")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  public PrintableFormServiceChannel formIdentifier(List<LocalizedValue> formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  public PrintableFormServiceChannel addFormIdentifierItem(LocalizedValue formIdentifierItem) {
    this.formIdentifier.add(formIdentifierItem);
    return this;
  }

   /**
   * List of localized form identifier. One per language.
   * @return formIdentifier
  **/
  @ApiModelProperty(example = "null", value = "List of localized form identifier. One per language.")
  public List<LocalizedValue> getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(List<LocalizedValue> formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public PrintableFormServiceChannel formReceiver(List<LocalizedValue> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  public PrintableFormServiceChannel addFormReceiverItem(LocalizedValue formReceiverItem) {
    this.formReceiver.add(formReceiverItem);
    return this;
  }

   /**
   * List of localized form receiver. One per language.
   * @return formReceiver
  **/
  @ApiModelProperty(example = "null", value = "List of localized form receiver. One per language.")
  public List<LocalizedValue> getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(List<LocalizedValue> formReceiver) {
    this.formReceiver = formReceiver;
  }

  public PrintableFormServiceChannel deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Form delivery address.
   * @return deliveryAddress
  **/
  @ApiModelProperty(example = "null", value = "Form delivery address.")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public PrintableFormServiceChannel channelUrls(List<LocalizedValue> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public PrintableFormServiceChannel addChannelUrlsItem(LocalizedValue channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * List of localized channel urls.
   * @return channelUrls
  **/
  @ApiModelProperty(example = "null", value = "List of localized channel urls.")
  public List<LocalizedValue> getChannelUrls() {
    return channelUrls;
  }

  public void setChannelUrls(List<LocalizedValue> channelUrls) {
    this.channelUrls = channelUrls;
  }

  public PrintableFormServiceChannel attachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public PrintableFormServiceChannel addAttachmentsItem(ServiceChannelAttachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of attachments.
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "List of attachments.")
  public List<ServiceChannelAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
  }

  public PrintableFormServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public PrintableFormServiceChannel addSupportPhonesItem(Phone supportPhonesItem) {
    this.supportPhones.add(supportPhonesItem);
    return this;
  }

   /**
   * List of support phone numbers for the service channel.
   * @return supportPhones
  **/
  @ApiModelProperty(example = "null", value = "List of support phone numbers for the service channel.")
  public List<Phone> getSupportPhones() {
    return supportPhones;
  }

  public void setSupportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  public PrintableFormServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public PrintableFormServiceChannel addSupportEmailsItem(Email supportEmailsItem) {
    this.supportEmails.add(supportEmailsItem);
    return this;
  }

   /**
   * List of support email addresses for the service channel.
   * @return supportEmails
  **/
  @ApiModelProperty(example = "null", value = "List of support email addresses for the service channel.")
  public List<Email> getSupportEmails() {
    return supportEmails;
  }

  public void setSupportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
  }

  public PrintableFormServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public PrintableFormServiceChannel addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of languages the service channel is available in (two letter language code).
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public PrintableFormServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public PrintableFormServiceChannel addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of service channel web pages.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of service channel web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public PrintableFormServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public PrintableFormServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of service channel service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "List of service channel service hours.")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public PrintableFormServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public PrintableFormServiceChannel areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @return areaType
  **/
  @ApiModelProperty(example = "null", value = "Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public PrintableFormServiceChannel areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  public PrintableFormServiceChannel addAreasItem(Area areasItem) {
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of service channel areas.
   * @return areas
  **/
  @ApiModelProperty(example = "null", value = "List of service channel areas.")
  public List<Area> getAreas() {
    return areas;
  }

  public void setAreas(List<Area> areas) {
    this.areas = areas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintableFormServiceChannel printableFormServiceChannel = (PrintableFormServiceChannel) o;
    return Objects.equals(this.id, printableFormServiceChannel.id) &&
        Objects.equals(this.organizationId, printableFormServiceChannel.organizationId) &&
        Objects.equals(this.names, printableFormServiceChannel.names) &&
        Objects.equals(this.descriptions, printableFormServiceChannel.descriptions) &&
        Objects.equals(this.formIdentifier, printableFormServiceChannel.formIdentifier) &&
        Objects.equals(this.formReceiver, printableFormServiceChannel.formReceiver) &&
        Objects.equals(this.deliveryAddress, printableFormServiceChannel.deliveryAddress) &&
        Objects.equals(this.channelUrls, printableFormServiceChannel.channelUrls) &&
        Objects.equals(this.attachments, printableFormServiceChannel.attachments) &&
        Objects.equals(this.supportPhones, printableFormServiceChannel.supportPhones) &&
        Objects.equals(this.supportEmails, printableFormServiceChannel.supportEmails) &&
        Objects.equals(this.languages, printableFormServiceChannel.languages) &&
        Objects.equals(this.webPages, printableFormServiceChannel.webPages) &&
        Objects.equals(this.serviceHours, printableFormServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, printableFormServiceChannel.publishingStatus) &&
        Objects.equals(this.areaType, printableFormServiceChannel.areaType) &&
        Objects.equals(this.areas, printableFormServiceChannel.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, names, descriptions, formIdentifier, formReceiver, deliveryAddress, channelUrls, attachments, supportPhones, supportEmails, languages, webPages, serviceHours, publishingStatus, areaType, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintableFormServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

