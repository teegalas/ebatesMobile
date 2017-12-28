package com.ebates.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Page object for create account page.
 * 
 * @author steegala
 *
 */
public class CreateAccountPage {
	AppiumDriver<WebElement> driver;

	/**
	 * constructor method to associate appium driver to the current page.
	 * 
	 * @param driver
	 */
	public CreateAccountPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSFindBy(id = "userName")
	private WebElement userNameField;

	@iOSFindBy(id = "password")
	private WebElement passwordField;

	@iOSFindBy(id = "joinButton")
	private WebElement joinButton;

	@iOSFindBy(id = "joinWithFacebook")
	private WebElement joinWithFacebookButton;

	@iOSFindBy(id = "joinWithGoogle")
	private WebElement joinWithGoogleButton;

	@iOSFindBy(id = "logIn")
	private WebElement logIn;

	public LogInPage logInAsExistingUser() {
		logIn.click();
		return new LogInPage(driver);
	}

}
