package com.TestAutomationPractice.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmDashboardPage1 {
	
	public WebDriver driver;
	//WebDriverWait wait;
	
	//constructor
	
	public OrangeHrmDashboardPage1(WebDriver driver) {
		
		this.driver=driver;
		//this.wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//WebElement
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']//*[name()='svg']")
	WebElement ClickOnAdminBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i")
	WebElement ClickOnAddButton;
	
 
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement selectField;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	WebElement AdminDrp;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
	WebElement EnterEmployeName;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
	WebElement StatusDrp;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")
	WebElement EnabledDrp;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement usernameField;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")
	WebElement CpasswordField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ClickOnSaveBtn;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']")
	WebElement LeaveBtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i")
	WebElement DatePickedDemo;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-month-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
	WebElement monthDrpArrow;
	
	@FindBy(xpath="//li[normalize-space()='April']")
	WebElement AprMonth;
	
	@FindBy(xpath="//div[@class='oxd-calendar-selector-year-selected']//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']")
    WebElement yearDrp;	
	
	@FindBy(xpath="//li[normalize-space()='2000']")
	WebElement yearOption;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[27]/div[1]")
	WebElement selectDate;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement LogoutBtnOption;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement LogoutBtn;
	
	//Actions Method
	
	public void Click_on_Admin_Btn()
	
	{
		//wait.until(ExpectedConditions.elementToBeClickable(ClickOnAdminBtn));
		ClickOnAdminBtn.click();
		
	}
	
//	public void AlertHandles() {
//		
//		Alert myalert=driver.switchTo().alert();
//		myalert.accept();
//	}
	
	public void Click_on_Add_Btn()
	{
		
		//wait.until(ExpectedConditions.elementToBeClickable(ClickOnAddButton));
		ClickOnAddButton.click();
	}
	
	public void selectField() {
		selectField.click();
	}
	
	public void adminDrp() {
		AdminDrp.click();
		
	}
	
	public void EnterEmployeeNameInField(String name) {
		
		EnterEmployeName.sendKeys(name);
	}
	
	public void StatusDrp() {
		StatusDrp.click();		
	}
	
	public void EnabledDrp() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", EnabledDrp);
		
		//EnabledDrp.click();
		
	}
	
	public void UsernameEnter(String user) {
		
		usernameField.sendKeys(user);
		
	}
	
	public void passwordField(String pwd) {
		
		passwordField.sendKeys(pwd);
		
	}
	
	
	public void CpasswordField(String Cpwd) {
		
		CpasswordField.sendKeys(Cpwd);
		
		
	}
	
	public void clickOnSaveButton() {
		ClickOnSaveBtn.click();
		
	}
	
	public void leaveBtn() {
		LeaveBtn.click();
		
	}
	
	public void DatePickerFirst() {
		DatePickedDemo.click();
		
	}
	
	public void clickOnMonthArrow() {
		
		monthDrpArrow.click();
	}
	
	public void clickOnAprMonth() {
		AprMonth.click();
		
	}
	
	public void yearDrp()
	{
		yearDrp.click();
	}
	
	public void yearSelect() {
		yearOption.click();
		
	}
	
	public void selectDate() {
		selectDate.click();
		
	}
	public void ClickOnLogoutBtnArrow() {
		LogoutBtnOption.click();
		
		
	}
	
	public void ClickOnLogoutBtn() {
		
		LogoutBtn.click();
		
	}

}
