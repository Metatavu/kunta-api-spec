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


package fi.metatavu.kuntaapi.client;

import fi.metatavu.kuntaapi.ApiCallback;
import fi.metatavu.kuntaapi.ApiClient;
import fi.metatavu.kuntaapi.ApiException;
import fi.metatavu.kuntaapi.ApiResponse;
import fi.metatavu.kuntaapi.Configuration;
import fi.metatavu.kuntaapi.Pair;
import fi.metatavu.kuntaapi.ProgressRequestBody;
import fi.metatavu.kuntaapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import fi.metatavu.kuntaapi.client.model.BadRequest;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.Shortlink;
import fi.metatavu.kuntaapi.client.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShortlinksApi {
    private ApiClient apiClient;

    public ShortlinksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ShortlinksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganizationShortlink */
    private com.squareup.okhttp.Call findOrganizationShortlinkCall(String organizationId, String shortlinkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationShortlink(Async)");
        }
        
        // verify the required parameter 'shortlinkId' is set
        if (shortlinkId == null) {
            throw new ApiException("Missing the required parameter 'shortlinkId' when calling findOrganizationShortlink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/shortlinks/{shortlinkId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "shortlinkId" + "\\}", apiClient.escapeString(shortlinkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Finds organization shortlink
     * Finds single organization shortlink 
     * @param organizationId Organization id (required)
     * @param shortlinkId shortlink id (required)
     * @return Shortlink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Shortlink findOrganizationShortlink(String organizationId, String shortlinkId) throws ApiException {
        ApiResponse<Shortlink> resp = findOrganizationShortlinkWithHttpInfo(organizationId, shortlinkId);
        return resp.getData();
    }

    /**
     * Finds organization shortlink
     * Finds single organization shortlink 
     * @param organizationId Organization id (required)
     * @param shortlinkId shortlink id (required)
     * @return ApiResponse&lt;Shortlink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Shortlink> findOrganizationShortlinkWithHttpInfo(String organizationId, String shortlinkId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationShortlinkCall(organizationId, shortlinkId, null, null);
        Type localVarReturnType = new TypeToken<Shortlink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds organization shortlink (asynchronously)
     * Finds single organization shortlink 
     * @param organizationId Organization id (required)
     * @param shortlinkId shortlink id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationShortlinkAsync(String organizationId, String shortlinkId, final ApiCallback<Shortlink> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = findOrganizationShortlinkCall(organizationId, shortlinkId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Shortlink>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationShortlinks */
    private com.squareup.okhttp.Call listOrganizationShortlinksCall(String organizationId, String path, Long firstResult, Long maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationShortlinks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/shortlinks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (path != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "path", path));
        if (firstResult != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstResult", firstResult));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Lists organizations shortlinks
     * Lists organizations shortlinks 
     * @param organizationId Organization id (required)
     * @param path Filter results by path (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return List&lt;Shortlink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Shortlink> listOrganizationShortlinks(String organizationId, String path, Long firstResult, Long maxResults) throws ApiException {
        ApiResponse<List<Shortlink>> resp = listOrganizationShortlinksWithHttpInfo(organizationId, path, firstResult, maxResults);
        return resp.getData();
    }

    /**
     * Lists organizations shortlinks
     * Lists organizations shortlinks 
     * @param organizationId Organization id (required)
     * @param path Filter results by path (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return ApiResponse&lt;List&lt;Shortlink&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Shortlink>> listOrganizationShortlinksWithHttpInfo(String organizationId, String path, Long firstResult, Long maxResults) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationShortlinksCall(organizationId, path, firstResult, maxResults, null, null);
        Type localVarReturnType = new TypeToken<List<Shortlink>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations shortlinks (asynchronously)
     * Lists organizations shortlinks 
     * @param organizationId Organization id (required)
     * @param path Filter results by path (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationShortlinksAsync(String organizationId, String path, Long firstResult, Long maxResults, final ApiCallback<List<Shortlink>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listOrganizationShortlinksCall(organizationId, path, firstResult, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Shortlink>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
