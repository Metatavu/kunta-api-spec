package fi.metatavu.kuntaapi.server.rest.model;

import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.OntologyItem;
import fi.metatavu.kuntaapi.server.rest.model.WebPage;
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
  private List<String> keywords = new ArrayList<String>();
  private String coverageType = null;
  private List<String> municipalities = new ArrayList<String>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<LocalizedValue> requirements = new ArrayList<LocalizedValue>();
  private String publishingStatus = null;
  private String chargeType = null;
  private List<LocalizedValue> additionalInformations = new ArrayList<LocalizedValue>();

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
   **/
  public Service keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public Service coverageType(String coverageType) {
    this.coverageType = coverageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCoverageType() {
    return coverageType;
  }
  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }

  /**
   **/
  public Service municipalities(List<String> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getMunicipalities() {
    return municipalities;
  }
  public void setMunicipalities(List<String> municipalities) {
    this.municipalities = municipalities;
  }

  /**
   **/
  public Service webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
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
   **/
  public Service publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
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
        Objects.equals(coverageType, service.coverageType) &&
        Objects.equals(municipalities, service.municipalities) &&
        Objects.equals(webPages, service.webPages) &&
        Objects.equals(requirements, service.requirements) &&
        Objects.equals(publishingStatus, service.publishingStatus) &&
        Objects.equals(chargeType, service.chargeType) &&
        Objects.equals(additionalInformations, service.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, names, descriptions, languages, keywords, coverageType, municipalities, webPages, requirements, publishingStatus, chargeType, additionalInformations);
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
    sb.append("    coverageType: ").append(toIndentedString(coverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
