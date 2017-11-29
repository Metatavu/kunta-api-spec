# KuntaApiClient.Service

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | [optional] 
**type** | **String** |  | [optional] 
**statutoryDescriptionId** | **String** |  | [optional] 
**chargeType** | **String** |  | [optional] 
**fundingType** | **String** | Service funding type. Possible values are: PubliclyFunded or MarketFunded. | [optional] 
**names** | [**[LocalizedValue]**](LocalizedValue.md) |  | [optional] 
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). | [optional] 
**areas** | [**[Area]**](Area.md) | List of service areas. | [optional] 
**descriptions** | [**[LocalizedValue]**](LocalizedValue.md) |  | [optional] 
**languages** | **[String]** |  | [optional] 
**serviceClasses** | [**[OntologyItem]**](OntologyItem.md) |  | [optional] 
**ontologyTerms** | [**[OntologyItem]**](OntologyItem.md) |  | [optional] 
**targetGroups** | [**[OntologyItem]**](OntologyItem.md) |  | [optional] 
**lifeEvents** | [**[OntologyItem]**](OntologyItem.md) |  | [optional] 
**industrialClasses** | [**[OntologyItem]**](OntologyItem.md) |  | [optional] 
**legislation** | [**[Law]**](Law.md) | List of laws related to the service. | [optional] 
**keywords** | [**[LocalizedValue]**](LocalizedValue.md) | List of localized service keywords. | [optional] 
**requirements** | [**[LocalizedValue]**](LocalizedValue.md) |  | [optional] 
**publishingStatus** | **String** | Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished. | [optional] 
**organizations** | [**[ServiceOrganization]**](ServiceOrganization.md) |  | [optional] 
**vouchers** | [**[ServiceVoucher]**](ServiceVoucher.md) | List of service vouchers. | [optional] 
**electronicServiceChannelIds** | **[String]** |  | [optional] 
**phoneServiceChannelIds** | **[String]** |  | [optional] 
**printableFormServiceChannelIds** | **[String]** |  | [optional] 
**serviceLocationServiceChannelIds** | **[String]** |  | [optional] 
**webPageServiceChannelIds** | **[String]** |  | [optional] 


