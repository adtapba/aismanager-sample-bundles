package es.apba.infra.esb.aismanager.api.position;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for the app to publish a position resource on the ESB
 * 
 * Yes, it's a class, newer versions of CXF allow it to be an interface, but ours doesn't
 * 
 * @author fsaucedo
 */
public class PositionResource {

    public PositionResource() {
    }
    
    @GET
    @Path("{vesselImoCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPosition(@PathParam("vesselImoCode") long vesselImoCode) {
        return null;
    }
    
}
