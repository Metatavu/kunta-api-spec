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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Address', 'model/Area', 'model/Email', 'model/LocalizedValue', 'model/Municipality', 'model/NameTypeByLanguage', 'model/OrganizationService', 'model/Phone', 'model/WebPage'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Address'), require('./Area'), require('./Email'), require('./LocalizedValue'), require('./Municipality'), require('./NameTypeByLanguage'), require('./OrganizationService'), require('./Phone'), require('./WebPage'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Organization = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.Address, root.KuntaApiClient.Area, root.KuntaApiClient.Email, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.Municipality, root.KuntaApiClient.NameTypeByLanguage, root.KuntaApiClient.OrganizationService, root.KuntaApiClient.Phone, root.KuntaApiClient.WebPage);
  }
}(this, function(ApiClient, Address, Area, Email, LocalizedValue, Municipality, NameTypeByLanguage, OrganizationService, Phone, WebPage) {
  'use strict';




  /**
   * The Organization model module.
   * @module model/Organization
   * @version 0.0.141
   */

  /**
   * Constructs a new <code>Organization</code>.
   * Organization
   * @alias module:model/Organization
   * @class
   */
  var exports = function() {
    var _this = this;


















  };

  /**
   * Constructs a <code>Organization</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Organization} obj Optional instance to populate.
   * @return {module:model/Organization} The populated <code>Organization</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('parentOrganization')) {
        obj['parentOrganization'] = ApiClient.convertToType(data['parentOrganization'], 'String');
      }
      if (data.hasOwnProperty('organizationType')) {
        obj['organizationType'] = ApiClient.convertToType(data['organizationType'], 'String');
      }
      if (data.hasOwnProperty('municipality')) {
        obj['municipality'] = Municipality.constructFromObject(data['municipality']);
      }
      if (data.hasOwnProperty('businessCode')) {
        obj['businessCode'] = ApiClient.convertToType(data['businessCode'], 'String');
      }
      if (data.hasOwnProperty('businessName')) {
        obj['businessName'] = ApiClient.convertToType(data['businessName'], 'String');
      }
      if (data.hasOwnProperty('names')) {
        obj['names'] = ApiClient.convertToType(data['names'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('displayNameType')) {
        obj['displayNameType'] = ApiClient.convertToType(data['displayNameType'], [NameTypeByLanguage]);
      }
      if (data.hasOwnProperty('areaType')) {
        obj['areaType'] = ApiClient.convertToType(data['areaType'], 'String');
      }
      if (data.hasOwnProperty('areas')) {
        obj['areas'] = ApiClient.convertToType(data['areas'], [Area]);
      }
      if (data.hasOwnProperty('descriptions')) {
        obj['descriptions'] = ApiClient.convertToType(data['descriptions'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('emailAddresses')) {
        obj['emailAddresses'] = ApiClient.convertToType(data['emailAddresses'], [Email]);
      }
      if (data.hasOwnProperty('phoneNumbers')) {
        obj['phoneNumbers'] = ApiClient.convertToType(data['phoneNumbers'], [Phone]);
      }
      if (data.hasOwnProperty('webPages')) {
        obj['webPages'] = ApiClient.convertToType(data['webPages'], [WebPage]);
      }
      if (data.hasOwnProperty('addresses')) {
        obj['addresses'] = ApiClient.convertToType(data['addresses'], [Address]);
      }
      if (data.hasOwnProperty('publishingStatus')) {
        obj['publishingStatus'] = ApiClient.convertToType(data['publishingStatus'], 'String');
      }
      if (data.hasOwnProperty('services')) {
        obj['services'] = ApiClient.convertToType(data['services'], [OrganizationService]);
      }
    }
    return obj;
  }

  /**
   * Entity identifier.
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Organizations parent organization identifier if exists.
   * @member {String} parentOrganization
   */
  exports.prototype['parentOrganization'] = undefined;
  /**
   * Organization type (State, Municipality, RegionalOrganization, Organization, Company).
   * @member {String} organizationType
   */
  exports.prototype['organizationType'] = undefined;
  /**
   * Municipality including municipality code and a localized list of municipality names.
   * @member {module:model/Municipality} municipality
   */
  exports.prototype['municipality'] = undefined;
  /**
   * Organization business code (Y-tunnus).
   * @member {String} businessCode
   */
  exports.prototype['businessCode'] = undefined;
  /**
   * Organization business name (name used for business code).
   * @member {String} businessName
   */
  exports.prototype['businessName'] = undefined;
  /**
   * List of organization names.
   * @member {Array.<module:model/LocalizedValue>} names
   */
  exports.prototype['names'] = undefined;
  /**
   * List of Display name types (Name or AlternateName) for each language version of OrganizationNames.
   * @member {Array.<module:model/NameTypeByLanguage>} displayNameType
   */
  exports.prototype['displayNameType'] = undefined;
  /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @member {String} areaType
   */
  exports.prototype['areaType'] = undefined;
  /**
   * List of organization areas.
   * @member {Array.<module:model/Area>} areas
   */
  exports.prototype['areas'] = undefined;
  /**
   * List of organizations descriptions.
   * @member {Array.<module:model/LocalizedValue>} descriptions
   */
  exports.prototype['descriptions'] = undefined;
  /**
   * List of organizations email addresses.
   * @member {Array.<module:model/Email>} emailAddresses
   */
  exports.prototype['emailAddresses'] = undefined;
  /**
   * List of organizations phone numbers.
   * @member {Array.<module:model/Phone>} phoneNumbers
   */
  exports.prototype['phoneNumbers'] = undefined;
  /**
   * List of organizations web pages.
   * @member {Array.<module:model/WebPage>} webPages
   */
  exports.prototype['webPages'] = undefined;
  /**
   * List of organizations addresses.
   * @member {Array.<module:model/Address>} addresses
   */
  exports.prototype['addresses'] = undefined;
  /**
   * Publishing status (Draft, Published, Deleted, Modified and OldPublished).
   * @member {String} publishingStatus
   */
  exports.prototype['publishingStatus'] = undefined;
  /**
   * List of organizations services.
   * @member {Array.<module:model/OrganizationService>} services
   */
  exports.prototype['services'] = undefined;



  return exports;
}));


