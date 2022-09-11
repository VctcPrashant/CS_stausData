package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	WebDriver driver;
	
 public ProductPage(WebDriver driver){
	 driver= driver;
		PageFactory.initElements(driver, this);
	}

 //find the webelements present in the login page
 
 //for new user
 
 @FindBy(id="quantity_wanted")
 WebElement quantityWanted;
 
 @FindBy(id="group_1")
 WebElement size;
 
 @FindBy(name="Submit")
 WebElement addToCart;
 
 @FindBy(linkText = "Proceed to checkout")
 WebElement proceed;
 
 //create action method for web elements
 public void setQuantity(String qty)
 {
	 quantityWanted.clear();
	 quantityWanted.sendKeys(qty);
 }
 public void sestSize(String sizeType)
 {
	 Select oselect = new Select(size);
	 oselect.deselectByVisibleText(sizeType);
	 
 }
 public void clickOnAddToCart()
 {
	 addToCart.click();
 }
 public void clickOnProceedToCheck()
 {
	 proceed.click();
 }
}
