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
    instance = new KuntaApiClient.PhoneServiceChannel();
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

  describe('PhoneServiceChannel', function() {
    it('should create an instance of PhoneServiceChannel', function() {
      // uncomment below and update the code to test PhoneServiceChannel
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be.a(KuntaApiClient.PhoneServiceChannel);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property organizationId (base name: "organizationId")', function() {
      // uncomment below and update the code to test the property organizationId
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property names (base name: "names")', function() {
      // uncomment below and update the code to test the property names
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property descriptions (base name: "descriptions")', function() {
      // uncomment below and update the code to test the property descriptions
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property phoneType (base name: "phoneType")', function() {
      // uncomment below and update the code to test the property phoneType
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property chargeTypes (base name: "chargeTypes")', function() {
      // uncomment below and update the code to test the property chargeTypes
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property supportEmails (base name: "supportEmails")', function() {
      // uncomment below and update the code to test the property supportEmails
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property phoneNumbers (base name: "phoneNumbers")', function() {
      // uncomment below and update the code to test the property phoneNumbers
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property languages (base name: "languages")', function() {
      // uncomment below and update the code to test the property languages
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property phoneChargeDescriptions (base name: "phoneChargeDescriptions")', function() {
      // uncomment below and update the code to test the property phoneChargeDescriptions
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property webPages (base name: "webPages")', function() {
      // uncomment below and update the code to test the property webPages
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property serviceHours (base name: "serviceHours")', function() {
      // uncomment below and update the code to test the property serviceHours
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

    it('should have the property publishingStatus (base name: "publishingStatus")', function() {
      // uncomment below and update the code to test the property publishingStatus
      //var instane = new KuntaApiClient.PhoneServiceChannel();
      //expect(instance).to.be();
    });

  });

}));
