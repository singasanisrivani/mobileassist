package com.MobileAssist.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logindata {

	WebDriver ldriver;
	public Logindata(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	
	}
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
    WebElement textpass;
	
	@FindBy(name="btnLogin")
	WebElement button;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	WebElement logoutlink;

	
	public void setusername(String uname)
	{
	username.sendKeys(uname);	
	
	}
	
    public void setpassword(String pass)
    {
    	textpass.sendKeys(pass);
    }
	
    public void clicklogin()
    {
    	button.click();
    }

    public void clicklogout()
    {
   	 logoutlink.click();
    }

}
