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
    define(['ApiClient', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.EnvironmentalWarning = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.LocalizedValue);
  }
}(this, function(ApiClient, LocalizedValue) {
  'use strict';




  /**
   * The EnvironmentalWarning model module.
   * @module model/EnvironmentalWarning
   * @version 0.0.137
   */

  /**
   * Constructs a new <code>EnvironmentalWarning</code>.
   * @alias module:model/EnvironmentalWarning
   * @class
   */
  var exports = function() {
    var _this = this;










  };

  /**
   * Constructs a <code>EnvironmentalWarning</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/EnvironmentalWarning} obj Optional instance to populate.
   * @return {module:model/EnvironmentalWarning} The populated <code>EnvironmentalWarning</code> instance.
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
      if (data.hasOwnProperty('context')) {
        obj['context'] = ApiClient.convertToType(data['context'], 'String');
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('causes')) {
        obj['causes'] = ApiClient.convertToType(data['causes'], ['String']);
      }
      if (data.hasOwnProperty('actualizationProbability')) {
        obj['actualizationProbability'] = ApiClient.convertToType(data['actualizationProbability'], 'Number');
      }
      if (data.hasOwnProperty('start')) {
        obj['start'] = ApiClient.convertToType(data['start'], 'Date');
      }
      if (data.hasOwnProperty('end')) {
        obj['end'] = ApiClient.convertToType(data['end'], 'Date');
      }
      if (data.hasOwnProperty('severity')) {
        obj['severity'] = ApiClient.convertToType(data['severity'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} id
   */
  exports.prototype['id'] = undefined;
  /**
   * Possible values   - WEATHER   - FLOOD 
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Possible values   - cold-weather   - forest-fire-weather   - grass-fire-weather   - hot-weather   - pedestrian-safety   - rain   - sea-icing   - sea-thunder-storm   - sea-water-height   - sea-wave-height   - sea-wind   - thunder-storm   - traffic-weather   - uv-note   - wind 
   * @member {String} context
   */
  exports.prototype['context'] = undefined;
  /**
   * Description of environmental warning
   * @member {Array.<module:model/LocalizedValue>} description
   */
  exports.prototype['description'] = undefined;
  /**
   * @member {Array.<String>} causes
   */
  exports.prototype['causes'] = undefined;
  /**
   * @member {Number} actualizationProbability
   */
  exports.prototype['actualizationProbability'] = undefined;
  /**
   * @member {Date} start
   */
  exports.prototype['start'] = undefined;
  /**
   * @member {Date} end
   */
  exports.prototype['end'] = undefined;
  /**
   * Possible values   - level-1   - level-2   - level-3   - level-4 
   * @member {String} severity
   */
  exports.prototype['severity'] = undefined;



  return exports;
}));


