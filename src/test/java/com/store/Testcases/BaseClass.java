package com.store.Testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.store.utilies.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig read = new ReadConfig();
	
	String url = read.getBaseUrl();
	String browese = read.getBrowser();
	String username = read.getUsername();
	String password = read.getPassword();
	
	WebDriver driver;
	
//	@Parameters("Browser")
	@BeforeClass
	//public void setUp(String value)
	public void setUp()
	{
		//if(value.equals("chrome"))
		//{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
//		}
//		else if(value.equals("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver= new EdgeDriver();
//			
//		}
//		else if(value.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver= new FirefoxDriver();
//			
//		}
		 //open the url
		 driver.get(url);
		
	}
//	@AfterClass
//	public void tearDown()
//	{
//		driver.close();
//		driver.quit();
//	}
	public void captureScreenshot(WebDriver driver ,String testName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File destinations = new File(System.getProperty("user.dir") + "//Screenshot//" + testName + ".png");
	
	FileHandler.copy(source,destinations);
	System.out.println("capture the screenshot..");
		
	
	}

}
