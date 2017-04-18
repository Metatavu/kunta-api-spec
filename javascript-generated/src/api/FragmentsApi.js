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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/Fragment', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/Fragment'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.FragmentsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Forbidden, root.KuntaApiClient.Fragment, root.KuntaApiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, Forbidden, Fragment, InternalServerError) {
  'use strict';

  /**
   * Fragments service.
   * @module api/FragmentsApi
   * @version 0.0.86
   */

  /**
   * Constructs a new FragmentsApi. 
   * @alias module:api/FragmentsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds organizations page fragment
     * Finds single organization page fragment 
     * @param {String} organizationId Organization id
     * @param {String} fragmentId fragment id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Fragment}
     */
    this.findOrganizationFragment = function(organizationId, fragmentId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationFragment";
      }

      // verify the required parameter 'fragmentId' is set
      if (fragmentId == undefined || fragmentId == null) {
        throw "Missing the required parameter 'fragmentId' when calling findOrganizationFragment";
      }


      var pathParams = {
        'organizationId': organizationId,
        'fragmentId': fragmentId
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
      var returnType = Fragment;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/fragments/{fragmentId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists organizations page fragments
     * Lists organizations page fragments 
     * @param {String} organizationId Organization id
     * @param {Object} opts Optional parameters
     * @param {String} opts.slug Filter results by fragment slug
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Fragment>}
     */
    this.listOrganizationFragments = function(organizationId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationFragments";
      }


      var pathParams = {
        'organizationId': organizationId
      };
      var queryParams = {
        'slug': opts['slug']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Fragment];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/fragments', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
