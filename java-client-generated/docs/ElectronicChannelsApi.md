# ElectronicChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServiceElectronicChannel**](ElectronicChannelsApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
[**listServiceElectronicChannels**](ElectronicChannelsApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId


<a name="findServiceElectronicChannel"></a>
# **findServiceElectronicChannel**
> ElectronicServiceChannel findServiceElectronicChannel(serviceId, electronicChannelId)

finds ElectronicChannel by electronicChannelId

finds ElectronicChannels by electronicChannelId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ElectronicChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ElectronicChannelsApi apiInstance = new ElectronicChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
String electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id
try {
    ElectronicServiceChannel result = apiInstance.findServiceElectronicChannel(serviceId, electronicChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronicChannelsApi#findServiceElectronicChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **electronicChannelId** | **String**| electronicChannel id |

### Return type

[**ElectronicServiceChannel**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServiceElectronicChannels"></a>
# **listServiceElectronicChannels**
> List&lt;ElectronicServiceChannel&gt; listServiceElectronicChannels(serviceId, firstResult, maxResults)

Lists ElectronicChannels by serviceId

Lists ElectronicChannels by serviceId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ElectronicChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ElectronicChannelsApi apiInstance = new ElectronicChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ElectronicServiceChannel> result = apiInstance.listServiceElectronicChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElectronicChannelsApi#listServiceElectronicChannels");
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

[**List&lt;ElectronicServiceChannel&gt;**](ElectronicServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

