package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class LoginTestCase01 extends BaseClass      {
	@Test
   public void loginTest() {
		driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setLogin(username, password);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	
	
}
