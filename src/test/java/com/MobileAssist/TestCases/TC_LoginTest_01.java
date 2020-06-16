package com.MobileAssist.TestCases;

import java.io.IOException;


import org.testng.annotations.Test;

import com.MobileAssist.Pageobjects.Logindata;

public class TC_LoginTest_01 extends Baseclass {
	@Test
	public void logintest() throws IOException
	{
		
	
	//logger.info("browser is opened");
	Logindata ld=new Logindata(driver);
	
	ld.setusername("username");
	//logger.info("entered user name");
	ld.setpassword("password");
	//logger.info("entered password");
	ld.clicklogin();
	
	//System.out.println(driver.getTitle());
	//logger.info("login button clicked");
	/*if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else
		{
		captureScreen(driver,"logintest");
		
		Assert.assertTrue(false);
		}*/
	}

	
}

