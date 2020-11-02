package japa.com.br.resource;

import japa.com.br.model.Encontro;
import japa.com.br.service.EncontroService;
import japa.com.br.service.EncontroServiceImpl;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/encontro")
public class EncontroResource {

    @Inject
    EncontroServiceImpl encontroService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Encontro> lista() {
        return encontroService.lista();
    }
}