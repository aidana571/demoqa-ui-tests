package demoQa.page.spacex.dashboard;

import demoQa.driver.Driver;
import demoQa.entity.User;
import demoQa.page.BasePage;
import demoQa.page.spacex.users.AddUserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage extends BasePage {
    WebDriver driver  = Driver.getDriver();
    public AddUserPage addUserPage = new AddUserPage();

    @FindBy(xpath = "(//a[normalize-space()='Add user'])[2]")
    public WebElement addUserBtn;

    @FindBy(css = "#tl-admin-dashboard")
    public WebElement adminDashboardContainer;
//    public WebElement adminDashboardContainer = driver.findElement(By.cssSelector("#tl-admin-dashboasrd"));

//    public WebElement userBlock = adminDashboardContainer.findElement(By.cssSelector("#tl-admin-users"));
//    public WebElement userList = userBlock.findElement(By.cssSelector(".tl-bold-link a"));

//    public AddUserPage addNewUser(User user){
//        webElementActions.click(addUserBtn);
//        return new AddUserPage();
//    }

    public void showUserList(){
    WebElement usersBlock = adminDashboardContainer.findElement(By.cssSelector("#tl-admin-users"));  // объявили родителя adminDashboardContainer и там ищет нужные элементы
    WebElement userList = usersBlock.findElement(By.cssSelector(".tl-bold-link a"));
    webElementActions.click(userList);
    }
}
