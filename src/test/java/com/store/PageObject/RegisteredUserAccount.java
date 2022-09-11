package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount {

	// cons

	public RegisteredUserAccount(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	// find the webElements
	//verify the user name
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement user;
	
	@FindBy(linkText = "Sign Out")
	WebElement SignOut;
	
	@FindBy(name="search_query")
	WebElement searchBox;
	
	@FindBy(name="submit_search")
	WebElement submitSearch;
	
	// actions

	public String getUserName() {
		String text = user.getText();
		return text;
	}
	
	public void clickOnSignOut()
	{
		SignOut.click();
	}
	
	public void enterDataInSearchBox(String searchKey)
	{
		searchBox.sendKeys(searchKey);
	}
	
	public void clickOnSearchButton()
	{
		submitSearch.click();
	}

}
