/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.kuntaapi.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Service voucher
 */
@ApiModel(description = "Service voucher")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-29T11:37:35.612+02:00")
public class ServiceVoucher   {
  @SerializedName("value")
  private String value = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("additionalInformation")
  private String additionalInformation = null;

  public ServiceVoucher value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Name of the service voucher.
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "Name of the service voucher.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ServiceVoucher language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language code.
   * @return language
  **/
  @ApiModelProperty(example = "null", required = true, value = "Language code.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ServiceVoucher url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Web page url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "Web page url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ServiceVoucher additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Service voucher additional information
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "Service voucher additional information")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceVoucher serviceVoucher = (ServiceVoucher) o;
    return Objects.equals(this.value, serviceVoucher.value) &&
        Objects.equals(this.language, serviceVoucher.language) &&
        Objects.equals(this.url, serviceVoucher.url) &&
        Objects.equals(this.additionalInformation, serviceVoucher.additionalInformation);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

