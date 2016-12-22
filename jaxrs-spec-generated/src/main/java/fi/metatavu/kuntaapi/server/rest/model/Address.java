package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Address   {
  
  private String type = null;
  private String postOfficeBox = null;
  private String postalCode = null;
  private String postOffice = null;
  private List<LocalizedValue> streetAddress = new ArrayList<LocalizedValue>();
  private String municipality = null;
  private String country = null;
  private String qualifier = null;
  private List<LocalizedValue> additionalInformations = new ArrayList<LocalizedValue>();

  /**
   **/
  public Address type(String type) {
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
  public Address postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPostOfficeBox() {
    return postOfficeBox;
  }
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  /**
   **/
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   **/
  public Address postOffice(String postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPostOffice() {
    return postOffice;
  }
  public void setPostOffice(String postOffice) {
    this.postOffice = postOffice;
  }

  /**
   **/
  public Address streetAddress(List<LocalizedValue> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(List<LocalizedValue> streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   **/
  public Address municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getMunicipality() {
    return municipality;
  }
  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  /**
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   **/
  public Address qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getQualifier() {
    return qualifier;
  }
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  /**
   **/
  public Address additionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(type, address.type) &&
        Objects.equals(postOfficeBox, address.postOfficeBox) &&
        Objects.equals(postalCode, address.postalCode) &&
        Objects.equals(postOffice, address.postOffice) &&
        Objects.equals(streetAddress, address.streetAddress) &&
        Objects.equals(municipality, address.municipality) &&
        Objects.equals(country, address.country) &&
        Objects.equals(qualifier, address.qualifier) &&
        Objects.equals(additionalInformations, address.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, postOfficeBox, postalCode, postOffice, streetAddress, municipality, country, qualifier, additionalInformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
