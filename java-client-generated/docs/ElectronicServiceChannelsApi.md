# ElectronicServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findElectronicServiceChannel**](ElectronicServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
[**listElectronicServiceChannels**](ElectronicServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels
[**updateElectronicServiceChannel**](ElectronicServiceChannelsApi.md#updateElectronicServiceChannel) | **PUT** /electronicServiceChannels/{electronicServiceChannelId} | Updates a channel


<a name="findElectronicServiceChannel"></a>
# **findElectronicServiceChannel**
> ElectronicServiceChannel findElectronicServiceChannel(electronicServiceChannelId)

Finds an electronic service channel by id

Finds an electronic service channel by id

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ElectronicServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ElectronicServiceChannelsApi apiInstance = new ElectronicServiceChannelsApi();
String electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id
try {
    ElectronicServiceChannel result = apiInstance.findElectronicServiceChannel(electronicServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronicServiceChannelsApi#findElectronicServiceChannel");
    e.printStackTrace();
}
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

<a name="listElectronicServiceChannels"></a>
# **listElectronicServiceChannels**
> List&lt;ElectronicServiceChannel&gt; listElectronicServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults)

Lists electronic service channels

Lists electronic service channels

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ElectronicServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ElectronicServiceChannelsApi apiInstance = new ElectronicServiceChannelsApi();
String organizationId = "organizationId_example"; // String | Organization id
String search = "search_example"; // String | Search channels by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ElectronicServiceChannel> result = apiInstance.listElectronicServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronicServiceChannelsApi#listElectronicServiceChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | [optional]
 **search** | **String**| Search channels by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;ElectronicServiceChannel&gt;**](ElectronicServiceChannel.md)

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ElectronicServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ElectronicServiceChannelsApi apiInstance = new ElectronicServiceChannelsApi();
String electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id
ElectronicServiceChannel payload = new ElectronicServiceChannel(); // ElectronicServiceChannel | New electronic service data
try {
    ElectronicServiceChannel result = apiInstance.updateElectronicServiceChannel(electronicServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronicServiceChannelsApi#updateElectronicServiceChannel");
    e.printStackTrace();
}
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

