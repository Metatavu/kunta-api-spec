/**
 * Kunta API
 * Solution to combine municipality services under single API.
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/Address', 'model/Announcement', 'model/Attachment', 'model/BadRequest', 'model/Banner', 'model/Contact', 'model/ContactPhone', 'model/ContactStatus', 'model/ElectronicChannel', 'model/Event', 'model/FileDef', 'model/Forbidden', 'model/Fragment', 'model/InternalServerError', 'model/Job', 'model/LocalizedValue', 'model/Menu', 'model/MenuItem', 'model/NewsArticle', 'model/NotFound', 'model/NotImplemented', 'model/OntologyItem', 'model/Organization', 'model/OrganizationService', 'model/OrganizationSetting', 'model/Page', 'model/PageMeta', 'model/PhoneChannel', 'model/PrintableFormChannel', 'model/Service', 'model/ServiceChannelAttachment', 'model/ServiceHour', 'model/ServiceLocationChannel', 'model/SupportContact', 'model/Tile', 'model/WebPage', 'model/WebPageChannel', 'api/AnnouncementsApi', 'api/BannersApi', 'api/ContactsApi', 'api/ElectronicChannelsApi', 'api/EventsApi', 'api/FilesApi', 'api/FragmentsApi', 'api/JobsApi', 'api/MenusApi', 'api/NewsApi', 'api/OrganizationServicesApi', 'api/OrganizationsApi', 'api/PagesApi', 'api/PhoneChannelsApi', 'api/PrintableFormChannelsApi', 'api/ServiceLocationChannelsApi', 'api/ServicesApi', 'api/SettingsApi', 'api/TilesApi', 'api/WebPageChannelsApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/Address'), require('./model/Announcement'), require('./model/Attachment'), require('./model/BadRequest'), require('./model/Banner'), require('./model/Contact'), require('./model/ContactPhone'), require('./model/ContactStatus'), require('./model/ElectronicChannel'), require('./model/Event'), require('./model/FileDef'), require('./model/Forbidden'), require('./model/Fragment'), require('./model/InternalServerError'), require('./model/Job'), require('./model/LocalizedValue'), require('./model/Menu'), require('./model/MenuItem'), require('./model/NewsArticle'), require('./model/NotFound'), require('./model/NotImplemented'), require('./model/OntologyItem'), require('./model/Organization'), require('./model/OrganizationService'), require('./model/OrganizationSetting'), require('./model/Page'), require('./model/PageMeta'), require('./model/PhoneChannel'), require('./model/PrintableFormChannel'), require('./model/Service'), require('./model/ServiceChannelAttachment'), require('./model/ServiceHour'), require('./model/ServiceLocationChannel'), require('./model/SupportContact'), require('./model/Tile'), require('./model/WebPage'), require('./model/WebPageChannel'), require('./api/AnnouncementsApi'), require('./api/BannersApi'), require('./api/ContactsApi'), require('./api/ElectronicChannelsApi'), require('./api/EventsApi'), require('./api/FilesApi'), require('./api/FragmentsApi'), require('./api/JobsApi'), require('./api/MenusApi'), require('./api/NewsApi'), require('./api/OrganizationServicesApi'), require('./api/OrganizationsApi'), require('./api/PagesApi'), require('./api/PhoneChannelsApi'), require('./api/PrintableFormChannelsApi'), require('./api/ServiceLocationChannelsApi'), require('./api/ServicesApi'), require('./api/SettingsApi'), require('./api/TilesApi'), require('./api/WebPageChannelsApi'));
  }
}(function(ApiClient, Address, Announcement, Attachment, BadRequest, Banner, Contact, ContactPhone, ContactStatus, ElectronicChannel, Event, FileDef, Forbidden, Fragment, InternalServerError, Job, LocalizedValue, Menu, MenuItem, NewsArticle, NotFound, NotImplemented, OntologyItem, Organization, OrganizationService, OrganizationSetting, Page, PageMeta, PhoneChannel, PrintableFormChannel, Service, ServiceChannelAttachment, ServiceHour, ServiceLocationChannel, SupportContact, Tile, WebPage, WebPageChannel, AnnouncementsApi, BannersApi, ContactsApi, ElectronicChannelsApi, EventsApi, FilesApi, FragmentsApi, JobsApi, MenusApi, NewsApi, OrganizationServicesApi, OrganizationsApi, PagesApi, PhoneChannelsApi, PrintableFormChannelsApi, ServiceLocationChannelsApi, ServicesApi, SettingsApi, TilesApi, WebPageChannelsApi) {
  'use strict';

  /**
   * Solution_to_combine_municipality_services_under_single_API_.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var KuntaApiClient = require('index'); // See note below*.
   * var xxxSvc = new KuntaApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new KuntaApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new KuntaApiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new KuntaApiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.39
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The Address model constructor.
     * @property {module:model/Address}
     */
    Address: Address,
    /**
     * The Announcement model constructor.
     * @property {module:model/Announcement}
     */
    Announcement: Announcement,
    /**
     * The Attachment model constructor.
     * @property {module:model/Attachment}
     */
    Attachment: Attachment,
    /**
     * The BadRequest model constructor.
     * @property {module:model/BadRequest}
     */
    BadRequest: BadRequest,
    /**
     * The Banner model constructor.
     * @property {module:model/Banner}
     */
    Banner: Banner,
    /**
     * The Contact model constructor.
     * @property {module:model/Contact}
     */
    Contact: Contact,
    /**
     * The ContactPhone model constructor.
     * @property {module:model/ContactPhone}
     */
    ContactPhone: ContactPhone,
    /**
     * The ContactStatus model constructor.
     * @property {module:model/ContactStatus}
     */
    ContactStatus: ContactStatus,
    /**
     * The ElectronicChannel model constructor.
     * @property {module:model/ElectronicChannel}
     */
    ElectronicChannel: ElectronicChannel,
    /**
     * The Event model constructor.
     * @property {module:model/Event}
     */
    Event: Event,
    /**
     * The FileDef model constructor.
     * @property {module:model/FileDef}
     */
    FileDef: FileDef,
    /**
     * The Forbidden model constructor.
     * @property {module:model/Forbidden}
     */
    Forbidden: Forbidden,
    /**
     * The Fragment model constructor.
     * @property {module:model/Fragment}
     */
    Fragment: Fragment,
    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError: InternalServerError,
    /**
     * The Job model constructor.
     * @property {module:model/Job}
     */
    Job: Job,
    /**
     * The LocalizedValue model constructor.
     * @property {module:model/LocalizedValue}
     */
    LocalizedValue: LocalizedValue,
    /**
     * The Menu model constructor.
     * @property {module:model/Menu}
     */
    Menu: Menu,
    /**
     * The MenuItem model constructor.
     * @property {module:model/MenuItem}
     */
    MenuItem: MenuItem,
    /**
     * The NewsArticle model constructor.
     * @property {module:model/NewsArticle}
     */
    NewsArticle: NewsArticle,
    /**
     * The NotFound model constructor.
     * @property {module:model/NotFound}
     */
    NotFound: NotFound,
    /**
     * The NotImplemented model constructor.
     * @property {module:model/NotImplemented}
     */
    NotImplemented: NotImplemented,
    /**
     * The OntologyItem model constructor.
     * @property {module:model/OntologyItem}
     */
    OntologyItem: OntologyItem,
    /**
     * The Organization model constructor.
     * @property {module:model/Organization}
     */
    Organization: Organization,
    /**
     * The OrganizationService model constructor.
     * @property {module:model/OrganizationService}
     */
    OrganizationService: OrganizationService,
    /**
     * The OrganizationSetting model constructor.
     * @property {module:model/OrganizationSetting}
     */
    OrganizationSetting: OrganizationSetting,
    /**
     * The Page model constructor.
     * @property {module:model/Page}
     */
    Page: Page,
    /**
     * The PageMeta model constructor.
     * @property {module:model/PageMeta}
     */
    PageMeta: PageMeta,
    /**
     * The PhoneChannel model constructor.
     * @property {module:model/PhoneChannel}
     */
    PhoneChannel: PhoneChannel,
    /**
     * The PrintableFormChannel model constructor.
     * @property {module:model/PrintableFormChannel}
     */
    PrintableFormChannel: PrintableFormChannel,
    /**
     * The Service model constructor.
     * @property {module:model/Service}
     */
    Service: Service,
    /**
     * The ServiceChannelAttachment model constructor.
     * @property {module:model/ServiceChannelAttachment}
     */
    ServiceChannelAttachment: ServiceChannelAttachment,
    /**
     * The ServiceHour model constructor.
     * @property {module:model/ServiceHour}
     */
    ServiceHour: ServiceHour,
    /**
     * The ServiceLocationChannel model constructor.
     * @property {module:model/ServiceLocationChannel}
     */
    ServiceLocationChannel: ServiceLocationChannel,
    /**
     * The SupportContact model constructor.
     * @property {module:model/SupportContact}
     */
    SupportContact: SupportContact,
    /**
     * The Tile model constructor.
     * @property {module:model/Tile}
     */
    Tile: Tile,
    /**
     * The WebPage model constructor.
     * @property {module:model/WebPage}
     */
    WebPage: WebPage,
    /**
     * The WebPageChannel model constructor.
     * @property {module:model/WebPageChannel}
     */
    WebPageChannel: WebPageChannel,
    /**
     * The AnnouncementsApi service constructor.
     * @property {module:api/AnnouncementsApi}
     */
    AnnouncementsApi: AnnouncementsApi,
    /**
     * The BannersApi service constructor.
     * @property {module:api/BannersApi}
     */
    BannersApi: BannersApi,
    /**
     * The ContactsApi service constructor.
     * @property {module:api/ContactsApi}
     */
    ContactsApi: ContactsApi,
    /**
     * The ElectronicChannelsApi service constructor.
     * @property {module:api/ElectronicChannelsApi}
     */
    ElectronicChannelsApi: ElectronicChannelsApi,
    /**
     * The EventsApi service constructor.
     * @property {module:api/EventsApi}
     */
    EventsApi: EventsApi,
    /**
     * The FilesApi service constructor.
     * @property {module:api/FilesApi}
     */
    FilesApi: FilesApi,
    /**
     * The FragmentsApi service constructor.
     * @property {module:api/FragmentsApi}
     */
    FragmentsApi: FragmentsApi,
    /**
     * The JobsApi service constructor.
     * @property {module:api/JobsApi}
     */
    JobsApi: JobsApi,
    /**
     * The MenusApi service constructor.
     * @property {module:api/MenusApi}
     */
    MenusApi: MenusApi,
    /**
     * The NewsApi service constructor.
     * @property {module:api/NewsApi}
     */
    NewsApi: NewsApi,
    /**
     * The OrganizationServicesApi service constructor.
     * @property {module:api/OrganizationServicesApi}
     */
    OrganizationServicesApi: OrganizationServicesApi,
    /**
     * The OrganizationsApi service constructor.
     * @property {module:api/OrganizationsApi}
     */
    OrganizationsApi: OrganizationsApi,
    /**
     * The PagesApi service constructor.
     * @property {module:api/PagesApi}
     */
    PagesApi: PagesApi,
    /**
     * The PhoneChannelsApi service constructor.
     * @property {module:api/PhoneChannelsApi}
     */
    PhoneChannelsApi: PhoneChannelsApi,
    /**
     * The PrintableFormChannelsApi service constructor.
     * @property {module:api/PrintableFormChannelsApi}
     */
    PrintableFormChannelsApi: PrintableFormChannelsApi,
    /**
     * The ServiceLocationChannelsApi service constructor.
     * @property {module:api/ServiceLocationChannelsApi}
     */
    ServiceLocationChannelsApi: ServiceLocationChannelsApi,
    /**
     * The ServicesApi service constructor.
     * @property {module:api/ServicesApi}
     */
    ServicesApi: ServicesApi,
    /**
     * The SettingsApi service constructor.
     * @property {module:api/SettingsApi}
     */
    SettingsApi: SettingsApi,
    /**
     * The TilesApi service constructor.
     * @property {module:api/TilesApi}
     */
    TilesApi: TilesApi,
    /**
     * The WebPageChannelsApi service constructor.
     * @property {module:api/WebPageChannelsApi}
     */
    WebPageChannelsApi: WebPageChannelsApi
  };

  return exports;
}));
