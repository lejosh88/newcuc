package hellocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/mindtree443/Cucumber/cucumber-archetype/src/test/java/hellocucumber/AutomatiomPractice.feature",

plugin = {"pretty", "html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.Ext"
		+ "entCucumberAdapter:target/test-output/ExtentReport.html","json:target/cucumber-reports/cucumber.json"}

		)
public class AutomationPracticeRunner {

}
