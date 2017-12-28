package com.ebates.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Page object for home account page.
 * 
 * @author steegala
 *
 */
public class HomePage {
	AppiumDriver<WebElement> driver;

	/**
	 * constructor method to associate appium driver to the current page.
	 * 
	 * @param driver
	 */
	public HomePage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSFindBy(id = "my_account")
	private WebElement myAccount;

	public CreateAccountPage clickMyAccount() {
		myAccount.click();
		return new CreateAccountPage(driver);
	}

}
