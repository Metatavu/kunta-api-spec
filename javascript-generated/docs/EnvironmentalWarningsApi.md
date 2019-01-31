# KuntaApiClient.EnvironmentalWarningsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationEnvironmentalWarning**](EnvironmentalWarningsApi.md#findOrganizationEnvironmentalWarning) | **GET** /organizations/{organizationId}/environmentalWarnings/{environmentalWarningId} | Returns organizations environmental warning by id
[**listOrganizationEnvironmentalWarnings**](EnvironmentalWarningsApi.md#listOrganizationEnvironmentalWarnings) | **GET** /organizations/{organizationId}/environmentalWarnings | Lists organizations environmentalWarnings


<a name="findOrganizationEnvironmentalWarning"></a>
# **findOrganizationEnvironmentalWarning**
> EnvironmentalWarning findOrganizationEnvironmentalWarning(organizationId, environmentalWarningId)

Returns organizations environmental warning by id

Returns organizations environmental warning by id 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EnvironmentalWarningsApi();

var organizationId = "organizationId_example"; // String | Organization id

var environmentalWarningId = "environmentalWarningId_example"; // String | Environmental warning id

apiInstance.findOrganizationEnvironmentalWarning(organizationId, environmentalWarningId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **environmentalWarningId** | **String**| Environmental warning id | 

### Return type

[**EnvironmentalWarning**](EnvironmentalWarning.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEnvironmentalWarnings"></a>
# **listOrganizationEnvironmentalWarnings**
> [EnvironmentalWarning] listOrganizationEnvironmentalWarnings(organizationId, opts)

Lists organizations environmentalWarnings

Lists organizations environmentalWarnings 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EnvironmentalWarningsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'firstResult': 56, // Integer | First index of results
  'contexts': "contexts_example", // String | Return environmental warnings by contexts.
  'startBefore': "startBefore_example", // String | Return environmental warnings starting before specified time
  'startAfter': "startAfter_example", // String | Return environmental warnings starting after specified time
  'maxResults': 56, // Integer | Maximum number of results
  'sortBy': "sortBy_example", // String | define order (NATURAL, START). Default is NATURAL
  'sortDir': "sortDir_example" // String | ASC or DESC. Default is ASC
};
apiInstance.listOrganizationEnvironmentalWarnings(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **firstResult** | **Integer**| First index of results | [optional] 
 **contexts** | **String**| Return environmental warnings by contexts. | [optional] 
 **startBefore** | **String**| Return environmental warnings starting before specified time | [optional] 
 **startAfter** | **String**| Return environmental warnings starting after specified time | [optional] 
 **maxResults** | **Integer**| Maximum number of results | [optional] 
 **sortBy** | **String**| define order (NATURAL, START). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 

### Return type

[**[EnvironmentalWarning]**](EnvironmentalWarning.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

