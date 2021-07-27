package pages;

import org.openqa.selenium.By;
import utils.driverInitiate;

public class EmployeeList extends driverInitiate {

    private static By EmployeeListLink = By.linkText("Employee List");
    private static By CreateNewButton = By.cssSelector(".btn-primary");
    private static By SearchName = By.name("searchTerm");
    private static By SearchButton = By.cssSelector(".btn-default");

    public void click_link_employeelist()
    {
        find(EmployeeListLink).click();
    }

    public void click_Create_New_Button()
    {
        find(CreateNewButton).click();
    }

    public void enter_SearchName(String name) {find(SearchName).sendKeys(name);}

    public void click_SearchButton() {find(SearchButton).click();}
}
