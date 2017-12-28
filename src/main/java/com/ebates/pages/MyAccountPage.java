package com.ebates.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * Page object for my account page.
 * 
 * @author steegala
 *
 */
public class MyAccountPage {
	AppiumDriver<WebElement> driver;

	/**
	 * constructor method to associate appium driver to the current page.
	 * 
	 * @param driver
	 */
	public MyAccountPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSFindBy(id = "cashBackBalance")
	private WebElement cashBackBalanceLink;

	@iOSFindBy(id = "cashBackBalanceAmount")
	private WebElement cashBackBalanceAmount;

	@iOSFindBy(id = "nextBigFatPayment")
	private WebElement nextBigFatPayment;

	@iOSFindBy(id = "nextBigFatPaymentHistory")
	private WebElement nextBigFatPaymentHistoryLink;

	@iOSFindBy(id = "purchaseHistory")
	private WebElement purchaseHistoryLink;

	@iOSFindBy(id = "myWallet")
	private WebElement myWalletLink;

	@iOSFindBy(id = "lifeTimeCashBackAmount")
	private WebElement lifeTimeCashBackAmount;

	public String cashBackBalanceAmount() {
		return cashBackBalanceAmount.getText();
	}

}
