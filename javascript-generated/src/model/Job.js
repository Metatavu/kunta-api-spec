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
    root.KuntaApiClient.Job = factory(root.KuntaApiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Job model module.
   * @module model/Job
   * @version 0.0.118
   */

  /**
   * Constructs a new <code>Job</code>.
   * @alias module:model/Job
   * @class
   */
  var exports = function() {
    var _this = this;












  };

  /**
   * Constructs a <code>Job</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Job} obj Optional instance to populate.
   * @return {module:model/Job} The populated <code>Job</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], 'String');
      }
      if (data.hasOwnProperty('employmentType')) {
        obj['employmentType'] = ApiClient.convertToType(data['employmentType'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], 'String');
      }
      if (data.hasOwnProperty('location')) {
        obj['location'] = ApiClient.convertToType(data['location'], 'String');
      }
      if (data.hasOwnProperty('organisationalUnit')) {
        obj['organisationalUnit'] = ApiClient.convertToType(data['organisationalUnit'], 'String');
      }
      if (data.hasOwnProperty('duration')) {
        obj['duration'] = ApiClient.convertToType(data['duration'], 'String');
      }
      if (data.hasOwnProperty('taskArea')) {
        obj['taskArea'] = ApiClient.convertToType(data['taskArea'], 'String');
      }
      if (data.hasOwnProperty('publicationStart')) {
        obj['publicationStart'] = ApiClient.convertToType(data['publicationStart'], 'Date');
      }
      if (data.hasOwnProperty('publicationEnd')) {
        obj['publicationEnd'] = ApiClient.convertToType(data['publicationEnd'], 'Date');
      }
      if (data.hasOwnProperty('link')) {
        obj['link'] = ApiClient.convertToType(data['link'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {String} employmentType
   */
  exports.prototype['employmentType'] = undefined;
  /**
   * @member {String} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {String} location
   */
  exports.prototype['location'] = undefined;
  /**
   * @member {String} organisationalUnit
   */
  exports.prototype['organisationalUnit'] = undefined;
  /**
   * @member {String} duration
   */
  exports.prototype['duration'] = undefined;
  /**
   * @member {String} taskArea
   */
  exports.prototype['taskArea'] = undefined;
  /**
   * @member {Date} publicationStart
   */
  exports.prototype['publicationStart'] = undefined;
  /**
   * @member {Date} publicationEnd
   */
  exports.prototype['publicationEnd'] = undefined;
  /**
   * @member {String} link
   */
  exports.prototype['link'] = undefined;



  return exports;
}));


