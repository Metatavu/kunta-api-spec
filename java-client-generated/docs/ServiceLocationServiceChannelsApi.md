# ServiceLocationServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceLocationServiceChannel**](ServiceLocationServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
[**listServiceLocationServiceChannels**](ServiceLocationServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels
[**updateServiceLocationServiceChannel**](ServiceLocationServiceChannelsApi.md#updateServiceLocationServiceChannel) | **PUT** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Updates a service location channel


<a name="findServiceLocationServiceChannel"></a>
# **findServiceLocationServiceChannel**
> ServiceLocationServiceChannel findServiceLocationServiceChannel(serviceLocationServiceChannelId)

Finds a service location service by id

Finds a service location service by id

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServiceLocationServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceLocationServiceChannelsApi apiInstance = new ServiceLocationServiceChannelsApi();
String serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id
try {
    ServiceLocationServiceChannel result = apiInstance.findServiceLocationServiceChannel(serviceLocationServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceLocationServiceChannelsApi#findServiceLocationServiceChannel");
    e.printStackTrace();
}
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

<a name="listServiceLocationServiceChannels"></a>
# **listServiceLocationServiceChannels**
> List&lt;ServiceLocationServiceChannel&gt; listServiceLocationServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults)

Lists service location service channels

Lists service location service channels

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServiceLocationServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceLocationServiceChannelsApi apiInstance = new ServiceLocationServiceChannelsApi();
String organizationId = "organizationId_example"; // String | Organization id
String search = "search_example"; // String | Search service location channels by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ServiceLocationServiceChannel> result = apiInstance.listServiceLocationServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceLocationServiceChannelsApi#listServiceLocationServiceChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional]
 **search** | **String**| Search service location channels by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;ServiceLocationServiceChannel&gt;**](ServiceLocationServiceChannel.md)

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServiceLocationServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceLocationServiceChannelsApi apiInstance = new ServiceLocationServiceChannelsApi();
String serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id
ServiceLocationServiceChannel serviceLocationChannel = new ServiceLocationServiceChannel(); // ServiceLocationServiceChannel | New service location channel data
try {
    ServiceLocationServiceChannel result = apiInstance.updateServiceLocationServiceChannel(serviceLocationServiceChannelId, serviceLocationChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceLocationServiceChannelsApi#updateServiceLocationServiceChannel");
    e.printStackTrace();
}
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

