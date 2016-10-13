# KuntaApiClient.WebPageChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceWebPageChannel**](WebPageChannelsApi.md#createServiceWebPageChannel) | **POST** /services/{serviceId}/webPageChannels | creates WebPageChannel
[**findServiceWebPageChannel**](WebPageChannelsApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
[**listServiceWebPageChannels**](WebPageChannelsApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId
[**updateWebPageChannel**](WebPageChannelsApi.md#updateWebPageChannel) | **PUT** /services/{serviceId}/webPageChannels/{webPageChannelId} | Updates WebPageChannel


<a name="createServiceWebPageChannel"></a>
# **createServiceWebPageChannel**
> WebPageChannel createServiceWebPageChannel(serviceId, body)

creates WebPageChannel

creates WebPageChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.WebPageChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.WebPageChannel(); // WebPageChannel | Payload

apiInstance.createServiceWebPageChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**WebPageChannel**](WebPageChannel.md)| Payload | 

### Return type

[**WebPageChannel**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceWebPageChannel"></a>
# **findServiceWebPageChannel**
> WebPageChannel findServiceWebPageChannel(serviceId, webPageChannelId)

finds WebPageChannel by webPageChannelId

finds WebPageChannels by webPageChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**WebPageChannel**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceWebPageChannels"></a>
# **listServiceWebPageChannels**
> [WebPageChannel] listServiceWebPageChannels(serviceId, opts)

Lists WebPageChannels by serviceId

Lists WebPageChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**[WebPageChannel]**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateWebPageChannel"></a>
# **updateWebPageChannel**
> WebPageChannel updateWebPageChannel(serviceId, webPageChannelId, body)

Updates WebPageChannel

Updates WebPageChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.WebPageChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var webPageChannelId = "webPageChannelId_example"; // String | webPageChannel id

var body = new KuntaApiClient.WebPageChannel(); // WebPageChannel | Payload

apiInstance.updateWebPageChannel(serviceId, webPageChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **webPageChannelId** | **String**| webPageChannel id | 
 **body** | [**WebPageChannel**](WebPageChannel.md)| Payload | 

### Return type

[**WebPageChannel**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

