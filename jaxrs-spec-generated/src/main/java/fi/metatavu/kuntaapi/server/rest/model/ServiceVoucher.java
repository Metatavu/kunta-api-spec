package fi.metatavu.kuntaapi.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * Service voucher
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Service voucher")

public class ServiceVoucher  implements java.io.Serializable {
  
  private String value = null;
  private String language = null;
  private String url = null;
  private String additionalInformation = null;

  /**
   * Name of the service voucher.
   **/
  public ServiceVoucher value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Name of the service voucher.")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Language code.
   **/
  public ServiceVoucher language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Language code.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Web page url
   **/
  public ServiceVoucher url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Web page url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Service voucher additional information
   **/
  public ServiceVoucher additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service voucher additional information")
  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVoucher serviceVoucher = (ServiceVoucher) o;
    return Objects.equals(value, serviceVoucher.value) &&
        Objects.equals(language, serviceVoucher.language) &&
        Objects.equals(url, serviceVoucher.url) &&
        Objects.equals(additionalInformation, serviceVoucher.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, language, url, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceVoucher {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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
