package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.driverInitiate;
import java.util.List;

public class EmployeeSearch extends driverInitiate {

    String beforeXpathName = "/html/body/div[2]/table/tbody/tr[";
    String afterXpathName = "]/td[1]";

     public void employeeSearchTableValueByName(String name) {

        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[2]/table/tbody/tr"));
        int rowCount = rows.size();
        System.out.println(rowCount);

        for (int i = 2; i <= rowCount; i++) {
            String customXpath = beforeXpathName+i+afterXpathName;

            WebElement element =  find(By.xpath(customXpath));
            Assert.assertTrue(name,element.getText().equalsIgnoreCase(name));
            System.out.println(element.getText() + " is found at position :" + (i - 1));
        }
    }
}

