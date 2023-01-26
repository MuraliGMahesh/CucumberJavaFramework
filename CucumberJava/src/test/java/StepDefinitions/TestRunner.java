package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/LoginDemo_PF.feature",
		glue = {"StepDefinitions" }, 
		plugin = { "pretty",
		"json:target/MyReports/report.json", 
		"junit:target/MyReports/report.xml",
		"html:target/MyReports/report.html",
		}, 
		monochrome = false, // to beautify results in console
		publish = false, // to get report in cucumber cloud i.e. cucumber.io
		dryRun = false, // to skip if some step definition is missing
		//strict=false  // deprecated
		tags= ("@regression and @smoke")
		)
public class TestRunner {

}
