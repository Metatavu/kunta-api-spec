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
    define(['ApiClient', 'model/LocalizedValue', 'model/Municipality'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'), require('./Municipality'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Area = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.Municipality);
  }
}(this, function(ApiClient, LocalizedValue, Municipality) {
  'use strict';




  /**
   * The Area model module.
   * @module model/Area
   * @version 0.0.120
   */

  /**
   * Constructs a new <code>Area</code>.
   * Area
   * @alias module:model/Area
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>Area</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Area} obj Optional instance to populate.
   * @return {module:model/Area} The populated <code>Area</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('municipalities')) {
        obj['municipalities'] = ApiClient.convertToType(data['municipalities'], [Municipality]);
      }
    }
    return obj;
  }

  /**
   * Type of the area (Municipality, Province, BusinessRegions, HospitalRegions).
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Code of the area.
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * Localized list of names for the area
   * @member {Array.<module:model/LocalizedValue>} name
   */
  exports.prototype['name'] = undefined;
  /**
   * List of municipalities including municipality code and a localized list of municipality names.
   * @member {Array.<module:model/Municipality>} municipalities
   */
  exports.prototype['municipalities'] = undefined;



  return exports;
}));


