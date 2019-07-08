package fi.metatavu.kuntaapi.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * Accessibility contact info
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Accessibility contact info")

public class AccessibilityContactInfo  implements java.io.Serializable {
  
  private String phone = null;
  private String email = null;
  private String url = null;

  /**
   * Phone
   **/
  public AccessibilityContactInfo phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * Email
   **/
  public AccessibilityContactInfo email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Url
   **/
  public AccessibilityContactInfo url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessibilityContactInfo accessibilityContactInfo = (AccessibilityContactInfo) o;
    return Objects.equals(phone, accessibilityContactInfo.phone) &&
        Objects.equals(email, accessibilityContactInfo.email) &&
        Objects.equals(url, accessibilityContactInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phone, email, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessibilityContactInfo {\n");
    
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
