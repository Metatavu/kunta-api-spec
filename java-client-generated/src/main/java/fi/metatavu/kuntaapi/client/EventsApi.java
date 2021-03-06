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
import fi.metatavu.kuntaapi.client.model.Event;
import fi.metatavu.kuntaapi.client.model.Forbidden;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.Attachment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
    private ApiClient apiClient;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganizationEvent */
    private com.squareup.okhttp.Call findOrganizationEventCall(String organizationId, String eventId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationEvent(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling findOrganizationEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/events/{eventId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
     * Returns organizations event by id
     * Returns organizations event by id 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @return Event
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Event findOrganizationEvent(String organizationId, String eventId) throws ApiException {
        ApiResponse<Event> resp = findOrganizationEventWithHttpInfo(organizationId, eventId);
        return resp.getData();
    }

    /**
     * Returns organizations event by id
     * Returns organizations event by id 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @return ApiResponse&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Event> findOrganizationEventWithHttpInfo(String organizationId, String eventId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationEventCall(organizationId, eventId, null, null);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns organizations event by id (asynchronously)
     * Returns organizations event by id 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationEventAsync(String organizationId, String eventId, final ApiCallback<Event> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationEventCall(organizationId, eventId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Event>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for findOrganizationEventImage */
    private com.squareup.okhttp.Call findOrganizationEventImageCall(String organizationId, String eventId, String imageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationEventImage(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling findOrganizationEventImage(Async)");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new ApiException("Missing the required parameter 'imageId' when calling findOrganizationEventImage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/events/{eventId}/images/{imageId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()))
        .replaceAll("\\{" + "imageId" + "\\}", apiClient.escapeString(imageId.toString()));

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
     * Returns an event image
     * Returns an event image  
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @return Attachment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Attachment findOrganizationEventImage(String organizationId, String eventId, String imageId) throws ApiException {
        ApiResponse<Attachment> resp = findOrganizationEventImageWithHttpInfo(organizationId, eventId, imageId);
        return resp.getData();
    }

    /**
     * Returns an event image
     * Returns an event image  
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @return ApiResponse&lt;Attachment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Attachment> findOrganizationEventImageWithHttpInfo(String organizationId, String eventId, String imageId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationEventImageCall(organizationId, eventId, imageId, null, null);
        Type localVarReturnType = new TypeToken<Attachment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns an event image (asynchronously)
     * Returns an event image  
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationEventImageAsync(String organizationId, String eventId, String imageId, final ApiCallback<Attachment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationEventImageCall(organizationId, eventId, imageId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Attachment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOrganizationEventImageData */
    private com.squareup.okhttp.Call getOrganizationEventImageDataCall(String organizationId, String eventId, String imageId, Integer size, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling getOrganizationEventImageData(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getOrganizationEventImageData(Async)");
        }
        
        // verify the required parameter 'imageId' is set
        if (imageId == null) {
            throw new ApiException("Missing the required parameter 'imageId' when calling getOrganizationEventImageData(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/events/{eventId}/images/{imageId}/data".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()))
        .replaceAll("\\{" + "imageId" + "\\}", apiClient.escapeString(imageId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Returns an event image data
     * Returns an event image data 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @param size Maximum width or height of image (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] getOrganizationEventImageData(String organizationId, String eventId, String imageId, Integer size) throws ApiException {
        ApiResponse<byte[]> resp = getOrganizationEventImageDataWithHttpInfo(organizationId, eventId, imageId, size);
        return resp.getData();
    }

    /**
     * Returns an event image data
     * Returns an event image data 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @param size Maximum width or height of image (optional)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> getOrganizationEventImageDataWithHttpInfo(String organizationId, String eventId, String imageId, Integer size) throws ApiException {
        com.squareup.okhttp.Call call = getOrganizationEventImageDataCall(organizationId, eventId, imageId, size, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns an event image data (asynchronously)
     * Returns an event image data 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param imageId Event image id (required)
     * @param size Maximum width or height of image (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganizationEventImageDataAsync(String organizationId, String eventId, String imageId, Integer size, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganizationEventImageDataCall(organizationId, eventId, imageId, size, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationEventImages */
    private com.squareup.okhttp.Call listOrganizationEventImagesCall(String organizationId, String eventId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationEventImages(Async)");
        }
        
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling listOrganizationEventImages(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/events/{eventId}/images".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "eventId" + "\\}", apiClient.escapeString(eventId.toString()));

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
     * Returns list of event images
     * Returns list of event images 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @return List&lt;Attachment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Attachment> listOrganizationEventImages(String organizationId, String eventId) throws ApiException {
        ApiResponse<List<Attachment>> resp = listOrganizationEventImagesWithHttpInfo(organizationId, eventId);
        return resp.getData();
    }

    /**
     * Returns list of event images
     * Returns list of event images 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @return ApiResponse&lt;List&lt;Attachment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Attachment>> listOrganizationEventImagesWithHttpInfo(String organizationId, String eventId) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationEventImagesCall(organizationId, eventId, null, null);
        Type localVarReturnType = new TypeToken<List<Attachment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns list of event images (asynchronously)
     * Returns list of event images 
     * @param organizationId Organization id (required)
     * @param eventId Event id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationEventImagesAsync(String organizationId, String eventId, final ApiCallback<List<Attachment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationEventImagesCall(organizationId, eventId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Attachment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationEvents */
    private com.squareup.okhttp.Call listOrganizationEventsCall(String organizationId, String startBefore, String startAfter, String endBefore, String endAfter, Integer firstResult, Integer maxResults, String orderBy, String orderDir, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationEvents(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/events".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startBefore", startBefore));
        if (startAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startAfter", startAfter));
        if (endBefore != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endBefore", endBefore));
        if (endAfter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endAfter", endAfter));
        if (firstResult != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstResult", firstResult));
        if (maxResults != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxResults", maxResults));
        if (orderBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderBy", orderBy));
        if (orderDir != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderDir", orderDir));

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
     * Lists organizations events
     * Lists organizations events 
     * @param organizationId Organization id (required)
     * @param startBefore return only events starting before the date (optional)
     * @param startAfter return only events starting after the date (optional)
     * @param endBefore return only events ending before the date (optional)
     * @param endAfter return only events ending after the date (optional)
     * @param firstResult first index of results (optional)
     * @param maxResults maximum number of results (optional)
     * @param orderBy define order (startDate, endDate). Default is startDate (optional)
     * @param orderDir ascending, descending. Default is ascending (optional)
     * @return List&lt;Event&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Event> listOrganizationEvents(String organizationId, String startBefore, String startAfter, String endBefore, String endAfter, Integer firstResult, Integer maxResults, String orderBy, String orderDir) throws ApiException {
        ApiResponse<List<Event>> resp = listOrganizationEventsWithHttpInfo(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir);
        return resp.getData();
    }

    /**
     * Lists organizations events
     * Lists organizations events 
     * @param organizationId Organization id (required)
     * @param startBefore return only events starting before the date (optional)
     * @param startAfter return only events starting after the date (optional)
     * @param endBefore return only events ending before the date (optional)
     * @param endAfter return only events ending after the date (optional)
     * @param firstResult first index of results (optional)
     * @param maxResults maximum number of results (optional)
     * @param orderBy define order (startDate, endDate). Default is startDate (optional)
     * @param orderDir ascending, descending. Default is ascending (optional)
     * @return ApiResponse&lt;List&lt;Event&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Event>> listOrganizationEventsWithHttpInfo(String organizationId, String startBefore, String startAfter, String endBefore, String endAfter, Integer firstResult, Integer maxResults, String orderBy, String orderDir) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationEventsCall(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir, null, null);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations events (asynchronously)
     * Lists organizations events 
     * @param organizationId Organization id (required)
     * @param startBefore return only events starting before the date (optional)
     * @param startAfter return only events starting after the date (optional)
     * @param endBefore return only events ending before the date (optional)
     * @param endAfter return only events ending after the date (optional)
     * @param firstResult first index of results (optional)
     * @param maxResults maximum number of results (optional)
     * @param orderBy define order (startDate, endDate). Default is startDate (optional)
     * @param orderDir ascending, descending. Default is ascending (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationEventsAsync(String organizationId, String startBefore, String startAfter, String endBefore, String endAfter, Integer firstResult, Integer maxResults, String orderBy, String orderDir, final ApiCallback<List<Event>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationEventsCall(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Event>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
