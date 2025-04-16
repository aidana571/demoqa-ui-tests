import org.testng.annotations.Test;

public class WindowTest extends BaseDemoQATest {

    @Test
    public void testWindow(){
        driver.get("https://demoqa.com/browser-windows");

        for (int i = 0; i < 5; i++){
            webElementActions.click(windowPage.tabButton);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        browserManager.switchToWindow(1);
        System.out.println(browserManager.getWindowHandles() + "size ");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        browserManager.switchToDefaultWindowWithChildClose();
    }
}
