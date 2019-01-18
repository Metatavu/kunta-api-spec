# EnvironmentalWarningsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationEnvironmentalWarning**](EnvironmentalWarningsApi.md#findOrganizationEnvironmentalWarning) | **GET** /organizations/{organizationId}/environmentalWarnings/{environmentalWarningId} | Returns organizations environmental warning by id
[**listOrganizationEnvironmentalWarnings**](EnvironmentalWarningsApi.md#listOrganizationEnvironmentalWarnings) | **GET** /organizations/{organizationId}/environmentalWarnings | Lists organizations environmentalWarnings


<a name="findOrganizationEnvironmentalWarning"></a>
# **findOrganizationEnvironmentalWarning**
> EnvironmentalWarning findOrganizationEnvironmentalWarning(organizationId, environmentalWarningId)

Returns organizations environmental warning by id

Returns organizations environmental warning by id 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EnvironmentalWarningsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EnvironmentalWarningsApi apiInstance = new EnvironmentalWarningsApi();
String organizationId = "organizationId_example"; // String | Organization id
String environmentalWarningId = "environmentalWarningId_example"; // String | Environmental warning id
try {
    EnvironmentalWarning result = apiInstance.findOrganizationEnvironmentalWarning(organizationId, environmentalWarningId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentalWarningsApi#findOrganizationEnvironmentalWarning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **environmentalWarningId** | **String**| Environmental warning id |

### Return type

[**EnvironmentalWarning**](EnvironmentalWarning.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEnvironmentalWarnings"></a>
# **listOrganizationEnvironmentalWarnings**
> List&lt;EnvironmentalWarning&gt; listOrganizationEnvironmentalWarnings(organizationId, firstResult, contexts, before, after, maxResults, orderBy, orderDir)

Lists organizations environmentalWarnings

Lists organizations environmentalWarnings 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EnvironmentalWarningsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EnvironmentalWarningsApi apiInstance = new EnvironmentalWarningsApi();
String organizationId = "organizationId_example"; // String | Organization id
Integer firstResult = 56; // Integer | First index of results
String contexts = "contexts_example"; // String | Return environmental warnings by contexts.
String before = "before_example"; // String | Return environmental warnings before specified time
String after = "after_example"; // String | Return environmental warnings after specified time
Integer maxResults = 56; // Integer | Maximum number of results
String orderBy = "orderBy_example"; // String | Define order (NATURAL, START)
String orderDir = "orderDir_example"; // String | Order direction (ASC, DESC). Default is ASC
try {
    List<EnvironmentalWarning> result = apiInstance.listOrganizationEnvironmentalWarnings(organizationId, firstResult, contexts, before, after, maxResults, orderBy, orderDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnvironmentalWarningsApi#listOrganizationEnvironmentalWarnings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **firstResult** | **Integer**| First index of results | [optional]
 **contexts** | **String**| Return environmental warnings by contexts. | [optional]
 **before** | **String**| Return environmental warnings before specified time | [optional]
 **after** | **String**| Return environmental warnings after specified time | [optional]
 **maxResults** | **Integer**| Maximum number of results | [optional]
 **orderBy** | **String**| Define order (NATURAL, START) | [optional]
 **orderDir** | **String**| Order direction (ASC, DESC). Default is ASC | [optional]

### Return type

[**List&lt;EnvironmentalWarning&gt;**](EnvironmentalWarning.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

