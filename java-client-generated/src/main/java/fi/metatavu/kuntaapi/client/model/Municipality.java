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
 * Municipality
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:59:09.948+02:00")
public class Municipality   {
  @SerializedName("code")
  private String code = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  public Municipality code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Municipality code (like 491 or 091).
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "Municipality code (like 491 or 091).")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Municipality names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public Municipality addNamesItem(LocalizedValue namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }

  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Municipality municipality = (Municipality) o;
    return Objects.equals(this.code, municipality.code) &&
        Objects.equals(this.names, municipality.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Municipality {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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

