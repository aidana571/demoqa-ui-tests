package demoQa.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class EdgeWebDriver {
    public static WebDriver loadEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;

    }
}

