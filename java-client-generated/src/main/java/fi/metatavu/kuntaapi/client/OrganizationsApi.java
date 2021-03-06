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
import fi.metatavu.kuntaapi.client.model.Organization;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganizationsApi {
    private ApiClient apiClient;

    public OrganizationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganizationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganization */
    private com.squareup.okhttp.Call findOrganizationCall(String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganization(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

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
     * Find organization
     * Find organization
     * @param organizationId organization id (required)
     * @return Organization
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Organization findOrganization(String organizationId) throws ApiException {
        ApiResponse<Organization> resp = findOrganizationWithHttpInfo(organizationId);
        return resp.getData();
    }

    /**
     * Find organization
     * Find organization
     * @param organizationId organization id (required)
     * @return ApiResponse&lt;Organization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Organization> findOrganizationWithHttpInfo(String organizationId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationCall(organizationId, null, null);
        Type localVarReturnType = new TypeToken<Organization>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find organization (asynchronously)
     * Find organization
     * @param organizationId organization id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationAsync(String organizationId, final ApiCallback<Organization> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationCall(organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Organization>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizations */
    private com.squareup.okhttp.Call listOrganizationsCall(String businessName, String businessCode, String search, String sortBy, String sortDir, Long firstResult, Long maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/organizations".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (businessName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "businessName", businessName));
        if (businessCode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "businessCode", businessCode));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        if (sortDir != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDir", sortDir));
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
     * List organizations
     * List organizations
     * @param businessName Filter by organization&#39;s business name (optional)
     * @param businessCode Filter by organization&#39;s business code (optional)
     * @param search Search organizations by free-text query (optional)
     * @param sortBy define order (NATURAL or SCORE). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return List&lt;Organization&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Organization> listOrganizations(String businessName, String businessCode, String search, String sortBy, String sortDir, Long firstResult, Long maxResults) throws ApiException {
        ApiResponse<List<Organization>> resp = listOrganizationsWithHttpInfo(businessName, businessCode, search, sortBy, sortDir, firstResult, maxResults);
        return resp.getData();
    }

    /**
     * List organizations
     * List organizations
     * @param businessName Filter by organization&#39;s business name (optional)
     * @param businessCode Filter by organization&#39;s business code (optional)
     * @param search Search organizations by free-text query (optional)
     * @param sortBy define order (NATURAL or SCORE). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return ApiResponse&lt;List&lt;Organization&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Organization>> listOrganizationsWithHttpInfo(String businessName, String businessCode, String search, String sortBy, String sortDir, Long firstResult, Long maxResults) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationsCall(businessName, businessCode, search, sortBy, sortDir, firstResult, maxResults, null, null);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List organizations (asynchronously)
     * List organizations
     * @param businessName Filter by organization&#39;s business name (optional)
     * @param businessCode Filter by organization&#39;s business code (optional)
     * @param search Search organizations by free-text query (optional)
     * @param sortBy define order (NATURAL or SCORE). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationsAsync(String businessName, String businessCode, String search, String sortBy, String sortDir, Long firstResult, Long maxResults, final ApiCallback<List<Organization>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationsCall(businessName, businessCode, search, sortBy, sortDir, firstResult, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Organization>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
