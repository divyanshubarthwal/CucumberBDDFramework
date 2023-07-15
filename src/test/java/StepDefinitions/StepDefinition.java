package StepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {
// import io.cucumber.java.en.Given;
	
	

	@Given("User is on NetBanking landing page1")
	public void user_is_on_net_banking_landing_page1() {
		System.out.println("Background execution");
	}



	
	@Given("^User is on NetBanking landing page$")
	public void User_is_on_net_banking_landing_page() {
		System.out.println("Given");
	}
	
	

	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
		System.out.println(string2);
	}


	@Then("^Home page is populated$")
	public void Home_page_is_populated() {
		System.out.println("Then");
	}
	
	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}

	

	@When("User login into application with follwoing details")
	public void user_login_into_application_with_follwoing_details(DataTable data) {
		List<List<String>> obj=data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	   
	}
	
	
	
	

	@When("User login into application with {string} and  {string}")
	public void user_login_into_application_with_and(String string, String string2) {
		System.out.println(string);
		System.out.println(string2);
	}













	
}
