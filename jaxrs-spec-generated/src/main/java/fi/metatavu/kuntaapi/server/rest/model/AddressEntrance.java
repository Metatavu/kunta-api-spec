package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.AccessibilityContactInfo;
import fi.metatavu.kuntaapi.server.rest.model.AccessibilitySentence;
import fi.metatavu.kuntaapi.server.rest.model.Coordinates;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Entrance for address
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Entrance for address")

public class AddressEntrance  implements java.io.Serializable {
  
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();
  private Boolean isMainEntrance = null;
  private Coordinates coordinates = null;
  private AccessibilityContactInfo contactInfo = null;
  private List<AccessibilitySentence> accessibilitySentences = new ArrayList<AccessibilitySentence>();

  /**
   * List of localized service names.
   **/
  public AddressEntrance name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service names.")
  public List<LocalizedValue> getName() {
    return name;
  }
  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  /**
   * Indicates if entrance is main entrance.
   **/
  public AddressEntrance isMainEntrance(Boolean isMainEntrance) {
    this.isMainEntrance = isMainEntrance;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if entrance is main entrance.")
  public Boolean getIsMainEntrance() {
    return isMainEntrance;
  }
  public void setIsMainEntrance(Boolean isMainEntrance) {
    this.isMainEntrance = isMainEntrance;
  }

  /**
   **/
  public AddressEntrance coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Coordinates getCoordinates() {
    return coordinates;
  }
  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  /**
   **/
  public AddressEntrance contactInfo(AccessibilityContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public AccessibilityContactInfo getContactInfo() {
    return contactInfo;
  }
  public void setContactInfo(AccessibilityContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  /**
   * List of accessibility sentences.
   **/
  public AddressEntrance accessibilitySentences(List<AccessibilitySentence> accessibilitySentences) {
    this.accessibilitySentences = accessibilitySentences;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of accessibility sentences.")
  public List<AccessibilitySentence> getAccessibilitySentences() {
    return accessibilitySentences;
  }
  public void setAccessibilitySentences(List<AccessibilitySentence> accessibilitySentences) {
    this.accessibilitySentences = accessibilitySentences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressEntrance addressEntrance = (AddressEntrance) o;
    return Objects.equals(name, addressEntrance.name) &&
        Objects.equals(isMainEntrance, addressEntrance.isMainEntrance) &&
        Objects.equals(coordinates, addressEntrance.coordinates) &&
        Objects.equals(contactInfo, addressEntrance.contactInfo) &&
        Objects.equals(accessibilitySentences, addressEntrance.accessibilitySentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isMainEntrance, coordinates, contactInfo, accessibilitySentences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressEntrance {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isMainEntrance: ").append(toIndentedString(isMainEntrance)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    accessibilitySentences: ").append(toIndentedString(accessibilitySentences)).append("\n");
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
