/**
 * 
 */
package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author sss033
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, dryRun = false, features = {
		"src/main/java/com/api/cucumber/features/loginFeature.feature" }, glue={"com.api.cucumber.stepDefinations"})
public class runnerLogin {

}
