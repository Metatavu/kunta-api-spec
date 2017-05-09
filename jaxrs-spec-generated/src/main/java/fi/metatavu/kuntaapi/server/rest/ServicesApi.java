package fi.metatavu.kuntaapi.server.rest;

import fi.metatavu.kuntaapi.server.rest.model.BadRequest;
import fi.metatavu.kuntaapi.server.rest.model.Service;
import fi.metatavu.kuntaapi.server.rest.model.Forbidden;
import fi.metatavu.kuntaapi.server.rest.model.InternalServerError;
import fi.metatavu.kuntaapi.server.rest.model.NotFound;
import fi.metatavu.kuntaapi.server.rest.model.ElectronicServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.PhoneServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.PrintableFormServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.ServiceLocationServiceChannel;
import fi.metatavu.kuntaapi.server.rest.model.WebPageServiceChannel;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/services")

@Api(description = "the services API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-05-09T12:11:47.007+03:00")

public abstract class ServicesApi extends AbstractApi {

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create service", notes = "Creates new service", response = Service.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response createService(Service body,@Context Request request);

    @GET
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a service by id", notes = "Finds service", response = Service.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response findService(@PathParam("serviceId") String serviceId,@Context Request request);

    @GET
    @Path("/{serviceId}/electronicChannels/{electronicChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds ElectronicChannel by electronicChannelId", notes = "finds ElectronicChannels by electronicChannelId", response = ElectronicServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns ElectronicChannel", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicServiceChannel.class) })
    public abstract Response findServiceElectronicChannel(@PathParam("serviceId") String serviceId,@PathParam("electronicChannelId") String electronicChannelId,@Context Request request);

    @GET
    @Path("/{serviceId}/phoneChannels/{phoneChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds PhoneChannel by phoneChannelId", notes = "finds PhoneChannels by phoneChannelId", response = PhoneServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns PhoneChannel", response = PhoneServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class) })
    public abstract Response findServicePhoneChannel(@PathParam("serviceId") String serviceId,@PathParam("phoneChannelId") String phoneChannelId,@Context Request request);

    @GET
    @Path("/{serviceId}/printableFormChannels/{printableFormChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds PrintableFormChannel by printableFormChannelId", notes = "finds PrintableFormChannels by printableFormChannelId", response = PrintableFormServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns PrintableFormChannel", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormServiceChannel.class) })
    public abstract Response findServicePrintableFormChannel(@PathParam("serviceId") String serviceId,@PathParam("printableFormChannelId") String printableFormChannelId,@Context Request request);

    @GET
    @Path("/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds ServiceLocationChannel by serviceLocationChannelId", notes = "finds ServiceLocationChannels by serviceLocationChannelId", response = ServiceLocationServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns ServiceLocationChannel", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationServiceChannel.class) })
    public abstract Response findServiceServiceLocationChannel(@PathParam("serviceId") String serviceId,@PathParam("serviceLocationChannelId") String serviceLocationChannelId,@Context Request request);

    @GET
    @Path("/{serviceId}/webPageChannels/{webPageChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds WebPageChannel by webPageChannelId", notes = "finds WebPageChannels by webPageChannelId", response = WebPageServiceChannel.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "WebPageChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns WebPageChannel", response = WebPageServiceChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageServiceChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageServiceChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageServiceChannel.class) })
    public abstract Response findServiceWebPageChannel(@PathParam("serviceId") String serviceId,@PathParam("webPageChannelId") String webPageChannelId,@Context Request request);

    @GET
    @Path("/{serviceId}/electronicChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists ElectronicChannels by serviceId", notes = "Lists ElectronicChannels by serviceId", response = ElectronicServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of ElectronicChannels", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicServiceChannel.class, responseContainer = "List") })
    public abstract Response listServiceElectronicChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{serviceId}/phoneChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists PhoneChannels by serviceId", notes = "Lists PhoneChannels by serviceId", response = PhoneServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of PhoneChannels", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneServiceChannel.class, responseContainer = "List") })
    public abstract Response listServicePhoneChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{serviceId}/printableFormChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists PrintableFormChannels by serviceId", notes = "Lists PrintableFormChannels by serviceId", response = PrintableFormServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of PrintableFormChannels", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormServiceChannel.class, responseContainer = "List") })
    public abstract Response listServicePrintableFormChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{serviceId}/serviceLocationChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists ServiceLocationChannels by serviceId", notes = "Lists ServiceLocationChannels by serviceId", response = ServiceLocationServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of ServiceLocationChannels", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationServiceChannel.class, responseContainer = "List") })
    public abstract Response listServiceServiceLocationChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    @Path("/{serviceId}/webPageChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists WebPageChannels by serviceId", notes = "Lists WebPageChannels by serviceId", response = WebPageServiceChannel.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services", "WebPageChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of WebPageChannels", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageServiceChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageServiceChannel.class, responseContainer = "List") })
    public abstract Response listServiceWebPageChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Service list", notes = "Lists services", response = Service.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of services", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class, responseContainer = "List") })
    public abstract Response listServices(@QueryParam("organizationId") String organizationId,@QueryParam("search") String search,@QueryParam("sortOrder") String sortOrder,@QueryParam("sortDir") String sortDir,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults,@Context Request request);

    @PUT
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates service", notes = "Updates service", response = Service.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Services" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an updated service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response updateService(@PathParam("serviceId") String serviceId,Service body,@Context Request request);

}

