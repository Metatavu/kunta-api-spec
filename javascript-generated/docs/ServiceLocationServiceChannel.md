# KuntaApiClient.ServiceLocationServiceChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier for the service channel. | [optional] 
**organizationId** | **String** | Organization identifier responsible for the channel. | [optional] 
**names** | [**[LocalizedValue]**](LocalizedValue.md) | Localized list of service channel names. | [optional] 
**descriptions** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized service channel descriptions. | [optional] 
**serviceAreaRestricted** | **Boolean** | Is the service location channel restricted by service area. | [optional] 
**phoneNumbers** | [**[Phone]**](Phone.md) | List of phone numbers for the service channel. Includes also fax numbers. | [optional] 
**emails** | [**[LocalizedValue]**](LocalizedValue.md) | List email addresses for the service channel. | [optional] 
**languages** | **[String]** | List of languages the service channel is available in (two letter language code). | [optional] 
**phoneServiceCharge** | **Boolean** | Is the phone service charged for. | [optional] 
**webPages** | [**[WebPage]**](WebPage.md) | List of service channel web pages. | [optional] 
**serviceAreas** | [**[Municipality]**](Municipality.md) | List of serviceareas. Used when location service channel is restricted by service area (ServiceAreaRestricted&#x3D;true). | [optional] 
**addresses** | [**[Address]**](Address.md) | List of service location addresses. | [optional] 
**serviceHours** | [**[ServiceHour]**](ServiceHour.md) | List of service channel service hours. | [optional] 
**publishingStatus** | **String** | Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished. | [optional] 


