package org.jcc.examples.spring.application;

import org.jcc.examples.echo.service.EchoService;
import org.jcc.examples.echo.service.impl.EchoServiceImpl;
import org.jcc.examples.spring.controller.EchoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {EchoController.class})
public class EchoApplication {

    @Bean
    public EchoService echoService() {
        return new EchoServiceImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(EchoApplication.class, args);
    }
}