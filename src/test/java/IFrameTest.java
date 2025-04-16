import demoQa.helper.IframeHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IFrameTest extends BaseDemoQATest{

    @Test
    void testFrame(){
        driver.get("https://demoqa.com/frames");

        IframeHelper iframeHelper = new IframeHelper(driver);
        iframeHelper.switchToFrame("frame1");
        System.out.println( driver.findElement(By.id("sampleHeading")).getText());
        iframeHelper.switchToParentFrame();
    }
}
