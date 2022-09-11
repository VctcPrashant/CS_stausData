package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	
	WebDriver driver;
	
	public OrderSummaryPage(WebDriver driver)
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
