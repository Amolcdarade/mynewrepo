package com.openCart.utility;

import com.openCart.testBase.TestBase;

public class UtilityClass extends TestBase {
	
	public String currentPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}

}
