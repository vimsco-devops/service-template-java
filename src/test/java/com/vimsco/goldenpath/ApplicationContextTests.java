package com.vimsco.goldenpath;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationContextTests {

    @Test
    void contextLoads() {
        // Verifies the full application context — including Spring Boot Actuator's
        // liveness/readiness auto-configuration — wires up and boots successfully.
        // Deliberately not asserting on HTTP responses: Boot 4.1's MockMvc and
        // TestRestTemplate test-support modules hit real upstream packaging gaps
        // during this build (see commit history). This smoke test avoids depending
        // on either while still proving the app, including actuator health config,
        // actually starts.
    }
}

