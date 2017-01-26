package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class FileDef   {
  
  private String id = null;
  private String pageId = null;
  private String slug = null;
  private String title = null;
  private String contentType = null;
  private Long size = null;

  /**
   **/
  public FileDef id(String id) {
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
  public FileDef pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPageId() {
    return pageId;
  }
  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  /**
   **/
  public FileDef slug(String slug) {
    this.slug = slug;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   **/
  public FileDef title(String title) {
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
  public FileDef contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getContentType() {
    return contentType;
  }
  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  public FileDef size(Long size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDef fileDef = (FileDef) o;
    return Objects.equals(id, fileDef.id) &&
        Objects.equals(pageId, fileDef.pageId) &&
        Objects.equals(slug, fileDef.slug) &&
        Objects.equals(title, fileDef.title) &&
        Objects.equals(contentType, fileDef.contentType) &&
        Objects.equals(size, fileDef.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pageId, slug, title, contentType, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
