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
import fi.metatavu.kuntaapi.client.model.ElectronicServiceChannel;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.NotFound;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicChannelsApi {
    private ApiClient apiClient;

    public ElectronicChannelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ElectronicChannelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findServiceElectronicChannel */
    private com.squareup.okhttp.Call findServiceElectronicChannelCall(String serviceId, String electronicChannelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling findServiceElectronicChannel(Async)");
        }
        
        // verify the required parameter 'electronicChannelId' is set
        if (electronicChannelId == null) {
            throw new ApiException("Missing the required parameter 'electronicChannelId' when calling findServiceElectronicChannel(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/services/{serviceId}/electronicChannels/{electronicChannelId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()))
        .replaceAll("\\{" + "electronicChannelId" + "\\}", apiClient.escapeString(electronicChannelId.toString()));

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
     * finds ElectronicChannel by electronicChannelId
     * finds ElectronicChannels by electronicChannelId
     * @param serviceId Service id (required)
     * @param electronicChannelId electronicChannel id (required)
     * @return ElectronicServiceChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ElectronicServiceChannel findServiceElectronicChannel(String serviceId, String electronicChannelId) throws ApiException {
        ApiResponse<ElectronicServiceChannel> resp = findServiceElectronicChannelWithHttpInfo(serviceId, electronicChannelId);
        return resp.getData();
    }

    /**
     * finds ElectronicChannel by electronicChannelId
     * finds ElectronicChannels by electronicChannelId
     * @param serviceId Service id (required)
     * @param electronicChannelId electronicChannel id (required)
     * @return ApiResponse&lt;ElectronicServiceChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ElectronicServiceChannel> findServiceElectronicChannelWithHttpInfo(String serviceId, String electronicChannelId) throws ApiException {
        com.squareup.okhttp.Call call = findServiceElectronicChannelCall(serviceId, electronicChannelId, null, null);
        Type localVarReturnType = new TypeToken<ElectronicServiceChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * finds ElectronicChannel by electronicChannelId (asynchronously)
     * finds ElectronicChannels by electronicChannelId
     * @param serviceId Service id (required)
     * @param electronicChannelId electronicChannel id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findServiceElectronicChannelAsync(String serviceId, String electronicChannelId, final ApiCallback<ElectronicServiceChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findServiceElectronicChannelCall(serviceId, electronicChannelId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ElectronicServiceChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listServiceElectronicChannels */
    private com.squareup.okhttp.Call listServiceElectronicChannelsCall(String serviceId, Long firstResult, Long maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling listServiceElectronicChannels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/services/{serviceId}/electronicChannels".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * Lists ElectronicChannels by serviceId
     * Lists ElectronicChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return List&lt;ElectronicServiceChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ElectronicServiceChannel> listServiceElectronicChannels(String serviceId, Long firstResult, Long maxResults) throws ApiException {
        ApiResponse<List<ElectronicServiceChannel>> resp = listServiceElectronicChannelsWithHttpInfo(serviceId, firstResult, maxResults);
        return resp.getData();
    }

    /**
     * Lists ElectronicChannels by serviceId
     * Lists ElectronicChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return ApiResponse&lt;List&lt;ElectronicServiceChannel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ElectronicServiceChannel>> listServiceElectronicChannelsWithHttpInfo(String serviceId, Long firstResult, Long maxResults) throws ApiException {
        com.squareup.okhttp.Call call = listServiceElectronicChannelsCall(serviceId, firstResult, maxResults, null, null);
        Type localVarReturnType = new TypeToken<List<ElectronicServiceChannel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists ElectronicChannels by serviceId (asynchronously)
     * Lists ElectronicChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listServiceElectronicChannelsAsync(String serviceId, Long firstResult, Long maxResults, final ApiCallback<List<ElectronicServiceChannel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listServiceElectronicChannelsCall(serviceId, firstResult, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ElectronicServiceChannel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
