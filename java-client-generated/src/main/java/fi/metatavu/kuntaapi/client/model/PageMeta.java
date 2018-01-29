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
 * PageMeta
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T12:08:20.780+02:00")
public class PageMeta   {
  @SerializedName("hideMenuChildren")
  private Boolean hideMenuChildren = null;

  @SerializedName("unmappedParentId")
  private String unmappedParentId = null;

  public PageMeta hideMenuChildren(Boolean hideMenuChildren) {
    this.hideMenuChildren = hideMenuChildren;
    return this;
  }

   /**
   * Get hideMenuChildren
   * @return hideMenuChildren
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHideMenuChildren() {
    return hideMenuChildren;
  }

  public void setHideMenuChildren(Boolean hideMenuChildren) {
    this.hideMenuChildren = hideMenuChildren;
  }

  public PageMeta unmappedParentId(String unmappedParentId) {
    this.unmappedParentId = unmappedParentId;
    return this;
  }

   /**
   * Get unmappedParentId
   * @return unmappedParentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUnmappedParentId() {
    return unmappedParentId;
  }

  public void setUnmappedParentId(String unmappedParentId) {
    this.unmappedParentId = unmappedParentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMeta pageMeta = (PageMeta) o;
    return Objects.equals(this.hideMenuChildren, pageMeta.hideMenuChildren) &&
        Objects.equals(this.unmappedParentId, pageMeta.unmappedParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideMenuChildren, unmappedParentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMeta {\n");
    
    sb.append("    hideMenuChildren: ").append(toIndentedString(hideMenuChildren)).append("\n");
    sb.append("    unmappedParentId: ").append(toIndentedString(unmappedParentId)).append("\n");
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

