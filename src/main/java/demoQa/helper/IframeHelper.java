package demoQa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeHelper {

    private static WebDriver driver;

    public IframeHelper(WebDriver driver){
        IframeHelper.driver = driver;
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void switchToFrame(String nameOrId){
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(nameOrId));
    }
}
