package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class PageMeta  implements java.io.Serializable {
  
  private Boolean hideMenuChildren = null;
  private String unmappedParentId = null;
  private Boolean siteRootPage = null;

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

  /**
   **/
  public PageMeta unmappedParentId(String unmappedParentId) {
    this.unmappedParentId = unmappedParentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUnmappedParentId() {
    return unmappedParentId;
  }
  public void setUnmappedParentId(String unmappedParentId) {
    this.unmappedParentId = unmappedParentId;
  }

  /**
   **/
  public PageMeta siteRootPage(Boolean siteRootPage) {
    this.siteRootPage = siteRootPage;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSiteRootPage() {
    return siteRootPage;
  }
  public void setSiteRootPage(Boolean siteRootPage) {
    this.siteRootPage = siteRootPage;
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
    return Objects.equals(hideMenuChildren, pageMeta.hideMenuChildren) &&
        Objects.equals(unmappedParentId, pageMeta.unmappedParentId) &&
        Objects.equals(siteRootPage, pageMeta.siteRootPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideMenuChildren, unmappedParentId, siteRootPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMeta {\n");
    
    sb.append("    hideMenuChildren: ").append(toIndentedString(hideMenuChildren)).append("\n");
    sb.append("    unmappedParentId: ").append(toIndentedString(unmappedParentId)).append("\n");
    sb.append("    siteRootPage: ").append(toIndentedString(siteRootPage)).append("\n");
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
