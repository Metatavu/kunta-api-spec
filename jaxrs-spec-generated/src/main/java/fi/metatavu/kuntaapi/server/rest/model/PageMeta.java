package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class PageMeta   {
  
  private Boolean hideMenuChildren = null;

  /**
   **/
  public PageMeta hideMenuChildren(Boolean hideMenuChildren) {
    this.hideMenuChildren = hideMenuChildren;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHideMenuChildren() {
    return hideMenuChildren;
  }
  public void setHideMenuChildren(Boolean hideMenuChildren) {
    this.hideMenuChildren = hideMenuChildren;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMeta pageMeta = (PageMeta) o;
    return Objects.equals(hideMenuChildren, pageMeta.hideMenuChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideMenuChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMeta {\n");
    
    sb.append("    hideMenuChildren: ").append(toIndentedString(hideMenuChildren)).append("\n");
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
