# KuntaApiClient.EmergenciesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationEmergency**](EmergenciesApi.md#findOrganizationEmergency) | **GET** /organizations/{organizationId}/emergencies/{emergencyId} | Returns organizations emergency by id
[**listOrganizationEmergencies**](EmergenciesApi.md#listOrganizationEmergencies) | **GET** /organizations/{organizationId}/emergencies | Lists organizations emergencies


<a name="findOrganizationEmergency"></a>
# **findOrganizationEmergency**
> Emergency findOrganizationEmergency(organizationId, emergencyId)

Returns organizations emergency by id

Returns organizations emergency by id 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EmergenciesApi();

var organizationId = "organizationId_example"; // String | Organization id

var emergencyId = "emergencyId_example"; // String | Emergency id

apiInstance.findOrganizationEmergency(organizationId, emergencyId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **emergencyId** | **String**| Emergency id | 

### Return type

[**Emergency**](Emergency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEmergencies"></a>
# **listOrganizationEmergencies**
> [Emergency] listOrganizationEmergencies(organizationId, opts)

Lists organizations emergencies

Lists organizations emergencies 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EmergenciesApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'location': "location_example", // String | Return emergencies by location
  'before': "before_example", // String | Return emergencies before specified time
  'after': "after_example", // String | Return emergencies after specified time
  'firstResult': 56, // Integer | First index of results
  'maxResults': 56, // Integer | Maximum number of results
  'orderBy': "orderBy_example", // String | Define order (NATURAL, START)
  'orderDir': "orderDir_example" // String | Order direction (ASC, DESC). Default is ASC
};
apiInstance.listOrganizationEmergencies(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **location** | **String**| Return emergencies by location | [optional] 
 **before** | **String**| Return emergencies before specified time | [optional] 
 **after** | **String**| Return emergencies after specified time | [optional] 
 **firstResult** | **Integer**| First index of results | [optional] 
 **maxResults** | **Integer**| Maximum number of results | [optional] 
 **orderBy** | **String**| Define order (NATURAL, START) | [optional] 
 **orderDir** | **String**| Order direction (ASC, DESC). Default is ASC | [optional] 

### Return type

[**[Emergency]**](Emergency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

