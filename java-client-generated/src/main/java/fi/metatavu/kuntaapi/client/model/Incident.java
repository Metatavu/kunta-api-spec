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
 * Incident
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:26:32.352+02:00")
public class Incident   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("severity")
  private String severity = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("detailsLink")
  private String detailsLink = null;

  @SerializedName("detailsLinkText")
  private String detailsLinkText = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("areas")
  private List<String> areas = new ArrayList<String>();

  public Incident id(String id) {
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

  public Incident slug(String slug) {
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

  public Incident severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }

  public Incident title(String title) {
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

  public Incident description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Incident detailsLink(String detailsLink) {
    this.detailsLink = detailsLink;
    return this;
  }

   /**
   * Get detailsLink
   * @return detailsLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDetailsLink() {
    return detailsLink;
  }

  public void setDetailsLink(String detailsLink) {
    this.detailsLink = detailsLink;
  }

  public Incident detailsLinkText(String detailsLinkText) {
    this.detailsLinkText = detailsLinkText;
    return this;
  }

   /**
   * Get detailsLinkText
   * @return detailsLinkText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDetailsLinkText() {
    return detailsLinkText;
  }

  public void setDetailsLinkText(String detailsLinkText) {
    this.detailsLinkText = detailsLinkText;
  }

  public Incident start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Incident end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Incident areas(List<String> areas) {
    this.areas = areas;
    return this;
  }

  public Incident addAreasItem(String areasItem) {
    this.areas.add(areasItem);
    return this;
  }

   /**
   * Get areas
   * @return areas
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAreas() {
    return areas;
  }

  public void setAreas(List<String> areas) {
    this.areas = areas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(this.id, incident.id) &&
        Objects.equals(this.slug, incident.slug) &&
        Objects.equals(this.severity, incident.severity) &&
        Objects.equals(this.title, incident.title) &&
        Objects.equals(this.description, incident.description) &&
        Objects.equals(this.detailsLink, incident.detailsLink) &&
        Objects.equals(this.detailsLinkText, incident.detailsLinkText) &&
        Objects.equals(this.start, incident.start) &&
        Objects.equals(this.end, incident.end) &&
        Objects.equals(this.areas, incident.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, severity, title, description, detailsLink, detailsLinkText, start, end, areas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Incident {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    detailsLink: ").append(toIndentedString(detailsLink)).append("\n");
    sb.append("    detailsLinkText: ").append(toIndentedString(detailsLinkText)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
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

