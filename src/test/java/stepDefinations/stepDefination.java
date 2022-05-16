package stepDefinations;



import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDefination {
	

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		System.out.println("Navigated to landing page");
		
	}
	
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() {
		System.out.println("enter username and password");
	}
	
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("home page");
	}
	
	@And("^cards displayed$")
	public void cards_displayed() {
		System.out.println("cards displayed");
	}
}
