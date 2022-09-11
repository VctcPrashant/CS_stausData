package com.store.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.store.PageObject.AccountCreationDeails;
import com.store.PageObject.AccountCreationDeails2;
import com.store.PageObject.IndexPage;
import com.store.PageObject.IndexPage2;
import com.store.PageObject.MyAccount;
import com.store.PageObject.MyAccount2;
import com.store.PageObject.OrderAddressPage;
import com.store.PageObject.OrderConfirmationPage;
import com.store.PageObject.OrderPaymentPage;
import com.store.PageObject.OrderShippingPage;
import com.store.PageObject.OrderSummaryPage;
import com.store.PageObject.ProductPage;
import com.store.PageObject.ProductPage2;
import com.store.PageObject.RegisteredUserAccount;
import com.store.PageObject.SearchResultPage;

public class TC_MyAccountPageTest2 extends BaseClass{
	@Test(enabled = false)
	public void verifRegisteredAndyLogin() throws InterruptedException
	{
		//SignInPage
		IndexPage2 index2 = new IndexPage2(driver);
		
		index2.clickonSgnIn();
		
		//MyAccountPage
		MyAccount2 myAccount = new MyAccount2(driver);
		
		myAccount.enterCreateEmailAdress("prashu2025@gmail.com");
		
		myAccount.clickSubmitCreate();
		
		//AccountCreationDeatailsPage
		
		AccountCreationDeails2 accountDetail = new AccountCreationDeails2(driver);
		
//		Thread.sleep(3000);
//		accountDetail.getTitle("Mr.");
		
		Thread.sleep(3000);
		accountDetail.enterCustFirstName("Prashant");
		
		Thread.sleep(3000);
		accountDetail.enterCustLastName("Patankar");
		
		accountDetail.enterPassword("admin123");
		
		Thread.sleep(3000);
		accountDetail.newsletter();
		
		Thread.sleep(3000);
		accountDetail.enterFisrstname("prashu");
		
		Thread.sleep(3000);
		accountDetail.enterLastname("prash");
		
		Thread.sleep(3000);
		accountDetail.enterAddress("Indore MP");
		
		Thread.sleep(3000);
		accountDetail.enterCity("Indore");
		
		Thread.sleep(3000);
		accountDetail.enterState("Hawaii");
		
		Thread.sleep(3000);
		accountDetail.enterPostel("00000");
		
		Thread.sleep(3000);
		accountDetail.enterCountry("United States");
		
		Thread.sleep(3000);
		accountDetail.enterMobile("1234567890");
		
		Thread.sleep(3000);
		accountDetail.enterAlias("Home");
		
		Thread.sleep(3000);
		accountDetail.clickOnSubmitButton();
		
		
		//verify the users
		//RegisteredUserAccountPage
		RegisteredUserAccount registerUaer = new RegisteredUserAccount(driver);
		
		String userName =  registerUaer.getUserName();
		
		Assert.assertEquals("prashu prash",userName);
		
		//signOut
		registerUaer.clickOnSignOut();
		}
	
	//verify the Login
	@Test(enabled = false)
	public void verifyOnLogin()
	{
		//sign in page
		IndexPage2 index = new IndexPage2(driver);
		
		index.clickonSgnIn();
		
		//myacountPAge
		MyAccount2 myacc = new MyAccount2(driver);
		
		myacc.enterEmailAddress("prashu202@gmail.com");
		
		myacc.enterPassword("abc123");
		
		myacc.clickSubmit();
	}
	@Test
	public void verifyAddToWishListoutLogin() throws IOException
	{
		//index Page
		IndexPage2 indexPg = new IndexPage2(driver);
		indexPg.clickOntshirtmenu(); 
		
		//product Page
		
		ProductPage2 productPg = new ProductPage2(driver);
		productPg.mouseOvertshirtProduct();
		productPg.clickOnaddWishList();
		
	String actualAlertMsg = productPg.getTextOfAlertForWishList();
	
	System.out.println(actualAlertMsg);
	String expectedAlertMsg = "You must be logged in to manage your wishlist.";
	System.out.println(actualAlertMsg);
	if(actualAlertMsg.equals(expectedAlertMsg)) {
		System.out.println("verifyAddToWishListoutLogin..Passed");
		captureScreenshot(driver, "verifyAddToWishListoutLogin");
		System.out.println("captures screen shot ");
	Assert.assertTrue(true);
	}
	else
	{
		System.out.println("verifyAddToWishListoutLogin..Failed");
		Assert.assertTrue(true);
	}
		
	}
}
