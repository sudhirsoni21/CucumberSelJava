package com.test.stepsForGoogleSearch;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features ="src/test/resources/Features/GoogleSearch.feature",
	glue = {"com/test/stepDefinition"},
	monochrome = true,
	tags = "@googleSearch",
	plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html",
						"json:target/JsonReport/TestReport.json",
						"junit:target/JunitReport/JunitReport.xml"}
	)

//*******For reporting "plugin" either could use as above for different format*********	

//*********Or could use all of them as below********	
	//plugin = {"pretty", "html:target/HtmlReport/HtmlReport.html"},
	//plugin = {"pretty", "json:target/JsonReport/TestReport.json"},
	//plugin = {"pretty", "junit:target/JunitReport/JunitReport.xml"},

public class TestGoogleSearchRunner {

}
