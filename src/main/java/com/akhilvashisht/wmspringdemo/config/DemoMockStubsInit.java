package com.akhilvashisht.wmspringdemo.config;

import com.akhilvashisht.wmspringdemo.mappings.DemoStubs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * This Class creates the Demo Stubs for Wiremock Server.
 */
public class DemoMockStubsInit implements CommandLineRunner {
    @Autowired
    DemoStubs demoStubs;

    @Override
    public void run(String... strings) throws Exception {
        demoStubs.createDemoStubs();
    }
}
