package fi.metatavu.kuntaapi.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class Phone  implements java.io.Serializable {
  
  private String additionalInformation = null;
  private String serviceChargeType = null;
  private String chargeDescription = null;
  private String prefixNumber = null;
  private Boolean isFinnishServiceNumber = null;
  private String number = null;
  private String language = null;
  private String type = null;

  /**
   **/
  public Phone additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   **/
  public Phone serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChargeType() {
    return serviceChargeType;
  }
  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  /**
   **/
  public Phone chargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getChargeDescription() {
    return chargeDescription;
  }
  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }

  /**
   **/
  public Phone prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPrefixNumber() {
    return prefixNumber;
  }
  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  /**
   **/
  public Phone isFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsFinnishServiceNumber() {
    return isFinnishServiceNumber;
  }
  public void setIsFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
  }

  /**
   **/
  public Phone number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   **/
  public Phone language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public Phone type(String type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(additionalInformation, phone.additionalInformation) &&
        Objects.equals(serviceChargeType, phone.serviceChargeType) &&
        Objects.equals(chargeDescription, phone.chargeDescription) &&
        Objects.equals(prefixNumber, phone.prefixNumber) &&
        Objects.equals(isFinnishServiceNumber, phone.isFinnishServiceNumber) &&
        Objects.equals(number, phone.number) &&
        Objects.equals(language, phone.language) &&
        Objects.equals(type, phone.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, serviceChargeType, chargeDescription, prefixNumber, isFinnishServiceNumber, number, language, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    isFinnishServiceNumber: ").append(toIndentedString(isFinnishServiceNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
