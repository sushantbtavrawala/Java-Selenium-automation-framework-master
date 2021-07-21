package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import java.util.Map;
import pages.Employee;

public class employee {

    Employee employee = new Employee();

    @Then("^user enter following details$")
    public void user_enter_following_details(DataTable testdata) throws Throwable {
        for (Map<Object, Object> data : testdata.asMaps(String.class, String.class)) {
            employee.enter_name((String) data.get("Name"));
            employee.enter_Salary((String) data.get("Salary"));
            employee.select_durationworked((String) data.get("DurationWorked"));
            employee.select_grade((String) data.get("Grade"));
            employee.enter_Email((String) data.get("Email"));
        }
    }
    @Then("^user click Create button$")
    public void user_click_create_button() throws Throwable {
            employee.click_createButton();
    }

}
