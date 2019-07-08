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
import fi.metatavu.kuntaapi.client.model.LocalizedValue;
import fi.metatavu.kuntaapi.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Service organization
 */
@ApiModel(description = "Service organization")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T18:08:24.691+03:00")
public class ServiceOrganization   {
  @SerializedName("additionalInformation")
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("roleType")
  private String roleType = null;

  @SerializedName("provisionType")
  private String provisionType = null;

  @SerializedName("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  public ServiceOrganization additionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public ServiceOrganization addAdditionalInformationItem(LocalizedValue additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Localized list of additional information.
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "Localized list of additional information.")
  public List<LocalizedValue> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public ServiceOrganization organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public ServiceOrganization roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Role type, valid values Responsible or Producer.
   * @return roleType
  **/
  @ApiModelProperty(example = "null", value = "Role type, valid values Responsible or Producer.")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public ServiceOrganization provisionType(String provisionType) {
    this.provisionType = provisionType;
    return this;
  }

   /**
   * Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.
   * @return provisionType
  **/
  @ApiModelProperty(example = "null", value = "Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.")
  public String getProvisionType() {
    return provisionType;
  }

  public void setProvisionType(String provisionType) {
    this.provisionType = provisionType;
  }

  public ServiceOrganization webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public ServiceOrganization addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * DEPRECATED. DO NOT USE
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "DEPRECATED. DO NOT USE")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceOrganization serviceOrganization = (ServiceOrganization) o;
    return Objects.equals(this.additionalInformation, serviceOrganization.additionalInformation) &&
        Objects.equals(this.organizationId, serviceOrganization.organizationId) &&
        Objects.equals(this.roleType, serviceOrganization.roleType) &&
        Objects.equals(this.provisionType, serviceOrganization.provisionType) &&
        Objects.equals(this.webPages, serviceOrganization.webPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, organizationId, roleType, provisionType, webPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceOrganization {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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

