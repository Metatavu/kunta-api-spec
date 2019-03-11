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
    root.KuntaApiClient.ServiceVoucher = factory(root.KuntaApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The ServiceVoucher model module.
   * @module model/ServiceVoucher
   * @version 0.0.139
   */

  /**
   * Constructs a new <code>ServiceVoucher</code>.
   * Service voucher
   * @alias module:model/ServiceVoucher
   * @class
   * @param language {String} Language code.
   */
  var exports = function(language) {
    var _this = this;


    _this['language'] = language;


  };

  /**
   * Constructs a <code>ServiceVoucher</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/ServiceVoucher} obj Optional instance to populate.
   * @return {module:model/ServiceVoucher} The populated <code>ServiceVoucher</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }
      if (data.hasOwnProperty('language')) {
        obj['language'] = ApiClient.convertToType(data['language'], 'String');
      }
      if (data.hasOwnProperty('url')) {
        obj['url'] = ApiClient.convertToType(data['url'], 'String');
      }
      if (data.hasOwnProperty('additionalInformation')) {
        obj['additionalInformation'] = ApiClient.convertToType(data['additionalInformation'], 'String');
      }
    }
    return obj;
  }

  /**
   * Name of the service voucher.
   * @member {String} value
   */
  exports.prototype['value'] = undefined;
  /**
   * Language code.
   * @member {String} language
   */
  exports.prototype['language'] = undefined;
  /**
   * Web page url
   * @member {String} url
   */
  exports.prototype['url'] = undefined;
  /**
   * Service voucher additional information
   * @member {String} additionalInformation
   */
  exports.prototype['additionalInformation'] = undefined;



  return exports;
}));


