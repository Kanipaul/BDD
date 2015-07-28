package com.wipro.dias.pages;

import net.thucydides.core.pages.PageObject;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * This class includes overloaded methods of Home page for Kiosk.
 * 
 * @author Imran Khan.
 * 
 */
public class HomePageKiosk extends PageObject {
	private static Logger appLogs = Logger.getLogger(HomePageKiosk.class);

	/**
	 * Constructor.
	 * 
	 * @param driver
	 *            Current driver
	 */
	public HomePageKiosk(final WebDriver driver) {
		super(driver);
		appLogs.log(Level.INFO, getClass().getPackage().getName()
				+ " Instantiated");
	}

}
