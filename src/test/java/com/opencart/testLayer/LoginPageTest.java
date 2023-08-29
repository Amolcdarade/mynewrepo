package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.openCart.pageLayer.HomePage;
import com.openCart.pageLayer.LogInPage;
import com.openCart.testBase.TestBase;
import com.openCart.utility.UtilityClass;

public class LoginPageTest extends TestBase{
	
	@Test
	public void validateLoggingIntoApplicationUsingValidCredential()
	{
		String expected_result = "my account";
		HomePage home_obj = new HomePage(driver);
		LogInPage login_obj = new LogInPage(driver);
		UtilityClass util_obj = new UtilityClass();
		home_obj.clickonMyAclink();
		home_obj.clickonloginlnk();
		
		login_obj.enterEmailAddress("davidtest@gmail.com");
		login_obj.enterpassward("Test");
		login_obj.clickOnLoginlink();
		
		String actual_result = util_obj.currentPageTitle();
		Assert.assertEquals(actual_result, expected_result);
	}
	
	

}
