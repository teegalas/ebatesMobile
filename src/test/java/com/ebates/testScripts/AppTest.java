package com.ebates.testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/**
 * Config class for Appium driver.
 * 
 * @author steegala
 *
 */
public class AppTest {
	private AppiumDriver<WebElement> driver;

	private AppiumDriverLocalService service;
    
	/**
	 * start appium server before test suite. 
	 */
	@BeforeSuite
	public void startAppiumServer() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}
    /**
     * stop appium server after test suite.
     */
	@AfterSuite
	public void stopAppiumServer() {
		service.stop();
	}
    
	/**
	 * Create appium driver before each test. 
	 */
	@BeforeTest
	public void createDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "11.2");
		capabilities.setCapability("deviceName", "iPhone 8");
		capabilities.setCapability("app", "/Path/To/Ebates.app");

		try {
			driver = new IOSDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// handle exception
			e.printStackTrace();
		}
	}
    
	/**
	 * quit appium driver after each test. 
	 */
	@AfterTest
	public void quitDriver() {
		driver.close();
	}
    /**
     * method to use appium driver in tests. 
     * @return appium driver.
     */
	public AppiumDriver<WebElement> appiumDriver() {
		return driver;
	}

}
