package demoQa.helper;

import org.openqa.selenium.WebDriver;

import java.lang.ref.SoftReference;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class BrowserManager {

    private WebDriver driver;

    public BrowserManager(WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo( final String URL){
    driver.navigate().to(URL);
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void goForward(){
        driver.navigate().forward();
    }

    public void refresh(){
        driver.navigate().refresh();
    }

    public Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }

    public void switchToWindow(int index){
        LinkedList<String> windowsId  = new LinkedList<>(getWindowHandles());
        for (String window : windowsId){
            System.out.println(window);
        }

        if (index < 0 || index > windowsId.size()){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + windowsId.size());
        }
        driver.switchTo().window(windowsId.get(index));
    }

    public void switchToDefaultWindow(){
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        driver.switchTo().window(windowsId.get(0));
    }

    public void switchToDefaultWindowWithChildClose(){
        switchToDefaultWindow();
        LinkedList<String> windowsId = new LinkedList<>(getWindowHandles());
        for (int i = 1; i < windowsId.size(); i++){
            driver.switchTo().window(windowsId.get(i));
            driver.close();
        }


    }
}
