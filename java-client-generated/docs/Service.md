
# Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**type** | **String** |  |  [optional]
**statutoryDescriptionId** | **String** |  |  [optional]
**chargeType** | **String** |  |  [optional]
**fundingType** | **String** | Service funding type. Possible values are: PubliclyFunded or MarketFunded. |  [optional]
**names** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) |  |  [optional]
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). |  [optional]
**areas** | [**List&lt;Area&gt;**](Area.md) | List of service areas. |  [optional]
**descriptions** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) |  |  [optional]
**languages** | **List&lt;String&gt;** |  |  [optional]
**serviceClasses** | [**List&lt;OntologyItem&gt;**](OntologyItem.md) |  |  [optional]
**ontologyTerms** | [**List&lt;OntologyItem&gt;**](OntologyItem.md) |  |  [optional]
**targetGroups** | [**List&lt;OntologyItem&gt;**](OntologyItem.md) |  |  [optional]
**lifeEvents** | [**List&lt;OntologyItem&gt;**](OntologyItem.md) |  |  [optional]
**industrialClasses** | [**List&lt;OntologyItem&gt;**](OntologyItem.md) |  |  [optional]
**legislation** | [**List&lt;Law&gt;**](Law.md) | List of laws related to the service. |  [optional]
**keywords** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of localized service keywords. |  [optional]
**requirements** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) |  |  [optional]
**publishingStatus** | **String** | Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished. |  [optional]
**organizations** | [**List&lt;ServiceOrganization&gt;**](ServiceOrganization.md) |  |  [optional]
**vouchers** | [**List&lt;ServiceVoucher&gt;**](ServiceVoucher.md) | List of service vouchers. |  [optional]
**electronicServiceChannelIds** | **List&lt;String&gt;** |  |  [optional]
**phoneServiceChannelIds** | **List&lt;String&gt;** |  |  [optional]
**printableFormServiceChannelIds** | **List&lt;String&gt;** |  |  [optional]
**serviceLocationServiceChannelIds** | **List&lt;String&gt;** |  |  [optional]
**webPageServiceChannelIds** | **List&lt;String&gt;** |  |  [optional]



