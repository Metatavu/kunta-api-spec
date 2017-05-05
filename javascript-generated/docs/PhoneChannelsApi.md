# KuntaApiClient.PhoneChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServicePhoneChannel**](PhoneChannelsApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
[**listServicePhoneChannels**](PhoneChannelsApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId


<a name="findServicePhoneChannel"></a>
# **findServicePhoneChannel**
> PhoneServiceChannel findServicePhoneChannel(serviceId, phoneChannelId)

finds PhoneChannel by phoneChannelId

finds PhoneChannels by phoneChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.PhoneChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id

apiInstance.findServicePhoneChannel(serviceId, phoneChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **phoneChannelId** | **String**| phoneChannel id | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePhoneChannels"></a>
# **listServicePhoneChannels**
> [PhoneServiceChannel] listServicePhoneChannels(serviceId, opts)

Lists PhoneChannels by serviceId

Lists PhoneChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.PhoneChannelsApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServicePhoneChannels(serviceId, opts).then(function(data) {
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

[**[PhoneServiceChannel]**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

