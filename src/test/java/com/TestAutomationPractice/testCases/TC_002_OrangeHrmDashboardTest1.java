package com.TestAutomationPractice.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass1;
import com.TestAutomationPractice.pageObjects.OrangeHrmDashboardPage1;
import com.TestAutomationPractice.pageObjects.OrangeHrmLoginPage1;

public class TC_002_OrangeHrmDashboardTest1 extends BaseClass1 {
	
public OrangeHrmLoginPage1 p;
public OrangeHrmDashboardPage1 p2;

@Test
public void secondPage(){
	
	p=new OrangeHrmLoginPage1(driver);
	p2=new OrangeHrmDashboardPage1(driver);
	
	p.usernameField("Admin");
	log.info("enetred username ");
	
	p.passwordField("admin123");
	log.info("Entered password");
	
	p.submitButton();
	log.info("clicked on submit button");

	
	p2.Click_on_Admin_Btn();
	log.info("clicked on admin button");
	
//	p2.AlertHandles();
//	log.info("alert has handled successfully");
//	
	p2.Click_on_Add_Btn();
	log.info("clicked on add button");
	
	p2.selectField();
	log.info("Clicked on select DropDown");
	  
	p2.adminDrp();
	log.info("Clicked on Admin Drp Option");
	
	p2.EnterEmployeeNameInField("sachin shelke patil");
	log.info("entered employee name in the field");
	
	p2.selectField();
	log.info("clicked on status dropdown");
	
	p2.EnabledDrp();
	log.info("clicked on enabled dropdown");
	
	p2.UsernameEnter("sachshelpat");
	log.info("username has entered successfully");
	
	p2.passwordField("Pass@&1234");
	log.info("password has entered successfully");
	
	p2.CpasswordField("Pass@&1234");
	log.info("confirmed password successfully");
	
	p2.clickOnSaveButton();
	log.info("clicked on Submit Button");
	
	p2.leaveBtn();
	log.info("Clicked on leave button");
	
	p2.DatePickerFirst();
	log.info("Clicked on the DatePicker");
	
	p2.clickOnMonthArrow();
	log.info("clicked on month arrow");
	
	p2.clickOnAprMonth();
	log.info("april month has been selected");
	
	p2.yearDrp();
	log.info("clicked on year dropDown");
	
	p2.yearSelect();
	log.info("year has selected successfully");
	
	p2.selectDate();
	log.info("Date has selected");
	
	p2.ClickOnLogoutBtnArrow();
	log.info("successfully clicked on login button");
	
	p2.ClickOnLogoutBtn();
	log.info("Clicked on logout button successfully");
}


 

}













































































//if your are getting element interception exception then use javascriptexecutor class .
