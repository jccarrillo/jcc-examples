package org.jcc.examples.spring.application;

import org.jcc.examples.echo.service.EchoService;
import org.jcc.examples.echo.service.impl.EchoServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EchoConfiguration {

    @Bean
    public EchoService echoService() {
        return new EchoServiceImpl();
    }
}