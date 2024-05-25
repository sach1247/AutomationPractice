package com.TestAutomationPractice.testCases;

import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.LoginPage;
import com.TestAutomationPractice.pageObjects.LogoutPage;

import junit.framework.Assert;

public class TC_002_LogoutTest extends BaseClass {

	public LoginPage lp;
	public LogoutPage lg;
	
	
	@Test
	public void testLogout() {
		
		lp=new LoginPage(driver);
		lg=new LogoutPage(driver);
		lp.setUsername("practice");
		lp.setPassword("SuperSecretPassword!");
		lp.clickOnLogin();
		
		lg.clickOnLogout();
	
		
		Assert.assertEquals(lp.checkLogout(), "You logged out of the secure area!");
	}
}
