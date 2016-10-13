# KuntaApiClient.NewsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationBannerImage**](NewsApi.md#findOrganizationBannerImage) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId} | Returns a single organiztion banner image
[**findOrganizationNewsArticle**](NewsApi.md#findOrganizationNewsArticle) | **GET** /organizations/{organizationId}/news/{newsArticleId} | Finds organizations news article
[**findOrganizationNewsArticleImage**](NewsApi.md#findOrganizationNewsArticleImage) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId} | Returns an news article image
[**getOrganizationBannerImageData**](NewsApi.md#getOrganizationBannerImageData) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId}/data | Returns an organization banner image data
[**getOrganizationNewsArticleImageData**](NewsApi.md#getOrganizationNewsArticleImageData) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId}/data | Returns a news article image data
[**listOrganizationNews**](NewsApi.md#listOrganizationNews) | **GET** /organizations/{organizationId}/news | Lists organizations news
[**listOrganizationNewsArticleImages**](NewsApi.md#listOrganizationNewsArticleImages) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images | Returns list of news article images


<a name="findOrganizationBannerImage"></a>
# **findOrganizationBannerImage**
> Attachment findOrganizationBannerImage(organizationId, bannerId, imageId)

Returns a single organiztion banner image

Returns a single organiztion banner image 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

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

<a name="findOrganizationNewsArticle"></a>
# **findOrganizationNewsArticle**
> NewsArticle findOrganizationNewsArticle(organizationId, newsArticleId)

Finds organizations news article

Finds organizations single news article 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

var organizationId = "organizationId_example"; // String | Organization id

var newsArticleId = "newsArticleId_example"; // String | News article id

apiInstance.findOrganizationNewsArticle(organizationId, newsArticleId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **newsArticleId** | **String**| News article id | 

### Return type

[**NewsArticle**](NewsArticle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationNewsArticleImage"></a>
# **findOrganizationNewsArticleImage**
> Attachment findOrganizationNewsArticleImage(organizationId, newsArticleId, imageId)

Returns an news article image

Returns an news article image 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

var organizationId = "organizationId_example"; // String | Organization id

var newsArticleId = "newsArticleId_example"; // String | News article id

var imageId = "imageId_example"; // String | Event image id

apiInstance.findOrganizationNewsArticleImage(organizationId, newsArticleId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **newsArticleId** | **String**| News article id | 
 **imageId** | **String**| Event image id | 

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

var apiInstance = new KuntaApiClient.NewsApi();

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

<a name="getOrganizationNewsArticleImageData"></a>
# **getOrganizationNewsArticleImageData**
> &#39;String&#39; getOrganizationNewsArticleImageData(organizationId, newsArticleId, imageId, opts)

Returns a news article image data

Returns a news article image data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

var organizationId = "organizationId_example"; // String | Organization id

var newsArticleId = "newsArticleId_example"; // String | News article id

var imageId = "imageId_example"; // String | Event image id

var opts = { 
  'size': 56 // Integer | Maximum width or height of image
};
apiInstance.getOrganizationNewsArticleImageData(organizationId, newsArticleId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **newsArticleId** | **String**| News article id | 
 **imageId** | **String**| Event image id | 
 **size** | **Integer**| Maximum width or height of image | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationNews"></a>
# **listOrganizationNews**
> [NewsArticle] listOrganizationNews(organizationId, opts)

Lists organizations news

Lists organizations news 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'publishedBefore': "publishedBefore_example", // String | return only news published before the date
  'publishedAfter': "publishedAfter_example", // String | return only news published after the date
  'firstResult': 56, // Integer | first index of results
  'maxResults': 56 // Integer | maximum number of results
};
apiInstance.listOrganizationNews(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **publishedBefore** | **String**| return only news published before the date | [optional] 
 **publishedAfter** | **String**| return only news published after the date | [optional] 
 **firstResult** | **Integer**| first index of results | [optional] 
 **maxResults** | **Integer**| maximum number of results | [optional] 

### Return type

[**[NewsArticle]**](NewsArticle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationNewsArticleImages"></a>
# **listOrganizationNewsArticleImages**
> [Attachment] listOrganizationNewsArticleImages(organizationId, newsArticleId)

Returns list of news article images

Returns list of news article images 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.NewsApi();

var organizationId = "organizationId_example"; // String | Organization id

var newsArticleId = "newsArticleId_example"; // String | News article id

apiInstance.listOrganizationNewsArticleImages(organizationId, newsArticleId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **newsArticleId** | **String**| News article id | 

### Return type

[**[Attachment]**](Attachment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

