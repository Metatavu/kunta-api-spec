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
import fi.metatavu.kuntaapi.client.model.EnvironmentalWarning;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvironmentalWarningsApi {
    private ApiClient apiClient;

    public EnvironmentalWarningsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EnvironmentalWarningsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganizationEnvironmentalWarning */
    private com.squareup.okhttp.Call findOrganizationEnvironmentalWarningCall(String organizationId, String environmentalWarningId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationEnvironmentalWarning(Async)");
        }
        
        // verify the required parameter 'environmentalWarningId' is set
        if (environmentalWarningId == null) {
            throw new ApiException("Missing the required parameter 'environmentalWarningId' when calling findOrganizationEnvironmentalWarning(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/environmentalWarnings/{environmentalWarningId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "environmentalWarningId" + "\\}", apiClient.escapeString(environmentalWarningId.toString()));

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
     * Returns organizations environmental warning by id
     * Returns organizations environmental warning by id 
     * @param organizationId Organization id (required)
     * @param environmentalWarningId Environmental warning id (required)
     * @return EnvironmentalWarning
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EnvironmentalWarning findOrganizationEnvironmentalWarning(String organizationId, String environmentalWarningId) throws ApiException {
        ApiResponse<EnvironmentalWarning> resp = findOrganizationEnvironmentalWarningWithHttpInfo(organizationId, environmentalWarningId);
        return resp.getData();
    }

    /**
     * Returns organizations environmental warning by id
     * Returns organizations environmental warning by id 
     * @param organizationId Organization id (required)
     * @param environmentalWarningId Environmental warning id (required)
     * @return ApiResponse&lt;EnvironmentalWarning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EnvironmentalWarning> findOrganizationEnvironmentalWarningWithHttpInfo(String organizationId, String environmentalWarningId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationEnvironmentalWarningCall(organizationId, environmentalWarningId, null, null);
        Type localVarReturnType = new TypeToken<EnvironmentalWarning>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns organizations environmental warning by id (asynchronously)
     * Returns organizations environmental warning by id 
     * @param organizationId Organization id (required)
     * @param environmentalWarningId Environmental warning id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationEnvironmentalWarningAsync(String organizationId, String environmentalWarningId, final ApiCallback<EnvironmentalWarning> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationEnvironmentalWarningCall(organizationId, environmentalWarningId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EnvironmentalWarning>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationEnvironmentalWarnings */
    private com.squareup.okhttp.Call listOrganizationEnvironmentalWarningsCall(String organizationId, Integer firstResult, String contexts, String before, String after, Integer maxResults, String sortBy, String sortDir, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationEnvironmentalWarnings(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/environmentalWarnings".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (firstResult != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstResult", firstResult));
        if (contexts != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "contexts", contexts));
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortBy", sortBy));
        if (sortDir != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDir", sortDir));

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
     * Lists organizations environmentalWarnings
     * Lists organizations environmentalWarnings 
     * @param organizationId Organization id (required)
     * @param firstResult First index of results (optional)
     * @param contexts Return environmental warnings by contexts. (optional)
     * @param before Return environmental warnings before specified time (optional)
     * @param after Return environmental warnings after specified time (optional)
     * @param maxResults Maximum number of results (optional)
     * @param sortBy define order (NATURAL, START). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @return List&lt;EnvironmentalWarning&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<EnvironmentalWarning> listOrganizationEnvironmentalWarnings(String organizationId, Integer firstResult, String contexts, String before, String after, Integer maxResults, String sortBy, String sortDir) throws ApiException {
        ApiResponse<List<EnvironmentalWarning>> resp = listOrganizationEnvironmentalWarningsWithHttpInfo(organizationId, firstResult, contexts, before, after, maxResults, sortBy, sortDir);
        return resp.getData();
    }

    /**
     * Lists organizations environmentalWarnings
     * Lists organizations environmentalWarnings 
     * @param organizationId Organization id (required)
     * @param firstResult First index of results (optional)
     * @param contexts Return environmental warnings by contexts. (optional)
     * @param before Return environmental warnings before specified time (optional)
     * @param after Return environmental warnings after specified time (optional)
     * @param maxResults Maximum number of results (optional)
     * @param sortBy define order (NATURAL, START). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @return ApiResponse&lt;List&lt;EnvironmentalWarning&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<EnvironmentalWarning>> listOrganizationEnvironmentalWarningsWithHttpInfo(String organizationId, Integer firstResult, String contexts, String before, String after, Integer maxResults, String sortBy, String sortDir) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationEnvironmentalWarningsCall(organizationId, firstResult, contexts, before, after, maxResults, sortBy, sortDir, null, null);
        Type localVarReturnType = new TypeToken<List<EnvironmentalWarning>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations environmentalWarnings (asynchronously)
     * Lists organizations environmentalWarnings 
     * @param organizationId Organization id (required)
     * @param firstResult First index of results (optional)
     * @param contexts Return environmental warnings by contexts. (optional)
     * @param before Return environmental warnings before specified time (optional)
     * @param after Return environmental warnings after specified time (optional)
     * @param maxResults Maximum number of results (optional)
     * @param sortBy define order (NATURAL, START). Default is NATURAL (optional)
     * @param sortDir ASC or DESC. Default is ASC (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationEnvironmentalWarningsAsync(String organizationId, Integer firstResult, String contexts, String before, String after, Integer maxResults, String sortBy, String sortDir, final ApiCallback<List<EnvironmentalWarning>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationEnvironmentalWarningsCall(organizationId, firstResult, contexts, before, after, maxResults, sortBy, sortDir, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<EnvironmentalWarning>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
