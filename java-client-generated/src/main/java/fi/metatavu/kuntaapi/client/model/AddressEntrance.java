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
import fi.metatavu.kuntaapi.client.model.AccessibilityContactInfo;
import fi.metatavu.kuntaapi.client.model.AccessibilitySentence;
import fi.metatavu.kuntaapi.client.model.Coordinates;
import fi.metatavu.kuntaapi.client.model.LocalizedValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Entrance for address
 */
@ApiModel(description = "Entrance for address")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T18:08:24.691+03:00")
public class AddressEntrance   {
  @SerializedName("name")
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();

  @SerializedName("isMainEntrance")
  private Boolean isMainEntrance = null;

  @SerializedName("coordinates")
  private Coordinates coordinates = null;

  @SerializedName("contactInfo")
  private AccessibilityContactInfo contactInfo = null;

  @SerializedName("accessibilitySentences")
  private List<AccessibilitySentence> accessibilitySentences = new ArrayList<AccessibilitySentence>();

  public AddressEntrance name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  public AddressEntrance addNameItem(LocalizedValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * List of localized service names.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "List of localized service names.")
  public List<LocalizedValue> getName() {
    return name;
  }

  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  public AddressEntrance isMainEntrance(Boolean isMainEntrance) {
    this.isMainEntrance = isMainEntrance;
    return this;
  }

   /**
   * Indicates if entrance is main entrance.
   * @return isMainEntrance
  **/
  @ApiModelProperty(example = "null", value = "Indicates if entrance is main entrance.")
  public Boolean getIsMainEntrance() {
    return isMainEntrance;
  }

  public void setIsMainEntrance(Boolean isMainEntrance) {
    this.isMainEntrance = isMainEntrance;
  }

  public AddressEntrance coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public AddressEntrance contactInfo(AccessibilityContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public AccessibilityContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(AccessibilityContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public AddressEntrance accessibilitySentences(List<AccessibilitySentence> accessibilitySentences) {
    this.accessibilitySentences = accessibilitySentences;
    return this;
  }

  public AddressEntrance addAccessibilitySentencesItem(AccessibilitySentence accessibilitySentencesItem) {
    this.accessibilitySentences.add(accessibilitySentencesItem);
    return this;
  }

   /**
   * List of accessibility sentences.
   * @return accessibilitySentences
  **/
  @ApiModelProperty(example = "null", value = "List of accessibility sentences.")
  public List<AccessibilitySentence> getAccessibilitySentences() {
    return accessibilitySentences;
  }

  public void setAccessibilitySentences(List<AccessibilitySentence> accessibilitySentences) {
    this.accessibilitySentences = accessibilitySentences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressEntrance addressEntrance = (AddressEntrance) o;
    return Objects.equals(this.name, addressEntrance.name) &&
        Objects.equals(this.isMainEntrance, addressEntrance.isMainEntrance) &&
        Objects.equals(this.coordinates, addressEntrance.coordinates) &&
        Objects.equals(this.contactInfo, addressEntrance.contactInfo) &&
        Objects.equals(this.accessibilitySentences, addressEntrance.accessibilitySentences);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
