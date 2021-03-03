package com.test.stepsForBackground;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/BackgroundFeature/BackgroundTest.feature",
	glue = {"com/test/stepsForBackground"},
	monochrome = true,
	tags = "@BackgroundTest",
	plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html",
						"json:target/JsonReport/TestReport.json",
						"junit:target/JunitReport/JunitReport.xml"
						})

public class TestBackgroundRunner {
	
}
