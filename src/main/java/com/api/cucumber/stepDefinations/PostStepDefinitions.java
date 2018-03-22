/**
 * 
 */
package com.api.cucumber.stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class PostStepDefinitions {

	@Given("^User should be logged on$")
	public void user_should_be_logged_on() throws Throwable {
		System.out.println("Given: User should be logged on");
	}

	@When("^I type the text in the post text box$")
	public void i_type_the_text_in_the_post_text_box() throws Throwable {
		System.out.println("When: I type the text in the post text box");
	}

	@When("^user supply the youtube link in the share video text box$")
	public void user_supply_the_youtube_link_in_the_share_video_text_box() throws Throwable {
		System.out.println("When: user supply the youtube link in the share video text box");
	}

	@Then("^Message should be posted$")
	public void message_should_be_posted() throws Throwable {
		System.out.println("Then: Message should be posted");
	}

	@Then("^Video should get posted on the user wall$")
	public void video_should_get_posted_on_the_user_wall() throws Throwable {
		System.out.println("Then: Video should get posted on the user wall");
	}

	@And("^should be present at its own wall$")
	public void should_be_present_at_its_own_wall() throws Throwable {
		System.out.println("And: should be present at its own wall");
	}

	@And("^Click on post button$")
	public void click_on_post_button() throws Throwable {
		System.out.println("And: Click on post button");
	}

	@And("^The video should have proper thumbnail$")
	public void the_video_should_have_proper_thumbnail() throws Throwable {
		System.out.println("And: The video should have proper thumbnail");
	}

	@When("^I type the text \"([^\"]*)\" in the post text box$")
	public void i_type_the_text_something_in_the_post_text_box(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

	@When("^user supply the youtube link \"([^\"]*)\" in the share video text box$")
	public void user_supply_the_youtube_link_something_in_the_share_video_text_box(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

}