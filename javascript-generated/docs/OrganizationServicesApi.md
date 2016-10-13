# KuntaApiClient.OrganizationServicesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganizationService**](OrganizationServicesApi.md#createOrganizationService) | **POST** /organizations/{organizationId}/organizationServices | Create organization service
[**findOrganizationService**](OrganizationServicesApi.md#findOrganizationService) | **GET** /organizations/{organizationId}/organizationServices/{organizationServiceId} | Finds a organization service by id
[**listOrganizationOrganizationServices**](OrganizationServicesApi.md#listOrganizationOrganizationServices) | **GET** /organizations/{organizationId}/organizationServices | Organization organization service list
[**updateOrganizationService**](OrganizationServicesApi.md#updateOrganizationService) | **PUT** /organizations/{organizationId}/organizationServices/{organizationServiceId} | Updates an organization service


<a name="createOrganizationService"></a>
# **createOrganizationService**
> Organization createOrganizationService(organizationId, body)

Create organization service

Create organization service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var body = new KuntaApiClient.OrganizationService(); // OrganizationService | Payload

apiInstance.createOrganizationService(organizationId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **body** | [**OrganizationService**](OrganizationService.md)| Payload | 

### Return type

[**Organization**](Organization.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationService"></a>
# **findOrganizationService**
> OrganizationService findOrganizationService(organizationId, organizationServiceId)

Finds a organization service by id

Find an organization service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var organizationServiceId = "organizationServiceId_example"; // String | Organization service id

apiInstance.findOrganizationService(organizationId, organizationServiceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **organizationServiceId** | **String**| Organization service id | 

### Return type

[**OrganizationService**](OrganizationService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationOrganizationServices"></a>
# **listOrganizationOrganizationServices**
> [OrganizationService] listOrganizationOrganizationServices(organizationId, opts)

Organization organization service list

Lists organization&#39;s organization services

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationOrganizationServices(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[OrganizationService]**](OrganizationService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateOrganizationService"></a>
# **updateOrganizationService**
> OrganizationService updateOrganizationService(organizationId, organizationServiceId, body)

Updates an organization service

Updates organization service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.OrganizationServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var organizationServiceId = "organizationServiceId_example"; // String | Organization service id

var body = new KuntaApiClient.OrganizationService(); // OrganizationService | Payload

apiInstance.updateOrganizationService(organizationId, organizationServiceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **organizationServiceId** | **String**| Organization service id | 
 **body** | [**OrganizationService**](OrganizationService.md)| Payload | 

### Return type

[**OrganizationService**](OrganizationService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

