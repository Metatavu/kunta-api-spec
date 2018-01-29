# FragmentsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationFragment**](FragmentsApi.md#findOrganizationFragment) | **GET** /organizations/{organizationId}/fragments/{fragmentId} | Finds organizations page fragment
[**listOrganizationFragments**](FragmentsApi.md#listOrganizationFragments) | **GET** /organizations/{organizationId}/fragments | Lists organizations page fragments


<a name="findOrganizationFragment"></a>
# **findOrganizationFragment**
> Fragment findOrganizationFragment(organizationId, fragmentId)

Finds organizations page fragment

Finds single organization page fragment 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FragmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FragmentsApi apiInstance = new FragmentsApi();
String organizationId = "organizationId_example"; // String | Organization id
String fragmentId = "fragmentId_example"; // String | fragment id
try {
    Fragment result = apiInstance.findOrganizationFragment(organizationId, fragmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FragmentsApi#findOrganizationFragment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **fragmentId** | **String**| fragment id |

### Return type

[**Fragment**](Fragment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationFragments"></a>
# **listOrganizationFragments**
> List&lt;Fragment&gt; listOrganizationFragments(organizationId, slug)

Lists organizations page fragments

Lists organizations page fragments 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FragmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FragmentsApi apiInstance = new FragmentsApi();
String organizationId = "organizationId_example"; // String | Organization id
String slug = "slug_example"; // String | Filter results by fragment slug
try {
    List<Fragment> result = apiInstance.listOrganizationFragments(organizationId, slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FragmentsApi#listOrganizationFragments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **slug** | **String**| Filter results by fragment slug | [optional]

### Return type

[**List&lt;Fragment&gt;**](Fragment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

