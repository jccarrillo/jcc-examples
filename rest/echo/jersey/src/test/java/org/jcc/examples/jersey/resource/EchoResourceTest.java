package org.jcc.examples.jersey.resource;

import org.glassfish.jersey.test.JerseyTest;
import org.jcc.examples.jersey.application.EchoApplication;
import org.jcc.examples.jersey.model.Echo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class EchoResourceTest extends JerseyTest {

    @Before
    public void setUpChild() {
    }

    @After
    public void tearDownChild() {
    }

    @Override
    protected Application configure() {
        return new EchoApplication();
    }

    @Override
    protected URI getBaseUri() {
        return UriBuilder.fromUri(super.getBaseUri()).path("jersey").build();
    }

    @Test
    public void test() {
        WebTarget webTarget = target("echo/jc");
        Invocation.Builder request = webTarget.request();
        Response response = request.get();
        Echo echo = response.readEntity(Echo.class);
        Assert.assertEquals("jc", echo.getEcho());
        response.close();
    }
}