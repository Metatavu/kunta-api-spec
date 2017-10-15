# KuntaApiClient.ContactsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationContact**](ContactsApi.md#findOrganizationContact) | **GET** /organizations/{organizationId}/contacts/{contactId} | Finds an organizations contact
[**listOrganizationContacts**](ContactsApi.md#listOrganizationContacts) | **GET** /organizations/{organizationId}/contacts | Lists organizations contacts


<a name="findOrganizationContact"></a>
# **findOrganizationContact**
> Contact findOrganizationContact(organizationId, contactId)

Finds an organizations contact

Finds organization&#39;s single contact 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ContactsApi();

var organizationId = "organizationId_example"; // String | Organization id

var contactId = "contactId_example"; // String | Contact id

apiInstance.findOrganizationContact(organizationId, contactId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **contactId** | **String**| Contact id | 

### Return type

[**Contact**](Contact.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationContacts"></a>
# **listOrganizationContacts**
> [Contact] listOrganizationContacts(organizationId, opts)

Lists organizations contacts

Lists organizations contacts 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.ContactsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'search': "search_example", // String | Search contacts by free-text query
  'sortBy': "sortBy_example", // String | define order (NATURAL, DISPLAY_NAME or SCORE). Default is NATURAL
  'sortDir': "sortDir_example", // String | ASC or DESC. Default is ASC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationContacts(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **search** | **String**| Search contacts by free-text query | [optional] 
 **sortBy** | **String**| define order (NATURAL, DISPLAY_NAME or SCORE). Default is NATURAL | [optional] 
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Contact]**](Contact.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

