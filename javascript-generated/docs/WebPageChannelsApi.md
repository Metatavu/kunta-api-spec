# KuntaApiClient.WebPageChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceWebPageChannel**](WebPageChannelsApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
[**listServiceWebPageChannels**](WebPageChannelsApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId


<a name="findServiceWebPageChannel"></a>
# **findServiceWebPageChannel**
> WebPageServiceChannel findServiceWebPageChannel(serviceId, webPageChannelId)

finds WebPageChannel by webPageChannelId

finds WebPageChannels by webPageChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.WebPageChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var webPageChannelId = "webPageChannelId_example"; // String | webPageChannel id

apiInstance.findServiceWebPageChannel(serviceId, webPageChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **webPageChannelId** | **String**| webPageChannel id | 

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceWebPageChannels"></a>
# **listServiceWebPageChannels**
> [WebPageServiceChannel] listServiceWebPageChannels(serviceId, opts)

Lists WebPageChannels by serviceId

Lists WebPageChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.WebPageChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceWebPageChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[WebPageServiceChannel]**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

