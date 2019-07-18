package stepdefinition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/" }, tags = {
		"@addcust" }, strict = true, dryRun = false, glue = {
				"stepdefinition" }, monochrome = true, plugin = {"html:target","json:target/cucumberReport.json","rerun:src/test/resources/failedscenarios.txt"})
public class TestRunner {

}
