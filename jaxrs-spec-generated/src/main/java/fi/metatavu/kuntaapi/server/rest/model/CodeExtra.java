package fi.metatavu.kuntaapi.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * Extra field for Code
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Extra field for Code")

public class CodeExtra   {
  
  private String key = null;
  private String value = null;

  /**
   **/
  public CodeExtra key(String key) {
    this.key = key;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  /**
   **/
  public CodeExtra value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CodeExtra codeExtra = (CodeExtra) o;
    return Objects.equals(key, codeExtra.key) &&
        Objects.equals(value, codeExtra.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeExtra {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
