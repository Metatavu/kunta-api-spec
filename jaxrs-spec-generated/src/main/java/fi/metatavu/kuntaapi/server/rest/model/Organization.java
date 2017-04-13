package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Address;
import fi.metatavu.kuntaapi.server.rest.model.Email;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Municipality;
import fi.metatavu.kuntaapi.server.rest.model.Phone;
import fi.metatavu.kuntaapi.server.rest.model.Service;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Organization
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Organization")

public class Organization   {
  
  private String id = null;
  private Municipality municipality = null;
  private String organizationType = null;
  private String businessCode = null;
  private String businessName = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private String displayNameType = null;
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private List<Email> emailAddresses = new ArrayList<Email>();
  private List<Phone> phoneNumbers = new ArrayList<Phone>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<Address> addresses = new ArrayList<Address>();
  private String publishingStatus = null;
  private String parentOrganization = null;
  private List<Service> services = new ArrayList<Service>();

  /**
   * Entity identifier.
   **/
  public Organization id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Entity identifier.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Municipality including municipality code and a localized list of municipality names.
   **/
  public Organization municipality(Municipality municipality) {
    this.municipality = municipality;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Municipality including municipality code and a localized list of municipality names.")
  public Municipality getMunicipality() {
    return municipality;
  }
  public void setMunicipality(Municipality municipality) {
    this.municipality = municipality;
  }

  /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   **/
  public Organization organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization type (State, Municipality, RegionalOrganization, Organization, Company).")
  public String getOrganizationType() {
    return organizationType;
  }
  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  /**
   * Organization business code (Y-tunnus).
   **/
  public Organization businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization business code (Y-tunnus).")
  public String getBusinessCode() {
    return businessCode;
  }
  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  /**
   * Organization business name (name used for business code).
   **/
  public Organization businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization business name (name used for business code).")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   * List of organization names.
   **/
  public Organization names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organization names.")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  /**
   * Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).
   **/
  public Organization displayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list).")
  public String getDisplayNameType() {
    return displayNameType;
  }
  public void setDisplayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
  }

  /**
   * List of organizations descriptions.
   **/
  public Organization descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations descriptions.")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * List of organizations email addresses.
   **/
  public Organization emailAddresses(List<Email> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations email addresses.")
  public List<Email> getEmailAddresses() {
    return emailAddresses;
  }
  public void setEmailAddresses(List<Email> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  /**
   * List of organizations phone numbers.
   **/
  public Organization phoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations phone numbers.")
  public List<Phone> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * List of organizations web pages.
   **/
  public Organization webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  /**
   * List of organizations addresses.
   **/
  public Organization addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations addresses.")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   * Publishing status (Draft, Published, Deleted, Modified and OldPublished).
   **/
  public Organization publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Publishing status (Draft, Published, Deleted, Modified and OldPublished).")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  /**
   * Organizations parent organization identifier if exists.
   **/
  public Organization parentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organizations parent organization identifier if exists.")
  public String getParentOrganization() {
    return parentOrganization;
  }
  public void setParentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  /**
   * List of organizations services.
   **/
  public Organization services(List<Service> services) {
    this.services = services;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of organizations services.")
  public List<Service> getServices() {
    return services;
  }
  public void setServices(List<Service> services) {
    this.services = services;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(id, organization.id) &&
        Objects.equals(municipality, organization.municipality) &&
        Objects.equals(organizationType, organization.organizationType) &&
        Objects.equals(businessCode, organization.businessCode) &&
        Objects.equals(businessName, organization.businessName) &&
        Objects.equals(names, organization.names) &&
        Objects.equals(displayNameType, organization.displayNameType) &&
        Objects.equals(descriptions, organization.descriptions) &&
        Objects.equals(emailAddresses, organization.emailAddresses) &&
        Objects.equals(phoneNumbers, organization.phoneNumbers) &&
        Objects.equals(webPages, organization.webPages) &&
        Objects.equals(addresses, organization.addresses) &&
        Objects.equals(publishingStatus, organization.publishingStatus) &&
        Objects.equals(parentOrganization, organization.parentOrganization) &&
        Objects.equals(services, organization.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, municipality, organizationType, businessCode, businessName, names, displayNameType, descriptions, emailAddresses, phoneNumbers, webPages, addresses, publishingStatus, parentOrganization, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
