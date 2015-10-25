package com.training.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com/training/feature/", tags={"@search,@Test"},format = {"html:target/cucumber-html-report", "json:target/cucumber-json-" +"report.json","junit:taget_junit/cucumber.xml"})
public class RunnerTest {

}