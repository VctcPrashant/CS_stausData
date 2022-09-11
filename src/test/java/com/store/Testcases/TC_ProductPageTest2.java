package com.store.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.store.PageObject.IndexPage2;
import com.store.PageObject.MyAccount2;
import com.store.PageObject.OrderAddressPage;
import com.store.PageObject.OrderConfirmationPage;
import com.store.PageObject.OrderPaymentPage;
import com.store.PageObject.OrderShippingPage;
import com.store.PageObject.OrderSummaryPage2;
import com.store.PageObject.ProductPage2;
import com.store.PageObject.RegisteredUserAccount2;
import com.store.PageObject.SearchResultPage2;


public class TC_ProductPageTest2 extends BaseClass{
	
	@Test(enabled = false)
	public void VerifySearchProduct()  {
		
		///sign in page
		IndexPage2 index = new IndexPage2(driver);
		
		index.clickonSgnIn();
		
		//myacountPAge
		MyAccount2 myacc = new MyAccount2(driver);
		
		
		myacc.enterEmailAddress(username);
		
		
		myacc.enterPassword(password);
		
		myacc.clickSubmit();
		//Enter search Key in search box
		RegisteredUserAccount2 searchProd = new RegisteredUserAccount2(driver);
		searchProd.enterDataInSearchBox("T-shirts");
		searchProd.clickOnSearchButton();
		
		//get name of searched products
		SearchResultPage2 searchResult = new SearchResultPage2(driver);
		searchResult.ClickOnMoreLink();
		
		//productPage
		ProductPage2 prod = new ProductPage2(driver);
		prod.setQuantity("2");
		prod.sestSize("M");
		prod.clickOnAddToCart();
		prod.clickOnProceedToCheckOut();
		
		//summeryPage
		OrderSummaryPage2 summary = new OrderSummaryPage2(driver);
		summary.clickOnProceedToCheckOut();
		
		//AddressPage
		OrderAddressPage address = new OrderAddressPage(driver);
		address.clickOnProceedToCheckAdd();
		
		//shippingPage
		OrderShippingPage shipping = new OrderShippingPage(driver);
		shipping.clickOnCheckBox();
		shipping.clickOnProceedToCheck();
		
		//paymentPage
		OrderPaymentPage payment = new OrderPaymentPage(driver);
		payment.payBankwire();
		
		//confermationPage
		OrderConfirmationPage confirmation = new OrderConfirmationPage(driver);
		confirmation.clickConfirmationOrder();
		confirmation.getOrderSucessMessage();
	}
	@Test(enabled = true)
	public void verifyAddToWishListoutLogin() throws IOException
	{
		//index Page
		IndexPage2 indexPg = new IndexPage2(driver);
		indexPg.clickOntshirtmenu(); 
		
		//product Page
		
		ProductPage2 productPg = new ProductPage2(driver);
		//productPg.mouseOvertshirtProduct();
		productPg.clickOnaddWishList();
		
//	String actualAlertMsg = productPg.getTextOfAlertForWishList();
	
	//System.out.println(actualAlertMsg);
//	String expectedAlertMsg = "You must be logged in to manage your wishlist.";
//	System.out.println(actualAlertMsg);
//	if(actualAlertMsg.equals(expectedAlertMsg)) {
//		System.out.println("verifyAddToWishListoutLogin..Passed");
//		captureScreenshot(driver, "verifyAddToWishListoutLogin");
//		System.out.println("captures screen shot ");
//	Assert.assertTrue(true);
//	}
//	else
//	{
//		System.out.println("verifyAddToWishListoutLogin..Failed");
//		Assert.assertTrue(false);
//	}
		
	}

}

