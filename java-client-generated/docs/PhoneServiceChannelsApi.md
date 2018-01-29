# PhoneServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPhoneServiceChannel**](PhoneServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
[**listPhoneServiceChannels**](PhoneServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
[**updatePhoneServiceChannel**](PhoneServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel


<a name="findPhoneServiceChannel"></a>
# **findPhoneServiceChannel**
> PhoneServiceChannel findPhoneServiceChannel(phoneServiceChannelId)

Finds a phone service channel by id

Finds a phone service channel by id

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PhoneServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhoneServiceChannelsApi apiInstance = new PhoneServiceChannelsApi();
String phoneServiceChannelId = "phoneServiceChannelId_example"; // String | Phone service channel id
try {
    PhoneServiceChannel result = apiInstance.findPhoneServiceChannel(phoneServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneServiceChannelsApi#findPhoneServiceChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| Phone service channel id |

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPhoneServiceChannels"></a>
# **listPhoneServiceChannels**
> List&lt;PhoneServiceChannel&gt; listPhoneServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults)

Lists phone service channels

Lists phone service channels

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PhoneServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhoneServiceChannelsApi apiInstance = new PhoneServiceChannelsApi();
String organizationId = "organizationId_example"; // String | Organization id
String search = "search_example"; // String | Search channels by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PhoneServiceChannel> result = apiInstance.listPhoneServiceChannels(organizationId, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneServiceChannelsApi#listPhoneServiceChannels");
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

[**List&lt;PhoneServiceChannel&gt;**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updatePhoneServiceChannel"></a>
# **updatePhoneServiceChannel**
> PhoneServiceChannel updatePhoneServiceChannel(phoneServiceChannelId, payload)

Updates a channel

Updates a service channel

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.PhoneServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

PhoneServiceChannelsApi apiInstance = new PhoneServiceChannelsApi();
String phoneServiceChannelId = "phoneServiceChannelId_example"; // String | phone channel id
PhoneServiceChannel payload = new PhoneServiceChannel(); // PhoneServiceChannel | New phone service data
try {
    PhoneServiceChannel result = apiInstance.updatePhoneServiceChannel(phoneServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PhoneServiceChannelsApi#updatePhoneServiceChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **phoneServiceChannelId** | **String**| phone channel id |
 **payload** | [**PhoneServiceChannel**](PhoneServiceChannel.md)| New phone service data |

### Return type

[**PhoneServiceChannel**](PhoneServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

