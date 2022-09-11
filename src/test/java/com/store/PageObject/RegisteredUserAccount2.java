package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount2 {

	// cons

	public RegisteredUserAccount2(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	// find the webElements
	//verify the user name
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement user;
	
	//signOut
		@FindBy(linkText = "Sign out")
		WebElement signOut;
		
		//searchBox
		@FindBy(name="search_query")
		WebElement searchBox;
		
		@FindBy(name="submit_search")
		WebElement submitSearch;
	
	//verify the user name Actions
	public String getUserName()
	{
	String users = 	user.getText();
		return users;
	}
	
	
	//signOut Actions
	public void clickOnSignOut()
	{
		signOut.click();
	}
	
	//searchBox Actions
	public void enterDataInSearchBox(String searchKey)
	{
		searchBox.sendKeys(searchKey);
	} 
	
public void clickOnSearchButton()
	{
		submitSearch.click();
	}
}
