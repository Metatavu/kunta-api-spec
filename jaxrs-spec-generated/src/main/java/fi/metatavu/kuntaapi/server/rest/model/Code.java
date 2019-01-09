package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.CodeExtra;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Generic code item describing code / name pair (e.g. LanguageCode, MunicipalityCode, etc...)
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Generic code item describing code / name pair (e.g. LanguageCode, MunicipalityCode, etc...)")

public class Code  implements java.io.Serializable {
  
  private String id = null;
  private String type = null;
  private String code = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<CodeExtra> extra = new ArrayList<CodeExtra>();

  /**
   * Kunta API id for code
   **/
  public Code id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Kunta API id for code")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Type of the code. Value must be one of MUNICIPALITY, PROVINCE, HOSPITALREGIONS, BUSINESSREGIONS, COUNTRY, LANGUAGE, POSTAL
   **/
  public Code type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of the code. Value must be one of MUNICIPALITY, PROVINCE, HOSPITALREGIONS, BUSINESSREGIONS, COUNTRY, LANGUAGE, POSTAL")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Code
   **/
  public Code code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Names
   **/
  public Code names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Names")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  /**
   * Names
   **/
  public Code extra(List<CodeExtra> extra) {
    this.extra = extra;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Names")
  public List<CodeExtra> getExtra() {
    return extra;
  }
  public void setExtra(List<CodeExtra> extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Code code = (Code) o;
    return Objects.equals(id, code.id) &&
        Objects.equals(type, code.type) &&
        Objects.equals(code, code.code) &&
        Objects.equals(names, code.names) &&
        Objects.equals(extra, code.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, code, names, extra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Code {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
