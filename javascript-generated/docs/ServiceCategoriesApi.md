# KuntaApiClient.ServiceCategoriesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listServiceClasses**](ServiceCategoriesApi.md#listServiceClasses) | **GET** /organizations/{organizationId}/serviceClasses/ | List service classes for an organization


<a name="listServiceClasses"></a>
# **listServiceClasses**
> [ServiceClass] listServiceClasses(organizationId)

List service classes for an organization

Returns list of organization&#39;s service classes 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceCategoriesApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listServiceClasses(organizationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 

### Return type

[**[ServiceClass]**](ServiceClass.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

