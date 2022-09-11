package com.store.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	

	
	public SearchResultPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//identify the elements present in searh result page
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a")
	WebElement SearchResultProducts;
	
	//more button
	@FindBy(xpath = "//a[@title='View']//child::span")
	WebElement more;
	
//	public String getSearchResultProductName()
//	{
//	return	SearchResultProducts.getText();
//	}
	public void ClickOnMoreLink()
	{
		more.click(); 
	}

}
