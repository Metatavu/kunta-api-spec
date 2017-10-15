package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Address;
import fi.metatavu.kuntaapi.server.rest.model.ContactPhone;
import fi.metatavu.kuntaapi.server.rest.model.ContactStatus;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Contact   {
  
  private String id = null;
  private String displayName = null;
  private String firstName = null;
  private String lastName = null;
  private Boolean privateContact = null;
  private String title = null;
  private String organization = null;
  private List<String> organizationUnits = new ArrayList<String>();
  private List<String> additionalInformations = new ArrayList<String>();
  private List<String> emails = new ArrayList<String>();
  private List<ContactPhone> phones = new ArrayList<ContactPhone>();
  private List<Address> addresses = new ArrayList<Address>();
  private List<ContactStatus> statuses = new ArrayList<ContactStatus>();

  /**
   **/
  public Contact id(String id) {
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
  public Contact displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   **/
  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   **/
  public Contact privateContact(Boolean privateContact) {
    this.privateContact = privateContact;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPrivateContact() {
    return privateContact;
  }
  public void setPrivateContact(Boolean privateContact) {
    this.privateContact = privateContact;
  }

  /**
   **/
  public Contact title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Contact organization(String organization) {
    this.organization = organization;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }

  /**
   **/
  public Contact organizationUnits(List<String> organizationUnits) {
    this.organizationUnits = organizationUnits;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getOrganizationUnits() {
    return organizationUnits;
  }
  public void setOrganizationUnits(List<String> organizationUnits) {
    this.organizationUnits = organizationUnits;
  }

  /**
   **/
  public Contact additionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  /**
   **/
  public Contact emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getEmails() {
    return emails;
  }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  /**
   **/
  public Contact phones(List<ContactPhone> phones) {
    this.phones = phones;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ContactPhone> getPhones() {
    return phones;
  }
  public void setPhones(List<ContactPhone> phones) {
    this.phones = phones;
  }

  /**
   **/
  public Contact addresses(List<Address> addresses) {
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
  public Contact statuses(List<ContactStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ContactStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<ContactStatus> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(id, contact.id) &&
        Objects.equals(displayName, contact.displayName) &&
        Objects.equals(firstName, contact.firstName) &&
        Objects.equals(lastName, contact.lastName) &&
        Objects.equals(privateContact, contact.privateContact) &&
        Objects.equals(title, contact.title) &&
        Objects.equals(organization, contact.organization) &&
        Objects.equals(organizationUnits, contact.organizationUnits) &&
        Objects.equals(additionalInformations, contact.additionalInformations) &&
        Objects.equals(emails, contact.emails) &&
        Objects.equals(phones, contact.phones) &&
        Objects.equals(addresses, contact.addresses) &&
        Objects.equals(statuses, contact.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, firstName, lastName, privateContact, title, organization, organizationUnits, additionalInformations, emails, phones, addresses, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    privateContact: ").append(toIndentedString(privateContact)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    organizationUnits: ").append(toIndentedString(organizationUnits)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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
