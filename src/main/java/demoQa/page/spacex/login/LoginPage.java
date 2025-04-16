package demoQa.page.spacex.login;

import demoQa.page.BasePage;
import demoQa.page.spacex.dashboard.DashBoardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement login;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement submit;

    public DashBoardPage doLogin(String username, String password){
        webElementActions.sendKeys(login, username)
                .sendKeys(this.password, password)
                .click(submit);
        return new DashBoardPage();
    }



}
