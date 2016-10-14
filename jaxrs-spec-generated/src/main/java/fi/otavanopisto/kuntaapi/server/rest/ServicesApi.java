package fi.otavanopisto.kuntaapi.server.rest;

import fi.otavanopisto.kuntaapi.server.rest.model.BadRequest;
import fi.otavanopisto.kuntaapi.server.rest.model.Service;
import fi.otavanopisto.kuntaapi.server.rest.model.Forbidden;
import fi.otavanopisto.kuntaapi.server.rest.model.InternalServerError;
import fi.otavanopisto.kuntaapi.server.rest.model.ElectronicChannel;
import fi.otavanopisto.kuntaapi.server.rest.model.NotFound;
import fi.otavanopisto.kuntaapi.server.rest.model.PhoneChannel;
import fi.otavanopisto.kuntaapi.server.rest.model.PrintableFormChannel;
import fi.otavanopisto.kuntaapi.server.rest.model.ServiceLocationChannel;
import fi.otavanopisto.kuntaapi.server.rest.model.WebPageChannel;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/services")

@Api(description = "the services API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2016-10-14T06:26:54.403+03:00")

public abstract class ServicesApi extends AbstractApi {

    @POST
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Create service", notes = "Creates new service", response = Service.class, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response createService(Service body);

    @POST
    @Path("/{serviceId}/electronicChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "creates ElectronicChannel", notes = "creates ElectronicChannel", response = ElectronicChannel.class, tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created ElectronicChannel", response = ElectronicChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicChannel.class) })
    public abstract Response createServiceElectronicChannel(@PathParam("serviceId") String serviceId,ElectronicChannel body);

    @POST
    @Path("/{serviceId}/phoneChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "creates PhoneChannel", notes = "creates PhoneChannel", response = PhoneChannel.class, tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created PhoneChannel", response = PhoneChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneChannel.class) })
    public abstract Response createServicePhoneChannel(@PathParam("serviceId") String serviceId,PhoneChannel body);

    @POST
    @Path("/{serviceId}/printableFormChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "creates PrintableFormChannel", notes = "creates PrintableFormChannel", response = PrintableFormChannel.class, tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created PrintableFormChannel", response = PrintableFormChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormChannel.class) })
    public abstract Response createServicePrintableFormChannel(@PathParam("serviceId") String serviceId,PrintableFormChannel body);

    @POST
    @Path("/{serviceId}/serviceLocationChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "creates ServiceLocationChannel", notes = "creates ServiceLocationChannel", response = ServiceLocationChannel.class, tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created ServiceLocationChannel", response = ServiceLocationChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationChannel.class) })
    public abstract Response createServiceServiceLocationChannel(@PathParam("serviceId") String serviceId,ServiceLocationChannel body);

    @POST
    @Path("/{serviceId}/webPageChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "creates WebPageChannel", notes = "creates WebPageChannel", response = WebPageChannel.class, tags={ "Services", "WebPageChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns created WebPageChannel", response = WebPageChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageChannel.class) })
    public abstract Response createServiceWebPageChannel(@PathParam("serviceId") String serviceId,WebPageChannel body);

    @GET
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Finds a service by id", notes = "Finds service", response = Service.class, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response findService(@PathParam("serviceId") String serviceId);

    @GET
    @Path("/{serviceId}/electronicChannels/{electronicChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds ElectronicChannel by electronicChannelId", notes = "finds ElectronicChannels by electronicChannelId", response = ElectronicChannel.class, tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns ElectronicChannel", response = ElectronicChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicChannel.class) })
    public abstract Response findServiceElectronicChannel(@PathParam("serviceId") String serviceId,@PathParam("electronicChannelId") String electronicChannelId);

    @GET
    @Path("/{serviceId}/phoneChannels/{phoneChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds PhoneChannel by phoneChannelId", notes = "finds PhoneChannels by phoneChannelId", response = PhoneChannel.class, tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns PhoneChannel", response = PhoneChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneChannel.class) })
    public abstract Response findServicePhoneChannel(@PathParam("serviceId") String serviceId,@PathParam("phoneChannelId") String phoneChannelId);

    @GET
    @Path("/{serviceId}/printableFormChannels/{printableFormChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds PrintableFormChannel by printableFormChannelId", notes = "finds PrintableFormChannels by printableFormChannelId", response = PrintableFormChannel.class, tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns PrintableFormChannel", response = PrintableFormChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormChannel.class) })
    public abstract Response findServicePrintableFormChannel(@PathParam("serviceId") String serviceId,@PathParam("printableFormChannelId") String printableFormChannelId);

    @GET
    @Path("/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds ServiceLocationChannel by serviceLocationChannelId", notes = "finds ServiceLocationChannels by serviceLocationChannelId", response = ServiceLocationChannel.class, tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns ServiceLocationChannel", response = ServiceLocationChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationChannel.class) })
    public abstract Response findServiceServiceLocationChannel(@PathParam("serviceId") String serviceId,@PathParam("serviceLocationChannelId") String serviceLocationChannelId);

    @GET
    @Path("/{serviceId}/webPageChannels/{webPageChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "finds WebPageChannel by webPageChannelId", notes = "finds WebPageChannels by webPageChannelId", response = WebPageChannel.class, tags={ "Services", "WebPageChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns WebPageChannel", response = WebPageChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageChannel.class) })
    public abstract Response findServiceWebPageChannel(@PathParam("serviceId") String serviceId,@PathParam("webPageChannelId") String webPageChannelId);

    @GET
    @Path("/{serviceId}/electronicChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists ElectronicChannels by serviceId", notes = "Lists ElectronicChannels by serviceId", response = ElectronicChannel.class, responseContainer = "List", tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of ElectronicChannels", response = ElectronicChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicChannel.class, responseContainer = "List") })
    public abstract Response listServiceElectronicChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    @Path("/{serviceId}/phoneChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists PhoneChannels by serviceId", notes = "Lists PhoneChannels by serviceId", response = PhoneChannel.class, responseContainer = "List", tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of PhoneChannels", response = PhoneChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneChannel.class, responseContainer = "List") })
    public abstract Response listServicePhoneChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    @Path("/{serviceId}/printableFormChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists PrintableFormChannels by serviceId", notes = "Lists PrintableFormChannels by serviceId", response = PrintableFormChannel.class, responseContainer = "List", tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of PrintableFormChannels", response = PrintableFormChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormChannel.class, responseContainer = "List") })
    public abstract Response listServicePrintableFormChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    @Path("/{serviceId}/serviceLocationChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists ServiceLocationChannels by serviceId", notes = "Lists ServiceLocationChannels by serviceId", response = ServiceLocationChannel.class, responseContainer = "List", tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of ServiceLocationChannels", response = ServiceLocationChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationChannel.class, responseContainer = "List") })
    public abstract Response listServiceServiceLocationChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    @Path("/{serviceId}/webPageChannels")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Lists WebPageChannels by serviceId", notes = "Lists WebPageChannels by serviceId", response = WebPageChannel.class, responseContainer = "List", tags={ "Services", "WebPageChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns array of WebPageChannels", response = WebPageChannel.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageChannel.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageChannel.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageChannel.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageChannel.class, responseContainer = "List") })
    public abstract Response listServiceWebPageChannels(@PathParam("serviceId") String serviceId,@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @GET
    
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Service list", notes = "Lists services", response = Service.class, responseContainer = "List", tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of services", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class, responseContainer = "List") })
    public abstract Response listServices(@QueryParam("firstResult") Long firstResult,@QueryParam("maxResults") Long maxResults);

    @PUT
    @Path("/{serviceId}/phoneChannels/{phoneChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates PhoneChannel", notes = "Updates PhoneChannel", response = PhoneChannel.class, tags={ "Services", "PhoneChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated PhoneChannel", response = PhoneChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PhoneChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PhoneChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PhoneChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PhoneChannel.class) })
    public abstract Response updatePhoneChannel(@PathParam("serviceId") String serviceId,@PathParam("phoneChannelId") String phoneChannelId,PhoneChannel body);

    @PUT
    @Path("/{serviceId}/printableFormChannels/{printableFormChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates PrintableFormChannel", notes = "Updates PrintableFormChannel", response = PrintableFormChannel.class, tags={ "Services", "PrintableFormChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated PrintableFormChannel", response = PrintableFormChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = PrintableFormChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = PrintableFormChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = PrintableFormChannel.class) })
    public abstract Response updatePrintableFormChannel(@PathParam("serviceId") String serviceId,@PathParam("printableFormChannelId") String printableFormChannelId,PrintableFormChannel body);

    @PUT
    @Path("/{serviceId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates service", notes = "Updates service", response = Service.class, tags={ "Services",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an updated service", response = Service.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Service.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Service.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = Service.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Service.class) })
    public abstract Response updateService(@PathParam("serviceId") String serviceId,Service body);

    @PUT
    @Path("/{serviceId}/electronicChannels/{electronicChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates ElectronicChannel", notes = "Updates ElectronicChannel", response = ElectronicChannel.class, tags={ "Services", "ElectronicChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated ElectronicChannel", response = ElectronicChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ElectronicChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ElectronicChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ElectronicChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ElectronicChannel.class) })
    public abstract Response updateServiceElectronicChannel(@PathParam("serviceId") String serviceId,@PathParam("electronicChannelId") String electronicChannelId,ElectronicChannel body);

    @PUT
    @Path("/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates ServiceLocationChannel", notes = "Updates ServiceLocationChannel", response = ServiceLocationChannel.class, tags={ "Services", "ServiceLocationChannels",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated ServiceLocationChannel", response = ServiceLocationChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = ServiceLocationChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = ServiceLocationChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ServiceLocationChannel.class) })
    public abstract Response updateServiceLocationChannel(@PathParam("serviceId") String serviceId,@PathParam("serviceLocationChannelId") String serviceLocationChannelId,ServiceLocationChannel body);

    @PUT
    @Path("/{serviceId}/webPageChannels/{webPageChannelId}")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Updates WebPageChannel", notes = "Updates WebPageChannel", response = WebPageChannel.class, tags={ "Services", "WebPageChannels" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns updated WebPageChannel", response = WebPageChannel.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = WebPageChannel.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = WebPageChannel.class),
        @ApiResponse(code = 404, message = "Resource was not found from the server", response = WebPageChannel.class),
        @ApiResponse(code = 500, message = "Internal server error", response = WebPageChannel.class) })
    public abstract Response updateWebPageChannel(@PathParam("serviceId") String serviceId,@PathParam("webPageChannelId") String webPageChannelId,WebPageChannel body);

}

