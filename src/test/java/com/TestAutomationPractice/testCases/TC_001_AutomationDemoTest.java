package com.TestAutomationPractice.testCases;


import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass2;
import com.TestAutomationPractice.pageObjects.AutomationDemoSite;


public class TC_001_AutomationDemoTest extends BaseClass2 {
	
	//public WebDriver driver;
	
public AutomationDemoSite page;
	
	@Test
public void  DemoSitePage() throws InterruptedException {
		
		page=new AutomationDemoSite(driver);
		
		page.ClickOnRegisterBtn();
		log.info("clicked on register button");
		
		page.FirstName("sachin");
		log.info("entered the first name");
		
		page.LastName("shelke");
		log.info("entered the last name");
		
		page.EnterAddress("Pune, Maharashtra");
		log.info("Entered the address");
		
		page.EnterEmailAddress("sachshelpat@gmail.com");
		log.info("email has enter successfully");
		
		page.EnterMoNumber("9322520983");
		log.info("mobile number enter successfully");
		
		page.clickOnRadioBtn();
		log.info("got the size of the radio buttons");
		
		page.clickOnMaleRadioBtn();
		log.info("clicked on male radio button");
		
		Thread.sleep(3000);
		
		page.clickFirstandLastCheckboxes();
		log.info("clicked on first and last checkboxes");
		
		page.clickOnRefreshBtn();
		log.info("clicked on refresh button");
		
		page.switchToAlert();
		log.info("switched from switch to button to alerts successfully");
		
//		page.alertWithTextBoxMethod();
//		log.info("clicked on alerts link successfully");
//		
//		page.alertClickOn();
//		log.info("clicked on alerts with the text");
//		
//		page.alertHandle();
//		log.info("handled the alerts all features successfully");
//		
//		page.moveToWindows();
//		log.info("moved to windows successfully");
//		
//		page.openMultipleWindow();
//		log.info("clicked on Multile dwindows link button");
//		
//		page.clickOnMwindowsbtn();
//		log.info("click on click btn of multiple windows");
//		
//		page.getWindowsIds();
//		log.info("windows ids have printed successfully");
		
		page.moveToFrame();
		log.info("it has moved to iframe and clicked successfully");
		
		page.clickOnSecondLink();
		log.info("successfully clicked on the second link of ifame and entered");
		
//		page.enterInTextBox("welcome sachin in iframe");
//		log.info("successfully entered message in textbox");
		
		page.switchToParentFrame();
		log.info("switched into frame and entered name successfully");
		
		page.switchToDefaultContent1();
		log.info("switched in first default content");
		
		page.switchToChildFrame();
		log.info("switched into child frame");
		
		page.switchToDefaultContent2();
		log.info("switched into default content2");
		
		page.enterInTextBox("sachin");
		log.info("entered text as sachin successfully");
//		
		
		
		
		
	
}
}
