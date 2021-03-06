package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.WebPageServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;
import fi.metatavu.kuntaapi.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/webPageServiceChannels")

@Api(description = "the webPageServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-07-08T18:04:34.075+03:00")

public abstract class WebPageServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{webPageServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a web page service channel by id", notes = "Finds a web page service channel by id", response = WebPageServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "WebPageServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a web page service channel", response = WebPageServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageServiceChannel.class) })
    public abstract Response findWebPageServiceChannel(@PathParam("webPageServiceChannelId") String webPageServiceChannelId,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists web page service channels", notes = "Lists web page service channels", response = WebPageServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "WebPageServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of web page service channels", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageServiceChannel.class, responseContainer = "List") })
    public abstract Response listWebPageServiceChannels(@QueryParam("organizationId") String organizationId,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @PUT
    @Path("/{webPageServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates a channel", notes = "Updates a service channel", response = WebPageServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "WebPageServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated channel", response = WebPageServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageServiceChannel.class) })
    public abstract Response updateWebPageServiceChannel(@PathParam("webPageServiceChannelId") String webPageServiceChannelId,WebPageServiceChannel payload,@Context Request request);

}

