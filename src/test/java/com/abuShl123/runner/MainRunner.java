package com.abuShl123.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "com/abuShl123/step_definitions",
        dryRun = false,
        tags="@wip"
)
public class MainRunner {
}
