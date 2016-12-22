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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationContacts"></a>
# **listOrganizationContacts**
> [Contact] listOrganizationContacts(organizationId)

Lists organizations contacts

Lists organizations contacts 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ContactsApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationContacts(organizationId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 

### Return type

[**[Contact]**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

