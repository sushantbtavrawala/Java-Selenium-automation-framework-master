package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.driverInitiate;

public class hooks extends driverInitiate {

    @Before
   public void startup() {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
     if(driver == null) {
         driver.close();
     }
    }
}
