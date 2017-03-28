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
    define(['ApiClient', 'model/BadRequest', 'model/WebPageServiceChannel', 'model/Forbidden', 'model/InternalServerError', 'model/NotFound'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/WebPageServiceChannel'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/NotFound'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.WebPageServiceChannelsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.WebPageServiceChannel, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.NotFound);
  }
}(this, function(ApiClient, BadRequest, WebPageServiceChannel, Forbidden, InternalServerError, NotFound) {
  'use strict';

  /**
   * WebPageServiceChannels service.
   * @module api/WebPageServiceChannelsApi
   * @version 0.0.59
   */

  /**
   * Constructs a new WebPageServiceChannelsApi. 
   * @alias module:api/WebPageServiceChannelsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds a web page service channel by id
     * Finds a web page service channel by id
     * @param {String} webPageServiceChannelId webPageChannel id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/WebPageServiceChannel}
     */
    this.findWebPageServiceChannel = function(webPageServiceChannelId) {
      var postBody = null;

      // verify the required parameter 'webPageServiceChannelId' is set
      if (webPageServiceChannelId == undefined || webPageServiceChannelId == null) {
        throw "Missing the required parameter 'webPageServiceChannelId' when calling findWebPageServiceChannel";
      }


      var pathParams = {
        'webPageServiceChannelId': webPageServiceChannelId
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
      var returnType = WebPageServiceChannel;

      return this.apiClient.callApi(
        '/webPageServiceChannels/{webPageServiceChannelId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists web page service channels
     * Lists web page service channels
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/WebPageServiceChannel>}
     */
    this.listWebPageServiceChannels = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [WebPageServiceChannel];

      return this.apiClient.callApi(
        '/webPageServiceChannels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));