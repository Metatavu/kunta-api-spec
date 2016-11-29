# KuntaApiClient.ServicesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createService**](ServicesApi.md#createService) | **POST** /services | Create service
[**createServiceElectronicChannel**](ServicesApi.md#createServiceElectronicChannel) | **POST** /services/{serviceId}/electronicChannels | creates ElectronicChannel
[**createServicePhoneChannel**](ServicesApi.md#createServicePhoneChannel) | **POST** /services/{serviceId}/phoneChannels | creates PhoneChannel
[**createServicePrintableFormChannel**](ServicesApi.md#createServicePrintableFormChannel) | **POST** /services/{serviceId}/printableFormChannels | creates PrintableFormChannel
[**createServiceServiceLocationChannel**](ServicesApi.md#createServiceServiceLocationChannel) | **POST** /services/{serviceId}/serviceLocationChannels | creates ServiceLocationChannel
[**createServiceWebPageChannel**](ServicesApi.md#createServiceWebPageChannel) | **POST** /services/{serviceId}/webPageChannels | creates WebPageChannel
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
[**updatePhoneChannel**](ServicesApi.md#updatePhoneChannel) | **PUT** /services/{serviceId}/phoneChannels/{phoneChannelId} | Updates PhoneChannel
[**updatePrintableFormChannel**](ServicesApi.md#updatePrintableFormChannel) | **PUT** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | Updates PrintableFormChannel
[**updateService**](ServicesApi.md#updateService) | **PUT** /services/{serviceId} | Updates service
[**updateServiceElectronicChannel**](ServicesApi.md#updateServiceElectronicChannel) | **PUT** /services/{serviceId}/electronicChannels/{electronicChannelId} | Updates ElectronicChannel
[**updateServiceLocationChannel**](ServicesApi.md#updateServiceLocationChannel) | **PUT** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | Updates ServiceLocationChannel
[**updateWebPageChannel**](ServicesApi.md#updateWebPageChannel) | **PUT** /services/{serviceId}/webPageChannels/{webPageChannelId} | Updates WebPageChannel


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

<a name="createServiceElectronicChannel"></a>
# **createServiceElectronicChannel**
> ElectronicChannel createServiceElectronicChannel(serviceId, body)

creates ElectronicChannel

creates ElectronicChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.ElectronicChannel(); // ElectronicChannel | Payload

apiInstance.createServiceElectronicChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**ElectronicChannel**](ElectronicChannel.md)| Payload | 

### Return type

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createServicePhoneChannel"></a>
# **createServicePhoneChannel**
> PhoneChannel createServicePhoneChannel(serviceId, body)

creates PhoneChannel

creates PhoneChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.PhoneChannel(); // PhoneChannel | Payload

apiInstance.createServicePhoneChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**PhoneChannel**](PhoneChannel.md)| Payload | 

### Return type

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createServicePrintableFormChannel"></a>
# **createServicePrintableFormChannel**
> PrintableFormChannel createServicePrintableFormChannel(serviceId, body)

creates PrintableFormChannel

creates PrintableFormChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.PrintableFormChannel(); // PrintableFormChannel | Payload

apiInstance.createServicePrintableFormChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**PrintableFormChannel**](PrintableFormChannel.md)| Payload | 

### Return type

[**PrintableFormChannel**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createServiceServiceLocationChannel"></a>
# **createServiceServiceLocationChannel**
> ServiceLocationChannel createServiceServiceLocationChannel(serviceId, body)

creates ServiceLocationChannel

creates ServiceLocationChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.ServiceLocationChannel(); // ServiceLocationChannel | Payload

apiInstance.createServiceServiceLocationChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**ServiceLocationChannel**](ServiceLocationChannel.md)| Payload | 

### Return type

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createServiceWebPageChannel"></a>
# **createServiceWebPageChannel**
> WebPageChannel createServiceWebPageChannel(serviceId, body)

creates WebPageChannel

creates WebPageChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var body = new KuntaApiClient.WebPageChannel(); // WebPageChannel | Payload

apiInstance.createServiceWebPageChannel(serviceId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **body** | [**WebPageChannel**](WebPageChannel.md)| Payload | 

### Return type

[**WebPageChannel**](WebPageChannel.md)

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
> ElectronicChannel findServiceElectronicChannel(serviceId, electronicChannelId)

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

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePhoneChannel"></a>
# **findServicePhoneChannel**
> PhoneChannel findServicePhoneChannel(serviceId, phoneChannelId)

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

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServicePrintableFormChannel"></a>
# **findServicePrintableFormChannel**
> PrintableFormChannel findServicePrintableFormChannel(serviceId, printableFormChannelId)

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

[**PrintableFormChannel**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceServiceLocationChannel"></a>
# **findServiceServiceLocationChannel**
> ServiceLocationChannel findServiceServiceLocationChannel(serviceId, serviceLocationChannelId)

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

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceWebPageChannel"></a>
# **findServiceWebPageChannel**
> WebPageChannel findServiceWebPageChannel(serviceId, webPageChannelId)

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

[**WebPageChannel**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceElectronicChannels"></a>
# **listServiceElectronicChannels**
> [ElectronicChannel] listServiceElectronicChannels(serviceId, opts)

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

[**[ElectronicChannel]**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePhoneChannels"></a>
# **listServicePhoneChannels**
> [PhoneChannel] listServicePhoneChannels(serviceId, opts)

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

[**[PhoneChannel]**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePrintableFormChannels"></a>
# **listServicePrintableFormChannels**
> [PrintableFormChannel] listServicePrintableFormChannels(serviceId, opts)

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

[**[PrintableFormChannel]**](PrintableFormChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceServiceLocationChannels"></a>
# **listServiceServiceLocationChannels**
> [ServiceLocationChannel] listServiceServiceLocationChannels(serviceId, opts)

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

[**[ServiceLocationChannel]**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceWebPageChannels"></a>
# **listServiceWebPageChannels**
> [WebPageChannel] listServiceWebPageChannels(serviceId, opts)

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

[**[WebPageChannel]**](WebPageChannel.md)

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

<a name="updatePhoneChannel"></a>
# **updatePhoneChannel**
> PhoneChannel updatePhoneChannel(serviceId, phoneChannelId, body)

Updates PhoneChannel

Updates PhoneChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id

var body = new KuntaApiClient.PhoneChannel(); // PhoneChannel | Payload

apiInstance.updatePhoneChannel(serviceId, phoneChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **phoneChannelId** | **String**| phoneChannel id | 
 **body** | [**PhoneChannel**](PhoneChannel.md)| Payload | 

### Return type

[**PhoneChannel**](PhoneChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePrintableFormChannel"></a>
# **updatePrintableFormChannel**
> PrintableFormChannel updatePrintableFormChannel(serviceId, printableFormChannelId, body)

Updates PrintableFormChannel

Updates PrintableFormChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id

var body = new KuntaApiClient.PrintableFormChannel(); // PrintableFormChannel | Payload

apiInstance.updatePrintableFormChannel(serviceId, printableFormChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **printableFormChannelId** | **String**| printableFormChannel id | 
 **body** | [**PrintableFormChannel**](PrintableFormChannel.md)| Payload | 

### Return type

[**PrintableFormChannel**](PrintableFormChannel.md)

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

<a name="updateServiceElectronicChannel"></a>
# **updateServiceElectronicChannel**
> ElectronicChannel updateServiceElectronicChannel(serviceId, electronicChannelId, body)

Updates ElectronicChannel

Updates ElectronicChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id

var body = new KuntaApiClient.ElectronicChannel(); // ElectronicChannel | Payload

apiInstance.updateServiceElectronicChannel(serviceId, electronicChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **electronicChannelId** | **String**| electronicChannel id | 
 **body** | [**ElectronicChannel**](ElectronicChannel.md)| Payload | 

### Return type

[**ElectronicChannel**](ElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateServiceLocationChannel"></a>
# **updateServiceLocationChannel**
> ServiceLocationChannel updateServiceLocationChannel(serviceId, serviceLocationChannelId, body)

Updates ServiceLocationChannel

Updates ServiceLocationChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id

var body = new KuntaApiClient.ServiceLocationChannel(); // ServiceLocationChannel | Payload

apiInstance.updateServiceLocationChannel(serviceId, serviceLocationChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **serviceLocationChannelId** | **String**| serviceLocationChannel id | 
 **body** | [**ServiceLocationChannel**](ServiceLocationChannel.md)| Payload | 

### Return type

[**ServiceLocationChannel**](ServiceLocationChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateWebPageChannel"></a>
# **updateWebPageChannel**
> WebPageChannel updateWebPageChannel(serviceId, webPageChannelId, body)

Updates WebPageChannel

Updates WebPageChannel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServicesApi();

var serviceId = "serviceId_example"; // String | service id

var webPageChannelId = "webPageChannelId_example"; // String | webPageChannel id

var body = new KuntaApiClient.WebPageChannel(); // WebPageChannel | Payload

apiInstance.updateWebPageChannel(serviceId, webPageChannelId, body).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| service id | 
 **webPageChannelId** | **String**| webPageChannel id | 
 **body** | [**WebPageChannel**](WebPageChannel.md)| Payload | 

### Return type

[**WebPageChannel**](WebPageChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

