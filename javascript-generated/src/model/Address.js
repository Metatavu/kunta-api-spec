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
    define(['ApiClient', 'model/Address', 'model/AddressEntrance', 'model/Coordinates', 'model/LocalizedValue', 'model/Municipality'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./Address'), require('./AddressEntrance'), require('./Coordinates'), require('./LocalizedValue'), require('./Municipality'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.Address = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.Address, root.KuntaApiClient.AddressEntrance, root.KuntaApiClient.Coordinates, root.KuntaApiClient.LocalizedValue, root.KuntaApiClient.Municipality);
  }
}(this, function(ApiClient, Address, AddressEntrance, Coordinates, LocalizedValue, Municipality) {
  'use strict';




  /**
   * The Address model module.
   * @module model/Address
   * @version 0.0.141
   */

  /**
   * Constructs a new <code>Address</code>.
   * @alias module:model/Address
   * @class
   */
  var exports = function() {
    var _this = this;


















  };

  /**
   * Constructs a <code>Address</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Address} obj Optional instance to populate.
   * @return {module:model/Address} The populated <code>Address</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('latitude')) {
        obj['latitude'] = ApiClient.convertToType(data['latitude'], 'String');
      }
      if (data.hasOwnProperty('longitude')) {
        obj['longitude'] = ApiClient.convertToType(data['longitude'], 'String');
      }
      if (data.hasOwnProperty('coordinates')) {
        obj['coordinates'] = Coordinates.constructFromObject(data['coordinates']);
      }
      if (data.hasOwnProperty('coordinateState')) {
        obj['coordinateState'] = ApiClient.convertToType(data['coordinateState'], 'String');
      }
      if (data.hasOwnProperty('type')) {
        obj['type'] = ApiClient.convertToType(data['type'], 'String');
      }
      if (data.hasOwnProperty('subtype')) {
        obj['subtype'] = ApiClient.convertToType(data['subtype'], 'String');
      }
      if (data.hasOwnProperty('postOfficeBox')) {
        obj['postOfficeBox'] = ApiClient.convertToType(data['postOfficeBox'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('postalCode')) {
        obj['postalCode'] = ApiClient.convertToType(data['postalCode'], 'String');
      }
      if (data.hasOwnProperty('postOffice')) {
        obj['postOffice'] = ApiClient.convertToType(data['postOffice'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('streetAddress')) {
        obj['streetAddress'] = ApiClient.convertToType(data['streetAddress'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('streetNumber')) {
        obj['streetNumber'] = ApiClient.convertToType(data['streetNumber'], 'String');
      }
      if (data.hasOwnProperty('municipality')) {
        obj['municipality'] = Municipality.constructFromObject(data['municipality']);
      }
      if (data.hasOwnProperty('country')) {
        obj['country'] = ApiClient.convertToType(data['country'], 'String');
      }
      if (data.hasOwnProperty('locationAbroad')) {
        obj['locationAbroad'] = ApiClient.convertToType(data['locationAbroad'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('multipointLocation')) {
        obj['multipointLocation'] = ApiClient.convertToType(data['multipointLocation'], [Address]);
      }
      if (data.hasOwnProperty('additionalInformations')) {
        obj['additionalInformations'] = ApiClient.convertToType(data['additionalInformations'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('entrances')) {
        obj['entrances'] = ApiClient.convertToType(data['entrances'], [AddressEntrance]);
      }
    }
    return obj;
  }

  /**
   * Service location latitude coordinate.
   * @member {String} latitude
   */
  exports.prototype['latitude'] = undefined;
  /**
   * Service location longitude coordinate.
   * @member {String} longitude
   */
  exports.prototype['longitude'] = undefined;
  /**
   * @member {module:model/Coordinates} coordinates
   */
  exports.prototype['coordinates'] = undefined;
  /**
   * State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived or WrongFormatReceived.
   * @member {String} coordinateState
   */
  exports.prototype['coordinateState'] = undefined;
  /**
   * Address type, Visiting or Postal.
   * @member {String} type
   */
  exports.prototype['type'] = undefined;
  /**
   * Address sub type, Single, Street, PostOfficeBox, Abroad or Multipoint or NoAddress.
   * @member {String} subtype
   */
  exports.prototype['subtype'] = undefined;
  /**
   * Post office box like PL 310
   * @member {Array.<module:model/LocalizedValue>} postOfficeBox
   */
  exports.prototype['postOfficeBox'] = undefined;
  /**
   * Postal code, for example 00010.
   * @member {String} postalCode
   */
  exports.prototype['postalCode'] = undefined;
  /**
   * List of localized Post offices, for example Helsinki, Helsingfors.
   * @member {Array.<module:model/LocalizedValue>} postOffice
   */
  exports.prototype['postOffice'] = undefined;
  /**
   * List of localized street addresses.
   * @member {Array.<module:model/LocalizedValue>} streetAddress
   */
  exports.prototype['streetAddress'] = undefined;
  /**
   * Street number for street address.
   * @member {String} streetNumber
   */
  exports.prototype['streetNumber'] = undefined;
  /**
   * @member {module:model/Municipality} municipality
   */
  exports.prototype['municipality'] = undefined;
  /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   * @member {String} country
   */
  exports.prototype['country'] = undefined;
  /**
   * Localized list of foreign address information.
   * @member {Array.<module:model/LocalizedValue>} locationAbroad
   */
  exports.prototype['locationAbroad'] = undefined;
  /**
   * Moving address. Includes several street addresses.
   * @member {Array.<module:model/Address>} multipointLocation
   */
  exports.prototype['multipointLocation'] = undefined;
  /**
   * Localized list of additional information about the address.
   * @member {Array.<module:model/LocalizedValue>} additionalInformations
   */
  exports.prototype['additionalInformations'] = undefined;
  /**
   * Entrances for an address. Includes accessibility sentences.
   * @member {Array.<module:model/AddressEntrance>} entrances
   */
  exports.prototype['entrances'] = undefined;



  return exports;
}));


