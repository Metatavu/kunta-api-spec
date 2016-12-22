# KuntaApiClient.MenusApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationMenu**](MenusApi.md#findOrganizationMenu) | **GET** /organizations/{organizationId}/menus/{menuId} | Finds organizations menu
[**findOrganizationMenuItem**](MenusApi.md#findOrganizationMenuItem) | **GET** /organizations/{organizationId}/menus/{menuId}/items/{menuItemId} | Finds organization menu item
[**listOrganizationMenuItems**](MenusApi.md#listOrganizationMenuItems) | **GET** /organizations/{organizationId}/menus/{menuId}/items | Lists organizations menu items
[**listOrganizationMenus**](MenusApi.md#listOrganizationMenus) | **GET** /organizations/{organizationId}/menus | Lists organizations menus


<a name="findOrganizationMenu"></a>
# **findOrganizationMenu**
> Menu findOrganizationMenu(organizationId, menuId)

Finds organizations menu

Finds single organization menu 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.MenusApi();

var organizationId = "organizationId_example"; // String | Organization id

var menuId = "menuId_example"; // String | menu id

apiInstance.findOrganizationMenu(organizationId, menuId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **menuId** | **String**| menu id | 

### Return type

[**Menu**](Menu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationMenuItem"></a>
# **findOrganizationMenuItem**
> MenuItem findOrganizationMenuItem(organizationId, menuId, menuItemId)

Finds organization menu item

Finds single organization menu item 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.MenusApi();

var organizationId = "organizationId_example"; // String | Organization id

var menuId = "menuId_example"; // String | menu id

var menuItemId = "menuItemId_example"; // String | menu item id

apiInstance.findOrganizationMenuItem(organizationId, menuId, menuItemId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **menuId** | **String**| menu id | 
 **menuItemId** | **String**| menu item id | 

### Return type

[**MenuItem**](MenuItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationMenuItems"></a>
# **listOrganizationMenuItems**
> [MenuItem] listOrganizationMenuItems(organizationId, menuId)

Lists organizations menu items

Lists organization menu items 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.MenusApi();

var organizationId = "organizationId_example"; // String | Organization id

var menuId = "menuId_example"; // String | menu id

apiInstance.listOrganizationMenuItems(organizationId, menuId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **menuId** | **String**| menu id | 

### Return type

[**[MenuItem]**](MenuItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationMenus"></a>
# **listOrganizationMenus**
> [Menu] listOrganizationMenus(organizationId, opts)

Lists organizations menus

Lists organizations menus 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.MenusApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'slug': "slug_example" // String | Filter with slug
};
apiInstance.listOrganizationMenus(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **slug** | **String**| Filter with slug | [optional] 

### Return type

[**[Menu]**](Menu.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

