package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pomexp2 {
	@Test
	public void pomexp()
	
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  pomexp p=new pomexp(driver);
	  driver.get("http://newtours.demoaut.com/mercuryregister.php");
	  
	  p.clickreg();
	  p.setfirstname("ssrivani");
	  p.setlastname("singasani");
	  p.setphonenumber("1234567893");
	  p.setemailid("srivani250@gmail.com");
	  p.setaddress("uppal");
	  p.setaddress2("ramanthapur");
	  p.setcityname("hyderabad");
	  p.setsname("telangana");
	  p.setpostalcode("500013");
	  p.setusername("sriv");
	  p.setpassword("srivani");
	 p.setconfirmpassword("srivani");
	 p.clicksubmit();
	System.out.println( driver.getTitle());
	driver.close();
	
	
	
	}

}
