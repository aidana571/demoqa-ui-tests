import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AlertTest extends BaseDemoQATest{

    @Test
    void test123(){
       browserManager.navigateTo("https://demoqa.com/alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", alertPage.promtButton);
        webElementActions.click(alertPage.promtButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alertHelper.sendKeys("Silentium571");
        alertHelper.acceptAlert();
    }
}
