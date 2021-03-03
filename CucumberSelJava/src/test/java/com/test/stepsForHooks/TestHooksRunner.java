package com.test.stepsForHooks;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/HooksDemoFeature/Hooks.feature",
	glue = {"com/test/stepsForHooks"},
	monochrome = true,
	tags = "@HooksTest",
	plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html",
						"json:target/JsonReport/TestReport.json",
						"junit:target/JunitReport/JunitReport.xml"}
	)

public class TestHooksRunner {

}


