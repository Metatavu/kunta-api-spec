package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;
import fi.metatavu.kuntaapi.server.rest.model.PrintableFormServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.NotFound;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/printableFormServiceChannels")

@Api(description = "the printableFormServiceChannels API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-10-15T15:37:20.269+03:00")

public abstract class PrintableFormServiceChannelsApi extends AbstractApi {

    @GET
    @Path("/{printableFormServiceChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a printable form service channel", notes = "Finds a printable form service channel", response = PrintableFormServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "PrintableFormServiceChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns printable form service channel", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormServiceChannel.class) })
    public abstract Response findPrintableFormServiceChannel(@PathParam("printableFormServiceChannelId") String printableFormServiceChannelId,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists printable form service channels", notes = "Lists printable form service channels", response = PrintableFormServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ServiceChannels", "PrintableFormServiceChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of printable form service channels", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormServiceChannel.class, responseContainer = "List") })
    public abstract Response listPrintableFormServiceChannels(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

}

