package org.jcc.examples.jersey.resource;

import org.jcc.examples.jersey.model.Echo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/echo")
public class EchoResource {

    @GET
    @Path("/{echo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Echo echo(@PathParam("echo") String echo) {

        Echo hello = new Echo();
        hello.setEcho(echo);

        return hello;
    }
}