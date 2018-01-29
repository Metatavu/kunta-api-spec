# BannersApi

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.BannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BannersApi apiInstance = new BannersApi();
String organizationId = "organizationId_example"; // String | Organization id
String bannerId = "bannerId_example"; // String | banner id
try {
    NewsArticle result = apiInstance.findOrganizationBanner(organizationId, bannerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BannersApi#findOrganizationBanner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **bannerId** | **String**| banner id |

### Return type

[**NewsArticle**](NewsArticle.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationBannerImage"></a>
# **findOrganizationBannerImage**
> Attachment findOrganizationBannerImage(organizationId, bannerId, imageId)

Returns a single organiztion banner image

Returns a single organiztion banner image 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.BannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BannersApi apiInstance = new BannersApi();
String organizationId = "organizationId_example"; // String | Organization id
String bannerId = "bannerId_example"; // String | Banner Id
String imageId = "imageId_example"; // String | Banner image id
try {
    Attachment result = apiInstance.findOrganizationBannerImage(organizationId, bannerId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BannersApi#findOrganizationBannerImage");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationBannerImageData"></a>
# **getOrganizationBannerImageData**
> byte[] getOrganizationBannerImageData(organizationId, bannerId, imageId, size)

Returns an organization banner image data

Returns an organization banner image data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.BannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BannersApi apiInstance = new BannersApi();
String organizationId = "organizationId_example"; // String | Organization id
String bannerId = "bannerId_example"; // String | Banner id
String imageId = "imageId_example"; // String | Banner image id
Integer size = 56; // Integer | Maximum width or height of image
try {
    byte[] result = apiInstance.getOrganizationBannerImageData(organizationId, bannerId, imageId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BannersApi#getOrganizationBannerImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **bannerId** | **String**| Banner id |
 **imageId** | **String**| Banner image id |
 **size** | **Integer**| Maximum width or height of image | [optional]

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationBannerImages"></a>
# **listOrganizationBannerImages**
> List&lt;Attachment&gt; listOrganizationBannerImages(organizationId, bannerId)

Returns a list of organization banner images

Returns a list of organization banner images 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.BannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BannersApi apiInstance = new BannersApi();
String organizationId = "organizationId_example"; // String | Organization id
String bannerId = "bannerId_example"; // String | Banner id
try {
    List<Attachment> result = apiInstance.listOrganizationBannerImages(organizationId, bannerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BannersApi#listOrganizationBannerImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **bannerId** | **String**| Banner id |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationBanners"></a>
# **listOrganizationBanners**
> List&lt;Banner&gt; listOrganizationBanners(organizationId)

Lists organizations banners

Lists organizations banners 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.BannersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

BannersApi apiInstance = new BannersApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Banner> result = apiInstance.listOrganizationBanners(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BannersApi#listOrganizationBanners");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Banner&gt;**](Banner.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

