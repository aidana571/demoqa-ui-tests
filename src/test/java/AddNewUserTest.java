import demoQa.entity.User;
import demoQa.fileUtils.ConfigReader;
import org.testng.annotations.Test;

public class AddNewUserTest extends BaseDemoQATest {
    @Test
    public void addNewUserTest(){
//        driver.get("https://state312.talentlms.com/index/?redirect=%2Fcourse%2Findex");
        // временно отключен

//        User randomUser = randomUserGenerator.randomUser();
        loginPage.doLogin(ConfigReader.getProperty("userName"), ConfigReader.getProperty("password"));
         try {
             Thread.sleep(8000);
         } catch (InterruptedException e){
             throw new RuntimeException(e);
         }

         dashBoardPage.showUserList();


    }
}
