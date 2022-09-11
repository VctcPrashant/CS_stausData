package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage2 {
	
	WebDriver driver;
	
	public OrderSummaryPage2(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//find the webelements
	
	@FindBy(linkText = "Proceed to checkout")
	WebElement proceed;
	
	//actions
	public void clickOnProceedToCheckOut()
	
	{
		proceed.click();
	}
}
