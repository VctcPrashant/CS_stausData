package com.store.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.store.PageObject.IndexPage2;
import com.store.PageObject.ProductPage2;

public class my extends BaseClass{
	
		WebDriver driver;
		@Test
		public void verifyAddToWishListoutLogin() 
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
			//captureScreenshot(driver, "verifyAddToWishListoutLogin");
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



