
# PrintableFormServiceChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier for the service channel. |  [optional]
**organizationId** | **String** | Organization identifier responsible for the channel. |  [optional]
**names** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Localized list of service channel names. |  [optional]
**descriptions** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized service channel descriptions. |  [optional]
**formIdentifier** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized form identifier. One per language. |  [optional]
**formReceiver** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized form receiver. One per language. |  [optional]
**deliveryAddress** | [**Address**](Address.md) | Form delivery address. |  [optional]
**channelUrls** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized channel urls. |  [optional]
**attachments** | [**List&lt;ServiceChannelAttachment&gt;**](ServiceChannelAttachment.md) | List of attachments. |  [optional]
**supportPhones** | [**List&lt;Phone&gt;**](Phone.md) | List of support phone numbers for the service channel. |  [optional]
**supportEmails** | [**List&lt;Email&gt;**](Email.md) | List of support email addresses for the service channel. |  [optional]
**languages** | **List&lt;String&gt;** | List of languages the service channel is available in (two letter language code). |  [optional]
**webPages** | [**List&lt;WebPage&gt;**](WebPage.md) | List of service channel web pages. |  [optional]
**serviceHours** | [**List&lt;ServiceHour&gt;**](ServiceHour.md) | List of service channel service hours. |  [optional]
**publishingStatus** | **String** | Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished. |  [optional]
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). |  [optional]
**areas** | [**List&lt;Area&gt;**](Area.md) | List of service channel areas. |  [optional]


