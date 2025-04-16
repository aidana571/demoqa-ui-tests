import demoQa.driver.Driver;
import demoQa.helper.AlertHelper;
import demoQa.helper.BrowserManager;
import demoQa.helper.WebElementActions;
import demoQa.page.*;
import demoQa.page.spacex.dashboard.DashBoardPage;
import demoQa.page.spacex.login.LoginPage;
import demoQa.page.spacex.users.AddUserPage;
import demoQa.randomEntityUtils.RandomUserGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public abstract class BaseDemoQATest {
    public WebDriver driver;
    TextBoxPage textBoxPage = new TextBoxPage();
    DynamicPropertiesPage dynamicPropertiesPage = new DynamicPropertiesPage();
    WebElementActions webElementActions = new WebElementActions();
    ButtonsPage buttonsPage = new ButtonsPage();
    AlertHelper alertHelper;
    AlertPage alertPage = new AlertPage();
    BrowserManager browserManager;
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    WindowPage windowPage;

    @BeforeSuite
    public void beforeSuite(){
        driver = Driver.getDriver();
        alertHelper = new AlertHelper(driver);
        browserManager = new BrowserManager(driver);
        windowPage = new WindowPage(driver);

    }
}
