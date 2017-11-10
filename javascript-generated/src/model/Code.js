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
    define(['ApiClient', 'model/CodeExtra', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./CodeExtra'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Code = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.CodeExtra, root.KuntaApiClient.LocalizedValue);
  }
}(this, function(ApiClient, CodeExtra, LocalizedValue) {
  'use strict';




  /**
   * The Code model module.
   * @module model/Code
   * @version 0.0.119
   */

  /**
   * Constructs a new <code>Code</code>.
   * Generic code item describing code / name pair (e.g. LanguageCode, MunicipalityCode, etc...)
   * @alias module:model/Code
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Code</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Code} obj Optional instance to populate.
   * @return {module:model/Code} The populated <code>Code</code> instance.
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
      if (data.hasOwnProperty('code')) {
        obj['code'] = ApiClient.convertToType(data['code'], 'String');
      }
      if (data.hasOwnProperty('names')) {
        obj['names'] = ApiClient.convertToType(data['names'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('extra')) {
        obj['extra'] = ApiClient.convertToType(data['extra'], [CodeExtra]);
      }
    }
    return obj;
  }

  /**
   * Kunta API id for code
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Type of the code. Value must be one of MUNICIPALITY, PROVINCE, HOSPITALREGIONS, BUSINESSREGIONS, COUNTRY, LANGUAGE, POSTAL
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Code
   * @member {String} code
   */
  exports.prototype['code'] = undefined;
  /**
   * Names
   * @member {Array.<module:model/LocalizedValue>} names
   */
  exports.prototype['names'] = undefined;
  /**
   * Names
   * @member {Array.<module:model/CodeExtra>} extra
   */
  exports.prototype['extra'] = undefined;



  return exports;
}));


