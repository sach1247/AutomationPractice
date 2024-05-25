package com.TestAutomationPractice.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardAutomationExePage {
	WebDriver driver;
	
	//constructor
	public DashboardAutomationExePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//WebElements
	
	@FindBy(xpath="//h2[text()='Features Items']")
	WebElement view_FeaturesItems;
	
	@FindBy(xpath="//h2[text()='Category']")
	WebElement text_catagory;
	
	@FindBy(xpath="//a[normalize-space()='Men']//i[@class='fa fa-plus']")
	WebElement click_men;
	
	@FindBy(xpath="//a[normalize-space()='Tshirts']")
	WebElement click_Tshirts;
	
//	@FindBy(xpath="//div[@class='product-image-wrapper']")
//	WebElement iframe;
	
	@FindBy(xpath="//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")
	WebElement click_viewProduct;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement click_addToCart;
	
	
	
	
	
	//action methods
	
	public void viewUpToFeaturesItems() {
		
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",view_FeaturesItems);
	}
	public String checkText() {
		String value=text_catagory.getText();
		return value;
	}
	
	public void clickOnMen() {
		click_men.click();
	}
	
	public void clickOnTshirts() {
		click_Tshirts.click();
		
	}
//	public void frame() {
//		
//		driver.switchTo().frame(iframe);
//	}
//	
//	
	public void clickOnViewProduct() {
		click_viewProduct.click();
	}
	
	public void clickOnAddToCart() {
		
		click_addToCart.click();
		
	}

}
