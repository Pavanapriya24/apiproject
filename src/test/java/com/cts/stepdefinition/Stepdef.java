package com.cts.stepdefinition;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.validator.Var;
import org.json.simple.JSONObject;

import com.cts.apis.Apibank;
import com.google.common.collect.Ordering;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
 //Apibank obj =new Apibank();
	@Given("^a user$")
	public void a_user() throws Throwable {
	   
	}
	@When("^the user send request with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" to BANKING SITE$")
	public void the_user_send_request_with_to_BANKING_SITE(String title, String Type, String Holdertype, String AccountNo, String Balance) throws Throwable {
		 Apibank.apiPostRequest(title, Type, Holdertype, AccountNo, Balance);
	}


	
	

	@Then("^the status code of BANKING SITE should be \"([^\"]*)\"$")
	public void the_status_code_of_BANKING_SITE_should_be(String arg1) throws Throwable {
	    
	}


	@Then("^user id sould be created in Banking Application\\.$")
	public void user_id_sould_be_created_in_Banking_Application() throws Throwable {
	  
	}
	
	
	///put-------------
	
	@When("^the user update details request with \"([^\"]*)\"$")
	public void the_user_update_details_request_with(String title) throws Throwable {
	   Apibank.apiRequest(title);
	}


	@Then("^the status code of BANKING SITE should  \"([^\"]*)\"$")
	public void the_status_code_of_BANKING_SITE_should(String arg1) throws Throwable {
	   
	}


	
	
	
	
//-------------get


	

	@When("^the user send request to fetch the account details from banking site$")
	public void the_user_send_request_to_fetch_the_account_details_from_banking_site() throws Throwable {
	    Apibank.getRequest();
	}

	@Then("^the status code should be displayed$")
	public void the_status_code_should_be_displayed() throws Throwable {
	    Apibank.thenStatusCode();
	}

	@Then("^user sould be able to call the account details$")
	public void user_sould_be_able_to_call_the_account_details() throws Throwable {
	   Apibank.dataDetails();
	}

	// id details
	@When("^the user send request for particular id to fetch the account details from banking site$")
	public void the_user_send_request_for_particular_id_to_fetch_the_account_details_from_banking_site() throws Throwable {
	   Apibank.idDetails();
	}

	@Then("^the status code should  displayed when it get from the site$")
	public void the_status_code_should_displayed_when_it_get_from_the_site() throws Throwable {
	   Apibank.idStatusCode();
	}

	@Then("^user sould be able to call the id account details\\.$")
	public void user_sould_be_able_to_call_the_id_account_details() throws Throwable {
		Apibank.idDataDetails();
	  	}


	
	
	// joint acc
	
	@When("^the user send request  to fetch the joint account details from banking site$")
	public void the_user_send_request_to_fetch_the_joint_account_details_from_banking_site() throws Throwable {
	  Apibank.jointAccDetails();
	}

	@Then("^the status code should  display when it get from the site$")
	public void the_status_code_should_display_when_it_get_from_the_site() throws Throwable {
	    Apibank.jointAccStatusCode();
	}

	@Then("^user sould be able to call the joint account details\\.$")
	public void user_sould_be_able_to_call_the_joint_account_details() throws Throwable {
	  Apibank.jointAccDataDetails();
	}


	
	
	
	
	
	
	
	//s---3 delete

	@When("^the user send request to delete the account details from banking site$")
	public void the_user_send_request_to_delete_the_account_details_from_banking_site() throws Throwable {
	   Apibank.deleteAccount();
	}

	@When("^user sould be able to delete the account details\\.$")
	public void user_sould_be_able_to_delete_the_account_details() throws Throwable {
	   
	}

	@Then("^the status code should  displayed$")
	public void the_status_code_should_displayed() throws Throwable {
	   
	}
	
	

//sort------------------
	
	@When("^the user send resquest to sort details$")
	public void the_user_send_resquest_to_sort_details() throws Throwable {
	Apibank.sortAccDetails();
	}

	@Then("^the status code should display$")
	public void the_status_code_should_display() throws Throwable {
	    Apibank.sortAccStatusCode();
	}

	@Then("^user is able to sort the details$")
	public void user_is_able_to_sort_the_details() throws Throwable {
		Apibank.sortAccDataDetails();
	   	}

	
	//------------pagination
	@When("^the user send resquest to paginate details$")
	public void the_user_send_resquest_to_paginate_details() throws Throwable {
		Apibank.PaginationDetails();
	 
	}

	@Then("^status code should display$")
	public void status_code_should_display() throws Throwable {
		Apibank.PagniationStatusCode();
	   
	}

	@Then("^user is able to paginate the details$")
	public void user_is_able_to_paginate_the_details() throws Throwable {
		Apibank.Paginationdatadetails();
	   
	}

	
//------account02
	@When("^the user sends the request to find the number of accounts ends with (\\d+)$")
	public void the_user_sends_the_request_to_find_the_number_of_accounts_ends_with(int arg1) throws Throwable {
	   Apibank.accountEnd(arg1);
	}

	@Then("^the count for account number ends with (\\d+)$")
	public void the_count_for_account_number_ends_with(int arg1) throws Throwable {
	  
	}

	@Then("^the count for those ends with (\\d+) accounts will be displayed$")
	public void the_count_for_those_ends_with_accounts_will_be_displayed(int arg1) throws Throwable {
	    
	}

	//-----balance
	
	@When("^the user will send the request to display the number of accounts that have balance greater$")
	public void the_user_will_send_the_request_to_display_the_number_of_accounts_that_have_balance_greater() throws Throwable {
	  
	}

	@Then("^the greater than (\\d+) account balance accounts will be displayed$")
	public void the_greater_than_account_balance_accounts_will_be_displayed(int arg1) throws Throwable {
		 Apibank.balanceDetails(arg1);
	}



	

}
