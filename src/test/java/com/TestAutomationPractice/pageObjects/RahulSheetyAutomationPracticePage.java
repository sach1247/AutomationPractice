package com.TestAutomationPractice.pageObjects;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RahulSheetyAutomationPracticePage {
	WebDriver driver;
	
	
	
	//constructor
	public RahulSheetyAutomationPracticePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	
	//webelement
	
	@FindBy(xpath="//div[@id='radio-btn-example']//input")
	List<WebElement>rad_btn;
	
	@FindBy(xpath="//input[@id='autocomplete']")
	WebElement text_enter;
	
	@FindBy(xpath="//select[@id='dropdown-class-example']")
	WebElement drp_btn;
	
	@FindBy(xpath="//div[@id='checkbox-example']//input")
	List<WebElement>checkBox;
	
	@FindBy(xpath="//button[@id='openwindow']")
	WebElement wind_click;
	
	@FindBy(xpath="//input[@name='enter-name']")
	WebElement enter_alert_input;
	
	@FindBy(xpath="//input[@id='alertbtn']")
	WebElement alert_btn;
	
	@FindBy(xpath="//div[@class='left-align']//tbody/tr/td")
	List<WebElement>TotalElementTable;
	
	@FindBy(xpath="//div[@class='left-align']//tbody/tr[8]/td[2]")
	WebElement specific_ele_WebTable;
	
	@FindBy(xpath="//div[@class='totalAmount']")
	WebElement scrollForMouseHoverText;
	
	@FindBy(xpath="//button[text()='Mouse Hover']")
	WebElement mouseHover_btn;
	
	@FindBy(xpath="//a[text()='Top']")
	WebElement Top_MouseHover_btn;
	
	@FindBy(xpath="//iframe[@id='courses-iframe']")
	WebElement iframe1;
	
	@FindBy(xpath="//div[@class='nav-outer clearfix']//ul//a[text()='Job Support']")
	WebElement jobSupportLink;
	
	
	//actions methods
	
	public void findTotalRadBtn() {
		
		System.out.println("total numbers of radios buttons are:"+rad_btn.size());
		
		
	}
	
	public void clickOnRadBtn()  {
		
		for(int i=0;i<rad_btn.size()-2;i++)
		{
		
			rad_btn.get(i).click();
			
			
		}
		
	}
	
	public void enterText(String str) {
		
		text_enter.sendKeys(str);
		
		
	}
	
	public void selectDrpBtn() {
		
		
		Select sl=new Select(drp_btn);
		sl.selectByVisibleText("Option2");
		
	}
	
	public void findTotalcheckBox() {
		
		System.out.println("total checkboxes are:"+checkBox.size());
		
   }
	
	public void selectAllCheckbox() {
		
		for(int i=0;i<checkBox.size();i++) {
			
			checkBox.get(i).click();
		}
		
		
	}
	
	public void clickOnWindow() {
		
		wind_click.click();
	}
	
	  
	public void closeWindow() {
		
		String originalWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
            
            if (!windowHandle.equals(originalWindowHandle)) {
                driver.switchTo().window(windowHandle);
                driver.close();
            }
		}
		driver.switchTo().window(originalWindowHandle);
		}
	
	
	public void enterInputInAlert(String value) {
		enter_alert_input.sendKeys(value);
		
		
	}
	
	public void clickOnAlertBtn() {
		
		alert_btn.click();
		
   Alert myalert=driver.switchTo().alert();
		
   driver.switchTo().alert().accept();
		
		
	}
	
	public void findTotalWebTableElement()
	{
		
		System.out.println("total numbers of webtable elements:"+TotalElementTable.size());
		
	}
	
	public void getAllTextOfWebTable() {
		for(WebElement  ele:TotalElementTable) {
			String value=ele.getText();
			
			System.out.println("text under the webtable are:"+value);
			
			
			
			
		}
		
		
		
	}
	public void specificElementTakeWebElement() {
		
		System.out.println("element of webtable is:"+specific_ele_WebTable.getText());
	}
	
	public void scrollUpToMouseHover() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollForMouseHoverText);
		
	}
	
	public void  mouseHoverAction() {
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mouseHover_btn).moveToElement(Top_MouseHover_btn).click().perform();
		
		
	}
	
	public void iframe() {
		
		driver.switchTo().frame(iframe1);
		//jobSupportLink.click();
	}
		public void clickOnJobSupport() {
		
		jobSupportLink.click();
	}
	
	
	
	
	
	
	
	
		
		
		
	}

