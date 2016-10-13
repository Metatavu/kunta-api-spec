# KuntaApiClient.ServiceLocationChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceServiceLocationChannel**](ServiceLocationChannelsApi.md#createServiceServiceLocationChannel) | **POST** /services/{serviceId}/serviceLocationChannels | creates ServiceLocationChannel
[**findServiceServiceLocationChannel**](ServiceLocationChannelsApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
[**listServiceServiceLocationChannels**](ServiceLocationChannelsApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId
[**updateServiceLocationChannel**](ServiceLocationChannelsApi.md#updateServiceLocationChannel) | **PUT** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | Updates ServiceLocationChannel


<a name="createServiceServiceLocationChannel"></a>
# **createServiceServiceLocationChannel**
> ServiceLocationChannel createServiceServiceLocationChannel(serviceId, body)

creates ServiceLocationChannel

creates ServiceLocationChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceLocationChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.ServiceLocationChannel(); // ServiceLocationChannel | Payload

apiInstance.createServiceServiceLocationChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**ServiceLocationChannel**](ServiceLocationChannel.md)| Payload | 

### Return type

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceServiceLocationChannel"></a>
# **findServiceServiceLocationChannel**
> ServiceLocationChannel findServiceServiceLocationChannel(serviceId, serviceLocationChannelId)

finds ServiceLocationChannel by serviceLocationChannelId

finds ServiceLocationChannels by serviceLocationChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceServiceLocationChannels"></a>
# **listServiceServiceLocationChannels**
> [ServiceLocationChannel] listServiceServiceLocationChannels(serviceId, opts)

Lists ServiceLocationChannels by serviceId

Lists ServiceLocationChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**[ServiceLocationChannel]**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateServiceLocationChannel"></a>
# **updateServiceLocationChannel**
> ServiceLocationChannel updateServiceLocationChannel(serviceId, serviceLocationChannelId, body)

Updates ServiceLocationChannel

Updates ServiceLocationChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceLocationChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id

var body = new KuntaApiClient.ServiceLocationChannel(); // ServiceLocationChannel | Payload

apiInstance.updateServiceLocationChannel(serviceId, serviceLocationChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **serviceLocationChannelId** | **String**| serviceLocationChannel id | 
 **body** | [**ServiceLocationChannel**](ServiceLocationChannel.md)| Payload | 

### Return type

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

