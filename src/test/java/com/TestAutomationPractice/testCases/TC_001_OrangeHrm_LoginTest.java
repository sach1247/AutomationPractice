package com.TestAutomationPractice.testCases;

import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.DashboardLogoutPage;
import com.TestAutomationPractice.pageObjects.OrangeHrmLoginPage;

import junit.framework.Assert;

public class TC_001_OrangeHrm_LoginTest extends BaseClass{

	public OrangeHrmLoginPage lp;
	
	//public DashboardLogoutPage lg;
	
	@Test
	public void OrangeHrmLoginTest() {
		lp=new OrangeHrmLoginPage(driver);
	//	lg=new DashboardLogoutPage(driver);
		
//		lp.setUsername("Admin");
//		lp.setPassword("admin123");
	
	  pf.getProperty("username");
      pf.getProperty("password");
		lp.clickOnLogin();
		
	 Assert.assertEquals(lp.dashboardText(),"Dashboard");
		
		
	}
	
}
