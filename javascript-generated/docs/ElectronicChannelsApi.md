# KuntaApiClient.ElectronicChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceElectronicChannel**](ElectronicChannelsApi.md#createServiceElectronicChannel) | **POST** /services/{serviceId}/electronicChannels | creates ElectronicChannel
[**findServiceElectronicChannel**](ElectronicChannelsApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
[**listServiceElectronicChannels**](ElectronicChannelsApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId
[**updateServiceElectronicChannel**](ElectronicChannelsApi.md#updateServiceElectronicChannel) | **PUT** /services/{serviceId}/electronicChannels/{electronicChannelId} | Updates ElectronicChannel


<a name="createServiceElectronicChannel"></a>
# **createServiceElectronicChannel**
> ElectronicChannel createServiceElectronicChannel(serviceId, body)

creates ElectronicChannel

creates ElectronicChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ElectronicChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.ElectronicChannel(); // ElectronicChannel | Payload

apiInstance.createServiceElectronicChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**ElectronicChannel**](ElectronicChannel.md)| Payload | 

### Return type

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceElectronicChannel"></a>
# **findServiceElectronicChannel**
> ElectronicChannel findServiceElectronicChannel(serviceId, electronicChannelId)

finds ElectronicChannel by electronicChannelId

finds ElectronicChannels by electronicChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ElectronicChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id

apiInstance.findServiceElectronicChannel(serviceId, electronicChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **electronicChannelId** | **String**| electronicChannel id | 

### Return type

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceElectronicChannels"></a>
# **listServiceElectronicChannels**
> [ElectronicChannel] listServiceElectronicChannels(serviceId, opts)

Lists ElectronicChannels by serviceId

Lists ElectronicChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ElectronicChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceElectronicChannels(serviceId, opts).then(function(data) {
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

[**[ElectronicChannel]**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateServiceElectronicChannel"></a>
# **updateServiceElectronicChannel**
> ElectronicChannel updateServiceElectronicChannel(serviceId, electronicChannelId, body)

Updates ElectronicChannel

Updates ElectronicChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ElectronicChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id

var body = new KuntaApiClient.ElectronicChannel(); // ElectronicChannel | Payload

apiInstance.updateServiceElectronicChannel(serviceId, electronicChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **electronicChannelId** | **String**| electronicChannel id | 
 **body** | [**ElectronicChannel**](ElectronicChannel.md)| Payload | 

### Return type

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

