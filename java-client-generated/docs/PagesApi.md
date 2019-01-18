# PagesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganizationPage**](PagesApi.md#deleteOrganizationPage) | **DELETE** /organizations/{organizationId}/pages/{pageId} | Deletes an organizations page
[**findOrganizationPage**](PagesApi.md#findOrganizationPage) | **GET** /organizations/{organizationId}/pages/{pageId} | Finds organizations page
[**findOrganizationPageContent**](PagesApi.md#findOrganizationPageContent) | **GET** /organizations/{organizationId}/pages/{pageId}/content | Returns organizations page content in all available languages
[**findOrganizationPageImage**](PagesApi.md#findOrganizationPageImage) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId} | Returns a single organiztion page image
[**getOrganizationPageImageData**](PagesApi.md#getOrganizationPageImageData) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId}/data | Returns an organization page image data
[**listOrganizationPageImages**](PagesApi.md#listOrganizationPageImages) | **GET** /organizations/{organizationId}/pages/{pageId}/images | Returns a list of organization page images
[**listOrganizationPages**](PagesApi.md#listOrganizationPages) | **GET** /organizations/{organizationId}/pages | Lists organizations pages


<a name="deleteOrganizationPage"></a>
# **deleteOrganizationPage**
> deleteOrganizationPage(organizationId, pageId)

Deletes an organizations page

Deletes single organization page 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | page id
try {
    apiInstance.deleteOrganizationPage(organizationId, pageId);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#deleteOrganizationPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| page id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPage"></a>
# **findOrganizationPage**
> Page findOrganizationPage(organizationId, pageId)

Finds organizations page

Finds single organization page 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | page id
try {
    Page result = apiInstance.findOrganizationPage(organizationId, pageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#findOrganizationPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| page id |

### Return type

[**Page**](Page.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPageContent"></a>
# **findOrganizationPageContent**
> List&lt;LocalizedValue&gt; findOrganizationPageContent(organizationId, pageId)

Returns organizations page content in all available languages

Returns single organization page content in all available languages 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | page id
try {
    List<LocalizedValue> result = apiInstance.findOrganizationPageContent(organizationId, pageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#findOrganizationPageContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| page id |

### Return type

[**List&lt;LocalizedValue&gt;**](LocalizedValue.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPageImage"></a>
# **findOrganizationPageImage**
> Attachment findOrganizationPageImage(organizationId, pageId, imageId)

Returns a single organiztion page image

Returns a single organiztion page image 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | Page Id
String imageId = "imageId_example"; // String | Page image id
try {
    Attachment result = apiInstance.findOrganizationPageImage(organizationId, pageId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#findOrganizationPageImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| Page Id |
 **imageId** | **String**| Page image id |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationPageImageData"></a>
# **getOrganizationPageImageData**
> byte[] getOrganizationPageImageData(organizationId, pageId, imageId, size)

Returns an organization page image data

Returns an organization page image data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | Page id
String imageId = "imageId_example"; // String | Page image id
Integer size = 56; // Integer | Maximum width or height of image
try {
    byte[] result = apiInstance.getOrganizationPageImageData(organizationId, pageId, imageId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#getOrganizationPageImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| Page id |
 **imageId** | **String**| Page image id |
 **size** | **Integer**| Maximum width or height of image | [optional]

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationPageImages"></a>
# **listOrganizationPageImages**
> List&lt;Attachment&gt; listOrganizationPageImages(organizationId, pageId, type)

Returns a list of organization page images

Returns a list of organization page images 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | Page id
String type = "type_example"; // String | Filter by type
try {
    List<Attachment> result = apiInstance.listOrganizationPageImages(organizationId, pageId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#listOrganizationPageImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| Page id |
 **type** | **String**| Filter by type | [optional]

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPages"></a>
# **listOrganizationPages**
> List&lt;Page&gt; listOrganizationPages(organizationId, parentId, path, search, sortBy, sortDir, firstResult, maxResults)

Lists organizations pages

Lists organizations pages 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PagesApi apiInstance = new PagesApi();
String organizationId = "organizationId_example"; // String | Organization id
String parentId = "parentId_example"; // String | Filter results by parent id
String path = "path_example"; // String | Filter results by page path
String search = "search_example"; // String | Search pages by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL, SCORE or MENU). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<Page> result = apiInstance.listOrganizationPages(organizationId, parentId, path, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagesApi#listOrganizationPages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **parentId** | **String**| Filter results by parent id | [optional]
 **path** | **String**| Filter results by page path | [optional]
 **search** | **String**| Search pages by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL, SCORE or MENU). Default is NATURAL | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;Page&gt;**](Page.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

