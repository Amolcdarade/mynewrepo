package com.openCart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_address_textbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passward_textbox;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login_btn;
	
	public void enterEmailAddress(String email)
	{
		email_address_textbox.sendKeys(email);
	}
	
	public void enterpassward(String passward)
	{
		passward_textbox.sendKeys(passward);
	}
	
	public void clickOnLoginlink()
	{
		login_btn.click();
	}

}
