# ServicesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createService**](ServicesApi.md#createService) | **POST** /services | Create service
[**findService**](ServicesApi.md#findService) | **GET** /services/{serviceId} | Finds a service by id
[**findServiceElectronicChannel**](ServicesApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
[**findServicePhoneChannel**](ServicesApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
[**findServicePrintableFormChannel**](ServicesApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
[**findServiceServiceLocationChannel**](ServicesApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
[**findServiceWebPageChannel**](ServicesApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
[**listServiceElectronicChannels**](ServicesApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId
[**listServicePhoneChannels**](ServicesApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId
[**listServicePrintableFormChannels**](ServicesApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId
[**listServiceServiceLocationChannels**](ServicesApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId
[**listServiceWebPageChannels**](ServicesApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId
[**listServices**](ServicesApi.md#listServices) | **GET** /services | Service list
[**updateService**](ServicesApi.md#updateService) | **PUT** /services/{serviceId} | Updates service


<a name="createService"></a>
# **createService**
> Service createService(body)

Create service

Creates new service

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
Service body = new Service(); // Service | Payload
try {
    Service result = apiInstance.createService(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#createService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Service**](Service.md)| Payload |

### Return type

[**Service**](Service.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findService"></a>
# **findService**
> Service findService(serviceId)

Finds a service by id

Finds service

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
try {
    Service result = apiInstance.findService(serviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |

### Return type

[**Service**](Service.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
String electronicChannelId = "electronicChannelId_example"; // String | electronicChannel id
try {
    ElectronicServiceChannel result = apiInstance.findServiceElectronicChannel(serviceId, electronicChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findServiceElectronicChannel");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
String phoneChannelId = "phoneChannelId_example"; // String | phoneChannel id
try {
    PhoneServiceChannel result = apiInstance.findServicePhoneChannel(serviceId, phoneChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findServicePhoneChannel");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
String printableFormChannelId = "printableFormChannelId_example"; // String | printableFormChannel id
try {
    PrintableFormServiceChannel result = apiInstance.findServicePrintableFormChannel(serviceId, printableFormChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findServicePrintableFormChannel");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
String serviceLocationChannelId = "serviceLocationChannelId_example"; // String | serviceLocationChannel id
try {
    ServiceLocationServiceChannel result = apiInstance.findServiceServiceLocationChannel(serviceId, serviceLocationChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findServiceServiceLocationChannel");
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

<a name="findServiceWebPageChannel"></a>
# **findServiceWebPageChannel**
> WebPageServiceChannel findServiceWebPageChannel(serviceId, webPageChannelId)

finds WebPageChannel by webPageChannelId

finds WebPageChannels by webPageChannelId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
String webPageChannelId = "webPageChannelId_example"; // String | webPageChannel id
try {
    WebPageServiceChannel result = apiInstance.findServiceWebPageChannel(serviceId, webPageChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#findServiceWebPageChannel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Service id |
 **webPageChannelId** | **String**| webPageChannel id |

### Return type

[**WebPageServiceChannel**](WebPageServiceChannel.md)

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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ElectronicServiceChannel> result = apiInstance.listServiceElectronicChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServiceElectronicChannels");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PhoneServiceChannel> result = apiInstance.listServicePhoneChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServicePhoneChannels");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<PrintableFormServiceChannel> result = apiInstance.listServicePrintableFormChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServicePrintableFormChannels");
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
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<ServiceLocationServiceChannel> result = apiInstance.listServiceServiceLocationChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServiceServiceLocationChannels");
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

<a name="listServiceWebPageChannels"></a>
# **listServiceWebPageChannels**
> List&lt;WebPageServiceChannel&gt; listServiceWebPageChannels(serviceId, firstResult, maxResults)

Lists WebPageChannels by serviceId

Lists WebPageChannels by serviceId

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Service id
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<WebPageServiceChannel> result = apiInstance.listServiceWebPageChannels(serviceId, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServiceWebPageChannels");
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

[**List&lt;WebPageServiceChannel&gt;**](WebPageServiceChannel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listServices"></a>
# **listServices**
> List&lt;Service&gt; listServices(organizationId, search, sortBy, sortDir, firstResult, maxResults, electronicServiceChannelId, phoneServiceChannelId, printableFormServiceChannelId, serviceLocationServiceChannelId, webPageServiceChannelId)

Service list

Lists services

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String organizationId = "organizationId_example"; // String | Return only services belonging to specified organization
String search = "search_example"; // String | Search services by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
String electronicServiceChannelId = "electronicServiceChannelId_example"; // String | Return only services that are connected to specified electronic service channel
String phoneServiceChannelId = "phoneServiceChannelId_example"; // String | Return only services that are connected to specified phone service channel
String printableFormServiceChannelId = "printableFormServiceChannelId_example"; // String | Return only services that are connected to specified printable form service channel
String serviceLocationServiceChannelId = "serviceLocationServiceChannelId_example"; // String | Return only services that are connected to specified location service channel
String webPageServiceChannelId = "webPageServiceChannelId_example"; // String | Return only services that are connected to specified webpage service channel
try {
    List<Service> result = apiInstance.listServices(organizationId, search, sortBy, sortDir, firstResult, maxResults, electronicServiceChannelId, phoneServiceChannelId, printableFormServiceChannelId, serviceLocationServiceChannelId, webPageServiceChannelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#listServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Return only services belonging to specified organization | [optional]
 **search** | **String**| Search services by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]
 **electronicServiceChannelId** | **String**| Return only services that are connected to specified electronic service channel | [optional]
 **phoneServiceChannelId** | **String**| Return only services that are connected to specified phone service channel | [optional]
 **printableFormServiceChannelId** | **String**| Return only services that are connected to specified printable form service channel | [optional]
 **serviceLocationServiceChannelId** | **String**| Return only services that are connected to specified location service channel | [optional]
 **webPageServiceChannelId** | **String**| Return only services that are connected to specified webpage service channel | [optional]

### Return type

[**List&lt;Service&gt;**](Service.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateService"></a>
# **updateService**
> Service updateService(serviceId, body)

Updates service

Updates service

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ServicesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ServicesApi apiInstance = new ServicesApi();
String serviceId = "serviceId_example"; // String | Organization service id
Service body = new Service(); // Service | Payload
try {
    Service result = apiInstance.updateService(serviceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServicesApi#updateService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceId** | **String**| Organization service id |
 **body** | [**Service**](Service.md)| Payload |

### Return type

[**Service**](Service.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

