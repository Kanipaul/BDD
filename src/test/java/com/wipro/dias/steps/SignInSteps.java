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
import com.wipro.dias.pages.SignInPage;
import com.wipro.dias.util.Constants;
import com.wipro.dias.util.Util;



public class SignInSteps extends ScenarioSteps {
	
	private SignInPage signInPage;
	
	
	private static Logger appLogs = Logger.getLogger(SignInSteps.class);
	
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
	public SignInSteps(final Pages pages) throws ClassNotFoundException,
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
	
	
	@When("the user clicks login link")
	public void theUserClicksLogin() {
		if (Util.getBrandType().contains(Constants.AM)) {
			signInPage.hoverLinkSignIn();
		}
		signInPage.clickLoginLink();
	}
	
	@When("the user types '<userName>'")
	public void userTypesEmailInEmailField(@Named("userName") final String email) {
		signInPage.typeUserName(email);
	}
	
	@When("the user types '<password>'")
	public void userTypesPasswordInPAsswordField(@Named("password") final String password) {
		signInPage.typePassword(password);
	}
	
	
	@When("the user clicks login button")
	public void theUserClicksLoginButton() {
		signInPage.clickLinkLoginButtonForSignIn();
	}
	
	@Then("the user is logged in")
	public void theUserIsLoggedIn(){
		
	}
	
}
