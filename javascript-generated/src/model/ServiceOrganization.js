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
    define(['ApiClient', 'model/LocalizedValue', 'model/WebPage'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'), require('./WebPage'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.ServiceOrganization = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.WebPage);
  }
}(this, function(ApiClient, LocalizedValue, WebPage) {
  'use strict';




  /**
   * The ServiceOrganization model module.
   * @module model/ServiceOrganization
   * @version 0.0.126
   */

  /**
   * Constructs a new <code>ServiceOrganization</code>.
   * Service organization
   * @alias module:model/ServiceOrganization
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>ServiceOrganization</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ServiceOrganization} obj Optional instance to populate.
   * @return {module:model/ServiceOrganization} The populated <code>ServiceOrganization</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('additionalInformation')) {
        obj['additionalInformation'] = ApiClient.convertToType(data['additionalInformation'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('organizationId')) {
        obj['organizationId'] = ApiClient.convertToType(data['organizationId'], 'String');
      }
      if (data.hasOwnProperty('roleType')) {
        obj['roleType'] = ApiClient.convertToType(data['roleType'], 'String');
      }
      if (data.hasOwnProperty('provisionType')) {
        obj['provisionType'] = ApiClient.convertToType(data['provisionType'], 'String');
      }
      if (data.hasOwnProperty('webPages')) {
        obj['webPages'] = ApiClient.convertToType(data['webPages'], [WebPage]);
      }
    }
    return obj;
  }

  /**
   * Localized list of additional information.
   * @member {Array.<module:model/LocalizedValue>} additionalInformation
   */
  exports.prototype['additionalInformation'] = undefined;
  /**
   * Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced.
   * @member {String} organizationId
   */
  exports.prototype['organizationId'] = undefined;
  /**
   * Role type, valid values Responsible or Producer.
   * @member {String} roleType
   */
  exports.prototype['roleType'] = undefined;
  /**
   * Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer.
   * @member {String} provisionType
   */
  exports.prototype['provisionType'] = undefined;
  /**
   * DEPRECATED. DO NOT USE
   * @member {Array.<module:model/WebPage>} webPages
   */
  exports.prototype['webPages'] = undefined;



  return exports;
}));


