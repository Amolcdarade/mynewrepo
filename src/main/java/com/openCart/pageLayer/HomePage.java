package com.openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	
	
	public void  clickonMyAclink()
	{
		myaccount_link.click();
	}
	
	public void clickonloginlnk()
	{
		login_link.click();
	}

}
