package org.jcc.examples.jersey.application;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.jcc.examples.echo.service.EchoService;
import org.jcc.examples.echo.service.impl.EchoServiceImpl;

import javax.inject.Singleton;

public class EchoConfiguration extends AbstractBinder {

    @Override
    protected void configure() {
        bind(EchoService.class).in(Singleton.class);
        bind(new EchoServiceImpl()).to(EchoService.class);
    }
}
