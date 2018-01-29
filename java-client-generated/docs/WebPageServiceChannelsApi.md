# WebPageServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findWebPageServiceChannel**](WebPageServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
[**listWebPageServiceChannels**](WebPageServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels
[**updateWebPageServiceChannel**](WebPageServiceChannelsApi.md#updateWebPageServiceChannel) | **PUT** /webPageServiceChannels/{webPageServiceChannelId} | Updates a channel


<a name="findWebPageServiceChannel"></a>
# **findWebPageServiceChannel**
> WebPageServiceChannel findWebPageServiceChannel(webPageServiceChannelId)

Finds a web page service channel by id

Finds a web page service channel by id

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.WebPageServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebPageServiceChannelsApi apiInstance = new WebPageServiceChannelsApi();
String webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id
try {
    WebPageServiceChannel result = apiInstance.findWebPageServiceChannel(webPageServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebPageServiceChannelsApi#findWebPageServiceChannel");
    e.printStackTrace();
}
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

<a name="listWebPageServiceChannels"></a>
# **listWebPageServiceChannels**
> List&lt;WebPageServiceChannel&gt; listWebPageServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults)

Lists web page service channels

Lists web page service channels

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.WebPageServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebPageServiceChannelsApi apiInstance = new WebPageServiceChannelsApi();
String organizationId = "organizationId_example"; // String | Organization id
String search = "search_example"; // String | Search channels by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<WebPageServiceChannel> result = apiInstance.listWebPageServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebPageServiceChannelsApi#listWebPageServiceChannels");
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

[**List&lt;WebPageServiceChannel&gt;**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateWebPageServiceChannel"></a>
# **updateWebPageServiceChannel**
> WebPageServiceChannel updateWebPageServiceChannel(webPageServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.WebPageServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WebPageServiceChannelsApi apiInstance = new WebPageServiceChannelsApi();
String webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id
WebPageServiceChannel payload = new WebPageServiceChannel(); // WebPageServiceChannel | New webPage service data
try {
    WebPageServiceChannel result = apiInstance.updateWebPageServiceChannel(webPageServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebPageServiceChannelsApi#updateWebPageServiceChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webPageServiceChannelId** | **String**| webPageChannel id |
 **payload** | [**WebPageServiceChannel**](WebPageServiceChannel.md)| New webPage service data |

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

