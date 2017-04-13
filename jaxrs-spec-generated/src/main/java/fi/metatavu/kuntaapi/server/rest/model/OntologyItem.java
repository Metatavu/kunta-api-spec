package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class OntologyItem   {
  
  private String system = null;
  private List<LocalizedValue> name = new ArrayList<LocalizedValue>();
  private String code = null;
  private String ontologyType = null;
  private String uri = null;
  private String parentId = null;
  private String parentUri = null;

  /**
   **/
  public OntologyItem system(String system) {
    this.system = system;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSystem() {
    return system;
  }
  public void setSystem(String system) {
    this.system = system;
  }

  /**
   **/
  public OntologyItem name(List<LocalizedValue> name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getName() {
    return name;
  }
  public void setName(List<LocalizedValue> name) {
    this.name = name;
  }

  /**
   **/
  public OntologyItem code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public OntologyItem ontologyType(String ontologyType) {
    this.ontologyType = ontologyType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOntologyType() {
    return ontologyType;
  }
  public void setOntologyType(String ontologyType) {
    this.ontologyType = ontologyType;
  }

  /**
   **/
  public OntologyItem uri(String uri) {
    this.uri = uri;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   **/
  public OntologyItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public OntologyItem parentUri(String parentUri) {
    this.parentUri = parentUri;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getParentUri() {
    return parentUri;
  }
  public void setParentUri(String parentUri) {
    this.parentUri = parentUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OntologyItem ontologyItem = (OntologyItem) o;
    return Objects.equals(system, ontologyItem.system) &&
        Objects.equals(name, ontologyItem.name) &&
        Objects.equals(code, ontologyItem.code) &&
        Objects.equals(ontologyType, ontologyItem.ontologyType) &&
        Objects.equals(uri, ontologyItem.uri) &&
        Objects.equals(parentId, ontologyItem.parentId) &&
        Objects.equals(parentUri, ontologyItem.parentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, name, code, ontologyType, uri, parentId, parentUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyItem {\n");
    
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ontologyType: ").append(toIndentedString(ontologyType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
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
