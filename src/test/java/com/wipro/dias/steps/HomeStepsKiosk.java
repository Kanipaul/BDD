package com.wipro.dias.steps;

import net.thucydides.core.pages.Pages;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.wipro.dias.pages.HomePageKiosk;
import com.wipro.dias.util.Util;

/**
 * This class maps test steps of Home page in CSR platform to Java code.
 * 
 * @author Imran Khan
 * 
 */
@SuppressWarnings("serial")
public class HomeStepsKiosk extends AbstractPlatform {
	private static Logger appLogs = Logger.getLogger(HomeStepsKiosk.class);

	/**
	 * Constructor.
	 * 
	 * @param pages
	 *            An instance of Pages class
	 */
	public HomeStepsKiosk(final Pages pages) {
		super(pages);
		appLogs.log(Level.INFO, getClass().getPackage().getName()
				+ " Instantiated");
	}

	private HomePageKiosk homePageKiosk;

	
	@Override
	protected void theUserIsInHomePage() {
		homePageKiosk.open();
		Util.pause(2);
		
	}

}
