# KuntaApiClient.PagesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationPage**](PagesApi.md#findOrganizationPage) | **GET** /organizations/{organizationId}/pages/{pageId} | Finds organizations page
[**findOrganizationPageContent**](PagesApi.md#findOrganizationPageContent) | **GET** /organizations/{organizationId}/pages/{pageId}/content | Returns organizations page content in all available languages
[**findOrganizationPageImage**](PagesApi.md#findOrganizationPageImage) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId} | Returns a single organiztion page image
[**getOrganizationPageImageData**](PagesApi.md#getOrganizationPageImageData) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId}/data | Returns an organization page image data
[**listOrganizationPageImages**](PagesApi.md#listOrganizationPageImages) | **GET** /organizations/{organizationId}/pages/{pageId}/images | Returns a list of organization page images
[**listOrganizationPages**](PagesApi.md#listOrganizationPages) | **GET** /organizations/{organizationId}/pages | Lists organizations pages


<a name="findOrganizationPage"></a>
# **findOrganizationPage**
> Page findOrganizationPage(organizationId, pageId)

Finds organizations page

Finds single organization page 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var pageId = "pageId_example"; // String | page id

apiInstance.findOrganizationPage(organizationId, pageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **pageId** | **String**| page id | 

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPageContent"></a>
# **findOrganizationPageContent**
> [LocalizedValue] findOrganizationPageContent(organizationId, pageId)

Returns organizations page content in all available languages

Returns single organization page content in all available languages 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var pageId = "pageId_example"; // String | page id

apiInstance.findOrganizationPageContent(organizationId, pageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **pageId** | **String**| page id | 

### Return type

[**[LocalizedValue]**](LocalizedValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPageImage"></a>
# **findOrganizationPageImage**
> Attachment findOrganizationPageImage(organizationId, pageId, imageId)

Returns a single organiztion page image

Returns a single organiztion page image 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var pageId = "pageId_example"; // String | Page Id

var imageId = "imageId_example"; // String | Page image id

apiInstance.findOrganizationPageImage(organizationId, pageId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationPageImageData"></a>
# **getOrganizationPageImageData**
> &#39;String&#39; getOrganizationPageImageData(organizationId, pageId, imageId, opts)

Returns an organization page image data

Returns an organization page image data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var pageId = "pageId_example"; // String | Page id

var imageId = "imageId_example"; // String | Page image id

var opts = { 
  'size': 56 // Integer | Maximum width or height of image
};
apiInstance.getOrganizationPageImageData(organizationId, pageId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **pageId** | **String**| Page id | 
 **imageId** | **String**| Page image id | 
 **size** | **Integer**| Maximum width or height of image | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationPageImages"></a>
# **listOrganizationPageImages**
> [Attachment] listOrganizationPageImages(organizationId, pageId, opts)

Returns a list of organization page images

Returns a list of organization page images 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var pageId = "pageId_example"; // String | Page id

var opts = { 
  'type': "type_example" // String | Filter by type
};
apiInstance.listOrganizationPageImages(organizationId, pageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **pageId** | **String**| Page id | 
 **type** | **String**| Filter by type | [optional] 

### Return type

[**[Attachment]**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPages"></a>
# **listOrganizationPages**
> [Page] listOrganizationPages(organizationId, opts)

Lists organizations pages

Lists organizations pages 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PagesApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'parentId': "parentId_example", // String | Filter results by parent id
  'path': "path_example", // String | Filter results by page path
  'search': "search_example", // String | Search pages by free-text query
  'sortBy': "sortBy_example", // String | Sort results (TITLE)
  'sortDir': "sortDir_example", // String | ASCENDING or DESCENDING
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationPages(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **parentId** | **String**| Filter results by parent id | [optional] 
 **path** | **String**| Filter results by page path | [optional] 
 **search** | **String**| Search pages by free-text query | [optional] 
 **sortBy** | **String**| Sort results (TITLE) | [optional] 
 **sortDir** | **String**| ASCENDING or DESCENDING | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Page]**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

