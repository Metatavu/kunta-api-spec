package fi.metatavu.kuntaapi.server.rest.model;

import java.time.OffsetDateTime;



import io.swagger.annotations.*;
import java.util.Objects;


public class ContactStatus  implements java.io.Serializable {
  
  private String text = null;
  private OffsetDateTime start = null;
  private OffsetDateTime end = null;

  /**
   **/
  public ContactStatus text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  public ContactStatus start(OffsetDateTime start) {
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
  public ContactStatus end(OffsetDateTime end) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactStatus contactStatus = (ContactStatus) o;
    return Objects.equals(text, contactStatus.text) &&
        Objects.equals(start, contactStatus.start) &&
        Objects.equals(end, contactStatus.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactStatus {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
