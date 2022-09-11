package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage2 {
WebDriver driver;
	
 public ProductPage2(WebDriver driver){
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
 
// @FindBy(xpath = "//a[@class='btn btn-default button button-medium']//child::span")
 @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]")
// @FindBy(xpath = "//a[contains(.,'Proceed to checkout')]")
 WebElement proceed;
 
 @FindBy(xpath = "//a[contains(.,'Faded Short Sleeve T-shirts')]")
 WebElement tshirtProduct;
 
 @FindBy(xpath = "//a[@class='addToWishlist wishlistProd_1']")
 WebElement addToWishList;
 
 @FindBy(xpath = "//p[@class='fancybox-error']")
 WebElement alertToWishList;
 
 //create action method for web elements
 public void setQuantity(String qty)
 {
	 quantityWanted.clear();
	 quantityWanted.sendKeys(qty);
 }
 public void sestSize(String sizeType)
 {
	 Select sel = new Select(size);
	 sel.selectByVisibleText(sizeType);
	 
 }
 public void clickOnAddToCart()
 {
	 addToCart.click();
 }
 
 //processed to checkout
 public void clickOnProceedToCheckOut()
 {
	String s= proceed.getText();
	System.out.println(s);
	 proceed.click();
 }
 
 public void mouseOvertshirtProduct()
 {
	 Actions actionObj = new Actions(driver);
	 actionObj.moveToElement(tshirtProduct).build().perform();
 }
 
 public void clickOnaddWishList()
 {
	 addToWishList.click();
 }
 
 public String getTextOfAlertForWishList()
 {
	 String text = alertToWishList.getText();
	 return text;
	
 }

}
