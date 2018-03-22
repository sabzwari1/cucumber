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
@CucumberOptions(dryRun=false,features = {"src/main/java/com/api/cucumber/features/PostFeature.feature"},glue={"com.api.cucumber.stepDefinations"})
public class runnerFile {

}
