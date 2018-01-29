# PhoneChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findServicePhoneChannel**](PhoneChannelsApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
[**listServicePhoneChannels**](PhoneChannelsApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId


<a name="findServicePhoneChannel"></a>
# **findServicePhoneChannel**
> PhoneServiceChannel findServicePhoneChannel(serviceId, phoneChannelId)

finds PhoneChannel by phoneChannelId

finds PhoneChannels by phoneChannelId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PhoneChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhoneChannelsApi apiInstance = new PhoneChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
String phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id
try {
    PhoneServiceChannel result = apiInstance.findServicePhoneChannel(serviceId, phoneChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneChannelsApi#findServicePhoneChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **phoneChannelId** | **String**| phoneChannel id |

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServicePhoneChannels"></a>
# **listServicePhoneChannels**
> List&lt;PhoneServiceChannel&gt; listServicePhoneChannels(serviceId, firstResult, maxResults)

Lists PhoneChannels by serviceId

Lists PhoneChannels by serviceId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PhoneChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhoneChannelsApi apiInstance = new PhoneChannelsApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PhoneServiceChannel> result = apiInstance.listServicePhoneChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneChannelsApi#listServicePhoneChannels");
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

[**List&lt;PhoneServiceChannel&gt;**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

