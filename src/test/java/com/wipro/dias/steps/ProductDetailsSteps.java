package com.wipro.dias.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;

import com.wipro.dias.pages.ProductDetailsPage;

public class ProductDetailsSteps {
	
	@Steps
	ProductDetailsPage productDetailsPage;
	
	
	@Then("the user is in Product Details Page")
	public void theUserIsInPdp() {
		productDetailsPage.theUserIsInPdp();
	}
	
	@Then("the user sees <itemDescriptionInPdp> in Product Details Page")
	public void theUserSeesItemDescriptionSearchResults(@Named("itemDescriptionInPdp") final String expected) {
		
	}
	
	@Then("the user selects product from the list")
	public void userSelectsProductFromTheList(){
		productDetailsPage.userSelectsProductFromTheList();
	}
	
}
