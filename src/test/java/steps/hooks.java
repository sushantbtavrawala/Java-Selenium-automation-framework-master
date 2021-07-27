package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.driverInitiate;

public class hooks extends driverInitiate {

   @Before(order = 1)
    public void startup() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After(order =2)
    public void afterScenario() {
      driver.close();
    }
}
