package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Municipality   {
  
  private String code = null;
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  /**
   * Municipality code (like 491 or 091).
   **/
  public Municipality code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Municipality code (like 491 or 091).")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public Municipality names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Municipality municipality = (Municipality) o;
    return Objects.equals(code, municipality.code) &&
        Objects.equals(names, municipality.names);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Municipality {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
