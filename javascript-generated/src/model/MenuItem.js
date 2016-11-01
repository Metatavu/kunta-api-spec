/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.0.1
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
    root.KuntaApiClient.MenuItem = factory(root.KuntaApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The MenuItem model module.
   * @module model/MenuItem
   * @version 0.0.18
   */

  /**
   * Constructs a new <code>MenuItem</code>.
   * @alias module:model/MenuItem
   * @class
   */
  var exports = function() {
    var _this = this;








  };

  /**
   * Constructs a <code>MenuItem</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MenuItem} obj Optional instance to populate.
   * @return {module:model/MenuItem} The populated <code>MenuItem</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('label')) {
        obj['label'] = ApiClient.convertToType(data['label'], 'String');
      }
      if (data.hasOwnProperty('parentItemId')) {
        obj['parentItemId'] = ApiClient.convertToType(data['parentItemId'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('pageId')) {
        obj['pageId'] = ApiClient.convertToType(data['pageId'], 'String');
      }
      if (data.hasOwnProperty('fileId')) {
        obj['fileId'] = ApiClient.convertToType(data['fileId'], 'String');
      }
      if (data.hasOwnProperty('externalUrl')) {
        obj['externalUrl'] = ApiClient.convertToType(data['externalUrl'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} label
   */
  exports.prototype['label'] = undefined;
  /**
   * @member {String} parentItemId
   */
  exports.prototype['parentItemId'] = undefined;
  /**
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * @member {String} pageId
   */
  exports.prototype['pageId'] = undefined;
  /**
   * @member {String} fileId
   */
  exports.prototype['fileId'] = undefined;
  /**
   * @member {String} externalUrl
   */
  exports.prototype['externalUrl'] = undefined;



  return exports;
}));

