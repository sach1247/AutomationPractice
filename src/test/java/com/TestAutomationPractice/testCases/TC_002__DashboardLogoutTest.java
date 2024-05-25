package com.TestAutomationPractice.testCases;

import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.DashboardLogoutPage;
import com.TestAutomationPractice.pageObjects.OrangeHrmLoginPage;

import junit.framework.Assert;

public class TC_002__DashboardLogoutTest extends BaseClass {
public OrangeHrmLoginPage lp;
public DashboardLogoutPage lg;
	@Test
	public void orangeHrmLogoutTest() {
		
		lp=new OrangeHrmLoginPage(driver);
		
		lg=new DashboardLogoutPage(driver);
		
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		
		lp.clickOnLogin();
		
		lg.LogoutDrpClick();
		lg.LogoutBtnClick();
		
		Assert.assertEquals(lg.LogoOfLogin(), "Login");
		
		
		
		
		
		
		
		
	}
	

}
