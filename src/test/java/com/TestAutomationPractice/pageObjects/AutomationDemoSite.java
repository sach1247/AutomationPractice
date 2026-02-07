package com.TestAutomationPractice.pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationDemoSite {
	WebDriver driver;
	//WebDriverWait wait;
	
	public AutomationDemoSite(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
		
	}
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement registerIcon;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement Fname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Lname;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
	WebElement AddressEnter;
	
	@FindBy(xpath="//*[@id=\"eid\"]/input")
	WebElement EnterEmail;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement EnterMobileNumber;
	
	@FindBy(xpath="//div[@class='col-sm-6 col-md-6 col-xs-12']//label//input[@type='radio']")
	List<WebElement> RadioBtn;
	
	@FindBy(xpath="//div[@class='form-group']//div[@class='col-md-4 col-xs-4 col-sm-4']//input[@type='checkbox']")
	List<WebElement> checkBoxes;
	
	@FindBy(xpath="//*[@id=\"Button1\"]")
	WebElement refreshBtn;
	
	@FindBy(xpath="//a[text()='SwitchTo']")
	WebElement switchToBtn;
	
	@FindBy(xpath="//a[text()='Alerts']")
	WebElement alertBtn;
	
	@FindBy(xpath="//a[text()='Alert with Textbox ']")
	WebElement alertsWithTextbox;
	
	@FindBy(xpath="//button[@class='btn btn-info']")
	WebElement alertClick;   
	
	@FindBy(xpath="//a[text()='Windows']")
	WebElement windows;
	
	@FindBy(xpath="//a[text()='Open Seperate Multiple Windows']")
	WebElement Mwindows;
	
	@FindBy(xpath="//button[@onclick='multiwindow()']  ")
	WebElement MwindowsClick;
	
	@FindBy(xpath="//a[text()='Frames']")
	WebElement iframe;
	
	@FindBy(xpath="//a[text()='Iframe with in an Iframe']")
	WebElement frameSecondlink;
	
	@FindBy(xpath="//div[@class='container iframes-page-container']")
	WebElement parentFrame;
	
	@FindBy(xpath="/html/body/section/div/div/iframe")
	WebElement childFrame;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement textBox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void ClickOnRegisterBtn() {
		registerIcon.click();
		
	}
	   
	public void FirstName(String fname) {
		Fname.sendKeys(fname);
		
		
	}
	
	public void LastName(String lname) {
		Lname.sendKeys(lname);
}
	
public void EnterAddress(String Address) {
	AddressEnter.sendKeys(Address);
}

public void EnterEmailAddress(String email) {
	EnterEmail.sendKeys(email);
	
}

public void EnterMoNumber(String Mo) {
	EnterMobileNumber.sendKeys(Mo);
}

public void clickOnRadioBtn() {
System.out.println("radio button size is:"+RadioBtn.size());
	
}


public void clickOnMaleRadioBtn() {
	
	for(int i=0;i<RadioBtn.size()-1;i++) {
		
		RadioBtn.get(i).click();
		
	}
}
public void countcheckBoxesSize() {
	System.out.println("Total number of checkBoxes are:"+checkBoxes.size());

}

//to click on first and last checkboxes 

public void clickFirstandLastCheckboxes(){
	
	for(int i=0;i<checkBoxes.size();i++) {
		if(i==0 && i==2) {
			checkBoxes.get(i).click();
		}
		
	}
	}

public void clickOnRefreshBtn() {
	refreshBtn.click();
	
	
}
public void switchToAlert() {
	Actions act=new Actions(driver);
	act.moveToElement(switchToBtn).moveToElement(alertBtn).click().perform();

}
public void alertWithTextBoxMethod() {
	alertsWithTextbox.click();
}

public void alertClickOn()
{
	alertClick.click();	
}

public void alertHandle() {
	Alert myalert=driver.switchTo().alert();
	myalert.sendKeys("welcome to the alerts handling mechanism");
	System.out.println("text is:"+myalert.getText());
	
	driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	
}	

public void moveToWindows()
{
	
	Actions act=new Actions(driver);
	act.moveToElement(switchToBtn).moveToElement(windows).click().perform();
}

public void openMultipleWindow()

{
	Mwindows.click();
	
}



public void clickOnMwindowsbtn() 
{
	//wait =new WebDriverWait(driver,Duration.ofSeconds(20));
   // wait.until(ExpectedConditions.elementToBeClickable(MwindowsClick.click()).cl
	//wait.until(ExpectedConditions.elementToBeClickable(MwindowsClick)).click();
	MwindowsClick.click();
	
	//((JavascriptExecutor) driver).executeScript("arguments[0].click();", MwindowsClick);
	if(MwindowsClick.isEnabled())
	{
		MwindowsClick.click();
	}

}

public void getWindowsIds()
{
	String wId=driver.getWindowHandle();
	System.out.println("window id is:"+wId);
	
	Set<String>wIds=driver.getWindowHandles();
	System.out.println("windows id is:"+wIds);
	
	
}

//public void closeCurrentWindow()
//{
//	driver.close();
//}



public void moveToFrame()
{
	Actions act=new Actions(driver);
	act.moveToElement(switchToBtn).moveToElement(iframe).click().perform();
}

public void clickOnSecondLink()
{
	frameSecondlink.click();
	
}


//public void swithcToParentFrame()
//{
//	
//	driver.switchTo().frame(parentFrame);//switched into parent frame
//	driver.switchTo().frame(childFrame);//switched into child frame
//	driver.switchTo().defaultContent();
//	
//}
//
//public void enterInTextBox(String value)
//{
//	textBox.sendKeys(value);
//}

public void switchToParentFrame() {
    // Switch to the parent frame
    driver.switchTo().frame(parentFrame);
}
public void switchToDefaultContent1()
{
	driver.switchTo().defaultContent();
}

public void switchToChildFrame() {
    // Switch to the child frame
    driver.switchTo().frame(childFrame);
}

public void switchToDefaultContent2() {
    // Switch back to the default content
    driver.switchTo().defaultContent();
}

public void enterInTextBox(String value) {
   
    
    textBox.sendKeys(value);
    
}


}
	


	
	
	
	
	
	
	




