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
    root.KuntaApiClient.Incident = factory(root.KuntaApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Incident model module.
   * @module model/Incident
   * @version 0.0.139
   */

  /**
   * Constructs a new <code>Incident</code>.
   * @alias module:model/Incident
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>Incident</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Incident} obj Optional instance to populate.
   * @return {module:model/Incident} The populated <code>Incident</code> instance.
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
      if (data.hasOwnProperty('severity')) {
        obj['severity'] = ApiClient.convertToType(data['severity'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('detailsLink')) {
        obj['detailsLink'] = ApiClient.convertToType(data['detailsLink'], 'String');
      }
      if (data.hasOwnProperty('detailsLinkText')) {
        obj['detailsLinkText'] = ApiClient.convertToType(data['detailsLinkText'], 'String');
      }
      if (data.hasOwnProperty('start')) {
        obj['start'] = ApiClient.convertToType(data['start'], 'Date');
      }
      if (data.hasOwnProperty('end')) {
        obj['end'] = ApiClient.convertToType(data['end'], 'Date');
      }
      if (data.hasOwnProperty('areas')) {
        obj['areas'] = ApiClient.convertToType(data['areas'], ['String']);
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
   * @member {String} severity
   */
  exports.prototype['severity'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {String} detailsLink
   */
  exports.prototype['detailsLink'] = undefined;
  /**
   * @member {String} detailsLinkText
   */
  exports.prototype['detailsLinkText'] = undefined;
  /**
   * @member {Date} start
   */
  exports.prototype['start'] = undefined;
  /**
   * @member {Date} end
   */
  exports.prototype['end'] = undefined;
  /**
   * @member {Array.<String>} areas
   */
  exports.prototype['areas'] = undefined;



  return exports;
}));


