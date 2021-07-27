package pages;

import org.openqa.selenium.By;
import utils.driverInitiate;

public class Home extends driverInitiate {

    private static By HomeLink = By.linkText("Home");


    public void click_HomeLink()
    {
        find(HomeLink).click();
    }
}
