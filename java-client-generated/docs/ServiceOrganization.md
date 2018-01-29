
# ServiceOrganization

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalInformation** | [**List&lt;LocalizedValue&gt;**](LocalizedValue.md) | Localized list of additional information. |  [optional]
**organizationId** | **String** | Organization identifier (organization related to the service). Required if role type is Responsible or if ProvisionType is SelfProduced. |  [optional]
**roleType** | **String** | Role type, valid values Responsible or Producer. |  [optional]
**provisionType** | **String** | Provision type, valid values SelfProduced, VoucherServices, PurchaseServices or Other. Required if RoleType value is Producer. |  [optional]
**webPages** | [**List&lt;WebPage&gt;**](WebPage.md) | DEPRECATED. DO NOT USE |  [optional]



