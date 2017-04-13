package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Address;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Municipality;
import fi.metatavu.kuntaapi.server.rest.model.Phone;
import fi.metatavu.kuntaapi.server.rest.model.ServiceHour;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceLocationServiceChannel   {
  
  private String id = null;
  private String organizationId = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private Boolean serviceAreaRestricted = null;
  private List<Phone> phoneNumbers = new ArrayList<Phone>();
  private List<LocalizedValue> emails = new ArrayList<LocalizedValue>();
  private List<String> languages = new ArrayList<String>();
  private Boolean phoneServiceCharge = null;
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<Municipality> serviceAreas = new ArrayList<Municipality>();
  private List<Address> addresses = new ArrayList<Address>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   * Identifier for the service channel.
   **/
  public ServiceLocationServiceChannel id(String id) {
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
  public ServiceLocationServiceChannel organizationId(String organizationId) {
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
  public ServiceLocationServiceChannel names(List<LocalizedValue> names) {
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
  public ServiceLocationServiceChannel descriptions(List<LocalizedValue> descriptions) {
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
   * Is the service location channel restricted by service area.
   **/
  public ServiceLocationServiceChannel serviceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is the service location channel restricted by service area.")
  public Boolean getServiceAreaRestricted() {
    return serviceAreaRestricted;
  }
  public void setServiceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
  }

  /**
   * List of phone numbers for the service channel. Includes also fax numbers.
   **/
  public ServiceLocationServiceChannel phoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of phone numbers for the service channel. Includes also fax numbers.")
  public List<Phone> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<Phone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   * List email addresses for the service channel.
   **/
  public ServiceLocationServiceChannel emails(List<LocalizedValue> emails) {
    this.emails = emails;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List email addresses for the service channel.")
  public List<LocalizedValue> getEmails() {
    return emails;
  }
  public void setEmails(List<LocalizedValue> emails) {
    this.emails = emails;
  }

  /**
   * List of languages the service channel is available in (two letter language code).
   **/
  public ServiceLocationServiceChannel languages(List<String> languages) {
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
   * Is the phone service charged for.
   **/
  public ServiceLocationServiceChannel phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is the phone service charged for.")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }
  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  /**
   * List of service channel web pages.
   **/
  public ServiceLocationServiceChannel webPages(List<WebPage> webPages) {
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
   * List of serviceareas. Used when location service channel is restricted by service area (ServiceAreaRestricted=true).
   **/
  public ServiceLocationServiceChannel serviceAreas(List<Municipality> serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of serviceareas. Used when location service channel is restricted by service area (ServiceAreaRestricted=true).")
  public List<Municipality> getServiceAreas() {
    return serviceAreas;
  }
  public void setServiceAreas(List<Municipality> serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  /**
   * List of service location addresses.
   **/
  public ServiceLocationServiceChannel addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service location addresses.")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   * List of service channel service hours.
   **/
  public ServiceLocationServiceChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public ServiceLocationServiceChannel publishingStatus(String publishingStatus) {
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
        Objects.equals(organizationId, serviceLocationServiceChannel.organizationId) &&
        Objects.equals(names, serviceLocationServiceChannel.names) &&
        Objects.equals(descriptions, serviceLocationServiceChannel.descriptions) &&
        Objects.equals(serviceAreaRestricted, serviceLocationServiceChannel.serviceAreaRestricted) &&
        Objects.equals(phoneNumbers, serviceLocationServiceChannel.phoneNumbers) &&
        Objects.equals(emails, serviceLocationServiceChannel.emails) &&
        Objects.equals(languages, serviceLocationServiceChannel.languages) &&
        Objects.equals(phoneServiceCharge, serviceLocationServiceChannel.phoneServiceCharge) &&
        Objects.equals(webPages, serviceLocationServiceChannel.webPages) &&
        Objects.equals(serviceAreas, serviceLocationServiceChannel.serviceAreas) &&
        Objects.equals(addresses, serviceLocationServiceChannel.addresses) &&
        Objects.equals(serviceHours, serviceLocationServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, serviceLocationServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organizationId, names, descriptions, serviceAreaRestricted, phoneNumbers, emails, languages, phoneServiceCharge, webPages, serviceAreas, addresses, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLocationServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    serviceAreaRestricted: ").append(toIndentedString(serviceAreaRestricted)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
