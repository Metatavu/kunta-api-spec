package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Organization service
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Organization service")

public class OrganizationService  implements java.io.Serializable {
  
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();
  private String serviceId = null;
  private String organizationId = null;
  private String roleType = null;
  private String provisionType = null;
  private List<WebPage> webPages = new ArrayList<WebPage>();

  /**
   * Localized list of additional information.
   **/
  public OrganizationService additionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of additional information.")
  public List<LocalizedValue> getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(List<LocalizedValue> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   * Service identifier.
   **/
  public OrganizationService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service identifier.")
  public String getServiceId() {
    return serviceId;
  }
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   * Organization identifier (organization related to the service).
   **/
  public OrganizationService organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization identifier (organization related to the service).")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Role type, valid values Responsible or Producer.
   **/
  public OrganizationService roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Role type, valid values Responsible or Producer.")
  public String getRoleType() {
    return roleType;
  }
  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  /**
   * Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.
   **/
  public OrganizationService provisionType(String provisionType) {
    this.provisionType = provisionType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.")
  public String getProvisionType() {
    return provisionType;
  }
  public void setProvisionType(String provisionType) {
    this.provisionType = provisionType;
  }

  /**
   * List of web pages.
   **/
  public OrganizationService webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationService organizationService = (OrganizationService) o;
    return Objects.equals(additionalInformation, organizationService.additionalInformation) &&
        Objects.equals(serviceId, organizationService.serviceId) &&
        Objects.equals(organizationId, organizationService.organizationId) &&
        Objects.equals(roleType, organizationService.roleType) &&
        Objects.equals(provisionType, organizationService.provisionType) &&
        Objects.equals(webPages, organizationService.webPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, serviceId, organizationId, roleType, provisionType, webPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationService {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
