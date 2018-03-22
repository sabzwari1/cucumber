/**
 * 
 */
package com.api.cucumber.stepDefinations;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author sss033
 *
 */
public class loginStepDefinations {
	@Given("^User is at the login page of the application$")
	public void user_is_at_the_login_page_of_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User loing with the username and password as$")
	public void user_loing_with_the_username_and_password_as(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> table = arg1.raw();
		
		for(List<String> str:table){
			for(String str1:str){
				System.out.println(str1);
			}
		}
	}

	@Then("^User should be able to login with correct user name and password$")
	public void user_should_be_able_to_login_with_correct_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
