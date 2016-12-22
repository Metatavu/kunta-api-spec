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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.KuntaApiClient);
  }
}(this, function(expect, KuntaApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new KuntaApiClient.ServiceLocationChannel();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ServiceLocationChannel', function() {
    it('should create an instance of ServiceLocationChannel', function() {
      // uncomment below and update the code to test ServiceLocationChannel
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be.a(KuntaApiClient.ServiceLocationChannel);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property organizationId (base name: "organizationId")', function() {
      // uncomment below and update the code to test the property organizationId
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property names (base name: "names")', function() {
      // uncomment below and update the code to test the property names
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property descriptions (base name: "descriptions")', function() {
      // uncomment below and update the code to test the property descriptions
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property serviceAreaRestricted (base name: "serviceAreaRestricted")', function() {
      // uncomment below and update the code to test the property serviceAreaRestricted
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property supportContacts (base name: "supportContacts")', function() {
      // uncomment below and update the code to test the property supportContacts
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property phone (base name: "phone")', function() {
      // uncomment below and update the code to test the property phone
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property languages (base name: "languages")', function() {
      // uncomment below and update the code to test the property languages
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property fax (base name: "fax")', function() {
      // uncomment below and update the code to test the property fax
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property latitude (base name: "latitude")', function() {
      // uncomment below and update the code to test the property latitude
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property longitude (base name: "longitude")', function() {
      // uncomment below and update the code to test the property longitude
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property coordinateSystem (base name: "coordinateSystem")', function() {
      // uncomment below and update the code to test the property coordinateSystem
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property coordinatesSetManually (base name: "coordinatesSetManually")', function() {
      // uncomment below and update the code to test the property coordinatesSetManually
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property phoneServiceCharge (base name: "phoneServiceCharge")', function() {
      // uncomment below and update the code to test the property phoneServiceCharge
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property webPages (base name: "webPages")', function() {
      // uncomment below and update the code to test the property webPages
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property serviceAreas (base name: "serviceAreas")', function() {
      // uncomment below and update the code to test the property serviceAreas
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property phoneChargeDescriptions (base name: "phoneChargeDescriptions")', function() {
      // uncomment below and update the code to test the property phoneChargeDescriptions
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property addresses (base name: "addresses")', function() {
      // uncomment below and update the code to test the property addresses
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property chargeTypes (base name: "chargeTypes")', function() {
      // uncomment below and update the code to test the property chargeTypes
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property serviceHours (base name: "serviceHours")', function() {
      // uncomment below and update the code to test the property serviceHours
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

    it('should have the property publishingStatus (base name: "publishingStatus")', function() {
      // uncomment below and update the code to test the property publishingStatus
      //var instane = new KuntaApiClient.ServiceLocationChannel();
      //expect(instance).to.be();
    });

  });

}));
