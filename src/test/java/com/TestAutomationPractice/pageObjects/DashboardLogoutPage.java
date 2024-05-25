package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardLogoutPage {
	
	public WebDriver driver;
	
	//constructor
	public DashboardLogoutPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	//webElement
	
	
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement btn_logoutDrp;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement btn_LogoutClick;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement oranghrm_Logo;
	
	
	//actions methods
	
	public void LogoutDrpClick() {
		btn_logoutDrp.click();
		
		
	}
	
	public void LogoutBtnClick() {
		
		btn_LogoutClick.click();
		
		
	}
	
	public String LogoOfLogin() {
		
		String logoOrangeHrm=oranghrm_Logo.getText();
		
		return logoOrangeHrm;
		
		
	}
	
	
	



}
