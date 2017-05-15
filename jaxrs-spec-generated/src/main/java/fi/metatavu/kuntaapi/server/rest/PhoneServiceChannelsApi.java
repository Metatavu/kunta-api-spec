package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.PhoneServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;
import fi.metatavu.kuntaapi.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/phoneServiceChannels")

@Api(description = "the phoneServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-05-15T20:19:33.279+03:00")

public abstract class PhoneServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{phoneServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a phone service channel by id", notes = "Finds a phone service channel by id", response = PhoneServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "PhoneServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a phone service channel", response = PhoneServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class) })
    public abstract Response findPhoneServiceChannel(@PathParam("phoneServiceChannelId") String phoneServiceChannelId,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists phone service channels", notes = "Lists phone service channels", response = PhoneServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "PhoneServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of phone service channels", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class, responseContainer = "List") })
    public abstract Response listPhoneServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

}

