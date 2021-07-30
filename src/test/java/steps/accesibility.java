package steps;

import utils.Accessibility;
import io.cucumber.java.en.*;
import pages.EmployeeList;
import pages.Home;

import java.io.IOException;

public class accesibility {

    EmployeeList employeeList = new EmployeeList();
    Accessibility accessibility = new Accessibility();
    Home homePage = new Home();

    @Then("user navigate to the {string} page")
    public void userNavigateToThePage(String pageName) {
        if(pageName.equalsIgnoreCase("Home"))
        {
            homePage.click_HomeLink();
        }
        else if (pageName.equalsIgnoreCase("employee list"))
        {
            employeeList.click_link_employeelist();
        }
        System.out.println("Accessibility Test is counducted on page -> " + pageName);
    }

    @And("user validate {string} page against accessibility violation rules")
    public void userValidatePageAgainstAccessibilityViolationRules(String page) {
        accessibility.accessibilityViolationTest(page);
    }

    @And("^user validate page tilte$")
    public void user_validate_page_tilte() throws Throwable {
        accessibility.validateTitle();
    }

    @And("^user validate footer links$")
    public void user_validate_footer_links() throws Throwable {
        accessibility.validateFooterLinks();
    }

    @And("user validate page for any broken link")
    public void userValidateAgainstAnyBrokenLink() throws IOException {
        accessibility.validateLinks();
    }
}
