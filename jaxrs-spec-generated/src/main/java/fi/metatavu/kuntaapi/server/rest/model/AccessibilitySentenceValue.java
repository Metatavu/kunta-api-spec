package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Accessibility sentence.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Accessibility sentence.")

public class AccessibilitySentenceValue  implements java.io.Serializable {
  
  private List<LocalizedValue> sentence = new ArrayList<LocalizedValue>();

  /**
   * List of localized sentences.
   **/
  public AccessibilitySentenceValue sentence(List<LocalizedValue> sentence) {
    this.sentence = sentence;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized sentences.")
  public List<LocalizedValue> getSentence() {
    return sentence;
  }
  public void setSentence(List<LocalizedValue> sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessibilitySentenceValue accessibilitySentenceValue = (AccessibilitySentenceValue) o;
    return Objects.equals(sentence, accessibilitySentenceValue.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessibilitySentenceValue {\n");
    
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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
