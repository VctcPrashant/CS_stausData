package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class IndexPage {
	//Step1 create obj for webdriver
	WebDriver driver;
	public IndexPage(WebDriver driver) {
		
		driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	//identifly webelements
	
	

//@FindBy(linkText = "Sign in")
	@FindBy(xpath = "//a[@class='login']")
	WebElement SignIn;
	
	//action
	
	public void clickOnSignIn()
	{
		SignIn.click();
	}


	
	

}
