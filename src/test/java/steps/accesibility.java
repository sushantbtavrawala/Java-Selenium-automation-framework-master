package steps;

import utils.Accessibility;
import io.cucumber.java.en.Then;
import pages.EmployeeList;
import pages.Home;

public class accesibility {

    EmployeeList employeeList = new EmployeeList();
    Accessibility accessibility = new Accessibility();
    Home homePage = new Home();

    @Then("user validate accessibility test on {string} page")
    public void user_complete_accessibility_test_on_page(String pageName) {

        if(pageName.equalsIgnoreCase("Home"))
        {            homePage.click_HomeLink();        }
        else if (pageName.equalsIgnoreCase("employee list"))
        {            employeeList.click_link_employeelist();        }
        accessibility.validateFooterLinks(pageName);
        accessibility.accessibilityViolationTest(pageName);
    }
}
