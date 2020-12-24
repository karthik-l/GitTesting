package com.gittesting.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\gittesting\\feature", glue = "com\\gittesting\\stepdefinition", dryRun = false, monochrome = true, strict = true, tags = {
		"@testing" }, plugin= {"pretty"})

public class Runner {

}
