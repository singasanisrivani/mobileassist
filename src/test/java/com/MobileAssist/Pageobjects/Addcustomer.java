package com.MobileAssist.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class Addcustomer {
	
	
	WebDriver ldriver;
	public Addcustomer(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="New Customer")
	WebElement NewCustomer;
	@FindBy(how=How.NAME,using="name")
	WebElement cname;
	@FindBy(how=How.NAME,using="rad1")
	WebElement cgender;
	@FindBy(how=How.NAME,using="dob")
	WebElement cdateofbirth;
	@FindBy(how=How.NAME,using="addr")
	WebElement address;
	@FindBy(how=How.NAME,using="city")
	WebElement ccity;
	@FindBy(how=How.NAME,using="state")
	WebElement cstate;
	@FindBy(how=How.NAME,using="pinno")
	WebElement cpin;
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement cphonenum;
	@FindBy(how=How.NAME,using="emailid")
	WebElement cemail;
	@FindBy(how=How.NAME,using="password")
	WebElement cpassword;
	@FindBy(how=How.NAME,using="sub")
	WebElement submit;
	
	public void clickaddnewcustomer()
	{
		NewCustomer.click();
	}
	public void entercustomername(String custname)
	{
		cname.sendKeys("custname");
	}
	public void entergender(String gender)
	{
		cgender.sendKeys("gender");
	}
	public void enterdob(String dd,String mm,String yy)
	{
		cdateofbirth.sendKeys("dd");
		cdateofbirth.sendKeys("mm");
		cdateofbirth.sendKeys("yy");
	}
	public void enteraddress(String addr)
	{
		address.sendKeys("address");
	}
	public void entercity(String city)
	{
		ccity.sendKeys("city");
	}
	public void enterstate(String state)
	{
		cstate.sendKeys(state);
	}
	public void enterpin(String pin)
	{
		cpin.sendKeys("pin");
	}
	public void enterphonenumber(String phone)
	{
		cphonenum.sendKeys("phone");
	}
	public void enteremail(String email)
	{
		cemail.sendKeys("email");
	}
	public void enterpassword(String pass)
	{
	cpassword.sendKeys("pass");
	}
	public void clicksubmit()
	{
		submit.click();
	}
	
	
	
	}
	
	

	


