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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Name type by language
 */
@ApiModel(description = "Name type by language")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T06:46:40.585+02:00")
public class NameTypeByLanguage   {
  @SerializedName("type")
  private String type = null;

  @SerializedName("language")
  private String language = null;

  public NameTypeByLanguage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * DisplayNameType preferred by language code (Name or AlternateName).
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "DisplayNameType preferred by language code (Name or AlternateName).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NameTypeByLanguage language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language code.
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "Language code.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameTypeByLanguage nameTypeByLanguage = (NameTypeByLanguage) o;
    return Objects.equals(this.type, nameTypeByLanguage.type) &&
        Objects.equals(this.language, nameTypeByLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameTypeByLanguage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

