package org.acme;

import javax.print.attribute.standard.Media;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {

    @GET
    public List<Pessoa> listarPessoas() {

        Pessoa pessoa = new Pessoa();
        return pessoa.listarPessoas();
    }

    @POST
    @Transactional
    public Pessoa salvar(Pessoa pessoa) {
        pessoa.persist();
        return pessoa;
    }
}