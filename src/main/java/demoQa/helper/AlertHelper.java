package demoQa.helper;

import demoQa.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertHelper {

    private WebDriver driver;
    private WebDriverWait wait;

    public AlertHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public Alert getAlert(){
        return driver.switchTo().alert();
    }

    public boolean isAlertPresent(){
        try {
            Driver.getDriver().switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            return false;
        }
    }

    public void acceptAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return;
        }
        getAlert().accept();
    }

    public void dismissAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.alertIsPresent());
        if (!isAlertPresent()){
            return;
        }
        getAlert().dismiss();
    }

    public void sendKeys(String text){
        if (!isAlertPresent()){
            return;
        }
        getAlert().sendKeys(text);
    }
}
