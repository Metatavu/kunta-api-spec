# KuntaApiClient.PublicTransportApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationPublicTransportAgency**](PublicTransportApi.md#findOrganizationPublicTransportAgency) | **GET** /organizations/{organizationId}/transportAgencies/{agencyId} | Finds an organizations public transport agency
[**findOrganizationPublicTransportRoute**](PublicTransportApi.md#findOrganizationPublicTransportRoute) | **GET** /organizations/{organizationId}/transportRoutes/{routeId} | Finds an organizations public transport route
[**findOrganizationPublicTransportSchedule**](PublicTransportApi.md#findOrganizationPublicTransportSchedule) | **GET** /organizations/{organizationId}/transportSchedules/{scheduleId} | Finds organizations public transport schedule
[**findOrganizationPublicTransportStop**](PublicTransportApi.md#findOrganizationPublicTransportStop) | **GET** /organizations/{organizationId}/transportStops/{stopId} | Finds a stop of organizations public transport route
[**findOrganizationPublicTransportStopTime**](PublicTransportApi.md#findOrganizationPublicTransportStopTime) | **GET** /organizations/{organizationId}/transportStopTimes/{stopTimeId} | Finds organizations public transport stopTime
[**findOrganizationPublicTransportTrip**](PublicTransportApi.md#findOrganizationPublicTransportTrip) | **GET** /organizations/{organizationId}/transportTrips/{tripId} | Finds organizations public transport trip
[**listOrganizationPublicTransportAgencies**](PublicTransportApi.md#listOrganizationPublicTransportAgencies) | **GET** /organizations/{organizationId}/transportAgencies | Lists organizations public transport agencies
[**listOrganizationPublicTransportRoutes**](PublicTransportApi.md#listOrganizationPublicTransportRoutes) | **GET** /organizations/{organizationId}/transportRoutes | Lists organizations public transport routes
[**listOrganizationPublicTransportSchedules**](PublicTransportApi.md#listOrganizationPublicTransportSchedules) | **GET** /organizations/{organizationId}/transportSchedules | Lists schedules of organization&#39;s public transport schedules
[**listOrganizationPublicTransportStopTimes**](PublicTransportApi.md#listOrganizationPublicTransportStopTimes) | **GET** /organizations/{organizationId}/transportStopTimes | Lists stopTimes of organization&#39;s public transport stopTimes
[**listOrganizationPublicTransportStops**](PublicTransportApi.md#listOrganizationPublicTransportStops) | **GET** /organizations/{organizationId}/transportStops | Lists organizations public transport stops
[**listOrganizationPublicTransportTrips**](PublicTransportApi.md#listOrganizationPublicTransportTrips) | **GET** /organizations/{organizationId}/transportTrips | Lists trips of organization&#39;s public transport trips


<a name="findOrganizationPublicTransportAgency"></a>
# **findOrganizationPublicTransportAgency**
> Agency findOrganizationPublicTransportAgency(organizationId, agencyId)

Finds an organizations public transport agency

Finds organization&#39;s single public transport agency 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var agencyId = "agencyId_example"; // String | Agency id

apiInstance.findOrganizationPublicTransportAgency(organizationId, agencyId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **agencyId** | **String**| Agency id | 

### Return type

[**Agency**](Agency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportRoute"></a>
# **findOrganizationPublicTransportRoute**
> Route findOrganizationPublicTransportRoute(organizationId, routeId)

Finds an organizations public transport route

Finds organization&#39;s single public transport route 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var routeId = "routeId_example"; // String | Route id

apiInstance.findOrganizationPublicTransportRoute(organizationId, routeId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **routeId** | **String**| Route id | 

### Return type

[**Route**](Route.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportSchedule"></a>
# **findOrganizationPublicTransportSchedule**
> Schedule findOrganizationPublicTransportSchedule(organizationId, scheduleId)

Finds organizations public transport schedule

Finds organizations public transport schedule 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var scheduleId = "scheduleId_example"; // String | Schedule id

apiInstance.findOrganizationPublicTransportSchedule(organizationId, scheduleId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **scheduleId** | **String**| Schedule id | 

### Return type

[**Schedule**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportStop"></a>
# **findOrganizationPublicTransportStop**
> Stop findOrganizationPublicTransportStop(organizationId, stopId)

Finds a stop of organizations public transport route

Finds a stop of organizations public transport route 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var stopId = "stopId_example"; // String | Stop id

apiInstance.findOrganizationPublicTransportStop(organizationId, stopId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **stopId** | **String**| Stop id | 

### Return type

[**Stop**](Stop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportStopTime"></a>
# **findOrganizationPublicTransportStopTime**
> StopTime findOrganizationPublicTransportStopTime(organizationId, stopTimeId)

Finds organizations public transport stopTime

Finds organizations public transport stopTime 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var stopTimeId = "stopTimeId_example"; // String | StopTime id

apiInstance.findOrganizationPublicTransportStopTime(organizationId, stopTimeId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **stopTimeId** | **String**| StopTime id | 

### Return type

[**StopTime**](StopTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportTrip"></a>
# **findOrganizationPublicTransportTrip**
> Trip findOrganizationPublicTransportTrip(organizationId, tripId)

Finds organizations public transport trip

Finds organizations public transport trip 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var tripId = "tripId_example"; // String | Trip id

apiInstance.findOrganizationPublicTransportTrip(organizationId, tripId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **tripId** | **String**| Trip id | 

### Return type

[**Trip**](Trip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportAgencies"></a>
# **listOrganizationPublicTransportAgencies**
> [Agency] listOrganizationPublicTransportAgencies(organizationId)

Lists organizations public transport agencies

Lists organizations public transport agencies 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationPublicTransportAgencies(organizationId).then(function(data) {
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

[**[Agency]**](Agency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportRoutes"></a>
# **listOrganizationPublicTransportRoutes**
> [Route] listOrganizationPublicTransportRoutes(organizationId)

Lists organizations public transport routes

Lists organizations public transport routes 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationPublicTransportRoutes(organizationId).then(function(data) {
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

[**[Route]**](Route.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportSchedules"></a>
# **listOrganizationPublicTransportSchedules**
> [Schedule] listOrganizationPublicTransportSchedules(organizationId)

Lists schedules of organization&#39;s public transport schedules

Lists schedules of organization&#39;s public transport schedules 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationPublicTransportSchedules(organizationId).then(function(data) {
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

[**[Schedule]**](Schedule.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportStopTimes"></a>
# **listOrganizationPublicTransportStopTimes**
> [StopTime] listOrganizationPublicTransportStopTimes(organizationId, opts)

Lists stopTimes of organization&#39;s public transport stopTimes

Lists stopTimes of organization&#39;s public transport stopTimes 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'stopId': "stopId_example", // String | Filter stop times by stopId
  'departureTime': 56, // Integer | Filter stop times that depart in or after specified time. Value is defined in seconds since midnight
  'sortBy': "sortBy_example", // String | DEPARTURE_TIME
  'sortDir': "sortDir_example" // String | ASC or DESC
};
apiInstance.listOrganizationPublicTransportStopTimes(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **stopId** | **String**| Filter stop times by stopId | [optional] 
 **departureTime** | **Integer**| Filter stop times that depart in or after specified time. Value is defined in seconds since midnight | [optional] 
 **sortBy** | **String**| DEPARTURE_TIME | [optional] 
 **sortDir** | **String**| ASC or DESC | [optional] 

### Return type

[**[StopTime]**](StopTime.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportStops"></a>
# **listOrganizationPublicTransportStops**
> [Stop] listOrganizationPublicTransportStops(organizationId)

Lists organizations public transport stops

Lists organizations public transport stops 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationPublicTransportStops(organizationId).then(function(data) {
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

[**[Stop]**](Stop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportTrips"></a>
# **listOrganizationPublicTransportTrips**
> [Trip] listOrganizationPublicTransportTrips(organizationId)

Lists trips of organization&#39;s public transport trips

Lists trips of organization&#39;s public transport trips 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.PublicTransportApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationPublicTransportTrips(organizationId).then(function(data) {
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

[**[Trip]**](Trip.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

