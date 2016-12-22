package fi.metatavu.kuntaapi.server.rest.model;

import java.time.OffsetDateTime;



import io.swagger.annotations.*;
import java.util.Objects;


public class Job   {
  
  private String id = null;
  private String title = null;
  private String employmentType = null;
  private String description = null;
  private String location = null;
  private String organisationalUnit = null;
  private String duration = null;
  private String taskArea = null;
  private OffsetDateTime publicationStart = null;
  private OffsetDateTime publicationEnd = null;
  private String link = null;

  /**
   **/
  public Job id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Job title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Job employmentType(String employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEmploymentType() {
    return employmentType;
  }
  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  /**
   **/
  public Job description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public Job location(String location) {
    this.location = location;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }

  /**
   **/
  public Job organisationalUnit(String organisationalUnit) {
    this.organisationalUnit = organisationalUnit;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOrganisationalUnit() {
    return organisationalUnit;
  }
  public void setOrganisationalUnit(String organisationalUnit) {
    this.organisationalUnit = organisationalUnit;
  }

  /**
   **/
  public Job duration(String duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDuration() {
    return duration;
  }
  public void setDuration(String duration) {
    this.duration = duration;
  }

  /**
   **/
  public Job taskArea(String taskArea) {
    this.taskArea = taskArea;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTaskArea() {
    return taskArea;
  }
  public void setTaskArea(String taskArea) {
    this.taskArea = taskArea;
  }

  /**
   **/
  public Job publicationStart(OffsetDateTime publicationStart) {
    this.publicationStart = publicationStart;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPublicationStart() {
    return publicationStart;
  }
  public void setPublicationStart(OffsetDateTime publicationStart) {
    this.publicationStart = publicationStart;
  }

  /**
   **/
  public Job publicationEnd(OffsetDateTime publicationEnd) {
    this.publicationEnd = publicationEnd;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getPublicationEnd() {
    return publicationEnd;
  }
  public void setPublicationEnd(OffsetDateTime publicationEnd) {
    this.publicationEnd = publicationEnd;
  }

  /**
   **/
  public Job link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(id, job.id) &&
        Objects.equals(title, job.title) &&
        Objects.equals(employmentType, job.employmentType) &&
        Objects.equals(description, job.description) &&
        Objects.equals(location, job.location) &&
        Objects.equals(organisationalUnit, job.organisationalUnit) &&
        Objects.equals(duration, job.duration) &&
        Objects.equals(taskArea, job.taskArea) &&
        Objects.equals(publicationStart, job.publicationStart) &&
        Objects.equals(publicationEnd, job.publicationEnd) &&
        Objects.equals(link, job.link);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
