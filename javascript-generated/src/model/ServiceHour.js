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
    define(['ApiClient', 'model/DailyOpeningTime', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./DailyOpeningTime'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.ServiceHour = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.DailyOpeningTime, root.KuntaApiClient.LocalizedValue);
  }
}(this, function(ApiClient, DailyOpeningTime, LocalizedValue) {
  'use strict';




  /**
   * The ServiceHour model module.
   * @module model/ServiceHour
   * @version 0.0.125
   */

  /**
   * Constructs a new <code>ServiceHour</code>.
   * @alias module:model/ServiceHour
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>ServiceHour</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ServiceHour} obj Optional instance to populate.
   * @return {module:model/ServiceHour} The populated <code>ServiceHour</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('serviceHourType')) {
        obj['serviceHourType'] = ApiClient.convertToType(data['serviceHourType'], 'String');
      }
      if (data.hasOwnProperty('validFrom')) {
        obj['validFrom'] = ApiClient.convertToType(data['validFrom'], 'Date');
      }
      if (data.hasOwnProperty('validTo')) {
        obj['validTo'] = ApiClient.convertToType(data['validTo'], 'Date');
      }
      if (data.hasOwnProperty('isClosed')) {
        obj['isClosed'] = ApiClient.convertToType(data['isClosed'], 'Boolean');
      }
      if (data.hasOwnProperty('validForNow')) {
        obj['validForNow'] = ApiClient.convertToType(data['validForNow'], 'Boolean');
      }
      if (data.hasOwnProperty('additionalInformation')) {
        obj['additionalInformation'] = ApiClient.convertToType(data['additionalInformation'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('openingHour')) {
        obj['openingHour'] = ApiClient.convertToType(data['openingHour'], [DailyOpeningTime]);
      }
    }
    return obj;
  }

  /**
   * @member {String} serviceHourType
   */
  exports.prototype['serviceHourType'] = undefined;
  /**
   * Date time where from this entry is valid.
   * @member {Date} validFrom
   */
  exports.prototype['validFrom'] = undefined;
  /**
   * Date time to this entry is valid.
   * @member {Date} validTo
   */
  exports.prototype['validTo'] = undefined;
  /**
   * Set to true to present a time between the valid from and to times as closed.
   * @member {Boolean} isClosed
   */
  exports.prototype['isClosed'] = undefined;
  /**
   * Set to true to present that this entry is valid for now.
   * @member {Boolean} validForNow
   */
  exports.prototype['validForNow'] = undefined;
  /**
   * Localized list of additional information.
   * @member {Array.<module:model/LocalizedValue>} additionalInformation
   */
  exports.prototype['additionalInformation'] = undefined;
  /**
   * List of servicing hours (open and closes times).
   * @member {Array.<module:model/DailyOpeningTime>} openingHour
   */
  exports.prototype['openingHour'] = undefined;



  return exports;
}));


