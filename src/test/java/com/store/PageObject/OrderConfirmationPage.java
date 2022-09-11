package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
WebDriver driver;
	
	public OrderConfirmationPage(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//find the webelements
	
	@FindBy(linkText = "I confirm my order")
	WebElement confirmOrder;
	
	@FindBy(xpath = "//div[@id='order_step']/p[@class='alert alert-success']")
	WebElement successAlert;
	
	//actions
	public void clickConfirmationOrder()
	{
		confirmOrder.click();
	}
	
	public String getOrderSucessMessage()
	{
		
	String sucess =	successAlert.getText();
	return sucess;
	}

}
