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
import fi.metatavu.kuntaapi.client.model.Menu;
import fi.metatavu.kuntaapi.client.model.InternalServerError;
import fi.metatavu.kuntaapi.client.model.MenuItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenusApi {
    private ApiClient apiClient;

    public MenusApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MenusApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for findOrganizationMenu */
    private com.squareup.okhttp.Call findOrganizationMenuCall(String organizationId, String menuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationMenu(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling findOrganizationMenu(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/menus/{menuId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "menuId" + "\\}", apiClient.escapeString(menuId.toString()));

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
     * Finds organizations menu
     * Finds single organization menu 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @return Menu
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Menu findOrganizationMenu(String organizationId, String menuId) throws ApiException {
        ApiResponse<Menu> resp = findOrganizationMenuWithHttpInfo(organizationId, menuId);
        return resp.getData();
    }

    /**
     * Finds organizations menu
     * Finds single organization menu 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @return ApiResponse&lt;Menu&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Menu> findOrganizationMenuWithHttpInfo(String organizationId, String menuId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationMenuCall(organizationId, menuId, null, null);
        Type localVarReturnType = new TypeToken<Menu>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds organizations menu (asynchronously)
     * Finds single organization menu 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationMenuAsync(String organizationId, String menuId, final ApiCallback<Menu> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationMenuCall(organizationId, menuId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Menu>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for findOrganizationMenuItem */
    private com.squareup.okhttp.Call findOrganizationMenuItemCall(String organizationId, String menuId, String menuItemId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling findOrganizationMenuItem(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling findOrganizationMenuItem(Async)");
        }
        
        // verify the required parameter 'menuItemId' is set
        if (menuItemId == null) {
            throw new ApiException("Missing the required parameter 'menuItemId' when calling findOrganizationMenuItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/menus/{menuId}/items/{menuItemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "menuId" + "\\}", apiClient.escapeString(menuId.toString()))
        .replaceAll("\\{" + "menuItemId" + "\\}", apiClient.escapeString(menuItemId.toString()));

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
     * Finds organization menu item
     * Finds single organization menu item 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @param menuItemId menu item id (required)
     * @return MenuItem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MenuItem findOrganizationMenuItem(String organizationId, String menuId, String menuItemId) throws ApiException {
        ApiResponse<MenuItem> resp = findOrganizationMenuItemWithHttpInfo(organizationId, menuId, menuItemId);
        return resp.getData();
    }

    /**
     * Finds organization menu item
     * Finds single organization menu item 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @param menuItemId menu item id (required)
     * @return ApiResponse&lt;MenuItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MenuItem> findOrganizationMenuItemWithHttpInfo(String organizationId, String menuId, String menuItemId) throws ApiException {
        com.squareup.okhttp.Call call = findOrganizationMenuItemCall(organizationId, menuId, menuItemId, null, null);
        Type localVarReturnType = new TypeToken<MenuItem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Finds organization menu item (asynchronously)
     * Finds single organization menu item 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @param menuItemId menu item id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findOrganizationMenuItemAsync(String organizationId, String menuId, String menuItemId, final ApiCallback<MenuItem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findOrganizationMenuItemCall(organizationId, menuId, menuItemId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MenuItem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationMenuItems */
    private com.squareup.okhttp.Call listOrganizationMenuItemsCall(String organizationId, String menuId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationMenuItems(Async)");
        }
        
        // verify the required parameter 'menuId' is set
        if (menuId == null) {
            throw new ApiException("Missing the required parameter 'menuId' when calling listOrganizationMenuItems(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/menus/{menuId}/items".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
        .replaceAll("\\{" + "menuId" + "\\}", apiClient.escapeString(menuId.toString()));

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
     * Lists organizations menu items
     * Lists organization menu items 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @return List&lt;MenuItem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MenuItem> listOrganizationMenuItems(String organizationId, String menuId) throws ApiException {
        ApiResponse<List<MenuItem>> resp = listOrganizationMenuItemsWithHttpInfo(organizationId, menuId);
        return resp.getData();
    }

    /**
     * Lists organizations menu items
     * Lists organization menu items 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @return ApiResponse&lt;List&lt;MenuItem&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MenuItem>> listOrganizationMenuItemsWithHttpInfo(String organizationId, String menuId) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationMenuItemsCall(organizationId, menuId, null, null);
        Type localVarReturnType = new TypeToken<List<MenuItem>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations menu items (asynchronously)
     * Lists organization menu items 
     * @param organizationId Organization id (required)
     * @param menuId menu id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationMenuItemsAsync(String organizationId, String menuId, final ApiCallback<List<MenuItem>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationMenuItemsCall(organizationId, menuId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MenuItem>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listOrganizationMenus */
    private com.squareup.okhttp.Call listOrganizationMenusCall(String organizationId, String slug, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling listOrganizationMenus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/menus".replaceAll("\\{format\\}","json")
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
     * Lists organizations menus
     * Lists organizations menus 
     * @param organizationId Organization id (required)
     * @param slug Filter with slug (optional)
     * @return List&lt;Menu&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Menu> listOrganizationMenus(String organizationId, String slug) throws ApiException {
        ApiResponse<List<Menu>> resp = listOrganizationMenusWithHttpInfo(organizationId, slug);
        return resp.getData();
    }

    /**
     * Lists organizations menus
     * Lists organizations menus 
     * @param organizationId Organization id (required)
     * @param slug Filter with slug (optional)
     * @return ApiResponse&lt;List&lt;Menu&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Menu>> listOrganizationMenusWithHttpInfo(String organizationId, String slug) throws ApiException {
        com.squareup.okhttp.Call call = listOrganizationMenusCall(organizationId, slug, null, null);
        Type localVarReturnType = new TypeToken<List<Menu>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Lists organizations menus (asynchronously)
     * Lists organizations menus 
     * @param organizationId Organization id (required)
     * @param slug Filter with slug (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listOrganizationMenusAsync(String organizationId, String slug, final ApiCallback<List<Menu>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listOrganizationMenusCall(organizationId, slug, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Menu>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
