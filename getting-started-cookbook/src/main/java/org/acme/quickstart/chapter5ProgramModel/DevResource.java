package org.acme.quickstart.chapter5ProgramModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/dev")
public class DevResource {

    private static final List<Dev> devs = new ArrayList<>();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addDevs(Dev dev) {
        devs.add(dev);
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Dev> getDevs() {
        return devs;
    }

}
