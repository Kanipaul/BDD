package com.wipro.dias.pages;

import net.thucydides.core.pages.PageObject;

import com.wipro.dias.util.Constants;
import com.wipro.dias.util.Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ProductListingsPage extends PageObject  {
	//private static Logger appLogs = Logger.getLogger(HomePage.class);
	public static Logger APP_LOGS = Logger.getLogger(ProductListingsPage.class);
	public ProductListingsPage(WebDriver driver) {
		super(driver);
		APP_LOGS.info("ProductListingsPage instantiated");
	    }
	
	
	
	public String verifySearchTitleInProductListingsPage() {
		////*[@id="selectedFilters"]/div/span[1]
		String element = Util.OR_PLP.getProperty("titleSearch");
		return $(element).getText();
	}
		
}
