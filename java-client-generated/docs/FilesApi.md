# FilesApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrganizationFile**](FilesApi.md#deleteOrganizationFile) | **DELETE** /organizations/{organizationId}/files/{fileId} | Deletes an organization file
[**findOrganizationFile**](FilesApi.md#findOrganizationFile) | **GET** /organizations/{organizationId}/files/{fileId} | Finds organizations file
[**getOrganizationFileData**](FilesApi.md#getOrganizationFileData) | **GET** /organizations/{organizationId}/files/{fileId}/data | Returns an organization file data
[**listOrganizationFiles**](FilesApi.md#listOrganizationFiles) | **GET** /organizations/{organizationId}/files | Lists organizations files


<a name="deleteOrganizationFile"></a>
# **deleteOrganizationFile**
> deleteOrganizationFile(organizationId, fileId)

Deletes an organization file

Deletes single organization file 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesApi apiInstance = new FilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String fileId = "fileId_example"; // String | file id
try {
    apiInstance.deleteOrganizationFile(organizationId, fileId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteOrganizationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **fileId** | **String**| file id |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findOrganizationFile"></a>
# **findOrganizationFile**
> FileDef findOrganizationFile(organizationId, fileId)

Finds organizations file

Finds single organization file 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesApi apiInstance = new FilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String fileId = "fileId_example"; // String | file id
try {
    FileDef result = apiInstance.findOrganizationFile(organizationId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#findOrganizationFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **fileId** | **String**| file id |

### Return type

[**FileDef**](FileDef.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getOrganizationFileData"></a>
# **getOrganizationFileData**
> byte[] getOrganizationFileData(organizationId, fileId)

Returns an organization file data

Returns an organization file data 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesApi apiInstance = new FilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String fileId = "fileId_example"; // String | file id
try {
    byte[] result = apiInstance.getOrganizationFileData(organizationId, fileId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#getOrganizationFileData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **fileId** | **String**| file id |

### Return type

**byte[]**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listOrganizationFiles"></a>
# **listOrganizationFiles**
> List&lt;FileDef&gt; listOrganizationFiles(organizationId, pageId, search, firstResult, maxResults)

Lists organizations files

Lists organizations files 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.FilesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesApi apiInstance = new FilesApi();
String organizationId = "organizationId_example"; // String | Organization id
String pageId = "pageId_example"; // String | Filter with page
String search = "search_example"; // String | Search files by free-text query
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<FileDef> result = apiInstance.listOrganizationFiles(organizationId, pageId, search, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listOrganizationFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **pageId** | **String**| Filter with page | [optional]
 **search** | **String**| Search files by free-text query | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;FileDef&gt;**](FileDef.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

