# EmergenciesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationEmergency**](EmergenciesApi.md#findOrganizationEmergency) | **GET** /organizations/{organizationId}/emergencies/{emergencyId} | Returns organizations emergency by id
[**listOrganizationEmergencies**](EmergenciesApi.md#listOrganizationEmergencies) | **GET** /organizations/{organizationId}/emergencies | Lists organizations emergencies


<a name="findOrganizationEmergency"></a>
# **findOrganizationEmergency**
> Emergency findOrganizationEmergency(organizationId, emergencyId)

Returns organizations emergency by id

Returns organizations emergency by id 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EmergenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EmergenciesApi apiInstance = new EmergenciesApi();
String organizationId = "organizationId_example"; // String | Organization id
String emergencyId = "emergencyId_example"; // String | Emergency id
try {
    Emergency result = apiInstance.findOrganizationEmergency(organizationId, emergencyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmergenciesApi#findOrganizationEmergency");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **emergencyId** | **String**| Emergency id |

### Return type

[**Emergency**](Emergency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationEmergencies"></a>
# **listOrganizationEmergencies**
> List&lt;Emergency&gt; listOrganizationEmergencies(organizationId, location, before, after, firstResult, maxResults, orderBy, orderDir)

Lists organizations emergencies

Lists organizations emergencies 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.EmergenciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

EmergenciesApi apiInstance = new EmergenciesApi();
String organizationId = "organizationId_example"; // String | Organization id
String location = "location_example"; // String | Return emergencies by location
String before = "before_example"; // String | Return emergencies before specified time
String after = "after_example"; // String | Return emergencies after specified time
Integer firstResult = 56; // Integer | First index of results
Integer maxResults = 56; // Integer | Maximum number of results
String orderBy = "orderBy_example"; // String | Define order (NATURAL, START)
String orderDir = "orderDir_example"; // String | Order direction (ASC, DESC). Default is ASC
try {
    List<Emergency> result = apiInstance.listOrganizationEmergencies(organizationId, location, before, after, firstResult, maxResults, orderBy, orderDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmergenciesApi#listOrganizationEmergencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **location** | **String**| Return emergencies by location | [optional]
 **before** | **String**| Return emergencies before specified time | [optional]
 **after** | **String**| Return emergencies after specified time | [optional]
 **firstResult** | **Integer**| First index of results | [optional]
 **maxResults** | **Integer**| Maximum number of results | [optional]
 **orderBy** | **String**| Define order (NATURAL, START) | [optional]
 **orderDir** | **String**| Order direction (ASC, DESC). Default is ASC | [optional]

### Return type

[**List&lt;Emergency&gt;**](Emergency.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

