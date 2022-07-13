package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\features",
				 glue = "stepDefinition",
                 plugin= {"html:report/cucumberReports/cucumberReport.html","json:report/jsonReports/cucumberReport.json"},
                 monochrome = true)
public class TestRunner {

}
