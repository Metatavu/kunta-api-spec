package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Service organization
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Service organization")

public class ServiceOrganization   {
  
  private List<LocalizedValue> additionalInformation = new ArrayList<LocalizedValue>();
  private String organizationId = null;
  private String roleType = null;
  private String provisionType = null;
  private List<WebPage> webPages = new ArrayList<WebPage>();

  /**
   * Localized list of additional information.
   **/
  public ServiceOrganization additionalInformation(List<LocalizedValue> additionalInformation) {
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
   * Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.
   **/
  public ServiceOrganization organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Role type, valid values Responsible or Producer.
   **/
  public ServiceOrganization roleType(String roleType) {
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
  public ServiceOrganization provisionType(String provisionType) {
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
   * DEPRECATED. DO NOT USE
   **/
  public ServiceOrganization webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "DEPRECATED. DO NOT USE")
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
    ServiceOrganization serviceOrganization = (ServiceOrganization) o;
    return Objects.equals(additionalInformation, serviceOrganization.additionalInformation) &&
        Objects.equals(organizationId, serviceOrganization.organizationId) &&
        Objects.equals(roleType, serviceOrganization.roleType) &&
        Objects.equals(provisionType, serviceOrganization.provisionType) &&
        Objects.equals(webPages, serviceOrganization.webPages);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
