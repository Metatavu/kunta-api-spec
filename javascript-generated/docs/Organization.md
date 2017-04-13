# KuntaApiClient.Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Entity identifier. | [optional] 
**municipality** | [**Municipality**](Municipality.md) | Municipality including municipality code and a localized list of municipality names. | [optional] 
**organizationType** | **String** | Organization type (State, Municipality, RegionalOrganization, Organization, Company). | [optional] 
**businessCode** | **String** | Organization business code (Y-tunnus). | [optional] 
**businessName** | **String** | Organization business name (name used for business code). | [optional] 
**names** | [**[LocalizedValue]**](LocalizedValue.md) | List of organization names. | [optional] 
**displayNameType** | **String** | Display name type (Name or AlternateName). Which name type should be used as the display name for the organization (OrganizationNames list). | [optional] 
**descriptions** | [**[LocalizedValue]**](LocalizedValue.md) | List of organizations descriptions. | [optional] 
**emailAddresses** | [**[Email]**](Email.md) | List of organizations email addresses. | [optional] 
**phoneNumbers** | [**[Phone]**](Phone.md) | List of organizations phone numbers. | [optional] 
**webPages** | [**[WebPage]**](WebPage.md) | List of organizations web pages. | [optional] 
**addresses** | [**[Address]**](Address.md) | List of organizations addresses. | [optional] 
**publishingStatus** | **String** | Publishing status (Draft, Published, Deleted, Modified and OldPublished). | [optional] 
**parentOrganization** | **String** | Organizations parent organization identifier if exists. | [optional] 
**services** | [**[Service]**](Service.md) | List of organizations services. | [optional] 


