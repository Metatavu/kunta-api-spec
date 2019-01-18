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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * OntologyItem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T06:52:51.644+02:00")
public class OntologyItem   {
  @SerializedName("system")
  private String system = null;

  @SerializedName("name")
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();

  @SerializedName("code")
  private String code = null;

  @SerializedName("ontologyType")
  private String ontologyType = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("parentUri")
  private String parentUri = null;

  public OntologyItem system(String system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public OntologyItem name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  public OntologyItem addNameItem(LocalizedValue nameItem) {
    this.name.add(nameItem);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getName() {
    return name;
  }

  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  public OntologyItem code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OntologyItem ontologyType(String ontologyType) {
    this.ontologyType = ontologyType;
    return this;
  }

   /**
   * Get ontologyType
   * @return ontologyType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOntologyType() {
    return ontologyType;
  }

  public void setOntologyType(String ontologyType) {
    this.ontologyType = ontologyType;
  }

  public OntologyItem uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Get uri
   * @return uri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public OntologyItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public OntologyItem parentUri(String parentUri) {
    this.parentUri = parentUri;
    return this;
  }

   /**
   * Get parentUri
   * @return parentUri
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentUri() {
    return parentUri;
  }

  public void setParentUri(String parentUri) {
    this.parentUri = parentUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OntologyItem ontologyItem = (OntologyItem) o;
    return Objects.equals(this.system, ontologyItem.system) &&
        Objects.equals(this.name, ontologyItem.name) &&
        Objects.equals(this.code, ontologyItem.code) &&
        Objects.equals(this.ontologyType, ontologyItem.ontologyType) &&
        Objects.equals(this.uri, ontologyItem.uri) &&
        Objects.equals(this.parentId, ontologyItem.parentId) &&
        Objects.equals(this.parentUri, ontologyItem.parentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, name, code, ontologyType, uri, parentId, parentUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyItem {\n");
    
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ontologyType: ").append(toIndentedString(ontologyType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
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

