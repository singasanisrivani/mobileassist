package com.MobileAssist.TestCases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.MobileAssist.utilities.ReadConfig;

public class Baseclass {
	
	ReadConfig readconfig=new ReadConfig();
	public String baseurl=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	//public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome"))
     {
	 System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	 driver=new ChromeDriver();
	//Logger logger=Logger.getLogger("TC_LoginTest_01");
    //	PropertyConfigurator.configure("Log4j.properties");
	
}
		else if(br.contentEquals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",readconfig.getfirepath());
		driver=new FirefoxDriver();
		}
		driver.get(baseurl);
	}
	@AfterClass
	public void tearDown()
	{
	driver.quit();	
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}