package com.MobileAssist.TestCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\com.MobileAssist\\DriversN\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(); 
           
        driver.get("http://demo.automationtesting.in/Windows.html");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
     System.out.println(driver.getTitle());
 
   Set <String> s=driver.getWindowHandles();
     System.out.println(s);
  
     for(String i:s)
     {
    	 
  	String t= driver.switchTo().window(i).getTitle();
  System.out.println(t);
   if(t.contains("Sakinalium | Home")) 
   		
    	 
     {
     driver.close();
     }
     
        

	}
	
	
	}
	

}
