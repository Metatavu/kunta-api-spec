package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.Law;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Municipality;
import fi.metatavu.kuntaapi.server.rest.model.OntologyItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Service   {
  
  private String id = null;
  private String type = null;
  private String statutoryDescriptionId = null;
  private List<OntologyItem> serviceClasses = new ArrayList<OntologyItem>();
  private List<OntologyItem> ontologyTerms = new ArrayList<OntologyItem>();
  private List<OntologyItem> targetGroups = new ArrayList<OntologyItem>();
  private List<OntologyItem> lifeEvents = new ArrayList<OntologyItem>();
  private List<OntologyItem> industrialClasses = new ArrayList<OntologyItem>();
  private List<LocalizedValue> names = new ArrayList<LocalizedValue>();
  private List<LocalizedValue> descriptions = new ArrayList<LocalizedValue>();
  private List<String> languages = new ArrayList<String>();
  private List<LocalizedValue> keywords = new ArrayList<LocalizedValue>();
  private List<Law> legislation = new ArrayList<Law>();
  private String coverageType = null;
  private List<Municipality> municipalities = new ArrayList<Municipality>();
  private List<LocalizedValue> requirements = new ArrayList<LocalizedValue>();
  private String publishingStatus = null;
  private String chargeType = null;
  private List<LocalizedValue> additionalInformations = new ArrayList<LocalizedValue>();
  private List<String> electronicServiceChannelIds = new ArrayList<String>();
  private List<String> phoneServiceChannelIds = new ArrayList<String>();
  private List<String> printableFormServiceChannelIds = new ArrayList<String>();
  private List<String> serviceLocationServiceChannelIds = new ArrayList<String>();
  private List<String> webPageServiceChannelIds = new ArrayList<String>();

  /**
   **/
  public Service id(String id) {
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
  public Service type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Service statutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getStatutoryDescriptionId() {
    return statutoryDescriptionId;
  }
  public void setStatutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
  }

  /**
   **/
  public Service serviceClasses(List<OntologyItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getServiceClasses() {
    return serviceClasses;
  }
  public void setServiceClasses(List<OntologyItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  /**
   **/
  public Service ontologyTerms(List<OntologyItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getOntologyTerms() {
    return ontologyTerms;
  }
  public void setOntologyTerms(List<OntologyItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  /**
   **/
  public Service targetGroups(List<OntologyItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getTargetGroups() {
    return targetGroups;
  }
  public void setTargetGroups(List<OntologyItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  /**
   **/
  public Service lifeEvents(List<OntologyItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getLifeEvents() {
    return lifeEvents;
  }
  public void setLifeEvents(List<OntologyItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  /**
   **/
  public Service industrialClasses(List<OntologyItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OntologyItem> getIndustrialClasses() {
    return industrialClasses;
  }
  public void setIndustrialClasses(List<OntologyItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  /**
   **/
  public Service names(List<LocalizedValue> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getNames() {
    return names;
  }
  public void setNames(List<LocalizedValue> names) {
    this.names = names;
  }

  /**
   **/
  public Service descriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedValue> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   **/
  public Service languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   * List of localized service keywords.
   **/
  public Service keywords(List<LocalizedValue> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service keywords.")
  public List<LocalizedValue> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<LocalizedValue> keywords) {
    this.keywords = keywords;
  }

  /**
   * List of laws related to the service.
   **/
  public Service legislation(List<Law> legislation) {
    this.legislation = legislation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of laws related to the service.")
  public List<Law> getLegislation() {
    return legislation;
  }
  public void setLegislation(List<Law> legislation) {
    this.legislation = legislation;
  }

  /**
   * Service coverage type. Valid values are: Local or Nationwide.
   **/
  public Service coverageType(String coverageType) {
    this.coverageType = coverageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service coverage type. Valid values are: Local or Nationwide.")
  public String getCoverageType() {
    return coverageType;
  }
  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }

  /**
   **/
  public Service municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }
  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }

  /**
   **/
  public Service requirements(List<LocalizedValue> requirements) {
    this.requirements = requirements;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getRequirements() {
    return requirements;
  }
  public void setRequirements(List<LocalizedValue> requirements) {
    this.requirements = requirements;
  }

  /**
   * Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.
   **/
  public Service publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }

  /**
   **/
  public Service chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  /**
   **/
  public Service additionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedValue> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<LocalizedValue> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  /**
   **/
  public Service electronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getElectronicServiceChannelIds() {
    return electronicServiceChannelIds;
  }
  public void setElectronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
  }

  /**
   **/
  public Service phoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPhoneServiceChannelIds() {
    return phoneServiceChannelIds;
  }
  public void setPhoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
  }

  /**
   **/
  public Service printableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPrintableFormServiceChannelIds() {
    return printableFormServiceChannelIds;
  }
  public void setPrintableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
  }

  /**
   **/
  public Service serviceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceLocationServiceChannelIds() {
    return serviceLocationServiceChannelIds;
  }
  public void setServiceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
  }

  /**
   **/
  public Service webPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getWebPageServiceChannelIds() {
    return webPageServiceChannelIds;
  }
  public void setWebPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(id, service.id) &&
        Objects.equals(type, service.type) &&
        Objects.equals(statutoryDescriptionId, service.statutoryDescriptionId) &&
        Objects.equals(serviceClasses, service.serviceClasses) &&
        Objects.equals(ontologyTerms, service.ontologyTerms) &&
        Objects.equals(targetGroups, service.targetGroups) &&
        Objects.equals(lifeEvents, service.lifeEvents) &&
        Objects.equals(industrialClasses, service.industrialClasses) &&
        Objects.equals(names, service.names) &&
        Objects.equals(descriptions, service.descriptions) &&
        Objects.equals(languages, service.languages) &&
        Objects.equals(keywords, service.keywords) &&
        Objects.equals(legislation, service.legislation) &&
        Objects.equals(coverageType, service.coverageType) &&
        Objects.equals(municipalities, service.municipalities) &&
        Objects.equals(requirements, service.requirements) &&
        Objects.equals(publishingStatus, service.publishingStatus) &&
        Objects.equals(chargeType, service.chargeType) &&
        Objects.equals(additionalInformations, service.additionalInformations) &&
        Objects.equals(electronicServiceChannelIds, service.electronicServiceChannelIds) &&
        Objects.equals(phoneServiceChannelIds, service.phoneServiceChannelIds) &&
        Objects.equals(printableFormServiceChannelIds, service.printableFormServiceChannelIds) &&
        Objects.equals(serviceLocationServiceChannelIds, service.serviceLocationServiceChannelIds) &&
        Objects.equals(webPageServiceChannelIds, service.webPageServiceChannelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, names, descriptions, languages, keywords, legislation, coverageType, municipalities, requirements, publishingStatus, chargeType, additionalInformations, electronicServiceChannelIds, phoneServiceChannelIds, printableFormServiceChannelIds, serviceLocationServiceChannelIds, webPageServiceChannelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    statutoryDescriptionId: ").append(toIndentedString(statutoryDescriptionId)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    coverageType: ").append(toIndentedString(coverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
