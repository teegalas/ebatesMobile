package com.ebates.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Page object for LogIn Page
 * 
 * @author steegala
 *
 */
public class LogInPage {
	AppiumDriver<WebElement> driver;

	/**
	 * constructor method to associate appium driver to the current page.
	 * 
	 * @param driver
	 */
	public LogInPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSFindBy(id = "existingUserName")
	private WebElement ExistingUserNameField;

	@iOSFindBy(id = "password")
	private WebElement passwordField;

	@iOSFindBy(id = "signInButton")
	private WebElement signInButton;

	@iOSFindBy(id = "jsignInWithFacebook")
	private WebElement signInWithFacebookButton;

	@iOSFindBy(id = "signInWithGoogle")
	private WebElement joinWithGoogleButton;

	@iOSFindBy(id = "joinNow")
	private WebElement JoinNowLink;

	public MyAccountPage signInWith(String userName, String password) {
		ExistingUserNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		signInButton.click();
		return new MyAccountPage(driver);
	}

}
