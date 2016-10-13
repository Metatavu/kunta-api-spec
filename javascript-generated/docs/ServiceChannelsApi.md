# KuntaApiClient.ServiceChannelsApi

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listServiceElectornicChannels**](ServiceChannelsApi.md#listServiceElectornicChannels) | **GET** /organizations/{organizationId}/services/{serviceId}/electronicChannels | List service electornic channels


<a name="listServiceElectornicChannels"></a>
# **listServiceElectornicChannels**
> ServiceElectronicChannel listServiceElectornicChannels(organizationId, serviceId)

List service electornic channels

Lists service electronic channels 

### Example
```javascript
var KuntaApiClient = require('kunta-api-client');

var apiInstance = new KuntaApiClient.ServiceChannelsApi();

var organizationId = "organizationId_example"; // String | Organization id

var serviceId = "serviceId_example"; // String | Service id

apiInstance.listServiceElectornicChannels(organizationId, serviceId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | **String**| Organization id | 
 **serviceId** | **String**| Service id | 

### Return type

[**ServiceElectronicChannel**](ServiceElectronicChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

