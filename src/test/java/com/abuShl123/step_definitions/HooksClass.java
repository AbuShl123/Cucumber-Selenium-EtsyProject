package com.abuShl123.step_definitions;

import com.abuShl123.utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
    @Before
    public void settingUp() {
        System.out.println("Starting Cucumber scenario");
    }

    @After
    public void tearDown() {
        Driver.getDriver().close();
    }
}
