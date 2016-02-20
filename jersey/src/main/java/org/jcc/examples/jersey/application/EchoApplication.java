package org.jcc.examples.jersey.application;

import org.glassfish.jersey.server.ResourceConfig;

public class EchoApplication extends ResourceConfig {

    public EchoApplication() {
        String packages[] = {
                "org.jcc.examples.jersey.resource",
                "com.jersey.jaxb",
                "com.fasterxml.jackson.jaxrs.json"
        };
        packages(packages);
    }
}