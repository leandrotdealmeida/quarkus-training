package com.github.viniciusfcf.monitoramento;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.metrics.annotation.Counted;

@Path("/carros")
public class CarrosResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Counted(name= "Contador busca carros")
	public String methodName() {
		return "Ola 2";
	}
}
