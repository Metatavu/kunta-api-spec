# KuntaApiClient.FragmentsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationFragment**](FragmentsApi.md#findOrganizationFragment) | **GET** /organizations/{organizationId}/fragments/{fragmentId} | Finds organizations page fragment
[**listOrganizationFragments**](FragmentsApi.md#listOrganizationFragments) | **GET** /organizations/{organizationId}/fragments | Lists organizations page fragments


<a name="findOrganizationFragment"></a>
# **findOrganizationFragment**
> Fragment findOrganizationFragment(organizationId, fragmentId)

Finds organizations page fragment

Finds single organization page fragment 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.FragmentsApi();

var organizationId = "organizationId_example"; // String | Organization id

var fragmentId = "fragmentId_example"; // String | fragment id

apiInstance.findOrganizationFragment(organizationId, fragmentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **fragmentId** | **String**| fragment id | 

### Return type

[**Fragment**](Fragment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationFragments"></a>
# **listOrganizationFragments**
> [Fragment] listOrganizationFragments(organizationId, opts)

Lists organizations page fragments

Lists organizations page fragments 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.FragmentsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'slug': "slug_example" // String | Filter results by fragment slug
};
apiInstance.listOrganizationFragments(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **slug** | **String**| Filter results by fragment slug | [optional] 

### Return type

[**[Fragment]**](Fragment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

