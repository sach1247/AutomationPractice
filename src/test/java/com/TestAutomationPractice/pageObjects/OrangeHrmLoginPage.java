package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage {

	public WebDriver driver;
	
	//constructor
	public OrangeHrmLoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//webElement
	
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btn_LoginClick;
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	WebElement text_Dashboard;
	
	
	public void setUsername(String username) {
		
		txt_username.sendKeys(username);
	}
	
	
	public void setPassword(String password) {
		txt_password.sendKeys(password);
		
		
	}
	
	public void clickOnLogin() {
		
		btn_LoginClick.click();
		
		
	}
 public String dashboardText() {
		
		String DashText=text_Dashboard.getText();
		return DashText;
		

	
	
}
}


