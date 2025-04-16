import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class AmazonDraft extends BaseDemoQATest{

        @Test
        void test(){
            driver.get("https://www.amazon.com/");
            driver.findElement(By.xpath("//input[@type='text']"))
                    .sendKeys("iphone" + Keys.ENTER);
            List<WebElement> list = driver.findElements(By.xpath("//div[@id='brandsRefinements']//a"));
            List<String> list1 = list.stream().map(WebElement::getText).toList();
            System.out.println(list1);
            for (WebElement element:list){
                element.click();
            }
        }
    }

