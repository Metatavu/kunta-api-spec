package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.Code;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/codes")

@Api(description = "the codes API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-03-11T07:44:17.772+02:00")

public abstract class CodesApi extends AbstractApi {

    @GET
    @Path("/{codeId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a code", notes = "Finds a code", response = Code.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Codes",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a find code", response = Code.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Code.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Code.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Code.class) })
    public abstract Response findCode(@PathParam("codeId") String codeId,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists codes", notes = "Lists codes", response = Code.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Codes" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of codes", response = Code.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Code.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Code.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Code.class, responseContainer = "List") })
    public abstract Response listCodes(@QueryParam("types") List<String> types,@QueryParam("search") String search,@QueryParam("sortBy") String sortBy,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

}

