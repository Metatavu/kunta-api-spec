# KuntaApiClient.PrintableFormServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPrintableFormServiceChannel**](PrintableFormServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
[**listPrintableFormServiceChannels**](PrintableFormServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels


<a name="findPrintableFormServiceChannel"></a>
# **findPrintableFormServiceChannel**
> PrintableFormServiceChannel findPrintableFormServiceChannel(printableFormServiceChannelId)

Finds a printable form service channel

Finds a printable form service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormServiceChannelsApi();

var printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | Printable form service channel id

apiInstance.findPrintableFormServiceChannel(printableFormServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **printableFormServiceChannelId** | **String**| Printable form service channel id | 

### Return type

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPrintableFormServiceChannels"></a>
# **listPrintableFormServiceChannels**
> [PrintableFormServiceChannel] listPrintableFormServiceChannels(opts)

Lists printable form service channels

Lists printable form service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PrintableFormServiceChannelsApi();

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listPrintableFormServiceChannels(opts).then(function(data) {
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

[**[PrintableFormServiceChannel]**](PrintableFormServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

