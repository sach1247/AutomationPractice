package com.TestAutomationPractice.testCases;

import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.RahulSheetyAutomationPracticePage;

import junit.framework.Assert;

public class TC_001_RahulShettyAutomationPracticeTest extends BaseClass {
	
	public RahulSheetyAutomationPracticePage p;
	
	
	@Test
	public void onePageAllTesting() throws InterruptedException {
		
		p=new RahulSheetyAutomationPracticePage(driver);
		
		p.enterText("india");
		log.info("successfully entered text india");
		
		p.selectDrpBtn();
		log.info("successfully clicked on option2 dropdown");
		
		p.findTotalcheckBox();
		log.info("successfully found total number of checkboxes");
		
		p.selectAllCheckbox();
		log.info("successfully selected all the checkboxes");
		
		p.clickOnWindow();
		log.info("window opened succesfully");
		
		p.closeWindow();
		log.info("window has been successfully closed");
		
		p.enterInputInAlert("welcome sachin");
		log.info("enterd welcome message");
		
		p.clickOnAlertBtn();
		log.info("clicked on aler buttton and closed");
		
		p.findTotalWebTableElement();
		log.info("got the total number of webtable elements");
		
		p.specificElementTakeWebElement();
		log.info("got the element from the webtable");
		
		p.getAllTextOfWebTable();
		log.info("displayed the all webtable elements");
		
		p.scrollUpToMouseHover();
		log.info("page has scrolled");
		
		p.mouseHoverAction();
		log.info("successfully mouse hover action has been performed");
		
		p.iframe();
		log.info("switched into the frame successfully");
		
	  //  p.clickOnJobSupport();
	   // log.info("clicked on job support link");
		
//		p.clickOnBrokenLink();
//		log.info("clicked on broken link");
	}
	
	
	
	
	
	

}
