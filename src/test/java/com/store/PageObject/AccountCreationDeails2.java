package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDeails2 {

	WebDriver driver;

	public AccountCreationDeails2(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}

	// YOUR PERSONAL INFORMATION

	// Title
//	@FindBy(id = "uniform-id_gender1")
//	WebElement gender;

	// First name *
	@FindBy(name="customer_firstname")
	//@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement customerFirstname;

	// Last name *
	@FindBy(id = "customer_lastname")
	WebElement customerLastname;

	// password *
	@FindBy(id = "passwd")
	WebElement password;

	// ign up for our newsletter!
	@FindBy(id = "uniform-newsletter")
	WebElement newsletter;

	// YOUR ADDRESS
	// First name *
	@FindBy(id = "firstname")
	WebElement firstname;

	// Last name *
	@FindBy(id = "lastname")
	WebElement lastname;

	// Address
	@FindBy(id = "address1")
	WebElement Address;

	// city
	@FindBy(id = "city")
	WebElement city;

	// state
	@FindBy(id = "id_state")
	WebElement state;

	// Zip/Postal Code
	@FindBy(id = "postcode")
	WebElement postel;

	// id_country
	@FindBy(id = "id_country")
	WebElement country;

	// phone_mobile
	@FindBy(id = "phone_mobile")
	WebElement mobile;

	// alias
	@FindBy(id = "alias")
	WebElement alias;

	// submitAccount button
	@FindBy(id = "submitAccount")
	WebElement submitButton;
	
	//action 
	
//	public void getTitle(String title)
//	{
//		Select sel = new Select(gender);
//		sel.deselectByVisibleText(title);
//		
//	}
	
	public void enterCustFirstName(String custFirstName)
	{
		customerFirstname.sendKeys(custFirstName);
	}
	
	public void enterCustLastName(String custLastName)
	{
		customerLastname.sendKeys(custLastName);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void newsletter()
	{
		newsletter.click();
	}
	
	public void enterFisrstname(String firstName)
	{
		firstname.clear();
		firstname.sendKeys(firstName);
	}
	
	public void enterLastname(String lastName)
	{
		lastname.clear();
		lastname.sendKeys(lastName);
	}
	
	public void enterAddress(String address)
	{
		Address.sendKeys(address);
	}
	
	public void enterCity(String citys)
	{
		city.sendKeys(citys);
	}
	
	public void enterState(String states)
	{
		Select sel = new Select(state);
		sel.selectByVisibleText(states);
		
	}
	
	public void enterPostel(String postels)
	{
		postel.sendKeys(postels);
	}
	
	public void enterCountry(String countrys)
	{
		Select sel = new Select(country);
		sel.selectByVisibleText(countrys);
		
	}
	
	public void enterMobile(String mobiles)
	{
		mobile.sendKeys(mobiles);
	}

	public void enterAlias(String alia)
	{
		alias.clear();
		alias.sendKeys(alia);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();;
	}
}
