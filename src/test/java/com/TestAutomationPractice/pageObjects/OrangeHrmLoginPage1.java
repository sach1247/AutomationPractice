package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage1 {
	
	WebDriver driver;
	//constructor initiation
	public OrangeHrmLoginPage1(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Web Elements
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement user;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_btn;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement text_Dashboard_Verify;
	
	
	
	
	public void usernameField(String username) {
		user.sendKeys(username);
		
	}
	
	public void passwordField(String password)
	{
		
		pass.sendKeys(password);
		
	}
	
	public void submitButton() {
		
		submit_btn.click();
		
	}
	
	public String verifyLoginStatus() {
		
		String text=text_Dashboard_Verify.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	

}
