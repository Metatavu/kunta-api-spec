# KuntaApiClient.WebPageServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findWebPageServiceChannel**](WebPageServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
[**listWebPageServiceChannels**](WebPageServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels


<a name="findWebPageServiceChannel"></a>
# **findWebPageServiceChannel**
> WebPageServiceChannel findWebPageServiceChannel(webPageServiceChannelId)

Finds a web page service channel by id

Finds a web page service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.WebPageServiceChannelsApi();

var webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id

apiInstance.findWebPageServiceChannel(webPageServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webPageServiceChannelId** | **String**| webPageChannel id | 

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listWebPageServiceChannels"></a>
# **listWebPageServiceChannels**
> [WebPageServiceChannel] listWebPageServiceChannels(opts)

Lists web page service channels

Lists web page service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.WebPageServiceChannelsApi();

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listWebPageServiceChannels(opts).then(function(data) {
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

[**[WebPageServiceChannel]**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

