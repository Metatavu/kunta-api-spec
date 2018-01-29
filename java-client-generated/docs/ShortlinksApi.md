# ShortlinksApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationShortlink**](ShortlinksApi.md#findOrganizationShortlink) | **GET** /organizations/{organizationId}/shortlinks/{shortlinkId} | Finds organization shortlink
[**listOrganizationShortlinks**](ShortlinksApi.md#listOrganizationShortlinks) | **GET** /organizations/{organizationId}/shortlinks | Lists organizations shortlinks


<a name="findOrganizationShortlink"></a>
# **findOrganizationShortlink**
> Shortlink findOrganizationShortlink(organizationId, shortlinkId)

Finds organization shortlink

Finds single organization shortlink 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ShortlinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ShortlinksApi apiInstance = new ShortlinksApi();
String organizationId = "organizationId_example"; // String | Organization id
String shortlinkId = "shortlinkId_example"; // String | shortlink id
try {
    Shortlink result = apiInstance.findOrganizationShortlink(organizationId, shortlinkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortlinksApi#findOrganizationShortlink");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **shortlinkId** | **String**| shortlink id |

### Return type

[**Shortlink**](Shortlink.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationShortlinks"></a>
# **listOrganizationShortlinks**
> List&lt;Shortlink&gt; listOrganizationShortlinks(organizationId, path, firstResult, maxResults)

Lists organizations shortlinks

Lists organizations shortlinks 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.ShortlinksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ShortlinksApi apiInstance = new ShortlinksApi();
String organizationId = "organizationId_example"; // String | Organization id
String path = "path_example"; // String | Filter results by path
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<Shortlink> result = apiInstance.listOrganizationShortlinks(organizationId, path, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShortlinksApi#listOrganizationShortlinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **path** | **String**| Filter results by path | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;Shortlink&gt;**](Shortlink.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

