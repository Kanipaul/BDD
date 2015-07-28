package com.wipro.dias.pages;

import net.thucydides.core.pages.PageObject;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * This Page class includes overloaded methods for CSR platform.
 * 
 * @author Imran Khan.
 * 
 */
public class HomePageCsr extends PageObject {
	private static Logger appLogs = Logger.getLogger(HomePageCsr.class);

	/**
	 * Constructor.
	 * 
	 * @param driver
	 *            Current webDriver
	 */
	public HomePageCsr(final WebDriver driver) {
		super(driver);
		appLogs.log(Level.INFO, getClass().getPackage().getName() + " Instantiated");
	}

}
