# KuntaApiClient.PhoneServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPhoneServiceChannel**](PhoneServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
[**listPhoneServiceChannels**](PhoneServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels


<a name="findPhoneServiceChannel"></a>
# **findPhoneServiceChannel**
> PhoneServiceChannel findPhoneServiceChannel(phoneServiceChannelId)

Finds a phone service channel by id

Finds a phone service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.PhoneServiceChannelsApi();

var phoneServiceChannelId = "phoneServiceChannelId_example"; // String | Phone service channel id

apiInstance.findPhoneServiceChannel(phoneServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| Phone service channel id | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPhoneServiceChannels"></a>
# **listPhoneServiceChannels**
> [PhoneServiceChannel] listPhoneServiceChannels(opts)

Lists phone service channels

Lists phone service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.PhoneServiceChannelsApi();

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listPhoneServiceChannels(opts).then(function(data) {
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

[**[PhoneServiceChannel]**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

