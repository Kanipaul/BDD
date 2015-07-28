package com.wipro.dias.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.wipro.dias.util.Util;

import net.thucydides.core.pages.PageObject;

public class ProductDetailsPage extends PageObject  {
	//private static Logger appLogs = Logger.getLogger(HomePage.class);
	public static Logger APP_LOGS = Logger.getLogger(ProductDetailsPage.class);
	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		APP_LOGS.info("Product Details Page instantiated");
	    }

	public void theUserIsInPdp() {
		
	}

	public String theUserSeesItemDescriptionInPdp() {
		String element = Util.OR_PDP.getProperty("textItemDescriptionInPdp");
		return ($(element).getText());
	}

	public void userSelectsProductFromTheList() {
		String element = Util.OR_HOME_PAGE.getProperty("product");
		$(element).click();		
	}
	
	
}
