package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.AccessibilitySentenceValue;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Accessibility sentences.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Accessibility sentences.")

public class AccessibilitySentence  implements java.io.Serializable {
  
  private List<LocalizedValue> sentenceGroup = new ArrayList<LocalizedValue>();
  private List<AccessibilitySentenceValue> sentences = new ArrayList<AccessibilitySentenceValue>();

  /**
   * List of localized sentence group names.
   **/
  public AccessibilitySentence sentenceGroup(List<LocalizedValue> sentenceGroup) {
    this.sentenceGroup = sentenceGroup;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized sentence group names.")
  public List<LocalizedValue> getSentenceGroup() {
    return sentenceGroup;
  }
  public void setSentenceGroup(List<LocalizedValue> sentenceGroup) {
    this.sentenceGroup = sentenceGroup;
  }

  /**
   * List of localized sentences.
   **/
  public AccessibilitySentence sentences(List<AccessibilitySentenceValue> sentences) {
    this.sentences = sentences;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized sentences.")
  public List<AccessibilitySentenceValue> getSentences() {
    return sentences;
  }
  public void setSentences(List<AccessibilitySentenceValue> sentences) {
    this.sentences = sentences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessibilitySentence accessibilitySentence = (AccessibilitySentence) o;
    return Objects.equals(sentenceGroup, accessibilitySentence.sentenceGroup) &&
        Objects.equals(sentences, accessibilitySentence.sentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentenceGroup, sentences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessibilitySentence {\n");
    
    sb.append("    sentenceGroup: ").append(toIndentedString(sentenceGroup)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
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
