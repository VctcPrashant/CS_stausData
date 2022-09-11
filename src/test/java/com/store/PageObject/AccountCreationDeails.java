package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationDeails {
//constructer
	WebDriver driver;
	public AccountCreationDeails (WebDriver driver)
	{
		driver = driver;
		PageFactory.initElements(driver,this);
	}
	//find the webelenemt
	
	@FindBy(id="uniform-id_gender1")
	WebElement gender;
	
	@FindBy(name="customer_firstname")
	WebElement customerfirstname;
	
	@FindBy(id="customer_lastname")
	WebElement customerlastname;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement Day;
	
	@FindBy(id="month")
	WebElement Month;
	
	@FindBy(id="years")
	WebElement Year;
	
	@FindBy(id="newsletter")
	WebElement Newsletter;
	
	@FindBy(id="firstname")
	WebElement Firstname;
	
	@FindBy(id="lastname")
	WebElement Lastname;
	
	@FindBy(id="company")
	WebElement Company;
	
	@FindBy(id="address1")
	WebElement Address1;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement Pstcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	
	@FindBy(id="alias")
	WebElement Alias;
	@FindBy(xpath = "//button[@id='submitAccount']")
	WebElement registerBtn;
	//actins
	//Title
	public void Title()
	{
		gender.click();
	}
	//First name *
		public void First_name (String cutFirstName)
		{
			customerfirstname.sendKeys(cutFirstName);
		}
		//First name *
				public void Last_name (String cutLastName)
				{
					customerlastname.sendKeys(cutLastName);
				}
				//Password *
				public void Password (String pass)
				{
					password.sendKeys(pass);
				}
				//Date of Birth days
				public void days (String daya)
				{
					Day.sendKeys(daya);
				}
				//Date of Birth month
				public void months (String mont)
				{
					Month.sendKeys(mont);
				}
				//Date of Birth year
				public void years (String yea)
				{
					Year.sendKeys(yea);
				}
				//Sign up for our newsletter!
				public void newsletter ()
				{
					Newsletter.click();
				}
				//First name *
				public void fistName (String name)
				{
					Firstname.click();
					Firstname.sendKeys(name);
				}
				//Last name *
				public void lastName (String lname)
				{
					Lastname.clear();
					Lastname.sendKeys(lname);
				}
				//Company
				public void Company (String con)
				{
					Company.sendKeys(con);
				}
				//Address *
				public void Address (String add)
				{
					Address1.sendKeys(add);
				}
				//City *
				public void citys (String cit)
				{
					City.sendKeys(cit);
				}
				//state *
				public void stetes (String Text)
				{
					Select sel = new Select(state);
					sel.selectByVisibleText(Text);
				}
				//Zip/Postal Code *
				public void pincode (String pin)
				{
					Pstcode.sendKeys(pin);
				}
				//Country *
				public void Country(String contry) {
					// TODO Auto-generated method stub
					Select sel = new Select(country);
					sel.selectByVisibleText(contry);
					
				}
				//Mobile phone *
				public void Mobile (String mob)
				{
					mobile.sendKeys(mob);
				}
				//alias *
				public void alias (String ali)
				{
					Alias.clear();
					Alias.sendKeys(ali);
				}
				//register *
				public void butonRegister ()
				{
					registerBtn.click();
				}
//				public void lastName(String string) {
//					// TODO Auto-generated method stub
//					
//				}
				
				
}
