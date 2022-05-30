package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.stepDefinition"}

		,monochrome=true
		//,dryRun=true
		,plugin= {"pretty"
		,"html:target/HtmlReports/report.html"
		,"junit:target/JUnitReports/reports.xml"
		,"json:target/JSonReports/reports.json"
}
		)

public class Regression {

}
