# KuntaApiClient.ServiceLocationServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceLocationServiceChannel**](ServiceLocationServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
[**listServiceLocationServiceChannels**](ServiceLocationServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels


<a name="findServiceLocationServiceChannel"></a>
# **findServiceLocationServiceChannel**
> ServiceLocationServiceChannel findServiceLocationServiceChannel(serviceLocationServiceChannelId)

Finds a service location service by id

Finds a service location service by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceLocationServiceChannelsApi();

var serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id

apiInstance.findServiceLocationServiceChannel(serviceLocationServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceLocationServiceChannelId** | **String**| serviceLocationChannel id | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceLocationServiceChannels"></a>
# **listServiceLocationServiceChannels**
> [ServiceLocationServiceChannel] listServiceLocationServiceChannels(opts)

Lists service location service channels

Lists service location service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceLocationServiceChannelsApi();

var opts = { 
  'search': "search_example", // String | Search service location channels by free-text query
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceLocationServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| Search service location channels by free-text query | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ServiceLocationServiceChannel]**](ServiceLocationServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

