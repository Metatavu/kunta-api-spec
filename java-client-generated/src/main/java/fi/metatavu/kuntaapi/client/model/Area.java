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
import fi.metatavu.kuntaapi.client.model.LocalizedValue;
import fi.metatavu.kuntaapi.client.model.Municipality;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Area
 */
@ApiModel(description = "Area")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T12:08:20.780+02:00")
public class Area   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();

  @SerializedName("municipalities")
  private List<Municipality> municipalities = new ArrayList<Municipality>();

  public Area type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Area code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code of the area.
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Code of the area.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Area name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  public Area addNameItem(LocalizedValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * Localized list of names for the area
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Localized list of names for the area")
  public List<LocalizedValue> getName() {
    return name;
  }

  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  public Area municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public Area addMunicipalitiesItem(Municipality municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * List of municipalities including municipality code and a localized list of municipality names.
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "List of municipalities including municipality code and a localized list of municipality names.")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Area area = (Area) o;
    return Objects.equals(this.type, area.type) &&
        Objects.equals(this.code, area.code) &&
        Objects.equals(this.name, area.name) &&
        Objects.equals(this.municipalities, area.municipalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, name, municipalities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Area {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
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

