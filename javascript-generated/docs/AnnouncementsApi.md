# KuntaApiClient.AnnouncementsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationAnnouncement**](AnnouncementsApi.md#findOrganizationAnnouncement) | **GET** /organizations/{organizationId}/announcements/{announcementId} | Finds an organizations announcement
[**listOrganizationAnnouncements**](AnnouncementsApi.md#listOrganizationAnnouncements) | **GET** /organizations/{organizationId}/announcements | Lists organizations announcements


<a name="findOrganizationAnnouncement"></a>
# **findOrganizationAnnouncement**
> Announcement findOrganizationAnnouncement(organizationId, announcementId)

Finds an organizations announcement

Finds organization&#39;s single announcement 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.AnnouncementsApi();

var organizationId = "organizationId_example"; // String | Organization id

var announcementId = "announcementId_example"; // String | Announcement id

apiInstance.findOrganizationAnnouncement(organizationId, announcementId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **announcementId** | **String**| Announcement id | 

### Return type

[**Announcement**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationAnnouncements"></a>
# **listOrganizationAnnouncements**
> [Announcement] listOrganizationAnnouncements(organizationId, opts)

Lists organizations announcements

Lists organizations announcements 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.AnnouncementsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'firstResult': 56, // Integer | first index of results
  'maxResults': 56, // Integer | maximum number of results
  'sortBy': "sortBy_example", // String | PUBLICATION_DATE
  'sortDir': "sortDir_example" // String | ASC or DESC
};
apiInstance.listOrganizationAnnouncements(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **firstResult** | **Integer**| first index of results | [optional] 
 **maxResults** | **Integer**| maximum number of results | [optional] 
 **sortBy** | **String**| PUBLICATION_DATE | [optional] 
 **sortDir** | **String**| ASC or DESC | [optional] 

### Return type

[**[Announcement]**](Announcement.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

