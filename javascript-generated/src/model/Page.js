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
    define(['ApiClient', 'model/LocalizedValue', 'model/PageMeta'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'), require('./PageMeta'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Page = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.PageMeta);
  }
}(this, function(ApiClient, LocalizedValue, PageMeta) {
  'use strict';




  /**
   * The Page model module.
   * @module model/Page
   * @version 0.0.132
   */

  /**
   * Constructs a new <code>Page</code>.
   * @alias module:model/Page
   * @class
   */
  var exports = function() {
    var _this = this;






  };

  /**
   * Constructs a <code>Page</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Page} obj Optional instance to populate.
   * @return {module:model/Page} The populated <code>Page</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('slug')) {
        obj['slug'] = ApiClient.convertToType(data['slug'], 'String');
      }
      if (data.hasOwnProperty('titles')) {
        obj['titles'] = ApiClient.convertToType(data['titles'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('parentId')) {
        obj['parentId'] = ApiClient.convertToType(data['parentId'], 'String');
      }
      if (data.hasOwnProperty('meta')) {
        obj['meta'] = PageMeta.constructFromObject(data['meta']);
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} slug
   */
  exports.prototype['slug'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} titles
   */
  exports.prototype['titles'] = undefined;
  /**
   * @member {String} parentId
   */
  exports.prototype['parentId'] = undefined;
  /**
   * @member {module:model/PageMeta} meta
   */
  exports.prototype['meta'] = undefined;



  return exports;
}));


