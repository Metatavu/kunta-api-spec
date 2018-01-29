
# ServiceHour

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceHourType** | **String** |  |  [optional]
**validFrom** | [**OffsetDateTime**](OffsetDateTime.md) | Date time where from this entry is valid. |  [optional]
**validTo** | [**OffsetDateTime**](OffsetDateTime.md) | Date time to this entry is valid. |  [optional]
**isClosed** | **Boolean** | Set to true to present a time between the valid from and to times as closed. |  [optional]
**validForNow** | **Boolean** | Set to true to present that this entry is valid for now. |  [optional]
**additionalInformation** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Localized list of additional information. |  [optional]
**openingHour** | [**List&lt;DailyOpeningTime&gt;**](DailyOpeningTime.md) | List of servicing hours (open and closes times). |  [optional]



