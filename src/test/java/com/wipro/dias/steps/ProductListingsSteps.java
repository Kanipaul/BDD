package com.wipro.dias.steps;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.lang.reflect.InvocationTargetException;

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

import com.wipro.dias.pages.HomePage;
import com.wipro.dias.pages.ProductListingsPage;
import com.wipro.dias.util.Util;



public class ProductListingsSteps extends ScenarioSteps {
	
	private ProductListingsPage plp;
	
	
	private static Logger appLogs = Logger.getLogger(ProductListingsSteps.class);
	
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
	public ProductListingsSteps(final Pages pages) throws ClassNotFoundException,
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

	
	@Then("the user is in Product Listings page")
	public void theUserIsInSearchResultsPage(){
		String expected = "Search:";
		String actual = plp.verifySearchTitleInProductListingsPage();
		assert(actual.toLowerCase().contains(expected.toLowerCase()));
			}
}
