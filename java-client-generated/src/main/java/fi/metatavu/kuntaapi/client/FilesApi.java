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
import fi.metatavu.kuntaapi.client.model.FileDef;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for deleteOrganizationFile */
    private com.squareup.okhttp.Call deleteOrganizationFileCall(String organizationId, String fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling deleteOrganizationFile(Async)");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling deleteOrganizationFile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/files/{fileId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes an organization file
     * Deletes single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOrganizationFile(String organizationId, String fileId) throws ApiException {
        deleteOrganizationFileWithHttpInfo(organizationId, fileId);
    }

    /**
     * Deletes an organization file
     * Deletes single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteOrganizationFileWithHttpInfo(String organizationId, String fileId) throws ApiException {
        com.squareup.okhttp.Call call = deleteOrganizationFileCall(organizationId, fileId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an organization file (asynchronously)
     * Deletes single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOrganizationFileAsync(String organizationId, String fileId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOrganizationFileCall(organizationId, fileId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for findOrganizationFile */
    private com.squareup.okhttp.Call findOrganizationFileCall(String organizationId, String fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationFile(Async)");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling findOrganizationFile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/files/{fileId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

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
     * Finds organizations file
     * Finds single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @return FileDef
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileDef findOrganizationFile(String organizationId, String fileId) throws ApiException {
        ApiResponse<FileDef> resp = findOrganizationFileWithHttpInfo(organizationId, fileId);
        return resp.getData();
    }

    /**
     * Finds organizations file
     * Finds single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @return ApiResponse&lt;FileDef&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileDef> findOrganizationFileWithHttpInfo(String organizationId, String fileId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationFileCall(organizationId, fileId, null, null);
        Type localVarReturnType = new TypeToken<FileDef>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds organizations file (asynchronously)
     * Finds single organization file 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationFileAsync(String organizationId, String fileId, final ApiCallback<FileDef> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationFileCall(organizationId, fileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileDef>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOrganizationFileData */
    private com.squareup.okhttp.Call getOrganizationFileDataCall(String organizationId, String fileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling getOrganizationFileData(Async)");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new ApiException("Missing the required parameter 'fileId' when calling getOrganizationFileData(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/files/{fileId}/data".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "fileId" + "\\}", apiClient.escapeString(fileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
     * Returns an organization file data
     * Returns an organization file data 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public byte[] getOrganizationFileData(String organizationId, String fileId) throws ApiException {
        ApiResponse<byte[]> resp = getOrganizationFileDataWithHttpInfo(organizationId, fileId);
        return resp.getData();
    }

    /**
     * Returns an organization file data
     * Returns an organization file data 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @return ApiResponse&lt;byte[]&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<byte[]> getOrganizationFileDataWithHttpInfo(String organizationId, String fileId) throws ApiException {
        com.squareup.okhttp.Call call = getOrganizationFileDataCall(organizationId, fileId, null, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns an organization file data (asynchronously)
     * Returns an organization file data 
     * @param organizationId Organization id (required)
     * @param fileId file id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganizationFileDataAsync(String organizationId, String fileId, final ApiCallback<byte[]> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganizationFileDataCall(organizationId, fileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationFiles */
    private com.squareup.okhttp.Call listOrganizationFilesCall(String organizationId, String pageId, String search, Long firstResult, Long maxResults, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationFiles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/files".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageId", pageId));
        if (search != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "search", search));
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
     * Lists organizations files
     * Lists organizations files 
     * @param organizationId Organization id (required)
     * @param pageId Filter with page (optional)
     * @param search Search files by free-text query (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return List&lt;FileDef&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FileDef> listOrganizationFiles(String organizationId, String pageId, String search, Long firstResult, Long maxResults) throws ApiException {
        ApiResponse<List<FileDef>> resp = listOrganizationFilesWithHttpInfo(organizationId, pageId, search, firstResult, maxResults);
        return resp.getData();
    }

    /**
     * Lists organizations files
     * Lists organizations files 
     * @param organizationId Organization id (required)
     * @param pageId Filter with page (optional)
     * @param search Search files by free-text query (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @return ApiResponse&lt;List&lt;FileDef&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FileDef>> listOrganizationFilesWithHttpInfo(String organizationId, String pageId, String search, Long firstResult, Long maxResults) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationFilesCall(organizationId, pageId, search, firstResult, maxResults, null, null);
        Type localVarReturnType = new TypeToken<List<FileDef>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations files (asynchronously)
     * Lists organizations files 
     * @param organizationId Organization id (required)
     * @param pageId Filter with page (optional)
     * @param search Search files by free-text query (optional)
     * @param firstResult First result (optional)
     * @param maxResults Max results (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationFilesAsync(String organizationId, String pageId, String search, Long firstResult, Long maxResults, final ApiCallback<List<FileDef>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationFilesCall(organizationId, pageId, search, firstResult, maxResults, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FileDef>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}