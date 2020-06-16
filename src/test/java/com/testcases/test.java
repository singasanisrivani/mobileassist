package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
	@Test
	public void exp()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\com.MobileAssist\\DriversN\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/V4/");
			   
	}

}
