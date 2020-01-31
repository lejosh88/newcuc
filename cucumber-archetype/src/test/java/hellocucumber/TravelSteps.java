package hellocucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TravelSteps {
	@Given("Navigate to NewTour with given {string}")
	public void navigate_to_NewTour_with_given(String url)
	{
	   Tour.navigate(url);
	}
	@Given("Click to registeration link")
	public void click_to_registeration_link() {
	    // Write code here that turns the phrase above into concrete actions
		 Tour.registerationLink();
	}
	@When("Enter all mandatory fields for registeration {string},{string},{string},{string},{string},{string},{string},{string}")
	public void enter_all_mandatory_fields_for_registeration(String firstName, String lastName, String phone, String userName, String country, String email, String password, String confrimPassword) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Tour.registerationFieldEntry(firstName,lastName,phone,userName,country,email,password,confrimPassword);
	}
	@When("Submit the form")
	public void submit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
		Tour.registerationSubmission();
	}
	@When("log in to the application with given {string} and {string} registeration credentionals")
	public void log_in_to_the_application_with_given_and_registeration_credentionals(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Tour.tourLogin(username,password);
	}
	@Then("Validate registeration is successful or not.")
	public void validate_registeration_is_successful_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		 Tour.loginValidation();
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
