# KuntaApiClient.ServiceHour

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceHourType** | **String** |  | [optional] 
**validFrom** | **Date** | Date time where from this entry is valid. | [optional] 
**validTo** | **Date** | Date time to this entry is valid. | [optional] 
**isClosed** | **Boolean** | Set to true to present a time between the valid from and to times as closed. | [optional] 
**validForNow** | **Boolean** | Set to true to present that this entry is valid for now. | [optional] 
**additionalInformation** | [**[LocalizedValue]**](LocalizedValue.md) | Localized list of additional information. | [optional] 
**openingHour** | [**[DailyOpeningTime]**](DailyOpeningTime.md) | List of servicing hours (open and closes times). | [optional] 


