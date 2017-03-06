# KuntaApiClient.ShortlinksApi

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
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ShortlinksApi();

var organizationId = "organizationId_example"; // String | Organization id

var shortlinkId = "shortlinkId_example"; // String | shortlink id

apiInstance.findOrganizationShortlink(organizationId, shortlinkId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **shortlinkId** | **String**| shortlink id | 

### Return type

[**Shortlink**](Shortlink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationShortlinks"></a>
# **listOrganizationShortlinks**
> [Shortlink] listOrganizationShortlinks(organizationId, opts)

Lists organizations shortlinks

Lists organizations shortlinks 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ShortlinksApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'path': "path_example", // String | Filter results by path
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationShortlinks(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **path** | **String**| Filter results by path | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Shortlink]**](Shortlink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

