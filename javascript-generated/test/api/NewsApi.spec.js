/**
 * Kunta API
 * One API to rule them all. One API to find them, One API to bring them all and in the darkness bind them.
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
    instance = new KuntaApiClient.NewsApi();
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

  describe('NewsApi', function() {
    describe('findOrganizationBannerImage', function() {
      it('should call findOrganizationBannerImage successfully', function(done) {
        //uncomment below and update the code to test findOrganizationBannerImage
        //instance.findOrganizationBannerImage(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findOrganizationNewsArticle', function() {
      it('should call findOrganizationNewsArticle successfully', function(done) {
        //uncomment below and update the code to test findOrganizationNewsArticle
        //instance.findOrganizationNewsArticle(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findOrganizationNewsArticleImage', function() {
      it('should call findOrganizationNewsArticleImage successfully', function(done) {
        //uncomment below and update the code to test findOrganizationNewsArticleImage
        //instance.findOrganizationNewsArticleImage(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOrganizationBannerImageData', function() {
      it('should call getOrganizationBannerImageData successfully', function(done) {
        //uncomment below and update the code to test getOrganizationBannerImageData
        //instance.getOrganizationBannerImageData(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getOrganizationNewsArticleImageData', function() {
      it('should call getOrganizationNewsArticleImageData successfully', function(done) {
        //uncomment below and update the code to test getOrganizationNewsArticleImageData
        //instance.getOrganizationNewsArticleImageData(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listOrganizationNews', function() {
      it('should call listOrganizationNews successfully', function(done) {
        //uncomment below and update the code to test listOrganizationNews
        //instance.listOrganizationNews(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listOrganizationNewsArticleImages', function() {
      it('should call listOrganizationNewsArticleImages successfully', function(done) {
        //uncomment below and update the code to test listOrganizationNewsArticleImages
        //instance.listOrganizationNewsArticleImages(pet, function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
