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
import fi.metatavu.kuntaapi.client.model.Fragment;
import fi.metatavu.kuntaapi.client.model.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FragmentsApi {
    private ApiClient apiClient;

    public FragmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FragmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganizationFragment */
    private com.squareup.okhttp.Call findOrganizationFragmentCall(String organizationId, String fragmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationFragment(Async)");
        }
        
        // verify the required parameter 'fragmentId' is set
        if (fragmentId == null) {
            throw new ApiException("Missing the required parameter 'fragmentId' when calling findOrganizationFragment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/fragments/{fragmentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "fragmentId" + "\\}", apiClient.escapeString(fragmentId.toString()));

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
     * Finds organizations page fragment
     * Finds single organization page fragment 
     * @param organizationId Organization id (required)
     * @param fragmentId fragment id (required)
     * @return Fragment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Fragment findOrganizationFragment(String organizationId, String fragmentId) throws ApiException {
        ApiResponse<Fragment> resp = findOrganizationFragmentWithHttpInfo(organizationId, fragmentId);
        return resp.getData();
    }

    /**
     * Finds organizations page fragment
     * Finds single organization page fragment 
     * @param organizationId Organization id (required)
     * @param fragmentId fragment id (required)
     * @return ApiResponse&lt;Fragment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Fragment> findOrganizationFragmentWithHttpInfo(String organizationId, String fragmentId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationFragmentCall(organizationId, fragmentId, null, null);
        Type localVarReturnType = new TypeToken<Fragment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds organizations page fragment (asynchronously)
     * Finds single organization page fragment 
     * @param organizationId Organization id (required)
     * @param fragmentId fragment id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationFragmentAsync(String organizationId, String fragmentId, final ApiCallback<Fragment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationFragmentCall(organizationId, fragmentId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Fragment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationFragments */
    private com.squareup.okhttp.Call listOrganizationFragmentsCall(String organizationId, String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationFragments(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/fragments".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (slug != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "slug", slug));

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
     * Lists organizations page fragments
     * Lists organizations page fragments 
     * @param organizationId Organization id (required)
     * @param slug Filter results by fragment slug (optional)
     * @return List&lt;Fragment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Fragment> listOrganizationFragments(String organizationId, String slug) throws ApiException {
        ApiResponse<List<Fragment>> resp = listOrganizationFragmentsWithHttpInfo(organizationId, slug);
        return resp.getData();
    }

    /**
     * Lists organizations page fragments
     * Lists organizations page fragments 
     * @param organizationId Organization id (required)
     * @param slug Filter results by fragment slug (optional)
     * @return ApiResponse&lt;List&lt;Fragment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Fragment>> listOrganizationFragmentsWithHttpInfo(String organizationId, String slug) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationFragmentsCall(organizationId, slug, null, null);
        Type localVarReturnType = new TypeToken<List<Fragment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations page fragments (asynchronously)
     * Lists organizations page fragments 
     * @param organizationId Organization id (required)
     * @param slug Filter results by fragment slug (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationFragmentsAsync(String organizationId, String slug, final ApiCallback<List<Fragment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationFragmentsCall(organizationId, slug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Fragment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
