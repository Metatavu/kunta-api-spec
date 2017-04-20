# KuntaApiClient.PrintableFormChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServicePrintableFormChannel**](PrintableFormChannelsApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
[**listServicePrintableFormChannels**](PrintableFormChannelsApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId


<a name="findServicePrintableFormChannel"></a>
# **findServicePrintableFormChannel**
> PrintableFormServiceChannel findServicePrintableFormChannel(serviceId, printableFormChannelId)

finds PrintableFormChannel by printableFormChannelId

finds PrintableFormChannels by printableFormChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePrintableFormChannels"></a>
# **listServicePrintableFormChannels**
> [PrintableFormServiceChannel] listServicePrintableFormChannels(serviceId, opts)

Lists PrintableFormChannels by serviceId

Lists PrintableFormChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[**[PrintableFormServiceChannel]**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

