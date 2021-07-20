package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.driverInitiate;

public class loginToApplication {

    LoginPage loginPage = new LoginPage();

    @Given("^user navigate to the url \"([^\"]*)\"$")
    public void user_navigate_to_the_url_something(String url) throws Throwable {
        loginPage.open_Browser(url);
    }

    @And("^user navigate to the login page$")
    public void user_navigate_to_the_login_page() throws Throwable {
        loginPage.click_Login_Link();
    }

    @When("^user entered username \"([^\"]*)\" password \"([^\"]*)\"$")
    public void user_entered_username_something_password_something(String username, String password) throws Throwable {
        loginPage.enter_Username_Password(username, password);
    }

    @And("^user click \"([^\"]*)\" button$")
    public void user_click_something_button(String login) throws Throwable {
        loginPage.click_Login_Button();
    }

    @Then("^page title \"([^\"]*)\" is displayed$")
    public void page_title_something_is_displayed(String pagetitle)  {
        loginPage.validate_Page_Title(pagetitle);
    }
}
