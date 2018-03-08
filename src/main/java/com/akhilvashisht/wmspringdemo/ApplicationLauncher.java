package com.akhilvashisht.wmspringdemo;

import com.akhilvashisht.wmspringdemo.config.DemoMockStubsInit;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This class contains the main method which launches this application.
 */
@SpringBootApplication
public class ApplicationLauncher {

    @Value("${com.av.demo.port}")
    Integer port;

    /**
     * This main method launches the GCP Service application
     */
    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
    }

    /**
     * This method creates the WireMockServer Instance
     */
    @Bean
    public WireMockServer initWireMockServerInstance(){
        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().port(port));
        wireMockServer.start();
        return wireMockServer;
    }

    /**
     * This method creates the instance of WireMockServer Client
     */
    @Bean
    public WireMock initWireMockServerClient(){
        WireMock wireMock = new WireMock();
        wireMock.configureFor(port);
        return wireMock;
    }

    /**
     * This method creates the WireMock Stubs
     */
    @Bean
    public CommandLineRunner initWireMockStubs(){
      return new DemoMockStubsInit();
    }
}
