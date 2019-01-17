package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class EnvironmentalWarning  implements java.io.Serializable {
  
  private String id = null;
  private String type = null;
  private String context = null;
  private List<LocalizedValue> description = new ArrayList<LocalizedValue>();
  private List<String> causes = new ArrayList<String>();
  private Double actualizationProbability = null;
  private OffsetDateTime start = null;
  private OffsetDateTime end = null;
  private String severity = null;

  /**
   **/
  public EnvironmentalWarning id(String id) {
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
   * Possible values   - WEATHER   - FLOOD 
   **/
  public EnvironmentalWarning type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Possible values   - WEATHER   - FLOOD ")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind 
   **/
  public EnvironmentalWarning context(String context) {
    this.context = context;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind ")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
  }

  /**
   * Description of environmental warning
   **/
  public EnvironmentalWarning description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Description of environmental warning")
  public List<LocalizedValue> getDescription() {
    return description;
  }
  public void setDescription(List<LocalizedValue> description) {
    this.description = description;
  }

  /**
   **/
  public EnvironmentalWarning causes(List<String> causes) {
    this.causes = causes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCauses() {
    return causes;
  }
  public void setCauses(List<String> causes) {
    this.causes = causes;
  }

  /**
   **/
  public EnvironmentalWarning actualizationProbability(Double actualizationProbability) {
    this.actualizationProbability = actualizationProbability;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Double getActualizationProbability() {
    return actualizationProbability;
  }
  public void setActualizationProbability(Double actualizationProbability) {
    this.actualizationProbability = actualizationProbability;
  }

  /**
   **/
  public EnvironmentalWarning start(OffsetDateTime start) {
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
  public EnvironmentalWarning end(OffsetDateTime end) {
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
   * Possible values   - level-1   - level-2   - level-3   - level-4 
   **/
  public EnvironmentalWarning severity(String severity) {
    this.severity = severity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Possible values   - level-1   - level-2   - level-3   - level-4 ")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentalWarning environmentalWarning = (EnvironmentalWarning) o;
    return Objects.equals(id, environmentalWarning.id) &&
        Objects.equals(type, environmentalWarning.type) &&
        Objects.equals(context, environmentalWarning.context) &&
        Objects.equals(description, environmentalWarning.description) &&
        Objects.equals(causes, environmentalWarning.causes) &&
        Objects.equals(actualizationProbability, environmentalWarning.actualizationProbability) &&
        Objects.equals(start, environmentalWarning.start) &&
        Objects.equals(end, environmentalWarning.end) &&
        Objects.equals(severity, environmentalWarning.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, context, description, causes, actualizationProbability, start, end, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentalWarning {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    causes: ").append(toIndentedString(causes)).append("\n");
    sb.append("    actualizationProbability: ").append(toIndentedString(actualizationProbability)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
