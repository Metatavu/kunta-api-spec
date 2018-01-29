# ServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findElectronicServiceChannel**](ServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
[**findPhoneServiceChannel**](ServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
[**findPrintableFormServiceChannel**](ServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
[**findServiceLocationServiceChannel**](ServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
[**findWebPageServiceChannel**](ServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
[**listElectronicServiceChannels**](ServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels
[**listPhoneServiceChannels**](ServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
[**listPrintableFormServiceChannels**](ServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels
[**listServiceLocationServiceChannels**](ServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels
[**listWebPageServiceChannels**](ServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels
[**updateElectronicServiceChannel**](ServiceChannelsApi.md#updateElectronicServiceChannel) | **PUT** /electronicServiceChannels/{electronicServiceChannelId} | Updates a channel
[**updatePhoneServiceChannel**](ServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel
[**updatePrintableFormServiceChannel**](ServiceChannelsApi.md#updatePrintableFormServiceChannel) | **PUT** /printableFormServiceChannels/{printableFormServiceChannelId} | Updates a channel
[**updateServiceLocationServiceChannel**](ServiceChannelsApi.md#updateServiceLocationServiceChannel) | **PUT** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Updates a service location channel
[**updateWebPageServiceChannel**](ServiceChannelsApi.md#updateWebPageServiceChannel) | **PUT** /webPageServiceChannels/{webPageServiceChannelId} | Updates a channel


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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id
try {
    ElectronicServiceChannel result = apiInstance.findElectronicServiceChannel(electronicServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#findElectronicServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String phoneServiceChannelId = "phoneServiceChannelId_example"; // String | Phone service channel id
try {
    PhoneServiceChannel result = apiInstance.findPhoneServiceChannel(phoneServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#findPhoneServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | Printable form service channel id
try {
    PrintableFormServiceChannel result = apiInstance.findPrintableFormServiceChannel(printableFormServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#findPrintableFormServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id
try {
    ServiceLocationServiceChannel result = apiInstance.findServiceLocationServiceChannel(serviceLocationServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#findServiceLocationServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id
try {
    WebPageServiceChannel result = apiInstance.findWebPageServiceChannel(webPageServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#findWebPageServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
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
    System.err.println("Exception when calling ServiceChannelsApi#listElectronicServiceChannels");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
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
    System.err.println("Exception when calling ServiceChannelsApi#listPhoneServiceChannels");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
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
    System.err.println("Exception when calling ServiceChannelsApi#listPrintableFormServiceChannels");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
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
    System.err.println("Exception when calling ServiceChannelsApi#listServiceLocationServiceChannels");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
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
    System.err.println("Exception when calling ServiceChannelsApi#listWebPageServiceChannels");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String electronicServiceChannelId = "electronicServiceChannelId_example"; // String | electronicChannel id
ElectronicServiceChannel payload = new ElectronicServiceChannel(); // ElectronicServiceChannel | New electronic service data
try {
    ElectronicServiceChannel result = apiInstance.updateElectronicServiceChannel(electronicServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#updateElectronicServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String phoneServiceChannelId = "phoneServiceChannelId_example"; // String | phone channel id
PhoneServiceChannel payload = new PhoneServiceChannel(); // PhoneServiceChannel | New phone service data
try {
    PhoneServiceChannel result = apiInstance.updatePhoneServiceChannel(phoneServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#updatePhoneServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | printable form channel id
PrintableFormServiceChannel payload = new PrintableFormServiceChannel(); // PrintableFormServiceChannel | New printable form service data
try {
    PrintableFormServiceChannel result = apiInstance.updatePrintableFormServiceChannel(printableFormServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#updatePrintableFormServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | serviceLocationChannel id
ServiceLocationServiceChannel serviceLocationChannel = new ServiceLocationServiceChannel(); // ServiceLocationServiceChannel | New service location channel data
try {
    ServiceLocationServiceChannel result = apiInstance.updateServiceLocationServiceChannel(serviceLocationServiceChannelId, serviceLocationChannel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#updateServiceLocationServiceChannel");
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
//import fi.metatavu.kuntaapi.client.ServiceChannelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServiceChannelsApi apiInstance = new ServiceChannelsApi();
String webPageServiceChannelId = "webPageServiceChannelId_example"; // String | webPageChannel id
WebPageServiceChannel payload = new WebPageServiceChannel(); // WebPageServiceChannel | New webPage service data
try {
    WebPageServiceChannel result = apiInstance.updateWebPageServiceChannel(webPageServiceChannelId, payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceChannelsApi#updateWebPageServiceChannel");
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

