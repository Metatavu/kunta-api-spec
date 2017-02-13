# KuntaApiClient.BannersApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationBanner**](BannersApi.md#findOrganizationBanner) | **GET** /organizations/{organizationId}/banners/{bannerId} | Finds organizations banner
[**findOrganizationBannerImage**](BannersApi.md#findOrganizationBannerImage) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId} | Returns a single organiztion banner image
[**getOrganizationBannerImageData**](BannersApi.md#getOrganizationBannerImageData) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId}/data | Returns an organization banner image data
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

<a name="findOrganizationBannerImage"></a>
# **findOrganizationBannerImage**
> Attachment findOrganizationBannerImage(organizationId, bannerId, imageId)

Returns a single organiztion banner image

Returns a single organiztion banner image 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.BannersApi();

var organizationId = "organizationId_example"; // String | Organization id

var bannerId = "bannerId_example"; // String | Banner Id

var imageId = "imageId_example"; // String | Banner image id

apiInstance.findOrganizationBannerImage(organizationId, bannerId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **bannerId** | **String**| Banner Id | 
 **imageId** | **String**| Banner image id | 

### Return type

[**Attachment**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationBannerImageData"></a>
# **getOrganizationBannerImageData**
> &#39;String&#39; getOrganizationBannerImageData(organizationId, bannerId, imageId, opts)

Returns an organization banner image data

Returns an organization banner image data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.BannersApi();

var organizationId = "organizationId_example"; // String | Organization id

var bannerId = "bannerId_example"; // String | Banner id

var imageId = "imageId_example"; // String | Banner image id

var opts = { 
  'size': 56 // Integer | Maximum width or height of image
};
apiInstance.getOrganizationBannerImageData(organizationId, bannerId, imageId, opts).then(function(data) {
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
 **imageId** | **String**| Banner image id | 
 **size** | **Integer**| Maximum width or height of image | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

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

