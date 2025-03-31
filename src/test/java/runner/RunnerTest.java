package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/1_POEI20252-459.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html",
                            "json:target/cucumber.json"},
        monochrome = true,
        tags = "@POEI20252-459"

)


public class RunnerTest {

}
