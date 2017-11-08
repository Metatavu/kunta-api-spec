# KuntaApiClient.CodesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listCodes**](CodesApi.md#listCodes) | **GET** /codes | Lists codes


<a name="listCodes"></a>
# **listCodes**
> Code listCodes(opts)

Lists codes

Lists codes

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.CodesApi();

var opts = { 
  'types': ["types_example"], // [String] | Filter results by types
  'search': "search_example", // String | Search codes by free-text query
  'firstResult': 56, // Integer | first index of results
  'maxResults': 56 // Integer | maximum number of results. If not defined, default 50 is used
};
apiInstance.listCodes(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | [**[String]**](String.md)| Filter results by types | [optional] 
 **search** | **String**| Search codes by free-text query | [optional] 
 **firstResult** | **Integer**| first index of results | [optional] 
 **maxResults** | **Integer**| maximum number of results. If not defined, default 50 is used | [optional] 

### Return type

[**Code**](Code.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

