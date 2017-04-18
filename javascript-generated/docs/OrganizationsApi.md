# KuntaApiClient.OrganizationsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganization**](OrganizationsApi.md#findOrganization) | **GET** /organizations/{organizationId} | Find organization
[**listOrganizations**](OrganizationsApi.md#listOrganizations) | **GET** /organizations | List organizations


<a name="findOrganization"></a>
# **findOrganization**
> Organization findOrganization(organizationId)

Find organization

Find organization

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationsApi();

var organizationId = "organizationId_example"; // String | organization id

apiInstance.findOrganization(organizationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| organization id | 

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

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
  'businessCode': "businessCode_example", // String | Filter by organization's business code
  'search': "search_example", // String | Search organizations by free-text query
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
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
 **search** | **String**| Search organizations by free-text query | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Organization]**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

