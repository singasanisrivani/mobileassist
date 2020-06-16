package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngexp {
	@Test
	public void testng()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//hp//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("srivani250@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("srivani20");
		driver.findElement(By.id("u_0_b")).click();
		driver.close();
		
		
		
		
		
	}

}
