package demoQa.page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TextBoxPage extends BasePage {



    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submit;

    public TextBoxPage fillUserName(String userName){
        webElementActions.sendKeys(this.userName, userName);
        return this;
    }

    public TextBoxPage fillUserEmail(String userEmail){
        webElementActions.sendKeys(this.userEmail, userEmail);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress){
       webElementActions.sendKeys(this.currentAddress, currentAddress);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String permanentAddress){
       webElementActions.sendKeys(this.permanentAddress, permanentAddress);
        return this;
    }

    public TextBoxPage clickSubmit(){
       webElementActions.jsClick(this.submit);
        return this;
    }


}
