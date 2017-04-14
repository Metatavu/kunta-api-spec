# KuntaApiClient.ServiceOrganization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInformation** | [**[LocalizedValue]**](LocalizedValue.md) | Localized list of additional information. | [optional] 
**organizationId** | **String** | Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced. | [optional] 
**roleType** | **String** | Role type, valid values Responsible or Producer. | [optional] 
**provisionType** | **String** | Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer. | [optional] 
**webPages** | [**[WebPage]**](WebPage.md) | List of web pages. | [optional] 


