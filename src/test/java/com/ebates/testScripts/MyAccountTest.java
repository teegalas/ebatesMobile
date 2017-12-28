package com.ebates.testScripts;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebates.flows.LoginFlow;
import com.ebates.pages.MyAccountPage;

public class MyAccountTest extends AppTest {

	private LoginFlow loginFlow = new LoginFlow();
	
	// Note: We can use json or excel formatted test data, but for convenience i am
	// using @DataProvider.
	/**
	 * setting up testdata
	 * 
	 * @return
	 */
	 
	@DataProvider
	public Object[][] testData() {
		return new Object[][] { new Object[] { "test@gmail.com", "password" } };
	}

	/**
	 * Test the existing user log in functionality .
	 * 
	 * @param userName, account userName.
	 * @param password, account password.
	 */
	@Test(dataProvider = "testData")
	public void verifyCashBackBalanceTest(String userName, String password) {
		MyAccountPage myAccountPage = loginFlow.loginAsExistingUser(appiumDriver(), userName, password);
		String cashBackAmount = myAccountPage.cashBackBalanceAmount();

		assertNotNull(cashBackAmount, "Cash Back Balance is not displayed");
	}

}
