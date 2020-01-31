package hellocucumber;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/mindtree443/Cucumber/cucumber-archetype/src/test/java/hellocucumber/airAsia.feature",

plugin = {"pretty", "html:target/cucumber-reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/test-output/ExtentReport.html"
		,"json:target/cucumber-reports/cucumber.json"}

		)

public class AirAsiaRunner {
	
}
