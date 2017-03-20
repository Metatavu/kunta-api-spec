# KuntaApiClient.ServicesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createService**](ServicesApi.md#createService) | **POST** /services | Create service
[**findService**](ServicesApi.md#findService) | **GET** /services/{serviceId} | Finds a service by id
[**findServiceElectronicChannel**](ServicesApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
[**findServicePhoneChannel**](ServicesApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
[**findServicePrintableFormChannel**](ServicesApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
[**findServiceServiceLocationChannel**](ServicesApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
[**findServiceWebPageChannel**](ServicesApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
[**listServiceElectronicChannels**](ServicesApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId
[**listServicePhoneChannels**](ServicesApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId
[**listServicePrintableFormChannels**](ServicesApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId
[**listServiceServiceLocationChannels**](ServicesApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId
[**listServiceWebPageChannels**](ServicesApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId
[**listServices**](ServicesApi.md#listServices) | **GET** /services | Service list
[**updateService**](ServicesApi.md#updateService) | **PUT** /services/{serviceId} | Updates service


<a name="createService"></a>
# **createService**
> Service createService(body)

Create service

Creates new service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var body = new KuntaApiClient.Service(); // Service | Payload

apiInstance.createService(body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Service**](Service.md)| Payload | 

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findService"></a>
# **findService**
> Service findService(serviceId)

Finds a service by id

Finds service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

apiInstance.findService(serviceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceElectronicChannel"></a>
# **findServiceElectronicChannel**
> ElectronicServiceChannel findServiceElectronicChannel(serviceId, electronicChannelId)

finds ElectronicChannel by electronicChannelId

finds ElectronicChannels by electronicChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id

apiInstance.findServiceElectronicChannel(serviceId, electronicChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **electronicChannelId** | **String**| electronicChannel id | 

### Return type

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePhoneChannel"></a>
# **findServicePhoneChannel**
> PhoneServiceChannel findServicePhoneChannel(serviceId, phoneChannelId)

finds PhoneChannel by phoneChannelId

finds PhoneChannels by phoneChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id

apiInstance.findServicePhoneChannel(serviceId, phoneChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **phoneChannelId** | **String**| phoneChannel id | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePrintableFormChannel"></a>
# **findServicePrintableFormChannel**
> PrintableFormServiceChannel findServicePrintableFormChannel(serviceId, printableFormChannelId)

finds PrintableFormChannel by printableFormChannelId

finds PrintableFormChannels by printableFormChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id

apiInstance.findServicePrintableFormChannel(serviceId, printableFormChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **printableFormChannelId** | **String**| printableFormChannel id | 

### Return type

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceServiceLocationChannel"></a>
# **findServiceServiceLocationChannel**
> ServiceLocationServiceChannel findServiceServiceLocationChannel(serviceId, serviceLocationChannelId)

finds ServiceLocationChannel by serviceLocationChannelId

finds ServiceLocationChannels by serviceLocationChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id

apiInstance.findServiceServiceLocationChannel(serviceId, serviceLocationChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **serviceLocationChannelId** | **String**| serviceLocationChannel id | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceWebPageChannel"></a>
# **findServiceWebPageChannel**
> WebPageServiceChannel findServiceWebPageChannel(serviceId, webPageChannelId)

finds WebPageChannel by webPageChannelId

finds WebPageChannels by webPageChannelId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var webPageChannelId = "webPageChannelId_example"; // String | webPageChannel id

apiInstance.findServiceWebPageChannel(serviceId, webPageChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **webPageChannelId** | **String**| webPageChannel id | 

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceElectronicChannels"></a>
# **listServiceElectronicChannels**
> [ElectronicServiceChannel] listServiceElectronicChannels(serviceId, opts)

Lists ElectronicChannels by serviceId

Lists ElectronicChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceElectronicChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ElectronicServiceChannel]**](ElectronicServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePhoneChannels"></a>
# **listServicePhoneChannels**
> [PhoneServiceChannel] listServicePhoneChannels(serviceId, opts)

Lists PhoneChannels by serviceId

Lists PhoneChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServicePhoneChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[PhoneServiceChannel]**](PhoneServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePrintableFormChannels"></a>
# **listServicePrintableFormChannels**
> [PrintableFormServiceChannel] listServicePrintableFormChannels(serviceId, opts)

Lists PrintableFormChannels by serviceId

Lists PrintableFormChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServicePrintableFormChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[PrintableFormServiceChannel]**](PrintableFormServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceServiceLocationChannels"></a>
# **listServiceServiceLocationChannels**
> [ServiceLocationServiceChannel] listServiceServiceLocationChannels(serviceId, opts)

Lists ServiceLocationChannels by serviceId

Lists ServiceLocationChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceServiceLocationChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ServiceLocationServiceChannel]**](ServiceLocationServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceWebPageChannels"></a>
# **listServiceWebPageChannels**
> [WebPageServiceChannel] listServiceWebPageChannels(serviceId, opts)

Lists WebPageChannels by serviceId

Lists WebPageChannels by serviceId

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Service id

var opts = { 
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceWebPageChannels(serviceId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id | 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[WebPageServiceChannel]**](WebPageServiceChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServices"></a>
# **listServices**
> [Service] listServices(opts)

Service list

Lists services

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Return only services belonging to specified organization
  'search': "search_example", // String | Search services by free-text query
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServices(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Return only services belonging to specified organization | [optional] 
 **search** | **String**| Search services by free-text query | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Service]**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateService"></a>
# **updateService**
> Service updateService(serviceId, body)

Updates service

Updates service

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | Organization service id

var body = new KuntaApiClient.Service(); // Service | Payload

apiInstance.updateService(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Organization service id | 
 **body** | [**Service**](Service.md)| Payload | 

### Return type

[**Service**](Service.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

