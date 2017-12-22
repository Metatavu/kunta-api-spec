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
    define(['ApiClient', 'model/Address', 'model/Area', 'model/Email', 'model/LocalizedValue', 'model/Phone', 'model/ServiceChannelAttachment', 'model/ServiceHour', 'model/WebPage'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Address'), require('./Area'), require('./Email'), require('./LocalizedValue'), require('./Phone'), require('./ServiceChannelAttachment'), require('./ServiceHour'), require('./WebPage'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.PrintableFormServiceChannel = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.Address, root.KuntaApiClient.Area, root.KuntaApiClient.Email, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.Phone, root.KuntaApiClient.ServiceChannelAttachment, root.KuntaApiClient.ServiceHour, root.KuntaApiClient.WebPage);
  }
}(this, function(ApiClient, Address, Area, Email, LocalizedValue, Phone, ServiceChannelAttachment, ServiceHour, WebPage) {
  'use strict';




  /**
   * The PrintableFormServiceChannel model module.
   * @module model/PrintableFormServiceChannel
   * @version 0.0.136
   */

  /**
   * Constructs a new <code>PrintableFormServiceChannel</code>.
   * @alias module:model/PrintableFormServiceChannel
   * @class
   */
  var exports = function() {
    var _this = this;


















  };

  /**
   * Constructs a <code>PrintableFormServiceChannel</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PrintableFormServiceChannel} obj Optional instance to populate.
   * @return {module:model/PrintableFormServiceChannel} The populated <code>PrintableFormServiceChannel</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
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
      if (data.hasOwnProperty('formIdentifier')) {
        obj['formIdentifier'] = ApiClient.convertToType(data['formIdentifier'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('formReceiver')) {
        obj['formReceiver'] = ApiClient.convertToType(data['formReceiver'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('deliveryAddress')) {
        obj['deliveryAddress'] = Address.constructFromObject(data['deliveryAddress']);
      }
      if (data.hasOwnProperty('channelUrls')) {
        obj['channelUrls'] = ApiClient.convertToType(data['channelUrls'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('attachments')) {
        obj['attachments'] = ApiClient.convertToType(data['attachments'], [ServiceChannelAttachment]);
      }
      if (data.hasOwnProperty('supportPhones')) {
        obj['supportPhones'] = ApiClient.convertToType(data['supportPhones'], [Phone]);
      }
      if (data.hasOwnProperty('supportEmails')) {
        obj['supportEmails'] = ApiClient.convertToType(data['supportEmails'], [Email]);
      }
      if (data.hasOwnProperty('languages')) {
        obj['languages'] = ApiClient.convertToType(data['languages'], ['String']);
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
      if (data.hasOwnProperty('areaType')) {
        obj['areaType'] = ApiClient.convertToType(data['areaType'], 'String');
      }
      if (data.hasOwnProperty('areas')) {
        obj['areas'] = ApiClient.convertToType(data['areas'], [Area]);
      }
    }
    return obj;
  }

  /**
   * Identifier for the service channel.
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Organization identifier responsible for the channel.
   * @member {String} organizationId
   */
  exports.prototype['organizationId'] = undefined;
  /**
   * Localized list of service channel names.
   * @member {Array.<module:model/LocalizedValue>} names
   */
  exports.prototype['names'] = undefined;
  /**
   * List of localized service channel descriptions.
   * @member {Array.<module:model/LocalizedValue>} descriptions
   */
  exports.prototype['descriptions'] = undefined;
  /**
   * List of localized form identifier. One per language.
   * @member {Array.<module:model/LocalizedValue>} formIdentifier
   */
  exports.prototype['formIdentifier'] = undefined;
  /**
   * List of localized form receiver. One per language.
   * @member {Array.<module:model/LocalizedValue>} formReceiver
   */
  exports.prototype['formReceiver'] = undefined;
  /**
   * Form delivery address.
   * @member {module:model/Address} deliveryAddress
   */
  exports.prototype['deliveryAddress'] = undefined;
  /**
   * List of localized channel urls.
   * @member {Array.<module:model/LocalizedValue>} channelUrls
   */
  exports.prototype['channelUrls'] = undefined;
  /**
   * List of attachments.
   * @member {Array.<module:model/ServiceChannelAttachment>} attachments
   */
  exports.prototype['attachments'] = undefined;
  /**
   * List of support phone numbers for the service channel.
   * @member {Array.<module:model/Phone>} supportPhones
   */
  exports.prototype['supportPhones'] = undefined;
  /**
   * List of support email addresses for the service channel.
   * @member {Array.<module:model/Email>} supportEmails
   */
  exports.prototype['supportEmails'] = undefined;
  /**
   * List of languages the service channel is available in (two letter language code).
   * @member {Array.<String>} languages
   */
  exports.prototype['languages'] = undefined;
  /**
   * List of service channel web pages.
   * @member {Array.<module:model/WebPage>} webPages
   */
  exports.prototype['webPages'] = undefined;
  /**
   * List of service channel service hours.
   * @member {Array.<module:model/ServiceHour>} serviceHours
   */
  exports.prototype['serviceHours'] = undefined;
  /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   * @member {String} publishingStatus
   */
  exports.prototype['publishingStatus'] = undefined;
  /**
   * Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType).
   * @member {String} areaType
   */
  exports.prototype['areaType'] = undefined;
  /**
   * List of service channel areas.
   * @member {Array.<module:model/Area>} areas
   */
  exports.prototype['areas'] = undefined;



  return exports;
}));


