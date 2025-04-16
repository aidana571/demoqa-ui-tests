import demoQa.page.TextBoxPage;
import org.testng.annotations.Test;

public class TextBox2 extends BaseDemoQATest {



    @Test
    void testTextBox2(){
        driver.get("https://demoqa.com/text-box");
        textBoxPage.fillUserName("Admin")
                .fillUserEmail("Admin@gmail.com")
                .fillCurrentAddress("Maun Str")
                .fillPermanentAddress("sout Str")
                .clickSubmit();
    }
}
