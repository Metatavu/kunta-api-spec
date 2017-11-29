package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.OrganizationSetting;
import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;
import fi.metatavu.kuntaapi.server.rest.model.Organization;
import fi.metatavu.kuntaapi.server.rest.model.Announcement;
import fi.metatavu.kuntaapi.server.rest.model.NewsArticle;
import fi.metatavu.kuntaapi.server.rest.model.Attachment;
import fi.metatavu.kuntaapi.server.rest.model.Contact;
import fi.metatavu.kuntaapi.server.rest.model.Emergency;
import fi.metatavu.kuntaapi.server.rest.model.Event;
import fi.metatavu.kuntaapi.server.rest.model.FileDef;
import fi.metatavu.kuntaapi.server.rest.model.Fragment;
import fi.metatavu.kuntaapi.server.rest.model.Incident;
import fi.metatavu.kuntaapi.server.rest.model.Job;
import fi.metatavu.kuntaapi.server.rest.model.Menu;
import fi.metatavu.kuntaapi.server.rest.model.MenuItem;
import fi.metatavu.kuntaapi.server.rest.model.Page;
import fi.metatavu.kuntaapi.server.rest.model.LocalizedValue;
import fi.metatavu.kuntaapi.server.rest.model.Agency;
import fi.metatavu.kuntaapi.server.rest.model.Route;
import fi.metatavu.kuntaapi.server.rest.model.Schedule;
import fi.metatavu.kuntaapi.server.rest.model.Stop;
import fi.metatavu.kuntaapi.server.rest.model.StopTime;
import fi.metatavu.kuntaapi.server.rest.model.Trip;
import fi.metatavu.kuntaapi.server.rest.model.Shortlink;
import fi.metatavu.kuntaapi.server.rest.model.Tile;
import fi.metatavu.kuntaapi.server.rest.model.Banner;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/organizations")

@Api(description = "the organizations API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-11-29T06:12:35.775+02:00")

public abstract class OrganizationsApi extends AbstractApi {

    @POST
    @Path("/{organizationId}/settings/")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Creates organization setting", notes = "Creates organization setting ", response = OrganizationSetting.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Settings",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns create organization setting", response = OrganizationSetting.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationSetting.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationSetting.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationSetting.class) })
    public abstract Response createOrganizationSetting(@PathParam("organizationId") String organizationId,OrganizationSetting setting,@Context Request request);

    @DELETE
    @Path("/{organizationId}/files/{fileId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Deletes an organization file", notes = "Deletes single organization file ", response = void.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Files",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful removal", response = void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = void.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = void.class),
        @ApiResponse(code = 500, message = "Internal server error", response = void.class) })
    public abstract Response deleteOrganizationFile(@PathParam("organizationId") String organizationId,@PathParam("fileId") String fileId,@Context Request request);

    @DELETE
    @Path("/{organizationId}/pages/{pageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Deletes an organizations page", notes = "Deletes single organization page ", response = void.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful removal", response = void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = void.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = void.class),
        @ApiResponse(code = 500, message = "Internal server error", response = void.class) })
    public abstract Response deleteOrganizationPage(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@Context Request request);

    @DELETE
    @Path("/{organizationId}/settings/{settingId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Deletes an organization setting", notes = "Deletes an organization setting ", response = void.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Settings",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful removal", response = void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = void.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = void.class),
        @ApiResponse(code = 500, message = "Internal server error", response = void.class) })
    public abstract Response deleteOrganizationSetting(@PathParam("organizationId") String organizationId,@PathParam("settingId") String settingId,@Context Request request);

    @GET
    @Path("/{organizationId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Find organization", notes = "Find organization", response = Organization.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response findOrganization(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/announcements/{announcementId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds an organizations announcement", notes = "Finds organization's single announcement ", response = Announcement.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Announcements",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single announcement", response = Announcement.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Announcement.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Announcement.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Announcement.class) })
    public abstract Response findOrganizationAnnouncement(@PathParam("organizationId") String organizationId,@PathParam("announcementId") String announcementId,@Context Request request);

    @GET
    @Path("/{organizationId}/banners/{bannerId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations banner", notes = "Finds single organization banner ", response = NewsArticle.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization banner", response = NewsArticle.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class) })
    public abstract Response findOrganizationBanner(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@Context Request request);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a single organiztion banner image", notes = "Returns a single organiztion banner image ", response = Attachment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization banner image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationBannerImage(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@PathParam("imageId") String imageId,@Context Request request);

    @GET
    @Path("/{organizationId}/contacts/{contactId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds an organizations contact", notes = "Finds organization's single contact ", response = Contact.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Contacts",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single contact", response = Contact.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Contact.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Contact.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Contact.class) })
    public abstract Response findOrganizationContact(@PathParam("organizationId") String organizationId,@PathParam("contactId") String contactId,@Context Request request);

    @GET
    @Path("/{organizationId}/emergencies/{emergencyId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns organizations emergency by id", notes = "Returns organizations emergency by id ", response = Emergency.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Emergencies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single emergency", response = Emergency.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Emergency.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Emergency.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Emergency.class) })
    public abstract Response findOrganizationEmergency(@PathParam("organizationId") String organizationId,@PathParam("emergencyId") String emergencyId,@Context Request request);

    @GET
    @Path("/{organizationId}/events/{eventId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns organizations event by id", notes = "Returns organizations event by id ", response = Event.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single event", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Event.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Event.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Event.class) })
    public abstract Response findOrganizationEvent(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@Context Request request);

    @GET
    @Path("/{organizationId}/events/{eventId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns an event image", notes = "Returns an event image  ", response = Attachment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an event image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationEventImage(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@PathParam("imageId") String imageId,@Context Request request);

    @GET
    @Path("/{organizationId}/files/{fileId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations file", notes = "Finds single organization file ", response = FileDef.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Files",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization file", response = FileDef.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = FileDef.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = FileDef.class),
        @ApiResponse(code = 500, message = "Internal server error", response = FileDef.class) })
    public abstract Response findOrganizationFile(@PathParam("organizationId") String organizationId,@PathParam("fileId") String fileId,@Context Request request);

    @GET
    @Path("/{organizationId}/fragments/{fragmentId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations page fragment", notes = "Finds single organization page fragment ", response = Fragment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Fragments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization page fragment", response = Fragment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Fragment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Fragment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Fragment.class) })
    public abstract Response findOrganizationFragment(@PathParam("organizationId") String organizationId,@PathParam("fragmentId") String fragmentId,@Context Request request);

    @GET
    @Path("/{organizationId}/incidents/{incidentId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns organizations incident by id", notes = "Returns organizations incident by id ", response = Incident.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Incidents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single incident", response = Incident.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Incident.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Incident.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Incident.class) })
    public abstract Response findOrganizationIncident(@PathParam("organizationId") String organizationId,@PathParam("incidentId") String incidentId,@Context Request request);

    @GET
    @Path("/{organizationId}/jobs/{jobId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations job", notes = "Finds single organization job ", response = Job.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization job", response = Job.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Job.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Job.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Job.class) })
    public abstract Response findOrganizationJob(@PathParam("organizationId") String organizationId,@PathParam("jobId") String jobId,@Context Request request);

    @GET
    @Path("/{organizationId}/menus/{menuId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations menu", notes = "Finds single organization menu ", response = Menu.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Menus",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization menu", response = Menu.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Menu.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Menu.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Menu.class) })
    public abstract Response findOrganizationMenu(@PathParam("organizationId") String organizationId,@PathParam("menuId") String menuId,@Context Request request);

    @GET
    @Path("/{organizationId}/menus/{menuId}/items/{menuItemId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organization menu item", notes = "Finds single organization menu item ", response = MenuItem.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Menus",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization menu item", response = MenuItem.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = MenuItem.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = MenuItem.class),
        @ApiResponse(code = 500, message = "Internal server error", response = MenuItem.class) })
    public abstract Response findOrganizationMenuItem(@PathParam("organizationId") String organizationId,@PathParam("menuId") String menuId,@PathParam("menuItemId") String menuItemId,@Context Request request);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations news article", notes = "Finds organizations single news article ", response = NewsArticle.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single news article", response = NewsArticle.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class) })
    public abstract Response findOrganizationNewsArticle(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@Context Request request);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns an news article image", notes = "Returns an news article image ", response = Attachment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an news article image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationNewsArticleImage(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@PathParam("imageId") String imageId,@Context Request request);

    @GET
    @Path("/{organizationId}/pages/{pageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations page", notes = "Finds single organization page ", response = Page.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization page", response = Page.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Page.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Page.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Page.class) })
    public abstract Response findOrganizationPage(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@Context Request request);

    @GET
    @Path("/{organizationId}/pages/{pageId}/content")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns organizations page content in all available languages", notes = "Returns single organization page content in all available languages ", response = LocalizedValue.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns single page content in all available languages", response = LocalizedValue.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = LocalizedValue.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = LocalizedValue.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = LocalizedValue.class, responseContainer = "List") })
    public abstract Response findOrganizationPageContent(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@Context Request request);

    @GET
    @Path("/{organizationId}/pages/{pageId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a single organiztion page image", notes = "Returns a single organiztion page image ", response = Attachment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization page image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationPageImage(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@PathParam("imageId") String imageId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportAgencies/{agencyId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds an organizations public transport agency", notes = "Finds organization's single public transport agency ", response = Agency.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single public transport agency", response = Agency.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Agency.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Agency.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Agency.class) })
    public abstract Response findOrganizationPublicTransportAgency(@PathParam("organizationId") String organizationId,@PathParam("agencyId") String agencyId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportRoutes/{routeId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds an organizations public transport route", notes = "Finds organization's single public transport route ", response = Route.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single public transport route", response = Route.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Route.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Route.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Route.class) })
    public abstract Response findOrganizationPublicTransportRoute(@PathParam("organizationId") String organizationId,@PathParam("routeId") String routeId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportSchedules/{scheduleId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations public transport schedule", notes = "Finds organizations public transport schedule ", response = Schedule.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returns an organizations public transport schedule", response = Schedule.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Schedule.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Schedule.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Schedule.class) })
    public abstract Response findOrganizationPublicTransportSchedule(@PathParam("organizationId") String organizationId,@PathParam("scheduleId") String scheduleId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportStops/{stopId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a stop of organizations public transport route", notes = "Finds a stop of organizations public transport route ", response = Stop.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returns organizations public transport route stop", response = Stop.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Stop.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Stop.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Stop.class) })
    public abstract Response findOrganizationPublicTransportStop(@PathParam("organizationId") String organizationId,@PathParam("stopId") String stopId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportStopTimes/{stopTimeId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations public transport stopTime", notes = "Finds organizations public transport stopTime ", response = StopTime.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returns an organizations public transport stopTime", response = StopTime.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = StopTime.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = StopTime.class),
        @ApiResponse(code = 500, message = "Internal server error", response = StopTime.class) })
    public abstract Response findOrganizationPublicTransportStopTime(@PathParam("organizationId") String organizationId,@PathParam("stopTimeId") String stopTimeId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportTrips/{tripId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations public transport trip", notes = "Finds organizations public transport trip ", response = Trip.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returns an organizations public transport trip", response = Trip.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Trip.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Trip.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Trip.class) })
    public abstract Response findOrganizationPublicTransportTrip(@PathParam("organizationId") String organizationId,@PathParam("tripId") String tripId,@Context Request request);

    @GET
    @Path("/{organizationId}/settings/{settingId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations setting", notes = "Finds single organization setting ", response = OrganizationSetting.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Settings",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization setting", response = OrganizationSetting.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationSetting.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationSetting.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationSetting.class) })
    public abstract Response findOrganizationSetting(@PathParam("organizationId") String organizationId,@PathParam("settingId") String settingId,@Context Request request);

    @GET
    @Path("/{organizationId}/shortlinks/{shortlinkId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organization shortlink", notes = "Finds single organization shortlink ", response = Shortlink.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Shortlinks",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization shortlink", response = Shortlink.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Shortlink.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Shortlink.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Shortlink.class) })
    public abstract Response findOrganizationShortlink(@PathParam("organizationId") String organizationId,@PathParam("shortlinkId") String shortlinkId,@Context Request request);

    @GET
    @Path("/{organizationId}/tiles/{tileId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations tile", notes = "Finds single organization tile ", response = Tile.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization tile", response = Tile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Tile.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Tile.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Tile.class) })
    public abstract Response findOrganizationTile(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@Context Request request);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a single organiztion tile image", notes = "Returns a single organiztion tile image ", response = Attachment.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization tile image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationTileImage(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@PathParam("imageId") String imageId,@Context Request request);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization banner image data", notes = "Returns an organization banner image data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization banner image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationBannerImageData(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size,@Context Request request);

    @GET
    @Path("/{organizationId}/events/{eventId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an event image data", notes = "Returns an event image data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an event image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationEventImageData(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size,@Context Request request);

    @GET
    @Path("/{organizationId}/files/{fileId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization file data", notes = "Returns an organization file data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Files",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization file data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationFileData(@PathParam("organizationId") String organizationId,@PathParam("fileId") String fileId,@Context Request request);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns a news article image data", notes = "Returns a news article image data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a news article image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationNewsArticleImageData(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size,@Context Request request);

    @GET
    @Path("/{organizationId}/pages/{pageId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization page image data", notes = "Returns an organization page image data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization page image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationPageImageData(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size,@Context Request request);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization tile image data", notes = "Returns an organization tile image data ", response = byte[].class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization tile image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationTileImageData(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size,@Context Request request);

    @GET
    @Path("/{organizationId}/announcements")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations announcements", notes = "Lists organizations announcements ", response = Announcement.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Announcements",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of announcements", response = Announcement.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Announcement.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Announcement.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Announcement.class, responseContainer = "List") })
    public abstract Response listOrganizationAnnouncements(@PathParam("organizationId") String organizationId,@QueryParam("slug") String slug,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@Context Request request);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a list of organization banner images", notes = "Returns a list of organization banner images ", response = Attachment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of organization banner images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationBannerImages(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@Context Request request);

    @GET
    @Path("/{organizationId}/banners")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations banners", notes = "Lists organizations banners ", response = Banner.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of banners", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Banner.class, responseContainer = "List") })
    public abstract Response listOrganizationBanners(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/contacts")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations contacts", notes = "Lists organizations contacts ", response = Contact.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Contacts",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of contacts", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Contact.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Contact.class, responseContainer = "List") })
    public abstract Response listOrganizationContacts(@PathParam("organizationId") String organizationId,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/emergencies")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations emergencies", notes = "Lists organizations emergencies ", response = Emergency.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Emergencies",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of emergencies", response = Emergency.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Emergency.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Emergency.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Emergency.class, responseContainer = "List") })
    public abstract Response listOrganizationEmergencies(@PathParam("organizationId") String organizationId,@QueryParam("location") String location,@QueryParam("before") String before,@QueryParam("after") String after,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@QueryParam("orderBy") String orderBy,@QueryParam("orderDir") String orderDir,@Context Request request);

    @GET
    @Path("/{organizationId}/events/{eventId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns list of event images", notes = "Returns list of event images ", response = Attachment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of event images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationEventImages(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@Context Request request);

    @GET
    @Path("/{organizationId}/events")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations events", notes = "Lists organizations events ", response = Event.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of events", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Event.class, responseContainer = "List") })
    public abstract Response listOrganizationEvents(@PathParam("organizationId") String organizationId,@QueryParam("startBefore") String startBefore,@QueryParam("startAfter") String startAfter,@QueryParam("endBefore") String endBefore,@QueryParam("endAfter") String endAfter,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@QueryParam("orderBy") String orderBy,@QueryParam("orderDir") String orderDir,@Context Request request);

    @GET
    @Path("/{organizationId}/files")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations files", notes = "Lists organizations files ", response = FileDef.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Files",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organizations files", response = FileDef.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = FileDef.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = FileDef.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = FileDef.class, responseContainer = "List") })
    public abstract Response listOrganizationFiles(@PathParam("organizationId") String organizationId,@QueryParam("pageId") String pageId,@QueryParam("search") String search,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/fragments")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations page fragments", notes = "Lists organizations page fragments ", response = Fragment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Fragments",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of page fragments", response = Fragment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Fragment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Fragment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Fragment.class, responseContainer = "List") })
    public abstract Response listOrganizationFragments(@PathParam("organizationId") String organizationId,@QueryParam("slug") String slug,@Context Request request);

    @GET
    @Path("/{organizationId}/incidents")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations incidents", notes = "Lists organizations incidents ", response = Incident.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Incidents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of incidents", response = Incident.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Incident.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Incident.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Incident.class, responseContainer = "List") })
    public abstract Response listOrganizationIncidents(@PathParam("organizationId") String organizationId,@QueryParam("slug") String slug,@QueryParam("startBefore") String startBefore,@QueryParam("endAfter") String endAfter,@QueryParam("area") Integer area,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@QueryParam("orderBy") String orderBy,@QueryParam("orderDir") String orderDir,@Context Request request);

    @GET
    @Path("/{organizationId}/jobs")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations jobs", notes = "Lists organizations jobs ", response = Job.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Jobs",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organizations jobs", response = Job.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Job.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Job.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Job.class, responseContainer = "List") })
    public abstract Response listOrganizationJobs(@PathParam("organizationId") String organizationId,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/menus/{menuId}/items")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations menu items", notes = "Lists organization menu items ", response = MenuItem.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Menus",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organizations menu items", response = MenuItem.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = MenuItem.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = MenuItem.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = MenuItem.class, responseContainer = "List") })
    public abstract Response listOrganizationMenuItems(@PathParam("organizationId") String organizationId,@PathParam("menuId") String menuId,@Context Request request);

    @GET
    @Path("/{organizationId}/menus")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations menus", notes = "Lists organizations menus ", response = Menu.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Menus",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organizations menus", response = Menu.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Menu.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Menu.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Menu.class, responseContainer = "List") })
    public abstract Response listOrganizationMenus(@PathParam("organizationId") String organizationId,@QueryParam("slug") String slug,@Context Request request);

    @GET
    @Path("/{organizationId}/news")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations news", notes = "Lists organizations news ", response = NewsArticle.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of news", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class, responseContainer = "List") })
    public abstract Response listOrganizationNews(@PathParam("organizationId") String organizationId,@QueryParam("slug") String slug,@QueryParam("tag") String tag,@QueryParam("publishedBefore") String publishedBefore,@QueryParam("publishedAfter") String publishedAfter,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns list of news article images", notes = "Returns list of news article images ", response = Attachment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a news article images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationNewsArticleImages(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@Context Request request);

    @GET
    @Path("/{organizationId}/pages/{pageId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a list of organization page images", notes = "Returns a list of organization page images ", response = Attachment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of organization page images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationPageImages(@PathParam("organizationId") String organizationId,@PathParam("pageId") String pageId,@QueryParam("type") String type,@Context Request request);

    @GET
    @Path("/{organizationId}/pages")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations pages", notes = "Lists organizations pages ", response = Page.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of pages", response = Page.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Page.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Page.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Page.class, responseContainer = "List") })
    public abstract Response listOrganizationPages(@PathParam("organizationId") String organizationId,@QueryParam("parentId") String parentId,@QueryParam("path") String path,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/transportAgencies")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations public transport agencies", notes = "Lists organizations public transport agencies ", response = Agency.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of public transport agencies", response = Agency.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Agency.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Agency.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Agency.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportAgencies(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportRoutes")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations public transport routes", notes = "Lists organizations public transport routes ", response = Route.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of public transport routes", response = Route.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Route.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Route.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Route.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportRoutes(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportSchedules")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists schedules of organization's public transport schedules", notes = "Lists schedules of organization's public transport schedules ", response = Schedule.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organization's public transport schedules", response = Schedule.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Schedule.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Schedule.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Schedule.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportSchedules(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportStopTimes")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists stopTimes of organization's public transport stopTimes", notes = "Lists stopTimes of organization's public transport stopTimes ", response = StopTime.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organization's public transport stopTimes", response = StopTime.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = StopTime.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = StopTime.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = StopTime.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportStopTimes(@PathParam("organizationId") String organizationId,@QueryParam("stopId") String stopId,@QueryParam("departureTime") Integer departureTime,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/transportStops")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations public transport stops", notes = "Lists organizations public transport stops ", response = Stop.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of public transport stops", response = Stop.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Stop.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Stop.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Stop.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportStops(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/transportTrips")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists trips of organization's public transport trips", notes = "Lists trips of organization's public transport trips ", response = Trip.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Public transport",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of organization's public transport trips", response = Trip.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Trip.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Trip.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Trip.class, responseContainer = "List") })
    public abstract Response listOrganizationPublicTransportTrips(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    @Path("/{organizationId}/settings/")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations settings", notes = "Lists organizations settings ", response = OrganizationSetting.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Settings",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of settings", response = OrganizationSetting.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationSetting.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationSetting.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationSetting.class, responseContainer = "List") })
    public abstract Response listOrganizationSettings(@PathParam("organizationId") String organizationId,@QueryParam("key") String key,@Context Request request);

    @GET
    @Path("/{organizationId}/shortlinks")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations shortlinks", notes = "Lists organizations shortlinks ", response = Shortlink.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Shortlinks",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of shortlinks", response = Shortlink.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Shortlink.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Shortlink.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Shortlink.class, responseContainer = "List") })
    public abstract Response listOrganizationShortlinks(@PathParam("organizationId") String organizationId,@QueryParam("path") String path,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a list of organization tile images", notes = "Returns a list of organization tile images ", response = Attachment.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of organization tile images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationTileImages(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@Context Request request);

    @GET
    @Path("/{organizationId}/tiles")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations tiles", notes = "Lists organizations tiles ", response = Tile.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of tiles", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Tile.class, responseContainer = "List") })
    public abstract Response listOrganizationTiles(@PathParam("organizationId") String organizationId,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "List organizations", notes = "List organizations", response = Organization.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of organizations", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class, responseContainer = "List") })
    public abstract Response listOrganizations(@QueryParam("businessName") String businessName,@QueryParam("businessCode") String businessCode,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @PUT
    @Path("/{organizationId}/settings/{settingId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates an organization setting", notes = "Updates an organization setting ", response = OrganizationSetting.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Settings" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single an updated organization setting", response = OrganizationSetting.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationSetting.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationSetting.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationSetting.class) })
    public abstract Response updateOrganizationSetting(@PathParam("organizationId") String organizationId,@PathParam("settingId") String settingId,OrganizationSetting setting,@Context Request request);

}

