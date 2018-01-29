# NewsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationNewsArticle**](NewsApi.md#findOrganizationNewsArticle) | **GET** /organizations/{organizationId}/news/{newsArticleId} | Finds organizations news article
[**findOrganizationNewsArticleImage**](NewsApi.md#findOrganizationNewsArticleImage) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId} | Returns an news article image
[**getOrganizationNewsArticleImageData**](NewsApi.md#getOrganizationNewsArticleImageData) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId}/data | Returns a news article image data
[**listOrganizationNews**](NewsApi.md#listOrganizationNews) | **GET** /organizations/{organizationId}/news | Lists organizations news
[**listOrganizationNewsArticleImages**](NewsApi.md#listOrganizationNewsArticleImages) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images | Returns list of news article images


<a name="findOrganizationNewsArticle"></a>
# **findOrganizationNewsArticle**
> NewsArticle findOrganizationNewsArticle(organizationId, newsArticleId)

Finds organizations news article

Finds organizations single news article 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NewsApi apiInstance = new NewsApi();
String organizationId = "organizationId_example"; // String | Organization id
String newsArticleId = "newsArticleId_example"; // String | News article id
try {
    NewsArticle result = apiInstance.findOrganizationNewsArticle(organizationId, newsArticleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#findOrganizationNewsArticle");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **newsArticleId** | **String**| News article id |

### Return type

[**NewsArticle**](NewsArticle.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationNewsArticleImage"></a>
# **findOrganizationNewsArticleImage**
> Attachment findOrganizationNewsArticleImage(organizationId, newsArticleId, imageId)

Returns an news article image

Returns an news article image 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NewsApi apiInstance = new NewsApi();
String organizationId = "organizationId_example"; // String | Organization id
String newsArticleId = "newsArticleId_example"; // String | News article id
String imageId = "imageId_example"; // String | Event image id
try {
    Attachment result = apiInstance.findOrganizationNewsArticleImage(organizationId, newsArticleId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#findOrganizationNewsArticleImage");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationNewsArticleImageData"></a>
# **getOrganizationNewsArticleImageData**
> byte[] getOrganizationNewsArticleImageData(organizationId, newsArticleId, imageId, size)

Returns a news article image data

Returns a news article image data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NewsApi apiInstance = new NewsApi();
String organizationId = "organizationId_example"; // String | Organization id
String newsArticleId = "newsArticleId_example"; // String | News article id
String imageId = "imageId_example"; // String | Event image id
Integer size = 56; // Integer | Maximum width or height of image
try {
    byte[] result = apiInstance.getOrganizationNewsArticleImageData(organizationId, newsArticleId, imageId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#getOrganizationNewsArticleImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **newsArticleId** | **String**| News article id |
 **imageId** | **String**| Event image id |
 **size** | **Integer**| Maximum width or height of image | [optional]

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationNews"></a>
# **listOrganizationNews**
> List&lt;NewsArticle&gt; listOrganizationNews(organizationId, slug, tag, publishedBefore, publishedAfter, search, sortBy, sortDir, firstResult, maxResults)

Lists organizations news

Lists organizations news 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NewsApi apiInstance = new NewsApi();
String organizationId = "organizationId_example"; // String | Organization id
String slug = "slug_example"; // String | Filter with slug
String tag = "tag_example"; // String | Filter by tag
String publishedBefore = "publishedBefore_example"; // String | return only news published before the date
String publishedAfter = "publishedAfter_example"; // String | return only news published after the date
String search = "search_example"; // String | Search news by free-text query
String sortBy = "sortBy_example"; // String | define order (NATURAL or SCORE). Default is NATURAL
String sortDir = "sortDir_example"; // String | ASC or DESC. Default is ASC
Integer firstResult = 56; // Integer | first index of results
Integer maxResults = 56; // Integer | maximum number of results
try {
    List<NewsArticle> result = apiInstance.listOrganizationNews(organizationId, slug, tag, publishedBefore, publishedAfter, search, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#listOrganizationNews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **slug** | **String**| Filter with slug | [optional]
 **tag** | **String**| Filter by tag | [optional]
 **publishedBefore** | **String**| return only news published before the date | [optional]
 **publishedAfter** | **String**| return only news published after the date | [optional]
 **search** | **String**| Search news by free-text query | [optional]
 **sortBy** | **String**| define order (NATURAL or SCORE). Default is NATURAL | [optional]
 **sortDir** | **String**| ASC or DESC. Default is ASC | [optional]
 **firstResult** | **Integer**| first index of results | [optional]
 **maxResults** | **Integer**| maximum number of results | [optional]

### Return type

[**List&lt;NewsArticle&gt;**](NewsArticle.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationNewsArticleImages"></a>
# **listOrganizationNewsArticleImages**
> List&lt;Attachment&gt; listOrganizationNewsArticleImages(organizationId, newsArticleId)

Returns list of news article images

Returns list of news article images 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.NewsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NewsApi apiInstance = new NewsApi();
String organizationId = "organizationId_example"; // String | Organization id
String newsArticleId = "newsArticleId_example"; // String | News article id
try {
    List<Attachment> result = apiInstance.listOrganizationNewsArticleImages(organizationId, newsArticleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewsApi#listOrganizationNewsArticleImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **newsArticleId** | **String**| News article id |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

