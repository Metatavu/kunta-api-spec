# EventsApi

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventsApi apiInstance = new EventsApi();
String organizationId = "organizationId_example"; // String | Organization id
String eventId = "eventId_example"; // String | Event id
try {
    Event result = apiInstance.findOrganizationEvent(organizationId, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#findOrganizationEvent");
    e.printStackTrace();
}
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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventsApi apiInstance = new EventsApi();
String organizationId = "organizationId_example"; // String | Organization id
String eventId = "eventId_example"; // String | Event id
String imageId = "imageId_example"; // String | Event image id
try {
    Attachment result = apiInstance.findOrganizationEventImage(organizationId, eventId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#findOrganizationEventImage");
    e.printStackTrace();
}
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
> byte[] getOrganizationEventImageData(organizationId, eventId, imageId, size)

Returns an event image data

Returns an event image data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventsApi apiInstance = new EventsApi();
String organizationId = "organizationId_example"; // String | Organization id
String eventId = "eventId_example"; // String | Event id
String imageId = "imageId_example"; // String | Event image id
Integer size = 56; // Integer | Maximum width or height of image
try {
    byte[] result = apiInstance.getOrganizationEventImageData(organizationId, eventId, imageId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getOrganizationEventImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **eventId** | **String**| Event id |
 **imageId** | **String**| Event image id |
 **size** | **Integer**| Maximum width or height of image | [optional]

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationEventImages"></a>
# **listOrganizationEventImages**
> List&lt;Attachment&gt; listOrganizationEventImages(organizationId, eventId)

Returns list of event images

Returns list of event images 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventsApi apiInstance = new EventsApi();
String organizationId = "organizationId_example"; // String | Organization id
String eventId = "eventId_example"; // String | Event id
try {
    List<Attachment> result = apiInstance.listOrganizationEventImages(organizationId, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#listOrganizationEventImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **eventId** | **String**| Event id |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEvents"></a>
# **listOrganizationEvents**
> List&lt;Event&gt; listOrganizationEvents(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir)

Lists organizations events

Lists organizations events 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EventsApi apiInstance = new EventsApi();
String organizationId = "organizationId_example"; // String | Organization id
String startBefore = "startBefore_example"; // String | return only events starting before the date
String startAfter = "startAfter_example"; // String | return only events starting after the date
String endBefore = "endBefore_example"; // String | return only events ending before the date
String endAfter = "endAfter_example"; // String | return only events ending after the date
Integer firstResult = 56; // Integer | first index of results
Integer maxResults = 56; // Integer | maximum number of results
String orderBy = "orderBy_example"; // String | define order (startDate, endDate). Default is startDate
String orderDir = "orderDir_example"; // String | ascending, descending. Default is ascending
try {
    List<Event> result = apiInstance.listOrganizationEvents(organizationId, startBefore, startAfter, endBefore, endAfter, firstResult, maxResults, orderBy, orderDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#listOrganizationEvents");
    e.printStackTrace();
}
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

[**List&lt;Event&gt;**](Event.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

