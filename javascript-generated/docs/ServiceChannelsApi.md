# KuntaApiClient.ServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findElectronicServiceChannel**](ServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
[**findPhoneServiceChannel**](ServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
[**findPrintableFormServiceChannel**](ServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
[**findServiceLocationServiceChannel**](ServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
[**findWebPageServiceChannel**](ServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
[**listElectronicServiceChannels**](ServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels
[**listPhoneServiceChannels**](ServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
[**listPrintableFormServiceChannels**](ServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels
[**listServiceLocationServiceChannels**](ServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels
[**listWebPageServiceChannels**](ServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels
[**updateElectronicServiceChannel**](ServiceChannelsApi.md#updateElectronicServiceChannel) | **PUT** /electronicServiceChannels/{electronicServiceChannelId} | Updates a channel
[**updatePhoneServiceChannel**](ServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel
[**updatePrintableFormServiceChannel**](ServiceChannelsApi.md#updatePrintableFormServiceChannel) | **PUT** /printableFormServiceChannels/{printableFormServiceChannelId} | Updates a channel
[**updateServiceLocationServiceChannel**](ServiceChannelsApi.md#updateServiceLocationServiceChannel) | **PUT** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Updates a service location channel


<a name="findElectronicServiceChannel"></a>
# **findElectronicServiceChannel**
> ElectronicServiceChannel findElectronicServiceChannel(electronicServiceChannelId)

Finds an electronic service channel by id

Finds an electronic service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id

apiInstance.findElectronicServiceChannel(electronicServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **electronicServiceChannelId** | **String**| electronicChannel id | 

### Return type

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findPhoneServiceChannel"></a>
# **findPhoneServiceChannel**
> PhoneServiceChannel findPhoneServiceChannel(phoneServiceChannelId)

Finds a phone service channel by id

Finds a phone service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var phoneServiceChannelId = "phoneServiceChannelId_example"; // String | Phone service channel id

apiInstance.findPhoneServiceChannel(phoneServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| Phone service channel id | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findPrintableFormServiceChannel"></a>
# **findPrintableFormServiceChannel**
> PrintableFormServiceChannel findPrintableFormServiceChannel(printableFormServiceChannelId)

Finds a printable form service channel

Finds a printable form service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | Printable form service channel id

apiInstance.findPrintableFormServiceChannel(printableFormServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **printableFormServiceChannelId** | **String**| Printable form service channel id | 

### Return type

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findServiceLocationServiceChannel"></a>
# **findServiceLocationServiceChannel**
> ServiceLocationServiceChannel findServiceLocationServiceChannel(serviceLocationServiceChannelId)

Finds a service location service by id

Finds a service location service by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id

apiInstance.findServiceLocationServiceChannel(serviceLocationServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceLocationServiceChannelId** | **String**| serviceLocationChannel id | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findWebPageServiceChannel"></a>
# **findWebPageServiceChannel**
> WebPageServiceChannel findWebPageServiceChannel(webPageServiceChannelId)

Finds a web page service channel by id

Finds a web page service channel by id

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id

apiInstance.findWebPageServiceChannel(webPageServiceChannelId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webPageServiceChannelId** | **String**| webPageChannel id | 

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listElectronicServiceChannels"></a>
# **listElectronicServiceChannels**
> [ElectronicServiceChannel] listElectronicServiceChannels(opts)

Lists electronic service channels

Lists electronic service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listElectronicServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ElectronicServiceChannel]**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPhoneServiceChannels"></a>
# **listPhoneServiceChannels**
> [PhoneServiceChannel] listPhoneServiceChannels(opts)

Lists phone service channels

Lists phone service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listPhoneServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[PhoneServiceChannel]**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPrintableFormServiceChannels"></a>
# **listPrintableFormServiceChannels**
> [PrintableFormServiceChannel] listPrintableFormServiceChannels(opts)

Lists printable form service channels

Lists printable form service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listPrintableFormServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[PrintableFormServiceChannel]**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceLocationServiceChannels"></a>
# **listServiceLocationServiceChannels**
> [ServiceLocationServiceChannel] listServiceLocationServiceChannels(opts)

Lists service location service channels

Lists service location service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search service location channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listServiceLocationServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search service location channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[ServiceLocationServiceChannel]**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listWebPageServiceChannels"></a>
# **listWebPageServiceChannels**
> [WebPageServiceChannel] listWebPageServiceChannels(opts)

Lists web page service channels

Lists web page service channels

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var opts = { 
  'organizationId': "organizationId_example", // String | Organization id
  'search': "search_example", // String | Search channels by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listWebPageServiceChannels(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional] 
 **search** | **String**| Search channels by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[WebPageServiceChannel]**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateElectronicServiceChannel"></a>
# **updateElectronicServiceChannel**
> ElectronicServiceChannel updateElectronicServiceChannel(electronicServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id

var payload = new KuntaApiClient.ElectronicServiceChannel(); // ElectronicServiceChannel | New electronic service data

apiInstance.updateElectronicServiceChannel(electronicServiceChannelId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **electronicServiceChannelId** | **String**| electronicChannel id | 
 **payload** | [**ElectronicServiceChannel**](ElectronicServiceChannel.md)| New electronic service data | 

### Return type

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePhoneServiceChannel"></a>
# **updatePhoneServiceChannel**
> PhoneServiceChannel updatePhoneServiceChannel(phoneServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var phoneServiceChannelId = "phoneServiceChannelId_example"; // String | phone channel id

var payload = new KuntaApiClient.PhoneServiceChannel(); // PhoneServiceChannel | New phone service data

apiInstance.updatePhoneServiceChannel(phoneServiceChannelId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| phone channel id | 
 **payload** | [**PhoneServiceChannel**](PhoneServiceChannel.md)| New phone service data | 

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePrintableFormServiceChannel"></a>
# **updatePrintableFormServiceChannel**
> PrintableFormServiceChannel updatePrintableFormServiceChannel(printableFormServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | printable form channel id

var payload = new KuntaApiClient.PrintableFormServiceChannel(); // PrintableFormServiceChannel | New printable form service data

apiInstance.updatePrintableFormServiceChannel(printableFormServiceChannelId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **printableFormServiceChannelId** | **String**| printable form channel id | 
 **payload** | [**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)| New printable form service data | 

### Return type

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateServiceLocationServiceChannel"></a>
# **updateServiceLocationServiceChannel**
> ServiceLocationServiceChannel updateServiceLocationServiceChannel(serviceLocationServiceChannelId, serviceLocationChannel)

Updates a service location channel

Updates a service location channel

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id

var serviceLocationChannel = new KuntaApiClient.ServiceLocationServiceChannel(); // ServiceLocationServiceChannel | New service location channel data

apiInstance.updateServiceLocationServiceChannel(serviceLocationServiceChannelId, serviceLocationChannel).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceLocationServiceChannelId** | **String**| serviceLocationChannel id | 
 **serviceLocationChannel** | [**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)| New service location channel data | 

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

