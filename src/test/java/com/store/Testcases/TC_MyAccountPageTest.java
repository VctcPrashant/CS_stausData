package com.store.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.store.PageObject.AccountCreationDeails;
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

public class TC_MyAccountPageTest extends BaseClass{
	@Test(enabled = false)
	public void verifRegisteredAndyLogin() throws InterruptedException
	{
		
		IndexPage index = new IndexPage(driver);
		index.clickOnSignIn();
		
		MyAccount myaccount = new MyAccount(driver);
		
		myaccount.enterCreateEmailAdress("prashant.patankar11166@gmail.com");
		myaccount.clickSubmitCreate();
		
		AccountCreationDeails account = new AccountCreationDeails(driver);
		Thread.sleep(2000);
		
//		account.Title();
		Thread.sleep(2000);
		account.First_name("Prashu");
		Thread.sleep(2000);
		account.Last_name("patan");
		Thread.sleep(2000);
		account.Password("Admin@123312");
		Thread.sleep(2000);
		//account.days("12");
		Thread.sleep(2000);
		//account.months("junvery");
		Thread.sleep(2000);
		//account.years("2022");
		Thread.sleep(2000);
		account.newsletter();
		Thread.sleep(2000);
		account.fistName("priy");
		
		Thread.sleep(2000);
		account.lastName("pata");
		Thread.sleep(2000);
		account.Company("TCS");
		Thread.sleep(2000);
		account.Address("pune");
		Thread.sleep(2000);
		account.citys("indor");
		Thread.sleep(2000);
		account.stetes("Alaska");
		Thread.sleep(2000);
		account.pincode("00000");
		Thread.sleep(2000);
		account.Country("United States");
		Thread.sleep(2000);
		account.Mobile("7000703939");
		Thread.sleep(2000);
		account.alias("Home");
		Thread.sleep(2000);
		account.butonRegister();
		
	//verify the user
	RegisteredUserAccount user = new RegisteredUserAccount(driver);
	String userName = user.getUserName();
	Assert.assertEquals("prashu patan",userName);
		
	}
	
	//verifly Login 
	@Test
	public void VerifyLogin() throws IOException, InterruptedException
	{
		IndexPage index = new IndexPage(driver);
		index.clickOnSignIn();
		
		MyAccount myaccount = new MyAccount(driver);
		myaccount.enterEmailAddress("prashant.patankar166@gmail.com");
		myaccount.enterPassword("Admin@1233");
		myaccount.clickSubmit();
		RegisteredUserAccount user = new RegisteredUserAccount(driver);
		String userName = user.getUserName();
		if(userName.equals("Prashu patan"))
		{
			System.out.println("VerifyLogin - passed..");
			Assert.assertTrue(true);
			
		}else
		{
			System.out.println("VerifyLogin - Faild..");
			captureScreenshot(driver, "VerifyLogin");
			Assert.assertTrue(false);
			
		}
	}
	@Test
	public void VerifySignOut() throws IOException
	{
		IndexPage pg = new IndexPage(driver);
		pg.clickOnSignIn();

		MyAccount myacPg = new MyAccount(driver);
		
		myacPg.enterEmailAddress("abcxyzav@gmail.com");
		myacPg.enterPassword("abc123");
		myacPg.clickSubmit();
		
		//Enter search Key in search box
		RegisteredUserAccount regUser= new RegisteredUserAccount(driver);
		regUser.clickOnSignOut();
		
	}
	

	
}
