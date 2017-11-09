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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.StopTime = factory(root.KuntaApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The StopTime model module.
   * @module model/StopTime
   * @version 0.0.115
   */

  /**
   * Constructs a new <code>StopTime</code>.
   * @alias module:model/StopTime
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>StopTime</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/StopTime} obj Optional instance to populate.
   * @return {module:model/StopTime} The populated <code>StopTime</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('tripId')) {
        obj['tripId'] = ApiClient.convertToType(data['tripId'], 'String');
      }
      if (data.hasOwnProperty('stopId')) {
        obj['stopId'] = ApiClient.convertToType(data['stopId'], 'String');
      }
      if (data.hasOwnProperty('arrivalTime')) {
        obj['arrivalTime'] = ApiClient.convertToType(data['arrivalTime'], 'Integer');
      }
      if (data.hasOwnProperty('departureTime')) {
        obj['departureTime'] = ApiClient.convertToType(data['departureTime'], 'Integer');
      }
      if (data.hasOwnProperty('sequency')) {
        obj['sequency'] = ApiClient.convertToType(data['sequency'], 'Integer');
      }
      if (data.hasOwnProperty('distanceTraveled')) {
        obj['distanceTraveled'] = ApiClient.convertToType(data['distanceTraveled'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} tripId
   */
  exports.prototype['tripId'] = undefined;
  /**
   * @member {String} stopId
   */
  exports.prototype['stopId'] = undefined;
  /**
   * @member {Integer} arrivalTime
   */
  exports.prototype['arrivalTime'] = undefined;
  /**
   * @member {Integer} departureTime
   */
  exports.prototype['departureTime'] = undefined;
  /**
   * @member {Integer} sequency
   */
  exports.prototype['sequency'] = undefined;
  /**
   * @member {Number} distanceTraveled
   */
  exports.prototype['distanceTraveled'] = undefined;



  return exports;
}));


