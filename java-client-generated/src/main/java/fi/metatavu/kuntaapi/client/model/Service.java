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
import fi.metatavu.kuntaapi.client.model.Area;
import fi.metatavu.kuntaapi.client.model.Law;
import fi.metatavu.kuntaapi.client.model.LocalizedValue;
import fi.metatavu.kuntaapi.client.model.OntologyItem;
import fi.metatavu.kuntaapi.client.model.ServiceOrganization;
import fi.metatavu.kuntaapi.client.model.ServiceVoucher;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Service
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T18:08:24.691+03:00")
public class Service   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("statutoryDescriptionId")
  private String statutoryDescriptionId = null;

  @SerializedName("chargeType")
  private String chargeType = null;

  @SerializedName("fundingType")
  private String fundingType = null;

  @SerializedName("names")
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();

  @SerializedName("areaType")
  private String areaType = null;

  @SerializedName("areas")
  private List<Area> areas = new ArrayList<Area>();

  @SerializedName("descriptions")
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();

  @SerializedName("languages")
  private List<String> languages = new ArrayList<String>();

  @SerializedName("serviceClasses")
  private List<OntologyItem> serviceClasses = new ArrayList<OntologyItem>();

  @SerializedName("ontologyTerms")
  private List<OntologyItem> ontologyTerms = new ArrayList<OntologyItem>();

  @SerializedName("targetGroups")
  private List<OntologyItem> targetGroups = new ArrayList<OntologyItem>();

  @SerializedName("lifeEvents")
  private List<OntologyItem> lifeEvents = new ArrayList<OntologyItem>();

  @SerializedName("industrialClasses")
  private List<OntologyItem> industrialClasses = new ArrayList<OntologyItem>();

  @SerializedName("legislation")
  private List<Law> legislation = new ArrayList<Law>();

  @SerializedName("keywords")
  private List<LocalizedValue> keywords = new ArrayList<LocalizedValue>();

  @SerializedName("requirements")
  private List<LocalizedValue> requirements = new ArrayList<LocalizedValue>();

  @SerializedName("publishingStatus")
  private String publishingStatus = null;

  @SerializedName("organizations")
  private List<ServiceOrganization> organizations = new ArrayList<ServiceOrganization>();

  @SerializedName("vouchers")
  private List<ServiceVoucher> vouchers = new ArrayList<ServiceVoucher>();

  @SerializedName("electronicServiceChannelIds")
  private List<String> electronicServiceChannelIds = new ArrayList<String>();

  @SerializedName("phoneServiceChannelIds")
  private List<String> phoneServiceChannelIds = new ArrayList<String>();

  @SerializedName("printableFormServiceChannelIds")
  private List<String> printableFormServiceChannelIds = new ArrayList<String>();

  @SerializedName("serviceLocationServiceChannelIds")
  private List<String> serviceLocationServiceChannelIds = new ArrayList<String>();

  @SerializedName("webPageServiceChannelIds")
  private List<String> webPageServiceChannelIds = new ArrayList<String>();

  public Service id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Service statutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
    return this;
  }

   /**
   * Get statutoryDescriptionId
   * @return statutoryDescriptionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatutoryDescriptionId() {
    return statutoryDescriptionId;
  }

  public void setStatutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
  }

  public Service chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public Service fundingType(String fundingType) {
    this.fundingType = fundingType;
    return this;
  }

   /**
   * Service funding type. Possible values are: PubliclyFunded or MarketFunded.
   * @return fundingType
  **/
  @ApiModelProperty(example = "null", value = "Service funding type. Possible values are: PubliclyFunded or MarketFunded.")
  public String getFundingType() {
    return fundingType;
  }

  public void setFundingType(String fundingType) {
    this.fundingType = fundingType;
  }

  public Service names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  public Service addNamesItem(LocalizedValue namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }

  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  public Service areaType(String areaType) {
    this.areaType = areaType;
    return this;
  }

   /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @return areaType
  **/
  @ApiModelProperty(example = "null", value = "Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).")
  public String getAreaType() {
    return areaType;
  }

  public void setAreaType(String areaType) {
    this.areaType = areaType;
  }

  public Service areas(List<Area> areas) {
    this.areas = areas;
    return this;
  }

  public Service addAreasItem(Area areasItem) {
    this.areas.add(areasItem);
    return this;
  }

   /**
   * List of service areas.
   * @return areas
  **/
  @ApiModelProperty(example = "null", value = "List of service areas.")
  public List<Area> getAreas() {
    return areas;
  }

  public void setAreas(List<Area> areas) {
    this.areas = areas;
  }

  public Service descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public Service addDescriptionsItem(LocalizedValue descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  public Service languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Service addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public Service serviceClasses(List<OntologyItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public Service addServiceClassesItem(OntologyItem serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * Get serviceClasses
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<OntologyItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public Service ontologyTerms(List<OntologyItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public Service addOntologyTermsItem(OntologyItem ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * Get ontologyTerms
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<OntologyItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public Service targetGroups(List<OntologyItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public Service addTargetGroupsItem(OntologyItem targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Get targetGroups
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<OntologyItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public Service lifeEvents(List<OntologyItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public Service addLifeEventsItem(OntologyItem lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * Get lifeEvents
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<OntologyItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public Service industrialClasses(List<OntologyItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public Service addIndustrialClassesItem(OntologyItem industrialClassesItem) {
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * Get industrialClasses
   * @return industrialClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<OntologyItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public Service legislation(List<Law> legislation) {
    this.legislation = legislation;
    return this;
  }

  public Service addLegislationItem(Law legislationItem) {
    this.legislation.add(legislationItem);
    return this;
  }

   /**
   * List of laws related to the service.
   * @return legislation
  **/
  @ApiModelProperty(example = "null", value = "List of laws related to the service.")
  public List<Law> getLegislation() {
    return legislation;
  }

  public void setLegislation(List<Law> legislation) {
    this.legislation = legislation;
  }

  public Service keywords(List<LocalizedValue> keywords) {
    this.keywords = keywords;
    return this;
  }

  public Service addKeywordsItem(LocalizedValue keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * List of localized service keywords.
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "List of localized service keywords.")
  public List<LocalizedValue> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<LocalizedValue> keywords) {
    this.keywords = keywords;
  }

  public Service requirements(List<LocalizedValue> requirements) {
    this.requirements = requirements;
    return this;
  }

  public Service addRequirementsItem(LocalizedValue requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<LocalizedValue> requirements) {
    this.requirements = requirements;
  }

  public Service publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  public Service organizations(List<ServiceOrganization> organizations) {
    this.organizations = organizations;
    return this;
  }

  public Service addOrganizationsItem(ServiceOrganization organizationsItem) {
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Get organizations
   * @return organizations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceOrganization> getOrganizations() {
    return organizations;
  }

  public void setOrganizations(List<ServiceOrganization> organizations) {
    this.organizations = organizations;
  }

  public Service vouchers(List<ServiceVoucher> vouchers) {
    this.vouchers = vouchers;
    return this;
  }

  public Service addVouchersItem(ServiceVoucher vouchersItem) {
    this.vouchers.add(vouchersItem);
    return this;
  }

   /**
   * List of service vouchers.
   * @return vouchers
  **/
  @ApiModelProperty(example = "null", value = "List of service vouchers.")
  public List<ServiceVoucher> getVouchers() {
    return vouchers;
  }

  public void setVouchers(List<ServiceVoucher> vouchers) {
    this.vouchers = vouchers;
  }

  public Service electronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
    return this;
  }

  public Service addElectronicServiceChannelIdsItem(String electronicServiceChannelIdsItem) {
    this.electronicServiceChannelIds.add(electronicServiceChannelIdsItem);
    return this;
  }

   /**
   * Get electronicServiceChannelIds
   * @return electronicServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getElectronicServiceChannelIds() {
    return electronicServiceChannelIds;
  }

  public void setElectronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
  }

  public Service phoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
    return this;
  }

  public Service addPhoneServiceChannelIdsItem(String phoneServiceChannelIdsItem) {
    this.phoneServiceChannelIds.add(phoneServiceChannelIdsItem);
    return this;
  }

   /**
   * Get phoneServiceChannelIds
   * @return phoneServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPhoneServiceChannelIds() {
    return phoneServiceChannelIds;
  }

  public void setPhoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
  }

  public Service printableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
    return this;
  }

  public Service addPrintableFormServiceChannelIdsItem(String printableFormServiceChannelIdsItem) {
    this.printableFormServiceChannelIds.add(printableFormServiceChannelIdsItem);
    return this;
  }

   /**
   * Get printableFormServiceChannelIds
   * @return printableFormServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPrintableFormServiceChannelIds() {
    return printableFormServiceChannelIds;
  }

  public void setPrintableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
  }

  public Service serviceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
    return this;
  }

  public Service addServiceLocationServiceChannelIdsItem(String serviceLocationServiceChannelIdsItem) {
    this.serviceLocationServiceChannelIds.add(serviceLocationServiceChannelIdsItem);
    return this;
  }

   /**
   * Get serviceLocationServiceChannelIds
   * @return serviceLocationServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceLocationServiceChannelIds() {
    return serviceLocationServiceChannelIds;
  }

  public void setServiceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
  }

  public Service webPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
    return this;
  }

  public Service addWebPageServiceChannelIdsItem(String webPageServiceChannelIdsItem) {
    this.webPageServiceChannelIds.add(webPageServiceChannelIdsItem);
    return this;
  }

   /**
   * Get webPageServiceChannelIds
   * @return webPageServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getWebPageServiceChannelIds() {
    return webPageServiceChannelIds;
  }

  public void setWebPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.type, service.type) &&
        Objects.equals(this.statutoryDescriptionId, service.statutoryDescriptionId) &&
        Objects.equals(this.chargeType, service.chargeType) &&
        Objects.equals(this.fundingType, service.fundingType) &&
        Objects.equals(this.names, service.names) &&
        Objects.equals(this.areaType, service.areaType) &&
        Objects.equals(this.areas, service.areas) &&
        Objects.equals(this.descriptions, service.descriptions) &&
        Objects.equals(this.languages, service.languages) &&
        Objects.equals(this.serviceClasses, service.serviceClasses) &&
        Objects.equals(this.ontologyTerms, service.ontologyTerms) &&
        Objects.equals(this.targetGroups, service.targetGroups) &&
        Objects.equals(this.lifeEvents, service.lifeEvents) &&
        Objects.equals(this.industrialClasses, service.industrialClasses) &&
        Objects.equals(this.legislation, service.legislation) &&
        Objects.equals(this.keywords, service.keywords) &&
        Objects.equals(this.requirements, service.requirements) &&
        Objects.equals(this.publishingStatus, service.publishingStatus) &&
        Objects.equals(this.organizations, service.organizations) &&
        Objects.equals(this.vouchers, service.vouchers) &&
        Objects.equals(this.electronicServiceChannelIds, service.electronicServiceChannelIds) &&
        Objects.equals(this.phoneServiceChannelIds, service.phoneServiceChannelIds) &&
        Objects.equals(this.printableFormServiceChannelIds, service.printableFormServiceChannelIds) &&
        Objects.equals(this.serviceLocationServiceChannelIds, service.serviceLocationServiceChannelIds) &&
        Objects.equals(this.webPageServiceChannelIds, service.webPageServiceChannelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, chargeType, fundingType, names, areaType, areas, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, legislation, keywords, requirements, publishingStatus, organizations, vouchers, electronicServiceChannelIds, phoneServiceChannelIds, printableFormServiceChannelIds, serviceLocationServiceChannelIds, webPageServiceChannelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    statutoryDescriptionId: ").append(toIndentedString(statutoryDescriptionId)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    fundingType: ").append(toIndentedString(fundingType)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    areaType: ").append(toIndentedString(areaType)).append("\n");
    sb.append("    areas: ").append(toIndentedString(areas)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    vouchers: ").append(toIndentedString(vouchers)).append("\n");
    sb.append("    electronicServiceChannelIds: ").append(toIndentedString(electronicServiceChannelIds)).append("\n");
    sb.append("    phoneServiceChannelIds: ").append(toIndentedString(phoneServiceChannelIds)).append("\n");
    sb.append("    printableFormServiceChannelIds: ").append(toIndentedString(printableFormServiceChannelIds)).append("\n");
    sb.append("    serviceLocationServiceChannelIds: ").append(toIndentedString(serviceLocationServiceChannelIds)).append("\n");
    sb.append("    webPageServiceChannelIds: ").append(toIndentedString(webPageServiceChannelIds)).append("\n");
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

