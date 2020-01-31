package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class AirAsisStepsOne {
	
	@Given("Launch the browser and navigate to AirAsia with given {string}")
	public void launch_the_browser_and_navigate_to_AirAsia_with_given(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Air.navigatetoAirAsia(string);
	   
	}
	@When("Verify the title  of the page")
	public void verify_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
		Air.verifyTitle();
	}


	
	@Then("Navigate and search one way from {string} to {string} with given {string}")
	public void navigate_and_search_one_way_from_to_with_given(String string, String string2, String string3) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Air.search(string,string2,string3);
	}

	@Then("Validate the login credentinals with valid {string} and {string}")
	public void validate_the_login_credentinals_with_valid_and(String string, String string2) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Air.login(string, string2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

}
}