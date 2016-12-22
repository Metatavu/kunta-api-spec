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
    define(['ApiClient', 'model/LocalizedValue', 'model/ServiceChannelAttachment', 'model/ServiceHour', 'model/SupportContact', 'model/WebPage'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'), require('./ServiceChannelAttachment'), require('./ServiceHour'), require('./SupportContact'), require('./WebPage'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.ElectronicChannel = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.ServiceChannelAttachment, root.KuntaApiClient.ServiceHour, root.KuntaApiClient.SupportContact, root.KuntaApiClient.WebPage);
  }
}(this, function(ApiClient, LocalizedValue, ServiceChannelAttachment, ServiceHour, SupportContact, WebPage) {
  'use strict';




  /**
   * The ElectronicChannel model module.
   * @module model/ElectronicChannel
   * @version 0.0.33
   */

  /**
   * Constructs a new <code>ElectronicChannel</code>.
   * @alias module:model/ElectronicChannel
   * @class
   */
  var exports = function() {
    var _this = this;
















  };

  /**
   * Constructs a <code>ElectronicChannel</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ElectronicChannel} obj Optional instance to populate.
   * @return {module:model/ElectronicChannel} The populated <code>ElectronicChannel</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('organizationId')) {
        obj['organizationId'] = ApiClient.convertToType(data['organizationId'], 'String');
      }
      if (data.hasOwnProperty('names')) {
        obj['names'] = ApiClient.convertToType(data['names'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('descriptions')) {
        obj['descriptions'] = ApiClient.convertToType(data['descriptions'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('signatureQuantity')) {
        obj['signatureQuantity'] = ApiClient.convertToType(data['signatureQuantity'], 'Integer');
      }
      if (data.hasOwnProperty('requiresSignature')) {
        obj['requiresSignature'] = ApiClient.convertToType(data['requiresSignature'], 'Boolean');
      }
      if (data.hasOwnProperty('supportContacts')) {
        obj['supportContacts'] = ApiClient.convertToType(data['supportContacts'], [SupportContact]);
      }
      if (data.hasOwnProperty('requiresAuthentication')) {
        obj['requiresAuthentication'] = ApiClient.convertToType(data['requiresAuthentication'], 'Boolean');
      }
      if (data.hasOwnProperty('urls')) {
        obj['urls'] = ApiClient.convertToType(data['urls'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('languages')) {
        obj['languages'] = ApiClient.convertToType(data['languages'], ['String']);
      }
      if (data.hasOwnProperty('attachments')) {
        obj['attachments'] = ApiClient.convertToType(data['attachments'], [ServiceChannelAttachment]);
      }
      if (data.hasOwnProperty('webPages')) {
        obj['webPages'] = ApiClient.convertToType(data['webPages'], [WebPage]);
      }
      if (data.hasOwnProperty('serviceHours')) {
        obj['serviceHours'] = ApiClient.convertToType(data['serviceHours'], [ServiceHour]);
      }
      if (data.hasOwnProperty('publishingStatus')) {
        obj['publishingStatus'] = ApiClient.convertToType(data['publishingStatus'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} organizationId
   */
  exports.prototype['organizationId'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} names
   */
  exports.prototype['names'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} descriptions
   */
  exports.prototype['descriptions'] = undefined;
  /**
   * @member {Integer} signatureQuantity
   */
  exports.prototype['signatureQuantity'] = undefined;
  /**
   * @member {Boolean} requiresSignature
   */
  exports.prototype['requiresSignature'] = undefined;
  /**
   * @member {Array.<module:model/SupportContact>} supportContacts
   */
  exports.prototype['supportContacts'] = undefined;
  /**
   * @member {Boolean} requiresAuthentication
   */
  exports.prototype['requiresAuthentication'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} urls
   */
  exports.prototype['urls'] = undefined;
  /**
   * @member {Array.<String>} languages
   */
  exports.prototype['languages'] = undefined;
  /**
   * @member {Array.<module:model/ServiceChannelAttachment>} attachments
   */
  exports.prototype['attachments'] = undefined;
  /**
   * @member {Array.<module:model/WebPage>} webPages
   */
  exports.prototype['webPages'] = undefined;
  /**
   * @member {Array.<module:model/ServiceHour>} serviceHours
   */
  exports.prototype['serviceHours'] = undefined;
  /**
   * @member {String} publishingStatus
   */
  exports.prototype['publishingStatus'] = undefined;



  return exports;
}));


