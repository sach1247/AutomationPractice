package com.TestAutomationPractice.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestAutomationPractice.BaseClass.BaseClass;
import com.TestAutomationPractice.pageObjects.AutomationExerciseLoginPage;
import com.TestAutomationPractice.pageObjects.DashboardAutomationExePage;
import com.TestAutomationPractice.utilities.ExcelUitlity;

import junit.framework.Assert;

public class TC_002_DashboardAutomationExeTest extends BaseClass {
	
	public DashboardAutomationExePage dp;
	public AutomationExerciseLoginPage lp;
	 
	
//	@Test 
//	public void testElements() {
//		lp=new AutomationExerciseLoginPage(driver);
//
//		lp.enterEmail("sachshelpat@gmail.com");
//		log.info("successfully enter a correct email");
//		lp.enterPass("Pass@&12345");
//		log.info("successfully entered coreect password");
//		lp.clickOnLogin();
//		
//		log.info("clicked on login button");
//		dp=new DashboardAutomationExePage(driver);
//		
//		dp.viewUpToFeaturesItems();
//		log.info("successfully scrolled upto features items");
//		Assert.assertEquals(dp.checkText(), "CATEGORY");
//		log.info("successfully got CATEGORY text");
//		dp.clickOnMen();
//		log.info("clicked on men");
//		dp.clickOnTshirts();
//		log.info("clicked on Tshirts"); 
//		dp.clickOnViewProduct();
//		log.info("clicked on view products");
//		dp.clickOnAddToCart();
//		log.info("clicked on add to cart");
//		
//	}
//	
		@Test(dataProvider = "logindata")
		public void testLogin(String email,String pass) throws InterruptedException
		{
			lp.enterEmail("email");
			log.info("successfully enter a correct email");
			lp.enterPass("pass");
			log.info("successfully entered coreect password");
			lp.clickOnLogin();
			
			log.info("clicked on login button");
			dp=new DashboardAutomationExePage(driver);
			
			dp.viewUpToFeaturesItems();
			log.info("successfully scrolled upto features items");
			Assert.assertEquals(dp.checkText(), "CATEGORY");
			log.info("successfully got CATEGORY text");
			dp.clickOnMen();
			log.info("clicked on men");
			dp.clickOnTshirts();
			log.info("clicked on Tshirts"); 
			dp.clickOnViewProduct();
			log.info("clicked on view products");
			dp.clickOnAddToCart();
			log.info("clicked on add to cart");
			
		
		
		
	}
		@DataProvider(name="logindata")
		String [][] loginData() throws Exception
		{
			String filename=System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
			
			int totalrows=ExcelUitlity.getTotalRows(filename, "Sheet1");
			int totalcells=ExcelUitlity.getTotalColumns(filename, "Sheet1",0);
			System.out.println("Total Rows="+totalrows);
			System.out.println("Total Cols="+totalcells);
			
			String data[][] =new String[totalrows][totalcells];
			
			for(int i=1;i<=totalrows;i++)
			{
				
				for(int j=0;j<totalcells;j++)
				{
					data[i-1][j]=ExcelUitlity.getCellData(filename, "Sheet1",i,j);
				}
			}
			
			
			
			return data;
		}
	}



