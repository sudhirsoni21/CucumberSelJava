package com.test.stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/Features",
	glue = {"com/test/stepDefinition"},
	monochrome = true,
	tags = "@LoginTest",
	plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html",
						"json:target/JsonReport/TestReport.json",
						"junit:target/JunitReport/JunitReport.xml"}
	)

//*******For reporting "plugin" either could use as above for different format*********	

//*********Or could use all of them as below********	
	//plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html"},
	//plugin = {"pretty", "json:target/JsonReport/TestReport.json"},
	//plugin = {"pretty", "junit:target/JunitReport/JunitReport.xml"},

public class TestLoginRunner {

}
