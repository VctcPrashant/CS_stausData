package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {
WebDriver driver;
	
	public OrderAddressPage(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//find the webelements
	
	@FindBy(name = "processAddress")
	WebElement proceedFromAddressPage;
	
	//actions
	public void clickOnProceedToCheckAdd()
	{
		proceedFromAddressPage.click();
	}
}
