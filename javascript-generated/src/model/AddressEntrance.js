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
    define(['ApiClient', 'model/AccessibilityContactInfo', 'model/AccessibilitySentence', 'model/Coordinates', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./AccessibilityContactInfo'), require('./AccessibilitySentence'), require('./Coordinates'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.AddressEntrance = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.AccessibilityContactInfo, root.KuntaApiClient.AccessibilitySentence, root.KuntaApiClient.Coordinates, root.KuntaApiClient.LocalizedValue);
  }
}(this, function(ApiClient, AccessibilityContactInfo, AccessibilitySentence, Coordinates, LocalizedValue) {
  'use strict';




  /**
   * The AddressEntrance model module.
   * @module model/AddressEntrance
   * @version 0.0.141
   */

  /**
   * Constructs a new <code>AddressEntrance</code>.
   * Entrance for address
   * @alias module:model/AddressEntrance
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>AddressEntrance</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AddressEntrance} obj Optional instance to populate.
   * @return {module:model/AddressEntrance} The populated <code>AddressEntrance</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('isMainEntrance')) {
        obj['isMainEntrance'] = ApiClient.convertToType(data['isMainEntrance'], 'Boolean');
      }
      if (data.hasOwnProperty('coordinates')) {
        obj['coordinates'] = Coordinates.constructFromObject(data['coordinates']);
      }
      if (data.hasOwnProperty('contactInfo')) {
        obj['contactInfo'] = AccessibilityContactInfo.constructFromObject(data['contactInfo']);
      }
      if (data.hasOwnProperty('accessibilitySentences')) {
        obj['accessibilitySentences'] = ApiClient.convertToType(data['accessibilitySentences'], [AccessibilitySentence]);
      }
    }
    return obj;
  }

  /**
   * List of localized service names.
   * @member {Array.<module:model/LocalizedValue>} name
   */
  exports.prototype['name'] = undefined;
  /**
   * Indicates if entrance is main entrance.
   * @member {Boolean} isMainEntrance
   */
  exports.prototype['isMainEntrance'] = undefined;
  /**
   * @member {module:model/Coordinates} coordinates
   */
  exports.prototype['coordinates'] = undefined;
  /**
   * @member {module:model/AccessibilityContactInfo} contactInfo
   */
  exports.prototype['contactInfo'] = undefined;
  /**
   * List of accessibility sentences.
   * @member {Array.<module:model/AccessibilitySentence>} accessibilitySentences
   */
  exports.prototype['accessibilitySentences'] = undefined;



  return exports;
}));


