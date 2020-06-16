package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampletitle {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		 String acttitle="Welcome: Mercury Tours";
		 String exptitle=driver.getTitle();
		 System.out.println(driver.getTitle());
		 if(acttitle.equals(exptitle))
		 {
			 System.out.println("test is passed");
		
		 }
			 else
			 {
				System.out.println("test is failed"); 
			 }
		 driver.close();
			 }
				 
		 
		 
		 
		
		
		
	}


