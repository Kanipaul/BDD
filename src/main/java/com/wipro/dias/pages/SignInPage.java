package com.wipro.dias.pages;

import net.thucydides.core.pages.PageObject;

import com.wipro.dias.util.Constants;
import com.wipro.dias.util.Util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class SignInPage extends PageObject  {
	//private static Logger appLogs = Logger.getLogger(HomePage.class);
	public static Logger APP_LOGS = Logger.getLogger(SignInPage.class);
	public SignInPage(WebDriver driver) {
		super(driver);
		APP_LOGS.info("HomePage instantiated");
	    }
	
	public void clickLoginLink() {
		//String element = Util.OR_SIGN_IN_PAGE.getProperty("loginLinkOnHomePage");
		String element =  Util.OR_SIGN_IN_PAGE.getProperty("loginLinkOnHomePage");
		$(element).click();
	}
	
	public void typeUserName(final String email) {
		String element = Util.OR_SIGN_IN_PAGE.getProperty("emailField");
		$(element).type(email);
	}
	
	public void typePassword(final String pwd) {
		String element = Util.OR_SIGN_IN_PAGE.getProperty("passwordField");
		$(element).type(pwd);
	}
	
	
	public void clickLinkLoginButtonForSignIn() {
		String element = Util.OR_SIGN_IN_PAGE.getProperty("loginButton");
		$(element).click();
	}
	
	
	public void hoverLinkSignIn() {
		String element1 = Util.OR_SIGN_IN_PAGE.getProperty("signInHeader");
		
		Actions builder = new Actions(getDriver());
		Action mouseOverSignInHeader = builder.moveToElement($(element1)).build();
		
		/*String element2 = Util.OR_SIGN_IN_PAGE.getProperty("linkFindYourPackage");
		Action mouseOverFindYourPackage = builder.moveToElement($(element2)).click().build();
		*/
		mouseOverSignInHeader.perform();
		Util.pause(5);
		
		//mouseOverFindYourPackage.perform();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
