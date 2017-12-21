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
    define(['ApiClient', 'model/Coordinate'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Coordinate'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Coordinates = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.Coordinate);
  }
}(this, function(ApiClient, Coordinate) {
  'use strict';




  /**
   * The Coordinates model module.
   * @module model/Coordinates
   * @version 0.0.133
   */

  /**
   * Constructs a new <code>Coordinates</code>.
   * @alias module:model/Coordinates
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>Coordinates</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Coordinates} obj Optional instance to populate.
   * @return {module:model/Coordinates} The populated <code>Coordinates</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('epsg3067')) {
        obj['epsg3067'] = Coordinate.constructFromObject(data['epsg3067']);
      }
      if (data.hasOwnProperty('epsg4326')) {
        obj['epsg4326'] = Coordinate.constructFromObject(data['epsg4326']);
      }
    }
    return obj;
  }

  /**
   * @member {module:model/Coordinate} epsg3067
   */
  exports.prototype['epsg3067'] = undefined;
  /**
   * @member {module:model/Coordinate} epsg4326
   */
  exports.prototype['epsg4326'] = undefined;



  return exports;
}));


