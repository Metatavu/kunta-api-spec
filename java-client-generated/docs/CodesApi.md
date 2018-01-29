# CodesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findCode**](CodesApi.md#findCode) | **GET** /codes/{codeId} | Finds a code
[**listCodes**](CodesApi.md#listCodes) | **GET** /codes | Lists codes


<a name="findCode"></a>
# **findCode**
> Code findCode(codeId)

Finds a code

Finds a code

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.CodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CodesApi apiInstance = new CodesApi();
String codeId = "codeId_example"; // String | Id of the code
try {
    Code result = apiInstance.findCode(codeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#findCode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeId** | **String**| Id of the code |

### Return type

[**Code**](Code.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listCodes"></a>
# **listCodes**
> List&lt;Code&gt; listCodes(types, search, sortBy, sortDir, firstResult, maxResults)

Lists codes

Lists codes

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.CodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CodesApi apiInstance = new CodesApi();
List<String> types = Arrays.asList("types_example"); // List<String> | Filter results by types
String search = "search_example"; // String | Search codes by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is SCORE
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<Code> result = apiInstance.listCodes(types, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CodesApi#listCodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **types** | [**List&lt;String&gt;**](String.md)| Filter results by types | [optional]
 **search** | **String**| Search codes by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is SCORE | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;Code&gt;**](Code.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

