# KuntaApiClient.Address

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **String** | Service location latitude coordinate. | [optional] 
**longitude** | **String** | Service location longitude coordinate. | [optional] 
**coordinateState** | **String** | State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived or WrongFormatReceived. | [optional] 
**type** | **String** | Address type, Visiting or Postal. | [optional] 
**postOfficeBox** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized post office box addresses. | [optional] 
**postalCode** | **String** | Postal code, for example 00010. | [optional] 
**postOffice** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized Post offices, for example Helsinki, Helsingfors. | [optional] 
**streetAddress** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized street addresses. | [optional] 
**streetNumber** | **String** | Street number for street address. | [optional] 
**municipality** | [**Municipality**](Municipality.md) |  | [optional] 
**country** | **String** | Country code (ISO 3166-1 alpha-2), for example FI. | [optional] 
**additionalInformations** | [**[LocalizedValue]**](LocalizedValue.md) | Localized list of additional information about the address. | [optional] 


