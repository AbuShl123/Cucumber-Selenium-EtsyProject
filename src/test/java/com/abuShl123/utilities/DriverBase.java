package com.abuShl123.utilities;

import org.openqa.selenium.chrome.ChromeOptions;

public class DriverBase {

    protected static final String BROWSER;

    protected static final ChromeOptions OPTIONS;

    static {
        if (System.getProperty("BROWSER") != null){
            BROWSER = System.getProperty("BROWSER");
        } else {
            BROWSER = ConfigurationReader.getProperty("browser");
        }

    }

    static {
        OPTIONS = new ChromeOptions();
        OPTIONS.addArguments("--incognito");
        OPTIONS.addArguments("lang=en-GB");
    }
}
