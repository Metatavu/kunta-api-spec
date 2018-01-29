# PrintableFormServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPrintableFormServiceChannel**](PrintableFormServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
[**listPrintableFormServiceChannels**](PrintableFormServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels
[**updatePrintableFormServiceChannel**](PrintableFormServiceChannelsApi.md#updatePrintableFormServiceChannel) | **PUT** /printableFormServiceChannels/{printableFormServiceChannelId} | Updates a channel


<a name="findPrintableFormServiceChannel"></a>
# **findPrintableFormServiceChannel**
> PrintableFormServiceChannel findPrintableFormServiceChannel(printableFormServiceChannelId)

Finds a printable form service channel

Finds a printable form service channel

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PrintableFormServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PrintableFormServiceChannelsApi apiInstance = new PrintableFormServiceChannelsApi();
String printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | Printable form service channel id
try {
    PrintableFormServiceChannel result = apiInstance.findPrintableFormServiceChannel(printableFormServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintableFormServiceChannelsApi#findPrintableFormServiceChannel");
    e.printStackTrace();
}
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

<a name="listPrintableFormServiceChannels"></a>
# **listPrintableFormServiceChannels**
> List&lt;PrintableFormServiceChannel&gt; listPrintableFormServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults)

Lists printable form service channels

Lists printable form service channels

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PrintableFormServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PrintableFormServiceChannelsApi apiInstance = new PrintableFormServiceChannelsApi();
String organizationId = "organizationId_example"; // String | Organization id
String search = "search_example"; // String | Search channels by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PrintableFormServiceChannel> result = apiInstance.listPrintableFormServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintableFormServiceChannelsApi#listPrintableFormServiceChannels");
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

[**List&lt;PrintableFormServiceChannel&gt;**](PrintableFormServiceChannel.md)

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PrintableFormServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PrintableFormServiceChannelsApi apiInstance = new PrintableFormServiceChannelsApi();
String printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | printable form channel id
PrintableFormServiceChannel payload = new PrintableFormServiceChannel(); // PrintableFormServiceChannel | New printable form service data
try {
    PrintableFormServiceChannel result = apiInstance.updatePrintableFormServiceChannel(printableFormServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintableFormServiceChannelsApi#updatePrintableFormServiceChannel");
    e.printStackTrace();
}
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

