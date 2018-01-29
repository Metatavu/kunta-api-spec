# MenusApi

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
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MenusApi apiInstance = new MenusApi();
String organizationId = "organizationId_example"; // String | Organization id
String menuId = "menuId_example"; // String | menu id
try {
    Menu result = apiInstance.findOrganizationMenu(organizationId, menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#findOrganizationMenu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **menuId** | **String**| menu id |

### Return type

[**Menu**](Menu.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationMenuItem"></a>
# **findOrganizationMenuItem**
> MenuItem findOrganizationMenuItem(organizationId, menuId, menuItemId)

Finds organization menu item

Finds single organization menu item 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MenusApi apiInstance = new MenusApi();
String organizationId = "organizationId_example"; // String | Organization id
String menuId = "menuId_example"; // String | menu id
String menuItemId = "menuItemId_example"; // String | menu item id
try {
    MenuItem result = apiInstance.findOrganizationMenuItem(organizationId, menuId, menuItemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#findOrganizationMenuItem");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationMenuItems"></a>
# **listOrganizationMenuItems**
> List&lt;MenuItem&gt; listOrganizationMenuItems(organizationId, menuId)

Lists organizations menu items

Lists organization menu items 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MenusApi apiInstance = new MenusApi();
String organizationId = "organizationId_example"; // String | Organization id
String menuId = "menuId_example"; // String | menu id
try {
    List<MenuItem> result = apiInstance.listOrganizationMenuItems(organizationId, menuId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#listOrganizationMenuItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **menuId** | **String**| menu id |

### Return type

[**List&lt;MenuItem&gt;**](MenuItem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationMenus"></a>
# **listOrganizationMenus**
> List&lt;Menu&gt; listOrganizationMenus(organizationId, slug)

Lists organizations menus

Lists organizations menus 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.MenusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

MenusApi apiInstance = new MenusApi();
String organizationId = "organizationId_example"; // String | Organization id
String slug = "slug_example"; // String | Filter with slug
try {
    List<Menu> result = apiInstance.listOrganizationMenus(organizationId, slug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenusApi#listOrganizationMenus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **slug** | **String**| Filter with slug | [optional]

### Return type

[**List&lt;Menu&gt;**](Menu.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

