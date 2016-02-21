package org.jcc.examples.echo.service.impl;

import org.jcc.examples.echo.model.Echo;
import org.jcc.examples.echo.service.EchoService;

public class EchoServiceImpl implements EchoService {

    public Echo getEcho(String toEcho) {
        Echo echo = new Echo();
        echo.setEcho(toEcho);

        return echo;
    }
}