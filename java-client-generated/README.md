# kunta-api-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>fi.metatavu.kunta-api</groupId>
    <artifactId>kunta-api-client</artifactId>
    <version>0.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fi.metatavu.kunta-api:kunta-api-client:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/kunta-api-client-0.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import fi.metatavu.kuntaapi.*;
import fi.metatavu.kuntaapi.auth.*;
import fi.metatavu.kuntaapi.model.*;
import fi.metatavu.kuntaapi.client.AnnouncementsApi;

import java.io.File;
import java.util.*;

public class AnnouncementsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AnnouncementsApi apiInstance = new AnnouncementsApi();
        String organizationId = "organizationId_example"; // String | Organization id
        String announcementId = "announcementId_example"; // String | Announcement id
        try {
            Announcement result = apiInstance.findOrganizationAnnouncement(organizationId, announcementId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnouncementsApi#findOrganizationAnnouncement");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://demo.kuntaapi.fi/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnouncementsApi* | [**findOrganizationAnnouncement**](docs/AnnouncementsApi.md#findOrganizationAnnouncement) | **GET** /organizations/{organizationId}/announcements/{announcementId} | Finds an organizations announcement
*AnnouncementsApi* | [**listOrganizationAnnouncements**](docs/AnnouncementsApi.md#listOrganizationAnnouncements) | **GET** /organizations/{organizationId}/announcements | Lists organizations announcements
*BannersApi* | [**findOrganizationBanner**](docs/BannersApi.md#findOrganizationBanner) | **GET** /organizations/{organizationId}/banners/{bannerId} | Finds organizations banner
*BannersApi* | [**findOrganizationBannerImage**](docs/BannersApi.md#findOrganizationBannerImage) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId} | Returns a single organiztion banner image
*BannersApi* | [**getOrganizationBannerImageData**](docs/BannersApi.md#getOrganizationBannerImageData) | **GET** /organizations/{organizationId}/banners/{bannerId}/images/{imageId}/data | Returns an organization banner image data
*BannersApi* | [**listOrganizationBannerImages**](docs/BannersApi.md#listOrganizationBannerImages) | **GET** /organizations/{organizationId}/banners/{bannerId}/images | Returns a list of organization banner images
*BannersApi* | [**listOrganizationBanners**](docs/BannersApi.md#listOrganizationBanners) | **GET** /organizations/{organizationId}/banners | Lists organizations banners
*CodesApi* | [**findCode**](docs/CodesApi.md#findCode) | **GET** /codes/{codeId} | Finds a code
*CodesApi* | [**listCodes**](docs/CodesApi.md#listCodes) | **GET** /codes | Lists codes
*ContactsApi* | [**findOrganizationContact**](docs/ContactsApi.md#findOrganizationContact) | **GET** /organizations/{organizationId}/contacts/{contactId} | Finds an organizations contact
*ContactsApi* | [**listOrganizationContacts**](docs/ContactsApi.md#listOrganizationContacts) | **GET** /organizations/{organizationId}/contacts | Lists organizations contacts
*ElectronicChannelsApi* | [**findServiceElectronicChannel**](docs/ElectronicChannelsApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
*ElectronicChannelsApi* | [**listServiceElectronicChannels**](docs/ElectronicChannelsApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId
*ElectronicServiceChannelsApi* | [**findElectronicServiceChannel**](docs/ElectronicServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
*ElectronicServiceChannelsApi* | [**listElectronicServiceChannels**](docs/ElectronicServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels
*ElectronicServiceChannelsApi* | [**updateElectronicServiceChannel**](docs/ElectronicServiceChannelsApi.md#updateElectronicServiceChannel) | **PUT** /electronicServiceChannels/{electronicServiceChannelId} | Updates a channel
*EmergenciesApi* | [**findOrganizationEmergency**](docs/EmergenciesApi.md#findOrganizationEmergency) | **GET** /organizations/{organizationId}/emergencies/{emergencyId} | Returns organizations emergency by id
*EmergenciesApi* | [**listOrganizationEmergencies**](docs/EmergenciesApi.md#listOrganizationEmergencies) | **GET** /organizations/{organizationId}/emergencies | Lists organizations emergencies
*EventsApi* | [**findOrganizationEvent**](docs/EventsApi.md#findOrganizationEvent) | **GET** /organizations/{organizationId}/events/{eventId} | Returns organizations event by id
*EventsApi* | [**findOrganizationEventImage**](docs/EventsApi.md#findOrganizationEventImage) | **GET** /organizations/{organizationId}/events/{eventId}/images/{imageId} | Returns an event image
*EventsApi* | [**getOrganizationEventImageData**](docs/EventsApi.md#getOrganizationEventImageData) | **GET** /organizations/{organizationId}/events/{eventId}/images/{imageId}/data | Returns an event image data
*EventsApi* | [**listOrganizationEventImages**](docs/EventsApi.md#listOrganizationEventImages) | **GET** /organizations/{organizationId}/events/{eventId}/images | Returns list of event images
*EventsApi* | [**listOrganizationEvents**](docs/EventsApi.md#listOrganizationEvents) | **GET** /organizations/{organizationId}/events | Lists organizations events
*FilesApi* | [**deleteOrganizationFile**](docs/FilesApi.md#deleteOrganizationFile) | **DELETE** /organizations/{organizationId}/files/{fileId} | Deletes an organization file
*FilesApi* | [**findOrganizationFile**](docs/FilesApi.md#findOrganizationFile) | **GET** /organizations/{organizationId}/files/{fileId} | Finds organizations file
*FilesApi* | [**getOrganizationFileData**](docs/FilesApi.md#getOrganizationFileData) | **GET** /organizations/{organizationId}/files/{fileId}/data | Returns an organization file data
*FilesApi* | [**listOrganizationFiles**](docs/FilesApi.md#listOrganizationFiles) | **GET** /organizations/{organizationId}/files | Lists organizations files
*FragmentsApi* | [**findOrganizationFragment**](docs/FragmentsApi.md#findOrganizationFragment) | **GET** /organizations/{organizationId}/fragments/{fragmentId} | Finds organizations page fragment
*FragmentsApi* | [**listOrganizationFragments**](docs/FragmentsApi.md#listOrganizationFragments) | **GET** /organizations/{organizationId}/fragments | Lists organizations page fragments
*IncidentsApi* | [**findOrganizationIncident**](docs/IncidentsApi.md#findOrganizationIncident) | **GET** /organizations/{organizationId}/incidents/{incidentId} | Returns organizations incident by id
*IncidentsApi* | [**listOrganizationIncidents**](docs/IncidentsApi.md#listOrganizationIncidents) | **GET** /organizations/{organizationId}/incidents | Lists organizations incidents
*JobsApi* | [**findOrganizationJob**](docs/JobsApi.md#findOrganizationJob) | **GET** /organizations/{organizationId}/jobs/{jobId} | Finds organizations job
*JobsApi* | [**listOrganizationJobs**](docs/JobsApi.md#listOrganizationJobs) | **GET** /organizations/{organizationId}/jobs | Lists organizations jobs
*MenusApi* | [**findOrganizationMenu**](docs/MenusApi.md#findOrganizationMenu) | **GET** /organizations/{organizationId}/menus/{menuId} | Finds organizations menu
*MenusApi* | [**findOrganizationMenuItem**](docs/MenusApi.md#findOrganizationMenuItem) | **GET** /organizations/{organizationId}/menus/{menuId}/items/{menuItemId} | Finds organization menu item
*MenusApi* | [**listOrganizationMenuItems**](docs/MenusApi.md#listOrganizationMenuItems) | **GET** /organizations/{organizationId}/menus/{menuId}/items | Lists organizations menu items
*MenusApi* | [**listOrganizationMenus**](docs/MenusApi.md#listOrganizationMenus) | **GET** /organizations/{organizationId}/menus | Lists organizations menus
*NewsApi* | [**findOrganizationNewsArticle**](docs/NewsApi.md#findOrganizationNewsArticle) | **GET** /organizations/{organizationId}/news/{newsArticleId} | Finds organizations news article
*NewsApi* | [**findOrganizationNewsArticleImage**](docs/NewsApi.md#findOrganizationNewsArticleImage) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId} | Returns an news article image
*NewsApi* | [**getOrganizationNewsArticleImageData**](docs/NewsApi.md#getOrganizationNewsArticleImageData) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images/{imageId}/data | Returns a news article image data
*NewsApi* | [**listOrganizationNews**](docs/NewsApi.md#listOrganizationNews) | **GET** /organizations/{organizationId}/news | Lists organizations news
*NewsApi* | [**listOrganizationNewsArticleImages**](docs/NewsApi.md#listOrganizationNewsArticleImages) | **GET** /organizations/{organizationId}/news/{newsArticleId}/images | Returns list of news article images
*OrganizationsApi* | [**findOrganization**](docs/OrganizationsApi.md#findOrganization) | **GET** /organizations/{organizationId} | Find organization
*OrganizationsApi* | [**listOrganizations**](docs/OrganizationsApi.md#listOrganizations) | **GET** /organizations | List organizations
*PagesApi* | [**deleteOrganizationPage**](docs/PagesApi.md#deleteOrganizationPage) | **DELETE** /organizations/{organizationId}/pages/{pageId} | Deletes an organizations page
*PagesApi* | [**findOrganizationPage**](docs/PagesApi.md#findOrganizationPage) | **GET** /organizations/{organizationId}/pages/{pageId} | Finds organizations page
*PagesApi* | [**findOrganizationPageContent**](docs/PagesApi.md#findOrganizationPageContent) | **GET** /organizations/{organizationId}/pages/{pageId}/content | Returns organizations page content in all available languages
*PagesApi* | [**findOrganizationPageImage**](docs/PagesApi.md#findOrganizationPageImage) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId} | Returns a single organiztion page image
*PagesApi* | [**getOrganizationPageImageData**](docs/PagesApi.md#getOrganizationPageImageData) | **GET** /organizations/{organizationId}/pages/{pageId}/images/{imageId}/data | Returns an organization page image data
*PagesApi* | [**listOrganizationPageImages**](docs/PagesApi.md#listOrganizationPageImages) | **GET** /organizations/{organizationId}/pages/{pageId}/images | Returns a list of organization page images
*PagesApi* | [**listOrganizationPages**](docs/PagesApi.md#listOrganizationPages) | **GET** /organizations/{organizationId}/pages | Lists organizations pages
*PhoneChannelsApi* | [**findServicePhoneChannel**](docs/PhoneChannelsApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
*PhoneChannelsApi* | [**listServicePhoneChannels**](docs/PhoneChannelsApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId
*PhoneServiceChannelsApi* | [**findPhoneServiceChannel**](docs/PhoneServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
*PhoneServiceChannelsApi* | [**listPhoneServiceChannels**](docs/PhoneServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
*PhoneServiceChannelsApi* | [**updatePhoneServiceChannel**](docs/PhoneServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel
*PrintableFormChannelsApi* | [**findServicePrintableFormChannel**](docs/PrintableFormChannelsApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
*PrintableFormChannelsApi* | [**listServicePrintableFormChannels**](docs/PrintableFormChannelsApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId
*PrintableFormServiceChannelsApi* | [**findPrintableFormServiceChannel**](docs/PrintableFormServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
*PrintableFormServiceChannelsApi* | [**listPrintableFormServiceChannels**](docs/PrintableFormServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels
*PrintableFormServiceChannelsApi* | [**updatePrintableFormServiceChannel**](docs/PrintableFormServiceChannelsApi.md#updatePrintableFormServiceChannel) | **PUT** /printableFormServiceChannels/{printableFormServiceChannelId} | Updates a channel
*PublicTransportApi* | [**findOrganizationPublicTransportAgency**](docs/PublicTransportApi.md#findOrganizationPublicTransportAgency) | **GET** /organizations/{organizationId}/transportAgencies/{agencyId} | Finds an organizations public transport agency
*PublicTransportApi* | [**findOrganizationPublicTransportRoute**](docs/PublicTransportApi.md#findOrganizationPublicTransportRoute) | **GET** /organizations/{organizationId}/transportRoutes/{routeId} | Finds an organizations public transport route
*PublicTransportApi* | [**findOrganizationPublicTransportSchedule**](docs/PublicTransportApi.md#findOrganizationPublicTransportSchedule) | **GET** /organizations/{organizationId}/transportSchedules/{scheduleId} | Finds organizations public transport schedule
*PublicTransportApi* | [**findOrganizationPublicTransportStop**](docs/PublicTransportApi.md#findOrganizationPublicTransportStop) | **GET** /organizations/{organizationId}/transportStops/{stopId} | Finds a stop of organizations public transport route
*PublicTransportApi* | [**findOrganizationPublicTransportStopTime**](docs/PublicTransportApi.md#findOrganizationPublicTransportStopTime) | **GET** /organizations/{organizationId}/transportStopTimes/{stopTimeId} | Finds organizations public transport stopTime
*PublicTransportApi* | [**findOrganizationPublicTransportTrip**](docs/PublicTransportApi.md#findOrganizationPublicTransportTrip) | **GET** /organizations/{organizationId}/transportTrips/{tripId} | Finds organizations public transport trip
*PublicTransportApi* | [**listOrganizationPublicTransportAgencies**](docs/PublicTransportApi.md#listOrganizationPublicTransportAgencies) | **GET** /organizations/{organizationId}/transportAgencies | Lists organizations public transport agencies
*PublicTransportApi* | [**listOrganizationPublicTransportRoutes**](docs/PublicTransportApi.md#listOrganizationPublicTransportRoutes) | **GET** /organizations/{organizationId}/transportRoutes | Lists organizations public transport routes
*PublicTransportApi* | [**listOrganizationPublicTransportSchedules**](docs/PublicTransportApi.md#listOrganizationPublicTransportSchedules) | **GET** /organizations/{organizationId}/transportSchedules | Lists schedules of organization&#39;s public transport schedules
*PublicTransportApi* | [**listOrganizationPublicTransportStopTimes**](docs/PublicTransportApi.md#listOrganizationPublicTransportStopTimes) | **GET** /organizations/{organizationId}/transportStopTimes | Lists stopTimes of organization&#39;s public transport stopTimes
*PublicTransportApi* | [**listOrganizationPublicTransportStops**](docs/PublicTransportApi.md#listOrganizationPublicTransportStops) | **GET** /organizations/{organizationId}/transportStops | Lists organizations public transport stops
*PublicTransportApi* | [**listOrganizationPublicTransportTrips**](docs/PublicTransportApi.md#listOrganizationPublicTransportTrips) | **GET** /organizations/{organizationId}/transportTrips | Lists trips of organization&#39;s public transport trips
*ServiceChannelsApi* | [**findElectronicServiceChannel**](docs/ServiceChannelsApi.md#findElectronicServiceChannel) | **GET** /electronicServiceChannels/{electronicServiceChannelId} | Finds an electronic service channel by id
*ServiceChannelsApi* | [**findPhoneServiceChannel**](docs/ServiceChannelsApi.md#findPhoneServiceChannel) | **GET** /phoneServiceChannels/{phoneServiceChannelId} | Finds a phone service channel by id
*ServiceChannelsApi* | [**findPrintableFormServiceChannel**](docs/ServiceChannelsApi.md#findPrintableFormServiceChannel) | **GET** /printableFormServiceChannels/{printableFormServiceChannelId} | Finds a printable form service channel
*ServiceChannelsApi* | [**findServiceLocationServiceChannel**](docs/ServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
*ServiceChannelsApi* | [**findWebPageServiceChannel**](docs/ServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
*ServiceChannelsApi* | [**listElectronicServiceChannels**](docs/ServiceChannelsApi.md#listElectronicServiceChannels) | **GET** /electronicServiceChannels | Lists electronic service channels
*ServiceChannelsApi* | [**listPhoneServiceChannels**](docs/ServiceChannelsApi.md#listPhoneServiceChannels) | **GET** /phoneServiceChannels | Lists phone service channels
*ServiceChannelsApi* | [**listPrintableFormServiceChannels**](docs/ServiceChannelsApi.md#listPrintableFormServiceChannels) | **GET** /printableFormServiceChannels | Lists printable form service channels
*ServiceChannelsApi* | [**listServiceLocationServiceChannels**](docs/ServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels
*ServiceChannelsApi* | [**listWebPageServiceChannels**](docs/ServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels
*ServiceChannelsApi* | [**updateElectronicServiceChannel**](docs/ServiceChannelsApi.md#updateElectronicServiceChannel) | **PUT** /electronicServiceChannels/{electronicServiceChannelId} | Updates a channel
*ServiceChannelsApi* | [**updatePhoneServiceChannel**](docs/ServiceChannelsApi.md#updatePhoneServiceChannel) | **PUT** /phoneServiceChannels/{phoneServiceChannelId} | Updates a channel
*ServiceChannelsApi* | [**updatePrintableFormServiceChannel**](docs/ServiceChannelsApi.md#updatePrintableFormServiceChannel) | **PUT** /printableFormServiceChannels/{printableFormServiceChannelId} | Updates a channel
*ServiceChannelsApi* | [**updateServiceLocationServiceChannel**](docs/ServiceChannelsApi.md#updateServiceLocationServiceChannel) | **PUT** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Updates a service location channel
*ServiceChannelsApi* | [**updateWebPageServiceChannel**](docs/ServiceChannelsApi.md#updateWebPageServiceChannel) | **PUT** /webPageServiceChannels/{webPageServiceChannelId} | Updates a channel
*ServiceLocationChannelsApi* | [**findServiceServiceLocationChannel**](docs/ServiceLocationChannelsApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
*ServiceLocationChannelsApi* | [**listServiceServiceLocationChannels**](docs/ServiceLocationChannelsApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId
*ServiceLocationServiceChannelsApi* | [**findServiceLocationServiceChannel**](docs/ServiceLocationServiceChannelsApi.md#findServiceLocationServiceChannel) | **GET** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Finds a service location service by id
*ServiceLocationServiceChannelsApi* | [**listServiceLocationServiceChannels**](docs/ServiceLocationServiceChannelsApi.md#listServiceLocationServiceChannels) | **GET** /serviceLocationServiceChannels | Lists service location service channels
*ServiceLocationServiceChannelsApi* | [**updateServiceLocationServiceChannel**](docs/ServiceLocationServiceChannelsApi.md#updateServiceLocationServiceChannel) | **PUT** /serviceLocationServiceChannels/{serviceLocationServiceChannelId} | Updates a service location channel
*ServicesApi* | [**createService**](docs/ServicesApi.md#createService) | **POST** /services | Create service
*ServicesApi* | [**findService**](docs/ServicesApi.md#findService) | **GET** /services/{serviceId} | Finds a service by id
*ServicesApi* | [**findServiceElectronicChannel**](docs/ServicesApi.md#findServiceElectronicChannel) | **GET** /services/{serviceId}/electronicChannels/{electronicChannelId} | finds ElectronicChannel by electronicChannelId
*ServicesApi* | [**findServicePhoneChannel**](docs/ServicesApi.md#findServicePhoneChannel) | **GET** /services/{serviceId}/phoneChannels/{phoneChannelId} | finds PhoneChannel by phoneChannelId
*ServicesApi* | [**findServicePrintableFormChannel**](docs/ServicesApi.md#findServicePrintableFormChannel) | **GET** /services/{serviceId}/printableFormChannels/{printableFormChannelId} | finds PrintableFormChannel by printableFormChannelId
*ServicesApi* | [**findServiceServiceLocationChannel**](docs/ServicesApi.md#findServiceServiceLocationChannel) | **GET** /services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId} | finds ServiceLocationChannel by serviceLocationChannelId
*ServicesApi* | [**findServiceWebPageChannel**](docs/ServicesApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
*ServicesApi* | [**listServiceElectronicChannels**](docs/ServicesApi.md#listServiceElectronicChannels) | **GET** /services/{serviceId}/electronicChannels | Lists ElectronicChannels by serviceId
*ServicesApi* | [**listServicePhoneChannels**](docs/ServicesApi.md#listServicePhoneChannels) | **GET** /services/{serviceId}/phoneChannels | Lists PhoneChannels by serviceId
*ServicesApi* | [**listServicePrintableFormChannels**](docs/ServicesApi.md#listServicePrintableFormChannels) | **GET** /services/{serviceId}/printableFormChannels | Lists PrintableFormChannels by serviceId
*ServicesApi* | [**listServiceServiceLocationChannels**](docs/ServicesApi.md#listServiceServiceLocationChannels) | **GET** /services/{serviceId}/serviceLocationChannels | Lists ServiceLocationChannels by serviceId
*ServicesApi* | [**listServiceWebPageChannels**](docs/ServicesApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId
*ServicesApi* | [**listServices**](docs/ServicesApi.md#listServices) | **GET** /services | Service list
*ServicesApi* | [**updateService**](docs/ServicesApi.md#updateService) | **PUT** /services/{serviceId} | Updates service
*SettingsApi* | [**createOrganizationSetting**](docs/SettingsApi.md#createOrganizationSetting) | **POST** /organizations/{organizationId}/settings/ | Creates organization setting
*SettingsApi* | [**deleteOrganizationSetting**](docs/SettingsApi.md#deleteOrganizationSetting) | **DELETE** /organizations/{organizationId}/settings/{settingId} | Deletes an organization setting
*SettingsApi* | [**findOrganizationSetting**](docs/SettingsApi.md#findOrganizationSetting) | **GET** /organizations/{organizationId}/settings/{settingId} | Finds organizations setting
*SettingsApi* | [**listOrganizationSettings**](docs/SettingsApi.md#listOrganizationSettings) | **GET** /organizations/{organizationId}/settings/ | Lists organizations settings
*SettingsApi* | [**updateOrganizationSetting**](docs/SettingsApi.md#updateOrganizationSetting) | **PUT** /organizations/{organizationId}/settings/{settingId} | Updates an organization setting
*ShortlinksApi* | [**findOrganizationShortlink**](docs/ShortlinksApi.md#findOrganizationShortlink) | **GET** /organizations/{organizationId}/shortlinks/{shortlinkId} | Finds organization shortlink
*ShortlinksApi* | [**listOrganizationShortlinks**](docs/ShortlinksApi.md#listOrganizationShortlinks) | **GET** /organizations/{organizationId}/shortlinks | Lists organizations shortlinks
*TilesApi* | [**findOrganizationTile**](docs/TilesApi.md#findOrganizationTile) | **GET** /organizations/{organizationId}/tiles/{tileId} | Finds organizations tile
*TilesApi* | [**findOrganizationTileImage**](docs/TilesApi.md#findOrganizationTileImage) | **GET** /organizations/{organizationId}/tiles/{tileId}/images/{imageId} | Returns a single organiztion tile image
*TilesApi* | [**getOrganizationTileImageData**](docs/TilesApi.md#getOrganizationTileImageData) | **GET** /organizations/{organizationId}/tiles/{tileId}/images/{imageId}/data | Returns an organization tile image data
*TilesApi* | [**listOrganizationTileImages**](docs/TilesApi.md#listOrganizationTileImages) | **GET** /organizations/{organizationId}/tiles/{tileId}/images | Returns a list of organization tile images
*TilesApi* | [**listOrganizationTiles**](docs/TilesApi.md#listOrganizationTiles) | **GET** /organizations/{organizationId}/tiles | Lists organizations tiles
*WebPageChannelsApi* | [**findServiceWebPageChannel**](docs/WebPageChannelsApi.md#findServiceWebPageChannel) | **GET** /services/{serviceId}/webPageChannels/{webPageChannelId} | finds WebPageChannel by webPageChannelId
*WebPageChannelsApi* | [**listServiceWebPageChannels**](docs/WebPageChannelsApi.md#listServiceWebPageChannels) | **GET** /services/{serviceId}/webPageChannels | Lists WebPageChannels by serviceId
*WebPageServiceChannelsApi* | [**findWebPageServiceChannel**](docs/WebPageServiceChannelsApi.md#findWebPageServiceChannel) | **GET** /webPageServiceChannels/{webPageServiceChannelId} | Finds a web page service channel by id
*WebPageServiceChannelsApi* | [**listWebPageServiceChannels**](docs/WebPageServiceChannelsApi.md#listWebPageServiceChannels) | **GET** /webPageServiceChannels | Lists web page service channels
*WebPageServiceChannelsApi* | [**updateWebPageServiceChannel**](docs/WebPageServiceChannelsApi.md#updateWebPageServiceChannel) | **PUT** /webPageServiceChannels/{webPageServiceChannelId} | Updates a channel


## Documentation for Models

 - [Address](docs/Address.md)
 - [Agency](docs/Agency.md)
 - [Announcement](docs/Announcement.md)
 - [Area](docs/Area.md)
 - [Attachment](docs/Attachment.md)
 - [BadRequest](docs/BadRequest.md)
 - [Banner](docs/Banner.md)
 - [Code](docs/Code.md)
 - [CodeExtra](docs/CodeExtra.md)
 - [Contact](docs/Contact.md)
 - [ContactPhone](docs/ContactPhone.md)
 - [ContactStatus](docs/ContactStatus.md)
 - [Coordinate](docs/Coordinate.md)
 - [Coordinates](docs/Coordinates.md)
 - [DailyOpeningTime](docs/DailyOpeningTime.md)
 - [ElectronicServiceChannel](docs/ElectronicServiceChannel.md)
 - [Email](docs/Email.md)
 - [Emergency](docs/Emergency.md)
 - [EmergencySource](docs/EmergencySource.md)
 - [Event](docs/Event.md)
 - [FileDef](docs/FileDef.md)
 - [Forbidden](docs/Forbidden.md)
 - [Fragment](docs/Fragment.md)
 - [Incident](docs/Incident.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [Job](docs/Job.md)
 - [Law](docs/Law.md)
 - [LocalizedValue](docs/LocalizedValue.md)
 - [Menu](docs/Menu.md)
 - [MenuItem](docs/MenuItem.md)
 - [Municipality](docs/Municipality.md)
 - [NameTypeByLanguage](docs/NameTypeByLanguage.md)
 - [NewsArticle](docs/NewsArticle.md)
 - [NotFound](docs/NotFound.md)
 - [NotImplemented](docs/NotImplemented.md)
 - [OntologyItem](docs/OntologyItem.md)
 - [Organization](docs/Organization.md)
 - [OrganizationService](docs/OrganizationService.md)
 - [OrganizationSetting](docs/OrganizationSetting.md)
 - [Page](docs/Page.md)
 - [PageMeta](docs/PageMeta.md)
 - [Phone](docs/Phone.md)
 - [PhoneServiceChannel](docs/PhoneServiceChannel.md)
 - [PrintableFormServiceChannel](docs/PrintableFormServiceChannel.md)
 - [Route](docs/Route.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleException](docs/ScheduleException.md)
 - [Service](docs/Service.md)
 - [ServiceChannelAttachment](docs/ServiceChannelAttachment.md)
 - [ServiceHour](docs/ServiceHour.md)
 - [ServiceLocationServiceChannel](docs/ServiceLocationServiceChannel.md)
 - [ServiceOrganization](docs/ServiceOrganization.md)
 - [ServiceVoucher](docs/ServiceVoucher.md)
 - [Shortlink](docs/Shortlink.md)
 - [Stop](docs/Stop.md)
 - [StopTime](docs/StopTime.md)
 - [Tile](docs/Tile.md)
 - [Trip](docs/Trip.md)
 - [WebPage](docs/WebPage.md)
 - [WebPageServiceChannel](docs/WebPageServiceChannel.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



