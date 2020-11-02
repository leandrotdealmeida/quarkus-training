package devjapa.com.br;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cors")
public class CorsResource {

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "{healthy:UP}";
    }
}