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
import fi.metatavu.kuntaapi.client.model.Municipality;
import fi.metatavu.kuntaapi.client.model.NameTypeByLanguage;
import fi.metatavu.kuntaapi.client.model.OrganizationService;
import fi.metatavu.kuntaapi.client.model.Phone;
import fi.metatavu.kuntaapi.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Organization
 */
@ApiModel(description = "Organization")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T15:25:34.363+03:00")
public class Organization   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentOrganization")
  private String parentOrganization = null;

  @SerializedName("organizationType")
  private String organizationType = null;

  @SerializedName("municipality")
  private Municipality municipality = null;

  @SerializedName("businessCode")
  private String businessCode = null;

  @SerializedName("businessName")
  private String businessName = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  @SerializedName("displayNameType")
  private List<NameTypeByLanguage> displayNameType = new ArrayList<NameTypeByLanguage>();

  @SerializedName("areaType")
  private String areaType = null;

  @SerializedName("areas")
  private List<Area> areas = new ArrayList<Area>();

  @SerializedName("descriptions")
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();

  @SerializedName("emailAddresses")
  private List<Email> emailAddresses = new ArrayList<Email>();

  @SerializedName("phoneNumbers")
  private List<Phone> phoneNumbers = new ArrayList<Phone>();

  @SerializedName("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @SerializedName("addresses")
  private List<Address> addresses = new ArrayList<Address>();

  @SerializedName("publishingStatus")
  private String publishingStatus = null;

  @SerializedName("services")
  private List<OrganizationService> services = new ArrayList<OrganizationService>();

  public Organization id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Entity identifier.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Entity identifier.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Organization parentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

   /**
   * Organizations parent organization identifier if exists.
   * @return parentOrganization
  **/
  @ApiModelProperty(example = "null", value = "Organizations parent organization identifier if exists.")
  public String getParentOrganization() {
    return parentOrganization;
  }

  public void setParentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  public Organization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @return organizationType
  **/
  @ApiModelProperty(example = "null", value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public Organization municipality(Municipality municipality) {
    this.municipality = municipality;
    return this;
  }

   /**
   * Municipality including municipality code and a localized list of municipality names.
   * @return municipality
  **/
  @ApiModelProperty(example = "null", value = "Municipality including municipality code and a localized list of municipality names.")
  public Municipality getMunicipality() {
    return municipality;
  }

  public void setMunicipality(Municipality municipality) {
    this.municipality = municipality;
  }

  public Organization businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

   /**
   * Organization business code (Y-tunnus).
   * @return businessCode
  **/
  @ApiModelProperty(example = "null", value = "Organization business code (Y-tunnus).")
  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public Organization businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Organization business name (name used for business code).
   * @return businessName
  **/
  @ApiModelProperty(example = "null", value = "Organization business name (name used for business code).")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Organization names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public Organization addNamesItem(LocalizedValue namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * List of organization names.
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "List of organization names.")
  public List<LocalizedValue> getNames() {
    return names;
  }

  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  public Organization displayNameType(List<NameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  public Organization addDisplayNameTypeItem(NameTypeByLanguage displayNameTypeItem) {
    this.displayNameType.add(displayNameTypeItem);
    return this;
  }

   /**
   * List of Display name types (Name or AlternateName) for each language version of OrganizationNames.
   * @return displayNameType
  **/
  @ApiModelProperty(example = "null", value = "List of Display name types (Name or AlternateName) for each language version of OrganizationNames.")
  public List<NameTypeByLanguage> getDisplayNameType() {
    return displayNameType;
  }

  public void setDisplayNameType(List<NameTypeByLanguage> displayNameType) {
    this.displayNameType = displayNameType;
  }

  public Organization areaType(String areaType) {
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

  public Organization areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  public Organization addAreasItem(Area areasItem) {
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of organization areas.
   * @return areas
  **/
  @ApiModelProperty(example = "null", value = "List of organization areas.")
  public List<Area> getAreas() {
    return areas;
  }

  public void setAreas(List<Area> areas) {
    this.areas = areas;
  }

  public Organization descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public Organization addDescriptionsItem(LocalizedValue descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of organizations descriptions.
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "List of organizations descriptions.")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  public Organization emailAddresses(List<Email> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  public Organization addEmailAddressesItem(Email emailAddressesItem) {
    this.emailAddresses.add(emailAddressesItem);
    return this;
  }

   /**
   * List of organizations email addresses.
   * @return emailAddresses
  **/
  @ApiModelProperty(example = "null", value = "List of organizations email addresses.")
  public List<Email> getEmailAddresses() {
    return emailAddresses;
  }

  public void setEmailAddresses(List<Email> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  public Organization phoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public Organization addPhoneNumbersItem(Phone phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * List of organizations phone numbers.
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "List of organizations phone numbers.")
  public List<Phone> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public Organization webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public Organization addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of organizations web pages.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of organizations web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public Organization addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Organization addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * List of organizations addresses.
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "List of organizations addresses.")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Organization publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status (Draft, Published, Deleted, Modified and OldPublished).
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Publishing status (Draft, Published, Deleted, Modified and OldPublished).")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public Organization services(List<OrganizationService> services) {
    this.services = services;
    return this;
  }

  public Organization addServicesItem(OrganizationService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

   /**
   * List of organizations services.
   * @return services
  **/
  @ApiModelProperty(example = "null", value = "List of organizations services.")
  public List<OrganizationService> getServices() {
    return services;
  }

  public void setServices(List<OrganizationService> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.parentOrganization, organization.parentOrganization) &&
        Objects.equals(this.organizationType, organization.organizationType) &&
        Objects.equals(this.municipality, organization.municipality) &&
        Objects.equals(this.businessCode, organization.businessCode) &&
        Objects.equals(this.businessName, organization.businessName) &&
        Objects.equals(this.names, organization.names) &&
        Objects.equals(this.displayNameType, organization.displayNameType) &&
        Objects.equals(this.areaType, organization.areaType) &&
        Objects.equals(this.areas, organization.areas) &&
        Objects.equals(this.descriptions, organization.descriptions) &&
        Objects.equals(this.emailAddresses, organization.emailAddresses) &&
        Objects.equals(this.phoneNumbers, organization.phoneNumbers) &&
        Objects.equals(this.webPages, organization.webPages) &&
        Objects.equals(this.addresses, organization.addresses) &&
        Objects.equals(this.publishingStatus, organization.publishingStatus) &&
        Objects.equals(this.services, organization.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentOrganization, organizationType, municipality, businessCode, businessName, names, displayNameType, areaType, areas, descriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

