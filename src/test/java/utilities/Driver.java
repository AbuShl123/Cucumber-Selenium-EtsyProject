package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
    private static WebDriver driver;

    private Driver() {}

    public WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigurationReader.getProperty("chrome");
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                default:
                    throw new RuntimeException("unknown browser type: " + browserType);
            }
        }

        return driver;
    }

    public void closeDriver(){
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}
