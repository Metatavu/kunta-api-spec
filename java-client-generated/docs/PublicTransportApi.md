# PublicTransportApi

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String agencyId = "agencyId_example"; // String | Agency id
try {
    Agency result = apiInstance.findOrganizationPublicTransportAgency(organizationId, agencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportAgency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **agencyId** | **String**| Agency id |

### Return type

[**Agency**](Agency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportRoute"></a>
# **findOrganizationPublicTransportRoute**
> Route findOrganizationPublicTransportRoute(organizationId, routeId)

Finds an organizations public transport route

Finds organization&#39;s single public transport route 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String routeId = "routeId_example"; // String | Route id
try {
    Route result = apiInstance.findOrganizationPublicTransportRoute(organizationId, routeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportRoute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **routeId** | **String**| Route id |

### Return type

[**Route**](Route.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportSchedule"></a>
# **findOrganizationPublicTransportSchedule**
> Schedule findOrganizationPublicTransportSchedule(organizationId, scheduleId)

Finds organizations public transport schedule

Finds organizations public transport schedule 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String scheduleId = "scheduleId_example"; // String | Schedule id
try {
    Schedule result = apiInstance.findOrganizationPublicTransportSchedule(organizationId, scheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **scheduleId** | **String**| Schedule id |

### Return type

[**Schedule**](Schedule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportStop"></a>
# **findOrganizationPublicTransportStop**
> Stop findOrganizationPublicTransportStop(organizationId, stopId)

Finds a stop of organizations public transport route

Finds a stop of organizations public transport route 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String stopId = "stopId_example"; // String | Stop id
try {
    Stop result = apiInstance.findOrganizationPublicTransportStop(organizationId, stopId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportStop");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **stopId** | **String**| Stop id |

### Return type

[**Stop**](Stop.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportStopTime"></a>
# **findOrganizationPublicTransportStopTime**
> StopTime findOrganizationPublicTransportStopTime(organizationId, stopTimeId)

Finds organizations public transport stopTime

Finds organizations public transport stopTime 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String stopTimeId = "stopTimeId_example"; // String | StopTime id
try {
    StopTime result = apiInstance.findOrganizationPublicTransportStopTime(organizationId, stopTimeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportStopTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **stopTimeId** | **String**| StopTime id |

### Return type

[**StopTime**](StopTime.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationPublicTransportTrip"></a>
# **findOrganizationPublicTransportTrip**
> Trip findOrganizationPublicTransportTrip(organizationId, tripId)

Finds organizations public transport trip

Finds organizations public transport trip 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String tripId = "tripId_example"; // String | Trip id
try {
    Trip result = apiInstance.findOrganizationPublicTransportTrip(organizationId, tripId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#findOrganizationPublicTransportTrip");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **tripId** | **String**| Trip id |

### Return type

[**Trip**](Trip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportAgencies"></a>
# **listOrganizationPublicTransportAgencies**
> List&lt;Agency&gt; listOrganizationPublicTransportAgencies(organizationId)

Lists organizations public transport agencies

Lists organizations public transport agencies 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Agency> result = apiInstance.listOrganizationPublicTransportAgencies(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportAgencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Agency&gt;**](Agency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportRoutes"></a>
# **listOrganizationPublicTransportRoutes**
> List&lt;Route&gt; listOrganizationPublicTransportRoutes(organizationId)

Lists organizations public transport routes

Lists organizations public transport routes 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Route> result = apiInstance.listOrganizationPublicTransportRoutes(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Route&gt;**](Route.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportSchedules"></a>
# **listOrganizationPublicTransportSchedules**
> List&lt;Schedule&gt; listOrganizationPublicTransportSchedules(organizationId)

Lists schedules of organization&#39;s public transport schedules

Lists schedules of organization&#39;s public transport schedules 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Schedule> result = apiInstance.listOrganizationPublicTransportSchedules(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Schedule&gt;**](Schedule.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportStopTimes"></a>
# **listOrganizationPublicTransportStopTimes**
> List&lt;StopTime&gt; listOrganizationPublicTransportStopTimes(organizationId, stopId, departureTime, sortBy, sortDir, firstResult, maxResults)

Lists stopTimes of organization&#39;s public transport stopTimes

Lists stopTimes of organization&#39;s public transport stopTimes 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
String stopId = "stopId_example"; // String | Filter stop times by stopId
Integer departureTime = 56; // Integer | Filter stop times that depart in or after specified time. Value is defined in seconds since midnight
String sortBy = "sortBy_example"; // String | DEPARTURE_TIME
String sortDir = "sortDir_example"; // String | ASC or DESC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<StopTime> result = apiInstance.listOrganizationPublicTransportStopTimes(organizationId, stopId, departureTime, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportStopTimes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **stopId** | **String**| Filter stop times by stopId | [optional]
 **departureTime** | **Integer**| Filter stop times that depart in or after specified time. Value is defined in seconds since midnight | [optional]
 **sortBy** | **String**| DEPARTURE_TIME | [optional]
 **sortDir** | **String**| ASC or DESC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;StopTime&gt;**](StopTime.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportStops"></a>
# **listOrganizationPublicTransportStops**
> List&lt;Stop&gt; listOrganizationPublicTransportStops(organizationId)

Lists organizations public transport stops

Lists organizations public transport stops 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Stop> result = apiInstance.listOrganizationPublicTransportStops(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportStops");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Stop&gt;**](Stop.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationPublicTransportTrips"></a>
# **listOrganizationPublicTransportTrips**
> List&lt;Trip&gt; listOrganizationPublicTransportTrips(organizationId)

Lists trips of organization&#39;s public transport trips

Lists trips of organization&#39;s public transport trips 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PublicTransportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PublicTransportApi apiInstance = new PublicTransportApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Trip> result = apiInstance.listOrganizationPublicTransportTrips(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicTransportApi#listOrganizationPublicTransportTrips");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Trip&gt;**](Trip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

