package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//constructor
public class AutomationExerciseLoginPage {
	
	WebDriver driver;
	public AutomationExerciseLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	//webElements
	
	@FindBy(xpath="//input[@name='email']")
	WebElement text_email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement text_pass;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement btn_login;
	
	
	//Actions method
	
	public void enterEmail(String email) {
		text_email.sendKeys(email);
		
		
	}
	
	public void enterPass(String pass) {
		
		text_pass.sendKeys(pass);
		
	}
	
	
	public void clickOnLogin() {
		
		btn_login.click();
		
		
		
	}

}
