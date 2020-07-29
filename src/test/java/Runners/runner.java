package Runners;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "features\\kayak1.feature", glue = {"stepDefinition"},
				 plugin = {"html:target/cucumber-html-report", 
						 "json:target/cucumber.json", 
						 "pretty:target/cucumber-pretty.txt", 
						 "usage:target/cucumber-usage.json", 
						 "junit:target/cucumber-result.xml"})
public class runner extends AbstractTestNGCucumberTests {
	
	
	
	

}