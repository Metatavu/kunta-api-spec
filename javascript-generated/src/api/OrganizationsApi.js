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
    define(['ApiClient', 'model/BadRequest', 'model/Organization', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Organization'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.OrganizationsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Organization, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, Organization, Forbidden, InternalServerError) {
  'use strict';

  /**
   * Organizations service.
   * @module api/OrganizationsApi
   * @version 0.0.112
   */

  /**
   * Constructs a new OrganizationsApi. 
   * @alias module:api/OrganizationsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Find organization
     * Find organization
     * @param {String} organizationId organization id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Organization}
     */
    this.findOrganization = function(organizationId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganization";
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

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = Organization;

      return this.apiClient.callApi(
        '/organizations/{organizationId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * List organizations
     * List organizations
     * @param {Object} opts Optional parameters
     * @param {String} opts.businessName Filter by organization&#39;s business name
     * @param {String} opts.businessCode Filter by organization&#39;s business code
     * @param {String} opts.search Search organizations by free-text query
     * @param {String} opts.sortBy define order (NATURAL or SCORE). Default is NATURAL
     * @param {String} opts.sortDir ASC or DESC. Default is ASC
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Organization>}
     */
    this.listOrganizations = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'businessName': opts['businessName'],
        'businessCode': opts['businessCode'],
        'search': opts['search'],
        'sortBy': opts['sortBy'],
        'sortDir': opts['sortDir'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Organization];

      return this.apiClient.callApi(
        '/organizations', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
