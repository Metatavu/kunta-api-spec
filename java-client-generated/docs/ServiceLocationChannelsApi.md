# ServiceLocationChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceServiceLocationChannel**](ServiceLocationChannelsApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
[**listServiceServiceLocationChannels**](ServiceLocationChannelsApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId


<a name="findServiceServiceLocationChannel"></a>
# **findServiceServiceLocationChannel**
> ServiceLocationServiceChannel findServiceServiceLocationChannel(serviceId, serviceLocationChannelId)

finds ServiceLocationChannel by serviceLocationChannelId

finds ServiceLocationChannels by serviceLocationChannelId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServiceLocationChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceLocationChannelsApi apiInstance = new ServiceLocationChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
String serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id
try {
    ServiceLocationServiceChannel result = apiInstance.findServiceServiceLocationChannel(serviceId, serviceLocationChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceLocationChannelsApi#findServiceServiceLocationChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **serviceLocationChannelId** | **String**| serviceLocationChannel id |

### Return type

[**ServiceLocationServiceChannel**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceServiceLocationChannels"></a>
# **listServiceServiceLocationChannels**
> List&lt;ServiceLocationServiceChannel&gt; listServiceServiceLocationChannels(serviceId, firstResult, maxResults)

Lists ServiceLocationChannels by serviceId

Lists ServiceLocationChannels by serviceId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServiceLocationChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceLocationChannelsApi apiInstance = new ServiceLocationChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ServiceLocationServiceChannel> result = apiInstance.listServiceServiceLocationChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceLocationChannelsApi#listServiceServiceLocationChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;ServiceLocationServiceChannel&gt;**](ServiceLocationServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

