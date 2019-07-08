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
import fi.metatavu.kuntaapi.client.model.ServiceHour;
import fi.metatavu.kuntaapi.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ServiceLocationServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T15:25:34.363+03:00")
public class ServiceLocationServiceChannel   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  @SerializedName("descriptions")
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();

  @SerializedName("phoneNumbers")
  private List<Phone> phoneNumbers = new ArrayList<Phone>();

  @SerializedName("emails")
  private List<Email> emails = new ArrayList<Email>();

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("phoneServiceCharge")
  private Boolean phoneServiceCharge = null;

  @SerializedName("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @SerializedName("areaType")
  private String areaType = null;

  @SerializedName("areas")
  private List<Area> areas = new ArrayList<Area>();

  @SerializedName("addresses")
  private List<Address> addresses = new ArrayList<Address>();

  @SerializedName("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @SerializedName("publishingStatus")
  private String publishingStatus = null;

  public ServiceLocationServiceChannel id(String id) {
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

  public ServiceLocationServiceChannel organizationId(String organizationId) {
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

  public ServiceLocationServiceChannel names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public ServiceLocationServiceChannel addNamesItem(LocalizedValue namesItem) {
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

  public ServiceLocationServiceChannel descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ServiceLocationServiceChannel addDescriptionsItem(LocalizedValue descriptionsItem) {
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

  public ServiceLocationServiceChannel phoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public ServiceLocationServiceChannel addPhoneNumbersItem(Phone phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of phone numbers for the service channel. Includes also fax numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "List of phone numbers for the service channel. Includes also fax numbers.")
  public List<Phone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public ServiceLocationServiceChannel emails(List<Email> emails) {
    this.emails = emails;
    return this;
  }

  public ServiceLocationServiceChannel addEmailsItem(Email emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * List email addresses for the service channel.
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "List email addresses for the service channel.")
  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  public ServiceLocationServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ServiceLocationServiceChannel addLanguagesItem(String languagesItem) {
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

  public ServiceLocationServiceChannel phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

   /**
   * DEPRECATED. DO NOT USE!
   * @return phoneServiceCharge
  **/
  @ApiModelProperty(example = "null", value = "DEPRECATED. DO NOT USE!")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }

  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  public ServiceLocationServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public ServiceLocationServiceChannel addWebPagesItem(WebPage webPagesItem) {
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

  public ServiceLocationServiceChannel areaType(String areaType) {
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

  public ServiceLocationServiceChannel areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  public ServiceLocationServiceChannel addAreasItem(Area areasItem) {
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

  public ServiceLocationServiceChannel addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public ServiceLocationServiceChannel addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of service location addresses.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "List of service location addresses.")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public ServiceLocationServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public ServiceLocationServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
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

  public ServiceLocationServiceChannel publishingStatus(String publishingStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLocationServiceChannel serviceLocationServiceChannel = (ServiceLocationServiceChannel) o;
    return Objects.equals(this.id, serviceLocationServiceChannel.id) &&
        Objects.equals(this.organizationId, serviceLocationServiceChannel.organizationId) &&
        Objects.equals(this.names, serviceLocationServiceChannel.names) &&
        Objects.equals(this.descriptions, serviceLocationServiceChannel.descriptions) &&
        Objects.equals(this.phoneNumbers, serviceLocationServiceChannel.phoneNumbers) &&
        Objects.equals(this.emails, serviceLocationServiceChannel.emails) &&
        Objects.equals(this.languages, serviceLocationServiceChannel.languages) &&
        Objects.equals(this.phoneServiceCharge, serviceLocationServiceChannel.phoneServiceCharge) &&
        Objects.equals(this.webPages, serviceLocationServiceChannel.webPages) &&
        Objects.equals(this.areaType, serviceLocationServiceChannel.areaType) &&
        Objects.equals(this.areas, serviceLocationServiceChannel.areas) &&
        Objects.equals(this.addresses, serviceLocationServiceChannel.addresses) &&
        Objects.equals(this.serviceHours, serviceLocationServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, serviceLocationServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, names, descriptions, phoneNumbers, emails, languages, phoneServiceCharge, webPages, areaType, areas, addresses, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLocationServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

