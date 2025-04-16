import org.testng.annotations.Test;

public class ButtonsTest extends BaseDemoQATest{

    @Test
    public void buttonsTest(){
        driver.get("https://demoqa.com/buttons");
        webElementActions.doubleClick(buttonsPage.doubleClickBtn)
                .rightClick(buttonsPage.rightClickBtn);

    }
}
