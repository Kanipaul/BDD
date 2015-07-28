package com.wipro.dias.steps;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.InvocationTargetException;
import java.sql.Driver;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import net.thucydides.core.steps.StepFactory;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import org.openqa.selenium.WebDriver;

import com.wipro.dias.pages.HomePage;
import com.wipro.dias.util.Constants;
import com.wipro.dias.util.Util;



public class HomeSteps extends ScenarioSteps {
	
	private HomePage homePage;
	@Steps
	private AbstractPlatform platform;
	
	private static Logger appLogs = Logger.getLogger(HomeSteps.class);
	
	/**
	 * Constructor.
	 * 
	 * @param pages
	 *            Pages object
	 * @throws ClassNotFoundException
	 *             Class not found exception
	 * @throws InstantiationException
	 *             Instantiation exception
	 * @throws IllegalAccessException
	 *             Illegal access exception
	 * @throws NoSuchMethodException
	 *             No such method exception
	 * @throws InvocationTargetException
	 *             Invocation target exception
	 */
	public HomeSteps(final Pages pages) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			NoSuchMethodException, InvocationTargetException {
		super(pages);
		appLogs.log(Level.INFO, getClass().getPackage().getName()
				+ " Instantiated");
		thePages = pages;
	}

	private Pages thePages;

	public Pages getThePages() {
		return thePages;
	}
	
	
	private AbstractPlatform getThePlatform() throws ClassNotFoundException {
		String platformClassName = getClass().getPackage().getName()
				+ ".HomeSteps" + Util.getPlatform();
		platform = (AbstractPlatform) new StepFactory(getThePages())
				.instantiateNewStepLibraryFor(Class.forName(platformClassName));
		appLogs.info(Util.getMethodName(0) + "(): instantiated. platform = "
				+ Util.getPlatform());
		return platform;
	}
	
	@Given("the user is in homepage")
	public void theUserIsInHomePage() throws ClassNotFoundException {

		getThePlatform().theUserIsInHomePage();
	
	}
	
	@Given("the user is in homepage and looks for the todays deal")
	public void theUserIslooksForNewDeals(){
		homePage.open();
	}
	
	
	/**
	 * This is reference method for Hover feature. This step is not used anywhere.
	 * 
	 */
	@When("the user hovers on Entertainment tab selects Find Your Package")
	public void userHoversOverEntertainmentAndSelectsFindYourPackage(){
		homePage.hoverLinkEntertainmentClickFindPackage();
		appLogs.info(Util.getMethodName(0) + "() in class: " + this.getClass().getName());
	}
	
	@When("the user searches for a product with '<keyword>' from HomePage")
	public void theUserLooksFor(@Named("keyword") final String keyword) {
		appLogs.info("Search Keyword = " + keyword);
		homePage.typeFieldSearchBox(keyword);
		homePage.clickButtonSearch();
	}
	
	@Then("the user waits for '$waitTime' seconds")
	public void theUserWaitsForGivenAmountOfTime(final int waitTime) {
		Util.pause(waitTime);
	}
	
	@Then("the user is in search results page")
	public void theUserIsInSearchResultsPage(){
		String expected = "Search:";
		String actual = homePage.verifySearchTitleInSearchResultsPage();
		//assertThat(actual.toLowerCase(), containsString(expected.toLowerCase()));
		assert(actual.toLowerCase().contains(expected.toLowerCase()));
		//assertThat(actual,is(expected));
		//assertTrue("Search Title is not visible", actual.toLowerCase().contains(expected.toLowerCase()));
	}
	
	@When ("the user clicks on travelling with us")
	public void userClicksOnTravellingWithUs(){
		homePage.clickLinkTravellingWithUs();
	}
	@When("the user clicks on delta sky club")
	public void userClicksOnDeltaSkyClub(){
		homePage.clickLinkDeltaSkyClub();
	}
	@When("the user clicks on One day pass")
	public void userClicksOnOneDayPass(){
		homePage.clickLinkOneDayPass();
	}
	@When("the user selects option")
	public void userSelectsOption(){
		homePage.clickOption();
	}
	@When("the user enter <'quantity'>,<'address'>,<'city'>, <'zip'>")
	public void userEntersDetails(String quantity,String address, String city, String zip){
		homePage.enterQty(quantity);
		homePage.enterAddress(address);
		homePage.enterCity(city);
		homePage.enterZip(zip);
	}
	@When("the user selects location and state")
	public void userSelectsLocationAndState(){
		homePage.selectsState();
		homePage.selectsLocation();

	}
	
	@When("the user clicks on add to cart")
	public void userClicksOnAddToCart(){
		homePage.clickAddToCartButton();
	}
	@Then("the pass should be added to cart")
	public void addedToCart(){
		String expected = "Your Cart has been Updated.";
		String actual = homePage.verifyWhetherPassAddedToCart();
		//assertThat(actual.toLowerCase(), containsString(expected.toLowerCase()));
		assert(actual.toLowerCase().contains(expected.toLowerCase()));
		//assertThat(actual,is(expected));
		//assertTrue("Search Title is not visible", actual.toLowerCase().contains(expected.toLowerCase()));
	}
	@When("the user clicks on cart symbol")
	public void clickOnCartSymbol(){
		homePage.clickSymbolCart();
	}
	@When("the user clicks on remove button")
	public void userClicksOnRemoveButton(){
		homePage.clickRemoveButton();
	}
	@Then("the pass should be removed from the cart")
	public void verifyPassIsRemoved(){
		String expected = "Currently you have no items in your cart for purchase.";
		String actual = homePage.verifyWhetherPassHasbbenRemovedFromCart();
		//assertThat(actual.toLowerCase(), containsString(expected.toLowerCase()));
		assert(actual.toLowerCase().contains(expected.toLowerCase()));	}
	
	@When("the user clicks on skymiles")
	public void userClicksOnSkyMiles(){
		homePage.clickLinkSkyMiles();
	}
	@When("the user clicks on join sky miles")
	public void userClicksOnJoinSkyMiles(){
		homePage.clickLinkJoinSkyMiles();
	}
	@When("the user enters <'firstName'>,<'lastName'>")
	public void userEntersBasicInfo(String firstName,String lastName){
		homePage.userFillsBasicInformation(firstName,lastName);
	}
	@When("the user selects dob and gender")
	public void userSelectsDOBandGender(){
		homePage.selectsDOBandGender();
	}
	@When("the user clicks on complete button")
	public void userClicksOnCompleteButton(){
		homePage.clickCompleteButton();
	}
	@Then("the welcome page should appear")
	public void userShuoldSeeWelcomeScreen(){
		String expected = "Welcome";
		String actual = homePage.displayWelcomeScreen();
		//assertThat(actual.toLowerCase(), containsString(expected.toLowerCase()));
		assert(actual.toLowerCase().contains(expected.toLowerCase()));
	}

}
