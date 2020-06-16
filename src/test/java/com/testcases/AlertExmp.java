package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class AlertExmp {
	@Test
	public void test() 
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/hp/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://demo.automationtesting.in/Register.html");
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")).click();
		//driver.findElement(By.name("analystic")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
	}

}
