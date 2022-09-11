package com.store.PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class IndexPage2 {
	
	WebDriver driver;
	
	public IndexPage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	//find the webelements
	
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	
	@FindBy(xpath ="(//a[text()='T-shirts'])[2]")
			WebElement tshirtMenu;
	
	//actions
	public void clickonSgnIn()
	{
		signIn.click();
	}
	
	public void clickOntshirtmenu()
	{
		tshirtMenu.click();
	}
	
}
