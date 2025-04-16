package demoQa.helper;

import demoQa.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementActions {

    public Actions actions = new Actions(Driver.getDriver());

    public void waitButtonToBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementToBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
    }

    public WebElementActions click(WebElement element){
        waitElementToBeDisplayed(element);
        highlightElement(element);
        waitButtonToBeClickable(element);
        element.click();
        return this;  //
    }


    public void jsClick(WebElement element){
        waitElementToBeDisplayed(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", element);
    }

    public WebElementActions sendKeys(WebElement element, String text){
        waitElementToBeDisplayed(element);
        highlightElement(element);
        element.sendKeys(text);
        return this;
    }

    public WebElementActions doubleClick(WebElement element){
        waitElementToBeDisplayed(element);
        waitButtonToBeClickable(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public void rightClick(WebElement element){
       waitElementToBeDisplayed(element);
       waitButtonToBeClickable(element);
       actions.contextClick(element).perform();
    }

    public WebElementActions moveToElement(WebElement element){
        waitElementToBeDisplayed(element);
        actions.moveToElement(element).perform();
        return this;
    }

    public WebElementActions scrollInToElement(WebElement element){
        waitElementToBeDisplayed(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollInToView(true);", element);
        return this;
    }

    public void highlightElement(WebElement element){
        waitElementToBeDisplayed(element);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].style.border='3px solid green'", element);
    }

    public WebElementActions clearAndSendKeys(WebElement element, String txt){
        waitElementToBeDisplayed(element);
        scrollInToElement(element);
        element.clear();
        element.sendKeys(txt);
        return this;
    }


}