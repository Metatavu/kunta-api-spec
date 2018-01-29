# IncidentsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationIncident**](IncidentsApi.md#findOrganizationIncident) | **GET** /organizations/{organizationId}/incidents/{incidentId} | Returns organizations incident by id
[**listOrganizationIncidents**](IncidentsApi.md#listOrganizationIncidents) | **GET** /organizations/{organizationId}/incidents | Lists organizations incidents


<a name="findOrganizationIncident"></a>
# **findOrganizationIncident**
> Incident findOrganizationIncident(organizationId, incidentId)

Returns organizations incident by id

Returns organizations incident by id 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.IncidentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IncidentsApi apiInstance = new IncidentsApi();
String organizationId = "organizationId_example"; // String | Organization id
String incidentId = "incidentId_example"; // String | Incident id
try {
    Incident result = apiInstance.findOrganizationIncident(organizationId, incidentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsApi#findOrganizationIncident");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **incidentId** | **String**| Incident id |

### Return type

[**Incident**](Incident.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationIncidents"></a>
# **listOrganizationIncidents**
> List&lt;Incident&gt; listOrganizationIncidents(organizationId, slug, startBefore, endAfter, area, firstResult, maxResults, orderBy, orderDir)

Lists organizations incidents

Lists organizations incidents 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.IncidentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IncidentsApi apiInstance = new IncidentsApi();
String organizationId = "organizationId_example"; // String | Organization id
String slug = "slug_example"; // String | Filter with slug
String startBefore = "startBefore_example"; // String | 
String endAfter = "endAfter_example"; // String | 
Integer area = 56; // Integer | Return only incidents from specified area
Integer firstResult = 56; // Integer | First index of results
Integer maxResults = 56; // Integer | Maximum number of results
String orderBy = "orderBy_example"; // String | Define order (start, end)
String orderDir = "orderDir_example"; // String | Order direction (ASC, DESC). Default is ASC
try {
    List<Incident> result = apiInstance.listOrganizationIncidents(organizationId, slug, startBefore, endAfter, area, firstResult, maxResults, orderBy, orderDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IncidentsApi#listOrganizationIncidents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **slug** | **String**| Filter with slug | [optional]
 **startBefore** | **String**|  | [optional]
 **endAfter** | **String**|  | [optional]
 **area** | **Integer**| Return only incidents from specified area | [optional]
 **firstResult** | **Integer**| First index of results | [optional]
 **maxResults** | **Integer**| Maximum number of results | [optional]
 **orderBy** | **String**| Define order (start, end) | [optional]
 **orderDir** | **String**| Order direction (ASC, DESC). Default is ASC | [optional]

### Return type

[**List&lt;Incident&gt;**](Incident.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

