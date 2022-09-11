package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderShippingPage {

	
	public OrderShippingPage(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//find the webelements
	


	@FindBy(id = "cgv")
	WebElement termOfService;
	
	@FindBy(id = "processCarrier")
	WebElement processhipping;
	
	//actions
	public void clickOnCheckBox()
	{
		termOfService.click();
	}
	
	public void clickOnProceedToCheck()
	{
		processhipping.click();
	}
}
