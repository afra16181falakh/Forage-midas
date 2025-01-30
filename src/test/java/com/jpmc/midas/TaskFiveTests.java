package com.jpmc.midas;

import com.jpmc.midas.MidasCoreApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = MidasCoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = MidasCoreApplication.class)
public class TaskFiveTests {
    // Add a simple test method
    @Test
    public void contextLoads() {
        // This test will simply attempt to start the Spring application context
    }
}
