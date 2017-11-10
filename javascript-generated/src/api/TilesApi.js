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
    define(['ApiClient', 'model/BadRequest', 'model/Tile', 'model/Forbidden', 'model/InternalServerError', 'model/Attachment'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Tile'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/Attachment'));
  } else {
    // Browser globals (root is window)
    if (!root.KuntaApiClient) {
      root.KuntaApiClient = {};
    }
    root.KuntaApiClient.TilesApi = factory(root.KuntaApiClient.ApiClient, root.KuntaApiClient.BadRequest, root.KuntaApiClient.Tile, root.KuntaApiClient.Forbidden, root.KuntaApiClient.InternalServerError, root.KuntaApiClient.Attachment);
  }
}(this, function(ApiClient, BadRequest, Tile, Forbidden, InternalServerError, Attachment) {
  'use strict';

  /**
   * Tiles service.
   * @module api/TilesApi
   * @version 0.0.118
   */

  /**
   * Constructs a new TilesApi. 
   * @alias module:api/TilesApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds organizations tile
     * Finds single organization tile 
     * @param {String} organizationId Organization id
     * @param {String} tileId tile id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Tile}
     */
    this.findOrganizationTile = function(organizationId, tileId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationTile";
      }

      // verify the required parameter 'tileId' is set
      if (tileId == undefined || tileId == null) {
        throw "Missing the required parameter 'tileId' when calling findOrganizationTile";
      }


      var pathParams = {
        'organizationId': organizationId,
        'tileId': tileId
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
      var returnType = Tile;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/tiles/{tileId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns a single organiztion tile image
     * Returns a single organiztion tile image 
     * @param {String} organizationId Organization id
     * @param {String} tileId Tile Id
     * @param {String} imageId Tile image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Attachment}
     */
    this.findOrganizationTileImage = function(organizationId, tileId, imageId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling findOrganizationTileImage";
      }

      // verify the required parameter 'tileId' is set
      if (tileId == undefined || tileId == null) {
        throw "Missing the required parameter 'tileId' when calling findOrganizationTileImage";
      }

      // verify the required parameter 'imageId' is set
      if (imageId == undefined || imageId == null) {
        throw "Missing the required parameter 'imageId' when calling findOrganizationTileImage";
      }


      var pathParams = {
        'organizationId': organizationId,
        'tileId': tileId,
        'imageId': imageId
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
      var returnType = Attachment;

      return this.apiClient.callApi(
        '/organizations/{organizationId}/tiles/{tileId}/images/{imageId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns an organization tile image data
     * Returns an organization tile image data 
     * @param {String} organizationId Organization id
     * @param {String} tileId Tile id
     * @param {String} imageId Tile image id
     * @param {Object} opts Optional parameters
     * @param {Integer} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'String'}
     */
    this.getOrganizationTileImageData = function(organizationId, tileId, imageId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling getOrganizationTileImageData";
      }

      // verify the required parameter 'tileId' is set
      if (tileId == undefined || tileId == null) {
        throw "Missing the required parameter 'tileId' when calling getOrganizationTileImageData";
      }

      // verify the required parameter 'imageId' is set
      if (imageId == undefined || imageId == null) {
        throw "Missing the required parameter 'imageId' when calling getOrganizationTileImageData";
      }


      var pathParams = {
        'organizationId': organizationId,
        'tileId': tileId,
        'imageId': imageId
      };
      var queryParams = {
        'size': opts['size']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['basicAuth'];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/octet-stream'];
      var returnType = 'String';

      return this.apiClient.callApi(
        '/organizations/{organizationId}/tiles/{tileId}/images/{imageId}/data', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Returns a list of organization tile images
     * Returns a list of organization tile images 
     * @param {String} organizationId Organization id
     * @param {String} tileId Tile id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Attachment>}
     */
    this.listOrganizationTileImages = function(organizationId, tileId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationTileImages";
      }

      // verify the required parameter 'tileId' is set
      if (tileId == undefined || tileId == null) {
        throw "Missing the required parameter 'tileId' when calling listOrganizationTileImages";
      }


      var pathParams = {
        'organizationId': organizationId,
        'tileId': tileId
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
      var returnType = [Attachment];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/tiles/{tileId}/images', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


    /**
     * Lists organizations tiles
     * Lists organizations tiles 
     * @param {String} organizationId Organization id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Tile>}
     */
    this.listOrganizationTiles = function(organizationId) {
      var postBody = null;

      // verify the required parameter 'organizationId' is set
      if (organizationId == undefined || organizationId == null) {
        throw "Missing the required parameter 'organizationId' when calling listOrganizationTiles";
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
      var returnType = [Tile];

      return this.apiClient.callApi(
        '/organizations/{organizationId}/tiles', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }
  };

  return exports;
}));
