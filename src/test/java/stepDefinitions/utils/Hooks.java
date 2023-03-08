package stepDefinitions.utils;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Hooks {

    @BeforeAll
    public static void setUp() throws IOException {

        HelperClass.setUpDriver();
        File directory = new File(System.getProperty("user.dir")+"/Reports/");
        FileUtils.cleanDirectory(directory);
    }

    @AfterAll
    public static void tearDown() {

        HelperClass.tearDown();
    }
}