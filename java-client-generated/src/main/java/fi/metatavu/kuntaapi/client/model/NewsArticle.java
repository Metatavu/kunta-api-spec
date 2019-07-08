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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * NewsArticle
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T18:08:24.691+03:00")
public class NewsArticle   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("abstract")
  private String _abstract = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("contents")
  private String contents = null;

  @SerializedName("published")
  private OffsetDateTime published = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  public NewsArticle id(String id) {
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

  public NewsArticle title(String title) {
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

  public NewsArticle _abstract(String _abstract) {
    this._abstract = _abstract;
    return this;
  }

   /**
   * Get _abstract
   * @return _abstract
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAbstract() {
    return _abstract;
  }

  public void setAbstract(String _abstract) {
    this._abstract = _abstract;
  }

  public NewsArticle slug(String slug) {
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

  public NewsArticle contents(String contents) {
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public NewsArticle published(OffsetDateTime published) {
    this.published = published;
    return this;
  }

   /**
   * Get published
   * @return published
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPublished() {
    return published;
  }

  public void setPublished(OffsetDateTime published) {
    this.published = published;
  }

  public NewsArticle tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public NewsArticle addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsArticle newsArticle = (NewsArticle) o;
    return Objects.equals(this.id, newsArticle.id) &&
        Objects.equals(this.title, newsArticle.title) &&
        Objects.equals(this._abstract, newsArticle._abstract) &&
        Objects.equals(this.slug, newsArticle.slug) &&
        Objects.equals(this.contents, newsArticle.contents) &&
        Objects.equals(this.published, newsArticle.published) &&
        Objects.equals(this.tags, newsArticle.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, _abstract, slug, contents, published, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsArticle {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    _abstract: ").append(toIndentedString(_abstract)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

