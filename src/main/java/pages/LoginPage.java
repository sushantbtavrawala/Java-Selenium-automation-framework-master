package pages;

import org.openqa.selenium.By;
import utils.driverInitiate;

import java.io.IOException;

public class LoginPage extends driverInitiate {

    private static By login_Link = By.id("loginLink");
    private static By enter_Username = By.id("UserName");
    private static By enter_Password = By.id("Password");
    private static By login_Button = By.cssSelector(".btn-default");

    public void open_Browser(String url) throws IOException
    {        driver.get(url);    }

    public void click_Login_Link()
    {
        find(login_Link).click();
    }

    public void enter_Username_Password(String username, String password)
    {
        find(enter_Username).sendKeys(username);
        find(enter_Password).sendKeys(password);
    }

    public void click_Login_Button()
    {
        find(login_Button).click();
    }

}
