package org.jcc.examples.spring.application;

import org.jcc.examples.spring.controller.EchoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({EchoConfiguration.class})
@ComponentScan(basePackageClasses = {EchoController.class})
public class EchoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchoApplication.class, args);
    }
}