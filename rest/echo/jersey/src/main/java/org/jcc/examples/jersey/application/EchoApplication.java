package org.jcc.examples.jersey.application;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import org.jcc.examples.echo.service.EchoService;
import org.jcc.examples.echo.service.impl.EchoServiceImpl;

import javax.inject.Singleton;

public class EchoApplication extends ResourceConfig {

    public EchoApplication() {
        String packages[] = {
                "org.jcc.examples.jersey.resource",
                "com.jersey.jaxb",
                "com.fasterxml.jackson.jaxrs.json"
        };
        packages(packages);
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(EchoService.class).in(Singleton.class);
                bind(new EchoServiceImpl()).to (EchoService.class);
            }
        });
    }
}