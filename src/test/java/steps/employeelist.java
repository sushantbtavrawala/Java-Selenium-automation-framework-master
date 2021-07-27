package steps;

import io.cucumber.java.en.*;
import pages.EmployeeList;
import pages.EmployeeSearch;

public class employeelist {

    EmployeeList employeelist = new EmployeeList();
    EmployeeSearch empsearch = new EmployeeSearch();

    @When("^user navigate to the Employee list page$")
    public void user_navigate_to_the_employee_list_page() throws Throwable {
        employeelist.click_link_employeelist();
    }

    @And("^user click Create New button$")
    public void user_click_create_new_button() throws Throwable {
        employeelist.click_Create_New_Button();
    }

    @And("^user enter \"([^\"]*)\" in the search box$")
    public void user_enter_something_in_the_search_box(String name) throws Throwable {
        employeelist.enter_SearchName(name);
    }

    @And("^user click Search button$")
    public void user_click_search_button() throws Throwable {
        employeelist.click_SearchButton();
    }

    @Then("I validate the name contains {string}")
    public void i_validate_the_name_contains(String name) {
        empsearch.employeeSearchTableValueByName(name);
    }
}
