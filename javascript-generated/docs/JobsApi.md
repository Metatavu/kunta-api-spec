# KuntaApiClient.JobsApi

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
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.JobsApi();

var organizationId = "organizationId_example"; // String | Organization id

var jobId = "jobId_example"; // String | job id

apiInstance.findOrganizationJob(organizationId, jobId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **jobId** | **String**| job id | 

### Return type

[**Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listOrganizationJobs"></a>
# **listOrganizationJobs**
> [Job] listOrganizationJobs(organizationId, opts)

Lists organizations jobs

Lists organizations jobs 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.JobsApi();

var organizationId = "organizationId_example"; // String | Organization id

var opts = { 
  'sortBy': "sortBy_example", // String | PUBLICATION_START or PUBLICATION_END
  'sortDir': "sortDir_example", // String | ASC or DESC
  'firstResult': 789, // Integer | First result
  'maxResults': 789 // Integer | Max results
};
apiInstance.listOrganizationJobs(organizationId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **sortBy** | **String**| PUBLICATION_START or PUBLICATION_END | [optional] 
 **sortDir** | **String**| ASC or DESC | [optional] 
 **firstResult** | **Integer**| First result | [optional] 
 **maxResults** | **Integer**| Max results | [optional] 

### Return type

[**[Job]**](Job.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

