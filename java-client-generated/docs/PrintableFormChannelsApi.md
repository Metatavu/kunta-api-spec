# PrintableFormChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServicePrintableFormChannel**](PrintableFormChannelsApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
[**listServicePrintableFormChannels**](PrintableFormChannelsApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId


<a name="findServicePrintableFormChannel"></a>
# **findServicePrintableFormChannel**
> PrintableFormServiceChannel findServicePrintableFormChannel(serviceId, printableFormChannelId)

finds PrintableFormChannel by printableFormChannelId

finds PrintableFormChannels by printableFormChannelId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PrintableFormChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PrintableFormChannelsApi apiInstance = new PrintableFormChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
String printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id
try {
    PrintableFormServiceChannel result = apiInstance.findServicePrintableFormChannel(serviceId, printableFormChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintableFormChannelsApi#findServicePrintableFormChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **printableFormChannelId** | **String**| printableFormChannel id |

### Return type

[**PrintableFormServiceChannel**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePrintableFormChannels"></a>
# **listServicePrintableFormChannels**
> List&lt;PrintableFormServiceChannel&gt; listServicePrintableFormChannels(serviceId, firstResult, maxResults)

Lists PrintableFormChannels by serviceId

Lists PrintableFormChannels by serviceId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PrintableFormChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PrintableFormChannelsApi apiInstance = new PrintableFormChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PrintableFormServiceChannel> result = apiInstance.listServicePrintableFormChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PrintableFormChannelsApi#listServicePrintableFormChannels");
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

[**List&lt;PrintableFormServiceChannel&gt;**](PrintableFormServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

