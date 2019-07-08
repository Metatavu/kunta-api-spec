
# Address

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latitude** | **String** | Service location latitude coordinate. |  [optional]
**longitude** | **String** | Service location longitude coordinate. |  [optional]
**coordinates** | [**Coordinates**](Coordinates.md) |  |  [optional]
**coordinateState** | **String** | State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived or WrongFormatReceived. |  [optional]
**type** | **String** | Address type, Visiting or Postal. |  [optional]
**subtype** | **String** | Address sub type, Single, Street, PostOfficeBox, Abroad or Multipoint or NoAddress. |  [optional]
**postOfficeBox** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Post office box like PL 310 |  [optional]
**postalCode** | **String** | Postal code, for example 00010. |  [optional]
**postOffice** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized Post offices, for example Helsinki, Helsingfors. |  [optional]
**streetAddress** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized street addresses. |  [optional]
**streetNumber** | **String** | Street number for street address. |  [optional]
**municipality** | [**Municipality**](Municipality.md) |  |  [optional]
**country** | **String** | Country code (ISO 3166-1 alpha-2), for example FI. |  [optional]
**locationAbroad** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Localized list of foreign address information. |  [optional]
**multipointLocation** | [**List&lt;Address&gt;**](Address.md) | Moving address. Includes several street addresses. |  [optional]
**additionalInformations** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Localized list of additional information about the address. |  [optional]
**entrances** | [**List&lt;AddressEntrance&gt;**](AddressEntrance.md) | Entrances for an address. Includes accessibility sentences. |  [optional]



