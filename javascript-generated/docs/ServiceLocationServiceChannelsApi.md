# KuntaApiClient.ServiceLocationServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceLocationServiceChannel**](ServiceLocationServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
[**listServiceLocationServiceChannels**](ServiceLocationServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels


<a name="findServiceLocationServiceChannel"></a>
# **findServiceLocationServiceChannel**
> ServiceLocationServiceChannel findServiceLocationServiceChannel(serviceLocationServiceChannelId)

Finds a service location service by id

Finds a service location service by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceLocationServiceChannelsApi();

var serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id

apiInstance.findServiceLocationServiceChannel(serviceLocationServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceLocationServiceChannelId** | **String**| serviceLocationChannel id | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceLocationServiceChannels"></a>
# **listServiceLocationServiceChannels**
> [ServiceLocationServiceChannel] listServiceLocationServiceChannels(opts)

Lists service location service channels

Lists service location service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceLocationServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search service location channels by free-text query
  'sortOrder': "sortOrder_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceLocationServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search service location channels by free-text query | [optional] 
 **sortOrder** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ServiceLocationServiceChannel]**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

