# SettingsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganizationSetting**](SettingsApi.md#createOrganizationSetting) | **POST** /organizations/{organizationId}/settings/ | Creates organization setting
[**deleteOrganizationSetting**](SettingsApi.md#deleteOrganizationSetting) | **DELETE** /organizations/{organizationId}/settings/{settingId} | Deletes an organization setting
[**findOrganizationSetting**](SettingsApi.md#findOrganizationSetting) | **GET** /organizations/{organizationId}/settings/{settingId} | Finds organizations setting
[**listOrganizationSettings**](SettingsApi.md#listOrganizationSettings) | **GET** /organizations/{organizationId}/settings/ | Lists organizations settings
[**updateOrganizationSetting**](SettingsApi.md#updateOrganizationSetting) | **PUT** /organizations/{organizationId}/settings/{settingId} | Updates an organization setting


<a name="createOrganizationSetting"></a>
# **createOrganizationSetting**
> OrganizationSetting createOrganizationSetting(organizationId, setting)

Creates organization setting

Creates organization setting 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SettingsApi apiInstance = new SettingsApi();
String organizationId = "organizationId_example"; // String | Organization id
OrganizationSetting setting = new OrganizationSetting(); // OrganizationSetting | 
try {
    OrganizationSetting result = apiInstance.createOrganizationSetting(organizationId, setting);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#createOrganizationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **setting** | [**OrganizationSetting**](OrganizationSetting.md)|  | [optional]

### Return type

[**OrganizationSetting**](OrganizationSetting.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteOrganizationSetting"></a>
# **deleteOrganizationSetting**
> deleteOrganizationSetting(organizationId, settingId)

Deletes an organization setting

Deletes an organization setting 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SettingsApi apiInstance = new SettingsApi();
String organizationId = "organizationId_example"; // String | Organization id
String settingId = "settingId_example"; // String | Setting id
try {
    apiInstance.deleteOrganizationSetting(organizationId, settingId);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#deleteOrganizationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **settingId** | **String**| Setting id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationSetting"></a>
# **findOrganizationSetting**
> OrganizationSetting findOrganizationSetting(organizationId, settingId)

Finds organizations setting

Finds single organization setting 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SettingsApi apiInstance = new SettingsApi();
String organizationId = "organizationId_example"; // String | Organization id
String settingId = "settingId_example"; // String | Setting id
try {
    OrganizationSetting result = apiInstance.findOrganizationSetting(organizationId, settingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#findOrganizationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **settingId** | **String**| Setting id |

### Return type

[**OrganizationSetting**](OrganizationSetting.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationSettings"></a>
# **listOrganizationSettings**
> List&lt;OrganizationSetting&gt; listOrganizationSettings(organizationId, key)

Lists organizations settings

Lists organizations settings 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SettingsApi apiInstance = new SettingsApi();
String organizationId = "organizationId_example"; // String | Organization id
String key = "key_example"; // String | Setting key
try {
    List<OrganizationSetting> result = apiInstance.listOrganizationSettings(organizationId, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#listOrganizationSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **key** | **String**| Setting key | [optional]

### Return type

[**List&lt;OrganizationSetting&gt;**](OrganizationSetting.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateOrganizationSetting"></a>
# **updateOrganizationSetting**
> OrganizationSetting updateOrganizationSetting(organizationId, settingId, setting)

Updates an organization setting

Updates an organization setting 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.SettingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SettingsApi apiInstance = new SettingsApi();
String organizationId = "organizationId_example"; // String | Organization id
String settingId = "settingId_example"; // String | Setting id
OrganizationSetting setting = new OrganizationSetting(); // OrganizationSetting | 
try {
    OrganizationSetting result = apiInstance.updateOrganizationSetting(organizationId, settingId, setting);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SettingsApi#updateOrganizationSetting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **settingId** | **String**| Setting id |
 **setting** | [**OrganizationSetting**](OrganizationSetting.md)|  | [optional]

### Return type

[**OrganizationSetting**](OrganizationSetting.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

