# KuntaApiClient.ServiceLocationChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceServiceLocationChannel**](ServiceLocationChannelsApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
[**listServiceServiceLocationChannels**](ServiceLocationChannelsApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId


<a name="findServiceServiceLocationChannel"></a>
# **findServiceServiceLocationChannel**
> ServiceLocationServiceChannel findServiceServiceLocationChannel(serviceId, serviceLocationChannelId)

finds ServiceLocationChannel by serviceLocationChannelId

finds ServiceLocationChannels by serviceLocationChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceLocationChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id

apiInstance.findServiceServiceLocationChannel(serviceId, serviceLocationChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **serviceLocationChannelId** | **String**| serviceLocationChannel id | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceServiceLocationChannels"></a>
# **listServiceServiceLocationChannels**
> [ServiceLocationServiceChannel] listServiceServiceLocationChannels(serviceId, opts)

Lists ServiceLocationChannels by serviceId

Lists ServiceLocationChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceLocationChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceServiceLocationChannels(serviceId, opts).then(function(data) {
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

[**[ServiceLocationServiceChannel]**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

