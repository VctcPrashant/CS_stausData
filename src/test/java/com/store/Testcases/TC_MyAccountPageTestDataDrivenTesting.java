package com.store.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.store.PageObject.AccountCreationDeails;
import com.store.PageObject.IndexPage;
import com.store.PageObject.MyAccount;
import com.store.PageObject.RegisteredUserAccount;
import com.store.utilies.ReadExcelFile;

public class TC_MyAccountPageTestDataDrivenTesting extends BaseClass {
	@Test(enabled = false)
	public void verifRegisteredAndyLogin() throws InterruptedException {

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
		// account.days("12");
		Thread.sleep(2000);
		// account.months("junvery");
		Thread.sleep(2000);
		// account.years("2022");
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

		// verify the user
		RegisteredUserAccount user = new RegisteredUserAccount(driver);
		String userName = user.getUserName();
		Assert.assertEquals("prashu patan", userName);

	}

	// verifly Login
	@Test(dataProvider = "LoginDataProvider")
	public void VerifyLogin(String userEmail, String userPwd , String expectedUsername) throws IOException {
		IndexPage index = new IndexPage(driver);
		index.clickOnSignIn();

		MyAccount myaccount = new MyAccount(driver);
		myaccount.enterEmailAddress(userEmail);
		myaccount.enterPassword(userPwd);
		myaccount.clickSubmit();
		RegisteredUserAccount user = new RegisteredUserAccount(driver);
		String userName = user.getUserName();
		if (userName.equals(expectedUsername)) {
			System.out.println("VerifyLogin - passed..");
			Assert.assertTrue(true);
			user.clickOnSignOut();
		} else {
			System.out.println("VerifyLogin - Faild..");
			captureScreenshot(driver, "VerifyLogin");
			Assert.assertTrue(false);
		}
	}

	@DataProvider(name ="LoginDataProvider")
public String [][] LoginDataProvider()
{
//System.out.println(System.getProperty("user.dir"));	
String fileName = System.getProperty("user.dir")+"\\TestData\\MystoreTestData.xlsx";
int ttRows =  ReadExcelFile.getRowCount(fileName, "LoginTestData");
int ttCollums =  ReadExcelFile.getColCount(fileName, "LoginTestData");
String data[][] = new String [ttRows-1][ttCollums];
for(int i=1;i<ttRows;i++)
{
	for(int j=0;j<ttCollums;j++)
	{
		data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginTestData", i, j);
	}
}
return data;
}

}
