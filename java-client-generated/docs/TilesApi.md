# TilesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationTile**](TilesApi.md#findOrganizationTile) | **GET** /organizations/{organizationId}/tiles/{tileId} | Finds organizations tile
[**findOrganizationTileImage**](TilesApi.md#findOrganizationTileImage) | **GET** /organizations/{organizationId}/tiles/{tileId}/images/{imageId} | Returns a single organiztion tile image
[**getOrganizationTileImageData**](TilesApi.md#getOrganizationTileImageData) | **GET** /organizations/{organizationId}/tiles/{tileId}/images/{imageId}/data | Returns an organization tile image data
[**listOrganizationTileImages**](TilesApi.md#listOrganizationTileImages) | **GET** /organizations/{organizationId}/tiles/{tileId}/images | Returns a list of organization tile images
[**listOrganizationTiles**](TilesApi.md#listOrganizationTiles) | **GET** /organizations/{organizationId}/tiles | Lists organizations tiles


<a name="findOrganizationTile"></a>
# **findOrganizationTile**
> Tile findOrganizationTile(organizationId, tileId)

Finds organizations tile

Finds single organization tile 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.TilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TilesApi apiInstance = new TilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String tileId = "tileId_example"; // String | tile id
try {
    Tile result = apiInstance.findOrganizationTile(organizationId, tileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#findOrganizationTile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **tileId** | **String**| tile id |

### Return type

[**Tile**](Tile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationTileImage"></a>
# **findOrganizationTileImage**
> Attachment findOrganizationTileImage(organizationId, tileId, imageId)

Returns a single organiztion tile image

Returns a single organiztion tile image 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.TilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TilesApi apiInstance = new TilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String tileId = "tileId_example"; // String | Tile Id
String imageId = "imageId_example"; // String | Tile image id
try {
    Attachment result = apiInstance.findOrganizationTileImage(organizationId, tileId, imageId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#findOrganizationTileImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **tileId** | **String**| Tile Id |
 **imageId** | **String**| Tile image id |

### Return type

[**Attachment**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationTileImageData"></a>
# **getOrganizationTileImageData**
> byte[] getOrganizationTileImageData(organizationId, tileId, imageId, size)

Returns an organization tile image data

Returns an organization tile image data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.TilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TilesApi apiInstance = new TilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String tileId = "tileId_example"; // String | Tile id
String imageId = "imageId_example"; // String | Tile image id
Integer size = 56; // Integer | Maximum width or height of image
try {
    byte[] result = apiInstance.getOrganizationTileImageData(organizationId, tileId, imageId, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#getOrganizationTileImageData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **tileId** | **String**| Tile id |
 **imageId** | **String**| Tile image id |
 **size** | **Integer**| Maximum width or height of image | [optional]

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationTileImages"></a>
# **listOrganizationTileImages**
> List&lt;Attachment&gt; listOrganizationTileImages(organizationId, tileId)

Returns a list of organization tile images

Returns a list of organization tile images 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.TilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TilesApi apiInstance = new TilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String tileId = "tileId_example"; // String | Tile id
try {
    List<Attachment> result = apiInstance.listOrganizationTileImages(organizationId, tileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#listOrganizationTileImages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **tileId** | **String**| Tile id |

### Return type

[**List&lt;Attachment&gt;**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationTiles"></a>
# **listOrganizationTiles**
> List&lt;Tile&gt; listOrganizationTiles(organizationId)

Lists organizations tiles

Lists organizations tiles 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.TilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TilesApi apiInstance = new TilesApi();
String organizationId = "organizationId_example"; // String | Organization id
try {
    List<Tile> result = apiInstance.listOrganizationTiles(organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TilesApi#listOrganizationTiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |

### Return type

[**List&lt;Tile&gt;**](Tile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

