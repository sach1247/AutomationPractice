package com.TestAutomationPractice.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RahulShettyAutomationPracticePage2 {
	public WebDriver driver;
	
	public RahulShettyAutomationPracticePage2(WebDriver driver)
	
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	//WebElement
	
	@FindBy(xpath="//div[@id='radio-btn-example']//input")
	List<WebElement> radioBtn;
	
	
	
	
	
	
	public void radioBtnSize()
	{
		
	}
	
	
	
	
}

