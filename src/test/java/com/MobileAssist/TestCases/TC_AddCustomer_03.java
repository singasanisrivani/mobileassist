package com.MobileAssist.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.MobileAssist.Pageobjects.Addcustomer;
import com.MobileAssist.Pageobjects.Logindata;



public class TC_AddCustomer_03 extends Baseclass {
	
	@Test
	public void addingcustomer() throws InterruptedException
	{
		Logindata ld=new Logindata(driver);
		ld.setusername("username");
		ld.setpassword("password");
		ld.clicklogin();
		
   driver.manage().window().maximize();
    Addcustomer add=new Addcustomer(driver);
    add.clickaddnewcustomer();
	 add.entercustomername("srivani");
	 add.entergender("female");
	 add.enterdob("19","05","1993");
	 Thread.sleep(3000);
	 add.enteraddress("ramanthapur");
	 add.entercity("hyderabad");
	 add.enterstate("India");
	 add.enterpin("500013");
	 add.enterphonenumber("8039355125");
	 String email=randomstring()+"@gmail.com";
	 add.enteremail(email);
	 add.enterpassword("sri");
	 add.clicksubmit();
	 Thread.sleep(3000);
	/* boolean res=driver.getPageSource().contains(" Guru99 Bank Manager HomePage");
	if(res==true)
	{
		Assert.assertTrue(true);
	}
	else
	{
		
		Assert.assertTrue(false);
		
	}*/
	}
	public String randomstring()
	{
	String generatedstring=RandomStringUtils.randomAlphabetic(5);
	return(generatedstring);
	}

    
		
	
	

}

