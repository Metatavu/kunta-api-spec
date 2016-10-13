# KuntaApiClient.BannersApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationBanner**](BannersApi.md#findOrganizationBanner) | **GET** /organizations/{organizationId}/banners/{bannerId} | Finds organizations banner
[**listOrganizationBannerImages**](BannersApi.md#listOrganizationBannerImages) | **GET** /organizations/{organizationId}/banners/{bannerId}/images | Returns a list of organization banner images
[**listOrganizationBanners**](BannersApi.md#listOrganizationBanners) | **GET** /organizations/{organizationId}/banners | Lists organizations banners


<a name="findOrganizationBanner"></a>
# **findOrganizationBanner**
> NewsArticle findOrganizationBanner(organizationId, bannerId)

Finds organizations banner

Finds single organization banner 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.BannersApi();

var organizationId = "organizationId_example"; // String | Organization id

var bannerId = "bannerId_example"; // String | banner id

apiInstance.findOrganizationBanner(organizationId, bannerId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **bannerId** | **String**| banner id | 

### Return type

[**NewsArticle**](NewsArticle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationBannerImages"></a>
# **listOrganizationBannerImages**
> [Attachment] listOrganizationBannerImages(organizationId, bannerId)

Returns a list of organization banner images

Returns a list of organization banner images 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.BannersApi();

var organizationId = "organizationId_example"; // String | Organization id

var bannerId = "bannerId_example"; // String | Banner id

apiInstance.listOrganizationBannerImages(organizationId, bannerId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **bannerId** | **String**| Banner id | 

### Return type

[**[Attachment]**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationBanners"></a>
# **listOrganizationBanners**
> [Banner] listOrganizationBanners(organizationId)

Lists organizations banners

Lists organizations banners 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.BannersApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationBanners(organizationId).then(function(data) {
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

[**[Banner]**](Banner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

