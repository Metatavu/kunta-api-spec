package fi.otavanopisto.kuntaapi.server.rest;

import fi.otavanopisto.kuntaapi.server.rest.model.BadRequest;
import fi.otavanopisto.kuntaapi.server.rest.model.OrganizationService;
import fi.otavanopisto.kuntaapi.server.rest.model.Organization;
import fi.otavanopisto.kuntaapi.server.rest.model.Forbidden;
import fi.otavanopisto.kuntaapi.server.rest.model.InternalServerError;
import fi.otavanopisto.kuntaapi.server.rest.model.NewsArticle;
import fi.otavanopisto.kuntaapi.server.rest.model.Attachment;
import fi.otavanopisto.kuntaapi.server.rest.model.Event;
import fi.otavanopisto.kuntaapi.server.rest.model.NotFound;
import fi.otavanopisto.kuntaapi.server.rest.model.Tile;
import fi.otavanopisto.kuntaapi.server.rest.model.Banner;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/organizations")

@Api(description = "the organizations API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-10-13T14:59:24.868+03:00")

public abstract class OrganizationsApi extends AbstractApi {

    @POST
    @Path("/{organizationId}/organizationServices")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create organization service", notes = "Create organization service", response = Organization.class, tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created organization service", response = Organization.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class) })
    public abstract Response createOrganizationService(@PathParam("organizationId") String organizationId,OrganizationService body);

    @GET
    @Path("/{organizationId}/banners/{bannerId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations banner", notes = "Finds single organization banner ", response = NewsArticle.class, tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization banner", response = NewsArticle.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class) })
    public abstract Response findOrganizationBanner(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a single organiztion banner image", notes = "Returns a single organiztion banner image ", response = Attachment.class, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization banner image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationBannerImage(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@PathParam("imageId") String imageId);

    @GET
    @Path("/{organizationId}/events/{eventId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns organizations event by id", notes = "Returns organizations event by id ", response = Event.class, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single event", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Event.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Event.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Event.class) })
    public abstract Response findOrganizationEvent(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId);

    @GET
    @Path("/{organizationId}/events/{eventId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns an event image", notes = "Returns an event image  ", response = Attachment.class, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an event image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationEventImage(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@PathParam("imageId") String imageId);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations news article", notes = "Finds organizations single news article ", response = NewsArticle.class, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single news article", response = NewsArticle.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class) })
    public abstract Response findOrganizationNewsArticle(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns an news article image", notes = "Returns an news article image ", response = Attachment.class, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an news article image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationNewsArticleImage(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@PathParam("imageId") String imageId);

    @GET
    @Path("/{organizationId}/organizationServices/{organizationServiceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a organization service by id", notes = "Find an organization service", response = OrganizationService.class, tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An organization service", response = OrganizationService.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class) })
    public abstract Response findOrganizationService(@PathParam("organizationId") String organizationId,@PathParam("organizationServiceId") String organizationServiceId);

    @GET
    @Path("/{organizationId}/tiles/{tileId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds organizations tile", notes = "Finds single organization tile ", response = Tile.class, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single organization tile", response = Tile.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Tile.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Tile.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Tile.class) })
    public abstract Response findOrganizationTile(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images/{imageId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a single organiztion tile image", notes = "Returns a single organiztion tile image ", response = Attachment.class, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization tile image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class) })
    public abstract Response findOrganizationTileImage(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@PathParam("imageId") String imageId);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization banner image data", notes = "Returns an organization banner image data ", response = byte[].class, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization banner image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationBannerImageData(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size);

    @GET
    @Path("/{organizationId}/events/{eventId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an event image data", notes = "Returns an event image data ", response = byte[].class, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an event image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationEventImageData(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns a news article image data", notes = "Returns a news article image data ", response = byte[].class, tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a news article image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationNewsArticleImageData(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images/{imageId}/data")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an organization tile image data", notes = "Returns an organization tile image data ", response = byte[].class, tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an organization tile image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = byte[].class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = byte[].class),
        @ApiResponse(code = 500, message = "Internal server error", response = byte[].class) })
    public abstract Response getOrganizationTileImageData(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId,@PathParam("imageId") String imageId,@QueryParam("size") Integer size);

    @GET
    @Path("/{organizationId}/banners/{bannerId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a list of organization banner images", notes = "Returns a list of organization banner images ", response = Attachment.class, responseContainer = "List", tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of organization banner images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationBannerImages(@PathParam("organizationId") String organizationId,@PathParam("bannerId") String bannerId);

    @GET
    @Path("/{organizationId}/banners")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations banners", notes = "Lists organizations banners ", response = Banner.class, responseContainer = "List", tags={ "Banners",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of banners", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Banner.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Banner.class, responseContainer = "List") })
    public abstract Response listOrganizationBanners(@PathParam("organizationId") String organizationId);

    @GET
    @Path("/{organizationId}/events/{eventId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns list of event images", notes = "Returns list of event images ", response = Attachment.class, responseContainer = "List", tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of event images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationEventImages(@PathParam("organizationId") String organizationId,@PathParam("eventId") String eventId);

    @GET
    @Path("/{organizationId}/events")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations events", notes = "Lists organizations events ", response = Event.class, responseContainer = "List", tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of events", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Event.class, responseContainer = "List") })
    public abstract Response listOrganizationEvents(@PathParam("organizationId") String organizationId,@QueryParam("startBefore") String startBefore,@QueryParam("startAfter") String startAfter,@QueryParam("endBefore") String endBefore,@QueryParam("endAfter") String endAfter,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults,@QueryParam("orderBy") String orderBy,@QueryParam("orderDir") String orderDir);

    @GET
    @Path("/{organizationId}/news")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations news", notes = "Lists organizations news ", response = NewsArticle.class, responseContainer = "List", tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of news", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = NewsArticle.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = NewsArticle.class, responseContainer = "List") })
    public abstract Response listOrganizationNews(@PathParam("organizationId") String organizationId,@QueryParam("publishedBefore") String publishedBefore,@QueryParam("publishedAfter") String publishedAfter,@QueryParam("firstResult") Integer firstResult,@QueryParam("maxResults") Integer maxResults);

    @GET
    @Path("/{organizationId}/news/{newsArticleId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns list of news article images", notes = "Returns list of news article images ", response = Attachment.class, responseContainer = "List", tags={ "News",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a news article images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationNewsArticleImages(@PathParam("organizationId") String organizationId,@PathParam("newsArticleId") String newsArticleId);

    @GET
    @Path("/{organizationId}/organizationServices")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Organization organization service list", notes = "Lists organization's organization services", response = OrganizationService.class, responseContainer = "List", tags={ "Organizations", "OrganizationServices",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of organization services", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class, responseContainer = "List") })
    public abstract Response listOrganizationOrganizationServices(@PathParam("organizationId") String organizationId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    @Path("/{organizationId}/tiles/{tileId}/images")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Returns a list of organization tile images", notes = "Returns a list of organization tile images ", response = Attachment.class, responseContainer = "List", tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of organization tile images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Attachment.class, responseContainer = "List") })
    public abstract Response listOrganizationTileImages(@PathParam("organizationId") String organizationId,@PathParam("tileId") String tileId);

    @GET
    @Path("/{organizationId}/tiles")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists organizations tiles", notes = "Lists organizations tiles ", response = Tile.class, responseContainer = "List", tags={ "Tiles",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of tiles", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Tile.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Tile.class, responseContainer = "List") })
    public abstract Response listOrganizationTiles(@PathParam("organizationId") String organizationId);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "List organizations", notes = "List organizations", response = Organization.class, responseContainer = "List", tags={ "Organizations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of organizations", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Organization.class, responseContainer = "List") })
    public abstract Response listOrganizations(@QueryParam("businessName") String businessName,@QueryParam("businessCode") String businessCode);

    @PUT
    @Path("/{organizationId}/organizationServices/{organizationServiceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates an organization service", notes = "Updates organization service", response = OrganizationService.class, tags={ "Organizations", "OrganizationServices" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An updated organization service", response = OrganizationService.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = OrganizationService.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = OrganizationService.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = OrganizationService.class),
        @ApiResponse(code = 500, message = "Internal server error", response = OrganizationService.class) })
    public abstract Response updateOrganizationService(@PathParam("organizationId") String organizationId,@PathParam("organizationServiceId") String organizationServiceId,OrganizationService body);

}

