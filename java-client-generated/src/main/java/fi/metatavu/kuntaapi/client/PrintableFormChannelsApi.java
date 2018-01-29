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
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.PrintableFormServiceChannel;
import fi.metatavu.kuntaapi.client.model.NotFound;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintableFormChannelsApi {
    private ApiClient apiClient;

    public PrintableFormChannelsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PrintableFormChannelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findServicePrintableFormChannel */
    private com.squareup.okhttp.Call findServicePrintableFormChannelCall(String serviceId, String printableFormChannelId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling findServicePrintableFormChannel(Async)");
        }
        
        // verify the required parameter 'printableFormChannelId' is set
        if (printableFormChannelId == null) {
            throw new ApiException("Missing the required parameter 'printableFormChannelId' when calling findServicePrintableFormChannel(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/services/{serviceId}/printableFormChannels/{printableFormChannelId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "serviceId" + "\\}", apiClient.escapeString(serviceId.toString()))
        .replaceAll("\\{" + "printableFormChannelId" + "\\}", apiClient.escapeString(printableFormChannelId.toString()));

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
     * finds PrintableFormChannel by printableFormChannelId
     * finds PrintableFormChannels by printableFormChannelId
     * @param serviceId Service id (required)
     * @param printableFormChannelId printableFormChannel id (required)
     * @return PrintableFormServiceChannel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PrintableFormServiceChannel findServicePrintableFormChannel(String serviceId, String printableFormChannelId) throws ApiException {
        ApiResponse<PrintableFormServiceChannel> resp = findServicePrintableFormChannelWithHttpInfo(serviceId, printableFormChannelId);
        return resp.getData();
    }

    /**
     * finds PrintableFormChannel by printableFormChannelId
     * finds PrintableFormChannels by printableFormChannelId
     * @param serviceId Service id (required)
     * @param printableFormChannelId printableFormChannel id (required)
     * @return ApiResponse&lt;PrintableFormServiceChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PrintableFormServiceChannel> findServicePrintableFormChannelWithHttpInfo(String serviceId, String printableFormChannelId) throws ApiException {
        com.squareup.okhttp.Call call = findServicePrintableFormChannelCall(serviceId, printableFormChannelId, null, null);
        Type localVarReturnType = new TypeToken<PrintableFormServiceChannel>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * finds PrintableFormChannel by printableFormChannelId (asynchronously)
     * finds PrintableFormChannels by printableFormChannelId
     * @param serviceId Service id (required)
     * @param printableFormChannelId printableFormChannel id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findServicePrintableFormChannelAsync(String serviceId, String printableFormChannelId, final ApiCallback<PrintableFormServiceChannel> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findServicePrintableFormChannelCall(serviceId, printableFormChannelId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PrintableFormServiceChannel>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listServicePrintableFormChannels */
    private com.squareup.okhttp.Call listServicePrintableFormChannelsCall(String serviceId, Long firstResult, Long maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new ApiException("Missing the required parameter 'serviceId' when calling listServicePrintableFormChannels(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/services/{serviceId}/printableFormChannels".replaceAll("\\{format\\}","json")
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
     * Lists PrintableFormChannels by serviceId
     * Lists PrintableFormChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return List&lt;PrintableFormServiceChannel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<PrintableFormServiceChannel> listServicePrintableFormChannels(String serviceId, Long firstResult, Long maxResults) throws ApiException {
        ApiResponse<List<PrintableFormServiceChannel>> resp = listServicePrintableFormChannelsWithHttpInfo(serviceId, firstResult, maxResults);
        return resp.getData();
    }

    /**
     * Lists PrintableFormChannels by serviceId
     * Lists PrintableFormChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return ApiResponse&lt;List&lt;PrintableFormServiceChannel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<PrintableFormServiceChannel>> listServicePrintableFormChannelsWithHttpInfo(String serviceId, Long firstResult, Long maxResults) throws ApiException {
        com.squareup.okhttp.Call call = listServicePrintableFormChannelsCall(serviceId, firstResult, maxResults, null, null);
        Type localVarReturnType = new TypeToken<List<PrintableFormServiceChannel>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists PrintableFormChannels by serviceId (asynchronously)
     * Lists PrintableFormChannels by serviceId
     * @param serviceId Service id (required)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listServicePrintableFormChannelsAsync(String serviceId, Long firstResult, Long maxResults, final ApiCallback<List<PrintableFormServiceChannel>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listServicePrintableFormChannelsCall(serviceId, firstResult, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<PrintableFormServiceChannel>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
