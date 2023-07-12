package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {
// import io.cucumber.java.en.Given;
	
	@Given("^User is on NetBanking landing page$")
	public void User_is_on_net_banking_landing_page() {
		System.out.println("Given");
	}
	
	@When("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password() {
		System.out.println("When");
	}
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Then");
	}
	@And("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("And");
	}
	
}
