# KuntaApiClient.SettingsApi

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
> OrganizationSetting createOrganizationSetting(organizationId, opts)

Creates organization setting

Creates organization setting 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.SettingsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'setting': new KuntaApiClient.OrganizationSetting() // OrganizationSetting | 
};
apiInstance.createOrganizationSetting(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.SettingsApi();

var organizationId = "organizationId_example"; // String | Organization id

var settingId = "settingId_example"; // String | Setting id

apiInstance.deleteOrganizationSetting(organizationId, settingId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

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
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.SettingsApi();

var organizationId = "organizationId_example"; // String | Organization id

var settingId = "settingId_example"; // String | Setting id

apiInstance.findOrganizationSetting(organizationId, settingId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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
> [OrganizationSetting] listOrganizationSettings(organizationId, opts)

Lists organizations settings

Lists organizations settings 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.SettingsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'key': "key_example" // String | Setting key
};
apiInstance.listOrganizationSettings(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **key** | **String**| Setting key | [optional] 

### Return type

[**[OrganizationSetting]**](OrganizationSetting.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateOrganizationSetting"></a>
# **updateOrganizationSetting**
> OrganizationSetting updateOrganizationSetting(organizationId, settingId, opts)

Updates an organization setting

Updates an organization setting 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');
var defaultClient = KuntaApiClient.ApiClient.default;

// Configure HTTP basic authorization: basicAuth
var basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

var apiInstance = new KuntaApiClient.SettingsApi();

var organizationId = "organizationId_example"; // String | Organization id

var settingId = "settingId_example"; // String | Setting id

var opts = { 
  'setting': new KuntaApiClient.OrganizationSetting() // OrganizationSetting | 
};
apiInstance.updateOrganizationSetting(organizationId, settingId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

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

