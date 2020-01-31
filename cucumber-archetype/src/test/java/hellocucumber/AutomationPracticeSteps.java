package hellocucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationPracticeSteps {

	@Given("Navigate to Automation Practice with given {string}")
	public void navigate_to_Automation_Practice_with_given(String url) {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.navigate(url);
	}
	@Given("Validate the Email {string}")
	public void validate_the_Email(String email) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.createAnAccount(email);
	}
	@When("Enter all mandatory fields for registeration {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void enter_all_mandatory_fields_for_registeration(String firstName, String lastName, String password, String FnameInAddr, String LnameinAddr, String company, String addressone, String addresstwo, String city, String state, String postcode, String Country, String Otherinfo, String Phone, String Mobile, String alias) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.registerationFieldEntry(firstName, lastName, password, FnameInAddr, LnameinAddr, company, addressone, addresstwo, city, state, postcode, Country, Otherinfo, Phone, Mobile, alias);
	}
	@When("Submit the form AutomationPractice")
	public void submit_the_form_AutomationPractice() {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.registerationSubmission();
	}
	@Then("Validate AutomationPractice registeration is successful or not.")
	public void validate_AutomationPractice_registeration_is_successful_or_not() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.a_validation();	   
	}
	@Then("Validate error message {string}")
	public void validate_error_message(String error) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		AutomationPracticeOne.error_validation(error);
	}



	
}
