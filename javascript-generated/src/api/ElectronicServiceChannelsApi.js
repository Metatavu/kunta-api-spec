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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/ElectronicServiceChannel', 'model/InternalServerError', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/ElectronicServiceChannel'), require('../model/InternalServerError'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.ElectronicServiceChannelsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Forbidden, root.KuntaApiClient.ElectronicServiceChannel, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, Forbidden, ElectronicServiceChannel, InternalServerError, NotFound) {
  'use strict';

  /**
   * ElectronicServiceChannels service.
   * @module api/ElectronicServiceChannelsApi
   * @version 0.0.141
   */

  /**
   * Constructs a new ElectronicServiceChannelsApi. 
   * @alias module:api/ElectronicServiceChannelsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds an electronic service channel by id
     * Finds an electronic service channel by id
     * @param {String} electronicServiceChannelId electronicChannel id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ElectronicServiceChannel}
     */
    this.findElectronicServiceChannel = function(electronicServiceChannelId) {
      var postBody = null;

      // verify the required parameter 'electronicServiceChannelId' is set
      if (electronicServiceChannelId == undefined || electronicServiceChannelId == null) {
        throw "Missing the required parameter 'electronicServiceChannelId' when calling findElectronicServiceChannel";
      }


      var pathParams = {
        'electronicServiceChannelId': electronicServiceChannelId
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
      var returnType = ElectronicServiceChannel;

      return this.apiClient.callApi(
        '/electronicServiceChannels/{electronicServiceChannelId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists electronic service channels
     * Lists electronic service channels
     * @param {Object} opts Optional parameters
     * @param {String} opts.organizationId Organization id
     * @param {String} opts.search Search channels by free-text query
     * @param {String} opts.sortBy define order (NATURAL or SCORE). Default is NATURAL
     * @param {String} opts.sortDir ASC or DESC. Default is ASC
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ElectronicServiceChannel>}
     */
    this.listElectronicServiceChannels = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'organizationId': opts['organizationId'],
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
      var returnType = [ElectronicServiceChannel];

      return this.apiClient.callApi(
        '/electronicServiceChannels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Updates a channel
     * Updates a service channel
     * @param {String} electronicServiceChannelId electronicChannel id
     * @param {module:model/ElectronicServiceChannel} payload New electronic service data
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ElectronicServiceChannel}
     */
    this.updateElectronicServiceChannel = function(electronicServiceChannelId, payload) {
      var postBody = payload;

      // verify the required parameter 'electronicServiceChannelId' is set
      if (electronicServiceChannelId == undefined || electronicServiceChannelId == null) {
        throw "Missing the required parameter 'electronicServiceChannelId' when calling updateElectronicServiceChannel";
      }

      // verify the required parameter 'payload' is set
      if (payload == undefined || payload == null) {
        throw "Missing the required parameter 'payload' when calling updateElectronicServiceChannel";
      }


      var pathParams = {
        'electronicServiceChannelId': electronicServiceChannelId
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
      var returnType = ElectronicServiceChannel;

      return this.apiClient.callApi(
        '/electronicServiceChannels/{electronicServiceChannelId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
