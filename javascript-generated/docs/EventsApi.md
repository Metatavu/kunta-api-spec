# KuntaApiClient.EventsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationEvent**](EventsApi.md#findOrganizationEvent) | **GET** /organizations/{organizationId}/events/{eventId} | Returns organizations event by id
[**findOrganizationEventImage**](EventsApi.md#findOrganizationEventImage) | **GET** /organizations/{organizationId}/events/{eventId}/images/{imageId} | Returns an event image
[**getOrganizationEventImageData**](EventsApi.md#getOrganizationEventImageData) | **GET** /organizations/{organizationId}/events/{eventId}/images/{imageId}/data | Returns an event image data
[**listOrganizationEventImages**](EventsApi.md#listOrganizationEventImages) | **GET** /organizations/{organizationId}/events/{eventId}/images | Returns list of event images
[**listOrganizationEvents**](EventsApi.md#listOrganizationEvents) | **GET** /organizations/{organizationId}/events | Lists organizations events


<a name="findOrganizationEvent"></a>
# **findOrganizationEvent**
> Event findOrganizationEvent(organizationId, eventId)

Returns organizations event by id

Returns organizations event by id 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EventsApi();

var organizationId = "organizationId_example"; // String | Organization id

var eventId = "eventId_example"; // String | Event id

apiInstance.findOrganizationEvent(organizationId, eventId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **eventId** | **String**| Event id | 

### Return type

[**Event**](Event.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationEventImage"></a>
# **findOrganizationEventImage**
> Attachment findOrganizationEventImage(organizationId, eventId, imageId)

Returns an event image

Returns an event image  

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EventsApi();

var organizationId = "organizationId_example"; // String | Organization id

var eventId = "eventId_example"; // String | Event id

var imageId = "imageId_example"; // String | Event image id

apiInstance.findOrganizationEventImage(organizationId, eventId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **eventId** | **String**| Event id | 
 **imageId** | **String**| Event image id | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationEventImageData"></a>
# **getOrganizationEventImageData**
> &#39;String&#39; getOrganizationEventImageData(organizationId, eventId, imageId, opts)

Returns an event image data

Returns an event image data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EventsApi();

var organizationId = "organizationId_example"; // String | Organization id

var eventId = "eventId_example"; // String | Event id

var imageId = "imageId_example"; // String | Event image id

var opts = { 
  'size': 56 // Integer | Maximum width or height of image
};
apiInstance.getOrganizationEventImageData(organizationId, eventId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **eventId** | **String**| Event id | 
 **imageId** | **String**| Event image id | 
 **size** | **Integer**| Maximum width or height of image | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationEventImages"></a>
# **listOrganizationEventImages**
> [Attachment] listOrganizationEventImages(organizationId, eventId)

Returns list of event images

Returns list of event images 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EventsApi();

var organizationId = "organizationId_example"; // String | Organization id

var eventId = "eventId_example"; // String | Event id

apiInstance.listOrganizationEventImages(organizationId, eventId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **eventId** | **String**| Event id | 

### Return type

[**[Attachment]**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEvents"></a>
# **listOrganizationEvents**
> [Event] listOrganizationEvents(organizationId, opts)

Lists organizations events

Lists organizations events 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.EventsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'startBefore': "startBefore_example", // String | return only events starting before the date
  'startAfter': "startAfter_example", // String | return only events starting after the date
  'endBefore': "endBefore_example", // String | return only events ending before the date
  'endAfter': "endAfter_example", // String | return only events ending after the date
  'firstResult': 56, // Integer | first index of results
  'maxResults': 56, // Integer | maximum number of results
  'orderBy': "orderBy_example", // String | define order (startDate, endDate). Default is startDate
  'orderDir': "orderDir_example" // String | ascending, descending. Default is ascending
};
apiInstance.listOrganizationEvents(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **startBefore** | **String**| return only events starting before the date | [optional] 
 **startAfter** | **String**| return only events starting after the date | [optional] 
 **endBefore** | **String**| return only events ending before the date | [optional] 
 **endAfter** | **String**| return only events ending after the date | [optional] 
 **firstResult** | **Integer**| first index of results | [optional] 
 **maxResults** | **Integer**| maximum number of results | [optional] 
 **orderBy** | **String**| define order (startDate, endDate). Default is startDate | [optional] 
 **orderDir** | **String**| ascending, descending. Default is ascending | [optional] 

### Return type

[**[Event]**](Event.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

