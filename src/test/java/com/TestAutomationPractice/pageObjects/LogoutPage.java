package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	public WebDriver driver;
	
	//constructor
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	    //webElement
	
			@FindBy(xpath="//a[text()='Home']")
			WebElement click_home;
			
			
			@FindBy(xpath="//b[text()='You logged into a secure area!']")
			WebElement login_success;
			
			@FindBy(xpath="//i[text()=' Logout']")
			WebElement logout_click;
			
			//action methods
			
			public void clickOnHome() {
				click_home.click();
				
			}
			
			public String checkLoggedSuccessMessage() {
				String loginText=login_success.getText();
				return loginText;
				
			}
			
			public void clickOnLogout() {
				logout_click.click();
			}
			
			
			
}


