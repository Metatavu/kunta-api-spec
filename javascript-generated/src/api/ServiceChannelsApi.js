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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/ElectronicServiceChannel', 'model/InternalServerError', 'model/NotFound', 'model/PhoneServiceChannel', 'model/PrintableFormServiceChannel', 'model/ServiceLocationServiceChannel', 'model/WebPageServiceChannel'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/ElectronicServiceChannel'), require('../model/InternalServerError'), require('../model/NotFound'), require('../model/PhoneServiceChannel'), require('../model/PrintableFormServiceChannel'), require('../model/ServiceLocationServiceChannel'), require('../model/WebPageServiceChannel'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.ServiceChannelsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Forbidden, root.KuntaApiClient.ElectronicServiceChannel, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.NotFound, root.KuntaApiClient.PhoneServiceChannel, root.KuntaApiClient.PrintableFormServiceChannel, root.KuntaApiClient.ServiceLocationServiceChannel, root.KuntaApiClient.WebPageServiceChannel);
  }
}(this, function(ApiClient, BadRequest, Forbidden, ElectronicServiceChannel, InternalServerError, NotFound, PhoneServiceChannel, PrintableFormServiceChannel, ServiceLocationServiceChannel, WebPageServiceChannel) {
  'use strict';

  /**
   * ServiceChannels service.
   * @module api/ServiceChannelsApi
   * @version 0.0.124
   */

  /**
   * Constructs a new ServiceChannelsApi. 
   * @alias module:api/ServiceChannelsApi
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
     * Finds a phone service channel by id
     * Finds a phone service channel by id
     * @param {String} phoneServiceChannelId Phone service channel id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PhoneServiceChannel}
     */
    this.findPhoneServiceChannel = function(phoneServiceChannelId) {
      var postBody = null;

      // verify the required parameter 'phoneServiceChannelId' is set
      if (phoneServiceChannelId == undefined || phoneServiceChannelId == null) {
        throw "Missing the required parameter 'phoneServiceChannelId' when calling findPhoneServiceChannel";
      }


      var pathParams = {
        'phoneServiceChannelId': phoneServiceChannelId
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
      var returnType = PhoneServiceChannel;

      return this.apiClient.callApi(
        '/phoneServiceChannels/{phoneServiceChannelId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


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
     * Finds a service location service by id
     * Finds a service location service by id
     * @param {String} serviceLocationServiceChannelId serviceLocationChannel id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ServiceLocationServiceChannel}
     */
    this.findServiceLocationServiceChannel = function(serviceLocationServiceChannelId) {
      var postBody = null;

      // verify the required parameter 'serviceLocationServiceChannelId' is set
      if (serviceLocationServiceChannelId == undefined || serviceLocationServiceChannelId == null) {
        throw "Missing the required parameter 'serviceLocationServiceChannelId' when calling findServiceLocationServiceChannel";
      }


      var pathParams = {
        'serviceLocationServiceChannelId': serviceLocationServiceChannelId
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
      var returnType = ServiceLocationServiceChannel;

      return this.apiClient.callApi(
        '/serviceLocationServiceChannels/{serviceLocationServiceChannelId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


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

      var authNames = ['basicAuth'];
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
     * Lists electronic service channels
     * Lists electronic service channels
     * @param {Object} opts Optional parameters
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
     * Lists phone service channels
     * Lists phone service channels
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PhoneServiceChannel>}
     */
    this.listPhoneServiceChannels = function(opts) {
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

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [PhoneServiceChannel];

      return this.apiClient.callApi(
        '/phoneServiceChannels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists printable form service channels
     * Lists printable form service channels
     * @param {Object} opts Optional parameters
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
     * Lists service location service channels
     * Lists service location service channels
     * @param {Object} opts Optional parameters
     * @param {String} opts.organizationId Organization id
     * @param {String} opts.search Search service location channels by free-text query
     * @param {String} opts.sortBy define order (NATURAL or SCORE). Default is NATURAL
     * @param {String} opts.sortDir ASC or DESC. Default is ASC
     * @param {Integer} opts.firstResult First result
     * @param {Integer} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ServiceLocationServiceChannel>}
     */
    this.listServiceLocationServiceChannels = function(opts) {
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
      var returnType = [ServiceLocationServiceChannel];

      return this.apiClient.callApi(
        '/serviceLocationServiceChannels', 'GET',
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

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [WebPageServiceChannel];

      return this.apiClient.callApi(
        '/webPageServiceChannels', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Updates a service location channel
     * Updates a service location channel
     * @param {String} serviceLocationServiceChannelId serviceLocationChannel id
     * @param {module:model/ServiceLocationServiceChannel} serviceLocationChannel New service location channel data
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ServiceLocationServiceChannel}
     */
    this.updateServiceLocationServiceChannel = function(serviceLocationServiceChannelId, serviceLocationChannel) {
      var postBody = serviceLocationChannel;

      // verify the required parameter 'serviceLocationServiceChannelId' is set
      if (serviceLocationServiceChannelId == undefined || serviceLocationServiceChannelId == null) {
        throw "Missing the required parameter 'serviceLocationServiceChannelId' when calling updateServiceLocationServiceChannel";
      }

      // verify the required parameter 'serviceLocationChannel' is set
      if (serviceLocationChannel == undefined || serviceLocationChannel == null) {
        throw "Missing the required parameter 'serviceLocationChannel' when calling updateServiceLocationServiceChannel";
      }


      var pathParams = {
        'serviceLocationServiceChannelId': serviceLocationServiceChannelId
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
      var returnType = ServiceLocationServiceChannel;

      return this.apiClient.callApi(
        '/serviceLocationServiceChannels/{serviceLocationServiceChannelId}', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
