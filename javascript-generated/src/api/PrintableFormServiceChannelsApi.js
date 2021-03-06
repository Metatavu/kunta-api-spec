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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/PrintableFormServiceChannel', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/PrintableFormServiceChannel'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.PrintableFormServiceChannelsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.PrintableFormServiceChannel, root.KuntaApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, PrintableFormServiceChannel, NotFound) {
  'use strict';

  /**
   * PrintableFormServiceChannels service.
   * @module api/PrintableFormServiceChannelsApi
   * @version 0.0.141
   */

  /**
   * Constructs a new PrintableFormServiceChannelsApi. 
   * @alias module:api/PrintableFormServiceChannelsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds a printable form service channel
     * Finds a printable form service channel
     * @param {String} printableFormServiceChannelId Printable form service channel id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PrintableFormServiceChannel}
     */
    this.findPrintableFormServiceChannel = function(printableFormServiceChannelId) {
      var postBody = null;

      // verify the required parameter 'printableFormServiceChannelId' is set
      if (printableFormServiceChannelId == undefined || printableFormServiceChannelId == null) {
        throw "Missing the required parameter 'printableFormServiceChannelId' when calling findPrintableFormServiceChannel";
      }


      var pathParams = {
        'printableFormServiceChannelId': printableFormServiceChannelId
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
      var returnType = PrintableFormServiceChannel;

      return this.apiClient.callApi(
        '/printableFormServiceChannels/{printableFormServiceChannelId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists printable form service channels
     * Lists printable form service channels
     * @param {Object} opts Optional parameters
     * @param {String} opts.organizationId Organization id
     * @param {String} opts.search Search channels by free-text query
     * @param {String} opts.sortBy define order (NATURAL or SCORE). Default is NATURAL
     * @param {String} opts.sortDir ASC or DESC. Default is ASC
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PrintableFormServiceChannel>}
     */
    this.listPrintableFormServiceChannels = function(opts) {
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
      var returnType = [PrintableFormServiceChannel];

      return this.apiClient.callApi(
        '/printableFormServiceChannels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Updates a channel
     * Updates a service channel
     * @param {String} printableFormServiceChannelId printable form channel id
     * @param {module:model/PrintableFormServiceChannel} payload New printable form service data
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PrintableFormServiceChannel}
     */
    this.updatePrintableFormServiceChannel = function(printableFormServiceChannelId, payload) {
      var postBody = payload;

      // verify the required parameter 'printableFormServiceChannelId' is set
      if (printableFormServiceChannelId == undefined || printableFormServiceChannelId == null) {
        throw "Missing the required parameter 'printableFormServiceChannelId' when calling updatePrintableFormServiceChannel";
      }

      // verify the required parameter 'payload' is set
      if (payload == undefined || payload == null) {
        throw "Missing the required parameter 'payload' when calling updatePrintableFormServiceChannel";
      }


      var pathParams = {
        'printableFormServiceChannelId': printableFormServiceChannelId
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
      var returnType = PrintableFormServiceChannel;

      return this.apiClient.callApi(
        '/printableFormServiceChannels/{printableFormServiceChannelId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
