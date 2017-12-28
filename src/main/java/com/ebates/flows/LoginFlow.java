package com.ebates.flows;

import org.openqa.selenium.WebElement;

import com.ebates.pages.CreateAccountPage;
import com.ebates.pages.HomePage;
import com.ebates.pages.LogInPage;
import com.ebates.pages.MyAccountPage;

import io.appium.java_client.AppiumDriver;

/**
 * Login Flow class.
 * 
 * @author steegala
 *
 */
public class LoginFlow {
	/**
	 * method navigates to create account page from home page.
	 * 
	 * @param driver
	 *            appium driver
	 * @return CreateAccoutPage
	 */
	public CreateAccountPage goToMyAccount(AppiumDriver<WebElement> driver) {
		HomePage homePage = new HomePage(driver);
		return homePage.clickMyAccount();
	}

	/**
	 * Method navigates from login page from create account page.
	 * 
	 * @param driver
	 *            appium driver
	 * @return LogInPage
	 */
	public LogInPage openLoginPage(AppiumDriver<WebElement> driver) {
		CreateAccountPage accountPage = goToMyAccount(driver);
		return accountPage.logInAsExistingUser();
	}

	/**
	 * Method logins to existing account.
	 * 
	 * @param driver, appium driver
	 * @param userName, account username.
	 * @param password, account password.
	 * @return
	 */

	public MyAccountPage loginAsExistingUser(AppiumDriver<WebElement> driver, String userName, String password) {
		LogInPage loginPage = openLoginPage(driver);
		return loginPage.signInWith(userName, password);
	}

}
