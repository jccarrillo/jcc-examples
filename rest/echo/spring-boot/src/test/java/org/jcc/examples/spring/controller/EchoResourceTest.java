package org.jcc.examples.spring.controller;

import org.jcc.examples.spring.application.EchoApplication;
import org.jcc.examples.spring.model.Echo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EchoApplication.class)
@WebIntegrationTest("server.port: 0")
public class EchoResourceTest {

    private RestTemplate restTemplate = new TestRestTemplate();

    @Value("${local.server.port}")
    private int port;

    @Test
    public void test() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        String echoThis = "jc";
        String url = "http://localhost:" + port + "/echo/" + echoThis;
        Echo echo = restTemplate.getForObject(url, Echo.class);

        Assert.assertNotNull(echo);
        String theEcho = echo.getEcho();
        Assert.assertEquals(echoThis, theEcho);
    }
}