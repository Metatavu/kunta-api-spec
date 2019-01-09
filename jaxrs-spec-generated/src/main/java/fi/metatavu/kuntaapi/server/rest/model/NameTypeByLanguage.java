package fi.metatavu.kuntaapi.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * Name type by language
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Name type by language")

public class NameTypeByLanguage  implements java.io.Serializable {
  
  private String type = null;
  private String language = null;

  /**
   * DisplayNameType preferred by language code (Name or AlternateName).
   **/
  public NameTypeByLanguage type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "DisplayNameType preferred by language code (Name or AlternateName).")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Language code.
   **/
  public NameTypeByLanguage language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Language code.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameTypeByLanguage nameTypeByLanguage = (NameTypeByLanguage) o;
    return Objects.equals(type, nameTypeByLanguage.type) &&
        Objects.equals(language, nameTypeByLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameTypeByLanguage {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
