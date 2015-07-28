package com.wipro.dias.pages;

import net.thucydides.core.pages.PageObject;

import com.wipro.dias.util.Constants;
import com.wipro.dias.util.Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends PageObject {
	// private static Logger appLogs = Logger.getLogger(HomePage.class);
	public static Logger APP_LOGS = Logger.getLogger(HomePage.class);

	public HomePage(WebDriver driver) {
		super(driver);
		APP_LOGS.info("HomePage instantiated");
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();		
	}

	public void hoverLinkEntertainmentClickFindPackage() {
		String element1 = Util.OR_HOME_PAGE.getProperty("tabEntertainment");
		Actions builder = new Actions(getDriver());
		Action mouseOverEntertainment = builder.moveToElement($(element1))
				.build();
		String element2 = Util.OR_HOME_PAGE.getProperty("linkFindYourPackage");
		Action mouseOverFindYourPackage = builder.moveToElement($(element2))
				.click().build();
		mouseOverEntertainment.perform();
		Util.pause(10);
		mouseOverFindYourPackage.perform();
		Util.mouseMoveToPoint(20, 20);
	}

	public final void typeFieldSearchBox(final String keyword) {
		APP_LOGS.info("Search Keyword = " + keyword);
		Util.pause(2);
		String element = Util.OR_HOME_PAGE.getProperty("fieldSearchBox");
		$(element).type(keyword);
	}

	public final void clickButtonSearch() {
		String element = Util.OR_HOME_PAGE.getProperty("buttonSearch");
		$(element).click();
	}

	public String verifySearchTitleInSearchResultsPage() {
		// //*[@id="selectedFilters"]/div/span[1]
		String element = Util.OR_PLP.getProperty("titleSearch");
		return $(element).getText();
	}

	public void clickLinkTravellingWithUs() {

		String element = Util.OR_HOME_PAGE.getProperty("travellingWithUs");
		$(element).click();
	}

	public void clickLinkDeltaSkyClub() {
		String element = Util.OR_HOME_PAGE.getProperty("deltaskyclub");
		$(element).click();		
	}

	public void clickLinkOneDayPass() {
		String element = Util.OR_HOME_PAGE.getProperty("onedayPass");
		$(element).click();			
	}

	public void clickOption() {
		String element = Util.OR_HOME_PAGE.getProperty("choosePass");
		$(element).click();				
	}

	public void enterQty(String quantity) {
		String element = Util.OR_HOME_PAGE.getProperty("quantity");
		$(element).type(quantity);			
	}

	public void enterAddress(String address) {
		String element = Util.OR_HOME_PAGE.getProperty("address1");
		$(element).type(address);				
	}

	public void enterCity(String city) {
		String element = Util.OR_HOME_PAGE.getProperty("city");
		$(element).type(city);				
	}

	public void enterZip(String zip) {
		String element = Util.OR_HOME_PAGE.getProperty("zip");
		$(element).type(zip);				
	}

	public void selectsState() {
		String element = Util.OR_HOME_PAGE.getProperty("state");
		$(element).click();			
	}

	public void selectsLocation() {
		String element = Util.OR_HOME_PAGE.getProperty("location");
		$(element).click();			
	}

	public void clickAddToCartButton() {
		String element = Util.OR_HOME_PAGE.getProperty("addToCart");
		$(element).click();				
	}

	public String verifyWhetherPassAddedToCart() {
		String element = Util.OR_HOME_PAGE.getProperty("addedToCart");
		return $(element).getText();
	}

	public void clickSymbolCart() {
		String element = Util.OR_HOME_PAGE.getProperty("incart");
		$(element).click();				
	}

	public void clickRemoveButton() {
		String element = Util.OR_HOME_PAGE.getProperty("removeFromCart");
		$(element).click();			
	}

	public String verifyWhetherPassHasbbenRemovedFromCart() {
		String element = Util.OR_HOME_PAGE.getProperty("removedFromCart");
		return $(element).getText();
	}

	public void clickLinkSkyMiles() {
		String element = Util.OR_HOME_PAGE.getProperty("skymiles");
		$(element).click();		
	}

	public void clickLinkJoinSkyMiles() {
		String element = Util.OR_HOME_PAGE.getProperty("joinSkyMiles");
		$(element).click();			
	}

	public void userFillsBasicInformation(String firstName, String lastName) {
		String fn = Util.OR_HOME_PAGE.getProperty("firstName");
		$(fn).type(firstName);	
		String ln = Util.OR_HOME_PAGE.getProperty("lastName");
		$(ln).type(lastName);	
	}

	public void selectsDOBandGender() {
		String gender = Util.OR_HOME_PAGE.getProperty("gender");
		$(gender).click();
		String month = Util.OR_HOME_PAGE.getProperty("month");
		$(month).click();
		String day = Util.OR_HOME_PAGE.getProperty("day");
		$(day).click();
		String year = Util.OR_HOME_PAGE.getProperty("year");
		$(year).click();
	}

	public void clickCompleteButton() {
		String element = Util.OR_HOME_PAGE.getProperty("completeButton");
		$(element).click();				
	}

	public String displayWelcomeScreen() {
		String element = Util.OR_HOME_PAGE.getProperty("accountPage");
		return $(element).getText();
	}
}
