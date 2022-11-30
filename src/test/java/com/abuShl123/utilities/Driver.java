package com.abuShl123.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver extends DriverBase{
    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (BROWSER){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(OPTIONS)  ;
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new IllegalArgumentException("unknown browser type: " + BROWSER);
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static JavascriptExecutor getJs(){
        return (JavascriptExecutor) Driver.getDriver();
    }

    public void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
