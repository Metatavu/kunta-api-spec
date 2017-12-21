# KuntaApiClient.PhoneServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPhoneServiceChannel**](PhoneServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
[**listPhoneServiceChannels**](PhoneServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
[**updatePhoneServiceChannel**](PhoneServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel


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
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
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
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[PhoneServiceChannel]**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePhoneServiceChannel"></a>
# **updatePhoneServiceChannel**
> PhoneServiceChannel updatePhoneServiceChannel(phoneServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.PhoneServiceChannelsApi();

var phoneServiceChannelId = "phoneServiceChannelId_example"; // String | phone channel id

var payload = new KuntaApiClient.PhoneServiceChannel(); // PhoneServiceChannel | New phone service data

apiInstance.updatePhoneServiceChannel(phoneServiceChannelId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| phone channel id | 
 **payload** | [**PhoneServiceChannel**](PhoneServiceChannel.md)| New phone service data | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

