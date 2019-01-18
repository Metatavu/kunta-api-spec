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


/**
 * Job
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-18T06:46:40.585+02:00")
public class Job   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("employmentType")
  private String employmentType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("organisationalUnit")
  private String organisationalUnit = null;

  @SerializedName("duration")
  private String duration = null;

  @SerializedName("taskArea")
  private String taskArea = null;

  @SerializedName("publicationStart")
  private OffsetDateTime publicationStart = null;

  @SerializedName("publicationEnd")
  private OffsetDateTime publicationEnd = null;

  @SerializedName("link")
  private String link = null;

  public Job id(String id) {
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

  public Job title(String title) {
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

  public Job employmentType(String employmentType) {
    this.employmentType = employmentType;
    return this;
  }

   /**
   * Get employmentType
   * @return employmentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  public Job description(String description) {
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

  public Job location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Job organisationalUnit(String organisationalUnit) {
    this.organisationalUnit = organisationalUnit;
    return this;
  }

   /**
   * Get organisationalUnit
   * @return organisationalUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganisationalUnit() {
    return organisationalUnit;
  }

  public void setOrganisationalUnit(String organisationalUnit) {
    this.organisationalUnit = organisationalUnit;
  }

  public Job duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public Job taskArea(String taskArea) {
    this.taskArea = taskArea;
    return this;
  }

   /**
   * Get taskArea
   * @return taskArea
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTaskArea() {
    return taskArea;
  }

  public void setTaskArea(String taskArea) {
    this.taskArea = taskArea;
  }

  public Job publicationStart(OffsetDateTime publicationStart) {
    this.publicationStart = publicationStart;
    return this;
  }

   /**
   * Get publicationStart
   * @return publicationStart
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPublicationStart() {
    return publicationStart;
  }

  public void setPublicationStart(OffsetDateTime publicationStart) {
    this.publicationStart = publicationStart;
  }

  public Job publicationEnd(OffsetDateTime publicationEnd) {
    this.publicationEnd = publicationEnd;
    return this;
  }

   /**
   * Get publicationEnd
   * @return publicationEnd
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPublicationEnd() {
    return publicationEnd;
  }

  public void setPublicationEnd(OffsetDateTime publicationEnd) {
    this.publicationEnd = publicationEnd;
  }

  public Job link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.title, job.title) &&
        Objects.equals(this.employmentType, job.employmentType) &&
        Objects.equals(this.description, job.description) &&
        Objects.equals(this.location, job.location) &&
        Objects.equals(this.organisationalUnit, job.organisationalUnit) &&
        Objects.equals(this.duration, job.duration) &&
        Objects.equals(this.taskArea, job.taskArea) &&
        Objects.equals(this.publicationStart, job.publicationStart) &&
        Objects.equals(this.publicationEnd, job.publicationEnd) &&
        Objects.equals(this.link, job.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, employmentType, description, location, organisationalUnit, duration, taskArea, publicationStart, publicationEnd, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    organisationalUnit: ").append(toIndentedString(organisationalUnit)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    taskArea: ").append(toIndentedString(taskArea)).append("\n");
    sb.append("    publicationStart: ").append(toIndentedString(publicationStart)).append("\n");
    sb.append("    publicationEnd: ").append(toIndentedString(publicationEnd)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

