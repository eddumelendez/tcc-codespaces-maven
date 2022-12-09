package com.example.codespacesmaven;

import org.testcontainers.containers.GenericContainer;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class TestcontainersTest {

    @Test
    void test() {
        try (GenericContainer<?> container = new GenericContainer<>("redis:5.0.5-alpine")) {
            container.start();
            assertThat(container.isRunning()).isTrue();
        }
    }

}