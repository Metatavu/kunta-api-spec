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
    define(['ApiClient', 'model/Address', 'model/Agency', 'model/Announcement', 'model/Area', 'model/Attachment', 'model/BadRequest', 'model/Banner', 'model/Code', 'model/CodeExtra', 'model/Contact', 'model/ContactPhone', 'model/ContactStatus', 'model/DailyOpeningTime', 'model/ElectronicServiceChannel', 'model/Email', 'model/Emergency', 'model/EmergencySource', 'model/Event', 'model/FileDef', 'model/Forbidden', 'model/Fragment', 'model/Incident', 'model/InternalServerError', 'model/Job', 'model/Law', 'model/LocalizedValue', 'model/Menu', 'model/MenuItem', 'model/Municipality', 'model/NameTypeByLanguage', 'model/NewsArticle', 'model/NotFound', 'model/NotImplemented', 'model/OntologyItem', 'model/Organization', 'model/OrganizationService', 'model/OrganizationSetting', 'model/Page', 'model/PageMeta', 'model/Phone', 'model/PhoneServiceChannel', 'model/PrintableFormServiceChannel', 'model/Route', 'model/Schedule', 'model/ScheduleException', 'model/Service', 'model/ServiceChannelAttachment', 'model/ServiceHour', 'model/ServiceLocationServiceChannel', 'model/ServiceOrganization', 'model/Shortlink', 'model/Stop', 'model/StopTime', 'model/Tile', 'model/Trip', 'model/WebPage', 'model/WebPageServiceChannel', 'api/AnnouncementsApi', 'api/BannersApi', 'api/CodesApi', 'api/ContactsApi', 'api/ElectronicChannelsApi', 'api/ElectronicServiceChannelsApi', 'api/EmergenciesApi', 'api/EventsApi', 'api/FilesApi', 'api/FragmentsApi', 'api/IncidentsApi', 'api/JobsApi', 'api/MenusApi', 'api/NewsApi', 'api/OrganizationsApi', 'api/PagesApi', 'api/PhoneChannelsApi', 'api/PhoneServiceChannelsApi', 'api/PrintableFormChannelsApi', 'api/PrintableFormServiceChannelsApi', 'api/PublicTransportApi', 'api/ServiceChannelsApi', 'api/ServiceLocationChannelsApi', 'api/ServiceLocationServiceChannelsApi', 'api/ServicesApi', 'api/SettingsApi', 'api/ShortlinksApi', 'api/TilesApi', 'api/WebPageChannelsApi', 'api/WebPageServiceChannelsApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/Address'), require('./model/Agency'), require('./model/Announcement'), require('./model/Area'), require('./model/Attachment'), require('./model/BadRequest'), require('./model/Banner'), require('./model/Code'), require('./model/CodeExtra'), require('./model/Contact'), require('./model/ContactPhone'), require('./model/ContactStatus'), require('./model/DailyOpeningTime'), require('./model/ElectronicServiceChannel'), require('./model/Email'), require('./model/Emergency'), require('./model/EmergencySource'), require('./model/Event'), require('./model/FileDef'), require('./model/Forbidden'), require('./model/Fragment'), require('./model/Incident'), require('./model/InternalServerError'), require('./model/Job'), require('./model/Law'), require('./model/LocalizedValue'), require('./model/Menu'), require('./model/MenuItem'), require('./model/Municipality'), require('./model/NameTypeByLanguage'), require('./model/NewsArticle'), require('./model/NotFound'), require('./model/NotImplemented'), require('./model/OntologyItem'), require('./model/Organization'), require('./model/OrganizationService'), require('./model/OrganizationSetting'), require('./model/Page'), require('./model/PageMeta'), require('./model/Phone'), require('./model/PhoneServiceChannel'), require('./model/PrintableFormServiceChannel'), require('./model/Route'), require('./model/Schedule'), require('./model/ScheduleException'), require('./model/Service'), require('./model/ServiceChannelAttachment'), require('./model/ServiceHour'), require('./model/ServiceLocationServiceChannel'), require('./model/ServiceOrganization'), require('./model/Shortlink'), require('./model/Stop'), require('./model/StopTime'), require('./model/Tile'), require('./model/Trip'), require('./model/WebPage'), require('./model/WebPageServiceChannel'), require('./api/AnnouncementsApi'), require('./api/BannersApi'), require('./api/CodesApi'), require('./api/ContactsApi'), require('./api/ElectronicChannelsApi'), require('./api/ElectronicServiceChannelsApi'), require('./api/EmergenciesApi'), require('./api/EventsApi'), require('./api/FilesApi'), require('./api/FragmentsApi'), require('./api/IncidentsApi'), require('./api/JobsApi'), require('./api/MenusApi'), require('./api/NewsApi'), require('./api/OrganizationsApi'), require('./api/PagesApi'), require('./api/PhoneChannelsApi'), require('./api/PhoneServiceChannelsApi'), require('./api/PrintableFormChannelsApi'), require('./api/PrintableFormServiceChannelsApi'), require('./api/PublicTransportApi'), require('./api/ServiceChannelsApi'), require('./api/ServiceLocationChannelsApi'), require('./api/ServiceLocationServiceChannelsApi'), require('./api/ServicesApi'), require('./api/SettingsApi'), require('./api/ShortlinksApi'), require('./api/TilesApi'), require('./api/WebPageChannelsApi'), require('./api/WebPageServiceChannelsApi'));
  }
}(function(ApiClient, Address, Agency, Announcement, Area, Attachment, BadRequest, Banner, Code, CodeExtra, Contact, ContactPhone, ContactStatus, DailyOpeningTime, ElectronicServiceChannel, Email, Emergency, EmergencySource, Event, FileDef, Forbidden, Fragment, Incident, InternalServerError, Job, Law, LocalizedValue, Menu, MenuItem, Municipality, NameTypeByLanguage, NewsArticle, NotFound, NotImplemented, OntologyItem, Organization, OrganizationService, OrganizationSetting, Page, PageMeta, Phone, PhoneServiceChannel, PrintableFormServiceChannel, Route, Schedule, ScheduleException, Service, ServiceChannelAttachment, ServiceHour, ServiceLocationServiceChannel, ServiceOrganization, Shortlink, Stop, StopTime, Tile, Trip, WebPage, WebPageServiceChannel, AnnouncementsApi, BannersApi, CodesApi, ContactsApi, ElectronicChannelsApi, ElectronicServiceChannelsApi, EmergenciesApi, EventsApi, FilesApi, FragmentsApi, IncidentsApi, JobsApi, MenusApi, NewsApi, OrganizationsApi, PagesApi, PhoneChannelsApi, PhoneServiceChannelsApi, PrintableFormChannelsApi, PrintableFormServiceChannelsApi, PublicTransportApi, ServiceChannelsApi, ServiceLocationChannelsApi, ServiceLocationServiceChannelsApi, ServicesApi, SettingsApi, ShortlinksApi, TilesApi, WebPageChannelsApi, WebPageServiceChannelsApi) {
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
   * @version 0.0.114
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
     * The Agency model constructor.
     * @property {module:model/Agency}
     */
    Agency: Agency,
    /**
     * The Announcement model constructor.
     * @property {module:model/Announcement}
     */
    Announcement: Announcement,
    /**
     * The Area model constructor.
     * @property {module:model/Area}
     */
    Area: Area,
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
     * The Code model constructor.
     * @property {module:model/Code}
     */
    Code: Code,
    /**
     * The CodeExtra model constructor.
     * @property {module:model/CodeExtra}
     */
    CodeExtra: CodeExtra,
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
     * The DailyOpeningTime model constructor.
     * @property {module:model/DailyOpeningTime}
     */
    DailyOpeningTime: DailyOpeningTime,
    /**
     * The ElectronicServiceChannel model constructor.
     * @property {module:model/ElectronicServiceChannel}
     */
    ElectronicServiceChannel: ElectronicServiceChannel,
    /**
     * The Email model constructor.
     * @property {module:model/Email}
     */
    Email: Email,
    /**
     * The Emergency model constructor.
     * @property {module:model/Emergency}
     */
    Emergency: Emergency,
    /**
     * The EmergencySource model constructor.
     * @property {module:model/EmergencySource}
     */
    EmergencySource: EmergencySource,
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
     * The Incident model constructor.
     * @property {module:model/Incident}
     */
    Incident: Incident,
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
     * The Law model constructor.
     * @property {module:model/Law}
     */
    Law: Law,
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
     * The Municipality model constructor.
     * @property {module:model/Municipality}
     */
    Municipality: Municipality,
    /**
     * The NameTypeByLanguage model constructor.
     * @property {module:model/NameTypeByLanguage}
     */
    NameTypeByLanguage: NameTypeByLanguage,
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
     * The Phone model constructor.
     * @property {module:model/Phone}
     */
    Phone: Phone,
    /**
     * The PhoneServiceChannel model constructor.
     * @property {module:model/PhoneServiceChannel}
     */
    PhoneServiceChannel: PhoneServiceChannel,
    /**
     * The PrintableFormServiceChannel model constructor.
     * @property {module:model/PrintableFormServiceChannel}
     */
    PrintableFormServiceChannel: PrintableFormServiceChannel,
    /**
     * The Route model constructor.
     * @property {module:model/Route}
     */
    Route: Route,
    /**
     * The Schedule model constructor.
     * @property {module:model/Schedule}
     */
    Schedule: Schedule,
    /**
     * The ScheduleException model constructor.
     * @property {module:model/ScheduleException}
     */
    ScheduleException: ScheduleException,
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
     * The ServiceLocationServiceChannel model constructor.
     * @property {module:model/ServiceLocationServiceChannel}
     */
    ServiceLocationServiceChannel: ServiceLocationServiceChannel,
    /**
     * The ServiceOrganization model constructor.
     * @property {module:model/ServiceOrganization}
     */
    ServiceOrganization: ServiceOrganization,
    /**
     * The Shortlink model constructor.
     * @property {module:model/Shortlink}
     */
    Shortlink: Shortlink,
    /**
     * The Stop model constructor.
     * @property {module:model/Stop}
     */
    Stop: Stop,
    /**
     * The StopTime model constructor.
     * @property {module:model/StopTime}
     */
    StopTime: StopTime,
    /**
     * The Tile model constructor.
     * @property {module:model/Tile}
     */
    Tile: Tile,
    /**
     * The Trip model constructor.
     * @property {module:model/Trip}
     */
    Trip: Trip,
    /**
     * The WebPage model constructor.
     * @property {module:model/WebPage}
     */
    WebPage: WebPage,
    /**
     * The WebPageServiceChannel model constructor.
     * @property {module:model/WebPageServiceChannel}
     */
    WebPageServiceChannel: WebPageServiceChannel,
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
     * The CodesApi service constructor.
     * @property {module:api/CodesApi}
     */
    CodesApi: CodesApi,
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
     * The ElectronicServiceChannelsApi service constructor.
     * @property {module:api/ElectronicServiceChannelsApi}
     */
    ElectronicServiceChannelsApi: ElectronicServiceChannelsApi,
    /**
     * The EmergenciesApi service constructor.
     * @property {module:api/EmergenciesApi}
     */
    EmergenciesApi: EmergenciesApi,
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
     * The IncidentsApi service constructor.
     * @property {module:api/IncidentsApi}
     */
    IncidentsApi: IncidentsApi,
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
     * The PhoneServiceChannelsApi service constructor.
     * @property {module:api/PhoneServiceChannelsApi}
     */
    PhoneServiceChannelsApi: PhoneServiceChannelsApi,
    /**
     * The PrintableFormChannelsApi service constructor.
     * @property {module:api/PrintableFormChannelsApi}
     */
    PrintableFormChannelsApi: PrintableFormChannelsApi,
    /**
     * The PrintableFormServiceChannelsApi service constructor.
     * @property {module:api/PrintableFormServiceChannelsApi}
     */
    PrintableFormServiceChannelsApi: PrintableFormServiceChannelsApi,
    /**
     * The PublicTransportApi service constructor.
     * @property {module:api/PublicTransportApi}
     */
    PublicTransportApi: PublicTransportApi,
    /**
     * The ServiceChannelsApi service constructor.
     * @property {module:api/ServiceChannelsApi}
     */
    ServiceChannelsApi: ServiceChannelsApi,
    /**
     * The ServiceLocationChannelsApi service constructor.
     * @property {module:api/ServiceLocationChannelsApi}
     */
    ServiceLocationChannelsApi: ServiceLocationChannelsApi,
    /**
     * The ServiceLocationServiceChannelsApi service constructor.
     * @property {module:api/ServiceLocationServiceChannelsApi}
     */
    ServiceLocationServiceChannelsApi: ServiceLocationServiceChannelsApi,
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
     * The ShortlinksApi service constructor.
     * @property {module:api/ShortlinksApi}
     */
    ShortlinksApi: ShortlinksApi,
    /**
     * The TilesApi service constructor.
     * @property {module:api/TilesApi}
     */
    TilesApi: TilesApi,
    /**
     * The WebPageChannelsApi service constructor.
     * @property {module:api/WebPageChannelsApi}
     */
    WebPageChannelsApi: WebPageChannelsApi,
    /**
     * The WebPageServiceChannelsApi service constructor.
     * @property {module:api/WebPageServiceChannelsApi}
     */
    WebPageServiceChannelsApi: WebPageServiceChannelsApi
  };

  return exports;
}));
