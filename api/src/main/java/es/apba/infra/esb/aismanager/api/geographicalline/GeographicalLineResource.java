package es.apba.infra.esb.aismanager.api.geographicalline;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for the app to publish a geographical line resource on the ESB
 * 
 * Yes, it's a class, newer versions of CXF allow it to be an interface, but ours doesn't
 * 
 * @author fsaucedo
 */
public class GeographicalLineResource {

    public GeographicalLineResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGeographicalLine() {
        return null;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createGeographicalLine(GeographicalLine input) {
        return null;
    }
    
    @GET
    @Path("/{geographicalLineCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGeographicalLine(@PathParam("geographicalLineCode") String geographicalLineCode) {
        return null;
    }
    
    @PUT
    @Path("/{geographicalLineCode}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateGeographicalLine(@PathParam("geographicalLineCode") String geographicalLineCode, GeographicalLine geographicalLine) {
        return null;
    }
    
    @DELETE
    @Path("/{geographicalLineCode}")
    public Response deleteGeographicalLine(@PathParam("geographicalLineCode") String geographicalLineCode) {
        return null;
    }    
    
}
