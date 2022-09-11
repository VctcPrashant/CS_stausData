package com.store.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.store.PageObject.IndexPage;
import com.store.PageObject.MyAccount;
import com.store.PageObject.OrderAddressPage;
import com.store.PageObject.OrderConfirmationPage;
import com.store.PageObject.OrderPaymentPage;
import com.store.PageObject.OrderShippingPage;
import com.store.PageObject.OrderSummaryPage;
import com.store.PageObject.ProductPage;
import com.store.PageObject.RegisteredUserAccount;
import com.store.PageObject.SearchResultPage;


public class TC_ProductPageTest extends BaseClass{
	WebDriver driver;
	
	// verifly Login
	@Test
	public void VerifySearchProduct() throws IOException  {
		//String searchKey = "T-shirts";
		//sign in
		IndexPage ip = new IndexPage(driver);
		ip.clickOnSignIn();
		IndexPage index = new IndexPage(driver);
		index.clickOnSignIn();
		

		MyAccount myaccount = new MyAccount(driver);
		
		myaccount.enterEmailAddress("prashant.patankar166@gmail.com");
		myaccount.enterPassword("Admin@1233");
		myaccount.clickSubmit();
		
		//Enter search Key in search box
		RegisteredUserAccount ProductPg = new RegisteredUserAccount(driver);
		
		ProductPg.enterDataInSearchBox("T-shirts");
		ProductPg.clickOnSearchButton();
		
		//get name of searched products
		SearchResultPage searchResult = new SearchResultPage(driver);
	//	String SearchResultProductName = searchResult.getSearchResultProductName();
		//verifly correct product is displayed after search
		
		//if(SearchResultProductName.contains(searchKey))
		{
			System.out.println("Search Product  - passed..");
			Assert.assertTrue(true);
			ProductPg.clickOnSignOut();
	//	}else
		{
			System.out.println("earch Product - Faild..");
			captureScreenshot(driver, "VerifySearchProduct");
			Assert.assertTrue(false);
		}
	}

}
	//@Test(enabled = true)
//public void  verifyBuyProduct() throws IOException, InterruptedException
//{
//		IndexPage index = new IndexPage(driver);
//		index.clickOnSignIn();
//
//		MyAccount myaccount = new MyAccount(driver);
//		
//		myaccount.enterEmailAddress("emailAdd");
//		myaccount.enterPassword("passwordAdd");
//		myaccount.clickSubmit();
//		
//		//Enter search Key in search box
//		RegisteredUserAccount ProductCatPg = new RegisteredUserAccount(driver);
//		
//		ProductCatPg.enterDataInSearchBox("T-shirts");
//		ProductCatPg.clickOnSearchButton();
//		
//		//get name of searched products
//		SearchResultPage searchResult = new SearchResultPage(driver);
//		searchResult.ClickOnMoreLink();
//		Thread.sleep(4000);
//		ProductPage prodPg = new ProductPage(driver);
//		prodPg.setQuantity("2");
//		prodPg.sestSize("M");
//		prodPg.clickOnAddToCart();
//		prodPg.clickOnProceedToCheck();
//		
//		OrderSummaryPage orderSumPg = new OrderSummaryPage(driver);
//		orderSumPg.clickOnProceedToCheckOut();
//		
//		OrderAddressPage orderAddPg = new OrderAddressPage(driver);
//		orderAddPg.clickOnProceedToCheckAdd();
//		
//		OrderShippingPage orderShippingPg = new OrderShippingPage(driver);
//		orderShippingPg.clickOnCheckBox();
//		
//		OrderPaymentPage orderPaymentPg = new OrderPaymentPage(driver);
//		orderPaymentPg.payCheque();
//		orderPaymentPg.payBankwire();
//		
//		OrderConfirmationPage orderConfirmationPg = new OrderConfirmationPage(driver);
//		orderConfirmationPg.clickConfirmationOrder();
//		orderConfirmationPg.getOrderSucessMessage();
//		
//		String sucessMsg = orderConfirmationPg.getOrderSucessMessage();
//		
//		if(sucessMsg.equals("Your Order on my Store is Complited"))
//		{
//			System.out.println("Order  - passed..");
//			Assert.assertTrue(true);
//			//ProductCatPg.clickOnSignOut();
//		}else
//		{
//			System.out.println("Order - Faild..");
//			captureScreenshot(driver, "VerifySearchProduct");
//			Assert.assertTrue(false);
//}

}

