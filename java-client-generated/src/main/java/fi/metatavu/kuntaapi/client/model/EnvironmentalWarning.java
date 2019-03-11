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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * EnvironmentalWarning
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-11T07:41:30.697+02:00")
public class EnvironmentalWarning   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("description")
  private List<LocalizedValue> description = new ArrayList<LocalizedValue>();

  @SerializedName("causes")
  private List<String> causes = new ArrayList<String>();

  @SerializedName("actualizationProbability")
  private Double actualizationProbability = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("severity")
  private String severity = null;

  public EnvironmentalWarning id(String id) {
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

  public EnvironmentalWarning type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Possible values   - WEATHER   - FLOOD 
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Possible values   - WEATHER   - FLOOD ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EnvironmentalWarning context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind 
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind ")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public EnvironmentalWarning description(List<LocalizedValue> description) {
    this.description = description;
    return this;
  }

  public EnvironmentalWarning addDescriptionItem(LocalizedValue descriptionItem) {
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * Description of environmental warning
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Description of environmental warning")
  public List<LocalizedValue> getDescription() {
    return description;
  }

  public void setDescription(List<LocalizedValue> description) {
    this.description = description;
  }

  public EnvironmentalWarning causes(List<String> causes) {
    this.causes = causes;
    return this;
  }

  public EnvironmentalWarning addCausesItem(String causesItem) {
    this.causes.add(causesItem);
    return this;
  }

   /**
   * Get causes
   * @return causes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getCauses() {
    return causes;
  }

  public void setCauses(List<String> causes) {
    this.causes = causes;
  }

  public EnvironmentalWarning actualizationProbability(Double actualizationProbability) {
    this.actualizationProbability = actualizationProbability;
    return this;
  }

   /**
   * Get actualizationProbability
   * @return actualizationProbability
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getActualizationProbability() {
    return actualizationProbability;
  }

  public void setActualizationProbability(Double actualizationProbability) {
    this.actualizationProbability = actualizationProbability;
  }

  public EnvironmentalWarning start(OffsetDateTime start) {
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

  public EnvironmentalWarning end(OffsetDateTime end) {
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

  public EnvironmentalWarning severity(String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * Possible values   - level-1   - level-2   - level-3   - level-4 
   * @return severity
  **/
  @ApiModelProperty(example = "null", value = "Possible values   - level-1   - level-2   - level-3   - level-4 ")
  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnvironmentalWarning environmentalWarning = (EnvironmentalWarning) o;
    return Objects.equals(this.id, environmentalWarning.id) &&
        Objects.equals(this.type, environmentalWarning.type) &&
        Objects.equals(this.context, environmentalWarning.context) &&
        Objects.equals(this.description, environmentalWarning.description) &&
        Objects.equals(this.causes, environmentalWarning.causes) &&
        Objects.equals(this.actualizationProbability, environmentalWarning.actualizationProbability) &&
        Objects.equals(this.start, environmentalWarning.start) &&
        Objects.equals(this.end, environmentalWarning.end) &&
        Objects.equals(this.severity, environmentalWarning.severity);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

