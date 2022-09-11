package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {
WebDriver driver;
	
	public OrderPaymentPage(WebDriver driver)
	{
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//find the webelements
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a/text()")
	WebElement payByCheque;
	
	@FindBy(className = "bankwire")
	WebElement payByBankwire;
	
	//actions
	public void payCheque()
	{
		payByCheque.click();
	}
	
	public void payBankwire()
	{
		payByBankwire.click();
	}
}
