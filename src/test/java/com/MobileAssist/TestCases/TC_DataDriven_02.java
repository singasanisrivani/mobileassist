package com.MobileAssist.TestCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MobileAssist.Pageobjects.Logindata;
import com.MobileAssist.utilities.XLUtilities;

public class TC_DataDriven_02 extends Baseclass {
	
	
	@Test(dataProvider="TestData")
	public void Testing(String uname,String pass)
	{
    Logindata lp=new Logindata(driver);	
	lp.setusername(uname);
	lp.setpassword(pass);
	lp.clicklogin();
	if(isAlertpresent()==true)
	{
		driver.switchTo().alert().accept();//closes the alert window
		driver.switchTo().defaultContent();//focuses on main page
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertTrue(true);
		lp.clicklogout();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
	
	}
	}
	
	public boolean isAlertpresent()
	{
	try
	{
		driver.switchTo().alert();
		return true;
	}
	catch(NoAlertPresentException e)
	{
	return false;	
	}
	
	}
	
	
	@DataProvider(name="TestData")
	String[][]getdata() throws IOException
	{
	String path="C:/Users/hp/eclipse-workspace/com.MobileAssist/src/test/java/com/MobileAssist/TestData/TestData.xlsx";	
	int rowcount=XLUtilities.getRowCount(path,"Sheet1");
	int colcount=XLUtilities.getCellCount(path,"Sheet",1);
	String data[][]=new String[rowcount][colcount];
	for(int i=1;i<=rowcount;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtilities.getCellData(path,"Sheet1",i,j);
		}
	}
	return data;
	
	
	}
	
	
	

}
