# AnnouncementsApi

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.AnnouncementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AnnouncementsApi apiInstance = new AnnouncementsApi();
String organizationId = "organizationId_example"; // String | Organization id
String announcementId = "announcementId_example"; // String | Announcement id
try {
    Announcement result = apiInstance.findOrganizationAnnouncement(organizationId, announcementId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnouncementsApi#findOrganizationAnnouncement");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **announcementId** | **String**| Announcement id |

### Return type

[**Announcement**](Announcement.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationAnnouncements"></a>
# **listOrganizationAnnouncements**
> List&lt;Announcement&gt; listOrganizationAnnouncements(organizationId, slug, firstResult, maxResults, sortBy, sortDir)

Lists organizations announcements

Lists organizations announcements 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.AnnouncementsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AnnouncementsApi apiInstance = new AnnouncementsApi();
String organizationId = "organizationId_example"; // String | Organization id
String slug = "slug_example"; // String | Filter with slug
Integer firstResult = 56; // Integer | first index of results
Integer maxResults = 56; // Integer | maximum number of results
String sortBy = "sortBy_example"; // String | PUBLICATION_DATE
String sortDir = "sortDir_example"; // String | ASC or DESC
try {
    List<Announcement> result = apiInstance.listOrganizationAnnouncements(organizationId, slug, firstResult, maxResults, sortBy, sortDir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnouncementsApi#listOrganizationAnnouncements");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **slug** | **String**| Filter with slug | [optional]
 **firstResult** | **Integer**| first index of results | [optional]
 **maxResults** | **Integer**| maximum number of results | [optional]
 **sortBy** | **String**| PUBLICATION_DATE | [optional]
 **sortDir** | **String**| ASC or DESC | [optional]

### Return type

[**List&lt;Announcement&gt;**](Announcement.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

