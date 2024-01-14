package com.demo.utils;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/avina/eclipse-workspace/Mobile_And_Web_Automation/src/test/resources/features",
		glue = {"com/demo/stepdefinitions","com/demo/utils"},
		plugin = { "pretty", "html:target/cucumber-reports/Cucumber.html" },
		monochrome = true
		)
public class MyTestRunner {

}
