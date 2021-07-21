package steps;

import io.cucumber.java.en.*;
import pages.EmployeeList;

public class employeelist {

    EmployeeList employeelist = new EmployeeList();

    @When("^user navigate to the Employee list page$")
    public void user_navigate_to_the_employee_list_page() throws Throwable {
        employeelist.click_link_employeelist();
    }

    @And("^user click Create New button$")
    public void user_click_create_new_button() throws Throwable {
        employeelist.click_Create_New_Button();
    }

}
