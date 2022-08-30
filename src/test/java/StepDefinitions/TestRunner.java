package StepDefinitions;
import org.junit.runner.RunWith;

import io.cucumber.junit.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class )


@CucumberOptions(features = {"src/test/resources/features"}

,glue = {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "html:target/HtmlReports.html",
"pretty", "json:target/cucumber.json",
"pretty", "junit:target/Reports.xml",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestRunner {
	
	

}

