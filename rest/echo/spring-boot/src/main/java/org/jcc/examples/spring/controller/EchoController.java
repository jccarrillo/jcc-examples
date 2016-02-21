package org.jcc.examples.spring.controller;

import org.jcc.examples.echo.model.Echo;
import org.jcc.examples.echo.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.jcc.examples.echo.config.UrlPath.PATH_VARIABLE_ECHO;
import static org.jcc.examples.echo.config.UrlPath.URL_ECHO;

@RestController
public class EchoController {

    @Autowired
    private EchoService echoService;

    @RequestMapping(URL_ECHO)
    public Echo echo(@PathVariable(PATH_VARIABLE_ECHO) String echo) {

        return this.echoService.getEcho(echo);
    }
}