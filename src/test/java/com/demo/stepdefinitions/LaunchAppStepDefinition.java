package com.demo.stepdefinitions;

import com.demo.pageobjects.SearchPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchAppStepDefinition extends SearchPageObject{
	
	@Given("the user is on the homepage of AdNabuTestStore")
	public void verify_Homepage() {
	   validate_HomePage();
	}

	@When("the user enters a valid product name {string} in the search bar")
	public void enter_Product(String productName) throws InterruptedException {
		enter_ProductName_Searchbox(productName);
	}

	@Then("the homepage of AdNabuTestStore should be displayed without errors")
	public void verify_ProductName() {
	  
	}
}
