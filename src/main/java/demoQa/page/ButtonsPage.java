package demoQa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage  extends BasePage{

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickBtn;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickBtn;

}
