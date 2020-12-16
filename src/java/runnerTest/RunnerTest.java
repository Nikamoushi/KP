package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/resources",
        glue = {"stepDefinitions"},
        tags = "@all"
//        dryRun = false,
//        strict = false
)

public class RunnerTest {
    @Before
    public void tessstBefore() {
     System.out.println("TestRUNNER");
 }
}
