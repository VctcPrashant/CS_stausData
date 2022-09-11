package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount2 {
	WebDriver driver;
	
	public MyAccount2(WebDriver driver) {
		driver= driver;
		PageFactory.initElements(driver, this);
	}
	

	//Find webElement CREATE ACCOUNT
	@FindBy(id="email_create")
	WebElement createEmailId;
	
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	WebElement SubmitCreate;
	
	//all ready registered user
	@FindBy(id="email")
	WebElement registeredUserEmail;
	
	@FindBy(id="passwd")
	WebElement registeredUserPassword;
	
	@FindBy(id="SubmitLogin")
	WebElement registeredUserLoginButton;
	
	
	//actins CREATE ACCOUNT
	
	public void enterCreateEmailAdress(String emailAdd)
	{
		createEmailId.sendKeys(emailAdd);
	}
	
	public void clickSubmitCreate()
	{
		SubmitCreate.click(); 
	}

//Actions methods for all ready registered users
	
	public void enterEmailAddress(String emailAdd)
	{
		registeredUserEmail.sendKeys(emailAdd);
	}
	
	public void enterPassword(String passwordAdd)
	{
		registeredUserPassword.sendKeys(passwordAdd);
	}
	public void clickSubmit()
	{
		registeredUserLoginButton.click();
	}

	
	
	
}
