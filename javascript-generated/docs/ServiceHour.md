# KuntaApiClient.ServiceHour

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type of service hour (Standard, Exception or Special). | [optional] 
**exceptionHourType** | **String** | Type of service hour exception type. Valid values are: Open or Closed. | [optional] 
**validFrom** | **Date** | Date time where from this entry is valid. | [optional] 
**validTo** | **Date** | Date time to this entry is valid. | [optional] 
**days** | **[Integer]** | Array of week numbers indices where serice hour is active (0 &#x3D;&#x3D; sunday) | [optional] 
**opens** | **String** | Opening time in format HH:mm for example 08:00. | [optional] 
**closes** | **String** | Closing time in format HH:mm for example 19:00 | [optional] 
**timezone** | **String** |  | [optional] 
**additionalInformation** | [**[LocalizedValue]**](LocalizedValue.md) |  | [optional] 


