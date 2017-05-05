# KuntaApiClient.ElectronicChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceElectronicChannel**](ElectronicChannelsApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
[**listServiceElectronicChannels**](ElectronicChannelsApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId


<a name="findServiceElectronicChannel"></a>
# **findServiceElectronicChannel**
> ElectronicServiceChannel findServiceElectronicChannel(serviceId, electronicChannelId)

finds ElectronicChannel by electronicChannelId

finds ElectronicChannels by electronicChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceElectronicChannels"></a>
# **listServiceElectronicChannels**
> [ElectronicServiceChannel] listServiceElectronicChannels(serviceId, opts)

Lists ElectronicChannels by serviceId

Lists ElectronicChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

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

[**[ElectronicServiceChannel]**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

