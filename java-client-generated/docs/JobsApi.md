# JobsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findOrganizationJob**](JobsApi.md#findOrganizationJob) | **GET** /organizations/{organizationId}/jobs/{jobId} | Finds organizations job
[**listOrganizationJobs**](JobsApi.md#listOrganizationJobs) | **GET** /organizations/{organizationId}/jobs | Lists organizations jobs


<a name="findOrganizationJob"></a>
# **findOrganizationJob**
> Job findOrganizationJob(organizationId, jobId)

Finds organizations job

Finds single organization job 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobsApi apiInstance = new JobsApi();
String organizationId = "organizationId_example"; // String | Organization id
String jobId = "jobId_example"; // String | job id
try {
    Job result = apiInstance.findOrganizationJob(organizationId, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#findOrganizationJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **jobId** | **String**| job id |

### Return type

[**Job**](Job.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationJobs"></a>
# **listOrganizationJobs**
> List&lt;Job&gt; listOrganizationJobs(organizationId, sortBy, sortDir, firstResult, maxResults)

Lists organizations jobs

Lists organizations jobs 

### Example
```java
// Import classes:
//import fi.metatavu.kuntaapi.ApiClient;
//import fi.metatavu.kuntaapi.ApiException;
//import fi.metatavu.kuntaapi.Configuration;
//import fi.metatavu.kuntaapi.auth.*;
//import fi.metatavu.kuntaapi.client.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobsApi apiInstance = new JobsApi();
String organizationId = "organizationId_example"; // String | Organization id
String sortBy = "sortBy_example"; // String | PUBLICATION_START or PUBLICATION_END
String sortDir = "sortDir_example"; // String | ASC or DESC
Long firstResult = 789L; // Long | First result
Long maxResults = 789L; // Long | Max results
try {
    List<Job> result = apiInstance.listOrganizationJobs(organizationId, sortBy, sortDir, firstResult, maxResults);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listOrganizationJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id |
 **sortBy** | **String**| PUBLICATION_START or PUBLICATION_END | [optional]
 **sortDir** | **String**| ASC or DESC | [optional]
 **firstResult** | **Long**| First result | [optional]
 **maxResults** | **Long**| Max results | [optional]

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

