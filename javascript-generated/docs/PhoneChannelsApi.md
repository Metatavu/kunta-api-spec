# KuntaApiClient.PhoneChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServicePhoneChannel**](PhoneChannelsApi.md#createServicePhoneChannel) | **POST** /services/{serviceId}/phoneChannels | creates PhoneChannel
[**findServicePhoneChannel**](PhoneChannelsApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
[**listServicePhoneChannels**](PhoneChannelsApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId
[**updatePhoneChannel**](PhoneChannelsApi.md#updatePhoneChannel) | **PUT** /services/{serviceId}/phoneChannels/{phoneChannelId} | Updates PhoneChannel


<a name="createServicePhoneChannel"></a>
# **createServicePhoneChannel**
> PhoneChannel createServicePhoneChannel(serviceId, body)

creates PhoneChannel

creates PhoneChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PhoneChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.PhoneChannel(); // PhoneChannel | Payload

apiInstance.createServicePhoneChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**PhoneChannel**](PhoneChannel.md)| Payload | 

### Return type

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePhoneChannel"></a>
# **findServicePhoneChannel**
> PhoneChannel findServicePhoneChannel(serviceId, phoneChannelId)

finds PhoneChannel by phoneChannelId

finds PhoneChannels by phoneChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePhoneChannels"></a>
# **listServicePhoneChannels**
> [PhoneChannel] listServicePhoneChannels(serviceId, opts)

Lists PhoneChannels by serviceId

Lists PhoneChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

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

[**[PhoneChannel]**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePhoneChannel"></a>
# **updatePhoneChannel**
> PhoneChannel updatePhoneChannel(serviceId, phoneChannelId, body)

Updates PhoneChannel

Updates PhoneChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PhoneChannelsApi();

var serviceId = "serviceId_example"; // String | service id

var phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id

var body = new KuntaApiClient.PhoneChannel(); // PhoneChannel | Payload

apiInstance.updatePhoneChannel(serviceId, phoneChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **phoneChannelId** | **String**| phoneChannel id | 
 **body** | [**PhoneChannel**](PhoneChannel.md)| Payload | 

### Return type

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

