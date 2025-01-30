package com.jpmc.midas;

import com.jpmc.midas.MidasCoreApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest(classes = MidasCoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = MidasCoreApplication.class)
public class TaskThreeTests {
    // Your test cases
}
