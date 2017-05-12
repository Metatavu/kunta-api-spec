# KuntaApiClient.IncidentsApi

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
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.IncidentsApi();

var organizationId = "organizationId_example"; // String | Organization id

var incidentId = "incidentId_example"; // String | Incident id

apiInstance.findOrganizationIncident(organizationId, incidentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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
> [Incident] listOrganizationIncidents(organizationId, opts)

Lists organizations incidents

Lists organizations incidents 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.IncidentsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'slug': "slug_example", // String | Filter with slug
  'startBefore': "startBefore_example", // String | 
  'endAfter': "endAfter_example", // String | 
  'area': 56, // Integer | Return only incidents from specified area
  'firstResult': 56, // Integer | First index of results
  'maxResults': 56, // Integer | Maximum number of results
  'orderBy': "orderBy_example", // String | Define order (start, end)
  'orderDir': "orderDir_example" // String | Order direction (ASC, DESC). Default is ASC
};
apiInstance.listOrganizationIncidents(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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

[**[Incident]**](Incident.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

