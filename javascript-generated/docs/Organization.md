# KuntaApiClient.Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Entity identifier. | [optional] 
**parentOrganization** | **String** | Organizations parent organization identifier if exists. | [optional] 
**organizationType** | **String** | Organization type (State, Municipality, RegionalOrganization, Organization, Company). | [optional] 
**municipality** | [**Municipality**](Municipality.md) | Municipality including municipality code and a localized list of municipality names. | [optional] 
**businessCode** | **String** | Organization business code (Y-tunnus). | [optional] 
**businessName** | **String** | Organization business name (name used for business code). | [optional] 
**names** | [**[LocalizedValue]**](LocalizedValue.md) | List of organization names. | [optional] 
**displayNameType** | [**[NameTypeByLanguage]**](NameTypeByLanguage.md) | List of Display name types (Name or AlternateName) for each language version of OrganizationNames. | [optional] 
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). | [optional] 
**areas** | [**[Area]**](Area.md) | List of organization areas. | [optional] 
**descriptions** | [**[LocalizedValue]**](LocalizedValue.md) | List of organizations descriptions. | [optional] 
**emailAddresses** | [**[Email]**](Email.md) | List of organizations email addresses. | [optional] 
**phoneNumbers** | [**[Phone]**](Phone.md) | List of organizations phone numbers. | [optional] 
**webPages** | [**[WebPage]**](WebPage.md) | List of organizations web pages. | [optional] 
**addresses** | [**[Address]**](Address.md) | List of organizations addresses. | [optional] 
**publishingStatus** | **String** | Publishing status (Draft, Published, Deleted, Modified and OldPublished). | [optional] 
**services** | [**[OrganizationService]**](OrganizationService.md) | List of organizations services. | [optional] 


