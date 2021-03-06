package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Banner  implements java.io.Serializable {
  
  private String id = null;
  private String title = null;
  private String contents = null;
  private String link = null;
  private String textColor = null;
  private String backgroundColor = null;

  /**
   **/
  public Banner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Banner title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public Banner contents(String contents) {
    this.contents = contents;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }

  /**
   **/
  public Banner link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public Banner textColor(String textColor) {
    this.textColor = textColor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getTextColor() {
    return textColor;
  }
  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  /**
   **/
  public Banner backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBackgroundColor() {
    return backgroundColor;
  }
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Banner banner = (Banner) o;
    return Objects.equals(id, banner.id) &&
        Objects.equals(title, banner.title) &&
        Objects.equals(contents, banner.contents) &&
        Objects.equals(link, banner.link) &&
        Objects.equals(textColor, banner.textColor) &&
        Objects.equals(backgroundColor, banner.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, contents, link, textColor, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Banner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
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
