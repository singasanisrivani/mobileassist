package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomexp {
	
	WebDriver driver;
	
	@FindBy(linkText="REGISTER")
	WebElement reglink;
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement pnum;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement add1;
	
	@FindBy(name="address2")
	WebElement add2;
	
	@FindBy(name="city")
	WebElement cityname;
	
	@FindBy(name="state")
	WebElement statename;
	
	@FindBy(name="postalCode")
	WebElement pcode;
	
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pword;
	
	@FindBy(name="confirmPassword")
	WebElement conpass;
	
	@FindBy(name="register")
	WebElement submit;
	
  pomexp(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	 
  public void clickreg()
  
  {
	reglink.click();
	
  }
  public void setfirstname(String firstname)
  {
	fname.sendKeys(firstname);
	
  }
  public void setlastname(String lastname)
	
  {
	 lname.sendKeys(lastname);
  }
	public void setphonenumber(String pnumber)
	{
		pnum.sendKeys(pnumber);
	}
	
	public void setemailid(String mail)
	{
		email.sendKeys(mail);
		
	}
	public void setaddress(String address1)
	{
		add1.sendKeys(address1);
	}
	public void setaddress2(String address2)
	{
		add2.sendKeys(address2);
	}
	public void setcityname(String cname)
	{
		cityname.sendKeys(cname);
	}
	public void setsname(String sname)

	{
		statename.sendKeys(sname);
	}
	public void setpostalcode(String postalcode)
	{
		pcode.sendKeys(postalcode);
	}
	public void setusername(String username)
	{
		uname.sendKeys(username);
	}
	public void setpassword(String password)
	{
		pword.sendKeys(password);
	}
	public void setconfirmpassword(String cpass)
	{
		conpass.sendKeys(cpass);
	} 
	public void clicksubmit()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	

}
