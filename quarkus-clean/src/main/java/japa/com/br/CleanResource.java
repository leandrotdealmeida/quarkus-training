package japa.com.br;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class CleanResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Olá Mundo Quarkus";
    }
}