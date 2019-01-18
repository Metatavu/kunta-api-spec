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
    define(['ApiClient', 'model/BadRequest', 'model/EnvironmentalWarning', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/EnvironmentalWarning'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.EnvironmentalWarningsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.EnvironmentalWarning, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, EnvironmentalWarning, Forbidden, InternalServerError) {
  'use strict';

  /**
   * EnvironmentalWarnings service.
   * @module api/EnvironmentalWarningsApi
   * @version 0.0.137
   */

  /**
   * Constructs a new EnvironmentalWarningsApi. 
   * @alias module:api/EnvironmentalWarningsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Returns organizations environmental warning by id
     * Returns organizations environmental warning by id 
     * @param {String} organizationId Organization id
     * @param {String} environmentalWarningId Environmental warning id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/EnvironmentalWarning}
     */
    this.findOrganizationEnvironmentalWarning = function(organizationId, environmentalWarningId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationEnvironmentalWarning";
      }

      // verify the required parameter 'environmentalWarningId' is set
      if (environmentalWarningId == undefined || environmentalWarningId == null) {
        throw "Missing the required parameter 'environmentalWarningId' when calling findOrganizationEnvironmentalWarning";
      }


      var pathParams = {
        'organizationId': organizationId,
        'environmentalWarningId': environmentalWarningId
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
      var returnType = EnvironmentalWarning;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/environmentalWarnings/{environmentalWarningId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists organizations environmentalWarnings
     * Lists organizations environmentalWarnings 
     * @param {String} organizationId Organization id
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.firstResult First index of results
     * @param {String} opts.contexts Return environmental warnings by contexts.
     * @param {String} opts.before Return environmental warnings before specified time
     * @param {String} opts.after Return environmental warnings after specified time
     * @param {Integer} opts.maxResults Maximum number of results
     * @param {String} opts.orderBy Define order (NATURAL, START)
     * @param {String} opts.orderDir Order direction (ASC, DESC). Default is ASC
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/EnvironmentalWarning>}
     */
    this.listOrganizationEnvironmentalWarnings = function(organizationId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationEnvironmentalWarnings";
      }


      var pathParams = {
        'organizationId': organizationId
      };
      var queryParams = {
        'firstResult': opts['firstResult'],
        'contexts': opts['contexts'],
        'before': opts['before'],
        'after': opts['after'],
        'maxResults': opts['maxResults'],
        'orderBy': opts['orderBy'],
        'orderDir': opts['orderDir']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [EnvironmentalWarning];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/environmentalWarnings', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
