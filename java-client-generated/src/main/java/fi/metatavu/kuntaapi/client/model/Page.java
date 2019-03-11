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
import fi.metatavu.kuntaapi.client.model.PageMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Page
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T07:41:30.697+02:00")
public class Page   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("titles")
  private List<LocalizedValue> titles = new ArrayList<LocalizedValue>();

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("meta")
  private PageMeta meta = null;

  public Page id(String id) {
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

  public Page slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * Get slug
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Page titles(List<LocalizedValue> titles) {
    this.titles = titles;
    return this;
  }

  public Page addTitlesItem(LocalizedValue titlesItem) {
    this.titles.add(titlesItem);
    return this;
  }

   /**
   * Get titles
   * @return titles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getTitles() {
    return titles;
  }

  public void setTitles(List<LocalizedValue> titles) {
    this.titles = titles;
  }

  public Page parentId(String parentId) {
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

  public Page meta(PageMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(example = "null", value = "")
  public PageMeta getMeta() {
    return meta;
  }

  public void setMeta(PageMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.id, page.id) &&
        Objects.equals(this.slug, page.slug) &&
        Objects.equals(this.titles, page.titles) &&
        Objects.equals(this.parentId, page.parentId) &&
        Objects.equals(this.meta, page.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, titles, parentId, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

