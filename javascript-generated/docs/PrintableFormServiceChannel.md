# KuntaApiClient.PrintableFormServiceChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier for the service channel. | [optional] 
**organizationId** | **String** | Organization identifier responsible for the channel. | [optional] 
**names** | [**[LocalizedValue]**](LocalizedValue.md) | Localized list of service channel names. | [optional] 
**descriptions** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized service channel descriptions. | [optional] 
**formIdentifier** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized form identifier. One per language. | [optional] 
**formReceiver** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized form receiver. One per language. | [optional] 
**deliveryAddress** | [**Address**](Address.md) | Form delivery address. | [optional] 
**channelUrls** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized channel urls. | [optional] 
**attachments** | [**[ServiceChannelAttachment]**](ServiceChannelAttachment.md) | List of attachments. | [optional] 
**supportPhones** | [**[Phone]**](Phone.md) | List of support phone numbers for the service channel. | [optional] 
**supportEmails** | [**[Email]**](Email.md) | List of support email addresses for the service channel. | [optional] 
**languages** | **[String]** | List of languages the service channel is available in (two letter language code). | [optional] 
**webPages** | [**[WebPage]**](WebPage.md) | List of service channel web pages. | [optional] 
**serviceHours** | [**[ServiceHour]**](ServiceHour.md) | List of service channel service hours. | [optional] 
**publishingStatus** | **String** | Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished. | [optional] 
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). | [optional] 
**areas** | [**[Area]**](Area.md) | List of service channel areas. | [optional] 


