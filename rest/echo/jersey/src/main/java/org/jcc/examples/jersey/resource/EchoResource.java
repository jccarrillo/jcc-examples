package org.jcc.examples.jersey.resource;

import org.jcc.examples.echo.model.Echo;
import org.jcc.examples.echo.service.EchoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static org.jcc.examples.echo.config.UrlPath.PATH_VARIABLE_ECHO;
import static org.jcc.examples.echo.config.UrlPath.URL_ECHO;

@Path(URL_ECHO)
public class EchoResource {

    @Inject
    private EchoService echoService;

    @GET
    @Produces(APPLICATION_JSON)
    public Echo echo(@PathParam(PATH_VARIABLE_ECHO) String echo) {

        return this.echoService.getEcho(echo);
    }
}