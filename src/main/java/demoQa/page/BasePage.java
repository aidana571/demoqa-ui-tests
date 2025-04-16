package demoQa.page;


import demoQa.driver.Driver;
import demoQa.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

   public WebElementActions webElementActions = new WebElementActions();

   public BasePage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

}
