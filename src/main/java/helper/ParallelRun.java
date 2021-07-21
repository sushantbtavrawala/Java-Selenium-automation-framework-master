package helper;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

public class ParallelRun extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider

    public Object[][] scenarios()    {
        return super.scenarios();
    }



}
