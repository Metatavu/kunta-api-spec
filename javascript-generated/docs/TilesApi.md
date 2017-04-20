# KuntaApiClient.TilesApi

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
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.TilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var tileId = "tileId_example"; // String | tile id

apiInstance.findOrganizationTile(organizationId, tileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.TilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var tileId = "tileId_example"; // String | Tile Id

var imageId = "imageId_example"; // String | Tile image id

apiInstance.findOrganizationTileImage(organizationId, tileId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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
> &#39;String&#39; getOrganizationTileImageData(organizationId, tileId, imageId, opts)

Returns an organization tile image data

Returns an organization tile image data 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.TilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var tileId = "tileId_example"; // String | Tile id

var imageId = "imageId_example"; // String | Tile image id

var opts = { 
  'size': 56 // Integer | Maximum width or height of image
};
apiInstance.getOrganizationTileImageData(organizationId, tileId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **tileId** | **String**| Tile id | 
 **imageId** | **String**| Tile image id | 
 **size** | **Integer**| Maximum width or height of image | [optional] 

### Return type

**&#39;String&#39;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationTileImages"></a>
# **listOrganizationTileImages**
> [Attachment] listOrganizationTileImages(organizationId, tileId)

Returns a list of organization tile images

Returns a list of organization tile images 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.TilesApi();

var organizationId = "organizationId_example"; // String | Organization id

var tileId = "tileId_example"; // String | Tile id

apiInstance.listOrganizationTileImages(organizationId, tileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **tileId** | **String**| Tile id | 

### Return type

[**[Attachment]**](Attachment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationTiles"></a>
# **listOrganizationTiles**
> [Tile] listOrganizationTiles(organizationId)

Lists organizations tiles

Lists organizations tiles 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.TilesApi();

var organizationId = "organizationId_example"; // String | Organization id

apiInstance.listOrganizationTiles(organizationId).then(function(data) {
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

[**[Tile]**](Tile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

