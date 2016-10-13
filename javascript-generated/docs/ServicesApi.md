# KuntaApiClient.ServicesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createService**](ServicesApi.md#createService) | **POST** /organizations/{organizationId}/services | Create a service
[**deleteService**](ServicesApi.md#deleteService) | **DELETE** /organizations/{organizationId}/services/{serviceId} | Delete a service
[**findService**](ServicesApi.md#findService) | **GET** /organizations/{organizationId}/services/{serviceId} | Find a service by id
[**listServiceClasses**](ServicesApi.md#listServiceClasses) | **GET** /organizations/{organizationId}/serviceClasses/ | List service classes for an organization
[**listServiceElectornicChannels**](ServicesApi.md#listServiceElectornicChannels) | **GET** /organizations/{organizationId}/services/{serviceId}/electronicChannels | List service electornic channels
[**listServices**](ServicesApi.md#listServices) | **GET** /organizations/{organizationId}/services | List services
[**updateService**](ServicesApi.md#updateService) | **PUT** /organizations/{organizationId}/services/{serviceId} | Update a service


<a name="createService"></a>
# **createService**
> [Service] createService(organizationId, body)

Create a service

Creates new service for the organization 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var body = new KuntaApiClient.Service(); // Service | Service definition

apiInstance.createService(organizationId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **body** | [**Service**](Service.md)| Service definition | 

### Return type

[**[Service]**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteService"></a>
# **deleteService**
> deleteService(organizationId, serviceId)

Delete a service

Delete a single municipal service 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var serviceId = "serviceId_example"; // String | Service id

apiInstance.deleteService(organizationId, serviceId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceId** | **String**| Service id | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findService"></a>
# **findService**
> Service findService(organizationId, serviceId)

Find a service by id

Returns single service by it&#39;s unique id. 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var serviceId = "serviceId_example"; // String | Service id

apiInstance.findService(organizationId, serviceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceId** | **String**| Service id | 

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceClasses"></a>
# **listServiceClasses**
> [ServiceClass] listServiceClasses(organizationId)

List service classes for an organization

Returns list of organization&#39;s service classes 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

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

<a name="listServiceElectornicChannels"></a>
# **listServiceElectornicChannels**
> ServiceElectronicChannel listServiceElectornicChannels(organizationId, serviceId)

List service electornic channels

Lists service electronic channels 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var serviceId = "serviceId_example"; // String | Service id

apiInstance.listServiceElectornicChannels(organizationId, serviceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceId** | **String**| Service id | 

### Return type

[**ServiceElectronicChannel**](ServiceElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServices"></a>
# **listServices**
> [Service] listServices(organizationId, opts)

List services

Lists organization&#39;s services 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'serviceClassId': "serviceClassId_example" // String | Filter services by service class id
};
apiInstance.listServices(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceClassId** | **String**| Filter services by service class id | [optional] 

### Return type

[**[Service]**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateService"></a>
# **updateService**
> Service updateService(organizationId, serviceId)

Update a service

Updates a single municipal service 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var organizationId = "organizationId_example"; // String | Organization id

var serviceId = "serviceId_example"; // String | Service id

apiInstance.updateService(organizationId, serviceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceId** | **String**| Service id | 

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

