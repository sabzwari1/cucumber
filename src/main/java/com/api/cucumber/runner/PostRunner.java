/**
 * 
 */
package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/java/com/api/cucumber/features/PostFeature.feature"}, glue = {
		"/src/main/java/com/api/cucumber/stepDefinations/PostStepDefinitions.java"})
public class PostRunner {

}
