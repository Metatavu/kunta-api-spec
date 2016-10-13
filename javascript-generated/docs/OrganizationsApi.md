# KuntaApiClient.OrganizationsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listOrganizations**](OrganizationsApi.md#listOrganizations) | **GET** /organizations | List organizations


<a name="listOrganizations"></a>
# **listOrganizations**
> [Organization] listOrganizations(opts)

List organizations

List organizations

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationsApi();

var opts = { 
  'businessName': "businessName_example", // String | Filter by organization's business name
  'businessCode': "businessCode_example" // String | Filter by organization's business code
};
apiInstance.listOrganizations(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessName** | **String**| Filter by organization&#39;s business name | [optional] 
 **businessCode** | **String**| Filter by organization&#39;s business code | [optional] 

### Return type

[**[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

