package pages;

import org.openqa.selenium.By;
import utils.driverInitiate;

public class EmployeeList extends driverInitiate {

    private static By EmployeeListLink = By.linkText("Employee List");
    private static By CreateNewButton = By.cssSelector(".btn-primary");

    public void click_link_employeelist()
    {
        find(EmployeeListLink).click();
    }

    public void click_Create_New_Button()
    {
        find(CreateNewButton).click();
    }
}
