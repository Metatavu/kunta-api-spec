# KuntaApiClient.FilesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationFile**](FilesApi.md#findOrganizationFile) | **GET** /organizations/{organizationId}/files/{fileId} | Finds organizations file
[**getOrganizationFileData**](FilesApi.md#getOrganizationFileData) | **GET** /organizations/{organizationId}/files/{fileId}/data | Returns an organization file data
[**listOrganizationFiles**](FilesApi.md#listOrganizationFiles) | **GET** /organizations/{organizationId}/files | Lists organizations files


<a name="findOrganizationFile"></a>
# **findOrganizationFile**
> FileDef findOrganizationFile(organizationId, fileId)

Finds organizations file

Finds single organization file 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.FilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var fileId = "fileId_example"; // String | file id

apiInstance.findOrganizationFile(organizationId, fileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **fileId** | **String**| file id | 

### Return type

[**FileDef**](FileDef.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationFileData"></a>
# **getOrganizationFileData**
> &#39;String&#39; getOrganizationFileData(organizationId, fileId)

Returns an organization file data

Returns an organization file data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.FilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var fileId = "fileId_example"; // String | file id

apiInstance.getOrganizationFileData(organizationId, fileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **fileId** | **String**| file id | 

### Return type

**&#39;String&#39;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationFiles"></a>
# **listOrganizationFiles**
> [FileDef] listOrganizationFiles(organizationId, opts)

Lists organizations files

Lists organizations files 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.FilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'pageId': "pageId_example", // String | Filter with page
  'search': "search_example", // String | Search files by free-text query
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationFiles(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **pageId** | **String**| Filter with page | [optional] 
 **search** | **String**| Search files by free-text query | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[FileDef]**](FileDef.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

