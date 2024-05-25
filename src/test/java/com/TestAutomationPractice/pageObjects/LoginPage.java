package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestAutomationPractice.BaseClass.BaseClass;

public class LoginPage {

	public WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	//webElement
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement btn_Login;
	
	@FindBy(xpath="//b[text()='You logged out of the secure area!']")
	WebElement success_message;
	
	public void setUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String password) {
		
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_Login.click();
		
	}
	public String checkLogout() {
		String logoutText=success_message.getText();
		return logoutText;
	}
	
	
}
