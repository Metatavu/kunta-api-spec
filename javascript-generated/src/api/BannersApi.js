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
    define(['ApiClient', 'model/BadRequest', 'model/NewsArticle', 'model/Forbidden', 'model/InternalServerError', 'model/Attachment', 'model/Banner'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/NewsArticle'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Attachment'), require('../model/Banner'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.BannersApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.NewsArticle, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.Attachment, root.KuntaApiClient.Banner);
  }
}(this, function(ApiClient, BadRequest, NewsArticle, Forbidden, InternalServerError, Attachment, Banner) {
  'use strict';

  /**
   * Banners service.
   * @module api/BannersApi
   * @version 0.0.86
   */

  /**
   * Constructs a new BannersApi. 
   * @alias module:api/BannersApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds organizations banner
     * Finds single organization banner 
     * @param {String} organizationId Organization id
     * @param {String} bannerId banner id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/NewsArticle}
     */
    this.findOrganizationBanner = function(organizationId, bannerId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationBanner";
      }

      // verify the required parameter 'bannerId' is set
      if (bannerId == undefined || bannerId == null) {
        throw "Missing the required parameter 'bannerId' when calling findOrganizationBanner";
      }


      var pathParams = {
        'organizationId': organizationId,
        'bannerId': bannerId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = NewsArticle;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/banners/{bannerId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns a single organiztion banner image
     * Returns a single organiztion banner image 
     * @param {String} organizationId Organization id
     * @param {String} bannerId Banner Id
     * @param {String} imageId Banner image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Attachment}
     */
    this.findOrganizationBannerImage = function(organizationId, bannerId, imageId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationBannerImage";
      }

      // verify the required parameter 'bannerId' is set
      if (bannerId == undefined || bannerId == null) {
        throw "Missing the required parameter 'bannerId' when calling findOrganizationBannerImage";
      }

      // verify the required parameter 'imageId' is set
      if (imageId == undefined || imageId == null) {
        throw "Missing the required parameter 'imageId' when calling findOrganizationBannerImage";
      }


      var pathParams = {
        'organizationId': organizationId,
        'bannerId': bannerId,
        'imageId': imageId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Attachment;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/banners/{bannerId}/images/{imageId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns an organization banner image data
     * Returns an organization banner image data 
     * @param {String} organizationId Organization id
     * @param {String} bannerId Banner id
     * @param {String} imageId Banner image id
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    this.getOrganizationBannerImageData = function(organizationId, bannerId, imageId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling getOrganizationBannerImageData";
      }

      // verify the required parameter 'bannerId' is set
      if (bannerId == undefined || bannerId == null) {
        throw "Missing the required parameter 'bannerId' when calling getOrganizationBannerImageData";
      }

      // verify the required parameter 'imageId' is set
      if (imageId == undefined || imageId == null) {
        throw "Missing the required parameter 'imageId' when calling getOrganizationBannerImageData";
      }


      var pathParams = {
        'organizationId': organizationId,
        'bannerId': bannerId,
        'imageId': imageId
      };
      var queryParams = {
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/octet-stream'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/organizations/{organizationId}/banners/{bannerId}/images/{imageId}/data', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns a list of organization banner images
     * Returns a list of organization banner images 
     * @param {String} organizationId Organization id
     * @param {String} bannerId Banner id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Attachment>}
     */
    this.listOrganizationBannerImages = function(organizationId, bannerId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationBannerImages";
      }

      // verify the required parameter 'bannerId' is set
      if (bannerId == undefined || bannerId == null) {
        throw "Missing the required parameter 'bannerId' when calling listOrganizationBannerImages";
      }


      var pathParams = {
        'organizationId': organizationId,
        'bannerId': bannerId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Attachment];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/banners/{bannerId}/images', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists organizations banners
     * Lists organizations banners 
     * @param {String} organizationId Organization id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Banner>}
     */
    this.listOrganizationBanners = function(organizationId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationBanners";
      }


      var pathParams = {
        'organizationId': organizationId
      };
      var queryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Banner];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/banners', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
