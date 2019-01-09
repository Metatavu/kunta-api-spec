package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Municipality;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Area
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Area")

public class Area  implements java.io.Serializable {
  
  private String type = null;
  private String code = null;
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();
  private List<Municipality> municipalities = new ArrayList<Municipality>();

  /**
   * Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).
   **/
  public Area type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Code of the area.
   **/
  public Area code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Code of the area.")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Localized list of names for the area
   **/
  public Area name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of names for the area")
  public List<LocalizedValue> getName() {
    return name;
  }
  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  /**
   * List of municipalities including municipality code and a localized list of municipality names.
   **/
  public Area municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of municipalities including municipality code and a localized list of municipality names.")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }
  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Area area = (Area) o;
    return Objects.equals(type, area.type) &&
        Objects.equals(code, area.code) &&
        Objects.equals(name, area.name) &&
        Objects.equals(municipalities, area.municipalities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, name, municipalities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Area {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
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
