# KuntaApiClient.PrintableFormChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServicePrintableFormChannel**](PrintableFormChannelsApi.md#createServicePrintableFormChannel) | **POST** /services/{serviceId}/printableFormChannels | creates PrintableFormChannel
[**findServicePrintableFormChannel**](PrintableFormChannelsApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
[**listServicePrintableFormChannels**](PrintableFormChannelsApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId
[**updatePrintableFormChannel**](PrintableFormChannelsApi.md#updatePrintableFormChannel) | **PUT** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | Updates PrintableFormChannel


<a name="createServicePrintableFormChannel"></a>
# **createServicePrintableFormChannel**
> PrintableFormChannel createServicePrintableFormChannel(serviceId, body)

creates PrintableFormChannel

creates PrintableFormChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.PrintableFormChannel(); // PrintableFormChannel | Payload

apiInstance.createServicePrintableFormChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**PrintableFormChannel**](PrintableFormChannel.md)| Payload | 

### Return type

[**PrintableFormChannel**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePrintableFormChannel"></a>
# **findServicePrintableFormChannel**
> PrintableFormChannel findServicePrintableFormChannel(serviceId, printableFormChannelId)

finds PrintableFormChannel by printableFormChannelId

finds PrintableFormChannels by printableFormChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id

apiInstance.findServicePrintableFormChannel(serviceId, printableFormChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **printableFormChannelId** | **String**| printableFormChannel id | 

### Return type

[**PrintableFormChannel**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePrintableFormChannels"></a>
# **listServicePrintableFormChannels**
> [PrintableFormChannel] listServicePrintableFormChannels(serviceId, opts)

Lists PrintableFormChannels by serviceId

Lists PrintableFormChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServicePrintableFormChannels(serviceId, opts).then(function(data) {
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

[**[PrintableFormChannel]**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePrintableFormChannel"></a>
# **updatePrintableFormChannel**
> PrintableFormChannel updatePrintableFormChannel(serviceId, printableFormChannelId, body)

Updates PrintableFormChannel

Updates PrintableFormChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id

var body = new KuntaApiClient.PrintableFormChannel(); // PrintableFormChannel | Payload

apiInstance.updatePrintableFormChannel(serviceId, printableFormChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **printableFormChannelId** | **String**| printableFormChannel id | 
 **body** | [**PrintableFormChannel**](PrintableFormChannel.md)| Payload | 

### Return type

[**PrintableFormChannel**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

