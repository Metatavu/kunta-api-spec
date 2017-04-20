# KuntaApiClient.ElectronicServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findElectronicServiceChannel**](ElectronicServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
[**listElectronicServiceChannels**](ElectronicServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels


<a name="findElectronicServiceChannel"></a>
# **findElectronicServiceChannel**
> ElectronicServiceChannel findElectronicServiceChannel(electronicServiceChannelId)

Finds an electronic service channel by id

Finds an electronic service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ElectronicServiceChannelsApi();

var electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id

apiInstance.findElectronicServiceChannel(electronicServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **electronicServiceChannelId** | **String**| electronicChannel id | 

### Return type

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listElectronicServiceChannels"></a>
# **listElectronicServiceChannels**
> [ElectronicServiceChannel] listElectronicServiceChannels(opts)

Lists electronic service channels

Lists electronic service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ElectronicServiceChannelsApi();

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listElectronicServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ElectronicServiceChannel]**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

