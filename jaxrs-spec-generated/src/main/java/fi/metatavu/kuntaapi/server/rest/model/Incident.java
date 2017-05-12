package fi.metatavu.kuntaapi.server.rest.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Incident   {
  
  private String id = null;
  private String slug = null;
  private String severity = null;
  private String title = null;
  private String description = null;
  private OffsetDateTime start = null;
  private OffsetDateTime end = null;
  private List<String> areas = new ArrayList<String>();

  /**
   **/
  public Incident id(String id) {
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
  public Incident slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  public Incident severity(String severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  /**
   **/
  public Incident title(String title) {
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
  public Incident description(String description) {
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
  public Incident start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getStart() {
    return start;
  }
  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /**
   **/
  public Incident end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getEnd() {
    return end;
  }
  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  /**
   **/
  public Incident areas(List<String> areas) {
    this.areas = areas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAreas() {
    return areas;
  }
  public void setAreas(List<String> areas) {
    this.areas = areas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Incident incident = (Incident) o;
    return Objects.equals(id, incident.id) &&
        Objects.equals(slug, incident.slug) &&
        Objects.equals(severity, incident.severity) &&
        Objects.equals(title, incident.title) &&
        Objects.equals(description, incident.description) &&
        Objects.equals(start, incident.start) &&
        Objects.equals(end, incident.end) &&
        Objects.equals(areas, incident.areas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, slug, severity, title, description, start, end, areas);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
