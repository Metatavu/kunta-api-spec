
# Organization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Entity identifier. |  [optional]
**parentOrganization** | **String** | Organizations parent organization identifier if exists. |  [optional]
**organizationType** | **String** | Organization type (State, Municipality, RegionalOrganization, Organization, Company). |  [optional]
**municipality** | [**Municipality**](Municipality.md) | Municipality including municipality code and a localized list of municipality names. |  [optional]
**businessCode** | **String** | Organization business code (Y-tunnus). |  [optional]
**businessName** | **String** | Organization business name (name used for business code). |  [optional]
**names** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of organization names. |  [optional]
**displayNameType** | [**List&lt;NameTypeByLanguage&gt;**](NameTypeByLanguage.md) | List of Display name types (Name or AlternateName) for each language version of OrganizationNames. |  [optional]
**areaType** | **String** | Area type (WholeCountry, WholeCountryExceptAlandIslands, AreaType). |  [optional]
**areas** | [**List&lt;Area&gt;**](Area.md) | List of organization areas. |  [optional]
**descriptions** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | List of organizations descriptions. |  [optional]
**emailAddresses** | [**List&lt;Email&gt;**](Email.md) | List of organizations email addresses. |  [optional]
**phoneNumbers** | [**List&lt;Phone&gt;**](Phone.md) | List of organizations phone numbers. |  [optional]
**webPages** | [**List&lt;WebPage&gt;**](WebPage.md) | List of organizations web pages. |  [optional]
**addresses** | [**List&lt;Address&gt;**](Address.md) | List of organizations addresses. |  [optional]
**publishingStatus** | **String** | Publishing status (Draft, Published, Deleted, Modified and OldPublished). |  [optional]
**services** | [**List&lt;OrganizationService&gt;**](OrganizationService.md) | List of organizations services. |  [optional]



