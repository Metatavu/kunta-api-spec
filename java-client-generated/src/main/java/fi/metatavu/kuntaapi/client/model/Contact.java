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
import fi.metatavu.kuntaapi.client.model.ContactPhone;
import fi.metatavu.kuntaapi.client.model.ContactStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Contact
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:32:50.272+02:00")
public class Contact   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("privateContact")
  private Boolean privateContact = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("organization")
  private String organization = null;

  @SerializedName("organizationUnits")
  private List<String> organizationUnits = new ArrayList<String>();

  @SerializedName("additionalInformations")
  private List<String> additionalInformations = new ArrayList<String>();

  @SerializedName("emails")
  private List<String> emails = new ArrayList<String>();

  @SerializedName("phones")
  private List<ContactPhone> phones = new ArrayList<ContactPhone>();

  @SerializedName("addresses")
  private List<Address> addresses = new ArrayList<Address>();

  @SerializedName("statuses")
  private List<ContactStatus> statuses = new ArrayList<ContactStatus>();

  public Contact id(String id) {
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

  public Contact displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact privateContact(Boolean privateContact) {
    this.privateContact = privateContact;
    return this;
  }

   /**
   * Get privateContact
   * @return privateContact
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPrivateContact() {
    return privateContact;
  }

  public void setPrivateContact(Boolean privateContact) {
    this.privateContact = privateContact;
  }

  public Contact title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contact organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * Get organization
   * @return organization
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public Contact organizationUnits(List<String> organizationUnits) {
    this.organizationUnits = organizationUnits;
    return this;
  }

  public Contact addOrganizationUnitsItem(String organizationUnitsItem) {
    this.organizationUnits.add(organizationUnitsItem);
    return this;
  }

   /**
   * Get organizationUnits
   * @return organizationUnits
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getOrganizationUnits() {
    return organizationUnits;
  }

  public void setOrganizationUnits(List<String> organizationUnits) {
    this.organizationUnits = organizationUnits;
  }

  public Contact additionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public Contact addAdditionalInformationsItem(String additionalInformationsItem) {
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<String> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public Contact emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public Contact addEmailsItem(String emailsItem) {
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public Contact phones(List<ContactPhone> phones) {
    this.phones = phones;
    return this;
  }

  public Contact addPhonesItem(ContactPhone phonesItem) {
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Get phones
   * @return phones
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContactPhone> getPhones() {
    return phones;
  }

  public void setPhones(List<ContactPhone> phones) {
    this.phones = phones;
  }

  public Contact addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Contact addAddressesItem(Address addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Contact statuses(List<ContactStatus> statuses) {
    this.statuses = statuses;
    return this;
  }

  public Contact addStatusesItem(ContactStatus statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ContactStatus> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<ContactStatus> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.displayName, contact.displayName) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.privateContact, contact.privateContact) &&
        Objects.equals(this.title, contact.title) &&
        Objects.equals(this.organization, contact.organization) &&
        Objects.equals(this.organizationUnits, contact.organizationUnits) &&
        Objects.equals(this.additionalInformations, contact.additionalInformations) &&
        Objects.equals(this.emails, contact.emails) &&
        Objects.equals(this.phones, contact.phones) &&
        Objects.equals(this.addresses, contact.addresses) &&
        Objects.equals(this.statuses, contact.statuses);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

