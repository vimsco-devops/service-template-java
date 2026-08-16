package com.vimsco.goldenpath;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloControllerTests {

    @Test
    void helloReturnsGreeting() {
        HelloController controller = new HelloController();
        assertThat(controller.hello()).containsEntry("message", "hello from the golden path (Java)");
    }
}
