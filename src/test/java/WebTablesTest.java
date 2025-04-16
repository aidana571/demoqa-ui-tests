import demoQa.entity.EmployeeEntity;
import demoQa.page.BasePage;
import demoQa.page.WebTablesPage;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTablesTest extends BaseDemoQATest{

    @Test
    public void testWebTable(){

        browserManager.navigateTo("https://demoqa.com/webtables");
        WebTablesPage webTablesPage = new WebTablesPage();

        List<EmployeeEntity> employeeEntities = webTablesPage.getEmployeesFromTable();
        for (EmployeeEntity employeeEntity : employeeEntities){
            System.out.println(employeeEntity);
        }

    }
}
