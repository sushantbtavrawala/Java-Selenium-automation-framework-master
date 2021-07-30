package runnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"steps","hooks"},
        tags = ("@smoke"),
        plugin = {"pretty", "json:reports/cucumber.json"},
        publish = true
)
public class TestRunner {

}
