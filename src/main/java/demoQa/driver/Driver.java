package demoQa.driver;

import demoQa.fileUtils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private Driver(){
        //Singleton pattern                //объекты не создаются
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
    if (driver == null){
        switch (ConfigReader.getProperty("browserType").toLowerCase()){
            case "chrome":
                driver = ChromeWebDriver.loadChromeDriver();
                break;
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + ConfigReader.getProperty("browserType"));
        }
    }
    return driver;
    }
}
