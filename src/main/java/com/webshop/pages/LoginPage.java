package com.webshop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.driver.DriverScript;

public class LoginPage extends DriverScript {
	
	//******************PageElements*****************************//
	@FindBy(id="Email")WebElement emailTextbox;
	@FindBy(id="Password")WebElement passwordTextbox;
	@FindBy(linkText="Forgot password?")WebElement forgotPasswordlink;
	@FindBy(xpath="//input[@value='Log in']")WebElement loginbutton;
	
	//********************PageInitilization***********************//
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//*********************Page Methods/Actions*********************//
	
	public void enterEmail(String email)
	{
		emailTextbox.clear();
		emailTextbox.sendKeys(email);
	}
	public void enterPassword(String pass)
	{
		passwordTextbox.clear();
		passwordTextbox.sendKeys(pass);
		
	}
	public boolean forgotpasswordlink()
	{
		return forgotPasswordlink.isDisplayed();
	}
	public void LoginButton() 
	{
		loginbutton.click();
	}
	public String LoginPageTitle()
	{
		return driver.getTitle();
	}
	

}
