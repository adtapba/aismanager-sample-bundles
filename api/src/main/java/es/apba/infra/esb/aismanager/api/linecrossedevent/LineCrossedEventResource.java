package es.apba.infra.esb.aismanager.api.linecrossedevent;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for the app to publish messages line crossed event on the ESB
 * 
 * Yes, it's a class, newer versions of CXF allow it to be an interface, but ours doesn't
 * 
 * @author fsaucedo
 */
public class LineCrossedEventResource {

    public LineCrossedEventResource() {
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postLineCrossedEvent(LineCrossedEvent message) {
        return null;
    }
    
}
