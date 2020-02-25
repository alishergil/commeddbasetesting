package meddbase;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        strict = true,
        dryRun = false,
        glue = {}, //keep empty
        tags = {"@Sanity", "@wip"},
        plugin = "json:target/meddbase.json"
)

public class RunCukesTest {
// Runner class by Ali
}
