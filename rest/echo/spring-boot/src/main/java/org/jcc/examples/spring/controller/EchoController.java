package org.jcc.examples.spring.controller;

import org.jcc.examples.spring.model.Echo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping("/echo/{echo}")
    public Echo echo(@PathVariable("echo") String theEcho) {

        System.out.println("Echo: " + theEcho);
        Echo echo = new Echo();
        echo.setEcho(theEcho);

        return echo;
    }
}