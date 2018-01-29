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
 * ElectronicServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:59:09.948+02:00")
public class ElectronicServiceChannel   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  @SerializedName("descriptions")
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();

  @SerializedName("signatureQuantity")
  private Integer signatureQuantity = null;

  @SerializedName("requiresSignature")
  private Boolean requiresSignature = null;

  @SerializedName("supportPhones")
  private List<Phone> supportPhones = new ArrayList<Phone>();

  @SerializedName("supportEmails")
  private List<Email> supportEmails = new ArrayList<Email>();

  @SerializedName("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @SerializedName("urls")
  private List<LocalizedValue> urls = new ArrayList<LocalizedValue>();

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("attachments")
  private List<ServiceChannelAttachment> attachments = new ArrayList<ServiceChannelAttachment>();

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

  public ElectronicServiceChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ElectronicServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ElectronicServiceChannel names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public ElectronicServiceChannel addNamesItem(LocalizedValue namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }

  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  public ElectronicServiceChannel descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ElectronicServiceChannel addDescriptionsItem(LocalizedValue descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  public ElectronicServiceChannel signatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * Get signatureQuantity
   * @return signatureQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public ElectronicServiceChannel requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Get requiresSignature
   * @return requiresSignature
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public ElectronicServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public ElectronicServiceChannel addSupportPhonesItem(Phone supportPhonesItem) {
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

  public ElectronicServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public ElectronicServiceChannel addSupportEmailsItem(Email supportEmailsItem) {
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

  public ElectronicServiceChannel requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Get requiresAuthentication
   * @return requiresAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public ElectronicServiceChannel urls(List<LocalizedValue> urls) {
    this.urls = urls;
    return this;
  }

  public ElectronicServiceChannel addUrlsItem(LocalizedValue urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getUrls() {
    return urls;
  }

  public void setUrls(List<LocalizedValue> urls) {
    this.urls = urls;
  }

  public ElectronicServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ElectronicServiceChannel addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public ElectronicServiceChannel attachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ElectronicServiceChannel addAttachmentsItem(ServiceChannelAttachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceChannelAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<ServiceChannelAttachment> attachments) {
    this.attachments = attachments;
  }

  public ElectronicServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public ElectronicServiceChannel addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public ElectronicServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public ElectronicServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public ElectronicServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public ElectronicServiceChannel areaType(String areaType) {
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

  public ElectronicServiceChannel areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  public ElectronicServiceChannel addAreasItem(Area areasItem) {
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
    ElectronicServiceChannel electronicServiceChannel = (ElectronicServiceChannel) o;
    return Objects.equals(this.id, electronicServiceChannel.id) &&
        Objects.equals(this.organizationId, electronicServiceChannel.organizationId) &&
        Objects.equals(this.names, electronicServiceChannel.names) &&
        Objects.equals(this.descriptions, electronicServiceChannel.descriptions) &&
        Objects.equals(this.signatureQuantity, electronicServiceChannel.signatureQuantity) &&
        Objects.equals(this.requiresSignature, electronicServiceChannel.requiresSignature) &&
        Objects.equals(this.supportPhones, electronicServiceChannel.supportPhones) &&
        Objects.equals(this.supportEmails, electronicServiceChannel.supportEmails) &&
        Objects.equals(this.requiresAuthentication, electronicServiceChannel.requiresAuthentication) &&
        Objects.equals(this.urls, electronicServiceChannel.urls) &&
        Objects.equals(this.languages, electronicServiceChannel.languages) &&
        Objects.equals(this.attachments, electronicServiceChannel.attachments) &&
        Objects.equals(this.webPages, electronicServiceChannel.webPages) &&
        Objects.equals(this.serviceHours, electronicServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, electronicServiceChannel.publishingStatus) &&
        Objects.equals(this.areaType, electronicServiceChannel.areaType) &&
        Objects.equals(this.areas, electronicServiceChannel.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, names, descriptions, signatureQuantity, requiresSignature, supportPhones, supportEmails, requiresAuthentication, urls, languages, attachments, webPages, serviceHours, publishingStatus, areaType, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

