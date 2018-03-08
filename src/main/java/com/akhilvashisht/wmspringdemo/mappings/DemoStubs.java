package com.akhilvashisht.wmspringdemo.mappings;

import com.akhilvashisht.wmspringdemo.util.ApplicationConstants.*;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.akhilvashisht.wmspringdemo.util.ApplicationConstants.Response.Body.SUCCESS_MESSAGE;
import static com.akhilvashisht.wmspringdemo.util.ApplicationConstants.Response.Status.OK;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;

@Component
public class DemoStubs {
    @Autowired
    WireMock wireMock;

    public void createDemoStubs(){

        wireMock.stubFor(get(urlPathEqualTo(Request.Urls.FOO))
                .willReturn(aResponse().withStatus(OK).withBody(SUCCESS_MESSAGE))
        );
    }
}
