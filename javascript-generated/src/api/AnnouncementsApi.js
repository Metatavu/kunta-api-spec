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
    define(['ApiClient', 'model/BadRequest', 'model/Announcement', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Announcement'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.AnnouncementsApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Announcement, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, Announcement, Forbidden, InternalServerError) {
  'use strict';

  /**
   * Announcements service.
   * @module api/AnnouncementsApi
   * @version 0.0.37
   */

  /**
   * Constructs a new AnnouncementsApi. 
   * @alias module:api/AnnouncementsApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds an organizations announcement
     * Finds organization&#39;s single announcement 
     * @param {String} organizationId Organization id
     * @param {String} announcementId Announcement id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Announcement}
     */
    this.findOrganizationAnnouncement = function(organizationId, announcementId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationAnnouncement";
      }

      // verify the required parameter 'announcementId' is set
      if (announcementId == undefined || announcementId == null) {
        throw "Missing the required parameter 'announcementId' when calling findOrganizationAnnouncement";
      }


      var pathParams = {
        'organizationId': organizationId,
        'announcementId': announcementId
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
      var returnType = Announcement;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/announcements/{announcementId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists organizations announcements
     * Lists organizations announcements 
     * @param {String} organizationId Organization id
     * @param {Object} opts Optional parameters
     * @param {String} opts.slug Filter with slug
     * @param {Integer} opts.firstResult first index of results
     * @param {Integer} opts.maxResults maximum number of results
     * @param {String} opts.sortBy PUBLICATION_DATE
     * @param {String} opts.sortDir ASC or DESC
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Announcement>}
     */
    this.listOrganizationAnnouncements = function(organizationId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationAnnouncements";
      }


      var pathParams = {
        'organizationId': organizationId
      };
      var queryParams = {
        'slug': opts['slug'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults'],
        'sortBy': opts['sortBy'],
        'sortDir': opts['sortDir']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Announcement];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/announcements', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
